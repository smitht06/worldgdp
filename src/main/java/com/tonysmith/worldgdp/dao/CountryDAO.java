package com.tonysmith.worldgdp.dao;

public class CountryDAO {
    private static final String SELECT_CLAUSE = "SELECT "
            + "c.Code, "
            + "c.Name, "
            + "c.Continent, "
            + "c.region, "
            + "c.SurfaceArea surface_area, "
            + "c.IndepYear indep_year, "
            + "c.Population, "
            + "c.LifeExpectancy life_expectancy, "
            + "c.GNP, "
            + "c.LocalName local_name, "
            + "c.GovernmentForm government_form, "
            + "c.HeadOfState head_of_state, "
            + "c.code2 ,"
            + "c.capital ,"
            + "cy.name capital_name "
            + "FROM country c"
            + "LEFT OUTER JOIN city cy ON cy.id = c.capital ";

    private static final String SEARCH_WHERE_CLAUSE =
            " AND ( LOWER(c.name) " + " LIKE CONCAT ('%', LOWER(:search), '%')) ";

    private static final String CONTINENT_WHERE_CLAUSE =
            " AND c.continent = :continent ";

    private static final String REGION_WHERE_CLAUSE =
            " AND c.region = :region ";

    private static final String PAGINATION_CLAUSE = " ORDER BY c.code "
            + "  LIMIT :offset , :size ";


}
