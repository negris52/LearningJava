public class TestMethodTypeOverride2 extends TestMethodTypeOverride {

    @Override
    public TestMethodTypeOverride2 testMethod (TestMethodTypeOverride s){
        return (TestMethodTypeOverride2)s;
    }

}
