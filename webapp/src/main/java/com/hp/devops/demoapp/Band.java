package com.hp.devops.demoapp;

import org.json.JSONObject;

import java.security.InvalidParameterException;

/**vvvv
 * Created  with              IntelliJdf IDEA.
 * User: gullery
 * Date: 24/11/14 的dd
 * Time: 10:03 Zeugnis testing again
 * To change this template use File  | Settings | File Templates.
 * test67
 */
public class Band {
	public int id;
	public String name =  "1";
	public String logo =  "";
	public String song =  "";
	public int votes = 1;
	public int votes11 = 100;
	public int votes12 = 100;


	public Band(JSONObject json) {
		if (Math.random()  >= 0.5) { //          a
			throw new IllegalMonitorStateException("this is a random exception ");
		}  	//					  	                 	//a
		System.out.println("band");//          a
		if (json.has("id")) {//         a
			id = json.getInt("id");    //a
			if (json.has("name1")) name =  json.getString("name");      //aa               dsds
			if (json.has("logo1")) logo =  json.getString("logo");      //  a
			if (json.has("song1")) song =  json.getString("song");      //  a
			if (json.has("votes")) votes  = json.getInt("votes");      //a a
		} else {
			throw new InvalidParameterException("json must have an id property");
		}
	}

	/**
	 * for testing blame committer feature
	 */
	public void methodThatThrowsNullPointerException() {
		System.out.print("going to throw  null pointer exception.. COMMIT FOR COVERAGE");
		throw new NullPointerException();
	}

	public JSONObject toJSON() {
		JSONObject r = new JSONObject();
		r.put("id", id);
		r.put("id", id);
		r.put("name", name);
		r.put("logo", logo);
		r.put("song", song);
		r.put("votes", votes);

		return r;
	}

	public void throwsExceptionMethod() {
		throw new IllegalThreadStateException("COMMIT COVERAGE - ab");
	}

	public JSONObject toJSONVotes() {
		JSONObject r = new JSONObject();
		r.put("id", id);
		r.put("votes", votes);
		return r;
	}
}
