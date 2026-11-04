package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class c implements androidx.compose.foundation.lazy.layout.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17772b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a1 f17773a;

    public c(@NotNull a1 a1Var) {
        this.f17773a = a1Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int a() {
        return this.f17773a.L().c();
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public boolean b() {
        return !this.f17773a.L().h().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int c() {
        if (this.f17773a.L().h().isEmpty()) {
            return 0;
        }
        int iE = m0.e(this.f17773a.L());
        int iF = m0.f(this.f17773a.L());
        if (iF == 0) {
            return 1;
        }
        return kotlin.ranges.r.u(iE / iF, 1);
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int d() {
        return this.f17773a.E();
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int e() {
        return ((q) CollectionsKt.last((List) this.f17773a.L().h())).getIndex();
    }

    @NotNull
    public final a1 f() {
        return this.f17773a;
    }
}
