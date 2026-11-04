package io.reactivex.observables;

import cj.d;
import cj.f;
import cj.h;
import dj.g;
import io.reactivex.b0;
import io.reactivex.disposables.c;
import io.reactivex.internal.operators.observable.k;
import io.reactivex.internal.operators.observable.n2;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a<T> extends b0<T> {
    @f
    public b0<T> h8() {
        return i8(1);
    }

    @f
    public b0<T> i8(int i10) {
        return j8(i10, io.reactivex.internal.functions.a.h());
    }

    @f
    public b0<T> j8(int i10, @f g<? super c> gVar) {
        if (i10 > 0) {
            return io.reactivex.plugins.a.R(new k(this, i10, gVar));
        }
        l8(gVar);
        return io.reactivex.plugins.a.U(this);
    }

    public final c k8() {
        io.reactivex.internal.util.g gVar = new io.reactivex.internal.util.g();
        l8(gVar);
        return gVar.f303479a;
    }

    public abstract void l8(@f g<? super c> gVar);

    @f
    @d
    @h("none")
    public b0<T> m8() {
        return io.reactivex.plugins.a.R(new n2(this));
    }

    @d
    @h("none")
    public final b0<T> n8(int i10) {
        return p8(i10, 0L, TimeUnit.NANOSECONDS, io.reactivex.schedulers.b.i());
    }

    @d
    @h(h.M)
    public final b0<T> o8(int i10, long j10, TimeUnit timeUnit) {
        return p8(i10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @d
    @h(h.L)
    public final b0<T> p8(int i10, long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.h(i10, "subscriberCount");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new n2(this, i10, j10, timeUnit, j0Var));
    }

    @d
    @h(h.M)
    public final b0<T> q8(long j10, TimeUnit timeUnit) {
        return p8(1, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @d
    @h(h.L)
    public final b0<T> r8(long j10, TimeUnit timeUnit, j0 j0Var) {
        return p8(1, j10, timeUnit, j0Var);
    }
}
