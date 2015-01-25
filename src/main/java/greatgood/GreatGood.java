package greatgood;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import servlet.JSON;

/* 
 * Created by ito on 15/01/08.
 */

public class GreatGood {
    public GreatGood(String randNum) {
        this.randNum = new Num(randNum);
    }

		public JSON responseJSON(String num) {
			Num pNum = new Num(num);
			JSON json = new JSON();

			if(!pNum.validate()) {
				json.setMessage("数字が重複しています!!");
				json.setValidFalse();
				return json;//失敗
			}

			if(pNum.judge(randNum)) {
				json.setMessage("正解です!!");
				json.setSameTrue();
			} else {
				json.setMessage("残念違います!!");
				json.setSamefalse();
			}
			
			json.setGreatGood(countGreat(pNum), countGood(pNum));

			return json;
		}

/*
    public void start() {
			json.setMessage("残念違います!!");
            System.out.println((i+1) + "回目のチャレンジ!");
            System.out.print("3桁の数値を入力してください: ");
            if(!validate(str)) {
                System.out.println("数字が重複しています");
                i--;
                continue;
            }
            if(judge(str)) {
                System.out.println("正解です!!");
                break;
            }else {
                System.out.printf("");
                showGreatGood(str);
            }
            if(i == maxTimes-1) {
                System.out.println("答えは" + randNum + "です");
            }
        }
        return;
    }
*/

    private int countGreat(Num num) {
        int count = 0;
        for(int i=0; i<num.length(); i++ ) {
            if( num.getNumI(i) == randNum.getNumI(i) ) {
                count++;
            }
        }
        return count;
    }

    private int countGood(Num num) {
        int count = 0;
        for (int i : num.getNum()) {
            for (int j : randNum.getNum()) {
                if( i == j ) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    private static int maxTimes = 10;
    private Num randNum;
}
