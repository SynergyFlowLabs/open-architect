package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes4.dex */
final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collector f109426a = Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l0
        @Override // java.util.function.Supplier
        public final Object get() {
            return new n1(4);
        }
    }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o0
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((n1) obj).e(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.p0
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            n1 n1Var = (n1) obj;
            n1 n1Var2 = (n1) obj2;
            n1Var.c(n1Var2.f109155a, n1Var2.f109156b);
            return n1Var;
        }
    }, new Function() { // from class: com.google.android.gms.internal.play_billing.q0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((n1) obj).f();
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.r0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new x1();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.s0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((x1) obj).e(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.t0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                x1 x1Var = (x1) obj;
                x1 x1Var2 = (x1) obj2;
                x1Var.c(x1Var2.f109155a, x1Var2.f109156b);
                return x1Var;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                x1 x1Var = (x1) obj;
                int i10 = x1Var.f109156b;
                if (i10 == 0) {
                    return u2.f109345i;
                }
                if (i10 == 1) {
                    Object obj2 = x1Var.f109155a[0];
                    Objects.requireNonNull(obj2);
                    return new x2(obj2);
                }
                y1 y1VarV = y1.v(i10, x1Var.f109155a);
                x1Var.f109156b = y1VarV.size();
                x1Var.f109157c = true;
                return y1VarV;
            }
        }, new Collector.Characteristics[0]);
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.v0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new v1();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.w0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((v1) obj).a((l2) obj2);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                v1 v1Var = (v1) obj;
                v1Var.b((v1) obj2);
                return v1Var;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((v1) obj).c();
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector a() {
        return f109426a;
    }
}
