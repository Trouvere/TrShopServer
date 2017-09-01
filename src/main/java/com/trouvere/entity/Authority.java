package com.trouvere.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

@Entity
@Table(name = "AUTHORITY")
public class Authority {

	@Id
	@Column(name = "ID", unique = true)

	private Long id;

	@Column(name = "NAME", length = 50)
	@NonNull
	@Enumerated(EnumType.STRING)
	private AuthorityName name;

	@ManyToMany(mappedBy = "authorities", fetch = FetchType.LAZY)
	private List<User> users;

}