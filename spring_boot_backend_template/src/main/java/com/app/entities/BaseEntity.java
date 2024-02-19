package com.app.entities;

import javax.persistence.*;

import lombok.*;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

}


//
//@MappedSuperclass
//@Getter
//@Setter
//public class BaseEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//}