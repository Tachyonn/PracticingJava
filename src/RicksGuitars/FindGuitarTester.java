package RicksGuitars;

/**
 * Created by Digital Anvil on 23.08.2017.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initInventory(inventory);

        Map properties = new HashMap();
        properties.put("builder", Builder.GIBSON);
        properties.put("backWood", Wood.MAPLE);
        InstrumentSpec clientSpec = new InstrumentSpec(properties);

        List matchingInstruments = inventory.search(clientSpec);

        if (!matchingInstruments.isEmpty()) {
            System.out.println("You might like these instruments:");
            for (Iterator i = matchingInstruments.iterator(); i.hasNext(); ) {
                Instrument instrument = (Instrument) i.next();
                InstrumentSpec spec = instrument.getSpec();
                System.out.println("We have a " + spec.getProperty("instrumentType") +
                        " with the following properties:");
                for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext(); ) {
                    String propertyName = (String) j.next();
                    if (propertyName.equals("instrumentType"))
                        continue;
                    System.out.println("   " + propertyName + ": " + spec.getProperty(propertyName));
                }
                System.out.println("You can have this " +
                        spec.getProperty("instrumentType") +
                        " for $" + instrument.getPrice() + "\n-------");
            }
        } else {
            System.out.println("Sorry, we have nothing for you");
        }
    }

    private static void initInventory(Inventory inventory) {
        Map properties = new HashMap();                         //Collings CJ 6 str
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.COLLINGS);
        properties.put("model", "CJ");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("backWood", Wood.INDIAN_ROSEWOOD);
        properties.put("topWood", Wood.SITKA);
        inventory.addInstrument("11277", 3999.95,
                new InstrumentSpec(properties));

        properties = new HashMap();                             //Martin D-18 6 str
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.MARTIN);
        properties.put("model", "D-18");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("backWood", Wood.MAHOGANY);
        properties.put("topWood", Wood.ADIRONDACK);
        inventory.addInstrument("122784", 5495.95,
                new InstrumentSpec(properties));

        properties = new HashMap();                             //Fender Stratocaster 6 str
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.FENDER);
        properties.put("model", "Stratocaster");
        properties.put("type", Type.ELECTRIC);
        properties.put("numStrings", 6);
        properties.put("backWood", Wood.ALDER);
        properties.put("topWood", Wood.ALDER);
        inventory.addInstrument("V95693", 1499.95,
                new InstrumentSpec(properties));
        inventory.addInstrument("V9512", 1549.95,//Fender Stratocaster 6 str
                new InstrumentSpec(properties));

        properties = new HashMap();                             //Gibson SG'61 Reissue 6 str
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.GIBSON);
        properties.put("model", "SG'61 Reissue");
        properties.put("type", Type.ELECTRIC);
        properties.put("numStrings", 6);
        properties.put("backWood", Wood.MAHOGANY);
        properties.put("topWood", Wood.MAHOGANY);
        inventory.addInstrument("82765501", 1890.95,
                new InstrumentSpec(properties));

        properties = new HashMap();                             //Gibson Les Paul 6 str
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.GIBSON);
        properties.put("model", "Les Paul");
        properties.put("type", Type.ELECTRIC);
        properties.put("numStrings", 6);
        properties.put("backWood", Wood.MAPLE);
        properties.put("topWood", Wood.MAPLE);
        inventory.addInstrument("70108276", 2295.95,
                new InstrumentSpec(properties));

        properties = new HashMap();                             //Gibson F5-G
        properties.put("instrumentType", InstrumentType.MANDOLIN);
        properties.put("builder", Builder.GIBSON);
        properties.put("model", "F5-G");
        properties.put("type", Type.ACOUSTIC);
        properties.put("backWood", Wood.MAPLE);
        properties.put("topWood", Wood.MAPLE);
        inventory.addInstrument("9019920", 5495.95,
                new InstrumentSpec(properties));

        properties = new HashMap();                             //Gibson RB-3 5 str
        properties.put("instrumentType", InstrumentType.BANJO);
        properties.put("builder", Builder.GIBSON);
        properties.put("model", "RB-3");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 5);
        properties.put("backWood", Wood.MAPLE);
        inventory.addInstrument("8900231", 2945.95,
                new InstrumentSpec(properties));

    }

}
