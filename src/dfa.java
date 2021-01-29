public class dfa {
    int dfa = 0;

    void s(char c) {
        if (c == 'a') {
            dfa = 1;
        } else {
            dfa = 0;
        }
    }

    void stat1(char c) {
        if (c == 'b') {
            dfa = 2;
        } else {
            dfa = 1;
        }
    }

    void stat2(char c) {
        if (c == 'a') {
            dfa = 1;
        } else {
            dfa = 2;
        }
    }

    boolean acc(char str[]) {
        int len = str.length;

        for (int i = 0; i < len; i++){
            if (dfa ==0){
                s(str[i]);
            }
            else if (dfa==1){
                stat1(str[i]);
            }
            else if (dfa == 2 ){
                stat2(str[i]);
            }
            else{
                return false;
            }
        }
        if (dfa ==2){
            return true;
        }else{
            return false;
        }
    }


}
