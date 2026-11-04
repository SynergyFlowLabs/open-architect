package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class u extends w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f13306f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f13307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f13308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f13309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f13310e;

    public u(float f10, float f11, float f12) {
        super(null);
        this.f13307b = f10;
        this.f13308c = f11;
        this.f13309d = f12;
        int i10 = 7 & 3;
        this.f13310e = 3;
    }

    @Override // androidx.compose.animation.core.w
    public float a(int i10) {
        if (i10 == 0) {
            return this.f13307b;
        }
        if (i10 == 1) {
            return this.f13308c;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f13309d;
    }

    @Override // androidx.compose.animation.core.w
    public int b() {
        return this.f13310e;
    }

    @Override // androidx.compose.animation.core.w
    public void d() {
        this.f13307b = 0.0f;
        this.f13308c = 0.0f;
        this.f13309d = 0.0f;
    }

    @Override // androidx.compose.animation.core.w
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f13307b = f10;
        } else if (i10 == 1) {
            this.f13308c = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f13309d = f10;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return uVar.f13307b == this.f13307b && uVar.f13308c == this.f13308c && uVar.f13309d == this.f13309d;
    }

    public final float f() {
        return this.f13307b;
    }

    public final float g() {
        return this.f13308c;
    }

    public final float h() {
        return this.f13309d;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f13307b) * 31) + Float.hashCode(this.f13308c)) * 31) + Float.hashCode(this.f13309d);
    }

    @Override // androidx.compose.animation.core.w
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public u c() {
        return new u(0.0f, 0.0f, 0.0f);
    }

    public final void j(float f10) {
        this.f13307b = f10;
    }

    public final void k(float f10) {
        this.f13308c = f10;
    }

    public final void l(float f10) {
        this.f13309d = f10;
    }

    @NotNull
    public String toString() {
        return "AnimationVector3D: v1 = " + this.f13307b + ", v2 = " + this.f13308c + ", v3 = " + this.f13309d;
    }
}
