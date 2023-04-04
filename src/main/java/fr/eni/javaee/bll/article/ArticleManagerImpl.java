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
	public Article selectByNoArticle(Integer Article) throws BusinessException {
		Article art = null;
		try {
			art = DAOFactory.getArticleDao().selectByNoArticle(Article);
		} catch (DalException e) {
			System.out.println(art.toString());
			e.printStackTrace();
			System.out.println("Echec selectByNoArticle Manager");
			;
		}

		return art;
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
