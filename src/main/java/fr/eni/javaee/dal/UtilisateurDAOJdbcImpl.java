package fr.eni.javaee.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Utilisateur;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private static final String CREATION_UTILISATEUR = "INSERT INTO UTILISATEUR(pseudo, nom, prenom, email, telephone,rue,code_postal,ville,mots_passe,credit) VALUES(?,?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_UTILISATEUR = "SELECT no_utilisateur FROM utilisateur WHERE pseudo = ? AND mots_passe = ?";
	private static final String DELETE_UTILISATEUR = "DELETE FROM UTILISATEUR where no_utilisateur =?";
	private static final String UPDATE_UTILISATEUR = "UPDATE UTILISATEUR set pseudo = ?, nom =? , prenom =. ,email =?,telephone =? ,rue =? ,code_postal =? ,ville =? , mots_passe =? , credit =?  WHERE no_utilisateur =?";

	@Override
	public void creationUtilisateur(Utilisateur utilisateur) throws BusinessException {
		if (utilisateur == null) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_UTILISATEUR_NULL);
			throw businessException;
		}

		PreparedStatement pstmt = null;
		try (Connection cnx = ConnectionProvider.getConnection()) {
			pstmt = cnx.prepareStatement(CREATION_UTILISATEUR, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getNom());
			pstmt.setString(3, utilisateur.getPrenom());
			pstmt.setString(4, utilisateur.getEmail());
			pstmt.setString(5, utilisateur.getTelephone());
			pstmt.setString(6, utilisateur.getRue());
			pstmt.setString(7, utilisateur.getCP());
			pstmt.setString(8, utilisateur.getVille());
			pstmt.setString(9, utilisateur.getMdp());
			pstmt.setInt(10, utilisateur.getCredit());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				utilisateur.setNoUtilisateur(rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();

			businessException.ajouterErreur(CodesResultatDAL.INSERT_UTILISATEUR_ECHEC);

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

	@Override
	public void modificationUtilisateur(Utilisateur utilisateur) throws BusinessException {
		try (Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pstmt = cnx.prepareStatement(UPDATE_UTILISATEUR);
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getNom());
			pstmt.setString(3, utilisateur.getPrenom());
			pstmt.setString(4, utilisateur.getEmail());
			pstmt.setString(5, utilisateur.getTelephone());
			pstmt.setString(6, utilisateur.getRue());
			pstmt.setString(7, utilisateur.getCP());
			pstmt.setString(8, utilisateur.getVille());
			pstmt.setString(9, utilisateur.getMdp());
			pstmt.setInt(10, utilisateur.getCredit());
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();;
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.ECHEC_UPDATE_UTILISATEUR);
			throw businessException;
		}
		
		

	}

	@Override
	public void suppressionUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(DELETE_UTILISATEUR);
			pstmt.setInt(1, utilisateur.getNoUtilisateur());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.DELETE_UTILISATEUR_ECHEC);
		}

	}

	@Override
	public void authentificationUtilisateur(Utilisateur utilisateur) throws BusinessException {

		BusinessException businessException = new BusinessException();
		if (utilisateur == null) {
			businessException.ajouterErreur(CodesResultatDAL.INSERT_UTILISATEUR_NULL);
		} else {
			try (Connection cnx = ConnectionProvider.getConnection()) {
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_UTILISATEUR);
				pstmt.setString(1, utilisateur.getPseudo());
				pstmt.setString(2, utilisateur.getMdp());
				pstmt.execute();
				ResultSet rs = pstmt.getResultSet();
				if (rs.next()) {
					utilisateur.setNoUtilisateur(rs.getInt(1));
				} else {
					businessException.ajouterErreur(CodesResultatDAL.SELECT_UTILISATEUR_MDP_ECHEC);
				}
			} catch (Exception e) {
				e.printStackTrace();

				businessException.ajouterErreur(CodesResultatDAL.SELECT_UTILISATEUR_ECHEC);
			}
		}
		if (businessException.hasErreurs())
			throw businessException;
	}

	@Override
	public void deconnexionUtilisateur(Utilisateur utilisateur) throws BusinessException {
	    BusinessException businessException = new BusinessException();
	    if (utilisateur == null) {
	        businessException.ajouterErreur(CodesResultatDAL.UTILISATEUR_NON_CONNECTE);
	        throw businessException;
	    }
	    utilisateur.setNoUtilisateur(null);
	    // Vous pouvez également ajouter d'autres actions à effectuer lors de la déconnexion, 
	    // comme réinitialiser les données de session, vider le panier, etc.
	}


	@Override
	public void afficherUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

}
