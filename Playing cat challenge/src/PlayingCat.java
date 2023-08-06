public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer==true){
            if (temperature>=25 && temperature<=45) {
                return true;
            } else {
                return false;
            }
        } else if(summer==false) {
            if (temperature<=35 && temperature>=25) {
                return true;
            }
        } return false;
    }
}
