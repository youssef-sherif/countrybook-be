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
import com.travelneer.jooq.tables.records.CommentRecord;
import com.travelneer.jooq.tables.records.CountryFollowsRecord;
import com.travelneer.jooq.tables.records.CountryRecord;
import com.travelneer.jooq.tables.records.FavouritesRecord;
import com.travelneer.jooq.tables.records.PostRecord;
import com.travelneer.jooq.tables.records.RoleRecord;
import com.travelneer.jooq.tables.records.UserRecord;
import com.travelneer.jooq.tables.records.UserRolesRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>travelneer</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CommentRecord, Integer> IDENTITY_COMMENT = Identities0.IDENTITY_COMMENT;
    public static final Identity<CountryRecord, Short> IDENTITY_COUNTRY = Identities0.IDENTITY_COUNTRY;
    public static final Identity<PostRecord, Integer> IDENTITY_POST = Identities0.IDENTITY_POST;
    public static final Identity<RoleRecord, Byte> IDENTITY_ROLE = Identities0.IDENTITY_ROLE;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CommentRecord> KEY_COMMENT_PRIMARY = UniqueKeys0.KEY_COMMENT_PRIMARY;
    public static final UniqueKey<CountryRecord> KEY_COUNTRY_PRIMARY = UniqueKeys0.KEY_COUNTRY_PRIMARY;
    public static final UniqueKey<CountryRecord> KEY_COUNTRY_CODE = UniqueKeys0.KEY_COUNTRY_CODE;
    public static final UniqueKey<CountryFollowsRecord> KEY_COUNTRY_FOLLOWS_PRIMARY = UniqueKeys0.KEY_COUNTRY_FOLLOWS_PRIMARY;
    public static final UniqueKey<FavouritesRecord> KEY_FAVOURITES_PRIMARY = UniqueKeys0.KEY_FAVOURITES_PRIMARY;
    public static final UniqueKey<PostRecord> KEY_POST_PRIMARY = UniqueKeys0.KEY_POST_PRIMARY;
    public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = UniqueKeys0.KEY_ROLE_PRIMARY;
    public static final UniqueKey<RoleRecord> KEY_ROLE_ROLE_NAME = UniqueKeys0.KEY_ROLE_ROLE_NAME;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_USER_NAME = UniqueKeys0.KEY_USER_USER_NAME;
    public static final UniqueKey<UserRecord> KEY_USER_USER_EMAIL = UniqueKeys0.KEY_USER_USER_EMAIL;
    public static final UniqueKey<UserRolesRecord> KEY_USER_ROLES_PRIMARY = UniqueKeys0.KEY_USER_ROLES_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CommentRecord, UserRecord> FK_COMMENT_USER_ID = ForeignKeys0.FK_COMMENT_USER_ID;
    public static final ForeignKey<CommentRecord, PostRecord> FK_COMMENT_POST_ID = ForeignKeys0.FK_COMMENT_POST_ID;
    public static final ForeignKey<CommentRecord, CommentRecord> FK_PARENT_COMMENT_ID = ForeignKeys0.FK_PARENT_COMMENT_ID;
    public static final ForeignKey<CountryFollowsRecord, UserRecord> FK_COUNTRY_FOLLOWS_USER_ID = ForeignKeys0.FK_COUNTRY_FOLLOWS_USER_ID;
    public static final ForeignKey<CountryFollowsRecord, CountryRecord> FK_COUNTRY_FOLLOWS_COUNTRY_CODE = ForeignKeys0.FK_COUNTRY_FOLLOWS_COUNTRY_CODE;
    public static final ForeignKey<FavouritesRecord, PostRecord> FK_FAVOURITES_POST_ID = ForeignKeys0.FK_FAVOURITES_POST_ID;
    public static final ForeignKey<FavouritesRecord, UserRecord> FK_FAVOURITES_USER_ID = ForeignKeys0.FK_FAVOURITES_USER_ID;
    public static final ForeignKey<PostRecord, UserRecord> FK_POST_USER_ID = ForeignKeys0.FK_POST_USER_ID;
    public static final ForeignKey<UserRolesRecord, UserRecord> FK_USER_ROLES_USER_ID = ForeignKeys0.FK_USER_ROLES_USER_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CommentRecord, Integer> IDENTITY_COMMENT = Internal.createIdentity(Comment.COMMENT, Comment.COMMENT.ID);
        public static Identity<CountryRecord, Short> IDENTITY_COUNTRY = Internal.createIdentity(Country.COUNTRY, Country.COUNTRY.ID);
        public static Identity<PostRecord, Integer> IDENTITY_POST = Internal.createIdentity(Post.POST, Post.POST.ID);
        public static Identity<RoleRecord, Byte> IDENTITY_ROLE = Internal.createIdentity(Role.ROLE, Role.ROLE.ID);
        public static Identity<UserRecord, Integer> IDENTITY_USER = Internal.createIdentity(User.USER, User.USER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CommentRecord> KEY_COMMENT_PRIMARY = Internal.createUniqueKey(Comment.COMMENT, "KEY_comment_PRIMARY", Comment.COMMENT.ID);
        public static final UniqueKey<CountryRecord> KEY_COUNTRY_PRIMARY = Internal.createUniqueKey(Country.COUNTRY, "KEY_country_PRIMARY", Country.COUNTRY.ID);
        public static final UniqueKey<CountryRecord> KEY_COUNTRY_CODE = Internal.createUniqueKey(Country.COUNTRY, "KEY_country_code", Country.COUNTRY.CODE);
        public static final UniqueKey<CountryFollowsRecord> KEY_COUNTRY_FOLLOWS_PRIMARY = Internal.createUniqueKey(CountryFollows.COUNTRY_FOLLOWS, "KEY_country_follows_PRIMARY", CountryFollows.COUNTRY_FOLLOWS.USER_ID, CountryFollows.COUNTRY_FOLLOWS.COUNTRY_CODE);
        public static final UniqueKey<FavouritesRecord> KEY_FAVOURITES_PRIMARY = Internal.createUniqueKey(Favourites.FAVOURITES, "KEY_favourites_PRIMARY", Favourites.FAVOURITES.USER_ID, Favourites.FAVOURITES.POST_ID);
        public static final UniqueKey<PostRecord> KEY_POST_PRIMARY = Internal.createUniqueKey(Post.POST, "KEY_post_PRIMARY", Post.POST.ID);
        public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = Internal.createUniqueKey(Role.ROLE, "KEY_role_PRIMARY", Role.ROLE.ID);
        public static final UniqueKey<RoleRecord> KEY_ROLE_ROLE_NAME = Internal.createUniqueKey(Role.ROLE, "KEY_role_role_name", Role.ROLE.NAME);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
        public static final UniqueKey<UserRecord> KEY_USER_USER_NAME = Internal.createUniqueKey(User.USER, "KEY_user_user_name", User.USER.NAME);
        public static final UniqueKey<UserRecord> KEY_USER_USER_EMAIL = Internal.createUniqueKey(User.USER, "KEY_user_user_email", User.USER.EMAIL);
        public static final UniqueKey<UserRolesRecord> KEY_USER_ROLES_PRIMARY = Internal.createUniqueKey(UserRoles.USER_ROLES, "KEY_user_roles_PRIMARY", UserRoles.USER_ROLES.USER_ID, UserRoles.USER_ROLES.ROLE_ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<CommentRecord, UserRecord> FK_COMMENT_USER_ID = Internal.createForeignKey(com.travelneer.jooq.Keys.KEY_USER_PRIMARY, Comment.COMMENT, "fk_comment_user_id", Comment.COMMENT.AUTHOR_ID);
        public static final ForeignKey<CommentRecord, PostRecord> FK_COMMENT_POST_ID = Internal.createForeignKey(com.travelneer.jooq.Keys.KEY_POST_PRIMARY, Comment.COMMENT, "fk_comment_post_id", Comment.COMMENT.PARENT_POST_ID);
        public static final ForeignKey<CommentRecord, CommentRecord> FK_PARENT_COMMENT_ID = Internal.createForeignKey(com.travelneer.jooq.Keys.KEY_COMMENT_PRIMARY, Comment.COMMENT, "fk_parent_comment_id", Comment.COMMENT.PARENT_COMMENT_ID);
        public static final ForeignKey<CountryFollowsRecord, UserRecord> FK_COUNTRY_FOLLOWS_USER_ID = Internal.createForeignKey(com.travelneer.jooq.Keys.KEY_USER_PRIMARY, CountryFollows.COUNTRY_FOLLOWS, "fk_country_follows_user_id", CountryFollows.COUNTRY_FOLLOWS.USER_ID);
        public static final ForeignKey<CountryFollowsRecord, CountryRecord> FK_COUNTRY_FOLLOWS_COUNTRY_CODE = Internal.createForeignKey(com.travelneer.jooq.Keys.KEY_COUNTRY_CODE, CountryFollows.COUNTRY_FOLLOWS, "fk_country_follows_country_code", CountryFollows.COUNTRY_FOLLOWS.COUNTRY_CODE);
        public static final ForeignKey<FavouritesRecord, PostRecord> FK_FAVOURITES_POST_ID = Internal.createForeignKey(com.travelneer.jooq.Keys.KEY_POST_PRIMARY, Favourites.FAVOURITES, "fk_favourites_post_id", Favourites.FAVOURITES.POST_ID);
        public static final ForeignKey<FavouritesRecord, UserRecord> FK_FAVOURITES_USER_ID = Internal.createForeignKey(com.travelneer.jooq.Keys.KEY_USER_PRIMARY, Favourites.FAVOURITES, "fk_favourites_user_id", Favourites.FAVOURITES.USER_ID);
        public static final ForeignKey<PostRecord, UserRecord> FK_POST_USER_ID = Internal.createForeignKey(com.travelneer.jooq.Keys.KEY_USER_PRIMARY, Post.POST, "fk_post_user_id", Post.POST.AUTHOR_ID);
        public static final ForeignKey<UserRolesRecord, UserRecord> FK_USER_ROLES_USER_ID = Internal.createForeignKey(com.travelneer.jooq.Keys.KEY_USER_PRIMARY, UserRoles.USER_ROLES, "fk_user_roles_user_id", UserRoles.USER_ROLES.USER_ID);
    }
}
