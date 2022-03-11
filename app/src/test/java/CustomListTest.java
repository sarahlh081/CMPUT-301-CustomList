import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list  = new CustomList(null,new ArrayList<City>()); //@before kept breaking it


    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(),listSize+1);
    }
    @Test
    public void hasCityTest(){
        City city = new City("Cold Lake", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }
    @Test
    public void deleteCityTest(){
        int listSize = list.getCount();
        City city = new City("Calgary", "AB");
        list.addCity(city);
        assertEquals(list.getCount(),listSize+1);
        list.deleteCity(city);
        assertEquals(list.getCount(),listSize);
    }
}
