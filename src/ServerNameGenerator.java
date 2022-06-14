public class ServerNameGenerator {

    public static String serverNameGenerator() {
        String[] adjectiveArr = {"Crazy", "Lazy", "Busy", "Wish", "Sneaky", "Hungry", "Quiet", "Energetic", "Vengeful", "Loudly"};
        String[] nounArr = {"Parrot", "Fish", "Frog", "Hog", "Cow", "Hippo", "King Cobra", "Armadillo", "racoon", "Chicken"};
        int randomAdjective = (int) (Math.random() * 10);
        int randomNoun = (int) (Math.random() * 10);
        return (adjectiveArr[randomAdjective] + "-" + nounArr[randomNoun]);
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:\n" + serverNameGenerator());
    }
}