package com.test.Pattern.Adapter;

public class AbstractAdapter extends AbstractHDMI{

	private Phone phone;
	
	public AbstractAdapter(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void HDMIImg() {
		phone.typeC();
		System.out.println("类收到从typeC接口流出的声音");
		System.out.println("类转成hdmi格式播放");
	}

}
