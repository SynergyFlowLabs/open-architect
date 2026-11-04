package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.p0;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@h
@SourceDebugExtension({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransform\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,164:1\n57#2:165\n61#2:168\n57#2:174\n61#2:177\n60#3:166\n70#3:169\n53#3,3:171\n60#3:175\n70#3:178\n22#4:167\n22#4:176\n22#4:179\n30#5:170\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransform\n*L\n80#1:165\n80#1:168\n111#1:174\n112#1:177\n80#1:166\n80#1:169\n80#1:171,3\n111#1:175\n112#1:178\n80#1:167\n111#1:176\n112#1:179\n80#1:170\n*E\n"})
public interface j {

    public static final class a {
        @Deprecated
        public static long c(@NotNull j jVar) {
            return j.super.Y();
        }
    }

    static /* synthetic */ void j(j jVar, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        jVar.c(f10, f11);
    }

    static /* synthetic */ void k(j jVar, k2 k2Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = p0.f38096b.b();
        }
        jVar.e(k2Var, i10);
    }

    static /* synthetic */ void l(j jVar, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = Float.intBitsToFloat((int) (jVar.d() >> 32));
        }
        if ((i11 & 8) != 0) {
            f13 = Float.intBitsToFloat((int) (jVar.d() & k0.f265952a));
        }
        if ((i11 & 16) != 0) {
            i10 = p0.f38096b.b();
        }
        jVar.b(f10, f11, f12, f13, i10);
    }

    static /* synthetic */ void m(j jVar, float f10, float f11, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i10 & 4) != 0) {
            j10 = jVar.Y();
        }
        jVar.g(f10, f11, j10);
    }

    static /* synthetic */ void n(j jVar, float f10, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = jVar.Y();
        }
        jVar.h(f10, j10);
    }

    default long Y() {
        int i10 = 6 >> 2;
        float f10 = 2;
        return n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (d() >> 32)) / f10)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (d() & k0.f265952a)) / f10)) & k0.f265952a));
    }

    void a(@NotNull float[] fArr);

    void b(float f10, float f11, float f12, float f13, int i10);

    void c(float f10, float f11);

    long d();

    void e(@NotNull k2 k2Var, int i10);

    void g(float f10, float f11, long j10);

    void h(float f10, long j10);

    void i(float f10, float f11, float f12, float f13);
}
