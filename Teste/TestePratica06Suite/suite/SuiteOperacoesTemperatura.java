package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.OperacoesTeste;
import teste.TemperaturaTeste;

@RunWith(Suite.class)
@SuiteClasses({ OperacoesTeste.class, TemperaturaTeste.class })
public class SuiteOperacoesTemperatura {

}
