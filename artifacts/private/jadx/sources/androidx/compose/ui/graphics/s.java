package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,81:1\n36#2,5:82\n36#2,5:87\n30#3:92\n30#3:96\n53#4,3:93\n53#4,3:97\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n42#1:82,5\n48#1:87,5\n60#1:92\n75#1:96\n60#1:93,3\n75#1:97,3\n*E\n"})
public final class s implements s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final PathMeasure f38173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private float[] f38174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private float[] f38175c;

    public s(@NotNull PathMeasure pathMeasure) {
        this.f38173a = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.s2
    public long a(float f10) {
        if (this.f38174b == null) {
            this.f38174b = new float[2];
        }
        if (this.f38175c == null) {
            this.f38175c = new float[2];
        }
        if (!this.f38173a.getPosTan(f10, this.f38174b, this.f38175c)) {
            return n0.g.f332700b.c();
        }
        float[] fArr = this.f38175c;
        Intrinsics.checkNotNull(fArr);
        float f11 = fArr[0];
        float[] fArr2 = this.f38175c;
        Intrinsics.checkNotNull(fArr2);
        return n0.g.g((((long) Float.floatToRawIntBits(fArr2[1])) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f11) << 32));
    }

    @Override // androidx.compose.ui.graphics.s2
    public boolean b(float f10, float f11, @NotNull k2 k2Var, boolean z10) {
        PathMeasure pathMeasure = this.f38173a;
        if (k2Var instanceof n) {
            return pathMeasure.getSegment(f10, f11, ((n) k2Var).Z(), z10);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.s2
    public void d(@Nullable k2 k2Var, boolean z10) {
        Path pathZ;
        PathMeasure pathMeasure = this.f38173a;
        if (k2Var == null) {
            pathZ = null;
        } else {
            if (!(k2Var instanceof n)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            pathZ = ((n) k2Var).Z();
        }
        pathMeasure.setPath(pathZ, z10);
    }

    @Override // androidx.compose.ui.graphics.s2
    public long e(float f10) {
        if (this.f38174b == null) {
            this.f38174b = new float[2];
        }
        if (this.f38175c == null) {
            this.f38175c = new float[2];
        }
        if (!this.f38173a.getPosTan(f10, this.f38174b, this.f38175c)) {
            return n0.g.f332700b.c();
        }
        float[] fArr = this.f38174b;
        Intrinsics.checkNotNull(fArr);
        float f11 = fArr[0];
        float[] fArr2 = this.f38174b;
        Intrinsics.checkNotNull(fArr2);
        return n0.g.g((((long) Float.floatToRawIntBits(fArr2[1])) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f11) << 32));
    }

    @Override // androidx.compose.ui.graphics.s2
    public float getLength() {
        return this.f38173a.getLength();
    }
}
