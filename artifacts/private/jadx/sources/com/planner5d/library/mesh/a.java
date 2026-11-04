package com.planner5d.library.mesh;

import com.planner5d.library.walls.WallsInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WallsInfo f180488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f180489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f180490c;

    public a(@NotNull WallsInfo info, float f10, boolean z10) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f180488a = info;
        this.f180489b = f10;
        this.f180490c = z10;
    }

    public static /* synthetic */ a e(a aVar, WallsInfo wallsInfo, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            wallsInfo = aVar.f180488a;
        }
        if ((i10 & 2) != 0) {
            f10 = aVar.f180489b;
        }
        if ((i10 & 4) != 0) {
            z10 = aVar.f180490c;
        }
        return aVar.d(wallsInfo, f10, z10);
    }

    @NotNull
    public final WallsInfo a() {
        return this.f180488a;
    }

    public final float b() {
        return this.f180489b;
    }

    public final boolean c() {
        return this.f180490c;
    }

    @NotNull
    public final a d(@NotNull WallsInfo info, float f10, boolean z10) {
        Intrinsics.checkNotNullParameter(info, "info");
        return new a(info, f10, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f180488a, aVar.f180488a) && Intrinsics.areEqual((Object) Float.valueOf(this.f180489b), (Object) Float.valueOf(aVar.f180489b)) && this.f180490c == aVar.f180490c;
    }

    @NotNull
    public final WallsInfo f() {
        return this.f180488a;
    }

    public final boolean g() {
        return this.f180490c;
    }

    public final float h() {
        return this.f180489b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((this.f180488a.hashCode() * 31) + Float.hashCode(this.f180489b)) * 31;
        boolean z10 = this.f180490c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    @NotNull
    public String toString() {
        return "BuildRequestCeiling(info=" + this.f180488a + ", y=" + this.f180489b + ", roof=" + this.f180490c + ')';
    }
}
