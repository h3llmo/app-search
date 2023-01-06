package com.damosoft.commons.web.query.pagination;

import lombok.Data;

import java.util.List;

@Data
public class TypedPaginatedResult<T> {
    private QueryOptions options;
    private int count;
    private Long totalCount;
    private List<T> entries;
}
