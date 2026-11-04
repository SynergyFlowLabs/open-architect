package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class t extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13287e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f13288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f13289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13290d;

    public t(float f10, float f11) {
        super(null);
        this.f13288b = f10;
        this.f13289c = f11;
        this.f13290d = 2;
    }

    @Override // androidx.compose.animation.core.w
    public float a(int i10) {
        if (i10 == 0) {
            return this.f13288b;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f13289c;
    }

    @Override // androidx.compose.animation.core.w
    public int b() {
        return this.f13290d;
    }

    @Override // androidx.compose.animation.core.w
    public void d() {
        this.f13288b = 0.0f;
        this.f13289c = 0.0f;
    }

    @Override // androidx.compose.animation.core.w
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f13288b = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f13289c = f10;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return tVar.f13288b == this.f13288b && tVar.f13289c == this.f13289c;
    }

    public final float f() {
        return this.f13288b;
    }

    public final float g() {
        return this.f13289c;
    }

    @Override // androidx.compose.animation.core.w
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public t c() {
        return new t(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f13288b) * 31) + Float.hashCode(this.f13289c);
    }

    public final void i(float f10) {
        this.f13288b = f10;
    }

    public final void j(float f10) {
        this.f13289c = f10;
    }

    @NotNull
    public String toString() {
        return "AnimationVector2D: v1 = " + this.f13288b + ", v2 = " + this.f13289c;
    }
}
