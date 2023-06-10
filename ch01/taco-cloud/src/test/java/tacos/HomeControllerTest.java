package tacos;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(HomeController.class)   // <1> //针对 HomeController 的web测试类。这个注解会将 bean 注册到 Spring MVC 上。
public class HomeControllerTest {

  @Autowired
  private MockMvc mockMvc;   // <2> 注入 MockMVC

  @Test
  public void testHomePage() throws Exception {
    mockMvc.perform(get("/"))    // <3> 发起对”/"的 GET 请求
      .andExpect(status().isOk())  // <4> 期望得到 HTTP 200
      .andExpect(view().name("home"))  // <5> 期望得到 home 视图
      .andExpect(content().string(           // <6> 期望宝行“Welcome to……”
          containsString("Welcome to...")));
  }

}
