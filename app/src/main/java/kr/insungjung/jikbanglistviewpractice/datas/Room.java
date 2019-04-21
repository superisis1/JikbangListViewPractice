package kr.insungjung.jikbanglistviewpractice.datas;

public class Room {

    public int deposit;
    public int monthpay;
    public int floor;
    public String agency;
    public String address;
    public String roomType;
    public String description;

    public Room(int deposit, int monthpay, int floor, String anency, String address, String roomType, String description) {
        this.deposit = deposit;
        this.monthpay = monthpay;
        this.floor = floor;
        this.agency = agency;
        this.address = address;
        this.roomType = roomType;
        this.description = description;
    }
}
