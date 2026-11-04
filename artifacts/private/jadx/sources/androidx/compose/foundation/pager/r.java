package androidx.compose.foundation.pager;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class r implements androidx.compose.foundation.lazy.layout.u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18422c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i1 f18423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18424b;

    public r(@NotNull i1 i1Var, int i10) {
        this.f18423a = i1Var;
        this.f18424b = i10;
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int a() {
        return this.f18423a.V();
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public boolean b() {
        return !this.f18423a.M().w1().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int c() {
        if (this.f18423a.M().w1().size() == 0) {
            return 0;
        }
        int iA = i0.a(this.f18423a.M());
        int iT1 = this.f18423a.M().t1() + this.f18423a.M().x1();
        if (iT1 == 0) {
            return 1;
        }
        return kotlin.ranges.r.u(iA / iT1, 1);
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int d() {
        return Math.max(0, this.f18423a.H() - this.f18424b);
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int e() {
        return Math.min(a() - 1, ((o) CollectionsKt.last((List) this.f18423a.M().w1())).getIndex() + this.f18424b);
    }
}
