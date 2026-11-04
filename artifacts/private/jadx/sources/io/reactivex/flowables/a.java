package io.reactivex.flowables;

import cj.d;
import cj.f;
import cj.h;
import dj.g;
import io.reactivex.disposables.c;
import io.reactivex.internal.operators.flowable.k;
import io.reactivex.internal.operators.flowable.z2;
import io.reactivex.j0;
import io.reactivex.l;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a<T> extends l<T> {
    @f
    public l<T> M8() {
        return N8(1);
    }

    @f
    public l<T> N8(int i10) {
        return O8(i10, io.reactivex.internal.functions.a.h());
    }

    @f
    public l<T> O8(int i10, @f g<? super c> gVar) {
        if (i10 > 0) {
            return io.reactivex.plugins.a.P(new k(this, i10, gVar));
        }
        Q8(gVar);
        return io.reactivex.plugins.a.T(this);
    }

    public final c P8() {
        io.reactivex.internal.util.g gVar = new io.reactivex.internal.util.g();
        Q8(gVar);
        return gVar.f303479a;
    }

    public abstract void Q8(@f g<? super c> gVar);

    @cj.b(cj.a.PASS_THROUGH)
    @h("none")
    @f
    @d
    public l<T> R8() {
        return io.reactivex.plugins.a.P(new z2(this));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @d
    @h("none")
    public final l<T> S8(int i10) {
        return U8(i10, 0L, TimeUnit.NANOSECONDS, io.reactivex.schedulers.b.i());
    }

    @cj.b(cj.a.PASS_THROUGH)
    @d
    @h(h.M)
    public final l<T> T8(int i10, long j10, TimeUnit timeUnit) {
        return U8(i10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.PASS_THROUGH)
    @d
    @h(h.L)
    public final l<T> U8(int i10, long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.h(i10, "subscriberCount");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new z2(this, i10, j10, timeUnit, j0Var));
    }

    @cj.b(cj.a.PASS_THROUGH)
    @d
    @h(h.M)
    public final l<T> V8(long j10, TimeUnit timeUnit) {
        return U8(1, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.PASS_THROUGH)
    @d
    @h(h.L)
    public final l<T> W8(long j10, TimeUnit timeUnit, j0 j0Var) {
        return U8(1, j10, timeUnit, j0Var);
    }
}
