import java.util.*;

/*Singleton*/
public class MIPSRegisterBank{

    private static MIPSRegisterBank instance = null;

    public static final Map<String, RegManager > regBank;
    static {
        Map<String, RegManager> initRegBank = new HashMap<String, RegManager >();
        initRegBank.put("ZERO", new RegManager (Arrays.asList("$zero"), false));
        initRegBank.put("ASSTEMP", new RegManager (Arrays.asList("$at"), false));
        initRegBank.put("VALUES", new RegManager (Arrays.asList("$v0", "$v1"), true));
        initRegBank.put("ARGS", 
                        new RegManager (Arrays.asList("$a0", "$a1", "$a2", "$a3"), true));

        initRegBank.put("TEMPS",
                         new RegManager (Arrays.asList("$t0", "$t1", "$t2", "$t3", "$t4",
                                         "$t5", "$t6", "$t7", "$t8", "$t9"), true));

        initRegBank.put("SAVED_TEMP", 
                        new RegManager (Arrays.asList("$s0", "$s1", "$s2", "$s3", "$s4",
                                        "$s5", "$s6", "$s7"), true));

        initRegBank.put("GLOBAL_POINTER", new RegManager (Arrays.asList("$gp"), false));
        initRegBank.put("TRAP", new RegManager (Arrays.asList("$k0", "$k1"), false));
        initRegBank.put("STACK_POINTER", new RegManager (Arrays.asList("$sp"), false));
        initRegBank.put("FRAME_POINTER", new RegManager (Arrays.asList("$fp"), false));
        initRegBank.put("RETURN_ADDRESS", new RegManager (Arrays.asList("$ra"), false));
        initRegBank.put("FLOAT_RETURN VALUES", 
                        new RegManager (Arrays.asList("$f0", "$f1", "$f2", "$f3"), true));

        initRegBank.put("FLOAT_TEMPS", 
                        new RegManager (Arrays.asList("$f4", "$f5", "$f6", "$f7", 
                                        "$f8", "$f9", "f10", "$f16", "$f17", "$f18"), true));

        initRegBank.put("FLOAT_ARGS", new RegManager (Arrays.asList("$f12", "$f13", "f14"), true));
        initRegBank.put("FLOAT_SAVED_TEMP", 
                         new RegManager (Arrays.asList("$f20", "$f21", "$f22", "$f23", "$f24", "$f25",
                                                       "$f26", "$f27", "$f28", "$f28", "$f29", "$f30", 
                                                       "$f31"), true));

        regBank = Collections.unmodifiableMap(initRegBank);
    }

    private MIPSRegisterBank(){
        // donothing    
    }

    public static MIPSRegisterBank getMIPSRegisterBank(){
        if(instance == null){
           instance = new MIPSRegisterBank(); 
        }    
        return instance;
    }

}
