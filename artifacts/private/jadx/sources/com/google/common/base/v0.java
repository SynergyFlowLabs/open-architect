package com.google.common.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b(emulated = true)
@k
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final String f116710a = "sun.misc.JavaLangAccess";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @com.google.common.annotations.e
    static final String f116711b = "sun.misc.SharedSecrets";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @fj.a
    private static final Object f116712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @fj.a
    private static final Method f116713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @fj.a
    private static final Method f116714e;

    class a extends AbstractList<StackTraceElement> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f116715a;

        a(final Throwable val$t) {
            this.f116715a = val$t;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public StackTraceElement get(int n10) {
            Method method = v0.f116713d;
            Objects.requireNonNull(method);
            Object obj = v0.f116712c;
            Objects.requireNonNull(obj);
            return (StackTraceElement) v0.m(method, obj, this.f116715a, Integer.valueOf(n10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Method method = v0.f116714e;
            Objects.requireNonNull(method);
            Object obj = v0.f116712c;
            Objects.requireNonNull(obj);
            return ((Integer) v0.m(method, obj, this.f116715a)).intValue();
        }
    }

    static {
        Object objH = h();
        f116712c = objH;
        f116713d = objH == null ? null : g();
        f116714e = objH != null ? k(objH) : null;
    }

    private v0() {
    }

    public static List<Throwable> e(Throwable throwable) {
        j0.E(throwable);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(throwable);
        boolean z10 = false;
        Throwable cause = throwable;
        while (true) {
            throwable = throwable.getCause();
            if (throwable == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(throwable);
            if (throwable == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", throwable);
            }
            if (z10) {
                cause = cause.getCause();
            }
            z10 = !z10;
        }
    }

    @com.google.common.annotations.c
    @fj.a
    public static <X extends Throwable> X f(Throwable throwable, Class<X> expectedCauseType) {
        try {
            return expectedCauseType.cast(throwable.getCause());
        } catch (ClassCastException e10) {
            e10.initCause(throwable);
            throw e10;
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @fj.a
    private static Method g() {
        return i("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @fj.a
    private static Object h() {
        Object objInvoke = null;
        try {
            objInvoke = Class.forName(f116711b, false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
        }
        return objInvoke;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @fj.a
    private static Method i(String name, Class<?>... parameterTypes) throws ThreadDeath {
        try {
            return Class.forName(f116710a, false, null).getMethod(name, parameterTypes);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable j(Throwable throwable) {
        boolean z10 = false;
        Throwable cause = throwable;
        while (true) {
            Throwable cause2 = throwable.getCause();
            if (cause2 == null) {
                return throwable;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z10) {
                cause = cause.getCause();
            }
            z10 = !z10;
            throwable = cause2;
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @fj.a
    private static Method k(Object jla) {
        try {
            Method methodI = i("getStackTraceDepth", Throwable.class);
            if (methodI == null) {
                return null;
            }
            methodI.invoke(jla, new Throwable());
            return methodI;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @com.google.common.annotations.c
    public static String l(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static Object m(Method method, Object receiver, Object... params) {
        try {
            return method.invoke(receiver, params);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw q(e11.getCause());
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static List<StackTraceElement> n(Throwable t10) {
        j0.E(t10);
        return new a(t10);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @Deprecated
    public static List<StackTraceElement> o(Throwable throwable) {
        return p() ? n(throwable) : Collections.unmodifiableList(Arrays.asList(throwable.getStackTrace()));
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @Deprecated
    public static boolean p() {
        return (f116713d == null || f116714e == null) ? false : true;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @z7.a
    @Deprecated
    public static RuntimeException q(Throwable throwable) {
        w(throwable);
        throw new RuntimeException(throwable);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @Deprecated
    public static <X extends Throwable> void r(@fj.a Throwable throwable, Class<X> declaredType) throws Throwable {
        if (throwable != null) {
            v(throwable, declaredType);
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @Deprecated
    public static void s(@fj.a Throwable throwable) {
        if (throwable != null) {
            w(throwable);
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @Deprecated
    public static <X extends Throwable> void t(@fj.a Throwable throwable, Class<X> declaredType) throws Throwable {
        r(throwable, declaredType);
        s(throwable);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @Deprecated
    public static <X1 extends Throwable, X2 extends Throwable> void u(@fj.a Throwable throwable, Class<X1> declaredType1, Class<X2> declaredType2) throws Throwable {
        j0.E(declaredType2);
        r(throwable, declaredType1);
        t(throwable, declaredType2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @com.google.common.annotations.c
    public static <X extends Throwable> void v(Throwable throwable, Class<X> declaredType) throws Throwable {
        j0.E(throwable);
        if (declaredType.isInstance(throwable)) {
            throw declaredType.cast(throwable);
        }
    }

    public static void w(Throwable throwable) {
        j0.E(throwable);
        if (throwable instanceof RuntimeException) {
            throw ((RuntimeException) throwable);
        }
        if (throwable instanceof Error) {
            throw ((Error) throwable);
        }
    }
}
