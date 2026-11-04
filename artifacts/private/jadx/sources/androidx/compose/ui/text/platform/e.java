package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.m3;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.graphics.s3;
import androidx.compose.ui.text.f0;
import androidx.compose.ui.text.o0;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidMultiParagraphDraw.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMultiParagraphDraw.android.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDraw_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,95:1\n35#2,5:96\n35#2,5:105\n35#2,5:110\n33#3:101\n53#4,3:102\n*S KotlinDebug\n*F\n+ 1 AndroidMultiParagraphDraw.android.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDraw_androidKt\n*L\n53#1:96,5\n60#1:105,5\n90#1:110,5\n57#1:101\n57#1:102,3\n*E\n"})
public final class e {
    public static final void a(@NotNull f0 f0Var, @NotNull k0 k0Var, @NotNull i0 i0Var, float f10, @Nullable o3 o3Var, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.drawscope.i iVar, int i10) {
        k0Var.save();
        if (f0Var.G().size() <= 1 || (i0Var instanceof s3)) {
            c(f0Var, k0Var, i0Var, f10, o3Var, kVar, iVar, i10);
        } else {
            if (!(i0Var instanceof m3)) {
                throw new kotlin.k0();
            }
            List<o0> listG = f0Var.G();
            int size = listG.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                o0 o0Var = listG.get(i11);
                height += o0Var.n().getHeight();
                fMax = Math.max(fMax, o0Var.n().getWidth());
            }
            Shader shaderC = ((m3) i0Var).c(n0.n.f((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(height)) & com.rabbitmq.client.k0.f265952a)));
            Matrix matrix = new Matrix();
            shaderC.getLocalMatrix(matrix);
            List<o0> listG2 = f0Var.G();
            int size2 = listG2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                o0 o0Var2 = listG2.get(i12);
                o0Var2.n().D(k0Var, j0.a(shaderC), f10, o3Var, kVar, iVar, i10);
                k0Var.c(0.0f, o0Var2.n().getHeight());
                matrix.setTranslate(0.0f, -o0Var2.n().getHeight());
                shaderC.setLocalMatrix(matrix);
            }
        }
        k0Var.B();
    }

    public static /* synthetic */ void b(f0 f0Var, k0 k0Var, i0 i0Var, float f10, o3 o3Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        a(f0Var, k0Var, i0Var, f10, (i11 & 8) != 0 ? null : o3Var, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : iVar, (i11 & 64) != 0 ? androidx.compose.ui.graphics.d0.f37693b.B() : i10);
    }

    private static final void c(f0 f0Var, k0 k0Var, i0 i0Var, float f10, o3 o3Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i10) {
        List<o0> listG = f0Var.G();
        int size = listG.size();
        for (int i11 = 0; i11 < size; i11++) {
            o0 o0Var = listG.get(i11);
            o0Var.n().D(k0Var, i0Var, f10, o3Var, kVar, iVar, i10);
            k0Var.c(0.0f, o0Var.n().getHeight());
        }
    }
}
