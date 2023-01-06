package com.damosoft.commons.web.query.pagination;

import lombok.Data;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import java.util.List;

@Data
public class QueryOptions {
    @QueryParam("sort")
    private List<String> sort;
    @QueryParam("page")
    @DefaultValue("0")
    private int page;
    @QueryParam("size")
    @DefaultValue("20")
    private int pageSize;
}
