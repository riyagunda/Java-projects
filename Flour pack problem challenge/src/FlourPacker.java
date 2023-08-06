public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        int t = 5 * bigCount;
        int s = smallCount;
        if(s==0){
            if(t != goal){
                return false;
            } else {
                return true;
            }
        }
        if (t > goal){
            for (int i = 0; t > goal; i++){
                t-=5;
            }
        }
        if(t+s>=goal){
            return true;
        } else if((goal-t) <= s){
            return true;
        } else {
            return false;
        }
    }
}

// The events:
// - When