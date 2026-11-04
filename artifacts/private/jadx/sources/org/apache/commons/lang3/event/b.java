package org.apache.commons.lang3.event;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.reflect.e;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    private static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f337150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f337151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<String> f337152c;

        a(Object obj, String str, String[] strArr) {
            this.f337150a = obj;
            this.f337151b = str;
            this.f337152c = new HashSet(Arrays.asList(strArr));
        }

        private boolean a(Method method) {
            return e.b(this.f337150a.getClass(), this.f337151b, method.getParameterTypes()) != null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (this.f337152c.isEmpty() || this.f337152c.contains(method.getName())) {
                return a(method) ? e.v(this.f337150a, this.f337151b, objArr) : e.u(this.f337150a, this.f337151b);
            }
            return null;
        }
    }

    public static <L> void a(Object obj, Class<L> cls, L l10) {
        try {
            e.v(obj, "add" + cls.getSimpleName(), l10);
        } catch (IllegalAccessException unused) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not have an accessible add" + cls.getSimpleName() + " method which takes a parameter of type " + cls.getName() + ".");
        } catch (NoSuchMethodException unused2) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not have a public add" + cls.getSimpleName() + " method which takes a parameter of type " + cls.getName() + ".");
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Unable to add listener.", e10.getCause());
        }
    }

    public static <L> void b(Object obj, String str, Object obj2, Class<L> cls, String... strArr) {
        a(obj2, cls, cls.cast(Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{cls}, new a(obj, str, strArr))));
    }
}
