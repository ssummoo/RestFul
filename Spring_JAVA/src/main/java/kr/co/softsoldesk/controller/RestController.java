package kr.co.softsoldesk.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean;


@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/test2")
	public ResponseEntity<ArrayList<DataBean>> test2() {
		
		DataBean bean1=new DataBean("Java", 100, 11.11, false);
		DataBean bean2=new DataBean("JSP", 200, 22.22, true);
		DataBean bean3=new DataBean("Spring", 300, 33.33, false);
		
		ArrayList<DataBean> list=new ArrayList<DataBean>();
		
		list.add(bean1);
		list.add(bean2);
		list.add(bean3);
		
		ResponseEntity<ArrayList<DataBean>> entry=new ResponseEntity<ArrayList<DataBean>>(list, HttpStatus.OK);
		
		
		
		return entry;  //데이터로 인식 -> request영역에 test2를 보냄
	}
}
