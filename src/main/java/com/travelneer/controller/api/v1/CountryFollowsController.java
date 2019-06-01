package com.travelneer.controller.api.v1;

import com.travelneer.country.CountriesResource;
import com.travelneer.country.Country;
import com.travelneer.country.CountryResource;
import com.travelneer.jwt.JwtValidator;
import com.travelneer.repository.CountryFollowsRepository;
import com.travelneer.service.FollowCountryService;
import com.travelneer.service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin( origins = {"http://localhost:3000", "http://localhost:5000"})
@RequestMapping(value = "/api/v1")
public class CountryFollowsController {

    private final FollowCountryService followsService;
    private final CountryFollowsRepository countryFollowsRepository;
    private final S3Service s3Service;
    private final JwtValidator validator;

    @Autowired
    public CountryFollowsController(FollowCountryService followCountryService, CountryFollowsRepository countryFollowsRepository, S3Service s3Service, JwtValidator validator) {
        this.followsService = followCountryService;
        this.countryFollowsRepository = countryFollowsRepository;
        this.s3Service = s3Service;
        this.validator = validator;
    }


    @RequestMapping(value = "/followed-countries", method = RequestMethod.GET)
    public ResponseEntity<?> getFollowedCountries() {

        try {
            List<Country> countries = countryFollowsRepository.getCountriesFollowed(validator.getUserId());
            countries.forEach(e -> e.setFlagUrl(s3Service.getImage(e.getFlagUrl())));

            List<CountryResource> countryResources = countries.stream().map(CountryResource::new)
                    .collect(Collectors.toList());
            var countriesResource = new CountriesResource(countryResources);

            return new ResponseEntity<>(countriesResource, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/followed-countries/{countryId}", method = RequestMethod.PUT)
    public ResponseEntity<?> followCountry(@PathVariable("countryId") short countryId) {

        var responseBody = new HashMap<String, Object>();
        try {
            followsService.followCountry(countryId);

            responseBody.put("successful", true);
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            responseBody.put("successful", false);
            responseBody.put("errorMessage", e.getMessage());
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/followed-countries/{countryId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> unFollowCountry(@PathVariable("countryId") short countryId) {

        var responseBody = new HashMap<String, Object>();
        try {
            followsService.unFollowCountry(countryId);

            responseBody.put("successful", true);
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            responseBody.put("successful", false);
            responseBody.put("errorMessage", e.getMessage());
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/countries/{countryId}/followers-count", method = RequestMethod.GET)
    public ResponseEntity<?> getFollowersCount(@PathVariable("countryId") Short countryId) {

        var responseBody = new HashMap<String, Object>();
        try {
            Integer count = countryFollowsRepository.getFollowersCount(countryId);

            responseBody.put("followersCount", count);
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            responseBody.put("successful", false);
            responseBody.put("errorMessage", e.getMessage());
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
        }
    }
}
