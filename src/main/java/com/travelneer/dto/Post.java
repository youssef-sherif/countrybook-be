/*
 * This file is generated by jOOQ.
*/
package com.travelneer.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Post implements Serializable {

    private static final long serialVersionUID = -522578450;

    private Integer   id;
    private String    content;
    private Integer   authorId;
    private Short     countryId;
    private Integer   favouritesCount;
    private Timestamp createdAt;

    public Post() {}

    public Post(Post value) {
        this.id = value.id;
        this.content = value.content;
        this.authorId = value.authorId;
        this.countryId = value.countryId;
        this.favouritesCount = value.favouritesCount;
        this.createdAt = value.createdAt;
    }

    public Post(
        Integer   id,
        String    content,
        Integer   authorId,
        Short     countryId,
        Integer   favouritesCount,
        Timestamp createdAt
    ) {
        this.id = id;
        this.content = content;
        this.authorId = authorId;
        this.countryId = countryId;
        this.favouritesCount = favouritesCount;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Short getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
    }

    public Integer getFavouritesCount() {
        return this.favouritesCount;
    }

    public void setFavouritesCount(Integer favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Post (");

        sb.append(id);
        sb.append(", ").append(content);
        sb.append(", ").append(authorId);
        sb.append(", ").append(countryId);
        sb.append(", ").append(favouritesCount);
        sb.append(", ").append(createdAt);

        sb.append(")");
        return sb.toString();
    }
}