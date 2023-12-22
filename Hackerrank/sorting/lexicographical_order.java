public class lexicographical_order
{
    static void sort(String[] fruits){
        for(int i=0;i<fruits.length-1;i++){
            int pos=i;
            for(int j=i+1;j<fruits.length;j++){
                if(fruits[j].compareTo(fruits[pos])<0){
                    pos=j;
                }
            }
            String temp=fruits[i];
            fruits[i]=fruits[pos];
            fruits[pos]=temp;
        }
    }

    public static void main(String[] args) {
        String[] fruit={"papaya","mango","banana","apple"};
        sort(fruit);
        for(String item:fruit){
            System.out.print(item+" ");
        }

    }
}
