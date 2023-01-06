package com.damosoft.app.search.client.talent;

import lombok.Data;

import java.util.Set;


@Data
public class TalentEntity {
    private String uuid;
    private String talentName;
    private String identityId;
    private Set<TalentCategoryEntity> talentCategory;
}
