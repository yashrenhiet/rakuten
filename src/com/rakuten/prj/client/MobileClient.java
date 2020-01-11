package com.rakuten.prj.client;
import com.rakuten.prj.entity.Mobile;
import com.rakuten.prj.dao.MobileDao;
import com.rakuten.prj.dao.MobileDaoMongoImol;
public class MobileClient {
public static void main(String[] args)
{	Mobile m=new Mobile();
	MobileDao mobiledao=new MobileDaoMongoImol();
	mobiledao.addMobile(m);
	}
}
