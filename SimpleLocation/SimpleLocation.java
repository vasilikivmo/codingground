public class SimpleLocation
{
    public double latitude;
    public double longitude;
    
    /* Constructor */
    public SimpleLocation(double lat, double lon)
    {
        this.latitude = lat;
        this.longitude = lon;
    }
    
    public double distance(SimpleLocation other)
    {
        return getDist(this.latitude, this.longitude, other.latitude, other.longitude);
    }
}
