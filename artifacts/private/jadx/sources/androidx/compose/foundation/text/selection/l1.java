package androidx.compose.foundation.text.selection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class l1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21200e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.k3 f21201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k1 f21203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21204d;

    public /* synthetic */ l1(androidx.compose.foundation.text.k3 k3Var, long j10, k1 k1Var, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(k3Var, j10, k1Var, z10);
    }

    public static /* synthetic */ l1 f(l1 l1Var, androidx.compose.foundation.text.k3 k3Var, long j10, k1 k1Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k3Var = l1Var.f21201a;
        }
        if ((i10 & 2) != 0) {
            j10 = l1Var.f21202b;
        }
        if ((i10 & 4) != 0) {
            k1Var = l1Var.f21203c;
        }
        if ((i10 & 8) != 0) {
            z10 = l1Var.f21204d;
        }
        return l1Var.e(k3Var, j10, k1Var, z10);
    }

    @NotNull
    public final androidx.compose.foundation.text.k3 a() {
        return this.f21201a;
    }

    public final long b() {
        return this.f21202b;
    }

    @NotNull
    public final k1 c() {
        return this.f21203c;
    }

    public final boolean d() {
        return this.f21204d;
    }

    @NotNull
    public final l1 e(@NotNull androidx.compose.foundation.text.k3 k3Var, long j10, @NotNull k1 k1Var, boolean z10) {
        return new l1(k3Var, j10, k1Var, z10, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f21201a == l1Var.f21201a && n0.g.l(this.f21202b, l1Var.f21202b) && this.f21203c == l1Var.f21203c && this.f21204d == l1Var.f21204d;
    }

    @NotNull
    public final k1 g() {
        return this.f21203c;
    }

    @NotNull
    public final androidx.compose.foundation.text.k3 h() {
        return this.f21201a;
    }

    public int hashCode() {
        return (((((this.f21201a.hashCode() * 31) + n0.g.t(this.f21202b)) * 31) + this.f21203c.hashCode()) * 31) + Boolean.hashCode(this.f21204d);
    }

    public final long i() {
        return this.f21202b;
    }

    public final boolean j() {
        return this.f21204d;
    }

    @NotNull
    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f21201a + ", position=" + ((Object) n0.g.z(this.f21202b)) + ", anchor=" + this.f21203c + ", visible=" + this.f21204d + ')';
    }

    private l1(androidx.compose.foundation.text.k3 k3Var, long j10, k1 k1Var, boolean z10) {
        this.f21201a = k3Var;
        this.f21202b = j10;
        this.f21203c = k1Var;
        this.f21204d = z10;
    }
}
