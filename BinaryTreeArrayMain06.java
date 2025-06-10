public class BinaryTreeArrayMain06 {
    public static void main(String[] args) {
        BinaryTreeArray06 bta = new BinaryTreeArray06();
        
        bta.add(new Mahasiswa06("24416121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa06("24416185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa06("24416221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa06("24416220", "Dewi", "B", 3.35));
        bta.add(new Mahasiswa06("24416131", "Devi", "A", 3.48));
        bta.add(new Mahasiswa06("24416205", "Ehsan", "D", 3.61));
        bta.add(new Mahasiswa06("24416170", "Fizi", "B", 3.86));
        
        System.out.println("\nInOrder Traversal:");
        bta.traverseInOrder(0);
        
        System.out.println("\nPreOrder Traversal:");
        bta.traversePreOrder(0);
    }
}