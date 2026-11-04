package oc;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f333620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f333621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f333622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f333623d;

    public a(float f10, float f11, float f12, int i10) {
        this.f333620a = f10;
        this.f333621b = f11;
        this.f333622c = f12;
        this.f333623d = i10;
    }

    public static /* synthetic */ a f(a aVar, float f10, float f11, float f12, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f10 = aVar.f333620a;
        }
        if ((i11 & 2) != 0) {
            f11 = aVar.f333621b;
        }
        if ((i11 & 4) != 0) {
            f12 = aVar.f333622c;
        }
        if ((i11 & 8) != 0) {
            i10 = aVar.f333623d;
        }
        return aVar.e(f10, f11, f12, i10);
    }

    public final float a() {
        return this.f333620a;
    }

    public final float b() {
        return this.f333621b;
    }

    public final float c() {
        return this.f333622c;
    }

    public final int d() {
        return this.f333623d;
    }

    @NotNull
    public final a e(float f10, float f11, float f12, int i10) {
        return new a(f10, f11, f12, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f333620a, aVar.f333620a) == 0 && Float.compare(this.f333621b, aVar.f333621b) == 0 && Float.compare(this.f333622c, aVar.f333622c) == 0 && this.f333623d == aVar.f333623d;
    }

    public final int g() {
        return this.f333623d;
    }

    public final float h() {
        return this.f333620a;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f333620a) * 31) + Float.hashCode(this.f333621b)) * 31) + Float.hashCode(this.f333622c)) * 31) + Integer.hashCode(this.f333623d);
    }

    public final float i() {
        return this.f333621b;
    }

    public final float j() {
        return this.f333622c;
    }

    @NotNull
    public String toString() {
        return "Vertex(x=" + this.f333620a + ", y=" + this.f333621b + ", z=" + this.f333622c + ", color=" + this.f333623d + ")";
    }
}
