package com.w._0329;

public interface Food {
	public String getFood() ;
}
class McChicken implements Food{
@Override
	public String getFood() {
	return "���㼦һ��";
	}
}
class chips implements Food{
	@Override
	public String getFood() {
		return "����һ��";
	}
}
class FoodFactory{
	public static void createFoods(String type){
		if (type.equals("���㼦")) {
			Food mc=new McChicken();
			String food=mc.getFood();
			System.out.println(food);
		}else if (type.equals("����һ��")) {
			Food c=new chips();
			String food=c.getFood();
			System.out.println(food);
		}else {
			System.out.println("�Բ���û�У�");
		}
	}
}