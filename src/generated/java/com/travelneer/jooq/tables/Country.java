/*
 * This file is generated by jOOQ.
 */
package com.travelneer.jooq.tables;


import com.travelneer.jooq.Indexes;
import com.travelneer.jooq.Keys;
import com.travelneer.jooq.Travelneer;
import com.travelneer.jooq.tables.records.CountryRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class Country extends TableImpl<CountryRecord> {

    private static final long serialVersionUID = -253794369;

    /**
     * The reference instance of <code>travelneer.country</code>
     */
    public static final Country COUNTRY = new Country();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryRecord> getRecordType() {
        return CountryRecord.class;
    }

    /**
     * The column <code>travelneer.country.id</code>.
     */
    public final TableField<CountryRecord, Short> ID = createField("id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>travelneer.country.code</code>.
     */
    public final TableField<CountryRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>travelneer.country.name</code>.
     */
    public final TableField<CountryRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>travelneer.country.profile_image_url</code>.
     */
    public final TableField<CountryRecord, String> PROFILE_IMAGE_URL = createField("profile_image_url", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>travelneer.country.flag_url</code>.
     */
    public final TableField<CountryRecord, String> FLAG_URL = createField("flag_url", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>travelneer.country</code> table reference
     */
    public Country() {
        this(DSL.name("country"), null);
    }

    /**
     * Create an aliased <code>travelneer.country</code> table reference
     */
    public Country(String alias) {
        this(DSL.name(alias), COUNTRY);
    }

    /**
     * Create an aliased <code>travelneer.country</code> table reference
     */
    public Country(Name alias) {
        this(alias, COUNTRY);
    }

    private Country(Name alias, Table<CountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Country(Name alias, Table<CountryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Country(Table<O> child, ForeignKey<O, CountryRecord> key) {
        super(child, key, COUNTRY);
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
        return Arrays.<Index>asList(Indexes.COUNTRY_CODE, Indexes.COUNTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CountryRecord, Short> getIdentity() {
        return Keys.IDENTITY_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CountryRecord> getPrimaryKey() {
        return Keys.KEY_COUNTRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CountryRecord>> getKeys() {
        return Arrays.<UniqueKey<CountryRecord>>asList(Keys.KEY_COUNTRY_PRIMARY, Keys.KEY_COUNTRY_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Country as(String alias) {
        return new Country(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Country as(Name alias) {
        return new Country(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Country rename(String name) {
        return new Country(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Country rename(Name name) {
        return new Country(name, null);
    }
}
