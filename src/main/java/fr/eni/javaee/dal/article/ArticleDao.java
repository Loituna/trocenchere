package fr.eni.javaee.dal.article;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Article;

public interface ArticleDao {
	
	public void insertArticle(Article article)throws BusinessException ;
}
