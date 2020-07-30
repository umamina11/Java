

package trials;

import java.util.*;

public class switchcase {
    public static void main(String args[])
    {
        String s;
        char ch,c;
        int digit=0,special=0,letter=0,l;
        Scanner st=new Scanner(System.in);
        System.out.println("entre a string");
        s=st.nextLine();
       
        l=s.length();
        for(int i=0;i<l;i++)
        {
            c=s.charAt(i);
            switch(c)
            {
                case '0':
                case '1':          
                case '2': 
                case '3':
                case '4':
                case '5': 
                case '6':
                case '7':
                case '8':
                case '9':
                       digit++;
                       break;
                       
                   case '~':
                   case '`':
                   case '!':
                   case '@':
                   case '#':
                   case '$':
                   case '%':
                   case '^':
                   case '&':
                   case '*':
                   case '(':
                   case ')':
                   case '-':
                   case '_':
                   case '=':
                   case '+': 
                   case '<':
                   case ',':                                          
                   case '>':  
                   case '?':               
                   case '.': 
                   case ';':           
                   case '"':
                   case '[':
                   case '/':
                   case ':':
                   case '{':
                   case '}':
                   case ']':
                     
                       special++;
                       break;
                       
                   default:
                       letter++;
                       break;
            } 
    
        }
        System.out.println("letters are:"+letter);
        System.out.println("digits are:"+digit);
        System.out.println("special characters  are:"+special);
        
        
        
        
    }
    
}
