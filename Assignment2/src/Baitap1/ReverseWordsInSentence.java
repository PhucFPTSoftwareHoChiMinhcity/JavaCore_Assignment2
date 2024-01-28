package Baitap1;
import java.util.Scanner;
public class ReverseWordsInSentence {
    public static void main(String[] args) {
//        Viết chương trình nhận dữ liệu từ bàn phím của người dùng, sau đó in ra
//        kết quả đảo ngược thứ tự của các từ trong một câu đã cho. (Lưu ý: có thể sử dụng
//        StringBuilder); ReverseWordsInSentence: dao nguoc tu trong cau
        // nhan du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputSentence = scanner.nextLine();
        // Gọi phương thức để đảo ngược thứ tự từ trong câu
        String reversedSentence = reverseWords(inputSentence);
        // In ra kết quả
        System.out.println("Sentence after reversing the word order: " + reversedSentence);
        scanner.close();
    }
    // Phương thức đảo ngược thứ tự từ trong câu
    private static String reverseWords(String sentence) {
        // Tách câu thành mảng các từ
        String[] words = sentence.split("");

        // Tạo một StringBuilder để xây dựng câu mới
        StringBuilder reversedSentence = new StringBuilder();

        // Đảo ngược thứ tự từ và thêm vào StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
        }

        // Chuyển StringBuilder thành chuỗi và loại bỏ khoảng trắng cuối cùng
        return reversedSentence.toString().trim();
    }
}

