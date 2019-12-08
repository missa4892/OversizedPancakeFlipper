public class Flipper {

    public static int flip(Belt belt) {
        char[] pancakeArr = belt.getPancakes();
        int flipperSize = belt.getFlipperSize();

        int count = 0;
        for(int i = 0; i <= pancakeArr.length - flipperSize; i++){
            if(pancakeArr[i] == '-'){
                count++;
                for(int j = 0; j < flipperSize; j++){
                    pancakeArr[i + j] = pancakeArr[i + j] == '+' ? '-' : '+';
                }
            }
        }

        for(int i = 0; i < pancakeArr.length; i++) {
            if (pancakeArr[i] == '-') {
                return -1;
            }
        }

        return count;
    }
}
