package fr.eni.javaee.bll.article;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Retrait;
import fr.eni.javaee.dal.tools.DalException;

public interface ArticleManager {
	
	public void insert (Article article , Retrait retrait)throws BusinessException;

	public Article selectByNoArticle (Integer Article) throws BusinessException;

	public void updateArticleByUser(Article article, Retrait retrait)throws BusinessException;
}
