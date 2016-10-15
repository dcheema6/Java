//Enhanced for loop program
public class Lesson06Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Index\tTable");
		int num = 0;
		int array[] = {1,2,5,6};
		
		for (int i: array){//This for loop runs through whole array where i always = array[num]
			num += i;      // Thus this loop cannot be used to assign values to array itself
		}
		
		System.out.println(num+"\tass");/* New syntax \t called tab give constant spaces from first
        letter of string first string to the first of the next string letter*/
	}

}
//Arrays work same way as in C++