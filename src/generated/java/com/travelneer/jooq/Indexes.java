/*
 * This file is generated by jOOQ.
 */
package com.travelneer.jooq;


import com.travelneer.jooq.tables.Comment;
import com.travelneer.jooq.tables.Country;
import com.travelneer.jooq.tables.CountryFollows;
import com.travelneer.jooq.tables.Favourites;
import com.travelneer.jooq.tables.Post;
import com.travelneer.jooq.tables.Role;
import com.travelneer.jooq.tables.User;
import com.travelneer.jooq.tables.UserRoles;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>travelneer</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index COMMENT_AUTHOR_ID = Indexes0.COMMENT_AUTHOR_ID;
    public static final Index COMMENT_PARENT_POST_ID = Indexes0.COMMENT_PARENT_POST_ID;
    public static final Index COMMENT_PRIMARY = Indexes0.COMMENT_PRIMARY;
    public static final Index COUNTRY_PRIMARY = Indexes0.COUNTRY_PRIMARY;
    public static final Index COUNTRY_FOLLOWS_COUNTRY_ID = Indexes0.COUNTRY_FOLLOWS_COUNTRY_ID;
    public static final Index COUNTRY_FOLLOWS_PRIMARY = Indexes0.COUNTRY_FOLLOWS_PRIMARY;
    public static final Index FAVOURITES_POST_ID = Indexes0.FAVOURITES_POST_ID;
    public static final Index FAVOURITES_PRIMARY = Indexes0.FAVOURITES_PRIMARY;
    public static final Index POST_AUTHOR_ID = Indexes0.POST_AUTHOR_ID;
    public static final Index POST_COUNTRY_ID = Indexes0.POST_COUNTRY_ID;
    public static final Index POST_PRIMARY = Indexes0.POST_PRIMARY;
    public static final Index ROLE_PRIMARY = Indexes0.ROLE_PRIMARY;
    public static final Index ROLE_ROLE_NAME = Indexes0.ROLE_ROLE_NAME;
    public static final Index USER_PRIMARY = Indexes0.USER_PRIMARY;
    public static final Index USER_USER_EMAIL = Indexes0.USER_USER_EMAIL;
    public static final Index USER_USER_NAME = Indexes0.USER_USER_NAME;
    public static final Index USER_ROLES_PRIMARY = Indexes0.USER_ROLES_PRIMARY;
    public static final Index USER_ROLES_ROLE_ID = Indexes0.USER_ROLES_ROLE_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index COMMENT_AUTHOR_ID = Internal.createIndex("author_id", Comment.COMMENT, new OrderField[] { Comment.COMMENT.AUTHOR_ID }, false);
        public static Index COMMENT_PARENT_POST_ID = Internal.createIndex("parent_post_id", Comment.COMMENT, new OrderField[] { Comment.COMMENT.PARENT_POST_ID }, false);
        public static Index COMMENT_PRIMARY = Internal.createIndex("PRIMARY", Comment.COMMENT, new OrderField[] { Comment.COMMENT.ID }, true);
        public static Index COUNTRY_PRIMARY = Internal.createIndex("PRIMARY", Country.COUNTRY, new OrderField[] { Country.COUNTRY.ID }, true);
        public static Index COUNTRY_FOLLOWS_COUNTRY_ID = Internal.createIndex("country_id", CountryFollows.COUNTRY_FOLLOWS, new OrderField[] { CountryFollows.COUNTRY_FOLLOWS.COUNTRY_ID }, false);
        public static Index COUNTRY_FOLLOWS_PRIMARY = Internal.createIndex("PRIMARY", CountryFollows.COUNTRY_FOLLOWS, new OrderField[] { CountryFollows.COUNTRY_FOLLOWS.USER_ID, CountryFollows.COUNTRY_FOLLOWS.COUNTRY_ID }, true);
        public static Index FAVOURITES_POST_ID = Internal.createIndex("post_id", Favourites.FAVOURITES, new OrderField[] { Favourites.FAVOURITES.POST_ID }, false);
        public static Index FAVOURITES_PRIMARY = Internal.createIndex("PRIMARY", Favourites.FAVOURITES, new OrderField[] { Favourites.FAVOURITES.USER_ID, Favourites.FAVOURITES.POST_ID }, true);
        public static Index POST_AUTHOR_ID = Internal.createIndex("author_id", Post.POST, new OrderField[] { Post.POST.AUTHOR_ID }, false);
        public static Index POST_COUNTRY_ID = Internal.createIndex("country_id", Post.POST, new OrderField[] { Post.POST.COUNTRY_ID }, false);
        public static Index POST_PRIMARY = Internal.createIndex("PRIMARY", Post.POST, new OrderField[] { Post.POST.ID }, true);
        public static Index ROLE_PRIMARY = Internal.createIndex("PRIMARY", Role.ROLE, new OrderField[] { Role.ROLE.ID }, true);
        public static Index ROLE_ROLE_NAME = Internal.createIndex("role_name", Role.ROLE, new OrderField[] { Role.ROLE.NAME }, true);
        public static Index USER_PRIMARY = Internal.createIndex("PRIMARY", User.USER, new OrderField[] { User.USER.ID }, true);
        public static Index USER_USER_EMAIL = Internal.createIndex("user_email", User.USER, new OrderField[] { User.USER.EMAIL }, true);
        public static Index USER_USER_NAME = Internal.createIndex("user_name", User.USER, new OrderField[] { User.USER.NAME }, true);
        public static Index USER_ROLES_PRIMARY = Internal.createIndex("PRIMARY", UserRoles.USER_ROLES, new OrderField[] { UserRoles.USER_ROLES.USER_ID, UserRoles.USER_ROLES.ROLE_ID }, true);
        public static Index USER_ROLES_ROLE_ID = Internal.createIndex("role_id", UserRoles.USER_ROLES, new OrderField[] { UserRoles.USER_ROLES.ROLE_ID }, false);
    }
}
