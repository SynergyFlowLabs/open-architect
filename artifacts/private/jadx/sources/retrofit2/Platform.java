package retrofit2;

import fj.h;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes14.dex */
final class Platform {
    static final BuiltInFactories builtInFactories;

    @h
    static final Executor callbackExecutor;
    static final Reflection reflection;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            callbackExecutor = null;
            reflection = new Reflection();
            builtInFactories = new BuiltInFactories();
        } else if (property.equals("Dalvik")) {
            callbackExecutor = new AndroidMainExecutor();
            reflection = new Reflection.Android24();
            builtInFactories = new BuiltInFactories.Java8();
        } else {
            callbackExecutor = null;
            reflection = new Reflection.Java8();
            builtInFactories = new BuiltInFactories.Java8();
        }
    }

    private Platform() {
    }
}
