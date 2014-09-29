/**
 * Created by likvidator on 25.09.14.
 */

//anastasiya.zayac@gmail.com до 3.10
//    deadline 8.10ne 8.10ne 8.10
// AWT and Swing

public class Oper {

    private static Read in = new Read();

    public static void main(String[] args){
        utro();
    }

    public static void utro(){
        System.out.println("Ты проснулся, у тебя есть время?");
        if (in.Read()) {
            System.out.println("Иди позавтракай");
            car();
        }
        else {
            System.out.println("Одевайся");
            car();
        }
    }
    public static void car(){
        System.out.println("Машина на ходу?");
        if (in.Read()){
            System.out.println("Прогрей машину");
            benz();
        }
        else{
            System.out.println("Едь общественным транспортом");
            delo();
        }
    }
    public static void benz() {
        System.out.println("Хватит бензина?");
        if (in.Read()){
            System.out.println("Едь на работу");
            delo();
        }
        else{
            System.out.println("Заправься, и едь на работу");
            delo();
        }
    }
    public static void delo(){
        System.out.println("Есть дело?");
        if (in.Read()){
            System.out.println("Ознакомиться с делом");
            pokaz();
        }
        else{
            System.out.println("Выпить кофе\nПерестать страдать ерундой, и найти себе дело");
            delo();
        }
    }
   public static void pokaz(){
       System.out.println("Нужны ли показания?");
       if (in.Read()){
           System.out.println("Обзвони сведетелей");
           call();
       }
       else{
           obed();
       }
   }
    public static void obed(){
        System.out.println("Пора обедать!");
        zap();
    }
    public static void call() {
        System.out.println("Есть ли у них время?");
        if (in.Read()){
            System.out.println("Выехать к ним и взять показания");
            obed();
        }
        else{
            System.out.println("Договориться, что бы они пришли, и дали показания");
            obed();
        }
    }
    public static void zap(){
        System.out.println("Есть зацепки?");
        if (in.Read()){
            System.out.println("Едь на место проишествия");
            mesto();
        }
        else{
            System.out.println("Ищи пока не найдешь!");
            zap();
        }
    }
    public static void mesto(){
        System.out.println("Есть ли люди?");
        if (in.Read()){
            System.out.println("Опросить их");
            osmotr();
        }
        else {
            osmotr();
        }
    }
    public static void osmotr(){
        System.out.println("Произвести детальный осмотр проишествия");
        podoz();
    }
    public static void podoz(){
        System.out.println("Есть ли подазреваемые?");
        if (in.Read()){
            System.out.println("Дооформить дело\nПередать дело следователю\nКонец рабочего дня");
            dom();
        }
        else{
            day();
        }
    }
    public static void day(){
        System.out.println("Конец рабего дня?");
        if (in.Read()){
            dom();
        }
        else {
            zap();
        }
    }
    public static void dom(){
        System.out.println("Едь домой\nСделай домашние дела\nИди спать");
        utro();
    }
}
