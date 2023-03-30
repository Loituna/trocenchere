package fr.eni.javaee.dal;

import fr.eni.javaee.bll.BusinessException;
import fr.eni.javaee.bo.Article;

public interface ArticleDao {
	
	public void insertArticle(Article article)throws BusinessException ;
}
