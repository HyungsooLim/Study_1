package com.hs.s5;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		// �������� ���α׷�
		// n���� �л�
		// �л��� �̸�, ��ȣ, ����, ����, ����, ����, ���

		// �л� �� �Է�
		// �޴�
		// 1. �л������Է�
		// -- �л� �� ��ŭ �̸�, ��ȣ, ����, ����, ���� �Է�
		// -- ��ȣ�� �ߺ� �Ұ�
		// -- ����, ���(�Ҽ��� ����) �ڵ����
		// 2. �л���ü�������
		// -- ��ü �л��� ��� ���� ���
		// 3. �л������˻�
		// -- �˻��� �л� ��ȣ �Է�
		// -- �ش� ��ȣ �л��� ���� ���
		// -- �Է� ��ȣ�� ������ ���� ������ ���
		// 4. ���α׷�����

		// �л� �� �Է�
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		System.out.println("�л� ���� �Է��ϼ���");
		inputNum = sc.nextInt();
		int[] studentNums = new int[inputNum];
		String[] studentNames = new String[studentNums.length];
		int[] studentIds = new int[studentNums.length];
		int[] studentKors = new int[studentNums.length];
		int[] studentEngs = new int[studentNums.length];
		int[] studentMaths = new int[studentNums.length];
		int[] studentTotals = new int[studentNums.length];
		double[] studentAvgs = new double[studentNums.length];

		// �޴� �Է�
		boolean check = true;
		while (check) {
			System.out.println("1. �л������Է�");
			System.out.println("2. �л���ü�������");
			System.out.println("3. �л������˻�");
			System.out.println("4. ���α׷�����");
			int selectMenu = sc.nextInt();
			switch (selectMenu) {
			case 1:
				for (int i = 0; i < studentNums.length; i++) {
					System.out.println("�л� �̸� �Է�");
					studentNames[i] = sc.next();
					System.out.println("�л� ��ȣ �Է�");
					studentIds[i] = sc.nextInt();
					System.out.println("���� ���� �Է�");
					studentKors[i] = sc.nextInt();
					System.out.println("���� ���� �Է�");
					studentEngs[i] = sc.nextInt();
					System.out.println("���� ���� �Է�");
					studentMaths[i] = sc.nextInt();
					studentTotals[i] = studentKors[i] + studentEngs[i] + studentMaths[i];
					studentAvgs[i] = studentTotals[i] / 3;
				}
				break;
			case 2:
				for (int i = 0; i < studentNums.length; i++) {
					System.out.println("��ȣ : " + studentIds[i] + "   �̸� : " + studentNames[i]);
					System.out.println(
							"���� : " + studentKors[i] + "   ���� : " + studentEngs[i] + "   ���� : " + studentMaths[i]);
					System.out.println("���� : " + studentTotals[i] + "   ��� : " + studentAvgs[i]);
					System.out.println("-------------------");
				}
				break;
			case 3:
				System.out.println("�˻��� �л� ��ȣ �Է�");
				int search = sc.nextInt();
				for (int i = 0; i < studentNums.length; i++) {
					if (search == studentIds[i]) {
						System.out.println("��ȣ : " + studentIds[i] + "   �̸� : " + studentNames[i]);
						System.out.println(
								"���� : " + studentKors[i] + "   ���� : " + studentEngs[i] + "   ���� : " + studentMaths[i]);
						System.out.println("���� : " + studentTotals[i] + "   ��� : " + studentAvgs[i]);
						break;
					} else if (i == studentNums.length) {
						System.out.println("���� ����");

					}
				}
				break;
			case 4:
				check = false;
				break;
			}// switch ��

		} // while �޴� ��

		System.out.println("---���α׷� ����---");
	}
}
