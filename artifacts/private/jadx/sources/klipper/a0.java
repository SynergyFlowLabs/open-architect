package klipper;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f312242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private a0 f312243b;

    public a0() {
        this(0L, null, 3, null);
    }

    public static /* synthetic */ a0 d(a0 a0Var, long j10, a0 a0Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = a0Var.f312242a;
        }
        if ((i10 & 2) != 0) {
            a0Var2 = a0Var.f312243b;
        }
        return a0Var.c(j10, a0Var2);
    }

    public final long a() {
        return this.f312242a;
    }

    @Nullable
    public final a0 b() {
        return this.f312243b;
    }

    @NotNull
    public final a0 c(long j10, @Nullable a0 a0Var) {
        return new a0(j10, a0Var);
    }

    @Nullable
    public final a0 e() {
        return this.f312243b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f312242a == a0Var.f312242a && Intrinsics.areEqual(this.f312243b, a0Var.f312243b);
    }

    public final long f() {
        return this.f312242a;
    }

    public final void g(@Nullable a0 a0Var) {
        this.f312243b = a0Var;
    }

    public final void h(long j10) {
        this.f312242a = j10;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f312242a) * 31;
        a0 a0Var = this.f312243b;
        return iHashCode + (a0Var == null ? 0 : a0Var.hashCode());
    }

    @NotNull
    public String toString() {
        return "Scanbeam(y=" + this.f312242a + ", next=" + this.f312243b + ')';
    }

    public a0(long j10, @Nullable a0 a0Var) {
        this.f312242a = j10;
        this.f312243b = a0Var;
    }

    public /* synthetic */ a0(long j10, a0 a0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : a0Var);
    }
}
