package model;

/*
//Progression -1 
//Create a class called ProGrad with the following parameters
//
//	private String name;
//	private String id;
//	private String rate;
//	private String comment;
//	private String recommend;
//	
//Generate getters and setters.
//Generate a constructor with the following parameters (String name, String id, String rate, String comment, String recommend)

*/
public class Prograd
{
	private String name;
	private String id;
	private String rate;
	private String comment;
	private String recommend;
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getid()
	{
		return this.id;
	}
	public void setid(String id)
	{
		this.id = id;
	}
	public String getrate()
	{
		return this.rate;
	}
	public void setrate(String rate)
	{
		this.rate = rate;
	}
	public String getcomment()
	{
		return this.comment;
	}
	public void setcomment(String comment)
	{
		this.comment = comment;
	}
	public String getrecommend()
	{
		return this.comment;
	}
	public void setrecommend(String recommend)
	{
		this.recommend = recommend;
	}
	Prograd(String name,String id, String rate, String comment,String recommend)
	{
		this.name = name;
		this.rate = rate;
		this.id = id;
		this.comment = comment;
		this.recommend = recommend;
	}
}