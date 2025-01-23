package com.mapping.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
//	@JsonIgnore
	private UserProfile userProfile;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//	@JsonIgnore
	private List<Posts> posts = new ArrayList<>();

	// configuring methods for bidirectional mapping
	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
		userProfile.setUser(this);
	}

	public void addPost(Posts post) {
		posts.add(post);
		post.setUser(this);
	}
}
