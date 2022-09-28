import java.util.Arrays;

public class bt22 {
    public static void main(String[] args) {
        // Tạo mảng
        String[] arr = {"1", "2" , "3", "4", "5"};

        // In mảng ban đầu
        System.out.println("Old arr:\n"
                + Arrays.toString(arr));

        // Lấy độ dài mảng ban đầu
        int N = arr.length;

        /*Tạo một mảng mới cùng tên có độ dài N+1 và copy mảng ban đầu */
        arr = Arrays.copyOf(arr, N + 1);

        //Thêm 1 phần tử vào mảng mới
        arr[N] = "6";

        // In mảng kết quả
        System.out.println("New arr:\n"
                + Arrays.toString(arr));
    }
}
