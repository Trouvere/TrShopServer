package com.trouvere.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

@Entity
@Table(name = "USER")
public class User {

	@Id
	@Column(name = "ID", unique = true)
	private Long id;

	@Column(name = "USERNAME", length = 50, unique = true)
	@NonNull
	@Size(min = 4, max = 50)
	private String username;

	@Column(name = "PASSWORD", length = 100)
	@NonNull
	@Size(min = 4, max = 100)
	private String password;

	@Column(name = "FIRSTNAME", length = 50)
	@NonNull
	@Size(min = 4, max = 50)
	private String firstname;

	@Column(name = "LASTNAME", length = 50)
	@NonNull
	@Size(min = 4, max = 50)
	private String lastname;

	@Column(name = "EMAIL", length = 50)
	@NonNull
	@Size(min = 4, max = 50)
	private String email;

	@Column(name = "ENABLED")
	@NonNull
	private Boolean enabled;

	@Column(name = "LASTPASSWORDRESETDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@NonNull
	private Date lastPasswordResetDate;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "USER_AUTHORITY", joinColumns = {
			@JoinColumn(name = "USER_ID", referencedColumnName = "ID") }, inverseJoinColumns = {
					@JoinColumn(name = "AUTHORITY_ID", referencedColumnName = "ID") })
	private List<Authority> authorities;

}