package fr.eni.javaee.bll.article;

import java.sql.SQLException;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.DAOFactory;

class ArticleManagerImpl implements ArticleManager {

	@Override
	public void insert(Article article, Retrait retrait) throws BusinessException {

		try {
			DAOFactory.getArticleDao().insertArticle(article, retrait);

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("Echec Insert Article Manager");
			;
		}

	}

}
