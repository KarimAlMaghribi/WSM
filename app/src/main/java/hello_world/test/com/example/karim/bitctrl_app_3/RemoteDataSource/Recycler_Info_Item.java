package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource;

public class Recycler_Info_Item {

    private String date;
    private int number;
    private int photo;

    public Recycler_Info_Item(String date, int number, int photo){
        // DATE NICHT STRING

        this.date = date;
        this.number = number;
        this.photo = photo;

    }


    public int getPhoto() {
        return photo;
    }



    public String getDate() {

        return date;
    }

    public int getNumber() {
        return number;
    }

    // setter


    public void setDate(String date) {
        this.date = date;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}



