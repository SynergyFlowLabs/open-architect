package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,477:1\n93#2,4:478\n113#3:482\n113#3:483\n113#3:484\n113#3:485\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n304#1:478,4\n297#1:482\n298#1:483\n299#1:484\n300#1:485\n*E\n"})
public final class i5 implements g5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16093f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f16094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f16095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f16096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f16097e;

    public /* synthetic */ i5(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void f() {
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void h() {
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void j() {
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void l() {
    }

    @Override // androidx.compose.foundation.layout.g5
    public float a() {
        return this.f16097e;
    }

    @Override // androidx.compose.foundation.layout.g5
    public float b(@NotNull androidx.compose.ui.unit.w wVar) {
        return wVar == androidx.compose.ui.unit.w.Ltr ? this.f16094b : this.f16096d;
    }

    @Override // androidx.compose.foundation.layout.g5
    public float c(@NotNull androidx.compose.ui.unit.w wVar) {
        return wVar == androidx.compose.ui.unit.w.Ltr ? this.f16096d : this.f16094b;
    }

    @Override // androidx.compose.foundation.layout.g5
    public float d() {
        return this.f16095c;
    }

    public final float e() {
        return this.f16097e;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return androidx.compose.ui.unit.h.x(this.f16094b, i5Var.f16094b) && androidx.compose.ui.unit.h.x(this.f16095c, i5Var.f16095c) && androidx.compose.ui.unit.h.x(this.f16096d, i5Var.f16096d) && androidx.compose.ui.unit.h.x(this.f16097e, i5Var.f16097e);
    }

    public final float g() {
        return this.f16096d;
    }

    public int hashCode() {
        return (((((androidx.compose.ui.unit.h.D(this.f16094b) * 31) + androidx.compose.ui.unit.h.D(this.f16095c)) * 31) + androidx.compose.ui.unit.h.D(this.f16096d)) * 31) + androidx.compose.ui.unit.h.D(this.f16097e);
    }

    public final float i() {
        return this.f16094b;
    }

    public final float k() {
        return this.f16095c;
    }

    @NotNull
    public String toString() {
        return "PaddingValues(start=" + ((Object) androidx.compose.ui.unit.h.M(this.f16094b)) + ", top=" + ((Object) androidx.compose.ui.unit.h.M(this.f16095c)) + ", end=" + ((Object) androidx.compose.ui.unit.h.M(this.f16096d)) + ", bottom=" + ((Object) androidx.compose.ui.unit.h.M(this.f16097e)) + ')';
    }

    private i5(float f10, float f11, float f12, float f13) {
        this.f16094b = f10;
        this.f16095c = f11;
        this.f16096d = f12;
        this.f16097e = f13;
        boolean z10 = true & false;
        if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
            x.a.f("Padding must be non-negative");
        }
    }

    public /* synthetic */ i5(float f10, float f11, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.unit.h.r(0) : f10, (i10 & 2) != 0 ? androidx.compose.ui.unit.h.r(0) : f11, (i10 & 4) != 0 ? androidx.compose.ui.unit.h.r(0) : f12, (i10 & 8) != 0 ? androidx.compose.ui.unit.h.r(0) : f13, null);
    }
}
