package klipper;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f312351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private b0 f312352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private b0 f312353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private r f312354d;

    public r() {
        this(0L, null, null, null, 15, null);
    }

    public static /* synthetic */ r f(r rVar, long j10, b0 b0Var, b0 b0Var2, r rVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = rVar.f312351a;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            b0Var = rVar.f312352b;
        }
        b0 b0Var3 = b0Var;
        if ((i10 & 4) != 0) {
            b0Var2 = rVar.f312353c;
        }
        b0 b0Var4 = b0Var2;
        if ((i10 & 8) != 0) {
            rVar2 = rVar.f312354d;
        }
        return rVar.e(j11, b0Var3, b0Var4, rVar2);
    }

    public final long a() {
        return this.f312351a;
    }

    @Nullable
    public final b0 b() {
        return this.f312352b;
    }

    @Nullable
    public final b0 c() {
        return this.f312353c;
    }

    @Nullable
    public final r d() {
        return this.f312354d;
    }

    @NotNull
    public final r e(long j10, @Nullable b0 b0Var, @Nullable b0 b0Var2, @Nullable r rVar) {
        return new r(j10, b0Var, b0Var2, rVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f312351a == rVar.f312351a && Intrinsics.areEqual(this.f312352b, rVar.f312352b) && Intrinsics.areEqual(this.f312353c, rVar.f312353c) && Intrinsics.areEqual(this.f312354d, rVar.f312354d);
    }

    @Nullable
    public final b0 g() {
        return this.f312352b;
    }

    @Nullable
    public final r h() {
        return this.f312354d;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f312351a) * 31;
        b0 b0Var = this.f312352b;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        b0 b0Var2 = this.f312353c;
        int iHashCode3 = (iHashCode2 + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        r rVar = this.f312354d;
        return iHashCode3 + (rVar != null ? rVar.hashCode() : 0);
    }

    @Nullable
    public final b0 i() {
        return this.f312353c;
    }

    public final long j() {
        return this.f312351a;
    }

    public final void k(@Nullable b0 b0Var) {
        this.f312352b = b0Var;
    }

    public final void l(@Nullable r rVar) {
        this.f312354d = rVar;
    }

    public final void m(@Nullable b0 b0Var) {
        this.f312353c = b0Var;
    }

    public final void n(long j10) {
        this.f312351a = j10;
    }

    @NotNull
    public String toString() {
        return "LocalMinima(y=" + this.f312351a + ", leftBound=" + this.f312352b + ", rightBound=" + this.f312353c + ", next=" + this.f312354d + ')';
    }

    public r(long j10, @Nullable b0 b0Var, @Nullable b0 b0Var2, @Nullable r rVar) {
        this.f312351a = j10;
        this.f312352b = b0Var;
        this.f312353c = b0Var2;
        this.f312354d = rVar;
    }

    public /* synthetic */ r(long j10, b0 b0Var, b0 b0Var2, r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : b0Var, (i10 & 4) != 0 ? null : b0Var2, (i10 & 8) != 0 ? null : rVar);
    }
}
