package fr.eni.javaee.dal.article;

import java.sql.SQLException;

import fr.eni.javaee.bll.tools.BusinessException;
import fr.eni.javaee.bo.Article;
import fr.eni.javaee.bo.Retrait;

public interface ArticleDao {
	
	public void insertArticle(Article article, Retrait retrait)throws SQLException ;
	
	public Article selectByNoArticle (Integer Article) throws SQLException;
}
