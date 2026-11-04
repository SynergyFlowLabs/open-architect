package kf;

import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f312182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f312183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f312184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f312185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c f312186e;

    public a(@NotNull String id2, @NotNull k position, float f10, boolean z10, @NotNull c wall) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(wall, "wall");
        this.f312182a = id2;
        this.f312183b = position;
        this.f312184c = f10;
        this.f312185d = z10;
        this.f312186e = wall;
    }

    public static /* synthetic */ a g(a aVar, String str, k kVar, float f10, boolean z10, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f312182a;
        }
        if ((i10 & 2) != 0) {
            kVar = aVar.f312183b;
        }
        if ((i10 & 4) != 0) {
            f10 = aVar.f312184c;
        }
        if ((i10 & 8) != 0) {
            z10 = aVar.f312185d;
        }
        if ((i10 & 16) != 0) {
            cVar = aVar.f312186e;
        }
        c cVar2 = cVar;
        float f11 = f10;
        return aVar.f(str, kVar, f11, z10, cVar2);
    }

    @NotNull
    public final String a() {
        return this.f312182a;
    }

    @NotNull
    public final k b() {
        return this.f312183b;
    }

    public final float c() {
        return this.f312184c;
    }

    public final boolean d() {
        return this.f312185d;
    }

    @NotNull
    public final c e() {
        return this.f312186e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f312182a, aVar.f312182a) && Intrinsics.areEqual(this.f312183b, aVar.f312183b) && Intrinsics.areEqual((Object) Float.valueOf(this.f312184c), (Object) Float.valueOf(aVar.f312184c)) && this.f312185d == aVar.f312185d && Intrinsics.areEqual(this.f312186e, aVar.f312186e);
    }

    @NotNull
    public final a f(@NotNull String id2, @NotNull k position, float f10, boolean z10, @NotNull c wall) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(wall, "wall");
        return new a(id2, position, f10, z10, wall);
    }

    public final float h() {
        return this.f312184c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.f312182a.hashCode() * 31) + this.f312183b.hashCode()) * 31) + Float.hashCode(this.f312184c)) * 31;
        boolean z10 = this.f312185d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((iHashCode + r10) * 31) + this.f312186e.hashCode();
    }

    @NotNull
    public final String i() {
        return this.f312182a;
    }

    @NotNull
    public final k j() {
        return this.f312183b;
    }

    @NotNull
    public final c k() {
        return this.f312186e;
    }

    public final boolean l() {
        return this.f312185d;
    }

    @NotNull
    public String toString() {
        return "WizardDoorWindow(id=" + this.f312182a + ", position=" + this.f312183b + ", elevation=" + this.f312184c + ", isDoor=" + this.f312185d + ", wall=" + this.f312186e + ')';
    }
}
