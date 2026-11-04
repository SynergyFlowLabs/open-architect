package ub;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f381210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f381211b;

    public a(float f10, float f11) {
        this.f381210a = f10;
        this.f381211b = f11;
    }

    public static /* synthetic */ a d(a aVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = aVar.f381210a;
        }
        if ((i10 & 2) != 0) {
            f11 = aVar.f381211b;
        }
        return aVar.c(f10, f11);
    }

    public final float a() {
        return this.f381210a;
    }

    public final float b() {
        return this.f381211b;
    }

    @NotNull
    public final a c(float f10, float f11) {
        return new a(f10, f11);
    }

    public final float e() {
        return this.f381211b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f381210a), (Object) Float.valueOf(aVar.f381210a)) && Intrinsics.areEqual((Object) Float.valueOf(this.f381211b), (Object) Float.valueOf(aVar.f381211b));
    }

    public final float f() {
        return this.f381210a;
    }

    public int hashCode() {
        return (Float.hashCode(this.f381210a) * 31) + Float.hashCode(this.f381211b);
    }

    @NotNull
    public String toString() {
        return "AxisAlignedRectangleHitInfo(enterParameter=" + this.f381210a + ", angleToTarget=" + this.f381211b + ')';
    }
}
