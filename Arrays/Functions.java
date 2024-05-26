public class Functions {
    // you can use funtion in java for the update the value
    // or di=oing stuff just check the index
    // in this we go for update one value

        // functions for the change the marks;
        public static void update(int Marks[]){
            for (int i = 0; i < Marks.length; i++) {
                Marks[i] = Marks[i] + 1;
            }
        }

         // MAIN FUNCTION
    public static void main(String[] args) {
        int Marks[] = {100,200,300};
        System.out.println(Marks);
        update(Marks);

        for (int i = 0; i < Marks.length; i++) {
            System.out.println(Marks[i]);
        }
        System.out.println();
    }
}
