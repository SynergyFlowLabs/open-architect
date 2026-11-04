package klipper;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private u f312335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private u f312336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private k f312337c;

    public o() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ o e(o oVar, u uVar, u uVar2, k kVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uVar = oVar.f312335a;
        }
        if ((i10 & 2) != 0) {
            uVar2 = oVar.f312336b;
        }
        if ((i10 & 4) != 0) {
            kVar = oVar.f312337c;
        }
        return oVar.d(uVar, uVar2, kVar);
    }

    @Nullable
    public final u a() {
        return this.f312335a;
    }

    @Nullable
    public final u b() {
        return this.f312336b;
    }

    @NotNull
    public final k c() {
        return this.f312337c;
    }

    @NotNull
    public final o d(@Nullable u uVar, @Nullable u uVar2, @NotNull k offPt) {
        Intrinsics.checkNotNullParameter(offPt, "offPt");
        return new o(uVar, uVar2, offPt);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f312335a, oVar.f312335a) && Intrinsics.areEqual(this.f312336b, oVar.f312336b) && Intrinsics.areEqual(this.f312337c, oVar.f312337c);
    }

    @NotNull
    public final k f() {
        return this.f312337c;
    }

    @Nullable
    public final u g() {
        return this.f312335a;
    }

    @Nullable
    public final u h() {
        return this.f312336b;
    }

    public int hashCode() {
        u uVar = this.f312335a;
        int iHashCode = 0;
        int iHashCode2 = (uVar == null ? 0 : uVar.hashCode()) * 31;
        u uVar2 = this.f312336b;
        if (uVar2 != null) {
            iHashCode = uVar2.hashCode();
        }
        return ((iHashCode2 + iHashCode) * 31) + this.f312337c.hashCode();
    }

    public final void i(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f312337c = kVar;
    }

    public final void j(@Nullable u uVar) {
        this.f312335a = uVar;
    }

    public final void k(@Nullable u uVar) {
        this.f312336b = uVar;
    }

    @NotNull
    public String toString() {
        return "Join(outPt1=" + this.f312335a + ", outPt2=" + this.f312336b + ", offPt=" + this.f312337c + ')';
    }

    public o(@Nullable u uVar, @Nullable u uVar2, @NotNull k offPt) {
        Intrinsics.checkNotNullParameter(offPt, "offPt");
        this.f312335a = uVar;
        this.f312336b = uVar2;
        this.f312337c = offPt;
    }

    public /* synthetic */ o(u uVar, u uVar2, k kVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : uVar, (i10 & 2) != 0 ? null : uVar2, (i10 & 4) != 0 ? new k(0L, 0L, 3, null) : kVar);
    }
}
