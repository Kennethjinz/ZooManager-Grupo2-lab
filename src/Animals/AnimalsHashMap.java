/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

import Lists.List;
import java.util.HashMap;
import java.util.HashSet;
/**
 *
 * @author Student
 */
public class AnimalsHashMap implements List<Animal>{
   HashMap<String,Animal> map; 

    public AnimalsHashMap(HashMap<String, Animal> map) {
        this.map = new HashMap<>();
    }

    @Override
    public boolean add(Animal t) {
        if(map.containsKey(t.getId())) return false;
        map.put(t.getId(), t);
        return true;
    }

    @Override
    public boolean remove(Animal t) {
        if(!map.containsKey(t.getId())) return false;
        map.remove(t.getId());
        return true;
        
        //return map.remove(t.getId()!=null);
    }

    @Override
    public Animal find(Object id) {
       String strId = String.valueOf(id);
       return map.get(strId);
    }

    @Override
    public void showAll() {
        
    }
    
    //
    public HashSet<String> getSpecies(){
        HashSet<String> set = new HashSet<>();
        for (Animal animal:map.values()){
            set.add(animal.getSpecies());
        }
        return set;
    }
   
    
   
}
