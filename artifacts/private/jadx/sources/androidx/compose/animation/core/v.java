package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class v extends w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f13322g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f13323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f13324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f13325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f13326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13327f;

    public v(float f10, float f11, float f12, float f13) {
        super(null);
        this.f13323b = f10;
        this.f13324c = f11;
        this.f13325d = f12;
        this.f13326e = f13;
        this.f13327f = 4;
    }

    @Override // androidx.compose.animation.core.w
    public float a(int i10) {
        if (i10 == 0) {
            return this.f13323b;
        }
        if (i10 == 1) {
            return this.f13324c;
        }
        if (i10 == 2) {
            return this.f13325d;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f13326e;
    }

    @Override // androidx.compose.animation.core.w
    public int b() {
        return this.f13327f;
    }

    @Override // androidx.compose.animation.core.w
    public void d() {
        this.f13323b = 0.0f;
        this.f13324c = 0.0f;
        this.f13325d = 0.0f;
        this.f13326e = 0.0f;
    }

    @Override // androidx.compose.animation.core.w
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f13323b = f10;
            return;
        }
        if (i10 == 1) {
            this.f13324c = f10;
        } else if (i10 == 2) {
            this.f13325d = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f13326e = f10;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.f13323b == this.f13323b && vVar.f13324c == this.f13324c && vVar.f13325d == this.f13325d && vVar.f13326e == this.f13326e;
    }

    public final float f() {
        return this.f13323b;
    }

    public final float g() {
        return this.f13324c;
    }

    public final float h() {
        return this.f13325d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f13323b) * 31) + Float.hashCode(this.f13324c)) * 31) + Float.hashCode(this.f13325d)) * 31) + Float.hashCode(this.f13326e);
    }

    public final float i() {
        return this.f13326e;
    }

    @Override // androidx.compose.animation.core.w
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public v c() {
        return new v(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void k(float f10) {
        this.f13323b = f10;
    }

    public final void l(float f10) {
        this.f13324c = f10;
    }

    public final void m(float f10) {
        this.f13325d = f10;
    }

    public final void n(float f10) {
        this.f13326e = f10;
    }

    @NotNull
    public String toString() {
        return "AnimationVector4D: v1 = " + this.f13323b + ", v2 = " + this.f13324c + ", v3 = " + this.f13325d + ", v4 = " + this.f13326e;
    }
}
