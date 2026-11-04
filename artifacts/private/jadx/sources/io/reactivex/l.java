package io.reactivex;

import androidx.collection.g3;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.ktor.http.t1;
import io.reactivex.internal.operators.flowable.a2;
import io.reactivex.internal.operators.flowable.a3;
import io.reactivex.internal.operators.flowable.a4;
import io.reactivex.internal.operators.flowable.a5;
import io.reactivex.internal.operators.flowable.b1;
import io.reactivex.internal.operators.flowable.b2;
import io.reactivex.internal.operators.flowable.b3;
import io.reactivex.internal.operators.flowable.b4;
import io.reactivex.internal.operators.flowable.c1;
import io.reactivex.internal.operators.flowable.c2;
import io.reactivex.internal.operators.flowable.c3;
import io.reactivex.internal.operators.flowable.c4;
import io.reactivex.internal.operators.flowable.d3;
import io.reactivex.internal.operators.flowable.d4;
import io.reactivex.internal.operators.flowable.e1;
import io.reactivex.internal.operators.flowable.e2;
import io.reactivex.internal.operators.flowable.e3;
import io.reactivex.internal.operators.flowable.f1;
import io.reactivex.internal.operators.flowable.f2;
import io.reactivex.internal.operators.flowable.f3;
import io.reactivex.internal.operators.flowable.f4;
import io.reactivex.internal.operators.flowable.g1;
import io.reactivex.internal.operators.flowable.g2;
import io.reactivex.internal.operators.flowable.g4;
import io.reactivex.internal.operators.flowable.h1;
import io.reactivex.internal.operators.flowable.h2;
import io.reactivex.internal.operators.flowable.h3;
import io.reactivex.internal.operators.flowable.h4;
import io.reactivex.internal.operators.flowable.i1;
import io.reactivex.internal.operators.flowable.i2;
import io.reactivex.internal.operators.flowable.i3;
import io.reactivex.internal.operators.flowable.i4;
import io.reactivex.internal.operators.flowable.j1;
import io.reactivex.internal.operators.flowable.j2;
import io.reactivex.internal.operators.flowable.j3;
import io.reactivex.internal.operators.flowable.j4;
import io.reactivex.internal.operators.flowable.k2;
import io.reactivex.internal.operators.flowable.k3;
import io.reactivex.internal.operators.flowable.k4;
import io.reactivex.internal.operators.flowable.l1;
import io.reactivex.internal.operators.flowable.l2;
import io.reactivex.internal.operators.flowable.l3;
import io.reactivex.internal.operators.flowable.l4;
import io.reactivex.internal.operators.flowable.m1;
import io.reactivex.internal.operators.flowable.m2;
import io.reactivex.internal.operators.flowable.m4;
import io.reactivex.internal.operators.flowable.n1;
import io.reactivex.internal.operators.flowable.n3;
import io.reactivex.internal.operators.flowable.n4;
import io.reactivex.internal.operators.flowable.o1;
import io.reactivex.internal.operators.flowable.o2;
import io.reactivex.internal.operators.flowable.o3;
import io.reactivex.internal.operators.flowable.p1;
import io.reactivex.internal.operators.flowable.p2;
import io.reactivex.internal.operators.flowable.p4;
import io.reactivex.internal.operators.flowable.q1;
import io.reactivex.internal.operators.flowable.q2;
import io.reactivex.internal.operators.flowable.q3;
import io.reactivex.internal.operators.flowable.q4;
import io.reactivex.internal.operators.flowable.r1;
import io.reactivex.internal.operators.flowable.r2;
import io.reactivex.internal.operators.flowable.r3;
import io.reactivex.internal.operators.flowable.r4;
import io.reactivex.internal.operators.flowable.s0;
import io.reactivex.internal.operators.flowable.s1;
import io.reactivex.internal.operators.flowable.s2;
import io.reactivex.internal.operators.flowable.s3;
import io.reactivex.internal.operators.flowable.s4;
import io.reactivex.internal.operators.flowable.t2;
import io.reactivex.internal.operators.flowable.t3;
import io.reactivex.internal.operators.flowable.t4;
import io.reactivex.internal.operators.flowable.u0;
import io.reactivex.internal.operators.flowable.u1;
import io.reactivex.internal.operators.flowable.u2;
import io.reactivex.internal.operators.flowable.u3;
import io.reactivex.internal.operators.flowable.u4;
import io.reactivex.internal.operators.flowable.v0;
import io.reactivex.internal.operators.flowable.v1;
import io.reactivex.internal.operators.flowable.v3;
import io.reactivex.internal.operators.flowable.v4;
import io.reactivex.internal.operators.flowable.w0;
import io.reactivex.internal.operators.flowable.w1;
import io.reactivex.internal.operators.flowable.w2;
import io.reactivex.internal.operators.flowable.w3;
import io.reactivex.internal.operators.flowable.w4;
import io.reactivex.internal.operators.flowable.x0;
import io.reactivex.internal.operators.flowable.x1;
import io.reactivex.internal.operators.flowable.x2;
import io.reactivex.internal.operators.flowable.x3;
import io.reactivex.internal.operators.flowable.x4;
import io.reactivex.internal.operators.flowable.y0;
import io.reactivex.internal.operators.flowable.y1;
import io.reactivex.internal.operators.flowable.y2;
import io.reactivex.internal.operators.flowable.y3;
import io.reactivex.internal.operators.flowable.y4;
import io.reactivex.internal.operators.flowable.z0;
import io.reactivex.internal.operators.flowable.z1;
import io.reactivex.internal.operators.flowable.z3;
import io.reactivex.internal.operators.flowable.z4;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class l<T> implements org.reactivestreams.u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f303531a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> A0(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar, int i10) {
        return Y2(uVar).S0(io.reactivex.internal.functions.a.k(), i10);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> A3(T t10, T t11, T t12, T t13, T t14, T t15) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        io.reactivex.internal.functions.b.g(t14, "item5 is null");
        io.reactivex.internal.functions.b.g(t15, "item6 is null");
        return R2(t10, t11, t12, t13, t14, t15);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> A6(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar) {
        return Y2(uVar).p6(io.reactivex.internal.functions.a.k());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, T4, R> l<R> A8(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, org.reactivestreams.u<? extends T4> uVar4, dj.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        int i10 = 2 << 3;
        return G8(io.reactivex.internal.functions.a.z(iVar), false, Y(), uVar, uVar2, uVar3, uVar4);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> B0(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        return E0(uVar, uVar2);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> B1(Callable<? extends org.reactivestreams.u<? extends T>> callable) {
        io.reactivex.internal.functions.b.g(callable, "supplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.i0(callable));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> B3(T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        io.reactivex.internal.functions.b.g(t14, "item5 is null");
        io.reactivex.internal.functions.b.g(t15, "item6 is null");
        io.reactivex.internal.functions.b.g(t16, "item7 is null");
        return R2(t10, t11, t12, t13, t14, t15, t16);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> B6(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar, int i10) {
        return Y2(uVar).q6(io.reactivex.internal.functions.a.k(), i10);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, T4, T5, R> l<R> B8(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, org.reactivestreams.u<? extends T4> uVar4, org.reactivestreams.u<? extends T5> uVar5, dj.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(uVar5, "source5 is null");
        return G8(io.reactivex.internal.functions.a.A(jVar), false, Y(), uVar, uVar2, uVar3, uVar4, uVar5);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> C0(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2, org.reactivestreams.u<? extends T> uVar3) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        return E0(uVar, uVar2, uVar3);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> C3(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        io.reactivex.internal.functions.b.g(t14, "item5 is null");
        io.reactivex.internal.functions.b.g(t15, "item6 is null");
        io.reactivex.internal.functions.b.g(t16, "item7 is null");
        io.reactivex.internal.functions.b.g(t17, "item8 is null");
        return R2(t10, t11, t12, t13, t14, t15, t16, t17);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> C6(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar) {
        return D6(uVar, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, T4, T5, T6, R> l<R> C8(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, org.reactivestreams.u<? extends T4> uVar4, org.reactivestreams.u<? extends T5> uVar5, org.reactivestreams.u<? extends T6> uVar6, dj.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(uVar5, "source5 is null");
        io.reactivex.internal.functions.b.g(uVar6, "source6 is null");
        int i10 = 5 | 3;
        return G8(io.reactivex.internal.functions.a.B(kVar), false, Y(), uVar, uVar2, uVar3, uVar4, uVar5, uVar6);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> D0(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2, org.reactivestreams.u<? extends T> uVar3, org.reactivestreams.u<? extends T> uVar4) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        return E0(uVar, uVar2, uVar3, uVar4);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> D3(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        io.reactivex.internal.functions.b.g(t14, "item5 is null");
        io.reactivex.internal.functions.b.g(t15, "item6 is null");
        io.reactivex.internal.functions.b.g(t16, "item7 is null");
        io.reactivex.internal.functions.b.g(t17, "item8 is null");
        io.reactivex.internal.functions.b.g(t18, "item9 is null");
        return R2(t10, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> D6(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar, int i10) {
        return Y2(uVar).v6(io.reactivex.internal.functions.a.k(), i10);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, T4, T5, T6, T7, R> l<R> D8(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, org.reactivestreams.u<? extends T4> uVar4, org.reactivestreams.u<? extends T5> uVar5, org.reactivestreams.u<? extends T6> uVar6, org.reactivestreams.u<? extends T7> uVar7, dj.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(uVar5, "source5 is null");
        io.reactivex.internal.functions.b.g(uVar6, "source6 is null");
        io.reactivex.internal.functions.b.g(uVar7, "source7 is null");
        return G8(io.reactivex.internal.functions.a.C(lVar), false, Y(), uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> E0(org.reactivestreams.u<? extends T>... uVarArr) {
        if (uVarArr.length == 0) {
            return k2();
        }
        return uVarArr.length == 1 ? Y2(uVarArr[0]) : io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.v(uVarArr, false));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> E3(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        io.reactivex.internal.functions.b.g(t14, "item5 is null");
        io.reactivex.internal.functions.b.g(t15, "item6 is null");
        io.reactivex.internal.functions.b.g(t16, "item7 is null");
        io.reactivex.internal.functions.b.g(t17, "item8 is null");
        io.reactivex.internal.functions.b.g(t18, "item9 is null");
        io.reactivex.internal.functions.b.g(t19, "item10 is null");
        return R2(t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> k0<Boolean> E5(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2) {
        return H5(uVar, uVar2, io.reactivex.internal.functions.b.d(), Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l<R> E8(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, org.reactivestreams.u<? extends T4> uVar4, org.reactivestreams.u<? extends T5> uVar5, org.reactivestreams.u<? extends T6> uVar6, org.reactivestreams.u<? extends T7> uVar7, org.reactivestreams.u<? extends T8> uVar8, dj.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(uVar5, "source5 is null");
        io.reactivex.internal.functions.b.g(uVar6, "source6 is null");
        io.reactivex.internal.functions.b.g(uVar7, "source7 is null");
        io.reactivex.internal.functions.b.g(uVar8, "source8 is null");
        return G8(io.reactivex.internal.functions.a.D(mVar), false, Y(), uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> F0(org.reactivestreams.u<? extends T>... uVarArr) {
        if (uVarArr.length == 0) {
            return k2();
        }
        return uVarArr.length == 1 ? Y2(uVarArr[0]) : io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.v(uVarArr, true));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> k0<Boolean> F5(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2, int i10) {
        return H5(uVar, uVar2, io.reactivex.internal.functions.b.d(), i10);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l<R> F8(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, org.reactivestreams.u<? extends T4> uVar4, org.reactivestreams.u<? extends T5> uVar5, org.reactivestreams.u<? extends T6> uVar6, org.reactivestreams.u<? extends T7> uVar7, org.reactivestreams.u<? extends T8> uVar8, org.reactivestreams.u<? extends T9> uVar9, dj.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(uVar5, "source5 is null");
        io.reactivex.internal.functions.b.g(uVar6, "source6 is null");
        io.reactivex.internal.functions.b.g(uVar7, "source7 is null");
        io.reactivex.internal.functions.b.g(uVar8, "source8 is null");
        io.reactivex.internal.functions.b.g(uVar9, "source9 is null");
        return G8(io.reactivex.internal.functions.a.E(nVar), false, Y(), uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> G0(int i10, int i11, org.reactivestreams.u<? extends T>... uVarArr) {
        io.reactivex.internal.functions.b.g(uVarArr, "sources is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.b.h(i11, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.x(new g1(uVarArr), io.reactivex.internal.functions.a.k(), i10, i11, io.reactivex.internal.util.j.IMMEDIATE));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> k0<Boolean> G5(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2, dj.d<? super T, ? super T> dVar) {
        return H5(uVar, uVar2, dVar, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T, R> l<R> G8(dj.o<? super Object[], ? extends R> oVar, boolean z10, int i10, org.reactivestreams.u<? extends T>... uVarArr) {
        if (uVarArr.length == 0) {
            return k2();
        }
        io.reactivex.internal.functions.b.g(oVar, "zipper is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new z4(uVarArr, null, oVar, i10, z10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> H0(org.reactivestreams.u<? extends T>... uVarArr) {
        return G0(Y(), Y(), uVarArr);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> k0<Boolean> H5(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2, dj.d<? super T, ? super T> dVar, int i10) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(dVar, "isEqual is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.S(new n3(uVar, uVar2, dVar, i10));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T, R> l<R> H8(Iterable<? extends org.reactivestreams.u<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "zipper is null");
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new z4(null, iterable, oVar, i10, z10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> I0(int i10, int i11, org.reactivestreams.u<? extends T>... uVarArr) {
        return R2(uVarArr).c1(io.reactivex.internal.functions.a.k(), i10, i11, true);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> J0(org.reactivestreams.u<? extends T>... uVarArr) {
        return I0(Y(), Y(), uVarArr);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> K0(Iterable<? extends org.reactivestreams.u<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return X2(iterable).Y0(io.reactivex.internal.functions.a.k());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> L0(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar) {
        return M0(uVar, Y(), true);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> M0(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar, int i10, boolean z10) {
        return Y2(uVar).Z0(io.reactivex.internal.functions.a.k(), i10, z10);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> M3(Iterable<? extends org.reactivestreams.u<? extends T>> iterable) {
        return X2(iterable).r2(io.reactivex.internal.functions.a.k());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> N0(Iterable<? extends org.reactivestreams.u<? extends T>> iterable) {
        return O0(iterable, Y(), Y());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> N3(Iterable<? extends org.reactivestreams.u<? extends T>> iterable, int i10) {
        return X2(iterable).s2(io.reactivex.internal.functions.a.k(), i10);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static l<Integer> N4(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i11);
        }
        if (i11 == 0) {
            return k2();
        }
        if (i11 == 1) {
            return v3(Integer.valueOf(i10));
        }
        if (((long) i10) + ((long) (i11 - 1)) <= g3.f12256c) {
            return io.reactivex.plugins.a.P(new t2(i10, i11));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> O0(Iterable<? extends org.reactivestreams.u<? extends T>> iterable, int i10, int i11) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.b.h(i11, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.x(new j1(iterable), io.reactivex.internal.functions.a.k(), i10, i11, io.reactivex.internal.util.j.IMMEDIATE));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> O3(Iterable<? extends org.reactivestreams.u<? extends T>> iterable, int i10, int i11) {
        return X2(iterable).C2(io.reactivex.internal.functions.a.k(), false, i10, i11);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static l<Long> O4(long j10, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return k2();
        }
        if (j11 == 1) {
            return v3(Long.valueOf(j10));
        }
        long j12 = (j11 - 1) + j10;
        if (j10 > 0 && j12 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        return io.reactivex.plugins.a.P(new u2(j10, j11));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> P0(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar) {
        return Q0(uVar, Y(), Y());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> P3(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar) {
        return Q3(uVar, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> Q0(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar, int i10, int i11) {
        io.reactivex.internal.functions.b.g(uVar, "sources is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.b.h(i11, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.y(uVar, io.reactivex.internal.functions.a.k(), i10, i11, io.reactivex.internal.util.j.IMMEDIATE));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> Q3(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar, int i10) {
        return Y2(uVar).s2(io.reactivex.internal.functions.a.k(), i10);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> R2(T... tArr) {
        io.reactivex.internal.functions.b.g(tArr, "items is null");
        if (tArr.length == 0) {
            return k2();
        }
        return tArr.length == 1 ? v3(tArr[0]) : io.reactivex.plugins.a.P(new g1(tArr));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> R3(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        int i10 = ((7 << 2) | 0) ^ 1;
        return R2(uVar, uVar2).B2(io.reactivex.internal.functions.a.k(), false, 2);
    }

    @cj.b(cj.a.NONE)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> R7(org.reactivestreams.u<T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "onSubscribe is null");
        if (uVar instanceof l) {
            throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
        }
        return io.reactivex.plugins.a.P(new l1(uVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> S2(Callable<? extends T> callable) {
        io.reactivex.internal.functions.b.g(callable, "supplier is null");
        return io.reactivex.plugins.a.P(new h1(callable));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> S3(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2, org.reactivestreams.u<? extends T> uVar3) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        return R2(uVar, uVar2, uVar3).B2(io.reactivex.internal.functions.a.k(), false, 3);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> T2(Future<? extends T> future) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        return io.reactivex.plugins.a.P(new i1(future, 0L, null));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> T3(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2, org.reactivestreams.u<? extends T> uVar3, org.reactivestreams.u<? extends T> uVar4) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        int i10 = 3 >> 0;
        return R2(uVar, uVar2, uVar3, uVar4).B2(io.reactivex.internal.functions.a.k(), false, 4);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public static <T, D> l<T> T7(Callable<? extends D> callable, dj.o<? super D, ? extends org.reactivestreams.u<? extends T>> oVar, dj.g<? super D> gVar) {
        return U7(callable, oVar, gVar, true);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> U2(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.P(new i1(future, j10, timeUnit));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> U3(int i10, int i11, org.reactivestreams.u<? extends T>... uVarArr) {
        return R2(uVarArr).C2(io.reactivex.internal.functions.a.k(), false, i10, i11);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T, D> l<T> U7(Callable<? extends D> callable, dj.o<? super D, ? extends org.reactivestreams.u<? extends T>> oVar, dj.g<? super D> gVar, boolean z10) {
        io.reactivex.internal.functions.b.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.b.g(oVar, "sourceSupplier is null");
        io.reactivex.internal.functions.b.g(gVar, "resourceDisposer is null");
        return io.reactivex.plugins.a.P(new r4(callable, oVar, gVar, z10));
    }

    @cj.b(cj.a.FULL)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public static <T> l<T> V2(Future<? extends T> future, long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return U2(future, j10, timeUnit).l6(j0Var);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> V3(org.reactivestreams.u<? extends T>... uVarArr) {
        return R2(uVarArr).s2(io.reactivex.internal.functions.a.k(), uVarArr.length);
    }

    @cj.b(cj.a.FULL)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public static <T> l<T> W2(Future<? extends T> future, j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return T2(future).l6(j0Var);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> W3(int i10, int i11, org.reactivestreams.u<? extends T>... uVarArr) {
        return R2(uVarArr).C2(io.reactivex.internal.functions.a.k(), true, i10, i11);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> X2(Iterable<? extends T> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "source is null");
        return io.reactivex.plugins.a.P(new j1(iterable));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> X3(org.reactivestreams.u<? extends T>... uVarArr) {
        return R2(uVarArr).B2(io.reactivex.internal.functions.a.k(), true, uVarArr.length);
    }

    public static int Y() {
        return f303531a;
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> Y2(org.reactivestreams.u<? extends T> uVar) {
        if (uVar instanceof l) {
            return io.reactivex.plugins.a.P((l) uVar);
        }
        io.reactivex.internal.functions.b.g(uVar, "source is null");
        return io.reactivex.plugins.a.P(new l1(uVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> Y3(Iterable<? extends org.reactivestreams.u<? extends T>> iterable) {
        return X2(iterable).A2(io.reactivex.internal.functions.a.k(), true);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    private l<T> Z1(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, dj.a aVar2) {
        io.reactivex.internal.functions.b.g(gVar, "onNext is null");
        io.reactivex.internal.functions.b.g(gVar2, "onError is null");
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        io.reactivex.internal.functions.b.g(aVar2, "onAfterTerminate is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.r0(this, gVar, gVar2, aVar, aVar2));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> Z2(dj.g<k<T>> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "generator is null");
        return d3(io.reactivex.internal.functions.a.u(), s1.j(gVar), io.reactivex.internal.functions.a.h());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> Z3(Iterable<? extends org.reactivestreams.u<? extends T>> iterable, int i10) {
        return X2(iterable).B2(io.reactivex.internal.functions.a.k(), true, i10);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T, S> l<T> a3(Callable<S> callable, dj.b<S, k<T>> bVar) {
        io.reactivex.internal.functions.b.g(bVar, "generator is null");
        return d3(callable, s1.i(bVar), io.reactivex.internal.functions.a.h());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> a4(Iterable<? extends org.reactivestreams.u<? extends T>> iterable, int i10, int i11) {
        return X2(iterable).C2(io.reactivex.internal.functions.a.k(), true, i10, i11);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T, S> l<T> b3(Callable<S> callable, dj.b<S, k<T>> bVar, dj.g<? super S> gVar) {
        io.reactivex.internal.functions.b.g(bVar, "generator is null");
        return d3(callable, s1.i(bVar), gVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> b4(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar) {
        return c4(uVar, Y());
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> c(Iterable<? extends org.reactivestreams.u<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.h(null, iterable));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T, S> l<T> c3(Callable<S> callable, dj.c<S, k<T>, S> cVar) {
        return d3(callable, cVar, io.reactivex.internal.functions.a.h());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> c4(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar, int i10) {
        return Y2(uVar).B2(io.reactivex.internal.functions.a.k(), true, i10);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> d(org.reactivestreams.u<? extends T>... uVarArr) {
        io.reactivex.internal.functions.b.g(uVarArr, "sources is null");
        int length = uVarArr.length;
        if (length == 0) {
            return k2();
        }
        return length == 1 ? Y2(uVarArr[0]) : io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.h(uVarArr, null));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T, S> l<T> d3(Callable<S> callable, dj.c<S, k<T>, S> cVar, dj.g<? super S> gVar) {
        io.reactivex.internal.functions.b.g(callable, "initialState is null");
        io.reactivex.internal.functions.b.g(cVar, "generator is null");
        io.reactivex.internal.functions.b.g(gVar, "disposeState is null");
        return io.reactivex.plugins.a.P(new m1(callable, cVar, gVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> d4(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        return R2(uVar, uVar2).B2(io.reactivex.internal.functions.a.k(), true, 2);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T, R> l<R> e0(dj.o<? super Object[], ? extends R> oVar, org.reactivestreams.u<? extends T>... uVarArr) {
        return q0(uVarArr, oVar, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> e4(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2, org.reactivestreams.u<? extends T> uVar3) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        int i10 = 5 & 2;
        return R2(uVar, uVar2, uVar3).B2(io.reactivex.internal.functions.a.k(), true, 3);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T, R> l<R> f0(Iterable<? extends org.reactivestreams.u<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar) {
        return g0(iterable, oVar, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> f4(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<? extends T> uVar2, org.reactivestreams.u<? extends T> uVar3, org.reactivestreams.u<? extends T> uVar4) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        return R2(uVar, uVar2, uVar3, uVar4).B2(io.reactivex.internal.functions.a.k(), true, 4);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T, R> l<R> g0(Iterable<? extends org.reactivestreams.u<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        io.reactivex.internal.functions.b.g(oVar, "combiner is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        int i11 = 7 | 0;
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.u((Iterable) iterable, (dj.o) oVar, i10, false));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T1, T2, R> l<R> h0(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, dj.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        return e0(io.reactivex.internal.functions.a.x(cVar), uVar, uVar2);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, R> l<R> i0(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, dj.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        return e0(io.reactivex.internal.functions.a.y(hVar), uVar, uVar2, uVar3);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, T4, R> l<R> j0(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, org.reactivestreams.u<? extends T4> uVar4, dj.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        return e0(io.reactivex.internal.functions.a.z(iVar), uVar, uVar2, uVar3, uVar4);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, T4, T5, R> l<R> k0(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, org.reactivestreams.u<? extends T4> uVar4, org.reactivestreams.u<? extends T5> uVar5, dj.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(uVar5, "source5 is null");
        return e0(io.reactivex.internal.functions.a.A(jVar), uVar, uVar2, uVar3, uVar4, uVar5);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public static <T> l<T> k2() {
        return io.reactivex.plugins.a.P(w0.f300452b);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public static <T> l<T> k4() {
        return io.reactivex.plugins.a.P(i2.f299521b);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, T4, T5, T6, R> l<R> l0(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, org.reactivestreams.u<? extends T4> uVar4, org.reactivestreams.u<? extends T5> uVar5, org.reactivestreams.u<? extends T6> uVar6, dj.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(uVar5, "source5 is null");
        io.reactivex.internal.functions.b.g(uVar6, "source6 is null");
        return e0(io.reactivex.internal.functions.a.B(kVar), uVar, uVar2, uVar3, uVar4, uVar5, uVar6);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> l2(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "throwable is null");
        return m2(io.reactivex.internal.functions.a.m(th2));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, T4, T5, T6, T7, R> l<R> m0(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, org.reactivestreams.u<? extends T4> uVar4, org.reactivestreams.u<? extends T5> uVar5, org.reactivestreams.u<? extends T6> uVar6, org.reactivestreams.u<? extends T7> uVar7, dj.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(uVar5, "source5 is null");
        io.reactivex.internal.functions.b.g(uVar6, "source6 is null");
        io.reactivex.internal.functions.b.g(uVar7, "source7 is null");
        return e0(io.reactivex.internal.functions.a.C(lVar), uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> m2(Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.b.g(callable, "supplier is null");
        return io.reactivex.plugins.a.P(new x0(callable));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l<R> n0(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, org.reactivestreams.u<? extends T4> uVar4, org.reactivestreams.u<? extends T5> uVar5, org.reactivestreams.u<? extends T6> uVar6, org.reactivestreams.u<? extends T7> uVar7, org.reactivestreams.u<? extends T8> uVar8, dj.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(uVar5, "source5 is null");
        io.reactivex.internal.functions.b.g(uVar6, "source6 is null");
        io.reactivex.internal.functions.b.g(uVar7, "source7 is null");
        io.reactivex.internal.functions.b.g(uVar8, "source8 is null");
        int i10 = 4 ^ 4;
        return e0(io.reactivex.internal.functions.a.D(mVar), uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public static l<Long> n3(long j10, long j11, TimeUnit timeUnit) {
        return o3(j10, j11, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l<R> o0(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, org.reactivestreams.u<? extends T4> uVar4, org.reactivestreams.u<? extends T5> uVar5, org.reactivestreams.u<? extends T6> uVar6, org.reactivestreams.u<? extends T7> uVar7, org.reactivestreams.u<? extends T8> uVar8, org.reactivestreams.u<? extends T9> uVar9, dj.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(uVar5, "source5 is null");
        io.reactivex.internal.functions.b.g(uVar6, "source6 is null");
        io.reactivex.internal.functions.b.g(uVar7, "source7 is null");
        io.reactivex.internal.functions.b.g(uVar8, "source8 is null");
        io.reactivex.internal.functions.b.g(uVar9, "source9 is null");
        int i10 = 1 & 3;
        return e0(io.reactivex.internal.functions.a.E(nVar), uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9);
    }

    @cj.b(cj.a.ERROR)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public static l<Long> o3(long j10, long j11, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.t1(Math.max(0L, j10), Math.max(0L, j11), timeUnit, j0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T, R> l<R> p0(org.reactivestreams.u<? extends T>[] uVarArr, dj.o<? super Object[], ? extends R> oVar) {
        return q0(uVarArr, oVar, Y());
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public static l<Long> p3(long j10, TimeUnit timeUnit) {
        return o3(j10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T, R> l<R> q0(org.reactivestreams.u<? extends T>[] uVarArr, dj.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.b.g(uVarArr, "sources is null");
        if (uVarArr.length == 0) {
            return k2();
        }
        io.reactivex.internal.functions.b.g(oVar, "combiner is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.u((org.reactivestreams.u[]) uVarArr, (dj.o) oVar, i10, false));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.L)
    public static l<Long> q3(long j10, TimeUnit timeUnit, j0 j0Var) {
        return o3(j10, j10, timeUnit, j0Var);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T, R> l<R> r0(dj.o<? super Object[], ? extends R> oVar, int i10, org.reactivestreams.u<? extends T>... uVarArr) {
        return w0(uVarArr, oVar, i10);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public static l<Long> r3(long j10, long j11, long j12, long j13, TimeUnit timeUnit) {
        return s3(j10, j11, j12, j13, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T, R> l<R> s0(dj.o<? super Object[], ? extends R> oVar, org.reactivestreams.u<? extends T>... uVarArr) {
        return w0(uVarArr, oVar, Y());
    }

    @cj.b(cj.a.ERROR)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public static l<Long> s3(long j10, long j11, long j12, long j13, TimeUnit timeUnit, j0 j0Var) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return k2().D1(j12, timeUnit, j0Var);
        }
        long j14 = (j11 - 1) + j10;
        if (j10 > 0 && j14 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new u1(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, j0Var));
    }

    private l<T> s7(long j10, TimeUnit timeUnit, org.reactivestreams.u<? extends T> uVar, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "timeUnit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new m4(this, j10, timeUnit, j0Var, uVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T, R> l<R> t0(Iterable<? extends org.reactivestreams.u<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar) {
        return u0(iterable, oVar, Y());
    }

    private <U, V> l<T> t7(org.reactivestreams.u<U> uVar, dj.o<? super T, ? extends org.reactivestreams.u<V>> oVar, org.reactivestreams.u<? extends T> uVar2) {
        io.reactivex.internal.functions.b.g(oVar, "itemTimeoutIndicator is null");
        return io.reactivex.plugins.a.P(new l4(this, uVar, oVar, uVar2));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T, R> l<R> u0(Iterable<? extends org.reactivestreams.u<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        io.reactivex.internal.functions.b.g(oVar, "combiner is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.u((Iterable) iterable, (dj.o) oVar, i10, true));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public static l<Long> u7(long j10, TimeUnit timeUnit) {
        return v7(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T, R> l<R> u8(Iterable<? extends org.reactivestreams.u<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "zipper is null");
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.P(new z4(null, iterable, oVar, Y(), false));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T, R> l<R> v0(org.reactivestreams.u<? extends T>[] uVarArr, dj.o<? super Object[], ? extends R> oVar) {
        return w0(uVarArr, oVar, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> v3(T t10) {
        io.reactivex.internal.functions.b.g(t10, "item is null");
        return io.reactivex.plugins.a.P(new w1(t10));
    }

    @cj.b(cj.a.ERROR)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public static l<Long> v7(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new n4(Math.max(0L, j10), timeUnit, j0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T, R> l<R> v8(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar, dj.o<? super Object[], ? extends R> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "zipper is null");
        return Y2(uVar).C7().g0(s1.n(oVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T, R> l<R> w0(org.reactivestreams.u<? extends T>[] uVarArr, dj.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.b.g(uVarArr, "sources is null");
        io.reactivex.internal.functions.b.g(oVar, "combiner is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return uVarArr.length == 0 ? k2() : io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.u((org.reactivestreams.u[]) uVarArr, (dj.o) oVar, i10, true));
    }

    @cj.b(cj.a.SPECIAL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> w1(o<T> oVar, b bVar) {
        io.reactivex.internal.functions.b.g(oVar, "source is null");
        io.reactivex.internal.functions.b.g(bVar, "mode is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.f0(oVar, bVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> w3(T t10, T t11) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        return R2(t10, t11);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, R> l<R> w8(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, dj.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        return G8(io.reactivex.internal.functions.a.x(cVar), false, Y(), uVar, uVar2);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> x3(T t10, T t11, T t12) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        return R2(t10, t11, t12);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, R> l<R> x8(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, dj.c<? super T1, ? super T2, ? extends R> cVar, boolean z10) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        int i10 = 2 & 0;
        return G8(io.reactivex.internal.functions.a.x(cVar), z10, Y(), uVar, uVar2);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> y0(Iterable<? extends org.reactivestreams.u<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return X2(iterable).Z0(io.reactivex.internal.functions.a.k(), 2, false);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> y3(T t10, T t11, T t12, T t13) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        return R2(t10, t11, t12, t13);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, R> l<R> y8(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, dj.c<? super T1, ? super T2, ? extends R> cVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        return G8(io.reactivex.internal.functions.a.x(cVar), z10, i10, uVar, uVar2);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> z0(org.reactivestreams.u<? extends org.reactivestreams.u<? extends T>> uVar) {
        return A0(uVar, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> z3(T t10, T t11, T t12, T t13, T t14) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        io.reactivex.internal.functions.b.g(t14, "item5 is null");
        return R2(t10, t11, t12, t13, t14);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T1, T2, T3, R> l<R> z8(org.reactivestreams.u<? extends T1> uVar, org.reactivestreams.u<? extends T2> uVar2, org.reactivestreams.u<? extends T3> uVar3, dj.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        return G8(io.reactivex.internal.functions.a.y(hVar), false, Y(), uVar, uVar2, uVar3);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    public final void A(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, int i10) {
        io.reactivex.internal.operators.flowable.l.c(this, gVar, gVar2, io.reactivex.internal.functions.a.f298692c, i10);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> A1(T t10) {
        io.reactivex.internal.functions.b.g(t10, "defaultItem is null");
        return o6(v3(t10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> A2(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, boolean z10) {
        return C2(oVar, z10, Y(), Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> A4(dj.o<? super Throwable, ? extends org.reactivestreams.u<? extends T>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "resumeFunction is null");
        return io.reactivex.plugins.a.P(new p2(this, oVar, false));
    }

    @cj.b(cj.a.ERROR)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<T> A5(org.reactivestreams.u<U> uVar, boolean z10) {
        io.reactivex.internal.functions.b.g(uVar, "sampler is null");
        return io.reactivex.plugins.a.P(new h3(this, uVar, z10));
    }

    @cj.b(cj.a.SPECIAL)
    @cj.d
    @cj.h("none")
    public final <R> R A7(dj.o<? super l<T>, R> oVar) {
        try {
            return (R) ((dj.o) io.reactivex.internal.functions.b.g(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    public final void B(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar) {
        io.reactivex.internal.operators.flowable.l.b(this, gVar, gVar2, aVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> B2(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, boolean z10, int i10) {
        return C2(oVar, z10, i10, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> B4(org.reactivestreams.u<? extends T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "next is null");
        return A4(io.reactivex.internal.functions.a.n(uVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> B5(dj.c<T, T, T> cVar) {
        io.reactivex.internal.functions.b.g(cVar, "accumulator is null");
        return io.reactivex.plugins.a.P(new k3(this, cVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final Future<T> B7() {
        return (Future) n6(new io.reactivex.internal.subscribers.j());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    public final void C(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, int i10) {
        io.reactivex.internal.operators.flowable.l.c(this, gVar, gVar2, aVar, i10);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> C1(long j10, TimeUnit timeUnit) {
        return E1(j10, timeUnit, io.reactivex.schedulers.b.a(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> C2(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, boolean z10, int i10, int i11) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.b.h(i11, "bufferSize");
        if (!(this instanceof ej.m)) {
            return io.reactivex.plugins.a.P(new z0(this, oVar, z10, i10, i11));
        }
        Object objCall = ((ej.m) this).call();
        return objCall == null ? k2() : j3.a(objCall, oVar);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> C4(dj.o<? super Throwable, ? extends T> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "valueSupplier is null");
        return io.reactivex.plugins.a.P(new q2(this, oVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> C5(R r10, dj.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.b.g(r10, "initialValue is null");
        return D5(io.reactivex.internal.functions.a.m(r10), cVar);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final k0<List<T>> C7() {
        return io.reactivex.plugins.a.S(new p4(this));
    }

    @cj.b(cj.a.SPECIAL)
    @cj.h("none")
    public final void D(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.internal.operators.flowable.l.d(this, vVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> D1(long j10, TimeUnit timeUnit, j0 j0Var) {
        return E1(j10, timeUnit, j0Var, false);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final c D2(dj.o<? super T, ? extends i> oVar) {
        return E2(oVar, false, Integer.MAX_VALUE);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> D4(T t10) {
        io.reactivex.internal.functions.b.g(t10, "item is null");
        return C4(io.reactivex.internal.functions.a.n(t10));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> D5(Callable<R> callable, dj.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.b.g(callable, "seedSupplier is null");
        io.reactivex.internal.functions.b.g(cVar, "accumulator is null");
        return io.reactivex.plugins.a.P(new l3(this, callable, cVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final k0<List<T>> D7(int i10) {
        io.reactivex.internal.functions.b.h(i10, "capacityHint");
        return io.reactivex.plugins.a.S(new p4(this, io.reactivex.internal.functions.a.f(i10)));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<List<T>> E(int i10) {
        return F(i10, i10);
    }

    @cj.b(cj.a.FULL)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> E1(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.j0(this, Math.max(0L, j10), timeUnit, j0Var, z10));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final c E2(dj.o<? super T, ? extends i> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.O(new b1(this, oVar, z10, i10));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> E4(org.reactivestreams.u<? extends T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "next is null");
        return io.reactivex.plugins.a.P(new p2(this, io.reactivex.internal.functions.a.n(uVar), true));
    }

    @cj.b(cj.a.SPECIAL)
    @cj.d
    @cj.h("none")
    public final l<T> E6(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.P(new a4(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final <U extends Collection<? super T>> k0<U> E7(Callable<U> callable) {
        io.reactivex.internal.functions.b.g(callable, "collectionSupplier is null");
        return io.reactivex.plugins.a.S(new p4(this, callable));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<List<T>> F(int i10, int i11) {
        return (l<List<T>>) G(i10, i11, io.reactivex.internal.util.b.k());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> F1(long j10, TimeUnit timeUnit, boolean z10) {
        return E1(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <U> l<U> F2(dj.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return G2(oVar, Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final k0<T> F3(T t10) {
        io.reactivex.internal.functions.b.g(t10, "defaultItem");
        return io.reactivex.plugins.a.S(new y1(this, t10));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> F4() {
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.m0(this));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> F6(long j10, TimeUnit timeUnit) {
        return R6(u7(j10, timeUnit));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <K> k0<Map<K, T>> F7(dj.o<? super T, ? extends K> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        return (k0<Map<K, T>>) c0(io.reactivex.internal.util.m.k(), io.reactivex.internal.functions.a.F(oVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U extends Collection<? super T>> l<U> G(int i10, int i11, Callable<U> callable) {
        io.reactivex.internal.functions.b.h(i10, "count");
        io.reactivex.internal.functions.b.h(i11, ActionType.SKIP);
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.m(this, i10, i11, callable));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<T> G1(dj.o<? super T, ? extends org.reactivestreams.u<U>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "itemDelayIndicator is null");
        return (l<T>) r2(s1.c(oVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<U> G2(dj.o<? super T, ? extends Iterable<? extends U>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new f1(this, oVar, i10));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final s<T> G3() {
        return io.reactivex.plugins.a.Q(new x1(this));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final io.reactivex.parallel.b<T> G4() {
        return io.reactivex.parallel.b.y(this);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> G6(long j10, TimeUnit timeUnit, j0 j0Var) {
        return R6(v7(j10, timeUnit, j0Var));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <K, V> k0<Map<K, V>> G7(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.b.g(oVar2, "valueSelector is null");
        return (k0<Map<K, V>>) c0(io.reactivex.internal.util.m.k(), io.reactivex.internal.functions.a.G(oVar, oVar2));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <U extends Collection<? super T>> l<U> H(int i10, Callable<U> callable) {
        return G(i10, i10, callable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <U, V> l<T> H1(org.reactivestreams.u<U> uVar, dj.o<? super T, ? extends org.reactivestreams.u<V>> oVar) {
        return K1(uVar).G1(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U, V> l<V> H2(dj.o<? super T, ? extends Iterable<? extends U>> oVar, dj.c<? super T, ? super U, ? extends V> cVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.g(cVar, "resultSelector is null");
        return (l<V>) x2(s1.a(oVar), cVar, false, Y(), Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final k0<T> H3() {
        return io.reactivex.plugins.a.S(new y1(this, null));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final io.reactivex.parallel.b<T> H4(int i10) {
        io.reactivex.internal.functions.b.h(i10, "parallelism");
        return io.reactivex.parallel.b.z(this, i10);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> H6(int i10) {
        if (i10 >= 0) {
            if (i10 == 0) {
                return io.reactivex.plugins.a.P(new q1(this));
            }
            return i10 == 1 ? io.reactivex.plugins.a.P(new c4(this)) : io.reactivex.plugins.a.P(new b4(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <K, V> k0<Map<K, V>> H7(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, V>> callable) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.b.g(oVar2, "valueSelector is null");
        return (k0<Map<K, V>>) c0(callable, io.reactivex.internal.functions.a.G(oVar, oVar2));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<List<T>> I(long j10, long j11, TimeUnit timeUnit) {
        return (l<List<T>>) K(j10, j11, timeUnit, io.reactivex.schedulers.b.a(), io.reactivex.internal.util.b.k());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> I1(long j10, TimeUnit timeUnit) {
        return J1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U, V> l<V> I2(dj.o<? super T, ? extends Iterable<? extends U>> oVar, dj.c<? super T, ? super U, ? extends V> cVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.g(cVar, "resultSelector is null");
        return (l<V>) x2(s1.a(oVar), cVar, false, Y(), i10);
    }

    @cj.b(cj.a.SPECIAL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> I3(p<? extends R, ? super T> pVar) {
        io.reactivex.internal.functions.b.g(pVar, "lifter is null");
        return io.reactivex.plugins.a.P(new z1(this, pVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final io.reactivex.parallel.b<T> I4(int i10, int i11) {
        io.reactivex.internal.functions.b.h(i10, "parallelism");
        io.reactivex.internal.functions.b.h(i11, t1.b.f296115c);
        return io.reactivex.parallel.b.A(this, i10, i11);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> I5() {
        return io.reactivex.plugins.a.P(new o3(this));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> I6(long j10, long j11, TimeUnit timeUnit) {
        return K6(j10, j11, timeUnit, io.reactivex.schedulers.b.a(), false, Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final <K> k0<Map<K, Collection<T>>> I7(dj.o<? super T, ? extends K> oVar) {
        return (k0<Map<K, Collection<T>>>) L7(oVar, io.reactivex.internal.functions.a.k(), io.reactivex.internal.util.m.k(), io.reactivex.internal.util.b.l());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U, R> l<R> I8(Iterable<U> iterable, dj.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(iterable, "other is null");
        io.reactivex.internal.functions.b.g(cVar, "zipper is null");
        return io.reactivex.plugins.a.P(new a5(this, iterable, cVar));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.L)
    public final l<List<T>> J(long j10, long j11, TimeUnit timeUnit, j0 j0Var) {
        return (l<List<T>>) K(j10, j11, timeUnit, j0Var, io.reactivex.internal.util.b.k());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> J1(long j10, TimeUnit timeUnit, j0 j0Var) {
        return K1(v7(j10, timeUnit, j0Var));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final <R> l<R> J2(dj.o<? super T, ? extends y<? extends R>> oVar) {
        return K2(oVar, false, Integer.MAX_VALUE);
    }

    @cj.b(cj.a.SPECIAL)
    @cj.d
    @cj.h("none")
    public final l<T> J3(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.P(new a2(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> J4(dj.o<? super l<T>, ? extends org.reactivestreams.u<R>> oVar) {
        return K4(oVar, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> J5() {
        return L4().R8();
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> J6(long j10, long j11, TimeUnit timeUnit, j0 j0Var) {
        return K6(j10, j11, timeUnit, j0Var, false, Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final <K, V> k0<Map<K, Collection<V>>> J7(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2) {
        return L7(oVar, oVar2, io.reactivex.internal.util.m.k(), io.reactivex.internal.util.b.l());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U, R> l<R> J8(org.reactivestreams.u<? extends U> uVar, dj.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return w8(this, uVar, cVar);
    }

    @cj.b(cj.a.ERROR)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final <U extends Collection<? super T>> l<U> K(long j10, long j11, TimeUnit timeUnit, j0 j0Var, Callable<U> callable) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.q(this, j10, j11, timeUnit, j0Var, callable, Integer.MAX_VALUE, false));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<T> K1(org.reactivestreams.u<U> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "subscriptionIndicator is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.k0(this, uVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> K2(dj.o<? super T, ? extends y<? extends R>> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.P(new c1(this, oVar, z10, i10));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> K3(dj.o<? super T, ? extends R> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new b2(this, oVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> K4(dj.o<? super l<T>, ? extends org.reactivestreams.u<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new s2(this, oVar, i10, false));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final k0<T> K5(T t10) {
        io.reactivex.internal.functions.b.g(t10, "defaultItem is null");
        return io.reactivex.plugins.a.S(new r3(this, t10));
    }

    @cj.b(cj.a.FULL)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> K6(long j10, long j11, TimeUnit timeUnit, j0 j0Var, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        if (j10 >= 0) {
            return io.reactivex.plugins.a.P(new d4(this, j10, j11, timeUnit, j0Var, i10, z10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j10);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final <K, V> k0<Map<K, Collection<V>>> K7(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, Callable<Map<K, Collection<V>>> callable) {
        return L7(oVar, oVar2, callable, io.reactivex.internal.util.b.l());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <U, R> l<R> K8(org.reactivestreams.u<? extends U> uVar, dj.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return x8(this, uVar, cVar, z10);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @Deprecated
    @cj.d
    public final <T2> l<T2> L1() {
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.l0(this, io.reactivex.internal.functions.a.k()));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final <R> l<R> L2(dj.o<? super T, ? extends q0<? extends R>> oVar) {
        return M2(oVar, false, Integer.MAX_VALUE);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<a0<T>> L3() {
        return io.reactivex.plugins.a.P(new e2(this));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final io.reactivex.flowables.a<T> L4() {
        return M4(Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final s<T> L5() {
        return io.reactivex.plugins.a.Q(new q3(this));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> L6(long j10, TimeUnit timeUnit) {
        return O6(j10, timeUnit, io.reactivex.schedulers.b.a(), false, Y());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <K, V> k0<Map<K, Collection<V>>> L7(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, Collection<V>>> callable, dj.o<? super K, ? extends Collection<? super V>> oVar3) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.b.g(oVar2, "valueSelector is null");
        io.reactivex.internal.functions.b.g(callable, "mapSupplier is null");
        io.reactivex.internal.functions.b.g(oVar3, "collectionFactory is null");
        return (k0<Map<K, Collection<V>>>) c0(callable, io.reactivex.internal.functions.a.H(oVar, oVar2, oVar3));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <U, R> l<R> L8(org.reactivestreams.u<? extends U> uVar, dj.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return y8(this, uVar, cVar, z10, i10);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<List<T>> M(long j10, TimeUnit timeUnit) {
        return P(j10, timeUnit, io.reactivex.schedulers.b.a(), Integer.MAX_VALUE);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.e
    @cj.d
    public final <R> l<R> M1(dj.o<? super T, a0<R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.l0(this, oVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> M2(dj.o<? super T, ? extends q0<? extends R>> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.P(new e1(this, oVar, z10, i10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final io.reactivex.flowables.a<T> M4(int i10) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return r2.X8(this, i10);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final k0<T> M5() {
        return io.reactivex.plugins.a.S(new r3(this, null));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> M6(long j10, TimeUnit timeUnit, j0 j0Var) {
        return O6(j10, timeUnit, j0Var, false, Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final b0<T> M7() {
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.g1(this));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<List<T>> N(long j10, TimeUnit timeUnit, int i10) {
        return P(j10, timeUnit, io.reactivex.schedulers.b.a(), i10);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> N1() {
        return P1(io.reactivex.internal.functions.a.k(), io.reactivex.internal.functions.a.g());
    }

    @cj.b(cj.a.NONE)
    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c N2(dj.g<? super T> gVar) {
        return f6(gVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> N5(long j10) {
        return j10 <= 0 ? io.reactivex.plugins.a.P(this) : io.reactivex.plugins.a.P(new s3(this, j10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> N6(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10) {
        return O6(j10, timeUnit, j0Var, z10, Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final k0<List<T>> N7() {
        return P7(io.reactivex.internal.functions.a.p());
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.L)
    public final l<List<T>> O(long j10, TimeUnit timeUnit, j0 j0Var) {
        int i10 = 2 >> 0;
        return (l<List<T>>) Q(j10, timeUnit, j0Var, Integer.MAX_VALUE, io.reactivex.internal.util.b.k(), false);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <K> l<T> O1(dj.o<? super T, K> oVar) {
        return P1(oVar, io.reactivex.internal.functions.a.g());
    }

    @cj.b(cj.a.NONE)
    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c O2(dj.r<? super T> rVar) {
        return Q2(rVar, io.reactivex.internal.functions.a.f298695f, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> O5(long j10, TimeUnit timeUnit) {
        return W5(u7(j10, timeUnit));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> O6(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10, int i10) {
        return K6(Long.MAX_VALUE, j10, timeUnit, j0Var, z10, i10);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final k0<List<T>> O7(int i10) {
        return Q7(io.reactivex.internal.functions.a.p(), i10);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.L)
    public final l<List<T>> P(long j10, TimeUnit timeUnit, j0 j0Var, int i10) {
        return (l<List<T>>) Q(j10, timeUnit, j0Var, i10, io.reactivex.internal.util.b.k(), false);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <K> l<T> P1(dj.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.b.g(callable, "collectionSupplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.n0(this, oVar, callable));
    }

    @cj.b(cj.a.NONE)
    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c P2(dj.r<? super T> rVar, dj.g<? super Throwable> gVar) {
        return Q2(rVar, gVar, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> P4(int i10) {
        return n4(io.reactivex.internal.schedulers.e.f303224b, true, i10);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> P5(long j10, TimeUnit timeUnit, j0 j0Var) {
        return W5(v7(j10, timeUnit, j0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> P6(long j10, TimeUnit timeUnit, boolean z10) {
        return O6(j10, timeUnit, io.reactivex.schedulers.b.a(), z10, Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final k0<List<T>> P7(Comparator<? super T> comparator) {
        io.reactivex.internal.functions.b.g(comparator, "comparator is null");
        return (k0<List<T>>) C7().u0(io.reactivex.internal.functions.a.o(comparator));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.L)
    public final <U extends Collection<? super T>> l<U> Q(long j10, TimeUnit timeUnit, j0 j0Var, int i10, Callable<U> callable, boolean z10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        io.reactivex.internal.functions.b.h(i10, "count");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.q(this, j10, j10, timeUnit, j0Var, callable, i10, z10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> Q1() {
        return S1(io.reactivex.internal.functions.a.k());
    }

    @cj.b(cj.a.NONE)
    @cj.h("none")
    @cj.f
    @cj.d
    public final io.reactivex.disposables.c Q2(dj.r<? super T> rVar, dj.g<? super Throwable> gVar, dj.a aVar) {
        io.reactivex.internal.functions.b.g(rVar, "onNext is null");
        io.reactivex.internal.functions.b.g(gVar, "onError is null");
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        io.reactivex.internal.subscribers.i iVar = new io.reactivex.internal.subscribers.i(rVar, gVar, aVar);
        j6(iVar);
        return iVar;
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final s<T> Q4(dj.c<T, T, T> cVar) {
        io.reactivex.internal.functions.b.g(cVar, "reducer is null");
        return io.reactivex.plugins.a.Q(new w2(this, cVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> Q5(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? io.reactivex.plugins.a.P(this) : io.reactivex.plugins.a.P(new t3(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> Q6(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "stopPredicate is null");
        return io.reactivex.plugins.a.P(new g4(this, rVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final k0<List<T>> Q7(Comparator<? super T> comparator, int i10) {
        io.reactivex.internal.functions.b.g(comparator, "comparator is null");
        return (k0<List<T>>) D7(i10).u0(io.reactivex.internal.functions.a.o(comparator));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final <TOpening, TClosing> l<List<T>> R(l<? extends TOpening> lVar, dj.o<? super TOpening, ? extends org.reactivestreams.u<? extends TClosing>> oVar) {
        return (l<List<T>>) S(lVar, oVar, io.reactivex.internal.util.b.k());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> R0(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar) {
        return S0(oVar, 2);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> R1(dj.d<? super T, ? super T> dVar) {
        io.reactivex.internal.functions.b.g(dVar, "comparer is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.o0(this, io.reactivex.internal.functions.a.k(), dVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> k0<R> R4(R r10, dj.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.b.g(r10, "seed is null");
        io.reactivex.internal.functions.b.g(cVar, "reducer is null");
        return io.reactivex.plugins.a.S(new x2(this, r10, cVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final l<T> R5(long j10, TimeUnit timeUnit) {
        return U5(j10, timeUnit, io.reactivex.schedulers.b.a(), false, Y());
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<T> R6(org.reactivestreams.u<U> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return io.reactivex.plugins.a.P(new f4(this, uVar));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final <TOpening, TClosing, U extends Collection<? super T>> l<U> S(l<? extends TOpening> lVar, dj.o<? super TOpening, ? extends org.reactivestreams.u<? extends TClosing>> oVar, Callable<U> callable) {
        io.reactivex.internal.functions.b.g(lVar, "openingIndicator is null");
        io.reactivex.internal.functions.b.g(oVar, "closingIndicator is null");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.n(this, lVar, oVar, callable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> S0(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        if (!(this instanceof ej.m)) {
            return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.w(this, oVar, i10, io.reactivex.internal.util.j.IMMEDIATE));
        }
        Object objCall = ((ej.m) this).call();
        return objCall == null ? k2() : j3.a(objCall, oVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <K> l<T> S1(dj.o<? super T, K> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.o0(this, oVar, io.reactivex.internal.functions.b.d()));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> k0<R> S4(Callable<R> callable, dj.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.b.g(callable, "seedSupplier is null");
        io.reactivex.internal.functions.b.g(cVar, "reducer is null");
        return io.reactivex.plugins.a.S(new y2(this, callable, cVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> S5(long j10, TimeUnit timeUnit, j0 j0Var) {
        return U5(j10, timeUnit, j0Var, false, Y());
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> S6(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.P(new h4(this, rVar));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> S7(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new q4(this, j0Var));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final <B> l<List<T>> T(Callable<? extends org.reactivestreams.u<B>> callable) {
        return (l<List<T>>) U(callable, io.reactivex.internal.util.b.k());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final c T0(dj.o<? super T, ? extends i> oVar) {
        return U0(oVar, 2);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> T1(dj.g<? super T> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onAfterNext is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.p0(this, gVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> T4() {
        return U4(Long.MAX_VALUE);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> T5(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10) {
        return U5(j10, timeUnit, j0Var, z10, Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final io.reactivex.subscribers.f<T> T6() {
        io.reactivex.subscribers.f<T> fVar = new io.reactivex.subscribers.f<>();
        j6(fVar);
        return fVar;
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final <B, U extends Collection<? super T>> l<U> U(Callable<? extends org.reactivestreams.u<B>> callable, Callable<U> callable2) {
        io.reactivex.internal.functions.b.g(callable, "boundaryIndicatorSupplier is null");
        io.reactivex.internal.functions.b.g(callable2, "bufferSupplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.o(this, callable, callable2));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final c U0(dj.o<? super T, ? extends i> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.c(this, oVar, io.reactivex.internal.util.j.IMMEDIATE, i10));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> U1(dj.a aVar) {
        return Z1(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298692c, aVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> U4(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? k2() : io.reactivex.plugins.a.P(new a3(this, j10));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> U5(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new u3(this, j10, timeUnit, j0Var, i10 << 1, z10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final io.reactivex.subscribers.f<T> U6(long j10) {
        io.reactivex.subscribers.f<T> fVar = new io.reactivex.subscribers.f<>(j10);
        j6(fVar);
        return fVar;
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final <B> l<List<T>> V(org.reactivestreams.u<B> uVar) {
        return (l<List<T>>) X(uVar, io.reactivex.internal.util.b.k());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final c V0(dj.o<? super T, ? extends i> oVar) {
        return X0(oVar, true, 2);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> V1(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onFinally is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.q0(this, aVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> V4(dj.e eVar) {
        io.reactivex.internal.functions.b.g(eVar, "stop is null");
        return io.reactivex.plugins.a.P(new b3(this, eVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final l<T> V5(long j10, TimeUnit timeUnit, boolean z10) {
        return U5(j10, timeUnit, io.reactivex.schedulers.b.a(), z10, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final io.reactivex.subscribers.f<T> V6(long j10, boolean z10) {
        io.reactivex.subscribers.f<T> fVar = new io.reactivex.subscribers.f<>(j10);
        if (z10) {
            fVar.cancel();
        }
        j6(fVar);
        return fVar;
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<l<T>> V7(long j10) {
        return X7(j10, j10, Y());
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final <B> l<List<T>> W(org.reactivestreams.u<B> uVar, int i10) {
        io.reactivex.internal.functions.b.h(i10, "initialCapacity");
        return (l<List<T>>) X(uVar, io.reactivex.internal.functions.a.f(i10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final c W0(dj.o<? super T, ? extends i> oVar, boolean z10) {
        return X0(oVar, z10, 2);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> W1(dj.a aVar) {
        return c2(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298696g, aVar);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> W4(dj.o<? super l<Object>, ? extends org.reactivestreams.u<?>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "handler is null");
        return io.reactivex.plugins.a.P(new c3(this, oVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<T> W5(org.reactivestreams.u<U> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return io.reactivex.plugins.a.P(new v3(this, uVar));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> W6(long j10, TimeUnit timeUnit) {
        return X6(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<l<T>> W7(long j10, long j11) {
        return X7(j10, j11, Y());
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final <B, U extends Collection<? super T>> l<U> X(org.reactivestreams.u<B> uVar, Callable<U> callable) {
        io.reactivex.internal.functions.b.g(uVar, "boundaryIndicator is null");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.p(this, uVar, callable));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final c X0(dj.o<? super T, ? extends i> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.c(this, oVar, z10 ? io.reactivex.internal.util.j.END : io.reactivex.internal.util.j.BOUNDARY, i10));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> X1(dj.a aVar) {
        return Z1(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), aVar, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> X4(dj.o<? super l<T>, ? extends org.reactivestreams.u<R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        return d3.c9(s1.d(this), oVar);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> X5(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.P(new w3(this, rVar));
    }

    @cj.b(cj.a.ERROR)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> X6(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new i4(this, j10, timeUnit, j0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<l<T>> X7(long j10, long j11, int i10) {
        io.reactivex.internal.functions.b.i(j11, ActionType.SKIP);
        io.reactivex.internal.functions.b.i(j10, "count");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new s4(this, j10, j11, i10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> Y0(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar) {
        return Z0(oVar, 2, true);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> Y1(dj.g<? super a0<T>> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onNotification is null");
        return Z1(io.reactivex.internal.functions.a.t(gVar), io.reactivex.internal.functions.a.s(gVar), io.reactivex.internal.functions.a.r(gVar), io.reactivex.internal.functions.a.f298692c);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> Y4(dj.o<? super l<T>, ? extends org.reactivestreams.u<R>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return d3.c9(s1.e(this, i10), oVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> Y5() {
        return C7().u1().K3(io.reactivex.internal.functions.a.o(io.reactivex.internal.functions.a.p())).F2(io.reactivex.internal.functions.a.k());
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> Y6(long j10, TimeUnit timeUnit) {
        return v5(j10, timeUnit);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<l<T>> Y7(long j10, long j11, TimeUnit timeUnit) {
        return a8(j10, j11, timeUnit, io.reactivex.schedulers.b.a(), Y());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> Z() {
        return a0(16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> Z0(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, boolean z10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        if (!(this instanceof ej.m)) {
            return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.w(this, oVar, i10, z10 ? io.reactivex.internal.util.j.END : io.reactivex.internal.util.j.BOUNDARY));
        }
        Object objCall = ((ej.m) this).call();
        return objCall == null ? k2() : j3.a(objCall, oVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.M)
    public final <R> l<R> Z4(dj.o<? super l<T>, ? extends org.reactivestreams.u<R>> oVar, int i10, long j10, TimeUnit timeUnit) {
        return a5(oVar, i10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> Z5(Comparator<? super T> comparator) {
        io.reactivex.internal.functions.b.g(comparator, "sortFunction");
        return C7().u1().K3(io.reactivex.internal.functions.a.o(comparator)).F2(io.reactivex.internal.functions.a.k());
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> Z6(long j10, TimeUnit timeUnit, j0 j0Var) {
        return w5(j10, timeUnit, j0Var);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.L)
    public final l<l<T>> Z7(long j10, long j11, TimeUnit timeUnit, j0 j0Var) {
        return a8(j10, j11, timeUnit, j0Var, Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final k0<Boolean> a(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.flowable.g(this, rVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> a0(int i10) {
        io.reactivex.internal.functions.b.h(i10, "initialCapacity");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.r(this, i10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> a1(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar) {
        return b1(oVar, Y(), Y());
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> a2(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.internal.functions.b.g(vVar, "subscriber is null");
        return Z1(s1.m(vVar), s1.l(vVar), s1.k(vVar), io.reactivex.internal.functions.a.f298692c);
    }

    @cj.b(cj.a.FULL)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final <R> l<R> a5(dj.o<? super l<T>, ? extends org.reactivestreams.u<R>> oVar, int i10, long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return d3.c9(s1.f(this, i10, j10, timeUnit, j0Var), oVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> a6(Iterable<? extends T> iterable) {
        int i10 = 7 | 0;
        return E0(X2(iterable), this);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> a7(long j10, TimeUnit timeUnit) {
        return c7(j10, timeUnit, io.reactivex.schedulers.b.a(), false);
    }

    @cj.b(cj.a.ERROR)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<l<T>> a8(long j10, long j11, TimeUnit timeUnit, j0 j0Var, int i10) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        io.reactivex.internal.functions.b.i(j10, "timespan");
        io.reactivex.internal.functions.b.i(j11, "timeskip");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.P(new w4(this, j10, j11, timeUnit, j0Var, Long.MAX_VALUE, i10, false));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<U> b0(Class<U> cls) {
        io.reactivex.internal.functions.b.g(cls, "clazz is null");
        return (l<U>) K3(io.reactivex.internal.functions.a.e(cls));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> b1(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, int i11) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.b.h(i11, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.x(this, oVar, i10, i11, io.reactivex.internal.util.j.IMMEDIATE));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> b2(dj.g<? super Throwable> gVar) {
        dj.g<? super T> gVarH = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return Z1(gVarH, gVar, aVar, aVar);
    }

    @cj.b(cj.a.FULL)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final <R> l<R> b5(dj.o<? super l<T>, ? extends org.reactivestreams.u<R>> oVar, int i10, j0 j0Var) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return d3.c9(s1.e(this, i10), s1.h(oVar, j0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> b6(T t10) {
        io.reactivex.internal.functions.b.g(t10, "value is null");
        return E0(v3(t10), this);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> b7(long j10, TimeUnit timeUnit, j0 j0Var) {
        return c7(j10, timeUnit, j0Var, false);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<l<T>> b8(long j10, TimeUnit timeUnit) {
        return g8(j10, timeUnit, io.reactivex.schedulers.b.a(), Long.MAX_VALUE, false);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> k0<U> c0(Callable<? extends U> callable, dj.b<? super U, ? super T> bVar) {
        io.reactivex.internal.functions.b.g(callable, "initialItemSupplier is null");
        io.reactivex.internal.functions.b.g(bVar, "collector is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.flowable.t(this, callable, bVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> c1(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, int i11, boolean z10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.b.h(i11, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.x(this, oVar, i10, i11, z10 ? io.reactivex.internal.util.j.END : io.reactivex.internal.util.j.BOUNDARY));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> c2(dj.g<? super org.reactivestreams.w> gVar, dj.q qVar, dj.a aVar) {
        io.reactivex.internal.functions.b.g(gVar, "onSubscribe is null");
        io.reactivex.internal.functions.b.g(qVar, "onRequest is null");
        io.reactivex.internal.functions.b.g(aVar, "onCancel is null");
        return io.reactivex.plugins.a.P(new s0(this, gVar, qVar, aVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.M)
    public final <R> l<R> c5(dj.o<? super l<T>, ? extends org.reactivestreams.u<R>> oVar, long j10, TimeUnit timeUnit) {
        return d5(oVar, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> c6(org.reactivestreams.u<? extends T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return E0(uVar, this);
    }

    @cj.b(cj.a.ERROR)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> c7(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new j4(this, j10, timeUnit, j0Var, z10));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<l<T>> c8(long j10, TimeUnit timeUnit, long j11) {
        return g8(j10, timeUnit, io.reactivex.schedulers.b.a(), j11, false);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> k0<U> d0(U u10, dj.b<? super U, ? super T> bVar) {
        io.reactivex.internal.functions.b.g(u10, "initialItem is null");
        return c0(io.reactivex.internal.functions.a.m(u10), bVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> d1(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, boolean z10) {
        return c1(oVar, Y(), Y(), z10);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> d2(dj.g<? super T> gVar) {
        dj.g<? super Throwable> gVarH = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return Z1(gVar, gVarH, aVar, aVar);
    }

    @cj.b(cj.a.FULL)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final <R> l<R> d5(dj.o<? super l<T>, ? extends org.reactivestreams.u<R>> oVar, long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return d3.c9(s1.g(this, j10, timeUnit, j0Var), oVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> d6(T... tArr) {
        l lVarR2 = R2(tArr);
        return lVarR2 == k2() ? io.reactivex.plugins.a.P(this) : E0(lVarR2, this);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> d7(long j10, TimeUnit timeUnit, boolean z10) {
        return c7(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<l<T>> d8(long j10, TimeUnit timeUnit, long j11, boolean z10) {
        return g8(j10, timeUnit, io.reactivex.schedulers.b.a(), j11, z10);
    }

    @Override // org.reactivestreams.u
    @cj.b(cj.a.SPECIAL)
    @cj.h("none")
    public final void e(org.reactivestreams.v<? super T> vVar) {
        if (vVar instanceof q) {
            j6((q) vVar);
        } else {
            io.reactivex.internal.functions.b.g(vVar, "s is null");
            j6(new io.reactivex.internal.subscribers.u(vVar));
        }
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <U> l<U> e1(dj.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return f1(oVar, 2);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> e2(dj.q qVar) {
        return c2(io.reactivex.internal.functions.a.h(), qVar, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <K> l<io.reactivex.flowables.b<K, T>> e3(dj.o<? super T, ? extends K> oVar) {
        return (l<io.reactivex.flowables.b<K, T>>) h3(oVar, io.reactivex.internal.functions.a.k(), false, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final <R> l<R> e5(dj.o<? super l<T>, ? extends org.reactivestreams.u<R>> oVar, j0 j0Var) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return d3.c9(s1.d(this), s1.h(oVar, j0Var));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    public final io.reactivex.disposables.c e6() {
        return i6(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298695f, io.reactivex.internal.functions.a.f298692c, s1.i.INSTANCE);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> e7(long j10, TimeUnit timeUnit) {
        return x1(j10, timeUnit);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.L)
    public final l<l<T>> e8(long j10, TimeUnit timeUnit, j0 j0Var) {
        return g8(j10, timeUnit, j0Var, Long.MAX_VALUE, false);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> f(org.reactivestreams.u<? extends T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return d(this, uVar);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<U> f1(dj.o<? super T, ? extends Iterable<? extends U>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new f1(this, oVar, i10));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> f2(dj.g<? super org.reactivestreams.w> gVar) {
        return c2(gVar, io.reactivex.internal.functions.a.f298696g, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <K, V> l<io.reactivex.flowables.b<K, V>> f3(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2) {
        return h3(oVar, oVar2, false, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final io.reactivex.flowables.a<T> f5() {
        return d3.b9(this);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c f6(dj.g<? super T> gVar) {
        return i6(gVar, io.reactivex.internal.functions.a.f298695f, io.reactivex.internal.functions.a.f298692c, s1.i.INSTANCE);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> f7(long j10, TimeUnit timeUnit, j0 j0Var) {
        return y1(j10, timeUnit, j0Var);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.L)
    public final l<l<T>> f8(long j10, TimeUnit timeUnit, j0 j0Var, long j11) {
        return g8(j10, timeUnit, j0Var, j11, false);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final k0<Boolean> g(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.flowable.j(this, rVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> g1(dj.o<? super T, ? extends y<? extends R>> oVar) {
        return h1(oVar, 2);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> g2(dj.a aVar) {
        return Z1(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.a(aVar), aVar, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <K, V> l<io.reactivex.flowables.b<K, V>> g3(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, boolean z10) {
        return h3(oVar, oVar2, z10, Y());
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> g4(@cj.f i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        return io.reactivex.plugins.a.P(new f2(this, iVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final io.reactivex.flowables.a<T> g5(int i10) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return d3.X8(this, i10);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c g6(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2) {
        return i6(gVar, gVar2, io.reactivex.internal.functions.a.f298692c, s1.i.INSTANCE);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<io.reactivex.schedulers.d<T>> g7() {
        return j7(TimeUnit.MILLISECONDS, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.L)
    public final l<l<T>> g8(long j10, TimeUnit timeUnit, j0 j0Var, long j11, boolean z10) {
        return h8(j10, timeUnit, j0Var, j11, z10, Y());
    }

    @cj.b(cj.a.SPECIAL)
    @cj.d
    @cj.h("none")
    public final <R> R h(@cj.f m<T, ? extends R> mVar) {
        return (R) ((m) io.reactivex.internal.functions.b.g(mVar, "converter is null")).a(this);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> h1(dj.o<? super T, ? extends y<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.mixed.d(this, oVar, io.reactivex.internal.util.j.IMMEDIATE, i10));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final s<T> h2(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.Q(new u0(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <K, V> l<io.reactivex.flowables.b<K, V>> h3(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.b.g(oVar2, "valueSelector is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new n1(this, oVar, oVar2, i10, z10, null));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> h4(@cj.f y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "other is null");
        return io.reactivex.plugins.a.P(new g2(this, yVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.M)
    public final io.reactivex.flowables.a<T> h5(int i10, long j10, TimeUnit timeUnit) {
        return i5(i10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c h6(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar) {
        return i6(gVar, gVar2, aVar, s1.i.INSTANCE);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<io.reactivex.schedulers.d<T>> h7(j0 j0Var) {
        return j7(TimeUnit.MILLISECONDS, j0Var);
    }

    @cj.b(cj.a.ERROR)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<l<T>> h8(long j10, TimeUnit timeUnit, j0 j0Var, long j11, boolean z10, int i10) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.i(j11, "count");
        return io.reactivex.plugins.a.P(new w4(this, j10, j10, timeUnit, j0Var, j11, i10, z10));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final T i() {
        io.reactivex.internal.subscribers.d dVar = new io.reactivex.internal.subscribers.d();
        j6(dVar);
        T tA = dVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> i1(dj.o<? super T, ? extends y<? extends R>> oVar) {
        return k1(oVar, true, 2);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final k0<T> i2(long j10, T t10) {
        if (j10 >= 0) {
            io.reactivex.internal.functions.b.g(t10, "defaultItem is null");
            return io.reactivex.plugins.a.S(new v0(this, j10, t10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <K, V> l<io.reactivex.flowables.b<K, V>> i3(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, boolean z10, int i10, dj.o<? super dj.g<Object>, ? extends Map<K, Object>> oVar3) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.b.g(oVar2, "valueSelector is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        io.reactivex.internal.functions.b.g(oVar3, "evictingMapFactory is null");
        return io.reactivex.plugins.a.P(new n1(this, oVar, oVar2, i10, z10, oVar3));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> i4(@cj.f q0<? extends T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "other is null");
        return io.reactivex.plugins.a.P(new h2(this, q0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final io.reactivex.flowables.a<T> i5(int i10, long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return d3.Z8(this, j10, timeUnit, j0Var, i10);
    }

    @cj.b(cj.a.SPECIAL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final io.reactivex.disposables.c i6(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, dj.g<? super org.reactivestreams.w> gVar3) {
        io.reactivex.internal.functions.b.g(gVar, "onNext is null");
        io.reactivex.internal.functions.b.g(gVar2, "onError is null");
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        io.reactivex.internal.functions.b.g(gVar3, "onSubscribe is null");
        io.reactivex.internal.subscribers.m mVar = new io.reactivex.internal.subscribers.m(gVar, gVar2, aVar, gVar3);
        j6(mVar);
        return mVar;
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<io.reactivex.schedulers.d<T>> i7(TimeUnit timeUnit) {
        return j7(timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final <B> l<l<T>> i8(Callable<? extends org.reactivestreams.u<B>> callable) {
        return j8(callable, Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final T j(T t10) {
        io.reactivex.internal.subscribers.d dVar = new io.reactivex.internal.subscribers.d();
        j6(dVar);
        T tA = dVar.a();
        return tA != null ? tA : t10;
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> j1(dj.o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
        return k1(oVar, z10, 2);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final k0<T> j2(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.S(new v0(this, j10, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <K> l<io.reactivex.flowables.b<K, T>> j3(dj.o<? super T, ? extends K> oVar, boolean z10) {
        return (l<io.reactivex.flowables.b<K, T>>) h3(oVar, io.reactivex.internal.functions.a.k(), z10, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> j4(org.reactivestreams.u<? extends T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return R3(this, uVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final io.reactivex.flowables.a<T> j5(int i10, j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return d3.d9(g5(i10), j0Var);
    }

    @cj.b(cj.a.SPECIAL)
    @cj.h("none")
    public final void j6(q<? super T> qVar) {
        io.reactivex.internal.functions.b.g(qVar, "s is null");
        try {
            org.reactivestreams.v<? super T> vVarH0 = io.reactivex.plugins.a.h0(this, qVar);
            io.reactivex.internal.functions.b.g(vVarH0, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            k6(vVarH0);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<io.reactivex.schedulers.d<T>> j7(TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new k4(this, timeUnit, j0Var));
    }

    @cj.b(cj.a.ERROR)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <B> l<l<T>> j8(Callable<? extends org.reactivestreams.u<B>> callable, int i10) {
        io.reactivex.internal.functions.b.g(callable, "boundaryIndicatorSupplier is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new v4(this, callable, i10));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> k1(dj.o<? super T, ? extends y<? extends R>> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.mixed.d(this, oVar, z10 ? io.reactivex.internal.util.j.END : io.reactivex.internal.util.j.BOUNDARY, i10));
    }

    @cj.b(cj.a.ERROR)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <TRight, TLeftEnd, TRightEnd, R> l<R> k3(org.reactivestreams.u<? extends TRight> uVar, dj.o<? super T, ? extends org.reactivestreams.u<TLeftEnd>> oVar, dj.o<? super TRight, ? extends org.reactivestreams.u<TRightEnd>> oVar2, dj.c<? super T, ? super l<TRight>, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        io.reactivex.internal.functions.b.g(oVar, "leftEnd is null");
        io.reactivex.internal.functions.b.g(oVar2, "rightEnd is null");
        io.reactivex.internal.functions.b.g(cVar, "resultSelector is null");
        return io.reactivex.plugins.a.P(new o1(this, uVar, oVar, oVar2, cVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.M)
    public final io.reactivex.flowables.a<T> k5(long j10, TimeUnit timeUnit) {
        return l5(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    protected abstract void k6(org.reactivestreams.v<? super T> vVar);

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> k7(long j10, TimeUnit timeUnit) {
        return s7(j10, timeUnit, null, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final <B> l<l<T>> k8(org.reactivestreams.u<B> uVar) {
        return l8(uVar, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> l1(dj.o<? super T, ? extends q0<? extends R>> oVar) {
        return m1(oVar, 2);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> l3() {
        return io.reactivex.plugins.a.P(new p1(this));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> l4(j0 j0Var) {
        return n4(j0Var, false, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final io.reactivex.flowables.a<T> l5(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return d3.Y8(this, j10, timeUnit, j0Var);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> l6(@cj.f j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return m6(j0Var, !(this instanceof io.reactivex.internal.operators.flowable.f0));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> l7(long j10, TimeUnit timeUnit, j0 j0Var) {
        return s7(j10, timeUnit, null, j0Var);
    }

    @cj.b(cj.a.ERROR)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <B> l<l<T>> l8(org.reactivestreams.u<B> uVar, int i10) {
        io.reactivex.internal.functions.b.g(uVar, "boundaryIndicator is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new t4(this, uVar, i10));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    public final void m(dj.g<? super T> gVar) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            try {
                gVar.accept(it.next());
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                ((io.reactivex.disposables.c) it).dispose();
                throw io.reactivex.internal.util.k.f(th2);
            }
        }
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> m1(dj.o<? super T, ? extends q0<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.mixed.e(this, oVar, io.reactivex.internal.util.j.IMMEDIATE, i10));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final c m3() {
        return io.reactivex.plugins.a.O(new r1(this));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final l<T> m4(j0 j0Var, boolean z10) {
        return n4(j0Var, z10, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h(cj.h.L)
    public final io.reactivex.flowables.a<T> m5(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return d3.d9(f5(), j0Var);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> m6(@cj.f j0 j0Var, boolean z10) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new x3(this, j0Var, z10));
    }

    @cj.b(cj.a.FULL)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> m7(long j10, TimeUnit timeUnit, j0 j0Var, org.reactivestreams.u<? extends T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return s7(j10, timeUnit, uVar, j0Var);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final <U, V> l<l<T>> m8(org.reactivestreams.u<U> uVar, dj.o<? super U, ? extends org.reactivestreams.u<V>> oVar) {
        return n8(uVar, oVar, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final Iterable<T> n() {
        return o(Y());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> n1(dj.o<? super T, ? extends q0<? extends R>> oVar) {
        return p1(oVar, true, 2);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> n2(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.P(new y0(this, rVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> n4(j0 j0Var, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new j2(this, j0Var, z10, i10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> n5() {
        return p5(Long.MAX_VALUE, io.reactivex.internal.functions.a.c());
    }

    @cj.b(cj.a.SPECIAL)
    @cj.d
    @cj.h("none")
    public final <E extends org.reactivestreams.v<? super T>> E n6(E e10) {
        e(e10);
        return e10;
    }

    @cj.b(cj.a.FULL)
    @cj.h(cj.h.M)
    @cj.f
    @cj.d
    public final l<T> n7(long j10, TimeUnit timeUnit, org.reactivestreams.u<? extends T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return s7(j10, timeUnit, uVar, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.ERROR)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U, V> l<l<T>> n8(org.reactivestreams.u<U> uVar, dj.o<? super U, ? extends org.reactivestreams.u<V>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(uVar, "openingIndicator is null");
        io.reactivex.internal.functions.b.g(oVar, "closingIndicator is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.P(new u4(this, uVar, oVar, i10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final Iterable<T> o(int i10) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return new io.reactivex.internal.operators.flowable.b(this, i10);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> o1(dj.o<? super T, ? extends q0<? extends R>> oVar, boolean z10) {
        return p1(oVar, z10, 2);
    }

    @cj.b(cj.a.SPECIAL)
    @cj.d
    @cj.h("none")
    public final k0<T> o2(T t10) {
        return i2(0L, t10);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<U> o4(Class<U> cls) {
        io.reactivex.internal.functions.b.g(cls, "clazz is null");
        return n2(io.reactivex.internal.functions.a.l(cls)).b0(cls);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> o5(long j10) {
        return p5(j10, io.reactivex.internal.functions.a.c());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> o6(org.reactivestreams.u<? extends T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return io.reactivex.plugins.a.P(new y3(this, uVar));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final <V> l<T> o7(dj.o<? super T, ? extends org.reactivestreams.u<V>> oVar) {
        return t7(null, oVar, null);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> o8(Iterable<? extends org.reactivestreams.u<?>> iterable, dj.o<? super Object[], R> oVar) {
        io.reactivex.internal.functions.b.g(iterable, "others is null");
        io.reactivex.internal.functions.b.g(oVar, "combiner is null");
        return io.reactivex.plugins.a.P(new y4(this, iterable, oVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final T p() {
        io.reactivex.internal.subscribers.e eVar = new io.reactivex.internal.subscribers.e();
        j6(eVar);
        T tA = eVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> p1(dj.o<? super T, ? extends q0<? extends R>> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.mixed.e(this, oVar, z10 ? io.reactivex.internal.util.j.END : io.reactivex.internal.util.j.BOUNDARY, i10));
    }

    @cj.b(cj.a.SPECIAL)
    @cj.d
    @cj.h("none")
    public final s<T> p2() {
        return h2(0L);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final l<T> p4() {
        return t4(Y(), false, true);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> p5(long j10, dj.r<? super Throwable> rVar) {
        if (j10 >= 0) {
            io.reactivex.internal.functions.b.g(rVar, "predicate is null");
            return io.reactivex.plugins.a.P(new f3(this, j10, rVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> p6(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar) {
        return q6(oVar, Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <V> l<T> p7(dj.o<? super T, ? extends org.reactivestreams.u<V>> oVar, l<? extends T> lVar) {
        io.reactivex.internal.functions.b.g(lVar, "other is null");
        return t7(null, oVar, lVar);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U, R> l<R> p8(org.reactivestreams.u<? extends U> uVar, dj.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        io.reactivex.internal.functions.b.g(cVar, "combiner is null");
        return io.reactivex.plugins.a.P(new x4(this, cVar, uVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final T q(T t10) {
        io.reactivex.internal.subscribers.e eVar = new io.reactivex.internal.subscribers.e();
        j6(eVar);
        T tA = eVar.a();
        return tA != null ? tA : t10;
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<T> q1(@cj.f i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.a0(this, iVar));
    }

    @cj.b(cj.a.SPECIAL)
    @cj.d
    @cj.h("none")
    public final k0<T> q2() {
        return j2(0L);
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final l<T> q4(int i10) {
        return t4(i10, false, false);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> q5(dj.d<? super Integer, ? super Throwable> dVar) {
        io.reactivex.internal.functions.b.g(dVar, "predicate is null");
        return io.reactivex.plugins.a.P(new e3(this, dVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> q6(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10) {
        return r6(oVar, i10, false);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U, V> l<T> q7(org.reactivestreams.u<U> uVar, dj.o<? super T, ? extends org.reactivestreams.u<V>> oVar) {
        io.reactivex.internal.functions.b.g(uVar, "firstTimeoutIndicator is null");
        return t7(uVar, oVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <T1, T2, R> l<R> q8(org.reactivestreams.u<T1> uVar, org.reactivestreams.u<T2> uVar2, dj.h<? super T, ? super T1, ? super T2, R> hVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        return t8(new org.reactivestreams.u[]{uVar, uVar2}, io.reactivex.internal.functions.a.y(hVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final Iterable<T> r() {
        return new io.reactivex.internal.operators.flowable.c(this);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> r1(@cj.f y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "other is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.b0(this, yVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> r2(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar) {
        return C2(oVar, false, Y(), Y());
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final l<T> r4(int i10, dj.a aVar) {
        return u4(i10, false, false, aVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> r5(dj.r<? super Throwable> rVar) {
        return p5(Long.MAX_VALUE, rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> l<R> r6(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, boolean z10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        if (!(this instanceof ej.m)) {
            return io.reactivex.plugins.a.P(new z3(this, oVar, i10, z10));
        }
        Object objCall = ((ej.m) this).call();
        return objCall == null ? k2() : j3.a(objCall, oVar);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U, V> l<T> r7(org.reactivestreams.u<U> uVar, dj.o<? super T, ? extends org.reactivestreams.u<V>> oVar, org.reactivestreams.u<? extends T> uVar2) {
        io.reactivex.internal.functions.b.g(uVar, "firstTimeoutSelector is null");
        io.reactivex.internal.functions.b.g(uVar2, "other is null");
        return t7(uVar, oVar, uVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <T1, T2, T3, R> l<R> r8(org.reactivestreams.u<T1> uVar, org.reactivestreams.u<T2> uVar2, org.reactivestreams.u<T3> uVar3, dj.i<? super T, ? super T1, ? super T2, ? super T3, R> iVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        return t8(new org.reactivestreams.u[]{uVar, uVar2, uVar3}, io.reactivex.internal.functions.a.z(iVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final Iterable<T> s(T t10) {
        return new io.reactivex.internal.operators.flowable.d(this, t10);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> s1(@cj.f q0<? extends T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "other is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.c0(this, q0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> s2(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10) {
        return C2(oVar, false, i10, Y());
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h("none")
    public final l<T> s4(int i10, boolean z10) {
        return t4(i10, z10, false);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> s5(dj.e eVar) {
        io.reactivex.internal.functions.b.g(eVar, "stop is null");
        return p5(Long.MAX_VALUE, io.reactivex.internal.functions.a.v(eVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final c s6(@cj.f dj.o<? super T, ? extends i> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.f(this, oVar, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <T1, T2, T3, T4, R> l<R> s8(org.reactivestreams.u<T1> uVar, org.reactivestreams.u<T2> uVar2, org.reactivestreams.u<T3> uVar3, org.reactivestreams.u<T4> uVar4, dj.j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> jVar) {
        io.reactivex.internal.functions.b.g(uVar, "source1 is null");
        io.reactivex.internal.functions.b.g(uVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(uVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(uVar4, "source4 is null");
        int i10 = 5 | 0;
        return t8(new org.reactivestreams.u[]{uVar, uVar2, uVar3, uVar4}, io.reactivex.internal.functions.a.A(jVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final Iterable<T> t() {
        return new io.reactivex.internal.operators.flowable.e(this);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> t1(org.reactivestreams.u<? extends T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return B0(this, uVar);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <U, R> l<R> t2(dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar) {
        return x2(oVar, cVar, false, Y(), Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final k0<Boolean> t3() {
        return a(io.reactivex.internal.functions.a.b());
    }

    @cj.b(cj.a.SPECIAL)
    @cj.d
    @cj.h("none")
    public final l<T> t4(int i10, boolean z10, boolean z11) {
        io.reactivex.internal.functions.b.h(i10, "capacity");
        return io.reactivex.plugins.a.P(new k2(this, i10, z11, z10, io.reactivex.internal.functions.a.f298692c));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> t5(dj.o<? super l<Throwable>, ? extends org.reactivestreams.u<?>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "handler is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.g3(this, oVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final c t6(@cj.f dj.o<? super T, ? extends i> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.f(this, oVar, true));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> t8(org.reactivestreams.u<?>[] uVarArr, dj.o<? super Object[], R> oVar) {
        io.reactivex.internal.functions.b.g(uVarArr, "others is null");
        io.reactivex.internal.functions.b.g(oVar, "combiner is null");
        return io.reactivex.plugins.a.P(new y4(this, uVarArr, oVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final T u() {
        return M5().k();
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final k0<Boolean> u1(Object obj) {
        io.reactivex.internal.functions.b.g(obj, "item is null");
        return g(io.reactivex.internal.functions.a.i(obj));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <U, R> l<R> u2(dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar, int i10) {
        return x2(oVar, cVar, false, i10, Y());
    }

    @cj.b(cj.a.ERROR)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <TRight, TLeftEnd, TRightEnd, R> l<R> u3(org.reactivestreams.u<? extends TRight> uVar, dj.o<? super T, ? extends org.reactivestreams.u<TLeftEnd>> oVar, dj.o<? super TRight, ? extends org.reactivestreams.u<TRightEnd>> oVar2, dj.c<? super T, ? super TRight, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        io.reactivex.internal.functions.b.g(oVar, "leftEnd is null");
        io.reactivex.internal.functions.b.g(oVar2, "rightEnd is null");
        io.reactivex.internal.functions.b.g(cVar, "resultSelector is null");
        return io.reactivex.plugins.a.P(new v1(this, uVar, oVar, oVar2, cVar));
    }

    @cj.b(cj.a.SPECIAL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> u4(int i10, boolean z10, boolean z11, dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onOverflow is null");
        io.reactivex.internal.functions.b.h(i10, "capacity");
        return io.reactivex.plugins.a.P(new k2(this, i10, z11, z10, aVar));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    public final void u5(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.internal.functions.b.g(vVar, "s is null");
        if (vVar instanceof io.reactivex.subscribers.d) {
            j6((io.reactivex.subscribers.d) vVar);
        } else {
            j6(new io.reactivex.subscribers.d(vVar));
        }
    }

    @cj.b(cj.a.SPECIAL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> u6(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar) {
        return v6(oVar, Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final T v(T t10) {
        return K5(t10).k();
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final k0<Long> v1() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.flowable.e0(this));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <U, R> l<R> v2(dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return x2(oVar, cVar, z10, Y(), Y());
    }

    @cj.b(cj.a.SPECIAL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> v4(long j10, dj.a aVar, a aVar2) {
        io.reactivex.internal.functions.b.g(aVar2, "overflowStrategy is null");
        io.reactivex.internal.functions.b.i(j10, "capacity");
        return io.reactivex.plugins.a.P(new l2(this, j10, aVar, aVar2));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> v5(long j10, TimeUnit timeUnit) {
        return w5(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.SPECIAL)
    @cj.d
    @cj.h("none")
    public final <R> l<R> v6(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10) {
        return r6(oVar, i10, true);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    public final void w() {
        io.reactivex.internal.operators.flowable.l.a(this);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <U, R> l<R> w2(dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return x2(oVar, cVar, z10, i10, Y());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final l<T> w4(boolean z10) {
        return t4(Y(), z10, true);
    }

    @cj.b(cj.a.ERROR)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> w5(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new i3(this, j10, timeUnit, j0Var, false));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> w6(@cj.f dj.o<? super T, ? extends y<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.mixed.g(this, oVar, false));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<io.reactivex.schedulers.d<T>> w7() {
        return z7(TimeUnit.MILLISECONDS, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    public final void x(dj.g<? super T> gVar) {
        io.reactivex.internal.operators.flowable.l.b(this, gVar, io.reactivex.internal.functions.a.f298695f, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final <R> l<R> x0(r<? super T, ? extends R> rVar) {
        return Y2(((r) io.reactivex.internal.functions.b.g(rVar, "composer is null")).a(this));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> x1(long j10, TimeUnit timeUnit) {
        return y1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U, R> l<R> x2(dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10, int i11) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.g(cVar, "combiner is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.b.h(i11, "bufferSize");
        return C2(s1.b(oVar, cVar), z10, i10, i11);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final l<T> x4() {
        return io.reactivex.plugins.a.P(new m2(this));
    }

    @cj.b(cj.a.ERROR)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> x5(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new i3(this, j10, timeUnit, j0Var, z10));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> x6(@cj.f dj.o<? super T, ? extends y<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.mixed.g(this, oVar, true));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<io.reactivex.schedulers.d<T>> x7(j0 j0Var) {
        return z7(TimeUnit.MILLISECONDS, j0Var);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    public final void y(dj.g<? super T> gVar, int i10) {
        io.reactivex.internal.operators.flowable.l.c(this, gVar, io.reactivex.internal.functions.a.f298695f, io.reactivex.internal.functions.a.f298692c, i10);
    }

    @cj.b(cj.a.ERROR)
    @cj.h(cj.h.L)
    @cj.f
    @cj.d
    public final l<T> y1(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.h0(this, j10, timeUnit, j0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> y2(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, dj.o<? super Throwable, ? extends org.reactivestreams.u<? extends R>> oVar2, Callable<? extends org.reactivestreams.u<? extends R>> callable) {
        io.reactivex.internal.functions.b.g(oVar, "onNextMapper is null");
        io.reactivex.internal.functions.b.g(oVar2, "onErrorMapper is null");
        io.reactivex.internal.functions.b.g(callable, "onCompleteSupplier is null");
        return P3(new c2(this, oVar, oVar2, callable));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> y4(dj.g<? super T> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onDrop is null");
        return io.reactivex.plugins.a.P(new m2(this, gVar));
    }

    @cj.b(cj.a.ERROR)
    @cj.d
    @cj.h(cj.h.M)
    public final l<T> y5(long j10, TimeUnit timeUnit, boolean z10) {
        return x5(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> y6(@cj.f dj.o<? super T, ? extends q0<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.mixed.h(this, oVar, false));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.d
    @cj.h("none")
    public final l<io.reactivex.schedulers.d<T>> y7(TimeUnit timeUnit) {
        return z7(timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    public final void z(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2) {
        io.reactivex.internal.operators.flowable.l.b(this, gVar, gVar2, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.b(cj.a.ERROR)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<T> z1(dj.o<? super T, ? extends org.reactivestreams.u<U>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "debounceIndicator is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.g0(this, oVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> z2(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, dj.o<Throwable, ? extends org.reactivestreams.u<? extends R>> oVar2, Callable<? extends org.reactivestreams.u<? extends R>> callable, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "onNextMapper is null");
        io.reactivex.internal.functions.b.g(oVar2, "onErrorMapper is null");
        io.reactivex.internal.functions.b.g(callable, "onCompleteSupplier is null");
        return Q3(new c2(this, oVar, oVar2, callable), i10);
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public final l<T> z4() {
        return io.reactivex.plugins.a.P(new o2(this));
    }

    @cj.b(cj.a.ERROR)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<T> z5(org.reactivestreams.u<U> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "sampler is null");
        return io.reactivex.plugins.a.P(new h3(this, uVar, false));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> z6(@cj.f dj.o<? super T, ? extends q0<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.mixed.h(this, oVar, true));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<io.reactivex.schedulers.d<T>> z7(TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return (l<io.reactivex.schedulers.d<T>>) K3(io.reactivex.internal.functions.a.w(timeUnit, j0Var));
    }
}
