package androidx.compose.material3.carousel;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.g4;
import androidx.compose.runtime.k3;
import androidx.compose.runtime.n3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nCarouselState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselState.kt\nandroidx/compose/material3/carousel/CarouselItemDrawInfoImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n114#2,2:345\n81#2:347\n114#2,2:348\n81#2:350\n114#2,2:351\n85#3:353\n117#3,2:354\n*S KotlinDebug\n*F\n+ 1 CarouselState.kt\nandroidx/compose/material3/carousel/CarouselItemDrawInfoImpl\n*L\n326#1:344\n326#1:345,2\n327#1:347\n327#1:348,2\n328#1:350\n328#1:351,2\n329#1:353\n329#1:354,2\n*E\n"})
public final class e implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f26553e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k3 f26554a = g4.b(0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k3 f26555b = g4.b(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k3 f26556c = g4.b(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f26557d = d7.g(n0.j.f332705e.a(), null, 2, null);

    @Override // androidx.compose.material3.carousel.d
    public float a() {
        return e();
    }

    @Override // androidx.compose.material3.carousel.d
    public float b() {
        return f();
    }

    @Override // androidx.compose.material3.carousel.d
    @NotNull
    public n0.j c() {
        return d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final n0.j d() {
        return (n0.j) this.f26557d.getValue();
    }

    public final float e() {
        return this.f26556c.V0();
    }

    public final float f() {
        return this.f26555b.V0();
    }

    public final float g() {
        return this.f26554a.V0();
    }

    @Override // androidx.compose.material3.carousel.d
    public float getSize() {
        return g();
    }

    public final void h(@NotNull n0.j jVar) {
        this.f26557d.setValue(jVar);
    }

    public final void i(float f10) {
        this.f26556c.q(f10);
    }

    public final void j(float f10) {
        this.f26555b.q(f10);
    }

    public final void k(float f10) {
        this.f26554a.q(f10);
    }
}
