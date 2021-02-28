package com.revature.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="REVIEW")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reviewSequence")
	@SequenceGenerator(allocationSize = 1, name = "reviewSequence", sequenceName = "SQ_REVIEW_PK")
	@Column(name = "REVIEW_ID")
	private int reviewId;
	@Column(name="RATING")
	private int rating;
	@Column(name="DETAIL")
	private String detail;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="REVIEWER_ID")
	private User reviewer;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="REVIEWEE_ID")
	private User reviewee;
	
	
	
	//Here for the Relationship

}
