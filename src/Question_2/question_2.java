package Question_2; //  В строке вставить после каждого символа 'a' символ 'b'.

public class question_2 {
    public static void main(String args[]) {
        StringBuilder builder = new StringBuilder();
        builder.append("Everyone has a chance to change everything."); //возьмем произвольные предложения для замены символов
        builder.append(" Work and motivation - this leads to success.");
        String completedString = builder.toString();
        System.out.println(completedString);
        String result = completedString.replaceAll("a.", "ab"); //вставим после каждого символа 'a' символ 'b'.
        System.out.println(result);                                               //будет c удалением символа после a, если без удаления - точку убираем.
    }
}

