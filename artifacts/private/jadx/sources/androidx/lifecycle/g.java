package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static g f52336c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f52337d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f52338e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f52339f = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, a> f52340a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f52341b = new HashMap();

    @Deprecated
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<c0.a, List<b>> f52342a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<b, c0.a> f52343b;

        a(Map<b, c0.a> map) {
            this.f52343b = map;
            for (Map.Entry<b, c0.a> entry : map.entrySet()) {
                c0.a value = entry.getValue();
                List<b> arrayList = this.f52342a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f52342a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<b> list, o0 o0Var, c0.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(o0Var, aVar, obj);
                }
            }
        }

        void a(o0 o0Var, c0.a aVar, Object obj) {
            b(this.f52342a.get(aVar), o0Var, aVar, obj);
            b(this.f52342a.get(c0.a.ON_ANY), o0Var, aVar, obj);
        }
    }

    @Deprecated
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f52344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f52345b;

        b(int i10, Method method) {
            this.f52344a = i10;
            this.f52345b = method;
            method.setAccessible(true);
        }

        void a(o0 o0Var, c0.a aVar, Object obj) {
            try {
                int i10 = this.f52344a;
                if (i10 == 0) {
                    this.f52345b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f52345b.invoke(obj, o0Var);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f52345b.invoke(obj, o0Var, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f52344a == bVar.f52344a && this.f52345b.getName().equals(bVar.f52345b.getName());
        }

        public int hashCode() {
            return (this.f52344a * 31) + this.f52345b.getName().hashCode();
        }
    }

    g() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f52343b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, c0.a> entry : c(cls2).f52343b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            e1 e1Var = (e1) method.getAnnotation(e1.class);
            if (e1Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!o0.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                c0.a aVarValue = e1Var.value();
                if (parameterTypes.length > 1) {
                    if (!c0.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != c0.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f52340a.put(cls, aVar);
        this.f52341b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<b, c0.a> map, b bVar, c0.a aVar, Class<?> cls) {
        c0.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            throw new IllegalArgumentException("Method " + bVar.f52345b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        }
        if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    a c(Class<?> cls) {
        a aVar = this.f52340a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f52341b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((e1) method.getAnnotation(e1.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f52341b.put(cls, Boolean.FALSE);
        return false;
    }
}
