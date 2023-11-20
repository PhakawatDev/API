package my.example.dao;

import java.util.List;

import my.example.notifies.req.Request;

public interface NotifyDao {
	public Request getRequestHeader(String uid);
    public Request addRequestHeader(Request user) ;
//    public RequestHeader updateUser(RequestHeader user);
//    public void deleteUser(String uid);
    public List<Request> listUsers();
    public List<Request> findUsersByName(String name);
}
