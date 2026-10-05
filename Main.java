import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // =========================
        // PHASE 1 - ArrayCollection
        // =========================
        System.out.println("=== PHASE 1: ARRAY COLLECTION ===");

        ArrayCollection<Artifact> museum = new ArrayCollection<>();

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

        Artifact searchKey = new Artifact("B205", "", "");

        System.out.println("\nSearching for B205...");

        if (museum.contains(searchKey)) {
            System.out.println("Artifact found!");
            System.out.println(museum.get(searchKey));
        } else {
            System.out.println("Artifact not found.");
        }

        System.out.println("\nRemoving B205...");
        museum.remove(searchKey);

        System.out.println(
                "Collection size after removal: " + museum.size()
        );

        System.out.println("\nRemaining artifacts:");

        System.out.println(
                museum.get(new Artifact("A101", "", ""))
        );

        System.out.println(
                museum.get(new Artifact("C309", "", ""))
        );


        // ==========================
        // PHASE 2 - LinkedCollection
        // ==========================
        System.out.println("\n=== PHASE 2: LINKED COLLECTION ===");

        LinkedCollection<Artifact> linkedMuseum =
                new LinkedCollection<>();

        Artifact linkedArtifact1 = new Artifact(
                "D410",
                "Medieval Sword",
                "Middle Ages"
        );

        Artifact linkedArtifact2 = new Artifact(
                "E520",
                "Egyptian Statue",
                "Ancient Egypt"
        );

        Artifact linkedArtifact3 = new Artifact(
                "F630",
                "Viking Shield",
                "Viking Age"
        );

        linkedMuseum.add(linkedArtifact1);
        linkedMuseum.add(linkedArtifact2);
        linkedMuseum.add(linkedArtifact3);

        System.out.println(
                "Linked collection size: " + linkedMuseum.size()
        );

        Artifact linkedSearchKey =
                new Artifact("E520", "", "");

        System.out.println("\nSearching for E520...");

        if (linkedMuseum.contains(linkedSearchKey)) {
            System.out.println("Artifact found!");
            System.out.println(
                    linkedMuseum.get(linkedSearchKey)
            );
        } else {
            System.out.println("Artifact not found.");
        }

        System.out.println("\nRemoving E520...");
        linkedMuseum.remove(linkedSearchKey);

        System.out.println(
                "Linked collection size after removal: "
                        + linkedMuseum.size()
        );

        System.out.println("\nChecking remaining artifacts:");

        System.out.println(
                "D410 still exists: "
                        + linkedMuseum.contains(
                        new Artifact("D410", "", "")
                )
        );

        System.out.println(
                "E520 still exists: "
                        + linkedMuseum.contains(
                        new Artifact("E520", "", "")
                )
        );

        System.out.println(
                "F630 still exists: "
                        + linkedMuseum.contains(
                        new Artifact("F630", "", "")
                )
        );


        // ==================================
        // PHASE 3 - Comparable and ArrayList
        // ==================================
        System.out.println(
                "\n=== PHASE 3: SORTED CATALOG ==="
        );

        ArrayList<Artifact> museumList = new ArrayList<>();

        // Add artifacts in deliberately unsorted order
        museumList.add(
                new Artifact(
                        "M04",
                        "Medieval Crown",
                        "Middle Ages"
                )
        );

        museumList.add(
                new Artifact(
                        "A01",
                        "Ancient Pottery",
                        "Ancient"
                )
        );

        museumList.add(
                new Artifact(
                        "Z99",
                        "Modern Sculpture",
                        "Modern"
                )
        );

        museumList.add(
                new Artifact(
                        "B12",
                        "Bronze Helmet",
                        "Bronze Age"
                )
        );

        System.out.println("\nBefore sorting:");

        for (Artifact artifact : museumList) {
            System.out.println(artifact);
        }

        // Uses Artifact.compareTo() to sort by ID
        Collections.sort(museumList);

        System.out.println("\nAfter sorting:");

        for (Artifact artifact : museumList) {
            System.out.println(artifact);
        }
    }
}