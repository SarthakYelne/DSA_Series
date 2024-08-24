package Array_String_QS;

// URLify: Write a  method  to replace all  spaces in a  string with'%20'You  may assume that the string 
// has  sufficient  space  at  the  end  to  hold  the  additional  characters,  and  that  you  are  given  the  "true" 
// length  of the  string,  (Note:  if implementing  in  Java,  please  use  a  character  array  so  that  you  can  
// perform  this operation  in  place.)  
// EXAMPLE 
// Input: " M r  J o h n  S m i t h    "
// Output: " M r % 2 0 J o h n % 2 0 S m i t h 

public class QS_3 {

public static void replaceSpaces(char[] str, int trueLength) {
    int index = 0;
    int i, spacecount = 0;

    for (i = 0; i < trueLength; i++) {
        if (str[i] == ' ') {
            spacecount++;
        }
    }

    index = trueLength + spacecount * 2;
    if(trueLength < str.length){
        str[trueLength] = '\0';
    }

    for (i = trueLength-1; i >= 0; i--) {
        if (str[i] == ' ' ) {
            str[index-1] = '0';
            str[index-2] = '2';
            str[index-3] = '%';
            index = index - 3;
        }
        else {
            str[index-1] = str[i];
            index--; 
        }
    }
}

public static void main(String[] args) {

    String input = "Mr John Smith    ";
    int trueLength = 13;

    char[] str = input.toCharArray();

    replaceSpaces(str, trueLength);

    System.out.println("\"" + new String(str) + "\"");
}

}
