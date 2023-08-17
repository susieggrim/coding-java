public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(2, 10, 18));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean canPack = false;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if ((goal < 5) && (smallCount >= goal)) {
            canPack = true;
        } else {
            int bigFlourBags = goal/5;
            if ((bigCount >= bigFlourBags) && ((bigFlourBags * 5) + smallCount >= goal)){
                canPack = true;
            } else if ((bigCount < bigFlourBags) && ((bigCount * 5) + smallCount >= goal)) {
                canPack = true;
            }
            else if (smallCount >= goal) {
                canPack = true;
            }
        }
        return canPack;
    }

}
