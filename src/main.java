public class main {
    public static void main(String[] args){
        //instance
        MobileLegend player1 = new MobileLegend();
        MobileLegend player2 = new MobileLegend();
        MobileLegend player3 = new MobileLegend();

        player1.Username = "Badang";
        player1.score = 10;
        player1.length = 1.5;
        player1.team = 01;
        player1.server = 1;


        player2.Username = "franco";
        player2.score = 12;
        player2.length = 1.4;
        player2.team = 02;
        player2.server = 2;

        player3.Username = "miya";
        player3.score = 11;
        player3.length = 1.3;
        player3.team = 03;
        player3.server = 3;

        player1.attackotherleaders();

        System.out.println(player1.score);
        player1.defendfromthreats(player2);
        System.out.println(player1.score);


    }

}
