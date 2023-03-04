package com.damosoft.app.search.client.talent;

import com.damosoft.commons.web.query.pagination.QueryOptions;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("talents")
@RegisterRestClient
public interface TalentResourceClient {
    @GET
    Uni<TalentsPaginatedResult> search(@BeanParam QueryOptions queryOptions, @QueryParam("talentName") String talentName);
}
