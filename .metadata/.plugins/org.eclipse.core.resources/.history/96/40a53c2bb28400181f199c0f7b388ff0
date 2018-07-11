package br.unipe.tests.suiteTests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import br.unipe.teste.stubs.ClienteAStub;
import br.unipe.teste.stubs.ClienteBStub;
import br.unipe.teste.stubs.ClienteCStub;
import br.unipe.tests.stubTests.CalcularDescontoStubTest;

@RunWith(Categories.class)
@IncludeCategory(ClienteCStub.class)
@ExcludeCategory({ClienteAStub.class, ClienteBStub.class})
@SuiteClasses(CalcularDescontoStubTest.class)
public class SuiteClienteC {

}
