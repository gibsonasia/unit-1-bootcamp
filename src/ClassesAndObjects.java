/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static void main(String args[]) {

        Cat garfield = new Cat("Garfield");
        Cat pinkPanther = new Cat("Pink Panther");
        Cat catWoman = new Cat("CatWoman");

        garfield.setFavoriteFood("Lasagna");
        pinkPanther.setFavoriteFood("Beefaroni");
        catWoman.setFavoriteFood("Ziti");

        garfield.setAge(40);
        pinkPanther.setAge(70);
        catWoman.setAge(100);

    }


    public static boolean isOlder(Cat firstCat, Cat secondCat) {
        return firstCat.getAge() > secondCat.getAge();
    }

    public static void makeBestFriends(Cat firstCat, Cat secondCat) {
        firstCat.setFavoriteFood(secondCat.getFavoriteFood());
    }

    public static Cat makeKitten(Cat firstCat, Cat secondCat) {
        Cat cat = new Cat(firstCat.getName() + secondCat.getName());
        cat.setAge(0);
        return cat;
    }

    public static void adoption(Cat cat, Person owner) {
        if (cat.getName().equalsIgnoreCase("Catwoman")) {
            System.out.println("Catwoman will never be anyone's pet!");
        } else {
            cat.setOwner(owner);
        }
    }

    public static boolean isFree(Cat theCat) {
        return theCat.getOwner() == null;
    }

    public static boolean isSibling(Cat firstCat, Cat secondCat) {
        return firstCat.getOwner().equals(secondCat.getOwner());
    }

}
