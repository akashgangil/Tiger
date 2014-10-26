public class TigerArg{
    private String name;
    private String type;
    private String value;

    public TigerArg(String name, String type, String value){
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String toString(){
        return "Arg: [Name: " + name + " ], [Type: " + type
            + "], [Value: " + value + "]";
    }
}
