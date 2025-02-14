package com.ftkj.service;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;

import com.ftkj.proto.ProtoType;
import com.ftkj.proto.mt.AnswerMt;
import com.ftkj.proto.mt.AtvAnswerMt;
/**
 * @author Marc.Wang 2012-6-28 上午09:55:00
 * 功能：
 */
public class ActivityServiceTestCase extends BaseServiceTestCase {
	
	//
	public void testShowView() throws InterruptedException{
		sendData(ProtoType.checkTeamExists, 
				"accountId","102030405138","shardId","301","debug","0");
		Thread.sleep(3 * 1000);
		//
		sendData(ProtoType.activyShowView);
		Thread.sleep(3 * 1000);
	}
	
	@Override
	public Object transToObject(int type, InputStream is, boolean isZip)
			throws IOException {
		Object obj = "";
		if(type==ProtoType.activyShowView.getService()){
			obj = isZip?AnswerMt.ActivityData.parseFrom(new 
					InflaterInputStream(new DataInputStream(is))):
						AnswerMt.ActivityData.parseFrom(new DataInputStream(is));
		}
		return obj;
	}

}
