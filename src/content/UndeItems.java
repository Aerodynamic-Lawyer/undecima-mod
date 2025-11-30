package tantros;

import arc.graphics.*;
import arc.struct.*;
import mindustry.content.Items;
import mindustry.type.*;

public class TantItems {
    public static Item
    iron, fakelead, lithium, limestone, sulfur, biomass, fakesand, clay, fakegraphite, fakesilicon;

    public static final Seq<Item> TantItems = new Seq<>();

    public static void load() {
       iron = new Item("1-iron", Color.valueOf("#9f9694")) {{
            hardness = 2;
            cost = 0.4f;
        }};

       fakelead = new Item("2-fakelead", Color.valueOf("#d3b1f7")) {{
            hardness = 2;
            cost = 0.4f;
        }};

      lithium = new Item("3-lithium", Color.valueOf("#d3e8ea")) {{
            hardness = 2;
            cost = 0.4f;
            charge = 0.3
        }};

       limestone = new Item("4-limestone", Color.valueOf("#e0e0d2")) {{
            hardness = 2;
            cost = 0.4f;
        }};

       sulfur = new Item("5-sulfur", Color.valueOf("#efe671")) {{
            hardness = 1;
            explosiveness = 0.3f;
            flammability = 1f;
        }};

       biomass = new Item("6-biomass", Color.valueOf("#a19d68")) {{
            hardness = 1;
            explosiveness = 0.2f;
            flammability = 0.8f;
        }};

       fakesand = new Item("7-fakesand", Color.valueOf("#facca1")) {{
            hardness = 1;
            lowPriority = true;
        }};

       clay = new Item("8-clay", Color.valueOf("#6c6c7d")) {{
            hardness = 1;
            lowPriority = true;
        }};

       fakegraphite = new Item("9-fakegraphite", Color.valueOf("#9aaed8")) {{
            cost = 0.6f;
        }};

       fakesilicon = new Item("10-fakesilicon", Color.valueOf("#858a97")) {{
            cost = 0.5f;
        }};

        TantItems.addAll(
             cobalt, coralchunk   
        );
    }
}
      
