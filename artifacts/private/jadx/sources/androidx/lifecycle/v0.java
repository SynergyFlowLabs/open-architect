package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f52533b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f52534c = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v0 f52532a = new v0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Map<Class<?>, Integer> f52535d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Map<Class<?>, List<Constructor<? extends x>>> f52536e = new HashMap();

    private v0() {
    }

    private final x a(Constructor<? extends x> constructor, Object obj) {
        try {
            x xVarNewInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNull(xVarNewInstance);
            return xVarNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends x> b(Class<?> cls) {
        try {
            Package r10 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r10 != null ? r10.getName() : "";
            Intrinsics.checkNotNull(name);
            if (name.length() != 0) {
                Intrinsics.checkNotNull(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "substring(...)");
            }
            Intrinsics.checkNotNull(canonicalName);
            String strC = c(canonicalName);
            if (name.length() != 0) {
                strC = name + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    @oj.n
    @NotNull
    public static final String c(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.k2(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f52535d;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && n0.class.isAssignableFrom(cls);
    }

    @oj.n
    @NotNull
    public static final j0 f(@NotNull Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z10 = object instanceof j0;
        boolean z11 = object instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            return new p((DefaultLifecycleObserver) object, (j0) object);
        }
        if (z11) {
            return new p((DefaultLifecycleObserver) object, null);
        }
        if (z10) {
            return (j0) object;
        }
        Class<?> cls = object.getClass();
        v0 v0Var = f52532a;
        if (v0Var.d(cls) != 2) {
            return new i1(object);
        }
        List<Constructor<? extends x>> list = f52536e.get(cls);
        Intrinsics.checkNotNull(list);
        List<Constructor<? extends x>> list2 = list;
        if (list2.size() == 1) {
            return new w1(v0Var.a(list2.get(0), object));
        }
        int size = list2.size();
        x[] xVarArr = new x[size];
        for (int i10 = 0; i10 < size; i10++) {
            xVarArr[i10] = f52532a.a(list2.get(i10), object);
        }
        return new h(xVarArr);
    }

    private final int g(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends x> constructorB = b(cls);
        if (constructorB != null) {
            f52536e.put(cls, CollectionsKt.listOf(constructorB));
            return 2;
        }
        if (g.f52336c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (e(superclass)) {
            Intrinsics.checkNotNull(superclass);
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends x>> list = f52536e.get(superclass);
            Intrinsics.checkNotNull(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Iterator itA = kotlin.jvm.internal.i.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class<?> cls2 = (Class) itA.next();
            if (e(cls2)) {
                Intrinsics.checkNotNull(cls2);
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends x>> list2 = f52536e.get(cls2);
                Intrinsics.checkNotNull(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f52536e.put(cls, arrayList);
        return 2;
    }
}
