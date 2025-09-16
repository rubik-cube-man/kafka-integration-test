package com.rubikcubeman;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.ListGroupsResult;

import java.util.concurrent.ExecutionException;

@Path("")
public class KafkaTestEndpoint {

    @Inject
    AdminClient adminClient;

    @GET
    @Path("healthy")
    public String healthy() throws ExecutionException, InterruptedException {
        ListGroupsResult listedGroups = adminClient.listGroups();
        // Will fail if unable to reach kafka
        listedGroups.all().get();

        return "Healthy";
    }
}
