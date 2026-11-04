package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,133:1\n65#2,10:134\n65#2,10:144\n65#2,10:154\n65#2,10:164\n65#2,10:174\n65#2,10:187\n65#2,10:197\n65#2,10:207\n65#2,10:217\n65#2,10:227\n65#2,10:237\n65#2,10:247\n65#2,10:257\n53#3,3:184\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n39#1:134,10\n40#1:144,10\n41#1:154,10\n58#1:164,10\n59#1:174,10\n70#1:187,10\n71#1:197,10\n98#1:207,10\n99#1:217,10\n100#1:227,10\n119#1:237,10\n120#1:247,10\n121#1:257,10\n66#1:184,3\n*E\n"})
public final class p extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f37670g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f37671h = 0.008856452f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f37672i = 7.787037f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f37673j = 0.13793103f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f37674k = 0.20689656f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public p(@NotNull String str, int i10) {
        super(str, b.f37572b.b(), i10, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @NotNull
    public float[] b(@NotNull float[] fArr) {
        float f10 = fArr[0];
        o oVar = o.f37659a;
        float f11 = f10 / oVar.e()[0];
        float f12 = fArr[1] / oVar.e()[1];
        int i10 = 5 >> 2;
        float f13 = fArr[2] / oVar.e()[2];
        float fCbrt = f11 > f37671h ? (float) Math.cbrt(f11) : (f11 * f37672i) + f37673j;
        float fCbrt2 = f12 > f37671h ? (float) Math.cbrt(f12) : (f12 * f37672i) + f37673j;
        float fCbrt3 = f13 > f37671h ? (float) Math.cbrt(f13) : (f13 * f37672i) + f37673j;
        float f14 = (116.0f * fCbrt2) - 16.0f;
        float f15 = (fCbrt - fCbrt2) * 500.0f;
        float f16 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 100.0f) {
            f14 = 100.0f;
        }
        fArr[0] = f14;
        if (f15 < -128.0f) {
            f15 = -128.0f;
        }
        if (f15 > 128.0f) {
            f15 = 128.0f;
        }
        fArr[1] = f15;
        if (f16 < -128.0f) {
            f16 = -128.0f;
        }
        fArr[2] = f16 <= 128.0f ? f16 : 128.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public boolean j() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long k(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f13 = (f10 + 16.0f) / 116.0f;
        float f14 = (f11 * 0.002f) + f13;
        float f15 = f14 > f37674k ? f14 * f14 * f14 : (f14 - f37673j) * 0.12841855f;
        float f16 = f13 > f37674k ? f13 * f13 * f13 : (f13 - f37673j) * 0.12841855f;
        o oVar = o.f37659a;
        return (((long) Float.floatToRawIntBits(f15 * oVar.e()[0])) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(f16 * oVar.e()[1])));
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @NotNull
    public float[] m(@NotNull float[] fArr) {
        float f10 = fArr[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        float f12 = 128.0f;
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        fArr[1] = f11;
        float f13 = fArr[2];
        float f14 = f13 >= -128.0f ? f13 : -128.0f;
        if (f14 <= 128.0f) {
            f12 = f14;
        }
        fArr[2] = f12;
        float f15 = (f10 + 16.0f) / 116.0f;
        float f16 = (f11 * 0.002f) + f15;
        float f17 = f15 - (f12 * 0.005f);
        float f18 = f16 > f37674k ? f16 * f16 * f16 : (f16 - f37673j) * 0.12841855f;
        float f19 = f15 > f37674k ? f15 * f15 * f15 : (f15 - f37673j) * 0.12841855f;
        float f20 = f17 > f37674k ? f17 * f17 * f17 : (f17 - f37673j) * 0.12841855f;
        o oVar = o.f37659a;
        fArr[0] = f18 * oVar.e()[0];
        fArr[1] = f19 * oVar.e()[1];
        fArr[2] = f20 * oVar.e()[2];
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float n(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f13 = ((f10 + 16.0f) / 116.0f) - (f12 * 0.005f);
        return (f13 > f37674k ? f13 * f13 * f13 : 0.12841855f * (f13 - f37673j)) * o.f37659a.e()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long o(float f10, float f11, float f12, float f13, @NotNull c cVar) {
        o oVar = o.f37659a;
        float f14 = f10 / oVar.e()[0];
        float f15 = f11 / oVar.e()[1];
        float f16 = f12 / oVar.e()[2];
        float fCbrt = f14 > f37671h ? (float) Math.cbrt(f14) : (f14 * f37672i) + f37673j;
        float fCbrt2 = f15 > f37671h ? (float) Math.cbrt(f15) : (f15 * f37672i) + f37673j;
        float fCbrt3 = f16 > f37671h ? (float) Math.cbrt(f16) : (f16 * f37672i) + f37673j;
        float f17 = (116.0f * fCbrt2) - 16.0f;
        float f18 = (fCbrt - fCbrt2) * 500.0f;
        float f19 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 100.0f) {
            f17 = 100.0f;
        }
        if (f18 < -128.0f) {
            f18 = -128.0f;
        }
        if (f18 > 128.0f) {
            f18 = 128.0f;
        }
        if (f19 < -128.0f) {
            f19 = -128.0f;
        }
        return s0.a(f17, f18, f19 <= 128.0f ? f19 : 128.0f, f13, cVar);
    }
}
