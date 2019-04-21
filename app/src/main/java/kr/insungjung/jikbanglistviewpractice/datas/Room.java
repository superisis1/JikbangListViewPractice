package kr.insungjung.jikbanglistviewpractice.datas;

import java.io.Serializable;

public class Room implements Serializable {

    public int deposit;
    public int monthPay;
    public int floor;
    public String agency;
    public String address;
    public String roomType;
    public String description;

    public String date;
    public String itemChecked;
    public String paymentType;

    public int itemNum;


    public Room(int deposit, int monthPay, int floor, String agency, String address, String roomType,
                String description, String date, String itemChecked, String paymentType, int itemNum) {
        this.deposit = deposit;
        this.monthPay = monthPay;
        this.floor = floor;
        this.agency = agency;
        this.address = address;
        this.roomType = roomType;
        this.description = description;

        this.date = date;
        this.itemChecked = itemChecked;
        this.paymentType = paymentType;

        this.itemNum = itemNum;
    }
}
