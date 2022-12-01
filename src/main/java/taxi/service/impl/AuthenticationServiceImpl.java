package taxi.service.impl;

import taxi.dao.DriverDao;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import taxi.service.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final String exceptionMassage = "Login or password was incorrect";
    @Inject
    private DriverDao driverDao;

    @Override
    public Driver login(String username, String password) throws AuthenticationException {
        Driver driver = driverDao.findByLogin(username)
                .orElseThrow(() -> new AuthenticationException(exceptionMassage));
        if (!driver.getPassword().equals(password)) {
            throw new AuthenticationException(exceptionMassage);
        }
        return driver;
    }
}
