package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (데이터 관리하는 클래스 모음)
        // List(Array List, Linked List), Set, Map

        // array는 크기가 정해져 있어 더 많은 데이터를 넣기 위해서는 새 배열을 만들고 값을 다시 넣는 방식으로 작업해야 함
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        // Array List
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (index 기준)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-----------------");

        // 삭제
        System.out.println("신청 학생 수: " + list.size());
        list.remove("박명수");
        System.out.println("신청 학생 수: " + list.size());

        System.out.println("-----------------");

        System.out.println(list.get(3));

        System.out.println("-----------------");

        System.out.println("남은 학생 수 (제외 전): " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후): " + list.size());

        System.out.println("-----------------");

        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("-----------------");

        // 변경
        System.out.println("양도 전: " + list.get(0));
        list.set(0, "이수근");
        System.out.println("양도 후: " + list.get(0));

        System.out.println("-----------------");

        // 확인
        System.out.println(list.indexOf("김종국"));
        if (list.contains("김종국")) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수: " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("-----------------");

        // 새 학기 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 정렬
        Collections.sort(list);

        for (String s: list) {
            System.out.println(s);
        }
    }
}
