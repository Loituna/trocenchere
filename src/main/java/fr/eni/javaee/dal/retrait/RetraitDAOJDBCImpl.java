package fr.eni.javaee.dal.retrait;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.tools.CodesResultatDAL;
import fr.eni.javaee.dal.tools.ConnectionProvider;
import fr.eni.javaee.dal.tools.DalException;

class RetraitDAOJDBCImpl implements RetraitDao {

	private static final String INSERT = "INSERT INTO RETRAIT(no_article,rue, code_postal, ville) VALUES (?,?,?,?)";
	private static final String SELECT_POUR_RETRAIT = "SELECT rue, code_postal, ville  FROM utilisateur where no_utilisateur=?";

	@Override
	public void insert(Retrait retrait) throws DalException {
		if (retrait == null) {
			DalException DalException = new DalException();
			DalException.ajouterErreur(CodesResultatDAL.INSERT_RETRAIT_NULL);
			System.out.println("Retrait Null");
			throw DalException;
		}
		PreparedStatement pstmt = null;
		try (Connection cnx = ConnectionProvider.getConnection()) {
			pstmt = cnx.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

			pstmt.setInt(1, retrait.getNoArticle());
			pstmt.setString(2, retrait.getRue());
			pstmt.setString(3, retrait.getCodePostal());
			pstmt.setString(4, retrait.getVille());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();

			if (rs.next()) {
				retrait.setNoArticle(rs.getInt(1));
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			DalException DalException = new DalException();
			DalException.ajouterErreur(CodesResultatDAL.INSERT_RETRAIT_ECHEC);
			throw DalException;
		}

	}

	@Override

	public Retrait selectByIdRetrait(Integer noUtilisateur) {

		Retrait retrait = new Retrait();
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_POUR_RETRAIT);
			pstmt.setInt(1, noUtilisateur);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				retrait.setNoArticle(noUtilisateur);
				retrait.setRue(rs.getString("rue"));
				retrait.setCodePostal("code_postal");
				retrait.setVille(rs.getString("ville"));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retrait;
	}
	private static final String UPDATE_RETRAIT = "UPDATE "
			+ "RETRAIT"
			+ "set rue=?,code_postal=?,ville=?"
			+ "WHERE no_article=?";
			

	@Override
	public void updateArticleByUser(Retrait retrait) throws DalException {
		if (retrait==null) {
			DalException DalException = new DalException();
			DalException.ajouterErreur(CodesResultatDAL.UPDATE_RETRAIT_NULL);
			System.out.println("Retrait Update DAL Null");	
		}
		try {
			Connection cnx = ConnectionProvider.getConnection();
			PreparedStatement pstmt = cnx.prepareStatement(UPDATE_RETRAIT);
			pstmt.setNString(1, retrait.getRue());
			pstmt.setNString(2, retrait.getCodePostal());
			pstmt.setNString(3,retrait.getVille());
			pstmt.setInt(4, retrait.getNoArticle());
		} catch (SQLException e) {
			System.out.println("SQL Exception Update Retrait DAL");
			e.printStackTrace();
		}
		
		
	}

}
