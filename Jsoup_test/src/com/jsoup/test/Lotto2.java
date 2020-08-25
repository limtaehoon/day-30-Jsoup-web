package com.jsoup.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Lotto2 {

	public static void main(String[] args) {
		
		Document doc;
		try {
			doc = Jsoup.connect("https://m.dhlottery.co.kr/common.do?method=main").get();
			Elements lottoNo = doc.select("#lottoDrwNo");//ȸ����ȣ 
			Elements lottoDrwNo = doc.select("div.prizeresult");//�ζ� ��ȣ
			
			
			for(int i=0; i<lottoNo.size();i++) {
				System.out.println(lottoNo.get(i).text());//ȸ������
				System.out.println(lottoDrwNo.get(i).select("span").text());//ȸ���� �ش��ϴ� �ζǹ�ȣ
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
