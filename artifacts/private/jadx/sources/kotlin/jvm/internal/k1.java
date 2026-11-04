package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes11.dex */
public class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f312759a = "kotlin.jvm.functions.";

    public kotlin.reflect.d a(Class cls) {
        return new u(cls);
    }

    public kotlin.reflect.d b(Class cls, String str) {
        return new u(cls);
    }

    public kotlin.reflect.i c(f0 f0Var) {
        return f0Var;
    }

    public kotlin.reflect.d d(Class cls) {
        return new u(cls);
    }

    public kotlin.reflect.d e(Class cls, String str) {
        return new u(cls);
    }

    public kotlin.reflect.h f(Class cls, String str) {
        return new z0(cls, str);
    }

    @kotlin.e1(version = "1.6")
    public kotlin.reflect.s g(kotlin.reflect.s sVar) {
        t1 t1Var = (t1) sVar;
        return new t1(sVar.J(), sVar.d(), t1Var.t(), t1Var.q() | 2);
    }

    public kotlin.reflect.k h(s0 s0Var) {
        return s0Var;
    }

    public kotlin.reflect.l i(u0 u0Var) {
        return u0Var;
    }

    public kotlin.reflect.m j(w0 w0Var) {
        return w0Var;
    }

    @kotlin.e1(version = "1.6")
    public kotlin.reflect.s k(kotlin.reflect.s sVar) {
        t1 t1Var = (t1) sVar;
        return new t1(sVar.J(), sVar.d(), t1Var.t(), t1Var.q() | 4);
    }

    @kotlin.e1(version = "1.6")
    public kotlin.reflect.s l(kotlin.reflect.s sVar, kotlin.reflect.s sVar2) {
        return new t1(sVar.J(), sVar.d(), sVar2, ((t1) sVar).q());
    }

    public kotlin.reflect.p m(b1 b1Var) {
        return b1Var;
    }

    public kotlin.reflect.q n(d1 d1Var) {
        return d1Var;
    }

    public kotlin.reflect.r o(f1 f1Var) {
        return f1Var;
    }

    @kotlin.e1(version = "1.3")
    public String p(d0 d0Var) {
        String string = d0Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith(f312759a) ? string.substring(21) : string;
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public String q(l0 l0Var) {
        return p(l0Var);
    }

    @kotlin.e1(version = "1.4")
    public void r(kotlin.reflect.t tVar, List<kotlin.reflect.s> list) {
        ((s1) tVar).b(list);
    }

    @kotlin.e1(version = "1.4")
    public kotlin.reflect.s s(kotlin.reflect.g gVar, List<KTypeProjection> list, boolean z10) {
        return new t1(gVar, list, z10);
    }

    @kotlin.e1(version = "1.4")
    public kotlin.reflect.t t(Object obj, String str, kotlin.reflect.u uVar, boolean z10) {
        return new s1(obj, str, uVar, z10);
    }
}
