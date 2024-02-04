package default_library;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class java_util_HashMap_values {
    public static void main(String[] args) {
        // HashMap ���� �� ��� �߰�
        Map<String, Integer> map = new HashMap<>();
        map.put("���", 10);
        map.put("�ٳ���", 20);
        map.put("������", 30);

        // values() �޼��带 ����Ͽ� ���� �÷��� �並 ����
        Collection<Integer> values = map.values();
        System.out.println("values Ÿ�� Ȯ��: " + values.getClass().getName());

        // �÷��� �並 ����Ͽ� ��� ���� ���
        for (Integer value : values) {
            System.out.println(value);
        }

        // �ʿ� ��ȭ�� �ְ�, �÷��� �信 �ݿ��Ǵ��� Ȯ��
        map.put("ü��",  50); // ���ο� ��� �߰�
        map.remove("���"); // ���� ��� ����

        // �ٽ� ��� ���� ����Ͽ� ���� ���� �ݿ� Ȯ��
        System.out.println("\n���� �� ��:");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}