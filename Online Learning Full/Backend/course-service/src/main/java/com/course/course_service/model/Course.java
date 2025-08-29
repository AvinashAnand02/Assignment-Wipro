package com.course.course_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {


	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    private String description;
	    private String duration;
	    private String createdAt;


		public Course() {
			super();
		}


		public Course(Long id, String title, String description, String duration, String createdAt) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			this.duration = duration;
			this.createdAt = createdAt;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public String getDuration() {
			return duration;
		}


		public void setDuration(String duration) {
			this.duration = duration;
		}


		public String getCreatedAt() {
			return createdAt;
		}


		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}


		@Override
		public String toString() {
			return "Course [id=" + id + ", title=" + title + ", description=" + description + ", duration=" + duration
					+ ", createdAt=" + createdAt + "]";
		}


		
}
