
public class Location {
	private double lat;
	private double longit;
	private String name;
	
	public Location(double lattitude, double longitude, String locName){
		lat = lattitude;
		longit = longitude;
		name = locName;
	}
	
	public double getLat(){
		return lat;
	}
	
	public double getLongit(){
		return longit;
	}
	
	public String getName(){
		return name;
	}
}
