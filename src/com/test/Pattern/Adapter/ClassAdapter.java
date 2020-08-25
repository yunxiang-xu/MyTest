package com.test.Pattern.Adapter;

public class ClassAdapter extends Phone implements HDMI{

	@Override
	public void HDMIVoice() {

		typeC();
		System.out.println("类收到从typeC接口流出的声音");
		System.out.println("类转成hdmi格式播放");
		
	}

	@Override
	public void HDMIVideo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HDMIImg() {
		// TODO Auto-generated method stub
		
	}

}
