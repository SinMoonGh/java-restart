package ProductOrderSystem;

import ProductOrderSystem.ProductOrder;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보들을 배열로 관리한다
        // 주문 정보 출력
        // 최종 결제 금액 출력
        ProductOrder[] products = new ProductOrder[3];

        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity= 2;
        products[0] = tofu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity= 1;
        products[1] = kimchi;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 3000;
        cola.quantity= 5;
        products[2] = cola;

        int sum = 0;
        for(ProductOrder product : products){
            System.out.println("상품명 : "+product.productName+ ", 가격 : "+product.price+ ", 수량 : "+product.quantity);
            sum += product.price;
        }

        System.out.println("총 결제금액 : "+ sum);
    }
}
