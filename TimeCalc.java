public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        // hours = 10
        //minutes = 20
        //minutes to add = 30
        //new hours = 10
        //new minutes = 50
        String time = (args[0]);
        int minutesToAdd = Integer.parseInt(args[1]);
        String[] parts = time.split(":"); //הפרדה 
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        
        int totalMinutes = (hours * 60) + minutesToAdd + minutes;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        String hourString;
        String minuteString;

        if(newHours < 10 ){
            hourString = "0" + newHours;
        } else{
            hourString = "" + newHours;
        }

        if(newMinutes < 10){
            minuteString = "0" + newMinutes;
        } else{
            minuteString = "" + newMinutes;
        }
        System.out.println(hourString + ":" +minuteString);
    }
}
