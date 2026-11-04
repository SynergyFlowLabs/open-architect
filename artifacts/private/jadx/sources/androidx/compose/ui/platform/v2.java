package androidx.compose.ui.platform;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,81:1\n49#2:82\n49#2:83\n49#2:84\n49#2:85\n49#2:86\n49#2:87\n49#2:88\n49#2:89\n49#2:90\n49#2:91\n49#2:92\n49#2:93\n49#2:94\n49#2:95\n49#2:96\n49#2:97\n52#2,2:98\n52#2,2:100\n52#2,2:102\n52#2,2:104\n52#2,2:106\n52#2,2:108\n52#2,2:110\n52#2,2:112\n52#2,2:114\n52#2,2:116\n52#2,2:118\n52#2,2:120\n52#2,2:122\n52#2,2:124\n52#2,2:126\n52#2,2:128\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n29#1:82\n30#1:83\n31#1:84\n32#1:85\n33#1:86\n34#1:87\n35#1:88\n36#1:89\n37#1:90\n38#1:91\n39#1:92\n40#1:93\n41#1:94\n42#1:95\n43#1:96\n44#1:97\n62#1:98,2\n63#1:100,2\n64#1:102,2\n65#1:104,2\n66#1:106,2\n67#1:108,2\n68#1:110,2\n69#1:112,2\n70#1:114,2\n71#1:116,2\n72#1:118,2\n73#1:120,2\n74#1:122,2\n75#1:124,2\n76#1:126,2\n77#1:128,2\n*E\n"})
public final class v2 {
    public static final boolean a(@NotNull float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (((((f26 * f37) - (f27 * f36)) + (f28 * f35)) + (f29 * f34)) - (f30 * f33)) + (f31 * f32);
        if (f38 != 0.0f) {
            float f39 = 1.0f / f38;
            fArr2[0] = (((f15 * f37) - (f16 * f36)) + (f17 * f35)) * f39;
            fArr2[1] = ((((-f11) * f37) + (f12 * f36)) - (f13 * f35)) * f39;
            fArr2[2] = (((f23 * f31) - (f24 * f30)) + (f25 * f29)) * f39;
            fArr2[3] = ((((-f19) * f31) + (f20 * f30)) - (f21 * f29)) * f39;
            float f40 = -f14;
            fArr2[4] = (((f40 * f37) + (f16 * f34)) - (f17 * f33)) * f39;
            fArr2[5] = (((f37 * f10) - (f12 * f34)) + (f13 * f33)) * f39;
            float f41 = -f22;
            fArr2[6] = (((f41 * f31) + (f24 * f28)) - (f25 * f27)) * f39;
            fArr2[7] = (((f31 * f18) - (f20 * f28)) + (f21 * f27)) * f39;
            fArr2[8] = (((f14 * f36) - (f15 * f34)) + (f17 * f32)) * f39;
            fArr2[9] = ((((-f10) * f36) + (f34 * f11)) - (f13 * f32)) * f39;
            fArr2[10] = (((f22 * f30) - (f23 * f28)) + (f25 * f26)) * f39;
            fArr2[11] = ((((-f18) * f30) + (f28 * f19)) - (f21 * f26)) * f39;
            fArr2[12] = (((f40 * f35) + (f15 * f33)) - (f16 * f32)) * f39;
            fArr2[13] = (((f10 * f35) - (f11 * f33)) + (f12 * f32)) * f39;
            fArr2[14] = (((f41 * f29) + (f23 * f27)) - (f24 * f26)) * f39;
            fArr2[15] = (((f18 * f29) - (f19 * f27)) + (f20 * f26)) * f39;
        }
        return !(f38 == 0.0f);
    }
}
