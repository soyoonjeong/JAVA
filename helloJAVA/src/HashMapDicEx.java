import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//예제 7-5
public class HashMapDicEx {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("baby","아기");
        dic.put("love","사랑");
        dic.put("apple","사과");

        //dic 해시맵에 들어있는 모든 (key,value) 쌍 출력
        Set<String> keys = dic.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = dic.get(key);
            System.out.println(key+value);
        }

        //영어 단어를 입력받고 한글 단어 검색
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i<3; i++){
            System.out.print("찾고 싶은 단어는?");
            String eng = scanner.next();
            String kor = dic.get(eng);
            System.out.println(kor);
        }
    }
}
