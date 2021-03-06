/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelneer.repository;

import com.travelneer.country.Country;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Youssef
 */
public interface CountryRepository extends IRepository<Country> {

    List<Country> search(String searchParam) throws SQLException;

    Country getOneByCode(String countryCode) throws SQLException;

    List<Country> getAll() throws SQLException;

    List<Country> getCountriesFollowed(int userId) throws SQLException;

    Integer getFollowersCount(String countryCode) throws SQLException;

    boolean isCountryFollowedByUser(Integer userId, String countryCode) throws SQLException;

    Integer getCountriesFollowedCount(int userId) throws SQLException;
}
