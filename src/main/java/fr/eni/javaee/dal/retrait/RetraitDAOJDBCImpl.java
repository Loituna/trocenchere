package fr.eni.javaee.dal.retrait;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.tools.CodesResultatDAL;
import fr.eni.javaee.dal.tools.ConnectionProvider;

class RetraitDAOJDBCImpl implements RetraitDao {

	private static final String INSERT = "INSERT INTO RETRAIT(rue, code_postal, ville) VALUES (?,?,?)";

	@Override
	public void insert(Retrait retrait) throws BusinessException {
		if (retrait == null) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_RETRAIT_NULL);
			System.out.println("Retrait Null");
			throw businessException;
		}
		PreparedStatement pstmt = null;
		try (Connection cnx = ConnectionProvider.getConnection()) {
			pstmt = cnx.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);
		
			pstmt.setString(1, retrait.getRue());
			pstmt.setString(2, retrait.getCodePostal());
			pstmt.setString(3, retrait.getVille());
			System.out.println(retrait.toString()+"Debug avant exe");
			pstmt.executeUpdate();
			System.out.println("Ici debug avant rsnext");
			ResultSet rs = pstmt.getGeneratedKeys();
		
			
			if (rs.next()) {
				retrait.setNoArticle(rs.getInt(1));
				retrait.setRue(rs.getString(2));
				retrait.setCodePostal(rs.getString(3));
				retrait.setVille(rs.getString(4));
				System.out.println("Debug aprés rs next");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_RETRAIT_ECHEC);
			throw businessException;
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();/* , PreparedStatement.RETURN_GENERATED_KEYS */
				}
		}

	}

	// TODO DAL MYSQL Retrait
}
