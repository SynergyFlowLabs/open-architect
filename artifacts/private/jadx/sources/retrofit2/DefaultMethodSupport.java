package retrofit2;

import fj.h;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes14.dex */
final class DefaultMethodSupport {

    @h
    private static Constructor<MethodHandles.Lookup> lookupConstructor;

    private DefaultMethodSupport() {
    }

    @h
    @zl.a
    static Object invoke(Method method, Class<?> cls, Object obj, @h Object[] objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> declaredConstructor = lookupConstructor;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            lookupConstructor = declaredConstructor;
        }
        return declaredConstructor.newInstance(cls, -1).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
