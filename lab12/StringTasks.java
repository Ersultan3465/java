public class StringTasks {
    public static void main(String[] args) {
        String text = "Salem 123 Alem Qazaqstan";

        // Тапсырма 1: Дауысты және дауыссыз әріптер санын анықтау
        int vowels = 0, consonants = 0;
        String vowelLetters = "aeiouAEIOUаәеёиоөуүұыіAEIOUАӘЕЁИОӨУҮҰЫІ";

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelLetters.indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Дауысты: " + vowels + ", Дауыссыз: " + consonants);

        // Тапсырма 2: Барлық бос орындарды алып тастау
        String noSpaces = text.replace(" ", "");
        System.out.println("Бос орынсыз: " + noSpaces);

        // Тапсырма 3: Ең ұзын сөзді табу
        String[] words = text.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Ең ұзын сөз: " + longest);

        // Тапсырма 4: Бос орындарды есептемей таңбалар саны
        int countWithoutSpaces = text.replace(" ", "").length();
        System.out.println("Таңбалар саны (бос орынсыз): " + countWithoutSpaces);

        // Тапсырма 5: Белгілі сөзден басталуын тексеру
        boolean starts = text.startsWith("Salem");
        System.out.println("Starts with 'Salem': " + starts);

        // Тапсырма 6: Белгілі таңбамен аяқталуын тексеру
        boolean ends = text.endsWith("n");
        System.out.println("Ends with 'n': " + ends);

        // Тапсырма 7: Жолды кері айналдыру
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Кері жол: " + reversed);

        // Тапсырма 8: Барлық сандарды алып тастау
        String noDigits = text.replaceAll("\\d", "");
        System.out.println("Сандарсыз: " + noDigits);

        // Тапсырма 9: Дауысты әріптерді '*' таңбасына ауыстыру
        String replacedVowels = text.replaceAll("[aeiouAEIOUаәеёиоөуүұыіАӘЕЁИОӨУҮҰЫІ]", "*");
        System.out.println("Дауыстылар ауыстырылған: " + replacedVowels);

        // Тапсырма 10: Жол тек цифрлардан тұра ма?
        String numericText = "123456";
        boolean isOnlyDigits = numericText.matches("\\d+");
        System.out.println("Тек цифрлар ма: " + isOnlyDigits);
    }
}