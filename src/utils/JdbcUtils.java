package utils;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {

	public JdbcUtils() {
		// TODO Auto-generated constructor stub
	}
	// ��ʼ�����ӳ�
		private static DataSource dataSource;
		static {
			dataSource = new ComboPooledDataSource();
		}
		
		public static DataSource getDataSource() {
			return dataSource;
		}
		
		/**
		 * ����DbUtils���ù��������
		 */
		public static QueryRunner getQuerrRunner() {
			return new QueryRunner(dataSource);
		}

}