import dao.ClienteDaoTest;
import dao.ProdutoDaoTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import service.ClienteSeviceTest;
import service.ProdutoServiceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteDaoTest.class, ClienteSeviceTest.class, ProdutoDaoTest.class, ProdutoServiceTest.class})
public class AllTests {
}
