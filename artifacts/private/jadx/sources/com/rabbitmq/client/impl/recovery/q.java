package com.rabbitmq.client.impl.recovery;

import java.util.Objects;
import java.util.function.BiPredicate;

/* JADX INFO: loaded from: classes13.dex */
public class q implements g0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final org.slf4j.c f265758k = org.slf4j.e.k(q.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BiPredicate<? super y, Exception> f265759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BiPredicate<? super v, Exception> f265760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BiPredicate<? super s, Exception> f265761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BiPredicate<? super t, Exception> f265762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a<?> f265763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a<?> f265764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a<?> f265765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a<?> f265766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f265767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n f265768j;

    public interface a<T> {
        static /* synthetic */ Object a(a aVar, a aVar2, f0 f0Var) throws Exception {
            aVar.c(f0Var);
            return aVar2.c(f0Var);
        }

        default <V> a<V> b(final a<V> aVar) {
            Objects.requireNonNull(aVar);
            return new a() { // from class: com.rabbitmq.client.impl.recovery.p
                @Override // com.rabbitmq.client.impl.recovery.q.a
                public final Object c(f0 f0Var) {
                    return q.a.a(this.f265756a, aVar, f0Var);
                }
            };
        }

        T c(f0 f0Var) throws Exception;
    }

    public q(BiPredicate<? super y, Exception> biPredicate, BiPredicate<? super v, Exception> biPredicate2, BiPredicate<? super s, Exception> biPredicate3, BiPredicate<? super t, Exception> biPredicate4, a<?> aVar, a<?> aVar2, a<?> aVar3, a<?> aVar4, int i10, n nVar) {
        this.f265759a = biPredicate;
        this.f265760b = biPredicate2;
        this.f265761c = biPredicate3;
        this.f265762d = biPredicate4;
        this.f265763e = aVar;
        this.f265764f = aVar2;
        this.f265765g = aVar3;
        this.f265766h = aVar4;
        this.f265768j = nVar;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Number of retry attempts must be greater than 0");
        }
        this.f265767i = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.rabbitmq.client.impl.recovery.g0
    public h0 a(f0 f0Var) throws Exception {
        return e(this.f265759a, this.f265763e, f0Var.g(), f0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.rabbitmq.client.impl.recovery.g0
    public h0 b(f0 f0Var) throws Exception {
        return e(this.f265762d, this.f265766h, f0Var.c(), f0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.rabbitmq.client.impl.recovery.g0
    public h0 c(f0 f0Var) throws Exception {
        return e(this.f265761c, this.f265765g, f0Var.a(), f0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.rabbitmq.client.impl.recovery.g0
    public h0 d(f0 f0Var) throws Exception {
        return e(this.f265760b, this.f265764f, f0Var.f(), f0Var);
    }

    protected h0 e(BiPredicate<u, Exception> biPredicate, a<?> aVar, u uVar, f0 f0Var) throws Exception {
        Exception e10 = f0Var.e();
        int i10 = 0;
        while (i10 < this.f265767i) {
            if (!biPredicate.test(uVar, e10)) {
                throw e10;
            }
            f(uVar, e10, i10);
            i10++;
            this.f265768j.a(i10);
            try {
                Object objC = aVar.c(f0Var);
                return new h0(uVar, objC == null ? null : objC.toString());
            } catch (Exception e11) {
                e10 = e11;
            }
        }
        throw e10;
    }

    protected void f(u uVar, Exception exc, int i10) {
        f265758k.h("Error while recovering {}, retrying with {} more attempt(s).", uVar, Integer.valueOf(this.f265767i - i10), exc);
    }
}
