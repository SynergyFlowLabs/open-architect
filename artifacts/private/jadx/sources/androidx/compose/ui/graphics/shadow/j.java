package androidx.compose.ui.graphics.shadow;

import androidx.annotation.x;
import androidx.compose.runtime.o2;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
@SourceDebugExtension({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/graphics/shadow/Shadow\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,169:1\n113#2:170\n113#2:172\n635#3:171\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/graphics/shadow/Shadow\n*L\n92#1:170\n121#1:172\n129#1:171\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f38217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f38218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f38219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f38221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final i0 f38222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f38223g;

    public /* synthetic */ j(float f10, long j10, float f11, long j11, @x(from = 0.0d, to = 1.0d) float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, j10, f11, j11, f12, i10);
    }

    @NotNull
    public final j a() {
        return new j(this.f38217a, this.f38218b, androidx.compose.ui.unit.j.f42694b.b(), this.f38221e, this.f38222f, this.f38223g, this.f38220d);
    }

    public final float b() {
        return this.f38223g;
    }

    public final int c() {
        return this.f38220d;
    }

    @Nullable
    public final i0 d() {
        return this.f38222f;
    }

    public final long e() {
        return this.f38221e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return androidx.compose.ui.unit.h.x(this.f38217a, jVar.f38217a) && androidx.compose.ui.unit.h.x(this.f38218b, jVar.f38218b) && androidx.compose.ui.unit.j.h(this.f38219c, jVar.f38219c) && this.f38223g == jVar.f38223g && d0.G(this.f38220d, jVar.f38220d) && q0.y(this.f38221e, jVar.f38221e) && Intrinsics.areEqual(this.f38222f, jVar.f38222f);
    }

    public final long f() {
        return this.f38219c;
    }

    public final float g() {
        return this.f38217a;
    }

    public final float h() {
        return this.f38218b;
    }

    public int hashCode() {
        int iD = ((((((((((androidx.compose.ui.unit.h.D(this.f38217a) * 31) + androidx.compose.ui.unit.h.D(this.f38218b)) * 31) + androidx.compose.ui.unit.j.n(this.f38219c)) * 31) + Float.hashCode(this.f38223g)) * 31) + d0.H(this.f38220d)) * 31) + q0.K(this.f38221e)) * 31;
        i0 i0Var = this.f38222f;
        return iD + (i0Var != null ? i0Var.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ShadowParams(radius=" + ((Object) androidx.compose.ui.unit.h.M(this.f38217a)) + ", spread=" + ((Object) androidx.compose.ui.unit.h.M(this.f38218b)) + ", offset=" + ((Object) androidx.compose.ui.unit.j.q(this.f38219c)) + ", alpha=" + this.f38223g + ", blendMode=" + ((Object) d0.I(this.f38220d)) + ", color=" + ((Object) q0.L(this.f38221e)) + ", brush=" + this.f38222f + ')';
    }

    public /* synthetic */ j(float f10, i0 i0Var, float f11, long j10, @x(from = 0.0d, to = 1.0d) float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i0Var, f11, j10, f12, i10);
    }

    private j(float f10, float f11, long j10, long j11, i0 i0Var, @x(from = 0.0d, to = 1.0d) float f12, int i10) {
        this.f38217a = f10;
        this.f38218b = f11;
        this.f38219c = j10;
        this.f38220d = i10;
        if (i0Var instanceof s3) {
            this.f38221e = ((s3) i0Var).c();
            this.f38222f = null;
        } else {
            this.f38221e = j11;
            this.f38222f = i0Var;
        }
        this.f38223g = r.H(f12, 0.0f, 1.0f);
    }

    private j(float f10, i0 i0Var, float f11, long j10, float f12, int i10) {
        this(f10, f11, j10, q0.f38131b.a(), i0Var, f12, i10);
    }

    public /* synthetic */ j(float f10, long j10, float f11, long j11, float f12, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i11 & 2) != 0 ? q0.f38131b.a() : j10, (i11 & 4) != 0 ? androidx.compose.ui.unit.h.r(0) : f11, (i11 & 8) != 0 ? androidx.compose.ui.unit.j.f42694b.b() : j11, (i11 & 16) != 0 ? 1.0f : f12, (i11 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.a() : i10, (DefaultConstructorMarker) null);
    }

    private j(float f10, long j10, float f11, long j11, float f12, int i10) {
        this(f10, f11, j11, j10 == 16 ? q0.f38131b.a() : j10, (i0) null, f12, i10);
    }

    public /* synthetic */ j(float f10, i0 i0Var, float f11, long j10, float f12, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i0Var, (i11 & 4) != 0 ? androidx.compose.ui.unit.h.r(0) : f11, (i11 & 8) != 0 ? androidx.compose.ui.unit.j.f42694b.b() : j10, (i11 & 16) != 0 ? 1.0f : f12, (i11 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.a() : i10, (DefaultConstructorMarker) null);
    }
}
