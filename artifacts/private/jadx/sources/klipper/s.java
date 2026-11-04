package klipper;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f312355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private s f312356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private s f312357c;

    public s() {
        this(0L, null, null, 7, null);
    }

    public static /* synthetic */ s e(s sVar, long j10, s sVar2, s sVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = sVar.f312355a;
        }
        if ((i10 & 2) != 0) {
            sVar2 = sVar.f312356b;
        }
        if ((i10 & 4) != 0) {
            sVar3 = sVar.f312357c;
        }
        return sVar.d(j10, sVar2, sVar3);
    }

    public final long a() {
        return this.f312355a;
    }

    @Nullable
    public final s b() {
        return this.f312356b;
    }

    @Nullable
    public final s c() {
        return this.f312357c;
    }

    @NotNull
    public final s d(long j10, @Nullable s sVar, @Nullable s sVar2) {
        return new s(j10, sVar, sVar2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f312355a == sVar.f312355a && Intrinsics.areEqual(this.f312356b, sVar.f312356b) && Intrinsics.areEqual(this.f312357c, sVar.f312357c);
    }

    @Nullable
    public final s f() {
        return this.f312356b;
    }

    @Nullable
    public final s g() {
        return this.f312357c;
    }

    public final long h() {
        return this.f312355a;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f312355a) * 31;
        s sVar = this.f312356b;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        s sVar2 = this.f312357c;
        return iHashCode2 + (sVar2 != null ? sVar2.hashCode() : 0);
    }

    public final void i(@Nullable s sVar) {
        this.f312356b = sVar;
    }

    public final void j(@Nullable s sVar) {
        this.f312357c = sVar;
    }

    public final void k(long j10) {
        this.f312355a = j10;
    }

    @NotNull
    public String toString() {
        return "Maxima(x=" + this.f312355a + ", next=" + this.f312356b + ", prev=" + this.f312357c + ')';
    }

    public s(long j10, @Nullable s sVar, @Nullable s sVar2) {
        this.f312355a = j10;
        this.f312356b = sVar;
        this.f312357c = sVar2;
    }

    public /* synthetic */ s(long j10, s sVar, s sVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : sVar, (i10 & 4) != 0 ? null : sVar2);
    }
}
