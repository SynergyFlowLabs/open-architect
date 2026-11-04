package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.ArraysKt;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes11.dex */
public class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k1 f312754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f312755b = " (Kotlin reflection is not available)";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kotlin.reflect.d[] f312756c;

    static {
        k1 k1Var = null;
        try {
            k1Var = (k1) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (k1Var == null) {
            k1Var = new k1();
        }
        f312754a = k1Var;
        f312756c = new kotlin.reflect.d[0];
    }

    @kotlin.e1(version = "1.4")
    public static kotlin.reflect.s A(Class cls) {
        return f312754a.s(d(cls), Collections.EMPTY_LIST, false);
    }

    @kotlin.e1(version = "1.4")
    public static kotlin.reflect.s B(Class cls, KTypeProjection kTypeProjection) {
        return f312754a.s(d(cls), Collections.singletonList(kTypeProjection), false);
    }

    @kotlin.e1(version = "1.4")
    public static kotlin.reflect.s C(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f312754a.s(d(cls), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }

    @kotlin.e1(version = "1.4")
    public static kotlin.reflect.s D(Class cls, KTypeProjection... kTypeProjectionArr) {
        return f312754a.s(d(cls), ArraysKt.toList(kTypeProjectionArr), false);
    }

    @kotlin.e1(version = "1.4")
    public static kotlin.reflect.s E(kotlin.reflect.g gVar) {
        return f312754a.s(gVar, Collections.EMPTY_LIST, false);
    }

    @kotlin.e1(version = "1.4")
    public static kotlin.reflect.t F(Object obj, String str, kotlin.reflect.u uVar, boolean z10) {
        return f312754a.t(obj, str, uVar, z10);
    }

    public static kotlin.reflect.d a(Class cls) {
        return f312754a.a(cls);
    }

    public static kotlin.reflect.d b(Class cls, String str) {
        return f312754a.b(cls, str);
    }

    public static kotlin.reflect.i c(f0 f0Var) {
        return f312754a.c(f0Var);
    }

    public static kotlin.reflect.d d(Class cls) {
        return f312754a.d(cls);
    }

    public static kotlin.reflect.d e(Class cls, String str) {
        return f312754a.e(cls, str);
    }

    public static kotlin.reflect.d[] f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f312756c;
        }
        kotlin.reflect.d[] dVarArr = new kotlin.reflect.d[length];
        for (int i10 = 0; i10 < length; i10++) {
            dVarArr[i10] = d(clsArr[i10]);
        }
        return dVarArr;
    }

    @kotlin.e1(version = "1.4")
    public static kotlin.reflect.h g(Class cls) {
        return f312754a.f(cls, "");
    }

    public static kotlin.reflect.h h(Class cls, String str) {
        return f312754a.f(cls, str);
    }

    @kotlin.e1(version = "1.6")
    public static kotlin.reflect.s i(kotlin.reflect.s sVar) {
        return f312754a.g(sVar);
    }

    public static kotlin.reflect.k j(s0 s0Var) {
        return f312754a.h(s0Var);
    }

    public static kotlin.reflect.l k(u0 u0Var) {
        return f312754a.i(u0Var);
    }

    public static kotlin.reflect.m l(w0 w0Var) {
        return f312754a.j(w0Var);
    }

    @kotlin.e1(version = "1.6")
    public static kotlin.reflect.s m(kotlin.reflect.s sVar) {
        return f312754a.k(sVar);
    }

    @kotlin.e1(version = "1.4")
    public static kotlin.reflect.s n(Class cls) {
        return f312754a.s(d(cls), Collections.EMPTY_LIST, true);
    }

    @kotlin.e1(version = "1.4")
    public static kotlin.reflect.s o(Class cls, KTypeProjection kTypeProjection) {
        return f312754a.s(d(cls), Collections.singletonList(kTypeProjection), true);
    }

    @kotlin.e1(version = "1.4")
    public static kotlin.reflect.s p(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f312754a.s(d(cls), Arrays.asList(kTypeProjection, kTypeProjection2), true);
    }

    @kotlin.e1(version = "1.4")
    public static kotlin.reflect.s q(Class cls, KTypeProjection... kTypeProjectionArr) {
        return f312754a.s(d(cls), ArraysKt.toList(kTypeProjectionArr), true);
    }

    @kotlin.e1(version = "1.4")
    public static kotlin.reflect.s r(kotlin.reflect.g gVar) {
        return f312754a.s(gVar, Collections.EMPTY_LIST, true);
    }

    @kotlin.e1(version = "1.6")
    public static kotlin.reflect.s s(kotlin.reflect.s sVar, kotlin.reflect.s sVar2) {
        return f312754a.l(sVar, sVar2);
    }

    public static kotlin.reflect.p t(b1 b1Var) {
        return f312754a.m(b1Var);
    }

    public static kotlin.reflect.q u(d1 d1Var) {
        return f312754a.n(d1Var);
    }

    public static kotlin.reflect.r v(f1 f1Var) {
        return f312754a.o(f1Var);
    }

    @kotlin.e1(version = "1.3")
    public static String w(d0 d0Var) {
        return f312754a.p(d0Var);
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static String x(l0 l0Var) {
        return f312754a.q(l0Var);
    }

    @kotlin.e1(version = "1.4")
    public static void y(kotlin.reflect.t tVar, kotlin.reflect.s sVar) {
        f312754a.r(tVar, Collections.singletonList(sVar));
    }

    @kotlin.e1(version = "1.4")
    public static void z(kotlin.reflect.t tVar, kotlin.reflect.s... sVarArr) {
        f312754a.r(tVar, ArraysKt.toList(sVarArr));
    }
}
