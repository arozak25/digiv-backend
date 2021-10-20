package com.digiv.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

/**
 * @author Abdul Rozak
 * @since 19/10/21
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "full_name", length = 200, nullable = false)
    private String fullName;

    @Column(name = "password", length = 50, nullable = false)
    private String password;

    @Column(name = "creation_time", nullable = false)
    private Long creationTime;

    @Column(name = "modification_time")
    @LastModifiedDate
    private Long modificationTime;

    @Version
    private long version;
}
