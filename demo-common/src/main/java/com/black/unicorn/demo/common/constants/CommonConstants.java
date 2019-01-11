package com.black.unicorn.demo.common.constants;

public interface CommonConstants {

	/** 返回成功Code */
	public final int RESPONSE_SUCCESS_CODE = 200;

	/** 客户端异常Code */
	public final int RESPONSE_CLIENT_ERROR_CODE = 400;

	/** 服务端异常Code */
	public final int RESPONSE_SERVER_ERROR_CODE = 500;
	
	/** 文件上传失败code */
	public final int RESPONSE_FILEUPLOAD_ERROR_CODE = 100;

	/** 返回成功message */
	public final static String RESPONSE_SUCCESS_DESC = "成功";

	public final static String RESPONSE_SERVER_ERROR_DESC = "系统内部异常";

	public final static String RESPONSE_CLIENT_ERROR_DESC = "客户端异常";
	
	public final static String RESPONSE_FILEUPLOAD_ERROR_DESC = "文件上传失败";

	/** redis key分隔符 */
	public final static String REDIS_KEY_SEPARATOR = ":";

	/** token超时时间 */
	public final static Long REDIS_TOKEN_EXPIREED = 1000L;
	
	public final static String RESPONSE_STATUS_SUCCESS = "success";
	
	public final static String PARTNERROLE_SEPARATOR = ",";
	
	/** 文件上传的最大值 */
	public final static double BIG_FILE_SIZE_LIMIT = 5*1024*1024;

	public final static String DATETIME_PATTERN_YYYYMMDD_HHMMSS = "yyyy-MM-dd HH:mm:ss";
	
	public final static String DATETIME_PATTERN_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
	
	public final static String DATETIME_PATTERN_YYYY_MM_DD = "yyyy-MM-dd";
}
