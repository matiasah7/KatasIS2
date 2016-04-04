package numfrecuency;

public class Kata2 {

    public static void main(String[] args) {
       int [] numArray1 = {1 , 1 , 2 , 3 , -5 ,6 , 7 , 8 , -5 ,2 , -5 , 3 ,1 ,2 ,-5 ,-5 , -5 ,9};
       Frequency vec = new Frequency(numArray1);
       System.out.println("El número más repetido en el vector es el " + vec.getMaxNumber()+ " que aparece " + vec.getMaxFrequency() + " veces.");
        
       int [] numArray2 = {1 , 1 , 2 , 3 , 5 ,6 , 2, 3 , 2 ,5 ,2 ,9 ,8 ,2 ,7};
       Frequency vec2 = new Frequency(numArray2);
       System.out.println("El número más repetido en el vector es el " + vec2.getMaxNumber()+ " que aparece " + vec2.getMaxFrequency() + " veces.");
        
       int [] numArray3 = {1 , 1 , 2 , 3 , 5 ,6 , 7 , 8 , 3 ,1};
       Frequency vec3 = new Frequency(numArray3);
       System.out.println("El número más repetido en el vector es el " + vec3.getMaxNumber()+ " que aparece " + vec3.getMaxFrequency() + " veces.");
    }
}
