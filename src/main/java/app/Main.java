package app;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

public class Main {
    @Inject
    private DemoService service;

    public static void main(String[] args) {
        Main main = new Main();

        Module module = new DemoModule();
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(main);
        main.testGuice();
    }
    public void testGuice(){
        service.demo();
    }
}
