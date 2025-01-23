package com.mapping.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "posts")
public class Posts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;
	private String postTitle;
	private String postContent;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	@JsonIgnore
	private User user;
}
