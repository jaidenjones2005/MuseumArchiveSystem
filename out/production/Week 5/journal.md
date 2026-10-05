# Museum Archive System Journal

## Phase 1 - Artifact Model and ArrayCollection

Overriding the equals method in the Artifact class is important because Java's default equality checks whether two variables reference the exact same object in memory. In this project, researchers need to find artifacts based on their ID even when the search key is a different Artifact object. By overriding equals, two Artifact objects with the same ID are considered equal even if their names and eras are different.

The swap-with-last removal method is more efficient than shifting every element after the removed item. Instead of moving several elements one position to the left, the collection replaces the removed element with the last element and clears the final array position. This makes the actual removal faster because it only requires a few assignments. Since the ArrayCollection is unordered, changing the position of the last element does not cause a problem.