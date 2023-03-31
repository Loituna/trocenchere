package fr.eni.javaee.dal.tools;

/**
 * Les codes disponibles sont entre 10000 et 19999
 */
public abstract class CodesResultatDAL {
	
	/**
	 * Echec général quand tentative d'ajouter un objet null
	 */
	public static final int INSERT_UTILISATEUR_NULL=10000;
	
	/**
	 * Echec général quand erreur non gérée à l'insertion 
	 */
	public static final int INSERT_UTILISATEUR_ECHEC=10001;
	
	/**
	 * Echec de l'authentification
	 */
	public static final int SELECT_UTILISATEUR_ECHEC=10002;
	
	public static final int DELETE_UTILISATEUR_ECHEC = 10003;
	
	public static final int SELECT_UTILISATEUR_MDP_ECHEC=10004;

	public static final int ECHEC_UPDATE_UTILISATEUR = 10005;

	public static final int INSERT_ARTICLE_NULL = 10006;


	
	
}