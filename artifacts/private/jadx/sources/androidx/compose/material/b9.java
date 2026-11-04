package androidx.compose.material;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@u7
@androidx.compose.runtime.o2
@kotlin.l(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
public final class b9 implements zk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f22173b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22174a;

    public b9(float f10) {
        this.f22174a = f10;
    }

    private final float b() {
        return this.f22174a;
    }

    public static /* synthetic */ b9 d(b9 b9Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = b9Var.f22174a;
        }
        return b9Var.c(f10);
    }

    @Override // androidx.compose.material.zk
    public float a(@NotNull androidx.compose.ui.unit.d dVar, float f10, float f11) {
        return androidx.compose.ui.util.e.r(f10, f11, this.f22174a);
    }

    @NotNull
    public final b9 c(float f10) {
        return new b9(f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9) && Float.compare(this.f22174a, ((b9) obj).f22174a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f22174a);
    }

    @NotNull
    public String toString() {
        return "FractionalThreshold(fraction=" + this.f22174a + ')';
    }
}
