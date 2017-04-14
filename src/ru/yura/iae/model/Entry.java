/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.yura.iae.model;

import java.time.LocalDate;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author yuyurch001
 */
public class Entry {
    private final IntegerProperty cash;
    private final StringProperty category;
    private final StringProperty summary;
    private final ObjectProperty<LocalDate> date;
    private final BooleanProperty isExpense;
    
    


    /**
     * Конструктор по умолчанию.
     * @param cash - сумма денег.
     * @param category - категория.
     * @param date - дата.
     * @param state - признак расходов.
     * @param summary - описание.
     */
    
    public Entry(int cash, String category, String summary, LocalDate date,
            boolean state) {
        this.cash = new SimpleIntegerProperty(cash);
        this.category = new SimpleStringProperty(category);
        this.summary = new SimpleStringProperty(summary);
        this.date = new SimpleObjectProperty<> (date);
        this.isExpense=new SimpleBooleanProperty(state);
    }


}
