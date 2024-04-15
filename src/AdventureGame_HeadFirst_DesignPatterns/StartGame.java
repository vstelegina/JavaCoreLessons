package AdventureGame_HeadFirst_DesignPatterns;

import AdventureGame_HeadFirst_DesignPatterns.Characters.*;
import AdventureGame_HeadFirst_DesignPatterns.Characters.Character;

public class StartGame {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        Character queen = new Queen();
        queen.fight();
        Character knight = new Knight();
        knight.fight();
        Character troll = new Troll();
        troll.fight();
    }
}
