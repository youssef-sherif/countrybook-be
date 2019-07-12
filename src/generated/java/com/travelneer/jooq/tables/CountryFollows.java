/*
 * This file is generated by jOOQ.
 */
package com.travelneer.jooq.tables;


import com.travelneer.jooq.Indexes;
import com.travelneer.jooq.Keys;
import com.travelneer.jooq.Travelneer;
import com.travelneer.jooq.tables.records.CountryFollowsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CountryFollows extends TableImpl<CountryFollowsRecord> {

    private static final long serialVersionUID = -1296894437;

    /**
     * The reference instance of <code>travelneer.country_follows</code>
     */
    public static final CountryFollows COUNTRY_FOLLOWS = new CountryFollows();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryFollowsRecord> getRecordType() {
        return CountryFollowsRecord.class;
    }

    /**
     * The column <code>travelneer.country_follows.user_id</code>.
     */
    public final TableField<CountryFollowsRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>travelneer.country_follows.country_code</code>.
     */
    public final TableField<CountryFollowsRecord, String> COUNTRY_CODE = createField("country_code", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * Create a <code>travelneer.country_follows</code> table reference
     */
    public CountryFollows() {
        this(DSL.name("country_follows"), null);
    }

    /**
     * Create an aliased <code>travelneer.country_follows</code> table reference
     */
    public CountryFollows(String alias) {
        this(DSL.name(alias), COUNTRY_FOLLOWS);
    }

    /**
     * Create an aliased <code>travelneer.country_follows</code> table reference
     */
    public CountryFollows(Name alias) {
        this(alias, COUNTRY_FOLLOWS);
    }

    private CountryFollows(Name alias, Table<CountryFollowsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CountryFollows(Name alias, Table<CountryFollowsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CountryFollows(Table<O> child, ForeignKey<O, CountryFollowsRecord> key) {
        super(child, key, COUNTRY_FOLLOWS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Travelneer.TRAVELNEER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.COUNTRY_FOLLOWS_FK_COUNTRY_FOLLOWS_COUNTRY_CODE, Indexes.COUNTRY_FOLLOWS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CountryFollowsRecord> getPrimaryKey() {
        return Keys.KEY_COUNTRY_FOLLOWS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CountryFollowsRecord>> getKeys() {
        return Arrays.<UniqueKey<CountryFollowsRecord>>asList(Keys.KEY_COUNTRY_FOLLOWS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CountryFollowsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CountryFollowsRecord, ?>>asList(Keys.FK_COUNTRY_FOLLOWS_USER_ID, Keys.FK_COUNTRY_FOLLOWS_COUNTRY_CODE);
    }

    public User user() {
        return new User(this, Keys.FK_COUNTRY_FOLLOWS_USER_ID);
    }

    public Country country() {
        return new Country(this, Keys.FK_COUNTRY_FOLLOWS_COUNTRY_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryFollows as(String alias) {
        return new CountryFollows(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryFollows as(Name alias) {
        return new CountryFollows(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CountryFollows rename(String name) {
        return new CountryFollows(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CountryFollows rename(Name name) {
        return new CountryFollows(name, null);
    }
}
