public class Tugasarray {
        public void main(String[] args) {
            String[] lala;
            int Antrian[];
            String Makanan[] = new String[5];

            int antrian[] = { 23, 67, 45, 12 };
            String[] makanan = { "Nasi", "Ayam", "Nasgor" };
            String nama[] = { "fina", "nana", "ana" };
           
            System.out.println(nama[0]);
            System.out.println(antrian[0]);
            System.out.println(makanan[2]);
           

            for (int i = 0; i < makanan.length; i++) {
                System.out.println(makanan[i]);
            }
        }
    }
