package strings;

public class BinaryString {

	int binarySubstring(int a, String str)
    {
        int count=0;
        //1111
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                if(j!=i){
                    if((str.substring(i,i+1).equals(str.substring(j,j+1))) && (str.substring(i,i+1).equals("1"))){
                        count++;
                    }
                }
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BinaryString bs = new BinaryString();
         System.out.println(bs.binarySubstring(4,"1111"));
	}

}
