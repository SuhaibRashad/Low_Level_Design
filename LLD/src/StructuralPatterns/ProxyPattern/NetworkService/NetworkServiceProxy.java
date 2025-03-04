package StructuralPatterns.ProxyPattern.NetworkService;

import java.util.HashMap;
import java.util.Map;

public class NetworkServiceProxy implements NetworkService {

    private RealNetworkService realNetworkService;
    private Map<String, String> cache;

    public NetworkServiceProxy() {
        // TODO: Initialize the cache to store fetched data.
        cache = new HashMap<String, String>();
    }

    @Override
    public String fetchData(String input) {

        if (cache.containsKey(input)) {
            System.out.println("Fetching data from cache");

            // TODO: Return the cached data for the given input.
            return cache.get(input);

        }

        if (realNetworkService == null) {
            // TODO: Initialize the RealNetworkService if it has not been created yet.
            realNetworkService = new RealNetworkService();

        }

        // TODO: Fetch data from the real network service using the provided input.
        String data = realNetworkService.fetchData(input);

        // TODO: Cache the fetched data with the input as the key for future access.
        cache.put(input, data);

        // TODO: Return the fetched data to the client.
        return data;

    }
}