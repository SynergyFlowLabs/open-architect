package androidx.compose.ui.unit;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class x implements f1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f42727a;

    public x(float f10) {
        this.f42727a = f10;
    }

    private final float c() {
        return this.f42727a;
    }

    public static /* synthetic */ x e(x xVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = xVar.f42727a;
        }
        return xVar.d(f10);
    }

    @Override // f1.a
    public float a(float f10) {
        return f10 / this.f42727a;
    }

    @Override // f1.a
    public float b(float f10) {
        return f10 * this.f42727a;
    }

    @NotNull
    public final x d(float f10) {
        return new x(f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Float.compare(this.f42727a, ((x) obj).f42727a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f42727a);
    }

    @NotNull
    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f42727a + ')';
    }
}
