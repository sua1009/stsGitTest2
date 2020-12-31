package stsGitTest2;

public class Genzi extends Character{

	@Override
	public void move() {
		System.out.println("겐지가 빠르게 이동합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("겐지가 멈춥니다.");
	}
	
	@Override
	public void attack() {
		System.out.println("겐지가 수리검으로 공격합니다.");
	}
	
	@Override
	public void skill() {
		System.out.println("겐지가 명검을 사용합니다.");
	}
}
