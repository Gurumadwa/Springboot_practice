package com.mapping.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_profile")
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profileId;
	private String aboutUser;
	
	@OneToOne
	@JoinColumn(name = "userId")
	@JsonIgnore
	private User user;
	
}
