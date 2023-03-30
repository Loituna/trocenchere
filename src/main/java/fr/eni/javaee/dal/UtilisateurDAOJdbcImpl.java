package fr.eni.javaee.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Utilisateur;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private static final String CREATION_UTILISATEUR = "INSERT INTO UTILISATEUR(pseudo, nom, prenom, email, telephone,rue,code_postal,ville,mots_passe) VALUES(?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_UTILISATEUR = "SELECT * FROM utilisateur WHERE pseudo = ? AND mots_passe = ?";
	private static final String DELETE_UTILISATEUR = "DELETE FROM UTILISATEUR where no_utilisateur =?";
	private static final String UPDATE_UTILISATEUR = "UPDATE UTILISATEUR set pseudo = ?, nom =? , prenom =. ,email =?,telephone =? ,rue =? ,code_postal =? ,ville =? , mots_passe =? , credit =?  WHERE no_utilisateur =?";
	private static final String SELECT_BY_ID = "SELECT no_utilisateur, pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mots_passe FROM utilisateur where no_utilisateur=?";
	
	private static UtilisateurDAOJdbcImpl instance ;
	
	public static UtilisateurDAOJdbcImpl getInstance() {
		if (instance == null) {
			instance = new UtilisateurDAOJdbcImpl();
		}
		return instance ;
	}

	private UtilisateurDAOJdbcImpl() {
	}

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
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				utilisateur.setNoUtilisateur(rs.getInt(1));
				utilisateur.setNom(rs.getString(2));
				utilisateur.setPrenom(rs.getNString(3));
				utilisateur.setEmail(rs.getNString(4));				
				utilisateur.setTelephone(rs.getNString(5));
				utilisateur.setRue(rs.getNString(7));
				utilisateur.setCP(rs.getNString(8));
				utilisateur.setVille(rs.getNString(9));
				utilisateur.setMdp(rs.getNString(10));
				utilisateur.setCredit(rs.getInt(11));
			
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
	public Utilisateur authentificationUtilisateur(Utilisateur utilisateur) throws BusinessException {

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
					utilisateur.setPseudo(rs.getNString(2));
					utilisateur.setNom(rs.getNString(3));
					utilisateur.setPrenom(rs.getNString(4));
					utilisateur.setEmail(rs.getNString(5));
					utilisateur.setTelephone(rs.getNString(6));
					utilisateur.setRue(rs.getNString(7));
					utilisateur.setCP(rs.getNString(8));
					utilisateur.setVille(rs.getNString(9));
					utilisateur.setMdp(rs.getNString(10));
					utilisateur.setCredit(rs.getInt(11));
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
		
		return utilisateur;
	}

	@Override
	public void deconnexionUtilisateur(Utilisateur utilisateur) {


	}


	@Override
	public void afficherUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	
	public Utilisateur selectByNoUtilisateur(Integer noUtilisateur) {
		Utilisateur utilisateur = new Utilisateur();
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_ID);
			pstmt.setInt(1, noUtilisateur);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				utilisateur.setNoUtilisateur(rs.getInt("noUtilisateur"));
				utilisateur.setNom(rs.getString("nom"));
				utilisateur.setPrenom(rs.getString("prenom"));
				utilisateur.setEmail(rs.getString("email"));
				utilisateur.setTelephone(rs.getString("telephone"));
				utilisateur.setRue(rs.getString("rue"));
				utilisateur.setCP(rs.getString("code_postal"));
				utilisateur.setVille(rs.getString("ville"));
				utilisateur.setMdp(rs.getString("mots_passe"));
				utilisateur.setCredit(rs.getInt("credit"));
				
			}
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return utilisateur;
	} 
}
