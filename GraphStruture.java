package demo;
class ZooZone {
    String name;
    ZooZone left;
    ZooZone right;
    public ZooZone(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }
}
public class GraphStruture {
    public static void main(String[] args) {
        ZooZone entrance = new ZooZone("Entrance");
        ZooZone reptileHouse = new ZooZone("Reptile House");
        ZooZone birdSanctuary = new ZooZone("Bird Sanctuary");
        ZooZone mammalZone = new ZooZone("Mammal Zone");
        ZooZone snakePit = new ZooZone("Snake Pit");
        ZooZone parrotPavilion = new ZooZone("Parrot Pavilion");
        ZooZone lion = new ZooZone("Lion");
        ZooZone elephantEnclosure = new ZooZone("Elephant Enclosure");
        entrance.left = reptileHouse;
        entrance.right = birdSanctuary;
        reptileHouse.left = snakePit;
        birdSanctuary.left = parrotPavilion;
        entrance.right.right = mammalZone;
        mammalZone.left = lion;
        mammalZone.right = elephantEnclosure;
        printConnections(entrance);
    }

    public static void printConnections(ZooZone node) {
        if (node == null) return;
        System.out.println(node.name + " connects to: " +
                (node.left != null ? node.left.name : "None") + ", " +
                (node.right != null ? node.right.name : "None"));
        printConnections(node.left);
        printConnections(node.right);
    }
}