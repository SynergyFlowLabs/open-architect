package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class f implements androidx.compose.foundation.lazy.layout.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16796b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x1 f16797a;

    public f(@NotNull x1 x1Var) {
        this.f16797a = x1Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int a() {
        return this.f16797a.L().c();
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public boolean b() {
        return !this.f16797a.L().h().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int c() {
        if (this.f16797a.L().h().isEmpty()) {
            return 0;
        }
        int iC = androidx.compose.foundation.gestures.snapping.e.c(this.f16797a.L());
        int iB = o0.b(this.f16797a.L());
        if (iB == 0) {
            return 1;
        }
        return kotlin.ranges.r.u(iC / iB, 1);
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int d() {
        return this.f16797a.F();
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int e() {
        return ((x) CollectionsKt.last((List) this.f16797a.L().h())).getIndex();
    }

    @NotNull
    public final x1 f() {
        return this.f16797a;
    }
}
