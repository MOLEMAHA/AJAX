package ajax;

import java.util.HashMap;

public class ComposerData {
    
    private HashMap composers = new HashMap();

    public HashMap getComposers() {
        return composers;
    }

    public ComposerData() {

        composers.put("1", new Composer("1", "Thabang Sebata", "Batile", "Normal"));
        composers.put("2", new Composer("2", "Masopha", "Sopha", "Normal"));
        composers.put("3", new Composer("3", "khahliso molemo", "Jonase", "Normal"));
        composers.put("4", new Composer("4", "Relebohile", "Mokonyana", "Normal"));
        composers.put("5", new Composer("5", "Ntahbeleng", "Motokoa", "Normal"));
        composers.put("6", new Composer("6", "Neo", "Shakhane", "Normal"));
        composers.put("7", new Composer("7", "Bonang", "Lengoasa", "Normal"));

        composers.put("8", new Composer("8", "Eden Tlali", "Malatalianya", "Khohlo"));
        composers.put("9", new Composer("9", "Makheka", "Khotso", "Polielo"));
        composers.put("10", new Composer("10", "Lipontsheng", "Motsamai", "Matheka"));
        composers.put("11", new Composer("11", "Makhetha Letuka", "Chapoline", "Matheoha"));
        composers.put("12", new Composer("12", "Toolo", "tholo", "Classical"));
        composers.put("13", new Composer("13", "Malefu Letsoha", "foko", "Classical"));
        composers.put("14", new Composer("14", "Thope", "Thulo", "Classical"));
        composers.put("15", new Composer("15", "Katleho Thenase", "Mokotso", "Classical"));
        composers.put("16", new Composer("16", "Bolepo", "Ratoto", "Classical"));
        composers.put("17", new Composer("17", "ntsekeng", "hlokolosi", "Classical"));
        composers.put("18", new Composer("18", "motumi", "sebocha", "Classical"));
        composers.put("19", new Composer("19", "hopose", "majesi", "Classical"));

 
        composers.put("41", new Composer("41", "Bela", "Tobiasa", "Post-Romantic"));
        composers.put("42", new Composer("42", "seoli", "Setsetse", "Post-Romantic"));
        composers.put("43", new Composer("43", "Tatolo", "Mapoho", "Post-Romantic"));
        composers.put("44", new Composer("44", "Maretlo", "Moepi", "Post-Romantic"));
        composers.put("45", new Composer("45", "Sefali", "Jorotane", "Post-Romantic"));
        composers.put("46", new Composer("46", "sefako", "Mpholeng", "Post-Romantic"));
        composers.put("47", new Composer("47", "Alamina", "Rannyali", "Post-Romantic"));
        composers.put("48", new Composer("48", "Kofi", "sephetho", "Post-Romantic"));
        composers.put("49", new Composer("49", "Fariana", "Letheba", "Post-Romantic"));
        composers.put("50", new Composer("50", "katleho", "Makepi", "Post-Romantic"));
        
         composers.put("51", new Composer("51", "Lejoe", "Fokothi", "Romantic"));
        composers.put("52", new Composer("52", "Lebajoa", "Ramasenya", "Romantic"));
        composers.put("53", new Composer("53", "Sello", "Motokoa", "Romantic"));
        composers.put("54", new Composer("54", "Ralinko", "Mochini", "Romantic"));
        composers.put("55", new Composer("55", "Khalieli", "Jonathane", "Romantic"));
        composers.put("56", new Composer("56", "Bokha", "Tohlang", "Romantic"));
        composers.put("57", new Composer("57", "Kemohelo", "Thato", "Romantic"));
        composers.put("58", new Composer("58", "Mafif", "Kepi", "Romantic"));
        composers.put("59", new Composer("59", "Boranka", "Semethe", "Romantic"));
        composers.put("60", new Composer("60", "Raletat", "Moseme", "Romantic"));

    }
    
}
