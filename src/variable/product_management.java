package variable;

import java.util.Scanner;

public class product_management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] product_names = new String[10];
        int[] product_price = new int[10];
        int product_count = 0;

        while (true) {
            System.out.println("메뉴를 선택하세요. 1번 : 상품 등록, 2번 : 상품 목록, 3번 : 종료");
            int menu = scanner.nextInt();

            if (menu == 1) {
                if (product_count > 10) {
                    System.out.println("등록할 수 있는 상품의 갯수를 초과하였습니다.");
                } else {
                    System.out.print("상품 이름을 입력하여주세요.");
                    product_names[product_count] = scanner.next();

                    System.out.print("등록할 상품 가격을 적어주세요.");
                    product_price[product_count] = scanner.nextInt();

                    ++product_count;
                }

            } else if (menu == 2) {
                if (product_count == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                } else {
                    System.out.println("상품 목록을 출력합니다.");
                    for (int i = 0; i < product_count; i++) {
                        System.out.println(i + "번 상품 이름 : " + product_names[i]);
                        System.out.println(i + "번 상품 가격 : " + product_price[i]);
                    }
                }
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}

// 메뉴 페이지 -> 1번 상품 등록, 2번 상품 목록, 3번 종료
// 1번 상품 등록 버튼 클릭 시 상품 이름과 가격을 배열에 저장
// 2번 상품 목록 버튼 클릭 시 배열에 저장된 목록을 출력
// 3번 종료를 클릭 시 프로그램 종료
// 상품은 최대 10개까지 등록가능
