public class BinaryTreeMain06 {
    public static void main(String[] args) {
        BinaryTree06 bst = new BinaryTree06();
        
        bst.add(new Mahasiswa06("24416021", "Ali", "A", 3.57));
        bst.add(new Mahasiswa06("24416022", "Badar", "B", 3.85));
        bst.add(new Mahasiswa06("24416185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa06("24416220", "Dewi", "B", 3.54));
        
        bst.addRekursif(new Mahasiswa06("24416131", "Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa06("24416205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa06("24416170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa (in-order traversal):");
        bst.traverseInOrder(bst.root);
        
        System.out.println("\nMencari IPK tertinggi dan terendah:");
        bst.cariMinIPK();
        bst.cariMaxIPK();
        
        System.out.println("\nDaftar mahasiswa dengan IPK di atas 3.5:");
        bst.tampilMahasiswaIPKdiAtas(3.5);
        
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);
    }
}