package androidx.compose.material.ripple;

import androidx.compose.runtime.o2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24776e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f24777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f24778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f24779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f24780d;

    public l(float f10, float f11, float f12, float f13) {
        this.f24777a = f10;
        this.f24778b = f11;
        this.f24779c = f12;
        this.f24780d = f13;
    }

    public final float a() {
        return this.f24777a;
    }

    public final float b() {
        return this.f24778b;
    }

    public final float c() {
        return this.f24779c;
    }

    public final float d() {
        return this.f24780d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f24777a == lVar.f24777a && this.f24778b == lVar.f24778b && this.f24779c == lVar.f24779c && this.f24780d == lVar.f24780d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f24777a) * 31) + Float.hashCode(this.f24778b)) * 31) + Float.hashCode(this.f24779c)) * 31) + Float.hashCode(this.f24780d);
    }

    @NotNull
    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f24777a + ", focusedAlpha=" + this.f24778b + ", hoveredAlpha=" + this.f24779c + ", pressedAlpha=" + this.f24780d + ')';
    }
}
