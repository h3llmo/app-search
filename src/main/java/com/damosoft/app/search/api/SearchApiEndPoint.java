package com.damosoft.app.search.api;

import com.damosoft.app.search.client.talent.TalentResourceClient;
import com.damosoft.app.search.client.talent.TalentsPaginatedResult;
import com.damosoft.commons.web.query.pagination.QueryOptions;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("search-api")
@RegisterRestClient
public class SearchApiEndPoint {
    @RestClient
    @Inject
    private TalentResourceClient talentResourceClient;

    @GET
    @Path("talents/v1")
    public Uni<TalentsPaginatedResult> searchTalents(@BeanParam QueryOptions opts, @QueryParam("talentName") String talentName) {
        return talentResourceClient.search(opts, talentName);
    }
}
