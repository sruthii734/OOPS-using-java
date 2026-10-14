import java.util.scanner;  
public class genericdemo {
public static <e extends comparable<e> > e max(e[] list) {
e max = list[0]; 
for(int i = 1; i < list.length; i++) {
if(list[i].compareto(max) > 0 ) {
max = list[i];
}
}
return max;
}
public static <e extends comparable<e> > e min(e[] list) {
e min  = list[0]; 
for(int i = 1; i < list.length; i++) {
if(list[i].compareto(min) < 0 ) {
min = list[i];
}
}
return min;
}
public static void main(string arg[]){
integer []a={1,5,3,15};
double []b={.5,67.8,3.8,0.01};
genericdemo g=new genericdemo();
System.out.println(“find the max number in integer list is:”+g.max(a));
System.out.println(“find the max number in double list is:”+g.max(b));
System.out.println(“find the min number in integer list is:”+g.min(a));
System.out.println(“find the min number in double list is:”+g.min(b));
}
}


