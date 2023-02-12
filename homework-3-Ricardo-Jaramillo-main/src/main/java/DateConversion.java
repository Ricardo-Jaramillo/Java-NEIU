public class DateConversion {

    private String date;

    public DateConversion(String date){

        this.date = date;
    }

    public String getDate(){

        return this.date;
    }

    public String reformatDate(){

        String[] date = this.getDate().split(" ");

        return date[2] + "-" + date[1] + "-" + date[0].replaceAll("[a-z]", "");
    }
}
