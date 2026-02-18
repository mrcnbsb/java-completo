package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {		
	}
	
	public Post(String moment, String title, String content, Integer likes) {		
		this.moment = LocalDateTime.parse(moment, dtf);
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		this.comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title + "\n"); //append='acrescentar no final'
		sb.append(this.likes);
		sb.append(" Likes - ");
		sb.append(dtf.format(this.moment) + "\n");
		sb.append(this.content + "\n");
		sb.append("Comments:\n");
		for (Comment c : this.comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
