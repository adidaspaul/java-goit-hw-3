class ATM {
    public int countBanknotes(int sum) {
        int[] bankNotes = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
        int result = 0;
        int excess = sum;
        int bankNotesIndex = 0;
        while (bankNotesIndex < bankNotes.length) {
            result += excess / bankNotes[bankNotesIndex] != 0 ? excess / bankNotes[bankNotesIndex] : 0;
            excess -= excess / bankNotes[bankNotesIndex] * bankNotes[bankNotesIndex];
            bankNotesIndex++;
        }
        return result;
    }
}
