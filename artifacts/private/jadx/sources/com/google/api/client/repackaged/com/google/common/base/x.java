package com.google.api.client.repackaged.com.google.common.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@r7.b(emulated = true)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @r7.c
    private static final String f115942a = "sun.misc.JavaLangAccess";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @r7.d
    @r7.c
    static final String f115943b = "sun.misc.SharedSecrets";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    @r7.c
    private static final Object f115944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.h
    @r7.c
    private static final Method f115945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @fj.h
    @r7.c
    private static final Method f115946e;

    static class a extends AbstractList<StackTraceElement> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f115947a;

        a(Throwable th2) {
            this.f115947a = th2;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public StackTraceElement get(int i10) {
            return (StackTraceElement) x.l(x.f115945d, x.f115944c, this.f115947a, Integer.valueOf(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return ((Integer) x.l(x.f115946e, x.f115944c, this.f115947a)).intValue();
        }
    }

    static {
        Object objG = g();
        f115944c = objG;
        f115945d = objG == null ? null : f();
        f115946e = objG != null ? j() : null;
    }

    private x() {
    }

    @r7.a
    public static List<Throwable> e(Throwable th2) {
        q.E(th2);
        ArrayList arrayList = new ArrayList(4);
        while (th2 != null) {
            arrayList.add(th2);
            th2 = th2.getCause();
        }
        return Collections.unmodifiableList(arrayList);
    }

    @fj.h
    @r7.c
    private static Method f() {
        return h("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @fj.h
    @r7.c
    private static Object g() {
        try {
            return Class.forName(f115943b, false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    @fj.h
    @r7.c
    private static Method h(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName(f115942a, false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable i(Throwable th2) {
        while (true) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                return th2;
            }
            th2 = cause;
        }
    }

    @fj.h
    @r7.c
    private static Method j() {
        return h("getStackTraceDepth", Throwable.class);
    }

    @r7.c
    public static String k(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @r7.c
    public static Object l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw p(e11.getCause());
        }
    }

    @r7.c
    private static List<StackTraceElement> m(Throwable th2) {
        q.E(th2);
        return new a(th2);
    }

    @r7.a
    @r7.c
    public static List<StackTraceElement> n(Throwable th2) {
        return o() ? m(th2) : Collections.unmodifiableList(Arrays.asList(th2.getStackTrace()));
    }

    @r7.a
    @r7.c
    public static boolean o() {
        return (f115945d != null) & (f115946e != null);
    }

    @z7.a
    @r7.c
    @Deprecated
    public static RuntimeException p(Throwable th2) {
        v(th2);
        throw new RuntimeException(th2);
    }

    @r7.c
    @Deprecated
    public static <X extends Throwable> void q(@fj.h Throwable th2, Class<X> cls) throws Throwable {
        if (th2 != null) {
            u(th2, cls);
        }
    }

    @r7.c
    @Deprecated
    public static void r(@fj.h Throwable th2) {
        if (th2 != null) {
            v(th2);
        }
    }

    @r7.c
    public static <X extends Throwable> void s(@fj.h Throwable th2, Class<X> cls) throws Throwable {
        q(th2, cls);
        r(th2);
    }

    @r7.c
    public static <X1 extends Throwable, X2 extends Throwable> void t(@fj.h Throwable th2, Class<X1> cls, Class<X2> cls2) throws Throwable {
        q.E(cls2);
        q(th2, cls);
        s(th2, cls2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @r7.c
    public static <X extends Throwable> void u(Throwable th2, Class<X> cls) throws Throwable {
        q.E(th2);
        if (cls.isInstance(th2)) {
            throw cls.cast(th2);
        }
    }

    public static void v(Throwable th2) {
        q.E(th2);
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }
}
