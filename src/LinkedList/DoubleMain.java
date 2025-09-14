package LinkedList;

import java.util.NoSuchElementException;

public class DoubleMain {
    private static void ok(boolean cond, String msg) {
        System.out.println((cond ? "[OK] " : "[X] ") + msg);
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        System.out.println("=== 1) 빈 리스트 예외 테스트 ===");
        try {
            list.removeFirst();
            System.out.println("[X] removeFirst()가 예외를 던져야 하는데 통과함");
        } catch (NoSuchElementException e) {
            System.out.println("[OK] removeFirst() 빈 리스트에서 예외 발생");
        }
        try {
            list.removeLast();
            System.out.println("[X] removeLast()가 예외를 던져야 하는데 통과함");
        } catch (NoSuchElementException e) {
            System.out.println("[OK] removeLast() 빈 리스트에서 예외 발생");
        }
        ok(list.isEmpty(), "초기 상태에서 isEmpty() == true");
        ok(list.getSize() == 0, "초기 size == 0");

        System.out.println("\n=== 2) addFirst / addLast 기본 동작 ===");
        list.addFirst(10);  // [10]
        ok(!list.isEmpty(), "첫 삽입 후 isEmpty() == false");
        ok(list.getSize() == 1, "size == 1");
        ok(list.getFirst() == 10, "getFirst() == 10");
        ok(list.getLast() == 10, "getLast() == 10 (head==tail)");

        list.addLast(20);   // [10, 20]
        ok(list.getSize() == 2, "size == 2");
        ok(list.getFirst() == 10, "getFirst() == 10");
        ok(list.getLast() == 20, "getLast() == 20");

        list.addFirst(5);   // [5, 10, 20]
        ok(list.getSize() == 3, "size == 3 (앞 삽입)");
        ok(list.getFirst() == 5, "getFirst() == 5");
        ok(list.getLast() == 20, "getLast() == 20");

        list.addLast(30);   // [5, 10, 20, 30]
        ok(list.getSize() == 4, "size == 4 (뒤 삽입)");
        ok(list.getFirst() == 5, "getFirst() == 5");
        ok(list.getLast() == 30, "getLast() == 30");

        System.out.println("현재 리스트 (print):");
        list.print(); // 값이 아닌 노드 참조가 보이면 print() 수정 참고

        System.out.println("\n=== 3) removeFirst / removeLast 동작 ===");
        int r1 = list.removeFirst();   // remove 5 -> [10, 20, 30]
        ok(r1 == 5, "removeFirst() == 5");
        ok(list.getFirst() == 10, "이후 getFirst() == 10");
        ok(list.getLast() == 30, "이후 getLast() == 30");
        ok(list.getSize() == 3, "size == 3");

        int r2 = list.removeLast();    // remove 30 -> [10, 20]
        ok(r2 == 30, "removeLast() == 30");
        ok(list.getFirst() == 10, "이후 getFirst() == 10");
        ok(list.getLast() == 20, "이후 getLast() == 20");
        ok(list.getSize() == 2, "size == 2");

        System.out.println("현재 리스트 (print):");
        list.print();

        System.out.println("\n=== 4) 단일 노드 엣지케이스 ===");
        int r3 = list.removeLast();    // remove 20 -> [10]
        ok(r3 == 20, "removeLast() == 20");
        ok(list.getFirst() == 10 && list.getLast() == 10, "단일 노드에서 head==tail==10");
        ok(list.getSize() == 1, "size == 1");

        int r4 = list.removeFirst();   // remove 10 -> []
        ok(r4 == 10, "removeFirst() == 10");
        ok(list.isEmpty(), "모든 원소 제거 후 isEmpty()");
        ok(list.getSize() == 0, "size == 0");

        System.out.println("\n=== 5) 문자열 타입으로도 간단 테스트 ===");
        DoubleLinkedList<String> sList = new DoubleLinkedList<>();
        sList.addLast("A");
        sList.addFirst("Z");
        sList.addLast("B");  // [Z, A, B]
        ok("Z".equals(sList.getFirst()), "문자열 getFirst() == Z");
        ok("B".equals(sList.getLast()),  "문자열 getLast() == B");
        sList.print();
    }
}
