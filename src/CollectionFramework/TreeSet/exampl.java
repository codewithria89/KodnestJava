package CollectionFramework.TreeSet;
import java.util.*;

public class exampl {
    public static void main(String[] args) {
            Set<String> techStack = new TreeSet<>();
// Adding elements to the TreeSet
techStack.add("Java");
techStack.add("Python");
techStack.add("JavaScript");
techStack.add("Java"); // Duplicate element, will not be added
// Display the elements in sorted order
System.out.println("Tech Stack: " + techStack);
// Removing an element
techStack.remove("JavaScript");
System.out.println("After removing JavaScript: " + techStack);
// Checking if an element exists
if (techStack.contains("Python")) {
        System.out.println("Python is part of the tech stack.");
    }
// Retrieve the first and last elements
if (techStack instanceof TreeSet) {
        TreeSet<String> treeSet = (TreeSet<String>) techStack;
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());
    }
}
}

