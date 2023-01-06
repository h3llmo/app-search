package com.damosoft.commons.web.query.pagination;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.ws.rs.core.Response;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaginatedResult {
    private QueryOptions options;
    private int count;
    private Long totalCount;
    private List<?> entries;

    public Response toResponse() {
        return Response.ok(this).build();
    }
}
