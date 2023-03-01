package com.raul.json.entidades;

import java.util.Objects;

public class posts {

	private long userID;
	private long id;
	private String title;
	private String body;
	
	public posts() {
		
	}

	public posts(long userID, long id, String title, String body) {
		super();
		this.userID = userID;
		this.id = id;
		this.title = title;
		this.body = body;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "posts [userID=" + userID + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		posts other = (posts) obj;
		return id == other.id;
	}
	
}