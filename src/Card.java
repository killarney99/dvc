import java.awt.Color;
import java.awt.Graphics;

public class Card {
    // Größe eines einzelnen Cards
	private int cardSize;
	private Color cardColor;
	private Color borderColor;
	private String content;
	
    
    public Card(String content) {
    	this.cardSize = 80;
    	this.cardColor = Color.gray;
    	this.borderColor = Color.black;
    	this.content = content;
    }


	public int getCardSize() {
		return cardSize;
	}


	public void setCardSize(int cardSize) {
		this.cardSize = cardSize;
	}


	public Color getCardColor() {
		return cardColor;
	}


	public void setCardColor(Color cardColor) {
		this.cardColor = cardColor;
	}


	public Color getBorderColor() {
		return borderColor;
	}


	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}

}
