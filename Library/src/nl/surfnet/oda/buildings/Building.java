package nl.surfnet.oda.buildings;

import java.util.Date;


/**
 * Represents a building.
 *
 * @author Daniel Zolnai
 *
 */
public class Building {

    private String _id = null;
    private String _abbr = null;
    private String _resourceUrl = null;
    private String _name = null;
    private String _description = null;
    private String _address = null;
    private String _postalCode = null;
    private String _city = null;
    private Double _lat = null;
    private Double _lon = null;
    private Date _lastModified = null;

    /**
     * Empty constructor needed for GSON - POJO conversion
     */
    Building() {
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        _id = id;
    }

    public String getAbbreviation() {
        return _abbr;
    }

    public void setAbbreviation(String abbr) {
        _abbr = abbr;
    }

    public String getResourceUrl() {
        return _resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        _resourceUrl = resourceUrl;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description){
        _description = description;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }

    public String getPostalCode() {
        return _postalCode;
    }

    public void setPostalCode(String postalCode) {
        _postalCode = postalCode;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        _city = city;
    }

    public Double getLatitude() {
        return _lat;
    }

    public void setLatitude(Double latitude) {
        _lat = latitude;
    }

    public Double getLongitude() {
        return _lon;
    }

    public void setLongitude(Double longitude) {
        _lon = longitude;
    }

    public Date getLastModifiedDate() {
        return _lastModified;
    }

    public void setLastModifiedDate(Date lastModified) {
        _lastModified = lastModified;
    }

}
