package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@u7
@androidx.compose.runtime.o2
@kotlin.l(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
public final class t8 implements zk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f24989b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f24990a;

    public /* synthetic */ t8(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    private final float b() {
        return this.f24990a;
    }

    public static /* synthetic */ t8 d(t8 t8Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = t8Var.f24990a;
        }
        return t8Var.c(f10);
    }

    @Override // androidx.compose.material.zk
    public float a(@NotNull androidx.compose.ui.unit.d dVar, float f10, float f11) {
        return f10 + (dVar.S7(this.f24990a) * Math.signum(f11 - f10));
    }

    @NotNull
    public final t8 c(float f10) {
        return new t8(f10, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8) && androidx.compose.ui.unit.h.x(this.f24990a, ((t8) obj).f24990a);
    }

    public int hashCode() {
        return androidx.compose.ui.unit.h.D(this.f24990a);
    }

    @NotNull
    public String toString() {
        return "FixedThreshold(offset=" + ((Object) androidx.compose.ui.unit.h.M(this.f24990a)) + ')';
    }

    private t8(float f10) {
        this.f24990a = f10;
    }
}
