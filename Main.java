public class Main {

    public static void main(String[] args) {

        ArrayCollection<Artifact> museum = new ArrayCollection<>();

        // Add sample artifacts
        Artifact artifact1 = new Artifact(
                "A101",
                "Ancient Stone Tool",
                "Prehistoric"
        );

        Artifact artifact2 = new Artifact(
                "B205",
                "Renaissance Painting",
                "Renaissance"
        );

        Artifact artifact3 = new Artifact(
                "C309",
                "Roman Coin",
                "Roman Empire"
        );

        museum.add(artifact1);
        museum.add(artifact2);
        museum.add(artifact3);

        System.out.println("Original collection size: " + museum.size());

        // Search using only the artifact ID
        Artifact searchKey = new Artifact("B205", "", "");

        System.out.println("\nSearching for B205...");

        if (museum.contains(searchKey)) {
            System.out.println("Artifact found!");
            System.out.println(museum.get(searchKey));
        } else {
            System.out.println("Artifact not found.");
        }

        // Remove B205
        System.out.println("\nRemoving B205...");
        museum.remove(searchKey);

        System.out.println("Collection size after removal: " + museum.size());

        // Verify remaining artifacts
        System.out.println("\nRemaining artifacts:");

        System.out.println(museum.get(
                new Artifact("A101", "", "")
        ));

        System.out.println(museum.get(
                new Artifact("C309", "", "")
        ));
    }
}