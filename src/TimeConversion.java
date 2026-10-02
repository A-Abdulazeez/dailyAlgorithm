public class TimeConversion{
    public String militaryTime (String time) {
        time = time.toLowerCase();

        if (time.endsWith("am" )) {
            time = time.replace("am", "");
            String[] timeToArray = time.split(":");
            int hour = Integer.parseInt(timeToArray[0]);

            if (hour == 12) hour -= 12;

            String minute = timeToArray[1];
            String second = timeToArray[2];

//            time = hour + ":" + minute + ":" + second;
            return String.format("%02d:%s:%s", hour, minute, second);

        }

        else if (time.endsWith("pm" )) {
            time = time.replace("pm", "");
            String[] timeToArray = time.split(":");
            int hour = Integer.parseInt(timeToArray[0]);

            if (hour != 12) hour += 12;

            String minute = timeToArray[1];
            String second = timeToArray[2];

            time = hour + ":" + minute + ":" + second;
        }

        return time;
    }

    static void main() {
        TimeConversion timeConversion = new TimeConversion();
        IO.println(timeConversion.militaryTime("12:05:45am"));
    }

}
