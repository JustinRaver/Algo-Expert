package Easy.TournamentWinner;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    /*
     * there's an algorithm's tournament taking place in which teams of programmers compete against
     * each other to solve algorithmic problems as fast as possible. Teams compete in a round
     * robin, where each team faces off against all other teams. Only two teams compete against
     * each other at a time, and for each competition, one team is designated the home team while
     * the other team is the away team. In each competition there's always one winner and one loser
     * there are no ties. A team receives 3 points if it wins and 0 points if it loses. The winner
     * of the tournament is the team that receives the most amount of points.
     *
     * Given an array og pairs representing the teams that have competed against each other and an
     * array containing the results of each competition, write a function that returns the winner
     * of the tournament. The input arrays are named competitions and results, respectively. The
     * competitions array has elements in the form of [homeTeam, awayTeam], where each team is a
     * string of at most 30 characters representing the name of the team. The results array contains
     * information about the winner of each corresponding competitions array. Specifically, results[i]
     * denotes the winner of competitions[i], where a 1 in the results array means that the home team
     * in the corresponding competition won and 0 means that away team won.
     *
     * sample competitions = [["HTML", "C#"],["C#", "Python"], ["Python, "HTML"]]
     *        results = [0, 0, 1]
     */
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // [homeTeam, awayTeam]
        // 3 for win 0 for loses
        // 1 hometeam 0 awayteam
        HashMap<String,Integer> map = new HashMap<>();

        int maxScore = 0;
        String winnerName = "";

        for(int i=0;i<competitions.size();i++){
            int winner = results.get(i) == 0 ? 1:0;

            int score = 0;
            String roundWinner = competitions.get(i).get(winner);

            if(map.containsKey(roundWinner)){
                score = map.get(roundWinner)+3;
            }else{
                score = 3;
            }
            map.put(roundWinner,score);

            if(score > maxScore) {
                maxScore = score;
                winnerName = roundWinner;
            }

        }
        return winnerName;
    }
}
