package fr.eni.javaee.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Utilisateur;


public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {
	
	
	private static final String CREATIONUTILISATEUR="INSERT INTO utilisateur(pseudo, email, mdp) VALUES(?,?,?);";

	@Override
	public void creationUtilisateur(Utilisateur utilisateur) throws BusinessException {
		if(utilisateur==null)
		{
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_UTILISATEUR_NULL);
			throw businessException;
		}
		
		PreparedStatement pstmt = null;
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			pstmt = cnx.prepareStatement(CREATIONUTILISATEUR, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getEmail());
			pstmt.setString(3, utilisateur.getMdp());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next())
			{
				utilisateur.setNoUtilisateur(rs.getInt(1));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			
			businessException.ajouterErreur(CodesResultatDAL.INSERT_UTILISATEUR_ECHEC);
			
			throw businessException;
		} finally {
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();/*, PreparedStatement.RETURN_GENERATED_KEYS*/
				}
		}
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
		businessException.ajouterErreur(CodesResultatDAL.INSERT_UTILISATEUR_NULL);
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
