public class ServerNameGenerator {

    public static void main(String[] args) {
        System.out.println("Here is your server name:\n" + GenerateserverName());
    }
    public static String GenerateserverName() {
        String[] adjective = {"Crazy", "Lazy", "Busy", "Wish", "Sneaky", "Hungry", "Quiet", "Energetic", "Vengeful", "Loud"};
        String[] noun = {"Parrot", "Fish", "Frog", "Hog", "Cow", "Hippo", "King Cobra", "Armadillo", "racoon", "Chicken"};
        int randomAdjective = (int) (Math.random()* 10);
        int randomNoun = (int) (Math.random()*10);
        return (adjective[randomAdjective] + "-" + noun[randomNoun]);
    }


}