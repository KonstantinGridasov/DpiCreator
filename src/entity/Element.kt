package entity

enum class Element(var gender: String, var id: Int, var nameCategory: String, var nameEn: String) {
    MAN_1("male", 51, "Брюки и Штаны", "Pants"),
    MAN_2("male", 52, "Верхняя одежда", "Coats"),
    MAN_3("male", 55, "Джинсы", "Jeans"),
    MAN_4("male", 59, "Майки и футболки", "T-shirts"),
    MAN_5("male", 64, "Рубашки", "Shirts"),
    MAN_6("male", 66, "Толстовки", "Sweatshirts"),
    WOMAN_1("female", 15, "Брюки и Штаны", "Pants"),
    WOMAN_2("female", 16, "Верхняя одежда", "Coats"),
    WOMAN_3("female", 19, "Джинсы", "Jeans"),
    WOMAN_4("female", 22, "Майки и футболки", "T-shirts"),
    WOMAN_5("female", 26, "Платья", "Dresses"),
    WOMAN_6("female", 28, "Рубашки", "Shirts"),
    WOMAN_7("female", 31, "Толстовки", "Sweatshirts"),
    WOMAN_8("female", 34, "Юбки", "Skirts")
}