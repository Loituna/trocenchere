package fr.eni.javaee.bll.article;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Retrait;

public interface ArticleManager {
	
	public void insert (Article article , Retrait retrait)throws BusinessException;


	

}
