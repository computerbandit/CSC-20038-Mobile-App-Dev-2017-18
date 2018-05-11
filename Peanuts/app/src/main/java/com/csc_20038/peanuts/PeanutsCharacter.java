package com.csc_20038.peanuts;

public class PeanutsCharacter {
    private String name;
    private String description;
    private int imageResourceId;

    public static final PeanutsCharacter[] characters = {

            new PeanutsCharacter("Charlie Brown",
                    "Good ol’ Charlie Brown is the lovable loser in the zig-zag t-shirt—the kid who never gives up (even though he almost never wins). He manages the world’s worst baseball team…yet shows up for every game. He can’t muster the courage to talk to the Little Red-Haired girl…yet keeps hoping. Even though he gets grief from his friends, his kite-eating tree, even his own dog, Charlie Brown remains the stalwart hero.",
                    R.drawable.charliebrown),

            new PeanutsCharacter("Snoopy",
                    "The wildly imaginative, supremely confident, world-famous beagle is a canine master of disguise. As Joe Cool, he’s aloof, unflappable, above the fray, the hip dog we’d all like to be. As the World War I Flying Ace, he engages in aerial combat with the notorious Red Baron. While pondering life from the top of his doghouse, he writes the great American novel, travels to the moon, and plots revenge on the cat next door.",
                    R.drawable.snoopy),

            new PeanutsCharacter("Woodstock",
                    "The fluttering, sometimes sputtering, little yellow bird is Snoopy’s sidekick, whether it’s as faithful mechanic to the World War I Flying Ace, stalwart secretary to the Head Beagle, or root beer drinking buddy. Chirping in a language only Snoopy understands, Woodstock and his feathered friends are never far from Snoopy’s doghouse.",
                    R.drawable.woodstock),

            new PeanutsCharacter("Linus",
                    "The benevolent, blanket-clutching philosopher always has a kind word for everybody…even his bossy older sister, Lucy. While he’s often the voice of reason in the neighborhood, Linus also believes firmly in the Great Pumpkin, and he suffers more than most when people (or pumpkins) let him down.",
                    R.drawable.linus),

            new PeanutsCharacter("Sally",
                    "Charlie Brown’s little sister believes the world owes her an explanation. Why does she have to go to school? Why doesn’t Linus, her Sweet Babboo, love her? And what’s the capital of Venezuela? Sally is always on the hunt for answers—and when she doesn’t get them, she comes up with a whole new philosophy: \"Who cares?\"",
                    R.drawable.sally),

            new PeanutsCharacter("Franklin",
                    "Charlie Brown’s quiet friend and confidant, Franklin might be the only one who never has an unkind word about our hapless hero. At school, Franklin sits one seat ahead of Peppermint Patty, which makes his school days that much more unbearable.",
                    R.drawable.franklin),

            new PeanutsCharacter("Marcie",
                    "Peppermint Patty’s best friend, loyal follower, and complete opposite, Marcie is the smart one of the duo—even if she doesn’t know the difference between baseball and hockey. She’s horrible at sports, but terrific at friendship, especially with Charlie Brown (whom she calls \"Charles\") and Peppermint Patty (whom she calls \"sir\").",
                    R.drawable.marcie),

            new PeanutsCharacter("Peppermint Patty",
                    "A fearless born leader and a natural athlete, Peppermint Patty is up to any challenge…except studying. She never met a school day she didn’t hate. But this tough girl has a soft side, too: She’s hopelessly in love with her pal Charlie \"Chuck\" Brown—who has no idea. For Peppermint Patty, sports are easy; it’s life that’s hard.",
                    R.drawable.peppermintpatty),

            new PeanutsCharacter("Pigpen",
                    "Happily traveling in his own private dust storm, Pigpen is completely comfortable in his own (dust-streaked) skin. Despite his outward appearance, he always carries himself with dignity, knowing full well that he has affixed to him the \"dust of countless ages.\"",
                    R.drawable.pigpen),

            new PeanutsCharacter("Schroeder",
                    "This mini musical genius is rarely separated from his toy piano or his idol, Beethoven—except when he’s calling a game as the reliable catcher on Charlie Brown’s baseball team. The rest of his time is spent fending off unwanted advances from the bane of his existence: Lucy.",
                    R.drawable.schroeder),

            new PeanutsCharacter("Lucy",
                    "Known around the neighborhood (and by her little brother, Linus) for being crabby and bossy, Lucy can often be found dispensing advice from her 5-cent psychiatrist’s booth, yanking away Linus’ security blanket, or humiliating Charlie Brown. Lucy’s only weakness? Her unrequited love for the piano-playing Schroeder.",
                    R.drawable.lucy)

    };


    public PeanutsCharacter(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
