package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public final class h0 extends e3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final e3 f37786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f37787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f37788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37789e;

    public /* synthetic */ h0(e3 e3Var, float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e3Var, f10, f11, i10);
    }

    @Override // androidx.compose.ui.graphics.e3
    @androidx.annotation.w0(31)
    @NotNull
    protected RenderEffect b() {
        return k3.f37833a.a(this.f37786b, this.f37787c, this.f37788d, this.f37789e);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f37787c == h0Var.f37787c && this.f37788d == h0Var.f37788d) {
            return x3.h(this.f37789e, h0Var.f37789e) && Intrinsics.areEqual(this.f37786b, h0Var.f37786b);
        }
        return false;
    }

    public int hashCode() {
        e3 e3Var = this.f37786b;
        return ((((((e3Var != null ? e3Var.hashCode() : 0) * 31) + Float.hashCode(this.f37787c)) * 31) + Float.hashCode(this.f37788d)) * 31) + x3.i(this.f37789e);
    }

    @NotNull
    public String toString() {
        return "BlurEffect(renderEffect=" + this.f37786b + ", radiusX=" + this.f37787c + ", radiusY=" + this.f37788d + ", edgeTreatment=" + ((Object) x3.j(this.f37789e)) + ')';
    }

    private h0(e3 e3Var, float f10, float f11, int i10) {
        super(null);
        this.f37786b = e3Var;
        this.f37787c = f10;
        this.f37788d = f11;
        this.f37789e = i10;
    }

    public /* synthetic */ h0(e3 e3Var, float f10, float f11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(e3Var, f10, (i11 & 4) != 0 ? f10 : f11, (i11 & 8) != 0 ? x3.f38688b.a() : i10, null);
    }
}
