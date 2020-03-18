package efdeveloper.bean;

import efdeveloper.business.FooBusiness;
import efdeveloper.remote.FooRemote;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class FooBean implements FooRemote {

    @Inject
    private FooBusiness fooBusiness;

    @Override
    public boolean foo() {
        return fooBusiness.foo();
    }

}
