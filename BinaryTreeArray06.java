public class BinaryTreeArray06 {
    Mahasiswa06[] dataMahasiswa;
    int idxLast;
    
    public BinaryTreeArray06() {
        this.dataMahasiswa = new Mahasiswa06[10];
    }
    
    void populateData(Mahasiswa06[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            if(dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    public boolean isEmpty() {
        return dataMahasiswa[0] == null;
    }

    public void add(Mahasiswa06 data) {
        if (idxLast == dataMahasiswa.length - 1) {
            System.out.println("Binary Tree Array sudah penuh");
            return;
        }
        if (isEmpty()) {
            dataMahasiswa[0] = data;
            idxLast = 0;
        } else {
            int current = 0;
            boolean inserted = false;
            while (!inserted) {
                if (data.ipk < dataMahasiswa[current].ipk) {
                    int leftChildIdx = 2 * current + 1;
                    if (leftChildIdx > dataMahasiswa.length - 1) {
                        System.out.println("Posisi melebihi kapasitas array");
                        break;
                    }
                    if (dataMahasiswa[leftChildIdx] == null) {
                        dataMahasiswa[leftChildIdx] = data;
                        idxLast = Math.max(idxLast, leftChildIdx);
                        inserted = true;
                    } else {
                        current = leftChildIdx;
                    }
                } else {
                    int rightChildIdx = 2 * current + 2;
                    if (rightChildIdx > dataMahasiswa.length - 1) {
                        System.out.println("Posisi melebihi kapasitas array");
                        break;
                    }
                    if (dataMahasiswa[rightChildIdx] == null) {
                        dataMahasiswa[rightChildIdx] = data;
                        idxLast = Math.max(idxLast, rightChildIdx);
                        inserted = true;
                    } else {
                        current = rightChildIdx;
                    }
                }
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}