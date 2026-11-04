package androidx.compose.material3.carousel;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselPageSize\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,865:1\n85#2:866\n117#2,2:867\n*S KotlinDebug\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselPageSize\n*L\n514#1:866\n514#1:867,2\n*E\n"})
public final class b0 implements androidx.compose.foundation.pager.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f26541e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<Float, Float, p0> f26542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f26543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f26544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f26545d = d7.g(y0.f26720n.a(), null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@NotNull Function2<? super Float, ? super Float, p0> function2, float f10, float f11) {
        this.f26542a = function2;
        this.f26543b = f10;
        this.f26544c = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final y0 c() {
        return (y0) this.f26545d.getValue();
    }

    private final void d(y0 y0Var) {
        this.f26545d.setValue(y0Var);
    }

    @Override // androidx.compose.foundation.pager.p
    public int a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11) {
        float f10 = i10;
        float f11 = i11;
        d(new y0(this.f26542a.invoke(Float.valueOf(f10), Float.valueOf(f11)), f10, f11, this.f26543b, this.f26544c));
        return b().l() ? kotlin.math.b.L0(b().g()) : i10;
    }

    @NotNull
    public final y0 b() {
        return c();
    }
}
