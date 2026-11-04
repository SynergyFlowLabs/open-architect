package androidx.compose.foundation;

import androidx.compose.material.gc;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class BorderModifierNodeElement extends androidx.compose.ui.node.e1<z0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f13845f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f13846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.i0 f13847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.q3 f13848e;

    public /* synthetic */ BorderModifierNodeElement(float f10, androidx.compose.ui.graphics.i0 i0Var, androidx.compose.ui.graphics.q3 q3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i0Var, q3Var);
    }

    public static /* synthetic */ BorderModifierNodeElement p(BorderModifierNodeElement borderModifierNodeElement, float f10, androidx.compose.ui.graphics.i0 i0Var, androidx.compose.ui.graphics.q3 q3Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = borderModifierNodeElement.f13846c;
        }
        if ((i10 & 2) != 0) {
            i0Var = borderModifierNodeElement.f13847d;
        }
        if ((i10 & 4) != 0) {
            q3Var = borderModifierNodeElement.f13848e;
        }
        return borderModifierNodeElement.o(f10, i0Var, q3Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return androidx.compose.ui.unit.h.x(this.f13846c, borderModifierNodeElement.f13846c) && Intrinsics.areEqual(this.f13847d, borderModifierNodeElement.f13847d) && Intrinsics.areEqual(this.f13848e, borderModifierNodeElement.f13848e);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((androidx.compose.ui.unit.h.D(this.f13846c) * 31) + this.f13847d.hashCode()) * 31) + this.f13848e.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d(gc.f22899c);
        t2Var.b().c("width", androidx.compose.ui.unit.h.o(this.f13846c));
        if (this.f13847d instanceof androidx.compose.ui.graphics.s3) {
            t2Var.b().c("color", androidx.compose.ui.graphics.q0.n(((androidx.compose.ui.graphics.s3) this.f13847d).c()));
            t2Var.e(androidx.compose.ui.graphics.q0.n(((androidx.compose.ui.graphics.s3) this.f13847d).c()));
        } else {
            t2Var.b().c("brush", this.f13847d);
        }
        t2Var.b().c("shape", this.f13848e);
    }

    public final float l() {
        return this.f13846c;
    }

    @NotNull
    public final androidx.compose.ui.graphics.i0 m() {
        return this.f13847d;
    }

    @NotNull
    public final androidx.compose.ui.graphics.q3 n() {
        return this.f13848e;
    }

    @NotNull
    public final BorderModifierNodeElement o(float f10, @NotNull androidx.compose.ui.graphics.i0 i0Var, @NotNull androidx.compose.ui.graphics.q3 q3Var) {
        return new BorderModifierNodeElement(f10, i0Var, q3Var, null);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public z0 a() {
        return new z0(this.f13846c, this.f13847d, this.f13848e, null);
    }

    @NotNull
    public final androidx.compose.ui.graphics.i0 r() {
        return this.f13847d;
    }

    @NotNull
    public final androidx.compose.ui.graphics.q3 s() {
        return this.f13848e;
    }

    public final float t() {
        return this.f13846c;
    }

    @NotNull
    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) androidx.compose.ui.unit.h.M(this.f13846c)) + ", brush=" + this.f13847d + ", shape=" + this.f13848e + ')';
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull z0 z0Var) {
        z0Var.T9(this.f13846c);
        z0Var.P6(this.f13847d);
        z0Var.Q3(this.f13848e);
    }

    private BorderModifierNodeElement(float f10, androidx.compose.ui.graphics.i0 i0Var, androidx.compose.ui.graphics.q3 q3Var) {
        this.f13846c = f10;
        this.f13847d = i0Var;
        this.f13848e = q3Var;
    }
}
