package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();

        System.out.println("초기 상태: empty=" + list.isEmpty() + ", size=" + list.size() + ", " + list);

        // 앞/뒤에 원소 추가
        list.addFirst(2);  // [2]
        list.addFirst(1);  // [1,2]
        list.addLast(3);   // [1,2,3]
        list.addLast(4);   // [1,2,3,4]
        System.out.println("원소 추가 후: size=" + list.size() + ", " + list);

        // 인덱스 접근
        System.out.println("get(0) = " + list.get(0));
        System.out.println("get(1) = " + list.get(1));
        System.out.println("get(2) = " + list.get(2));
        System.out.println("get(3) = " + list.get(3));

        // 맨 앞 원소 제거
        int removed = list.removeFirst(); // 1 제거 -> [2,3,4]
        System.out.println("removeFirst() = " + removed + ", 현재 리스트: " + list);

        // clear 테스트
        list.clear();
        System.out.println("clear() 실행 후: empty=" + list.isEmpty() + ", size=" + list.size() + ", " + list);

        // 예외 동작 확인 (주석 해제해서 테스트)
        // list.get(0);        // IndexOutOfBoundsException 발생
        // list.removeFirst(); // NoSuchElementException 발생
    }
}
