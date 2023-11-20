package my.example.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import my.example.notifies.req.Request;

@ApplicationScoped
public class NotifyDaoMapImpl implements NotifyDao {
	 
	private static Map<String, Request> requestHeaders = new HashMap<>();
	
	@Override
	public Request addRequestHeader (Request requestHeader) {
		Random random = new Random();
		requestHeader.setUid(String.valueOf(random.nextInt(100)));
		requestHeaders.put(requestHeader.getUid(), requestHeader);
		return requestHeaders.get(requestHeader.getUid());
	}

	@Override
	public Request getRequestHeader(String uid) {
		return requestHeaders.get(uid);
	}


	@Override
	public List<Request> listUsers() {
		Collection<Request> c = requestHeaders.values();
        List<Request> list = new ArrayList<>();
        list.addAll(c);
        return list;
	}

	@Override
	public List<Request> findUsersByName(String name) {
//		Collection<Request> c = requestHeaders.values();
//		List<Request> list = new ArrayList<>();
//		
//		for (Request requestHeader : c) {
//			if (requestHeader.getOptions().equals(name)){
//				list.add(requestHeader);		
//			}
//		}
		return null;
	}

}
