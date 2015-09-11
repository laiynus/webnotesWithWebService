package by.khrapovitsky.webservice;

import by.khrapovitsky.model.User;
import by.khrapovitsky.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import java.util.List;

@WebService(portName = "UsersListServicePort",serviceName = "UsersListService",name = "UsersList",targetNamespace = "http://www.khrapovitsky.by")
public class WebServiceUsersList {

    @Autowired
    UsersService usersService;

    @WebMethod
    @WebResult(name = "User")
    public List<User> getUsersList(){
        List<User> userList = usersService.getAllUsers();
        return userList;
    }

}
