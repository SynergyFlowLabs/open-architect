package com.planner5d.library.mesh;

import com.planner5d.library.walls.WallsInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WallsInfo f180491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f180492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f180493c;

    public b(@NotNull WallsInfo info, float f10, boolean z10) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f180491a = info;
        this.f180492b = f10;
        this.f180493c = z10;
    }

    public static /* synthetic */ b e(b bVar, WallsInfo wallsInfo, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            wallsInfo = bVar.f180491a;
        }
        if ((i10 & 2) != 0) {
            f10 = bVar.f180492b;
        }
        if ((i10 & 4) != 0) {
            z10 = bVar.f180493c;
        }
        return bVar.d(wallsInfo, f10, z10);
    }

    @NotNull
    public final WallsInfo a() {
        return this.f180491a;
    }

    public final float b() {
        return this.f180492b;
    }

    public final boolean c() {
        return this.f180493c;
    }

    @NotNull
    public final b d(@NotNull WallsInfo info, float f10, boolean z10) {
        Intrinsics.checkNotNullParameter(info, "info");
        return new b(info, f10, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f180491a, bVar.f180491a) && Intrinsics.areEqual((Object) Float.valueOf(this.f180492b), (Object) Float.valueOf(bVar.f180492b)) && this.f180493c == bVar.f180493c;
    }

    public final boolean f() {
        return this.f180493c;
    }

    @NotNull
    public final WallsInfo g() {
        return this.f180491a;
    }

    public final float h() {
        return this.f180492b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((this.f180491a.hashCode() * 31) + Float.hashCode(this.f180492b)) * 31;
        boolean z10 = this.f180493c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    @NotNull
    public String toString() {
        return "BuildRequestFlooring(info=" + this.f180491a + ", y=" + this.f180492b + ", fistFloor=" + this.f180493c + ')';
    }
}
