package com.yumingqin.walkphilly;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MainActivity extends Activity {
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    static CharSequence location;
    ArrayList<Location> allLocs = new ArrayList<Location>();
    PriorityQueue<Location> pq = new PriorityQueue<Location>();
    ArrayList<Location> selectedLocs;


    private void setUpLocs(){
        allLocs.add(new Location(39.9532281, -75.1589546, "Reading Terminal Market", "Famous indoor farmer's market offering diverse fare, housewares & area specialties since 1892"));
        allLocs.add(new Location(39.949531,-75.149732, "Independence National Historic Park", "Independence National Historical Park is a United States National Park in Philadelphia that preserves several sites associated with the American Revolution and the nation's founding history."));
        allLocs.add(new Location(39.96557,-75.180966, "Philadelphia Museum of Art", "The Philadelphia Museum of Art is a world-class art museum located at the end of the Benjamin Franklin Parkway in Philadelphia."));
        allLocs.add(new Location(39.94961,-75.150282, "Liberty Bell Center", "Last rung in 1846, the Liberty Bell is a 2,080-pound icon of freedom features a biblical inscription & a famed crack."));
        allLocs.add(new Location(39.948874,-75.150023, "Independence Hall", "Independence Hall, in Historic Philadelphia, is the birthplace of the Declaration of Independence and the Constitution."));
        allLocs.add(new Location(39.96493,-75.180047, "Rocky Steps", "The Rocky Steps are the 72 stone steps before the entrance of the Philadelphia Museum of Art, in Philadelphia."));
        allLocs.add(new Location(39.953892,-75.149066, "National Constituion Center", "The National Constitution Center is a nonprofit, nonpartisan institution devoted to explaining the United States Constitution."));
        allLocs.add(new Location(40.100145,-75.430196, "Valley Forge National Historic Park", "Valley Forge National Historical Park is the site of a Revolutionary War encampment, northwest of Philadelphia, in Pennsylvania."));
        allLocs.add(new Location(39.953853,-75.165294 , "LOVE Park", "Love Park, officially known as John F. Kennedy Plaza, is a plaza located in Center City, Philadelphia, Pennsylvania. The park is nicknamed Love Park for its reproduction of Robert Indiana's Love sculpture which overlooks the plaza."));
        allLocs.add(new Location(39.955809,-75.150411, "Franklin Square", "Franklin Square is one of the five original open-space parks planned by William Penn when he laid out the city of Philadelphia, Pennsylvania in 1682."));
        allLocs.add(new Location(39.958211,-75.173135, "Franklin Institute", "Located in the heart of Philadelphia, The Franklin Institute is one of America's most celebrated museums—a renowned leader in science and technology."));
        allLocs.add(new Location(39.973911,-75.19481, "Philadelphia Zoo", "The Philadelphia Zoo, located in the Centennial District of Philadelphia, Pennsylvania, on the west bank of the Schuylkill River, was the first true zoo in the United States"));
        allLocs.add(new Location(39.960643,-75.172807, "Barnes Foundation", "The Barnes Foundation maintains and displays of the world's leading collections of French impressionist and post-impressionist paintings."));
        allLocs.add(new Location(39.960643,-75.172807, "Barnes Foundation", "The Barnes Foundation maintains and displays of the world's leading collections of French impressionist and post-impressionist paintings."));
        allLocs.add(new Location(39.95247,-75.167847, "One Liberty Observation Deck", "One Liberty Observation Deck, also called Philly From The Top, is an 883 ft high observation deck located on the 57th floor of One Liberty Place in Center City, Philadelphia. "));
        allLocs.add(new Location(39.952302,-75.144746, "The Betsy Ross House", "The Betsy Ross House is a landmark in Philadelphia purported to be the site where the seamstress and flag-maker Betsy Ross lived when she sewed the first American Flag. "));
        allLocs.add(new Location(39.979487,-75.209012, "Please Touch Museum","The Please Touch Museum is the nation's premier children's museum and Philadelphia's favorite destination for kids."));
        allLocs.add(new Location(39.955608,-75.163143, "Pennsylvania Academy of the Fine Arts", "A jewel nestled in the heart of Center City, the Pennsylvania Academy of the Fine Arts (PAFA) boasts a vast collection of American art and treasures by local and national luminaries such as Charles Willson Peale (founder of the Academy), Thomas Eakins (who taught here), and Violet Oakley."));
        allLocs.add(new Location(39.95709,-75.171205, "Academy of Natural Sciences", "The Academy of Natural Sciences of Drexel University, formerly the Academy of Natural Sciences of Philadelphia, is the oldest natural science research institution and museum in the New World."));
        allLocs.add(new Location(39.949239,-75.191367, "Penn Museum of Archaeology and Anthropology", "The University of Pennsylvania Museum of Archaeology and Anthropology — commonly called Penn Museum — is an archaeology and anthropology museum that is part of the University of Pennsylvania."));
        allLocs.add(new Location(39.968336,-75.172665, "Eastern State Penitentiary", "Eastern State Penitentiary – with its massive, fortress-like 30-foot walls – is an intimidating and spooky presence in Philadelphia's Fairmount neighborhood."));
        allLocs.add(new Location(39.949529,-75.146888, "Benjamin Franklin Museum", "Dedicated to the life, times and legacy of Philadelphia's famous founding father, the Benjamin Franklin Museum invites you to explore a variety of exhibitions."));
        allLocs.add(new Location(39.950181,-75.148426, "National Museum of American Jewish History", "Rising five stories above Independence Mall in the heart of Historic Philadelphia, the National Museum of American Jewish History brings to life the 360-year history of Jews in America."));
        allLocs.add(new Location( 39.950849,-75.150161, "Independence Visitor Center", "The Visitor Center is just a stone’s throw from some of Philadelphia’s most popular attractions, including the Liberty Bell Center, Independence Hall, the National Museum of American Jewish History and the National Constitution Center."));
        allLocs.add(new Location(39.953311,-75.176639, "Mutter Museum", "Mutter Museum in Philadelphia's Rittenhouse Square neighborhood offers a vast collection of medical and anatomical oddities."));
        allLocs.add(new Location(39.952195,-75.180653, "Schuylkill Banks", "Spanning eight miles of riverfront winding through the heart of Philadelphia, Schuylkill Banks is open year-round for walking, jogging, cycling, picnics and dog-walking"));
        allLocs.add(new Location(39.952767,-75.142397, "Elfreth's Alley", "Named for blacksmith and property-owner Jeremiah Elfreth, Elfreth’s Alley was home to the 18th-century artisans and trades-people who were the backbone of colonial Philadelphia"));
        allLocs.add(new Location(39.953304,-75.151765, "African American Museum of Philadelphia", "The African American Museum in Philadelphia, founded in 1976, is the first institution built by a major U.S. city to preserve, interpret and exhibit the heritage and culture of African-Americans."));
        allLocs.add(new Location(39.950261,-75.151843, "Philadelphia History Museum", "The historic 1826 building, located just around the corner from Independence Hall and the Liberty Bell, has been an exciting gateway into Philadelphia history for nearly 70 years."));
        allLocs.add(new Location(39.963741,-75.132385, "SugarHouse Casino", "SugarHouse Casino, the first casino in the city of Philadelphia, is conveniently located on the picturesque Delaware River waterfront"));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpLocs();

        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.locations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                location = (CharSequence) parent.getItemAtPosition(position);
                int numLocs = Integer.parseInt((String) location);
                selectedLocs = new ArrayList<Location>();
                System.out.println(numLocs);

                for(Location loc : allLocs){
                    //39.9415, -75.1995
                    loc.setDistance(Math.sqrt(Math.pow((39.9415 - loc.getLat()),
                            2) + Math.pow((-75.1995 - loc.getLongit()), 2)));
                    pq.add(loc);
                }

                int i = 0;
                while(i != numLocs){
                    Location temp = pq.peek();
                    System.out.println(temp.getName() + "\t" + temp.getDistance());
                    selectedLocs.add(pq.poll());
                    i++;
                }

                System.out.println("SIZE: "+ selectedLocs.size());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//        MapsActivity.setUpMapIfNeeded();
    }

    public void onLaunchButtonClick(View view){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }
}
