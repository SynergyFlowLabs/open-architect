package klipper;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f312327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f312328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f312329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f312330d;

    public l(long j10, long j11, long j12, long j13) {
        this.f312327a = j10;
        this.f312328b = j11;
        this.f312329c = j12;
        this.f312330d = j13;
    }

    public static /* synthetic */ l f(l lVar, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = lVar.f312327a;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = lVar.f312328b;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = lVar.f312329c;
        }
        return lVar.e(j14, j15, j12, (i10 & 8) != 0 ? lVar.f312330d : j13);
    }

    public final long a() {
        return this.f312327a;
    }

    public final long b() {
        return this.f312328b;
    }

    public final long c() {
        return this.f312329c;
    }

    public final long d() {
        return this.f312330d;
    }

    @NotNull
    public final l e(long j10, long j11, long j12, long j13) {
        return new l(j10, j11, j12, j13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f312327a == lVar.f312327a && this.f312328b == lVar.f312328b && this.f312329c == lVar.f312329c && this.f312330d == lVar.f312330d;
    }

    public final long g() {
        return this.f312330d;
    }

    public final long h() {
        return this.f312327a;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f312327a) * 31) + Long.hashCode(this.f312328b)) * 31) + Long.hashCode(this.f312329c)) * 31) + Long.hashCode(this.f312330d);
    }

    public final long i() {
        return this.f312329c;
    }

    public final long j() {
        return this.f312328b;
    }

    public final void k(long j10) {
        this.f312330d = j10;
    }

    public final void l(long j10) {
        this.f312327a = j10;
    }

    public final void m(long j10) {
        this.f312329c = j10;
    }

    public final void n(long j10) {
        this.f312328b = j10;
    }

    @NotNull
    public String toString() {
        return "IntRect(left=" + this.f312327a + ", top=" + this.f312328b + ", right=" + this.f312329c + ", bottom=" + this.f312330d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull l other) {
        this(other.f312327a, other.f312328b, other.f312329c, other.f312330d);
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
