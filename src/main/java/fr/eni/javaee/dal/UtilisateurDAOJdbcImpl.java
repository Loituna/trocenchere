package fr.eni.javaee.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Utilisateur;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	@Override
	public void creationUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificationUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void suppressionUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}


	private static final String SELECT="SELECT id FROM utilisateur WHERE pseudo = ? AND mdp = ?;";



	@Override
	public void authentificationUtilisateur(Utilisateur utilisateur) throws BusinessException {
		
	BusinessException businessException = new BusinessException();
	if(utilisateur==null) {
		businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_NULL);
	}else {
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pstmt = cnx.prepareStatement(SELECT);
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getMdp());
			pstmt.execute();
			ResultSet rs = pstmt.getResultSet();
			if(rs.next()) {
				utilisateur.setNoUtilisateur(rs.getInt(1));
			}else {
				businessException.ajouterErreur(CodesResultatDAL.SELECT_UTILISATEUR_MDP_ECHEC);
			}
		}catch (Exception e) {
			e.printStackTrace();
			
			businessException.ajouterErreur(CodesResultatDAL.SELECT_UTILISATEUR_ECHEC);
		}
	}
	if(businessException.hasErreurs())
		throw businessException;
	}

	@Override
	public void deconnexionUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afficherUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

}
