package com.inn.cafe.POJO;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data // This annotation is used to generate getters and setters for the class's properties.
@Entity // This annotation specifies that the class is an entity and is mapped to a database table.
@DynamicUpdate // This annotation specifies that the UPDATE SQL statement should be generated at runtime and can be used to update the entity even if only a subset of the entity's properties have been changed.
@DynamicInsert // This annotation specifies that the INSERT SQL statement should be generated at runtime and can be used to insert the entity even if only a subset of the entity's properties have been specified.
@Table(name = "users") // This annotation specifies the name of the database table to be used for mapping.

public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id // This annotation specifies the primary key of the entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This annotation defines the primary key generation strategy. IDENTITY is typically used for SQL databases.
    private Long id;

    @Column(name = "name") // This annotation specifies the column name in the database table.
    private String name;

    @Column(name = "contactNumber")
    private String contactNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name="status")
    private String status;

    @Column(name="role")
    private String role;

}
