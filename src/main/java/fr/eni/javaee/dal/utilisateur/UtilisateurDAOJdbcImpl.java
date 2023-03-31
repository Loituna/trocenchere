package fr.eni.javaee.dal.utilisateur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Utilisateur;
import fr.eni.javaee.dal.tools.CodesResultatDAL;
import fr.eni.javaee.dal.tools.ConnectionProvider;
import fr.eni.javaee.dal.tools.DalException;

class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private static final String CREATION_UTILISATEUR = "INSERT INTO UTILISATEUR(pseudo, nom, prenom, email, telephone,rue,code_postal,ville,mots_passe) VALUES(?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_UTILISATEUR = "SELECT * FROM utilisateur WHERE pseudo = ? AND mots_passe = ?";
	private static final String DELETE_UTILISATEUR = "DELETE FROM UTILISATEUR where no_utilisateur =?";
	private static final String UPDATE_UTILISATEUR = "UPDATE UTILISATEUR set pseudo = ?, nom =? , prenom =? ,email =?,telephone =? ,rue =? ,code_postal =? ,ville =? , mots_passe =? WHERE no_utilisateur =?";
	private static final String SELECT_BY_ID = "SELECT pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mots_passe, credit FROM utilisateur where no_utilisateur=?";

	@Override
	public void creationUtilisateur(Utilisateur utilisateur) throws DalException {
		if (utilisateur == null) {
			DalException dalException = new DalException();
			dalException.ajouterErreur(CodesResultatDAL.INSERT_UTILISATEUR_NULL);

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
			}
		} catch (Exception e) {
			e.printStackTrace();
			DalException dalException = new DalException();

			dalException.ajouterErreur(CodesResultatDAL.INSERT_UTILISATEUR_ECHEC);

		}
	}

	@Override
	public void modificationUtilisateur(Utilisateur utilisateur) throws DalException {
		try (Connection cnx = ConnectionProvider.getConnection()) {
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
			pstmt.setInt(10, utilisateur.getNoUtilisateur());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			;
			DalException dalException = new DalException();
			dalException.ajouterErreur(CodesResultatDAL.ECHEC_UPDATE_UTILISATEUR);

		}
	}

	@Override
	public void suppressionUtilisateur(Utilisateur utilisateur) throws DalException {
		DalException dalException = new DalException();
		if (utilisateur == null) {
			dalException.ajouterErreur(CodesResultatDAL.SUPPRESSION_UTILISATEUR_NULL);
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(DELETE_UTILISATEUR);
			pstmt.setInt(1, utilisateur.getNoUtilisateur());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			
			dalException.ajouterErreur(CodesResultatDAL.DELETE_UTILISATEUR_ECHEC);
		}
		if (dalException.hasErreurs())
			throw dalException;}
		
	}

	@Override
	public Utilisateur authentificationUtilisateur(Utilisateur utilisateur) throws  DalException {

		DalException dalException = new DalException();
		if (utilisateur == null) {
			dalException.ajouterErreur(CodesResultatDAL.INSERT_UTILISATEUR_NULL);
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
					dalException.ajouterErreur(CodesResultatDAL.SELECT_UTILISATEUR_MDP_ECHEC);
				}
			} catch (Exception e) {
				e.printStackTrace();

				dalException.ajouterErreur(CodesResultatDAL.SELECT_UTILISATEUR_ECHEC);
			}
		}
		if (dalException.hasErreurs())
			throw dalException;

		return utilisateur;
	}

	@Override
	public void deconnexionUtilisateur(Utilisateur utilisateur) {
	}

	public Utilisateur selectByNoUtilisateur(Integer noUtilisateur) {
		Utilisateur utilisateur = new Utilisateur();
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_ID);
			pstmt.setInt(1, noUtilisateur);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				utilisateur.setNoUtilisateur(noUtilisateur);
				utilisateur.setPseudo(rs.getString("pseudo"));
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
