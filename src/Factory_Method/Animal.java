package Factory_Method;
 public abstract class Animal{
        public abstract String getName();

        public static Animal createAnimal(String type){
            if (type.equals("cat") ){
                return new Cat();
            } else if (type.equals("dog")) {
                return new Dog();
            }
            else{
                throw new IllegalArgumentException("Invalid animal type: " + type);
            }
        }

     public static class Cat extends Animal {
         @Override
         public String getName() {
             return "Factory_Method.Animal.Cat";
         }
     }

     public static class Dog extends Animal {
         @Override
         public String getName() {
             return "Factory_Method.Animal.Dog";
         }
     }
 }
