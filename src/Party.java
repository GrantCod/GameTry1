import classes.CharacterClass;

public class Party {
    private CharacterClass[] partyMembers;
    public Party(CharacterClass... members) {
        partyMembers = new CharacterClass[members.length];
        for (int i = 0; i < partyMembers.length; i++) {
                partyMembers[i] = members[i];
        }
    }

    public CharacterClass[] getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(CharacterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }
    public void info() {
        for (CharacterClass partyMembers : partyMembers) {
            partyMembers.info();
        }
    }
}
