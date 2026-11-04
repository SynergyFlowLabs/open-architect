package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,584:1\n113#2:585\n113#2:586\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n*L\n567#1:585\n568#1:586\n*E\n"})
public final class z2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16612e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f16615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f16616d;

    public /* synthetic */ z2(int i10, int i11, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, f10, f11);
    }

    public final int a() {
        return this.f16613a;
    }

    public final float b() {
        return this.f16616d;
    }

    public final float c() {
        return this.f16615c;
    }

    public final int d() {
        return this.f16614b;
    }

    public final void e(int i10) {
        this.f16613a = i10;
    }

    public final void f(float f10) {
        this.f16616d = f10;
    }

    public final void g(float f10) {
        this.f16615c = f10;
    }

    public final void h(int i10) {
        this.f16614b = i10;
    }

    public final void i(int i10, int i11, float f10, float f11) {
        this.f16613a = i10;
        this.f16614b = i11;
        this.f16615c = f10;
        this.f16616d = f11;
    }

    private z2(int i10, int i11, float f10, float f11) {
        this.f16613a = i10;
        this.f16614b = i11;
        this.f16615c = f10;
        this.f16616d = f11;
    }

    public /* synthetic */ z2(int i10, int i11, float f10, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? androidx.compose.ui.unit.h.r(0) : f10, (i12 & 8) != 0 ? androidx.compose.ui.unit.h.r(0) : f11, null);
    }
}
