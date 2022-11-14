package com.zwei.memory.OOP.interf;

public interface Sleepable {
    // все методы абстрактные      - должны быть реализованы у потомков
    // можно имплементировать много за раз
    // непрямая связь - качества или способности присущие объектам
    // интерфейс может наследовать другой интерфейс
    // по умолчанию все методы     - public abstract
    // по умолчанию все переменные - public final static

    //    public abstract sleep();
    //    public final static int X = 5;

    int X = 5;

    void sleep();

}
