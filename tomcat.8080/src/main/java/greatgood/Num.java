
package greatgood;

import java.util.ArrayList;
import java.util.Arrays;

public class Num {
	public Num(String nums) {
		for(char c : nums.toCharArray()) {
			this.num.add(Character.getNumericValue(c));
		}
	}

	public boolean validate() {
		if(duplicate()) {
			return false;
		}
		return true;
	}

	public String errMes() {
		return "error";
	}

  public boolean judge(Num randNum) {
      if (Arrays.equals(this.num.toArray(), randNum.getNum().toArray())) {
          return true;
      } else {
          return false;
      }
  }


  private boolean duplicate() {
    for(int i : this.num) {
      boolean flg = true;
			for(int j : num) {
        if (i == j) {
          if (flg == false) {
              return true;
          }
          flg = false;
        }
      }
    }
    return false;
  }
	public String getStr() {
		String str="";
		for(int i : this.num) {
			 str += String.valueOf(i);
		}
		return str;	
	}

	public ArrayList<Integer> getNum() {
		return this.num;
	}

	public int getNumI(int i) {
		return this.num.get(i);
	}

	public int length() {
		return num.size();
	}

	private ArrayList<Integer> num = new ArrayList<Integer>();
}
