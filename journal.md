# Museum Archive System Journal

## Phase 1 - Artifact Model and ArrayCollection

Overriding the equals method in the Artifact class is important because Java's default equality checks whether two variables reference the exact same object in memory. In this project, researchers need to find artifacts based on their ID even when the search key is a different Artifact object. By overriding equals, two Artifact objects with the same ID are considered equal even if their names and eras are different.

The swap-with-last removal method is more efficient than shifting every element after the removed item. Instead of moving several elements one position to the left, the collection replaces the removed element with the last element and clears the final array position. This makes the actual removal faster because it only requires a few assignments. Since the ArrayCollection is unordered, changing the position of the last element does not cause a problem.

## Phase 2 - LinkedCollection

The LinkedCollection allows new items to be inserted in O(1) time because each new node is added directly to the head of the linked list. It does not need to search for an empty position or shift any existing elements.

One trade-off is that a linked collection requires additional memory for every item because each node stores both the data and a reference to the next node. An array stores its elements in contiguous memory without requiring a separate link for every item. Arrays also usually have better cache locality because their elements are stored next to each other in memory. Linked list nodes can be located in different areas of memory, which can make traversal less efficient even though the collection can grow dynamically.

## Phase 3 - Comparable and Java Collections

The Comparable interface establishes a natural ordering by allowing a class to define how its objects should be compared. In the Artifact class, I implemented compareTo so that artifacts are compared using their ID values. This allows Java's Collections.sort method to automatically arrange Artifact objects in alphabetical order by ID.

The equals and compareTo methods should also be consistent with each other. In this project, equals considers two artifacts equal when their IDs match. Since compareTo also compares the ID, it returns 0 when the IDs are the same. Keeping these methods consistent prevents situations where Java considers two objects equal during sorting but unequal when checking them with equals.