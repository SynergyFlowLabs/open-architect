package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEdgeEffectCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeEffectCompat.android.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,208:1\n1#2:209\n113#3:210\n*S KotlinDebug\n*F\n+ 1 EdgeEffectCompat.android.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n*L\n121#1:210\n*E\n"})
final class k2 extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f15755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f15756b;

    public k2(@NotNull Context context) {
        super(context);
        this.f15755a = androidx.compose.ui.unit.a.a(context).S7(androidx.compose.ui.unit.h.r(1));
    }

    public final void a(float f10) {
        float f11 = this.f15756b + f10;
        this.f15756b = f11;
        if (Math.abs(f11) > this.f15755a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i10) {
        this.f15756b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10, float f11) {
        this.f15756b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f15756b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10) {
        this.f15756b = 0.0f;
        super.onPull(f10);
    }
}
