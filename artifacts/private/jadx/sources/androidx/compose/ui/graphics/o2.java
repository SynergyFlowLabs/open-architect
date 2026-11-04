package androidx.compose.ui.graphics;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPathHitTester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n+ 2 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,163:1\n67#2:164\n80#2:166\n22#3:165\n71#4:167\n65#4:168\n73#4:171\n69#4:172\n60#5:169\n70#5:173\n22#6:170\n152#7,17:174\n*S KotlinDebug\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n*L\n100#1:164\n100#1:166\n100#1:165\n125#1:167\n125#1:168\n125#1:171\n125#1:172\n125#1:169\n125#1:173\n125#1:170\n131#1:174,17\n*E\n"})
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private k2 f38084a = p2.f38102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38085b = 0.5f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private n0.j f38086c = n0.j.f332705e.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y1<v2> f38087d = new y1<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final float[] f38088e = new float[20];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final float[] f38089f = new float[2];

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38090a;

        static {
            int[] iArr = new int[v2.a.values().length];
            try {
                iArr[v2.a.Line.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v2.a.Quadratic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v2.a.Cubic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v2.a.Done.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f38090a = iArr;
        }
    }

    public static /* synthetic */ void c(o2 o2Var, k2 k2Var, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.5f;
        }
        o2Var.b(k2Var, f10);
    }

    public final boolean a(long j10) {
        int i10;
        int I;
        if (!this.f38084a.isEmpty() && this.f38086c.f(j10)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
            float[] fArr = this.f38088e;
            float[] fArr2 = this.f38089f;
            y1<v2> y1Var = this.f38087d;
            y1<v2>.a aVar = y1Var.f38696b;
            if (aVar != y1Var.f38695a) {
                ArrayList<y1<v2>.a> arrayList = y1Var.f38697c;
                arrayList.add(aVar);
                i10 = 0;
                while (arrayList.size() > 0) {
                    y1<v2>.a aVarRemove = arrayList.remove(arrayList.size() - 1);
                    if (aVarRemove.e(fIntBitsToFloat2, fIntBitsToFloat2)) {
                        v2 v2VarB = aVarRemove.b();
                        Intrinsics.checkNotNull(v2VarB);
                        v2 v2Var = v2VarB;
                        float[] fArrA = v2Var.a();
                        int i11 = a.f38090a[v2Var.b().ordinal()];
                        if (i11 == 1) {
                            I = c0.I(fArrA, fIntBitsToFloat, fIntBitsToFloat2);
                        } else if (i11 == 2) {
                            I = c0.M(fArrA, fIntBitsToFloat, fIntBitsToFloat2, fArr, fArr2);
                        } else if (i11 == 3) {
                            I = c0.m(fArrA, fIntBitsToFloat, fIntBitsToFloat2, fArr, fArr2);
                        }
                        i10 += I;
                    }
                    if (aVarRemove.h() != y1Var.f38695a && aVarRemove.h().i() >= fIntBitsToFloat2) {
                        arrayList.add(aVarRemove.h());
                    }
                    if (aVarRemove.l() != y1Var.f38695a && aVarRemove.l().j() <= fIntBitsToFloat2) {
                        arrayList.add(aVarRemove.l());
                    }
                }
                arrayList.clear();
            } else {
                i10 = 0;
            }
            if (m2.f(this.f38084a.x(), m2.f38048b.a())) {
                i10 &= 1;
            }
            if (i10 != 0) {
                return true;
            }
        }
        return false;
    }

    public final void b(@NotNull k2 k2Var, @androidx.annotation.x(from = 0.0d) float f10) {
        this.f38084a = k2Var;
        this.f38085b = f10;
        this.f38086c = k2Var.getBounds();
        this.f38087d.b();
        q2 q2VarK = k2Var.K(q2.a.AsQuadratics, f10);
        while (q2VarK.hasNext()) {
            v2 next = q2VarK.next();
            int i10 = a.f38090a[next.b().ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    break;
                }
            } else {
                long j10 = c0.j(next, this.f38088e, 0, 4, null);
                this.f38087d.a(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), next);
            }
        }
    }
}
