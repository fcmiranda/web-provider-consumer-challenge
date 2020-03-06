package com.ul.test;

import java.util.Date;

public class Message {

	public enum Priority {
		HIGH(2), NORMAL(1), LOW(0);

		private int value;

		Priority(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	private Date date;
	private Priority priority;
	private String content;

	public Message(String content, Priority priority, Date date) {
		this.date = date;
		this.content = content;
		this.priority = priority;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
