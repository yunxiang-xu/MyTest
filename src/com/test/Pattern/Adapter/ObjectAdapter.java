package com.test.Pattern.Adapter;

public class ObjectAdapter implements HDMI{
	
	private Phone phone;
	
	public ObjectAdapter() {
		
	}
	
	public ObjectAdapter(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void HDMIVoice() {
		// TODO Auto-generated method stub
		phone.typeC();
		System.out.println("对象收到从typeC接口流出的声音");
		System.out.println("对象转成hdmi格式播放");
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
