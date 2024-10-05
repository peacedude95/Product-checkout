package mulcahey.gm.productCheckout.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class ProductsIntegrationTest {
    @Autowired
    MockMvc mockMvc;
    @BeforeTestClass
    public void setup () {

    }

    @Test
    void shouldReturnDeafultMessage () throws Exception {
        mockMvc.perform(get("/products")).andDo(print()).andExpect(content().string("nothing yet"));
    }
}