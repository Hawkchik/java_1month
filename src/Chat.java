import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        System.out.println("Привет, я чат бот, как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("Привет " + a + "!" + "Пройдем тест на знание киноиндустрии?");
        String b = scanner.nextLine();
        if (b.toUpperCase().equals("НЕТ")) {
            System.out.println("Пока!!!");
        }
        int romantic = 0;
        int scary = 0;
        int comedy = 0;
        int action = 0;
        int fantastic = 0;

        Questions questions = new Questions();
        Answers answers = new Answers();
        System.out.println(questions.romantic1); //1 вопрос
        String c = scanner.nextLine();
        Check_answers one = new Check_answers();
        romantic=one.Romantic1(c);



        System.out.println(questions.scary1); //2 вопрос
        String d = scanner.nextLine();
        scary=one.Scary1(d);

        System.out.println(questions.comedy1);//3 вопрос
        String e = scanner.nextLine();
        comedy=one.Comedy1(e);

        System.out.println(questions.comedy2);//4 вопрос
        String f = scanner.nextLine();
        comedy=one.Comedy2(f);

        System.out.println(questions.romantic2);//5 вопрос
        String g = scanner.nextLine();
        romantic=one.Romantic2(g);

        System.out.println(questions.scary2);//6 вопрос
        String h = scanner.nextLine();
        scary=one.Scary2(h);

        System.out.println(questions.action1);//7 вопрос
        String i = scanner.nextLine();
        action=one.Action1(i);

        System.out.println(questions.fantastic1);//8 вопрос
        String j = scanner.nextLine();
        fantastic=one.Fantastic1(j);

        System.out.println(questions.comedy3);//9 вопрос
        String k = scanner.nextLine();
        comedy=one.Comedy3(k);

        System.out.println(questions.scary3);//10 вопрос
        String l = scanner.nextLine();
        scary=one.Scary3(l);

        System.out.println(questions.fantastic2);//11 вопрос
        String m = scanner.nextLine();
        fantastic=one.Fantastic2(m);

            System.out.println(questions.romantic3);//12 вопрос
        String n = scanner.nextLine();
        romantic=one.Romantic3(n);
            System.out.println(questions.action2);//13 вопрос
            String o = scanner.nextLine();
        action=one.Action2(o);
            System.out.println(questions.fantastic3);//14 вопрос
            String p = scanner.nextLine();

        fantastic=one.Fanstastic3(p);

            System.out.println(questions.action3);//15 вопрос
            String q = scanner.nextLine();
        action=one.Action3(q);

            int result = action + fantastic + romantic + scary + comedy;
            System.out.println(result);

            if (result <= 10) {

                System.out.println("Пора посмотреть все фильмы, плохо совсем плохо");
            } else if (result <= 28) {
                System.out.println("Ты киноман, но не слишком уверенный, пора спать. ))");
            } else if (result <= 30) {
                System.out.println("Ты мега гуру в кино будь счастлив!!! Пора заняться программированием");
            } else {
                System.out.println("Что то пошло не так при подсчёте программы");

            }
        }


    }

