package fr.eni.javaee.dal.enchere;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.javaee.bo.Enchere;
import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.tools.CodesResultatDAL;
import fr.eni.javaee.dal.tools.ConnectionProvider;
import fr.eni.javaee.dal.tools.DalException;

 class EnchereDAOJdbcImpl implements EnchereDAO {

	 private static final String INSERT_ENCHERE = "INSERT INTO enchere (date_debut_enchere, montant_enchere,no_utilisateur,no_article) VALUES (?,?,?,?)";

	@Override
	public void venteArticle(Enchere enchere) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listerEnchereDeco() {
		// TODO Auto-generated method stub

	}

	@Override
	public void listerEnchereCo(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void creerEnchere(Enchere enchere) {
		if (enchere == null) {
			DalException dalException = new DalException();
			dalException.ajouterErreur(CodesResultatDAL.INSERT_ENCHERE);
			System.out.println("Utilisateur NULL DAL");
		}
		System.out.println(enchere+"Insert Enchere Avant PSTMT DAL");
		PreparedStatement pstmt = null;
		try { Connection cnx = ConnectionProvider.getConnection();
		pstmt = cnx.prepareStatement(INSERT_ENCHERE, PreparedStatement.RETURN_GENERATED_KEYS);
		pstmt.setTimestamp(1, java.sql.Timestamp.valueOf(enchere.getDatedebutEnchere()));
		pstmt.setInt(2, enchere.getMontant());
		pstmt.setInt(3, enchere.getNoUtilisateur());
		pstmt.setInt(4, enchere.getNoArticle());
		pstmt.executeUpdate();
		
		ResultSet rs = pstmt.getGeneratedKeys();
		
		if (rs.next()) {
			enchere.setNoEnchere(rs.getInt(1));
			}
		
		} catch (SQLException e) {
			System.out.println("Erreur requete SQL Insert Enchère");
			e.printStackTrace();
		}
	}

	@Override
	public void enchereGagnee(Enchere enchere) {
		// TODO Auto-generated method stub

	}

	@Override
	public void encherePerdue(Enchere enchere) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afficherDetail(Enchere enchere) {
		// TODO Auto-generated method stub

	}

}
