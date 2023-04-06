/**
 * 
 */
package fr.eni.javaee.dal.categorie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.javaee.bo.Categorie;
import fr.eni.javaee.dal.tools.ConnectionProvider;
import fr.eni.javaee.dal.tools.DalException;

/**
 * Classe en charge de 
 * @author Megaport
 * @date5 avr. 2023 - 21:23:43
 * @since trocenchere - V0.1
 */
class CategorieDAOJDBCImpl implements CategorieDao{

	
	private static final String SELECT_By_ID_CATEGORIE = "SELECT "
			+ " libelle "
			+ " FROM categorie "
			+ " WHERE no_categorie=? ";
	@Override
	public Categorie getCategorieByID(Categorie categorie) throws DalException {
		
	try	(Connection cnx = ConnectionProvider.getConnection()){			
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_By_ID_CATEGORIE);
			
			pstmt.setInt(1, categorie.getNoCategorie());
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				categorie.setLibelle(rs.getString(1));
			}
			
			
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
			
		
		return categorie ;
	}
	
	

}
