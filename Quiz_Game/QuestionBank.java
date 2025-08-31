import java.util.*;

// Stores questions topic-wise in HashMap
public class QuestionBank {
    private Map<String, List<Question>> topics = new HashMap<>();

    public QuestionBank() {
        topics.put("java", new ArrayList<>());
        topics.put("dsa", new ArrayList<>());
        topics.put("core", new ArrayList<>());
        topics.put("cpp", new ArrayList<>());
        loadJavaQuestions();
        loadDSAQuestions();
        loadCppQuestions();
        loadCoreQuestions();
    }

    // Add new question dynamically (admin use)
    public void addQuestion(String topic, Question q) {
        topics.computeIfAbsent(topic, k -> new ArrayList<>()).add(q);
    }

    // Get all questions for a topic
    public List<Question> getQuestions(String topic) {
        return topics.getOrDefault(topic, new ArrayList<>());
    }

    // --- Preloaded Java Questions ---
    private void loadJavaQuestions() {
        List<Question> javaQs = topics.get("java");
        javaQs.add(new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"super", "this", "extends", "implements"}, 2));
        javaQs.add(new Question("Which of these is not a primitive data type?",
                new String[]{"int", "float", "String", "char"}, 2));
        javaQs.add(new Question("Which method is the entry point of Java program?",
                new String[]{"start()", "main()", "init()", "run()"}, 1));
        javaQs.add(new Question("Which package contains Scanner class?",
                new String[]{"java.io", "java.net", "java.util", "java.sql"}, 2));
        javaQs.add(new Question("Which concept allows method to have same name but diff parameters?",
                new String[]{"Overloading", "Overriding", "Encapsulation", "Abstraction"}, 0));
        javaQs.add(new Question("Which keyword is used to prevent inheritance?",
                new String[]{"const", "final", "static", "volatile"}, 1));
        javaQs.add(new Question("Which exception is thrown when dividing by zero?",
                new String[]{"NullPointerException", "ArithmeticException", "IOException", "RuntimeException"}, 1));
        javaQs.add(new Question("Which collection does not allow duplicates?",
                new String[]{"List", "Set", "Map", "Queue"}, 1));
        javaQs.add(new Question("Which thread method is used to pause execution?",
                new String[]{"sleep()", "wait()", "suspend()", "yield()"}, 0));
        javaQs.add(new Question("Which keyword is used to define a constant variable?",
                new String[]{"const", "final", "static", "volatile"}, 1));
        javaQs.add(new Question("Which interface is implemented to sort objects?",
                new String[]{"Serializable", "Cloneable", "Comparable", "Iterable"}, 2));
        javaQs.add(new Question("Which operator is used for object creation?",
                new String[]{"malloc", "alloc", "new", "create"}, 2));
        javaQs.add(new Question("Which JVM memory stores local variables?",
                new String[]{"Stack", "Heap", "Metaspace", "Code Cache"}, 0));
        javaQs.add(new Question("Which keyword refers to parent class object?",
                new String[]{"this", "super", "parent", "base"}, 1));
        javaQs.add(new Question("Which type of class cannot be instantiated?",
                new String[]{"Normal class", "Abstract class", "Final class", "Nested class"}, 1));
        javaQs.add(new Question("Which file type does Java compiler generate?",
                new String[]{".class", ".java", ".exe", ".obj"}, 0));
        javaQs.add(new Question("Which collection is synchronized?",
                new String[]{"ArrayList", "HashMap", "Vector", "HashSet"}, 2));
        javaQs.add(new Question("Which keyword is used for multiple inheritance via interfaces?",
                new String[]{"extends", "implements", "inherits", "super"}, 1));
        javaQs.add(new Question("Which exception must be declared using throws?",
                new String[]{"RuntimeException", "Error", "Checked Exception", "ArithmeticException"}, 2));
        javaQs.add(new Question("Which loop is guaranteed to run at least once?",
                new String[]{"for", "while", "do-while", "foreach"}, 2));
    }

    // --- Preloaded DSA Questions ---
    private void loadDSAQuestions() {
        List<Question> dsaQs = topics.get("dsa");
        dsaQs.add(new Question("Time complexity of binary search?",
                new String[]{"O(1)", "O(log n)", "O(n)", "O(n log n)"}, 1));
        dsaQs.add(new Question("Space complexity of merge sort?",
                new String[]{"O(1)", "O(log n)", "O(n)", "O(n^2)"}, 2));
        dsaQs.add(new Question("Worst case complexity of QuickSort?",
                new String[]{"O(n^2)", "O(n log n)", "O(log n)", "O(n)"}, 0));
        dsaQs.add(new Question("Which DS is used in BFS?",
                new String[]{"Stack", "Queue", "Graph", "Heap"}, 1));
        dsaQs.add(new Question("Which DS is used in DFS?",
                new String[]{"Stack", "Queue", "Heap", "Set"}, 0));
        dsaQs.add(new Question("Best case time complexity of insertion sort?",
                new String[]{"O(n)", "O(n log n)", "O(1)", "O(n^2)"}, 0));
        dsaQs.add(new Question("Which DS gives O(1) average lookup?",
                new String[]{"Array", "HashMap", "LinkedList", "Tree"}, 1));
        dsaQs.add(new Question("Height of balanced binary tree is?",
                new String[]{"O(1)", "O(n)", "O(log n)", "O(n log n)"}, 2));
        dsaQs.add(new Question("Which DS uses FIFO?",
                new String[]{"Stack", "Queue", "Deque", "Tree"}, 1));
        dsaQs.add(new Question("Which DS uses LIFO?",
                new String[]{"Stack", "Queue", "Heap", "Graph"}, 0));
        dsaQs.add(new Question("Time complexity of heap sort?",
                new String[]{"O(n)", "O(n log n)", "O(log n)", "O(n^2)"}, 1));
        dsaQs.add(new Question("Which traversal is used to get sorted order in BST?",
                new String[]{"Preorder", "Inorder", "Postorder", "Level-order"}, 1));
        dsaQs.add(new Question("Which DS is used to detect cycle in graph?",
                new String[]{"Stack", "Queue", "Union-Find", "Heap"}, 2));
        dsaQs.add(new Question("Time complexity of searching in balanced BST?",
                new String[]{"O(n)", "O(log n)", "O(n log n)", "O(1)"}, 1));
        dsaQs.add(new Question("Which algorithm uses dynamic programming?",
                new String[]{"Binary Search", "Merge Sort", "Floyd-Warshall", "Heap Sort"}, 2));
        dsaQs.add(new Question("Which algorithm is greedy?",
                new String[]{"Dijkstra", "Floyd-Warshall", "Kruskal", "Both Dijkstra and Kruskal"}, 3));
        dsaQs.add(new Question("Auxiliary space of quicksort?",
                new String[]{"O(n)", "O(log n)", "O(1)", "O(n^2)"}, 1));
        dsaQs.add(new Question("Which data structure is used in recursion?",
                new String[]{"Queue", "Stack", "Heap", "Tree"}, 1));
        dsaQs.add(new Question("Time complexity of bubble sort worst case?",
                new String[]{"O(n^2)", "O(n log n)", "O(log n)", "O(n)"}, 0));
        dsaQs.add(new Question("Which data structure is best for priority scheduling?",
                new String[]{"Stack", "Heap", "Queue", "Tree"}, 1));
    }

    // --- Preloaded C++ Questions ---
private void loadCppQuestions() {
    List<Question> cppQs = topics.get("cpp");
    cppQs.add(new Question("Which of the following is not a valid C++ access specifier?",
            new String[]{"public", "private", "protected", "package"}, 3));
    cppQs.add(new Question("Which operator cannot be overloaded in C++?",
            new String[]{"++", "::", "()", "+"}, 1));
    cppQs.add(new Question("Which feature of OOP indicates code reusability?",
            new String[]{"Encapsulation", "Polymorphism", "Inheritance", "Abstraction"}, 2));
    cppQs.add(new Question("Which keyword is used to define a constant in C++?",
            new String[]{"const", "static", "#define", "final"}, 0));
    cppQs.add(new Question("Which of the following is used for dynamic memory allocation in C++?",
            new String[]{"malloc", "calloc", "new", "alloc"}, 2));
    cppQs.add(new Question("Which concept allows using the same function name with different arguments?",
            new String[]{"Encapsulation", "Polymorphism", "Overloading", "Abstraction"}, 2));
    cppQs.add(new Question("Which of the following is true about virtual functions?",
            new String[]{"They must be defined as static", "They support runtime polymorphism",
                    "They cannot be overridden", "They are always inline"}, 1));
    cppQs.add(new Question("Which header file is required for using std::vector?",
            new String[]{"<array>", "<list>", "<vector>", "<queue>"}, 2));
    cppQs.add(new Question("Which type of inheritance is not supported in Java but supported in C++?",
            new String[]{"Multiple", "Multilevel", "Hierarchical", "Hybrid"}, 0));
    cppQs.add(new Question("What does STL stand for in C++?",
            new String[]{"Standard Template Library", "System Type Library", "Standard Testing Library", "Software Template Library"}, 0));
    cppQs.add(new Question("Which symbol is used for the scope resolution operator?",
            new String[]{"::", "->", ".", ":"}, 0));
    cppQs.add(new Question("Which function is called automatically when an object is destroyed?",
            new String[]{"Constructor", "Destructor", "Virtual Function", "Operator Overload"}, 1));
    cppQs.add(new Question("What is the return type of sizeof operator in C++?",
            new String[]{"float", "int", "unsigned int", "long"}, 2));
    cppQs.add(new Question("Which keyword is used to declare an abstract class in C++?",
            new String[]{"virtual", "abstract", "interface", "pure"}, 0));
    cppQs.add(new Question("Which of the following is not a valid C++ loop?",
            new String[]{"for", "foreach", "while", "do-while"}, 1));
    cppQs.add(new Question("Which operator is used to access a pointer to a class member?",
            new String[]{"*", "->", ".", "::"}, 1));
    cppQs.add(new Question("Which data type is best suited for storing a Unicode character?",
            new String[]{"char", "wchar_t", "string", "bool"}, 1));
    cppQs.add(new Question("What will happen if a base class destructor is not virtual in C++?",
            new String[]{"Nothing happens", "Derived class destructor won’t be called",
                    "Compiler error", "Program crash"}, 1));
    cppQs.add(new Question("Which of the following is used to handle exceptions in C++?",
            new String[]{"throw-catch", "try-catch", "error handling", "exception block"}, 1));
    cppQs.add(new Question("Which of the following is true about references in C++?",
            new String[]{"They can be NULL", "They must be initialized when declared",
                    "They can be reseated to another object", "They are same as pointers"}, 1));
   }



   // --- Preloaded Core Questions (OS + DBMS) ---
private void loadCoreQuestions() {
    List<Question> coreQs = topics.get("core");

    // OS
    coreQs.add(new Question("Which scheduling algorithm may cause starvation?",
            new String[]{"Round Robin", "FCFS", "SJF", "Priority"}, 2));
    coreQs.add(new Question("Which of the following is not a valid page replacement algorithm?",
            new String[]{"FIFO", "LRU", "Optimal", "Round Robin"}, 3));
    coreQs.add(new Question("Which system call is used to create a new process in Unix?",
            new String[]{"exec()", "fork()", "create()", "spawn()"}, 1));
    coreQs.add(new Question("Thrashing occurs when:",
            new String[]{"Page fault rate is low", "Page fault rate is high",
                    "CPU utilization is high", "Memory is large"}, 1));
    coreQs.add(new Question("Which of the following is not a type of OS?",
            new String[]{"Batch", "Real-time", "Network", "Compiler"}, 3));
    coreQs.add(new Question("Critical section is:",
            new String[]{"Code segment where shared resources are accessed",
                    "Section where deadlock occurs", "Memory allocation segment", "Cache memory"}, 0));
    coreQs.add(new Question("Deadlock can be avoided using:",
            new String[]{"Banker’s Algorithm", "LRU", "Paging", "Round Robin"}, 0));
    coreQs.add(new Question("Which data structure is used in BFS (OS scheduling)?",
            new String[]{"Stack", "Queue", "Priority Queue", "Tree"}, 1));
    coreQs.add(new Question("In which scheduling algorithm does context switching overhead increase?",
            new String[]{"FCFS", "SJF", "Round Robin", "Priority"}, 2));
    coreQs.add(new Question("Which memory management scheme allows processes to be non-contiguous?",
            new String[]{"Segmentation", "Paging", "Contiguous allocation", "Swapping"}, 1));

    // DBMS
    coreQs.add(new Question("Which normal form removes transitive dependency?",
            new String[]{"1NF", "2NF", "3NF", "BCNF"}, 2));
    coreQs.add(new Question("Which of the following is a DDL command?",
            new String[]{"SELECT", "UPDATE", "CREATE", "DELETE"}, 2));
    coreQs.add(new Question("Which key uniquely identifies a record in a table?",
            new String[]{"Primary key", "Foreign key", "Candidate key", "Super key"}, 0));
    coreQs.add(new Question("Which of the following is not a valid SQL join?",
            new String[]{"INNER JOIN", "OUTER JOIN", "CROSS JOIN", "TOP JOIN"}, 3));
    coreQs.add(new Question("Which of the following ensures data integrity in DBMS?",
            new String[]{"Constraints", "Views", "Triggers", "Transactions"}, 0));
    coreQs.add(new Question("Which of the following is a non-volatile storage in DBMS?",
            new String[]{"Cache", "RAM", "Hard Disk", "Register"}, 2));
    coreQs.add(new Question("Which of the following is used to prevent dirty read?",
            new String[]{"2PL", "Locking", "ACID property - Isolation", "Deadlock avoidance"}, 2));
    coreQs.add(new Question("Which index type improves query speed in DBMS?",
            new String[]{"Clustered index", "Non-clustered index", "Both", "None"}, 2));
    coreQs.add(new Question("Which of the following is true about foreign key?",
            new String[]{"It can have NULL values", "It must always reference a primary key",
                    "It cannot repeat values", "It is unique"}, 1));
    coreQs.add(new Question("Which of the following is a transaction property in DBMS?",
            new String[]{"Atomicity", "Consistency", "Durability", "All of the above"}, 3));
}





}
