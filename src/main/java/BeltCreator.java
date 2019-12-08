public final class BeltCreator {

    public static Belt createBelt(String inputStr) throws Exception {
        int flipperSize = 0;
        String[] splitArr = inputStr.split(" ");
        if(inputStr.matches(".*\\d+.*")){
            flipperSize = Integer.parseInt(splitArr[1]);
        } else {
            throw new Exception("Input format error");
        }

        char[] pancakeArray = splitArr[0].toCharArray();
        return new Belt(pancakeArray, flipperSize);
    }
}
