import java.util.ArrayList;
public  class Animal {
    private Animal(){

    }
    static Animal animal = null;
    private String animalName= "";
    String isVaccinated="";
    private int age=0,price;
    ArrayList<String> animalNames = new ArrayList<>();
    ArrayList<Integer> animalAges = new ArrayList<>();
    ArrayList<Integer> animalPrices = new ArrayList<>();
    ArrayList<String> animalVaccinationStatus = new ArrayList<>();
     public void createAnimal(String name, int age,int price,String vaccinationStatus){
         this.animalName = name;
         animalNames.add(name);
         this.age = age;
         animalAges.add(age);
         this.isVaccinated = vaccinationStatus;
         animalVaccinationStatus.add(vaccinationStatus);
         this.price = price;
         animalPrices.add(price);
     }
    public void getAnimalDetails(){

        System.out.println("Name : " + animalName);
        System.out.println("Age : "+age);
        System.out.println("Vaccination : " + isVaccinated);
        System.out.println("Price : " +price);
        System.out.println();
    }

    public void showAnimals(){
        for (int i = 0; i < animalNames.size(); i++) {
            System.out.println("Item : " + (i+1));
            System.out.println("Name : " +animalNames.get(i));
            System.out.println("Age : "+ animalAges.get(i));
            System.out.println("Vaccination : " +animalVaccinationStatus.get(i));
            System.out.println("Price : " +animalPrices.get(i));
            System.out.println();
        }
    }
     public static Animal getInstance(){
         if(animal==null){
             return new Animal();
         }
         return animal;
     }


}
