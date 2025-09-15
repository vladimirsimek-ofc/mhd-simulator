// AbstractLocationFactory.java
package com.vladimirsimek.mhd;

import com.vladimirsimek.mhd.logic.locations.Location;

import java.util.Map;

public abstract class AbstractLocationFactory {


    /**
     * Retrieves details about the given location.
     *
     * @param locationId The identifier of the location.
     * @return Details about the specified location.
     */
    public abstract Location getLocationDetails(String locationId);

    /**
     * Updates an existing location with new information.
     *
     * @param locationId The identifier of the location to update.
     * @param parameters A map containing the updated details for the location.
     * @return The updated location object.
     */
    public abstract Location updateLocation(String locationId, Map<String, Object> parameters);

    /**
     * Deletes a location based on its identifier.
     *
     * @param locationId The identifier of the location to delete.
     * @return True if the deletion was successful, false otherwise.
     */
    public abstract boolean deleteLocation(String locationId);
}