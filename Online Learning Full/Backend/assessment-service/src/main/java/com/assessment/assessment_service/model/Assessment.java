package com.assessment.assessment_service.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;

	@Entity
	public class Assessment {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    private String type; // links to Course service
	    private String dueDate;
	    private String passingCriteria;

	    public Assessment() {}

		public Assessment(Long id, String title, String type, String dueDate, String passingCriteria) {
			super();
			this.id = id;
			this.title = title;
			this.type = type;
			this.dueDate = dueDate;
			this.passingCriteria = passingCriteria;
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

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDueDate() {
			return dueDate;
		}

		public void setDueDate(String dueDate) {
			this.dueDate = dueDate;
		}

		public String getPassingCriteria() {
			return passingCriteria;
		}

		public void setPassingCriteria(String passingCriteria) {
			this.passingCriteria = passingCriteria;
		}

		@Override
		public String toString() {
			return "Assessment [id=" + id + ", title=" + title + ", type=" + type + ", dueDate=" + dueDate
					+ ", passingCriteria=" + passingCriteria + "]";
		}
	    
	    

}
