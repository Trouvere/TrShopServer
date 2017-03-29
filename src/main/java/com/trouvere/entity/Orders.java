package com.trouvere.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
@Entity
public class Orders implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ordersDate;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<OrdersList> ordersList;

	// @Column(nullable = false)
	@JoinColumn(nullable = false)
	@NonNull
	@ManyToOne
	private User user;

	@Column(nullable = false)
	@NonNull
	private Boolean paid;

}
