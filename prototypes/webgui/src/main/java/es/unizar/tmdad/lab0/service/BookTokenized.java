package es.unizar.tmdad.lab0.service;

import java.util.ArrayList;
import java.util.List;

public class BookTokenized {
	private int id;
	private String title;
	private List<Chapter> chapters;
	
	public BookTokenized() {
		//TODO
		this.chapters = new ArrayList<Chapter>();
		chapters.add(new Chapter(1, "Down the Rabbit-Hole", new ArrayList<Theme>()));
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
}
