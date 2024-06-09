package org.example.models;

enum Enumss {
    Red("rato") , Green("haryo") , Black("kalo");
    public String value;

    Enumss (String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
