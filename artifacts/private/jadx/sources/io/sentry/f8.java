package io.sentry;

import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class f8 extends e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Date f305435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f305436b;

    public f8() {
        this(p.d(), System.nanoTime());
    }

    private long l(@NotNull f8 f8Var, @NotNull f8 f8Var2) {
        return f8Var.k() + (f8Var2.f305436b - f8Var.f305436b);
    }

    @Override // io.sentry.e6, java.lang.Comparable
    /* JADX INFO: renamed from: b */
    public int compareTo(@NotNull e6 e6Var) {
        if (!(e6Var instanceof f8)) {
            return super.compareTo(e6Var);
        }
        f8 f8Var = (f8) e6Var;
        long time = this.f305435a.getTime();
        long time2 = f8Var.f305435a.getTime();
        return time == time2 ? Long.valueOf(this.f305436b).compareTo(Long.valueOf(f8Var.f305436b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.e6
    public long c(@NotNull e6 e6Var) {
        return e6Var instanceof f8 ? this.f305436b - ((f8) e6Var).f305436b : super.c(e6Var);
    }

    @Override // io.sentry.e6
    public long f(@Nullable e6 e6Var) {
        if (e6Var == null || !(e6Var instanceof f8)) {
            return super.f(e6Var);
        }
        f8 f8Var = (f8) e6Var;
        return compareTo(e6Var) < 0 ? l(this, f8Var) : l(f8Var, this);
    }

    @Override // io.sentry.e6
    public long k() {
        return p.a(this.f305435a);
    }

    public f8(@NotNull Date date, long j10) {
        this.f305435a = date;
        this.f305436b = j10;
    }
}
