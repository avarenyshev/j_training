public class SentensGenerator {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрышь", "фронтэнд", "на основе вэб технологий", "проникающий", "умный", "шесть сиги", "метод критического пути", "динамичный"};
        String[] wordlistTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", "общий", "совместный", "ускоренный"};
        String[] wordlistThree = {"процесс", "пункт разгрузки", "выход из положения", "пип структуры", "талант", "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};

        int oneLenght = wordListOne.length;
        int twoLenght = wordlistTwo.length;
        int threeLenght = wordlistThree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String phrase = wordListOne[rand1] + " " +
                wordlistTwo[rand2] + " " + wordlistThree[rand3];

        System.out.println("Все, что нам нужно, - это " + phrase);
    }
}
