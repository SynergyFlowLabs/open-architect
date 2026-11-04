package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,172:1\n65#2,10:173\n65#2,10:183\n65#2,10:193\n65#2,10:203\n65#2,10:213\n65#2,10:223\n65#2,10:241\n65#2,10:251\n65#2,10:261\n638#3:233\n653#3:234\n668#3:235\n638#3:236\n653#3:237\n638#3:271\n653#3:272\n668#3:273\n668#3:274\n638#3:275\n653#3:276\n668#3:277\n638#3:278\n653#3:279\n668#3:280\n53#4,3:238\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n39#1:173,10\n40#1:183,10\n41#1:193,10\n53#1:203,10\n54#1:213,10\n55#1:223,10\n72#1:241,10\n73#1:251,10\n74#1:261,10\n57#1:233\n58#1:234\n59#1:235\n65#1:236\n66#1:237\n76#1:271\n77#1:272\n78#1:273\n84#1:274\n96#1:275\n97#1:276\n98#1:277\n104#1:278\n105#1:279\n106#1:280\n68#1:238,3\n*E\n"})
public final class q extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f37675g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final float[] f37676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final float[] f37677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final float[] f37678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final float[] f37679k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        float[] fArrD = androidx.compose.ui.graphics.colorspace.a.f37566b.a().d();
        o oVar = o.f37659a;
        float[] fArrN = d.n(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.f(fArrD, oVar.d().g(), oVar.h().g()));
        f37676h = fArrN;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f37677i = fArr;
        f37678j = d.m(fArrN);
        f37679k = d.m(fArr);
    }

    public q(@NotNull String str, int i10) {
        super(str, b.f37572b.b(), i10, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @NotNull
    public float[] b(@NotNull float[] fArr) {
        d.p(f37676h, fArr);
        fArr[0] = androidx.compose.ui.util.e.a(fArr[0]);
        fArr[1] = androidx.compose.ui.util.e.a(fArr[1]);
        fArr[2] = androidx.compose.ui.util.e.a(fArr[2]);
        d.p(f37677i, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
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
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f13 = 0.5f;
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 <= 0.5f) {
            f13 = f12;
        }
        float[] fArr = f37679k;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f37678j;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f17) + (fArr2[3] * f18)) + (fArr2[6] * f19))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f17) + (fArr2[4] * f18) + (fArr2[7] * f19))) & com.rabbitmq.client.k0.f265952a);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @NotNull
    public float[] m(@NotNull float[] fArr) {
        float f10 = fArr[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -0.5f ? f12 : -0.5f;
        fArr[2] = f13 <= 0.5f ? f13 : 0.5f;
        d.p(f37679k, fArr);
        float f14 = fArr[0];
        fArr[0] = f14 * f14 * f14;
        float f15 = fArr[1];
        fArr[1] = f15 * f15 * f15;
        float f16 = fArr[2];
        fArr[2] = f16 * f16 * f16;
        d.p(f37678j, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float n(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f37679k;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f37678j;
        return (fArr2[2] * f17) + (fArr2[5] * f18) + (fArr2[8] * f16 * f16 * f16);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long o(float f10, float f11, float f12, float f13, @NotNull c cVar) {
        float[] fArr = f37676h;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        float fA = androidx.compose.ui.util.e.a(f14);
        float fA2 = androidx.compose.ui.util.e.a(f15);
        float fA3 = androidx.compose.ui.util.e.a(f16);
        float[] fArr2 = f37677i;
        return s0.a((fArr2[0] * fA) + (fArr2[3] * fA2) + (fArr2[6] * fA3), (fArr2[1] * fA) + (fArr2[4] * fA2) + (fArr2[7] * fA3), (fArr2[2] * fA) + (fArr2[5] * fA2) + (fArr2[8] * fA3), f13, cVar);
    }
}
