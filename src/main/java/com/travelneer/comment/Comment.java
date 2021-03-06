package com.travelneer.comment;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class Comment {

    private Integer id;
    private String content;
    private Integer authorId;
    private Timestamp createdAt;

    private String name;
    private String email;

    private Map<Long, String> timeDiff;

    private Integer parentPostId;
    private Integer parentCommentId;

    private Short depth;

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

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String userName) {
        this.name = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<Long, String> getTimeDiff() {
        return timeDiff;
    }

    public Integer getParentPostId() {
        return parentPostId;
    }

    public void setParentPostId(Integer parentPostId) {
        this.parentPostId = parentPostId;
    }

    public Integer getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Integer parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public Short getDepth() {
        return depth;
    }

    public void setDepth(Short depth) {
        this.depth = depth;
    }

    public void calculateTimeDifference() {
        long timeDifference = System.currentTimeMillis() - this.getCreatedAt().getTime();

        long inSeconds = timeDifference / 1000;
        long inMinutes = inSeconds / 60;
        long inHours = inMinutes / 60;
        long inDays = inHours / 24;

        timeDiff = new HashMap<>();

        if(inSeconds <= 60) {
            timeDiff.put(inSeconds, "Seconds");
        } else if(inMinutes <= 60) {
            timeDiff.put(inMinutes, "Minutes");
        } else if(inHours <= 24) {
            timeDiff.put(inHours, "Hours");
        } else {
            timeDiff.put(inDays, "Days");
        }
    }

    public void validate() throws Exception {

        if(content.isEmpty()) {
            throw new Exception("Posts cannot be empty");
        }

        if(content.length() > 500) {
            throw new Exception("Posts cannot exceed length of 500");
        }

        if(authorId == null) {
            throw new Exception("No author selected");
        }
    }

    public CommentResource toResource() {
        var commentResource = new CommentResource(this);

        return commentResource;
    }

}
