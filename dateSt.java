import java.util.Date;

class dateSt{
    public static void main(String[] args){
        String topic, course;
        Date today;
        today = new Date();
        today.toString();
        topic = "Englishlanguage";
        course = "Yoruba";
        System.out.println(topic.substring(3, 7));
        System.out.println(topic + " " + course);
        System.out.println(topic.length());
        System.out.println(course.length());
        System.out.println(topic.indexOf("lish"));
        

    }
}