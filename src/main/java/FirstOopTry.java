public class FirstOopTry {
    public static void main(String[] args) {
        class Dog {
            int size;
            String breed;
            String name;

            void bark() {
                System.out.print("Гав! Гав");
            }
        }
        class DogTestDrive {
            public void main(String[] args) {
                Dog d = new Dog();
                d.size = 40;
                d.bark();
            }
        }
    }
}
