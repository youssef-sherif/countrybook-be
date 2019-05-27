/*
 * This file is generated by jOOQ.
 */
package com.travelneer.jooq.tables.records;


import com.travelneer.jooq.tables.CountryFollows;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CountryFollowsRecord extends UpdatableRecordImpl<CountryFollowsRecord> implements Record2<Integer, Short> {

    private static final long serialVersionUID = -1253944783;

    /**
     * Setter for <code>travelneer.country_follows.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>travelneer.country_follows.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>travelneer.country_follows.country_id</code>.
     */
    public void setCountryId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>travelneer.country_follows.country_id</code>.
     */
    public Short getCountryId() {
        return (Short) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Short> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Short> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Short> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CountryFollows.COUNTRY_FOLLOWS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return CountryFollows.COUNTRY_FOLLOWS.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryFollowsRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryFollowsRecord value2(Short value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryFollowsRecord values(Integer value1, Short value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CountryFollowsRecord
     */
    public CountryFollowsRecord() {
        super(CountryFollows.COUNTRY_FOLLOWS);
    }

    /**
     * Create a detached, initialised CountryFollowsRecord
     */
    public CountryFollowsRecord(Integer userId, Short countryId) {
        super(CountryFollows.COUNTRY_FOLLOWS);

        set(0, userId);
        set(1, countryId);
    }
}
