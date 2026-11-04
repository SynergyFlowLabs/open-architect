package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e6 implements Comparable<e6> {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull e6 e6Var) {
        return Long.valueOf(k()).compareTo(Long.valueOf(e6Var.k()));
    }

    public long c(@NotNull e6 e6Var) {
        return k() - e6Var.k();
    }

    public final boolean d(@NotNull e6 e6Var) {
        return c(e6Var) > 0;
    }

    public final boolean e(@NotNull e6 e6Var) {
        return c(e6Var) < 0;
    }

    public long f(@Nullable e6 e6Var) {
        return (e6Var == null || compareTo(e6Var) >= 0) ? k() : e6Var.k();
    }

    public abstract long k();
}
