package lotto.util;

import lotto.Lotto;
import lotto.Lottos;
import lotto.constant.LottoConfig.Rank;

import java.util.Map;

import static lotto.constant.IOMessage.*;

public class OutputHandler {


    public static void printCount(int count) {
        output("");
        output(String.format(COUNT_MESSAGE, count));
    }

    public static void printTicket(Lottos lottos) {
        for(Lotto lotto : lottos.getTickets()){
            output(lotto.getNumbers().toString());
        }
    }

    public static void printLottoResult(Map<Rank, Integer> results) {
        output("");
        output(HEAD_MESSAGE);
        for(Rank rank : Rank.values()){
            if(rank == Rank.NOTHING) {
                continue;
            }
            Integer count = results.getOrDefault(rank, 0);
            output(getLottoResultForm(rank, count));
        }
    }

    private static String getLottoResultForm(Rank rank, Integer count) {
        if(rank == Rank.SECOND) {
            return String.format(RESULT_MESSAGE_FORMAT, rank.getMatchedCount(), BONUS_MESSAGE, rank.getPrizeMoney(), count);
        }
        return String.format(RESULT_MESSAGE_FORMAT, rank.getMatchedCount(), "", rank.getPrizeMoney(), count);
    }

    public static void printRateOfReturn(Double rateOfReturn) {
        output(String.format(RATE_OF_RETURN_MESSAGE, rateOfReturn));
    }

    private static void output(String message) {
        System.out.println(message);
    }
}