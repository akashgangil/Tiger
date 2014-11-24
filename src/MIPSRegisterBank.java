import java.util.*;

/*Singleton*/
public class MIPSRegisterBank{

    private static MIPSRegisterBank instance = null;

    public static final Map<String, RegAllocator > regBank;
    static {
        Map<String, RegAllocator> initRegBank = new HashMap<String, RegAllocator >();
        initRegBank.put("ZERO", new RegAllocator (Arrays.asList("$zero"), false));
        initRegBank.put("ASSTEMP", new RegAllocator (Arrays.asList("$at"), false));
        initRegBank.put("VALUES", new RegAllocator (Arrays.asList("$v0", "$v1"), true));
        initRegBank.put("ARGS", new RegAllocator (Arrays.asList("$a0", "$a1", "$a2", "$a3"), true));
        initRegBank.put("TEMPS", new RegAllocator (Arrays.asList("$t0", "$t1", "$t2", "$t3", "$t4", "$t5", "$t6", "$t7", "$t8", "$t9"), true));
        initRegBank.put("SAVED_TEMP", new RegAllocator (Arrays.asList("$s0", "$s1", "$s2", "$s3", "$s4", "$s5", "$s6", "$s7"), true));
        initRegBank.put("GLOBAL_POINTER", new RegAllocator (Arrays.asList("$gp"), false));
        initRegBank.put("TRAP", new RegAllocator (Arrays.asList("$k0", "$k1"), false));
        initRegBank.put("STACK_POINTER", new RegAllocator (Arrays.asList("$sp"), false));
        initRegBank.put("FRAME_POINTER", new RegAllocator (Arrays.asList("$fp"), false));
        initRegBank.put("RETURN_ADDRESS", new RegAllocator (Arrays.asList("$ra"), false));
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
