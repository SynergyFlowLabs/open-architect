package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class m implements androidx.compose.foundation.lazy.layout.u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17633c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j1 f17634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17635b;

    public m(@NotNull j1 j1Var, int i10) {
        this.f17634a = j1Var;
        this.f17635b = i10;
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int a() {
        return this.f17634a.K().c();
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public boolean b() {
        return !this.f17634a.K().h().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int c() {
        if (this.f17634a.K().h().isEmpty()) {
            int i10 = 6 ^ 0;
            return 0;
        }
        int iD = androidx.compose.foundation.gestures.snapping.f.d(this.f17634a.K());
        int iA = g0.a(this.f17634a.K());
        if (iA == 0) {
            return 1;
        }
        return kotlin.ranges.r.u(iD / iA, 1);
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int d() {
        return Math.max(0, this.f17634a.E() - this.f17635b);
    }

    @Override // androidx.compose.foundation.lazy.layout.u
    public int e() {
        return Math.min(a() - 1, ((v) CollectionsKt.last((List) this.f17634a.K().h())).getIndex() + this.f17635b);
    }

    public final int f() {
        return this.f17635b;
    }

    @NotNull
    public final j1 g() {
        return this.f17634a;
    }
}
