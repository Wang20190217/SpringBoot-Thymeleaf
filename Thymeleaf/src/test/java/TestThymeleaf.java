import org.junit.Test;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.Thymeleaf;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;


/**
 * 城南花已开<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2022/5/2 15:48 <br>
 * @Author: Wang
 */

public class TestThymeleaf {
    @Test
    public void testThymeleaf() {
        //创建模板引擎
        TemplateEngine engine = new TemplateEngine();
        String input = "<input type='text' th:value='helloworld'/>";
        //准备数据，使用Context
        Context context = new Context();
        //调用引擎金，处理模板和数据
        String out = engine.process(input, context);
        System.out.println(out);
    }

    @Test
    public void testThymeleaf2() {
        //创建模板引擎
        TemplateEngine engine = new TemplateEngine();
        String input = "<input type='text' th:value='${name}'/>";
        //准备数据，使用Context
        Context context = new Context();
        context.setVariable("name", "wang");
        //调用引擎金，处理模板和数据
        String out = engine.process(input, context);
        System.out.println(out);
    }

    @Test
    public void testThymeleaf3() {
        //创建模板引擎
        TemplateEngine engine = new TemplateEngine();
        //读取磁盘中的模板文件,会自动去加载类路径下的文件
        ClassLoaderTemplateResolver resolver=new ClassLoaderTemplateResolver();
        //将模板数据交给引擎
        engine.setTemplateResolver(resolver);
        //准备数据，使用Context
        Context context = new Context();
        context.setVariable("name", "wang");
        //调用引擎金，处理模板和数据
        String out = engine.process("index.html", context);
        System.out.println(out);
    }

    @Test
    public void testThymeleaf4() {
        //创建模板引擎
        TemplateEngine engine = new TemplateEngine();
        //读取磁盘中的模板文件,会自动去加载类路径下的文件
        ClassLoaderTemplateResolver resolver=new ClassLoaderTemplateResolver();
        resolver.setPrefix("/templates/");
        resolver.setSuffix(".html");
        //将模板数据交给引擎
        engine.setTemplateResolver(resolver);
        //准备数据，使用Context
        Context context = new Context();
        context.setVariable("name", "wang");
        //调用引擎金，处理模板和数据
        String out = engine.process("main", context);
        System.out.println(out);
    }


}
