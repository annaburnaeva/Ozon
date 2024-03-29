package ru.itpark;

public class Main {
    public static void main(String[] args) {
        Good rubik = new Good(22507818,
                "Rubik's Головоломка Кубик Рубика 3х3",
                "https://www.ozon.ru/context/detail/id/22507818",
                1399,
                0,
                1399,
                true,
                "OZON"
        );
        Good gymnasticsForTheMind = new Good(154832894,
                "Гимнастика для ума. Система тренировки интеллекта для детей 6-7 лет. Блокнот-тренажер.",
                "https://www.ozon.ru/context/detail/id/154832894",
                1990,
                49,
                999,
                true,
                "Proffi"
        );

        Cart cart = new Cart();
        cart.add(rubik);
        cart.add(gymnasticsForTheMind);
        cart.remove(rubik);

        System.out.println(cart.getAmount());
        System.out.println(cart.getAmountWithDiscount());
        System.out.println(cart.getGoodCount());

    }
}
