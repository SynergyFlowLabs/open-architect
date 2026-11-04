package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class g1<T> implements o<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12967d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k0<T> f12968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f2 f12969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12970c;

    public /* synthetic */ g1(k0 k0Var, f2 f2Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(k0Var, f2Var, j10);
    }

    @Override // androidx.compose.animation.core.o
    @NotNull
    public <V extends w> u4<V> a(@NotNull z3<T, V> z3Var) {
        return new b5(this.f12968a.a((z3) z3Var), this.f12969b, this.f12970c, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (Intrinsics.areEqual(g1Var.f12968a, this.f12968a) && g1Var.f12969b == this.f12969b && t2.f(g1Var.f12970c, this.f12970c)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final k0<T> h() {
        return this.f12968a;
    }

    public int hashCode() {
        return (((this.f12968a.hashCode() * 31) + this.f12969b.hashCode()) * 31) + t2.i(this.f12970c);
    }

    public final long i() {
        return this.f12970c;
    }

    @NotNull
    public final f2 j() {
        return this.f12969b;
    }

    private g1(k0<T> k0Var, f2 f2Var, long j10) {
        this.f12968a = k0Var;
        this.f12969b = f2Var;
        this.f12970c = j10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g1(k0 k0Var, f2 f2Var, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        f2 f2Var2 = (i10 & 2) != 0 ? f2.Restart : f2Var;
        if ((i10 & 4) != 0) {
            int i11 = 3 << 0;
            j10 = t2.d(0, 0, 2, null);
        }
        this(k0Var, f2Var2, j10, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ g1(k0 k0Var, f2 f2Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(k0Var, (i10 & 2) != 0 ? f2.Restart : f2Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ g1(k0 k0Var, f2 f2Var) {
        this(k0Var, f2Var, t2.d(0, 0, 2, null), (DefaultConstructorMarker) null);
        int i10 = 4 >> 0;
    }
}
