package androidx.compose.material3.internal;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class o1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f29039g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f29044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f29045f;

    public o1(int i10, int i11, int i12, int i13, long j10) {
        this.f29040a = i10;
        this.f29041b = i11;
        this.f29042c = i12;
        this.f29043d = i13;
        this.f29044e = j10;
        this.f29045f = (j10 + (((long) i12) * 86400000)) - 1;
    }

    public static /* synthetic */ o1 g(o1 o1Var, int i10, int i11, int i12, int i13, long j10, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = o1Var.f29040a;
        }
        if ((i14 & 2) != 0) {
            i11 = o1Var.f29041b;
        }
        if ((i14 & 4) != 0) {
            i12 = o1Var.f29042c;
        }
        if ((i14 & 8) != 0) {
            i13 = o1Var.f29043d;
        }
        if ((i14 & 16) != 0) {
            j10 = o1Var.f29044e;
        }
        long j11 = j10;
        return o1Var.f(i10, i11, i12, i13, j11);
    }

    public final int a() {
        return this.f29040a;
    }

    public final int b() {
        return this.f29041b;
    }

    public final int c() {
        return this.f29042c;
    }

    public final int d() {
        return this.f29043d;
    }

    public final long e() {
        return this.f29044e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f29040a == o1Var.f29040a && this.f29041b == o1Var.f29041b && this.f29042c == o1Var.f29042c && this.f29043d == o1Var.f29043d && this.f29044e == o1Var.f29044e;
    }

    @NotNull
    public final o1 f(int i10, int i11, int i12, int i13, long j10) {
        return new o1(i10, i11, i12, i13, j10);
    }

    @NotNull
    public final String h(@NotNull k1 k1Var, @NotNull String str) {
        return k1Var.c(this, str, k1Var.l());
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f29040a) * 31) + Integer.hashCode(this.f29041b)) * 31) + Integer.hashCode(this.f29042c)) * 31) + Integer.hashCode(this.f29043d)) * 31) + Long.hashCode(this.f29044e);
    }

    public final int i() {
        return this.f29043d;
    }

    public final long j() {
        return this.f29045f;
    }

    public final int k() {
        return this.f29041b;
    }

    public final int l() {
        return this.f29042c;
    }

    public final long m() {
        return this.f29044e;
    }

    public final int n() {
        return this.f29040a;
    }

    public final int o(@NotNull IntRange intRange) {
        return (((this.f29040a - intRange.l()) * 12) + this.f29041b) - 1;
    }

    @NotNull
    public String toString() {
        return "CalendarMonth(year=" + this.f29040a + ", month=" + this.f29041b + ", numberOfDays=" + this.f29042c + ", daysFromStartOfWeekToFirstOfMonth=" + this.f29043d + ", startUtcTimeMillis=" + this.f29044e + ')';
    }
}
