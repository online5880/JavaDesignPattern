package AdapterPattern;

public class AdapterImpl implements Adapter{
    
    //Math math;
    
    @Override
    public float twiceOf(Float f) {

        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public float halfOf(Float f) {
        System.out.println("절반 함수 호출 시작");
        return (float) Math.half(f.doubleValue());
    }
}
