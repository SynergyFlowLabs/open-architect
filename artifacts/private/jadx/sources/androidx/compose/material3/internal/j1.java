package androidx.compose.material3.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class j1 implements Comparable<j1> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f28969e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f28973d;

    public j1(int i10, int i11, int i12, long j10) {
        this.f28970a = i10;
        this.f28971b = i11;
        this.f28972c = i12;
        this.f28973d = j10;
    }

    public static /* synthetic */ j1 q(j1 j1Var, int i10, int i11, int i12, long j10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = j1Var.f28970a;
        }
        if ((i13 & 2) != 0) {
            i11 = j1Var.f28971b;
        }
        if ((i13 & 4) != 0) {
            i12 = j1Var.f28972c;
        }
        if ((i13 & 8) != 0) {
            j10 = j1Var.f28973d;
        }
        int i14 = i12;
        return j1Var.p(i10, i11, i14, j10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull j1 j1Var) {
        return Intrinsics.compare(this.f28973d, j1Var.f28973d);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (this.f28970a == j1Var.f28970a && this.f28971b == j1Var.f28971b && this.f28972c == j1Var.f28972c && this.f28973d == j1Var.f28973d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f28970a) * 31) + Integer.hashCode(this.f28971b)) * 31) + Integer.hashCode(this.f28972c)) * 31) + Long.hashCode(this.f28973d);
    }

    public final int k() {
        return this.f28970a;
    }

    public final int l() {
        return this.f28971b;
    }

    public final int n() {
        return this.f28972c;
    }

    public final long o() {
        return this.f28973d;
    }

    @NotNull
    public final j1 p(int i10, int i11, int i12, long j10) {
        return new j1(i10, i11, i12, j10);
    }

    @NotNull
    public final String r(@NotNull k1 k1Var, @NotNull String str) {
        return k1Var.b(this, str, k1Var.l());
    }

    public final int s() {
        return this.f28972c;
    }

    public final int t() {
        return this.f28971b;
    }

    @NotNull
    public String toString() {
        return "CalendarDate(year=" + this.f28970a + ", month=" + this.f28971b + ", dayOfMonth=" + this.f28972c + ", utcTimeMillis=" + this.f28973d + ')';
    }

    public final long v() {
        return this.f28973d;
    }

    public final int w() {
        return this.f28970a;
    }
}
