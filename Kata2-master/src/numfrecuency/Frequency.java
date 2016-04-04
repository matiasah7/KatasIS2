package numfrecuency;

import java.util.HashMap;

public class Frequency {

    private int [] numArray;
    private HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    private int max = 0;

    public Frequency(int[] numArray) {
        this.numArray = numArray;
    }
    
    public int getMaxNumber(){
        getMap();
        int number = 1;
        for (Integer key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) < max)continue;
            number = key;
            max = frequencyMap.get(key);
        }
        return number;
    }
    
     public int getMaxFrequency(){
        return max;
    }

    public void getMap(){
        for (int value : numArray) 
            frequencyMap.put(value, (getFrequency(value) + 1));
    }
    
    public int getFrequency (int value){
        if (frequencyMap.containsKey(value))
            return frequencyMap.get(value);
        return 0;
    }
}
