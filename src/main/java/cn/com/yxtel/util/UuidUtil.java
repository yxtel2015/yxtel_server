package cn.com.yxtel.util;

import java.util.UUID;

/**
 * uuid 工具
 * @author:lishilong
 */
public class UuidUtil {

	/**
	 * 32位uuid 生产
	 * @return
	 */
	public static String get32UUID() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}
	
	public static void main(String[] args) {
		System.out.println(get32UUID());
	}
}

