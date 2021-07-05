public class Array {
    public static void main(String[] args) {
        //배열 생성

        int[] intArray = new int[5]; //크기 5인 빈 배열
        int[] intArray2 = {10,20,30,40,50}; //리터럴로 생성

        //배열 사용

        intArray[0] = 1; //배열 사용
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

        //System.out.println(intArray[3]);
        for(int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        //for-each : 배열 순회하는 데 사용
        for(int i:intArray){
            System.out.println(i);
        }

        //엘리어싱

        intArray2 = intArray; //두 변수는 같은 주소를 가리키게 됨, 둘이 같은 배열
        intArray[0] = 100;
        System.out.println(intArray2[0]); //100 출력됨
        //두 변수가 같은 주소를 가리키는 게 아니라 값만 복사하고 싶을 때는
        intArray2 = intArray.clone(); //clone 이라는 메소드 사용, 둘은 다른 배열


    }
}
