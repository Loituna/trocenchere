package fr.eni.javaee.dal.article;

import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.tools.DalException;

public interface ArticleDao {
	
	public void insertArticle(Article article, Retrait retrait)throws DalException ;
	
	public Article selectByNoArticle (Integer Article) throws DalException;

	public void updateArticleByUser(Article article, Retrait retrait) throws DalException;
}
 