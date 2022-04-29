package com.utilitylib.model;

public class TextDTO {

    private String text;
    private float tx;
    private float ty;
    private int fontSize;

    public TextDTO(){}

    public TextDTO(String text, float tx, float ty, int fontSize) {
        this.text = text;
        this.tx = tx;
        this.ty = ty;
        this.fontSize = fontSize;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public float getTx() {
        return tx;
    }

    public void setTx(float tx) {
        this.tx = tx;
    }

    public float getTy() {
        return ty;
    }

    public void setTy(float ty) {
        this.ty = ty;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
