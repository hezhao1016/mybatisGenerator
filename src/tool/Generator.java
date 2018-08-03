package tool;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 生成Mybatis代码
 *
 * @author hezhao
 * @date 2016年2月29日
 */
public class Generator {
	public static void main(String[] args) {
		// ִmybatis generator
		List<String> warnings = new ArrayList<String>();
	    boolean overwrite = true;
	    String fileName = "./src/generatorConfig.xml";
	    File configFile = new File(fileName);
	    ConfigurationParser cp = new ConfigurationParser(warnings);
	    Configuration config = null;
	    try {
	        config = cp.parseConfiguration(configFile);
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (XMLParserException e) {
	        e.printStackTrace();
	    }
	    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
	    try {
	        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
	        myBatisGenerator.generate(null);
	    } catch (InvalidConfigurationException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    System.out.println("生成Mybatis代码  >> "+fileName+" <<  成功！");
	}
}
