package ru.spec.java1.lec6;
import java.io.File;import java.io.FileInputStream;import java.io.FileNotFoundException;import java.io.IOException;import java.io.InputStream;import java.net.MalformedURLException;import java.net.URL;import java.util.Arrays;import java.util.HashMap;import java.util.Map;import java.util.Map.Entry;import java.util.Scanner;import java.util.TreeMap;import java.util.function.Consumer;
import org.omg.Messaging.SyncScopeHelper;
public class FilesTest{ static String max = ""; public static void main(String[] args)   throws Exception {//  System.out.println("enter any string:");
  InputStream in = System.in;       File file = new File("C:/java/test.txt");  in = new FileInputStream(file);//  in = new URL("http://specialist.ru").openStream();      Scanner scanner = new Scanner(in);          TreeMap<String, Integer> stat = new TreeMap<>();    for (; scanner.hasNextLine();) {   String[] nextLine = scanner.nextLine().toLowerCase().split("[^Р°-СЏС‘]+");// Р°РІС‹ 234 С‹РІР°   //for   for (String string : nextLine) {    Integer i = stat.get(string);    if (string!=null&&!string.equals("")) {    stat.put(string, i==null?1:++i);    }   }      }        stat.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEach( (Consumer<? super Entry<String, Integer>>) (metod)->{      if (metod.getValue()>100) System.out.println(metod);});     }
// private static Consumer<? super Entry<String, Integer>> mmm() {//  return System.out::println;// }
 }
