package workshop.sb.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.fail;


@RunWith(SpringRunner.class)
/*
    TODO 8 Dodaj adnotacje:
                            @SpringBootTest
                            @AutoConfigureMockMvc

                            Zauważ, że to inne adnotacje, niż w ćwiczeniu 2-gim - w tym ćwiczeniu
                            używamy wstrzykiwania.
 */
public class GreetControllerTest {

    // TODO 9 wstrzykni MockMvc

    // TODO 10 uzupełnij test
    @Test
    public void shouldReturnHelloWorld() throws Exception {
        fail();
    }

    // TODO 11 poeksperymentuj z różnymi sposobami wstrzykiwania w klasie kontrolera (prop., set., konstruktor) - uruchamiaj test po każdej zmianie

    // TODO 12 uruchom aplikację i przetestuj jej działanie w przeglądarce
}