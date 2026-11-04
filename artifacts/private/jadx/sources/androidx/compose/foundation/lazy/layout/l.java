package androidx.compose.foundation.lazy.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class l implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f17465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f17466b;

    public l(float f10, float f11) {
        this.f17465a = f10;
        this.f17466b = f11;
    }

    @Override // androidx.compose.foundation.lazy.layout.w
    public int a(@NotNull androidx.compose.ui.unit.d dVar, int i10) {
        return kotlin.math.b.L0(i10 * this.f17466b);
    }

    @Override // androidx.compose.foundation.lazy.layout.w
    public int b(@NotNull androidx.compose.ui.unit.d dVar, int i10) {
        return kotlin.math.b.L0(i10 * this.f17465a);
    }

    public final float c() {
        return this.f17465a;
    }

    public final float d() {
        return this.f17466b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.f17465a == this.f17465a && lVar.f17466b == this.f17466b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f17465a) * 31) + Float.hashCode(this.f17466b);
    }
}
