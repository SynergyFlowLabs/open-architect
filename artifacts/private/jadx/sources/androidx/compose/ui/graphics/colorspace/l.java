package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.d1;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,328:1\n219#2,7:329\n60#3:336\n70#3:338\n22#4:337\n22#4:339\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n147#1:329,7\n149#1:336\n150#1:338\n149#1:337\n150#1:339\n*E\n"})
public class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f37644g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f37645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f37646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f37647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c f37648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final float[] f37650f;

    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.l$a$a, reason: collision with other inner class name */
        public static final class C0285a extends l {
            C0285a(c cVar, int i10) {
                super(cVar, cVar, i10, null);
            }

            @Override // androidx.compose.ui.graphics.colorspace.l
            public float[] e(float[] fArr) {
                return fArr;
            }

            @Override // androidx.compose.ui.graphics.colorspace.l
            public long f(long j10) {
                return j10;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(c cVar, c cVar2, int i10) {
            if (!r.h(i10, r.f37680b.a())) {
                return null;
            }
            long jG = cVar.g();
            androidx.compose.ui.graphics.colorspace.b.a aVar = androidx.compose.ui.graphics.colorspace.b.f37572b;
            boolean zH = androidx.compose.ui.graphics.colorspace.b.h(jG, aVar.c());
            boolean zH2 = androidx.compose.ui.graphics.colorspace.b.h(cVar2.g(), aVar.c());
            if (zH && zH2) {
                return null;
            }
            if (!zH && !zH2) {
                return null;
            }
            if (!zH) {
                cVar = cVar2;
            }
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            j0 j0Var = (j0) cVar;
            float[] fArrG = zH ? j0Var.a0().g() : o.f37659a.e();
            float[] fArrG2 = zH2 ? j0Var.a0().g() : o.f37659a.e();
            return new float[]{fArrG[0] / fArrG2[0], fArrG[1] / fArrG2[1], fArrG[2] / fArrG2[2]};
        }

        @NotNull
        public final l c(@NotNull c cVar) {
            return new C0285a(cVar, r.f37680b.c());
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector$RgbConnector\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n1#1,328:1\n219#2,7:329\n638#3:336\n653#3:337\n668#3:338\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector$RgbConnector\n*L\n185#1:329,7\n189#1:336\n190#1:337\n191#1:338\n*E\n"})
    public static final class b extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final j0 f37651h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private final j0 f37652i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private final float[] f37653j;

        public /* synthetic */ b(j0 j0Var, j0 j0Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j0Var, j0Var2, i10);
        }

        private final float[] g(j0 j0Var, j0 j0Var2, int i10) {
            if (d.h(j0Var.a0(), j0Var2.a0())) {
                return d.n(j0Var2.P(), j0Var.Z());
            }
            float[] fArrZ = j0Var.Z();
            float[] fArrP = j0Var2.P();
            float[] fArrG = j0Var.a0().g();
            float[] fArrG2 = j0Var2.a0().g();
            m0 m0VarA0 = j0Var.a0();
            o oVar = o.f37659a;
            if (!d.h(m0VarA0, oVar.d())) {
                fArrZ = d.n(d.f(androidx.compose.ui.graphics.colorspace.a.f37566b.a().d(), fArrG, oVar.k()), j0Var.Z());
            }
            if (!d.h(j0Var2.a0(), oVar.d())) {
                fArrP = d.m(d.n(d.f(androidx.compose.ui.graphics.colorspace.a.f37566b.a().d(), fArrG2, oVar.k()), j0Var2.Z()));
            }
            if (r.h(i10, r.f37680b.a())) {
                fArrZ = d.o(new float[]{fArrG[0] / fArrG2[0], fArrG[1] / fArrG2[1], fArrG[2] / fArrG2[2]}, fArrZ);
            }
            return d.n(fArrP, fArrZ);
        }

        @Override // androidx.compose.ui.graphics.colorspace.l
        @NotNull
        public float[] e(@NotNull float[] fArr) {
            fArr[0] = (float) this.f37651h.L().a(fArr[0]);
            fArr[1] = (float) this.f37651h.L().a(fArr[1]);
            fArr[2] = (float) this.f37651h.L().a(fArr[2]);
            d.p(this.f37653j, fArr);
            fArr[0] = (float) this.f37652i.R().a(fArr[0]);
            fArr[1] = (float) this.f37652i.R().a(fArr[1]);
            fArr[2] = (float) this.f37652i.R().a(fArr[2]);
            return fArr;
        }

        @Override // androidx.compose.ui.graphics.colorspace.l
        public long f(long j10) {
            float fI = q0.I(j10);
            float fG = q0.G(j10);
            float fC = q0.C(j10);
            float fA = q0.A(j10);
            float fA2 = (float) this.f37651h.L().a(fI);
            float fA3 = (float) this.f37651h.L().a(fG);
            float fA4 = (float) this.f37651h.L().a(fC);
            float[] fArr = this.f37653j;
            int i10 = 3 >> 6;
            return s0.a((float) this.f37652i.R().a((fArr[0] * fA2) + (fArr[3] * fA3) + (fArr[6] * fA4)), (float) this.f37652i.R().a((fArr[1] * fA2) + (fArr[4] * fA3) + (fArr[7] * fA4)), (float) this.f37652i.R().a((fArr[2] * fA2) + (fArr[5] * fA3) + (fArr[8] * fA4)), fA, this.f37652i);
        }

        private b(j0 j0Var, j0 j0Var2, int i10) {
            super(j0Var, j0Var2, j0Var, j0Var2, i10, null, null);
            this.f37651h = j0Var;
            this.f37652i = j0Var2;
            this.f37653j = g(j0Var, j0Var2, i10);
        }
    }

    public /* synthetic */ l(c cVar, c cVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, i10);
    }

    @NotNull
    public final c a() {
        return this.f37646b;
    }

    public final int b() {
        return this.f37649e;
    }

    @NotNull
    public final c c() {
        return this.f37645a;
    }

    @d1(3)
    @NotNull
    public final float[] d(float f10, float f11, float f12) {
        return e(new float[]{f10, f11, f12});
    }

    @d1(min = 3)
    @NotNull
    public float[] e(@d1(min = 3) @NotNull float[] fArr) {
        float[] fArrM = this.f37647c.m(fArr);
        float[] fArr2 = this.f37650f;
        if (fArr2 != null) {
            int i10 = 6 >> 0;
            fArrM[0] = fArrM[0] * fArr2[0];
            fArrM[1] = fArrM[1] * fArr2[1];
            fArrM[2] = fArrM[2] * fArr2[2];
        }
        return this.f37648d.b(fArrM);
    }

    public long f(long j10) {
        float fI = q0.I(j10);
        float fG = q0.G(j10);
        float fC = q0.C(j10);
        float fA = q0.A(j10);
        long jK = this.f37647c.k(fI, fG, fC);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jK >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK & com.rabbitmq.client.k0.f265952a));
        float fN = this.f37647c.n(fI, fG, fC);
        float[] fArr = this.f37650f;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fN *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        return this.f37648d.o(f10, fIntBitsToFloat2, fN, fA, this.f37646b);
    }

    public /* synthetic */ l(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, cVar3, cVar4, i10, fArr);
    }

    private l(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr) {
        this.f37645a = cVar;
        this.f37646b = cVar2;
        this.f37647c = cVar3;
        this.f37648d = cVar4;
        this.f37649e = i10;
        this.f37650f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private l(c cVar, c cVar2, int i10) {
        long jG = cVar.g();
        androidx.compose.ui.graphics.colorspace.b.a aVar = androidx.compose.ui.graphics.colorspace.b.f37572b;
        this(cVar, cVar2, androidx.compose.ui.graphics.colorspace.b.h(jG, aVar.c()) ? d.e(cVar, o.f37659a.d(), null, 2, null) : cVar, androidx.compose.ui.graphics.colorspace.b.h(cVar2.g(), aVar.c()) ? d.e(cVar2, o.f37659a.d(), null, 2, null) : cVar2, i10, f37644g.b(cVar, cVar2, i10), null);
    }
}
