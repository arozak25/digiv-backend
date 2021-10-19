package com.digiv.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.ZonedDateTime;

/**
 * @author Abdul Rozak
 * @since 19/10/21
 */
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
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
