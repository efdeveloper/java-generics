package efdeveloper.business;

import efdeveloper.dao.FooDAO;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class FooBusiness {

    @Inject
    private FooDAO fooDAO;

    public boolean foo() {
        System.out.println("FooBusiness foo().");
        return fooDAO.foo();
    }

}
