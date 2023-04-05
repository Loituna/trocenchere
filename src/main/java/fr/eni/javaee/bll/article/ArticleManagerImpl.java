package fr.eni.javaee.bll.article;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.DAOFactory;
import fr.eni.javaee.dal.tools.DalException;

class ArticleManagerImpl implements ArticleManager {

	@Override
	public void insert(Article article, Retrait retrait) throws BusinessException {

		try {
			DAOFactory.getArticleDao().insertArticle(article, retrait);

		} catch (DalException e) {

			e.printStackTrace();
			System.out.println("Echec Insert Article Manager");
		}
	}

	@Override
	public Article selectByNoArticle(Article article) throws BusinessException {
		System.out.println(article+"Select By No Article Manager");
		try {
			 DAOFactory.getArticleDao().selectByNoArticle(article);
		} catch (DalException e) {
			
			e.printStackTrace();
			System.out.println("Echec selectByNoArticle Manager");
			;
		}

		return article;
	}

	@Override
	public void updateArticleByUser(Article article, Retrait retrait) throws BusinessException {
		try {
			DAOFactory.getArticleDao().updateArticleByUser(article, retrait);

		} catch (DalException e) {

			e.printStackTrace();
			System.out.println("Echec Update Article Manager");
			;
		}

	}

}
