package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("----------------");

        // 추가
        list.addFirst("서장훈");
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("----------------");

        list.addLast("김희철");
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("----------------");

        list.add(1, "김영철");
        System.out.println(list.get(1));

        System.out.println("----------------");

        // 삭제
        System.out.println("삭제 전: " + list.size());
        list.remove(list.size() - 1);
        System.out.println("삭제 후: " + list.size());

        System.out.println("----------------");

        // 처음 학생, 마지막 학생 삭제
        System.out.println("전학 전: " + list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println("전학 후: " + list.size());
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("----------------");

        // 변경
        list.set(0, "이수근");
        System.out.println(list.get(0));

        System.out.println("----------------");

        // 확인
        System.out.println(list.indexOf("김종국"));
        if (list.contains("김종국")) {
            System.out.println("신청 성공");
        } else {
            System.out.println("신청 실패");
        }

        System.out.println("----------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수: " + list.size());
        }

        System.out.println("----------------");

        // 새 학기 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");
        list.add("강호동");
        list.add("강호동"); // 리스트는 중복 허용

        // 정렬
        Collections.sort(list);

        for (String s: list) {
            System.out.println(s);
        }
    }
}
