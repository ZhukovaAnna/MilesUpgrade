public class BonusMilesService {
    public int calculate(int cost) {
        int milies = 20;
        int bonusMilies = cost / milies;
        return bonusMilies;
    }
}
