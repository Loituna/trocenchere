package fr.eni.javaee.dal.retrait;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.tools.CodesResultatDAL;
import fr.eni.javaee.dal.tools.ConnectionProvider;
import fr.eni.javaee.dal.tools.DalException;

class RetraitDAOJDBCImpl implements RetraitDao {

	private static final String INSERT = "INSERT "
			+ "INTO RETRAIT"
			+ "(no_article,rue, code_postal, ville) "
			+ "VALUES (?,?,?,?)";

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
	

	private static final String UPDATE_RETRAIT = "UPDATE "
			+ "RETRAIT "
			+ "set rue=? , code_postal=? , ville=? "
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
			pstmt.setString(1, retrait.getRue());
			pstmt.setString(2, retrait.getCodePostal());
			pstmt.setString(3,retrait.getVille());
			pstmt.setInt(4, retrait.getNoArticle());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL Exception Update Retrait DAL");
			e.printStackTrace();
		}
		
		
	}

	private static final String GET_RETRAIT_VENDEUR = "SELECT "
			+ "rue, code_postal, ville "
			+ "FROM retrait "			
			+ "WHERE no_article=? ";
	@Override
	public Retrait getRetraitVendeur(Retrait retrait) throws DalException {
		System.out.println(retrait+"getRetraitVendeur DAL");
		
		if (retrait==null) {
			DalException DalException = new DalException();
			DalException.ajouterErreur(CodesResultatDAL.GET_RETRAIT_NULL);
			System.out.println("Retrait Update DAL Null");	}
		try (
			
			Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pstmt = cnx.prepareStatement(GET_RETRAIT_VENDEUR);
			
			pstmt.setInt(1, retrait.getNoArticle());
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				
				retrait.setRue(rs.getString("rue"));
				retrait.setCodePostal("code_postal");
				retrait.setVille(rs.getString("ville"));
			
			}
			
		} catch (SQLException e) {
			System.out.println("SQL Exception GETRetraitVendeur DAL");
			e.printStackTrace();
		}
		
		
		return retrait;
	}

}
