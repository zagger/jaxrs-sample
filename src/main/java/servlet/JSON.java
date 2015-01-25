
package servlet;

import javax.xml.bind.annotation.XmlRootElement;
//import lombok.Data;

@XmlRootElement
public class JSON {
	public JSON() {
		this.great = 0;
		this.good = 0;
		this.valid = true;
		this.isSame = false;
		this.message = "";
	}

	public void setValidTrue() {
		this.valid = true;
	}

	public void setValidFalse() {
		this.valid = false;
	}

	public void setSameTrue() {
		this.isSame = true;
	}

	public void setSamefalse() {
		this.isSame = false;
	}

	public void toggle() {
		this.isSame = !this.isSame;
		this.valid = !this.valid;
	}

	public void setMessage(String mes) {
		this.message = mes;
	}

	public void setGreatGood(int i, int j) {
		this.great = i;
		this.good = j;
	}

	//敢えてpublic
	public int great;
	public int good;
	public boolean valid;
	public boolean isSame;
	public String message;
}


