package ub;

import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tb.g;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f381212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f381213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f381214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f381215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f381216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final g f381217f;

    public b(@NotNull k origin, @NotNull k point, float f10, float f11, boolean z10, @Nullable g gVar) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(point, "point");
        this.f381212a = origin;
        this.f381213b = point;
        this.f381214c = f10;
        this.f381215d = f11;
        this.f381216e = z10;
        this.f381217f = gVar;
    }

    public static /* synthetic */ b h(b bVar, k kVar, k kVar2, float f10, float f11, boolean z10, g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = bVar.f381212a;
        }
        if ((i10 & 2) != 0) {
            kVar2 = bVar.f381213b;
        }
        if ((i10 & 4) != 0) {
            f10 = bVar.f381214c;
        }
        if ((i10 & 8) != 0) {
            f11 = bVar.f381215d;
        }
        if ((i10 & 16) != 0) {
            z10 = bVar.f381216e;
        }
        if ((i10 & 32) != 0) {
            gVar = bVar.f381217f;
        }
        boolean z11 = z10;
        g gVar2 = gVar;
        return bVar.g(kVar, kVar2, f10, f11, z11, gVar2);
    }

    @NotNull
    public final k a() {
        return this.f381212a;
    }

    @NotNull
    public final k b() {
        return this.f381213b;
    }

    public final float c() {
        return this.f381214c;
    }

    public final float d() {
        return this.f381215d;
    }

    public final boolean e() {
        return this.f381216e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f381212a, bVar.f381212a) && Intrinsics.areEqual(this.f381213b, bVar.f381213b) && Intrinsics.areEqual((Object) Float.valueOf(this.f381214c), (Object) Float.valueOf(bVar.f381214c)) && Intrinsics.areEqual((Object) Float.valueOf(this.f381215d), (Object) Float.valueOf(bVar.f381215d)) && this.f381216e == bVar.f381216e && Intrinsics.areEqual(this.f381217f, bVar.f381217f);
    }

    @Nullable
    public final g f() {
        return this.f381217f;
    }

    @NotNull
    public final b g(@NotNull k origin, @NotNull k point, float f10, float f11, boolean z10, @Nullable g gVar) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(point, "point");
        return new b(origin, point, f10, f11, z10, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((((this.f381212a.hashCode() * 31) + this.f381213b.hashCode()) * 31) + Float.hashCode(this.f381214c)) * 31) + Float.hashCode(this.f381215d)) * 31;
        boolean z10 = this.f381216e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        g gVar = this.f381217f;
        return i10 + (gVar == null ? 0 : gVar.hashCode());
    }

    public final float i() {
        return this.f381214c;
    }

    @NotNull
    public final k j() {
        return this.f381212a;
    }

    public final boolean k() {
        return this.f381216e;
    }

    @NotNull
    public final k l() {
        return this.f381213b;
    }

    @Nullable
    public final g m() {
        return this.f381217f;
    }

    public final float n() {
        return this.f381215d;
    }

    @NotNull
    public String toString() {
        return "HitInfo(origin=" + this.f381212a + ", point=" + this.f381213b + ", distance=" + this.f381214c + ", targetAngle=" + this.f381215d + ", orthogonal=" + this.f381216e + ", reference=" + this.f381217f + ')';
    }
}
