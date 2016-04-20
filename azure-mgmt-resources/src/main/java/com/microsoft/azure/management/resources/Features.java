package com.microsoft.azure.management.resources;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsGetting;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;

import java.io.IOException;

public interface Features extends
        SupportsListing<Feature> {
    InResourceProvider resourceProvider(String resourceProviderName);

    public interface InResourceProvider extends
            SupportsListing<Feature>,
            SupportsGetting<Feature> {
        Feature register(String featureName) throws IOException, CloudException;
    }
}
