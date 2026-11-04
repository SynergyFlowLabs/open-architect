package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class s extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13250d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f13251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13252c;

    public s(float f10) {
        super(null);
        this.f13251b = f10;
        this.f13252c = 1;
    }

    @Override // androidx.compose.animation.core.w
    public float a(int i10) {
        if (i10 == 0) {
            return this.f13251b;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.w
    public int b() {
        return this.f13252c;
    }

    @Override // androidx.compose.animation.core.w
    public void d() {
        this.f13251b = 0.0f;
    }

    @Override // androidx.compose.animation.core.w
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f13251b = f10;
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof s) && ((s) obj).f13251b == this.f13251b;
    }

    public final float f() {
        return this.f13251b;
    }

    @Override // androidx.compose.animation.core.w
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public s c() {
        return new s(0.0f);
    }

    public final void h(float f10) {
        this.f13251b = f10;
    }

    public int hashCode() {
        return Float.hashCode(this.f13251b);
    }

    @NotNull
    public String toString() {
        return "AnimationVector1D: value = " + this.f13251b;
    }
}
