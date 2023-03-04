package com.damosoft.app.search.client.talent;

import lombok.Data;

import java.util.Set;

/**
 * Step-4: User-A updates Talent-1 as "Plumber" as short perform execution talent with fixed price and location area
 * <p>
 * Inputs: guid, execution type, price-type, amount, location, area range, allow cross-border, allow out of area with compensation
 * <p>
 * Service: Talent
 * <p>
 * Test: response is no-content
 * <p>
 * Save for later:
 */
@Data
public class TalentEntity {
    private String uuid;
    private String talentName;
    private String identityId;
    private ExecutionTypeEnum executionType;
    private PriceTypeEnum priceType;
    private Double pricePerHour;
    private String location;
    private Set<TalentCategoryEntity> talentCategory;
}
