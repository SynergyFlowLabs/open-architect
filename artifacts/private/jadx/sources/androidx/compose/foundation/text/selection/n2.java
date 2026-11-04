package androidx.compose.foundation.text.selection;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,1337:1\n35#2,3:1338\n39#2:1361\n30#3:1341\n30#3:1345\n30#3:1367\n53#4,3:1342\n53#4,3:1346\n60#4:1350\n70#4:1353\n60#4:1356\n70#4:1359\n60#4:1363\n85#4:1366\n53#4,3:1368\n60#4:1372\n70#4:1375\n65#5:1349\n69#5:1352\n65#5:1355\n69#5:1358\n65#5:1362\n65#5:1371\n69#5:1374\n22#6:1351\n22#6:1354\n22#6:1357\n22#6:1360\n22#6:1364\n22#6:1373\n54#7:1365\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n*L\n1211#1:1338,3\n1211#1:1361\n1234#1:1341\n1235#1:1345\n1322#1:1367\n1234#1:1342,3\n1235#1:1346,3\n1241#1:1350\n1242#1:1353\n1243#1:1356\n1244#1:1359\n1278#1:1363\n1310#1:1366\n1322#1:1368,3\n1336#1:1372\n1336#1:1375\n1241#1:1349\n1242#1:1352\n1243#1:1355\n1244#1:1358\n1278#1:1362\n1336#1:1371\n1336#1:1374\n1241#1:1351\n1242#1:1354\n1243#1:1357\n1244#1:1360\n1278#1:1364\n1336#1:1373\n1310#1:1365\n*E\n"})
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final n0.j f21280a = new n0.j(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21281a;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.k3.values().length];
            try {
                iArr[androidx.compose.foundation.text.k3.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i10 = 7 & 2;
                iArr[androidx.compose.foundation.text.k3.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.k3.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21281a = iArr;
        }
    }

    public static final long c(@NotNull m2 m2Var, long j10) {
        h0 h0VarN0 = m2Var.n0();
        if (h0VarN0 == null) {
            return n0.g.f332700b.c();
        }
        androidx.compose.foundation.text.k3 k3VarZ = m2Var.Z();
        int i10 = k3VarZ == null ? -1 : a.f21281a[k3VarZ.ordinal()];
        if (i10 == -1) {
            return n0.g.f332700b.c();
        }
        if (i10 == 1) {
            return f(m2Var, j10, h0VarN0.h());
        }
        if (i10 == 2) {
            return f(m2Var, j10, h0VarN0.f());
        }
        if (i10 != 3) {
            throw new kotlin.k0();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor");
    }

    public static final boolean d(@NotNull n0.j jVar, long j10) {
        float fT = jVar.t();
        float fX = jVar.x();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        if (fT <= fIntBitsToFloat && fIntBitsToFloat <= fX) {
            float fB = jVar.B();
            float fJ = jVar.j();
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
            if (fB <= fIntBitsToFloat2 && fIntBitsToFloat2 <= fJ) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> e(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : CollectionsKt.listOf(CollectionsKt.first((List) list), CollectionsKt.last((List) list));
    }

    private static final long f(m2 m2Var, long j10, h0.a aVar) {
        androidx.compose.ui.layout.g0 g0VarQ;
        androidx.compose.ui.layout.g0 g0VarM;
        int iG;
        float fH;
        e0 e0VarP = m2Var.P(aVar);
        if (e0VarP != null && (g0VarQ = m2Var.Q()) != null && (g0VarM = e0VarP.M()) != null && (iG = aVar.g()) <= e0VarP.m()) {
            n0.g gVarV = m2Var.V();
            Intrinsics.checkNotNull(gVarV);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (g0VarM.r0(g0VarQ, gVarV.B()) >> 32));
            long jR = e0VarP.r(iG);
            if (androidx.compose.ui.text.w3.h(jR)) {
                fH = e0VarP.d(iG);
            } else {
                float fD = e0VarP.d(androidx.compose.ui.text.w3.n(jR));
                float fH2 = e0VarP.h(androidx.compose.ui.text.w3.i(jR) - 1);
                fH = kotlin.ranges.r.H(fIntBitsToFloat, Math.min(fD, fH2), Math.max(fD, fH2));
            }
            if (fH == -1.0f) {
                return n0.g.f332700b.c();
            }
            if (!androidx.compose.ui.unit.u.h(j10, androidx.compose.ui.unit.u.f42720b.a()) && Math.abs(fIntBitsToFloat - fH) > ((int) (j10 >> 32)) / 2) {
                return n0.g.f332700b.c();
            }
            float fN = e0VarP.n(iG);
            return fN == -1.0f ? n0.g.f332700b.c() : g0VarQ.r0(g0VarM, n0.g.g((((long) Float.floatToRawIntBits(fH)) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(fN)))));
        }
        return n0.g.f332700b.c();
    }

    @androidx.annotation.l1
    @NotNull
    public static final n0.j g(@NotNull List<? extends Pair<? extends e0, h0>> list, @NotNull androidx.compose.ui.layout.g0 g0Var) {
        androidx.compose.ui.layout.g0 g0VarM;
        int[] iArr;
        List<? extends Pair<? extends e0, h0>> list2 = list;
        if (list2.isEmpty()) {
            return f21280a;
        }
        n0.j jVar = f21280a;
        float fB = jVar.b();
        float fC = jVar.c();
        float fD = jVar.d();
        float fE = jVar.e();
        int size = list2.size();
        char c10 = 0;
        int i10 = 0;
        while (i10 < size) {
            Pair<? extends e0, h0> pair = list2.get(i10);
            e0 e0VarComponent1 = pair.component1();
            h0 h0VarComponent2 = pair.component2();
            int iG = h0VarComponent2.h().g();
            int iG2 = h0VarComponent2.f().g();
            if (iG != iG2 && (g0VarM = e0VarComponent1.M()) != null) {
                int iMin = Math.min(iG, iG2);
                int iMax = Math.max(iG, iG2) - 1;
                if (iMin == iMax) {
                    iArr = new int[1];
                    iArr[c10] = iMin;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c10] = iMin;
                    iArr2[1] = iMax;
                    iArr = iArr2;
                }
                n0.j jVar2 = f21280a;
                float fB2 = jVar2.b();
                float fC2 = jVar2.c();
                float fD2 = jVar2.d();
                float fE2 = jVar2.e();
                int length = iArr.length;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11;
                    n0.j jVarJ = e0VarComponent1.j(iArr[i12]);
                    fB2 = Math.min(fB2, jVarJ.t());
                    fC2 = Math.min(fC2, jVarJ.B());
                    fD2 = Math.max(fD2, jVarJ.x());
                    fE2 = Math.max(fE2, jVarJ.j());
                    i11 = i12 + 1;
                }
                long jG = n0.g.g((((long) Float.floatToRawIntBits(fB2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & com.rabbitmq.client.k0.f265952a));
                long jG2 = n0.g.g((((long) Float.floatToRawIntBits(fE2)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fD2)) << 32));
                long jR0 = g0Var.r0(g0VarM, jG);
                long jR1 = g0Var.r0(g0VarM, jG2);
                fB = Math.min(fB, Float.intBitsToFloat((int) (jR0 >> 32)));
                fC = Math.min(fC, Float.intBitsToFloat((int) (jR0 & com.rabbitmq.client.k0.f265952a)));
                fD = Math.max(fD, Float.intBitsToFloat((int) (jR1 >> 32)));
                fE = Math.max(fE, Float.intBitsToFloat((int) (jR1 & com.rabbitmq.client.k0.f265952a)));
            }
            i10++;
            list2 = list;
            c10 = 0;
        }
        return new n0.j(fB, fC, fD, fE);
    }

    @Nullable
    public static final h0 h(@Nullable h0 h0Var, @Nullable h0 h0Var2) {
        h0 h0VarI;
        return (h0Var == null || (h0VarI = h0Var.i(h0Var2)) == null) ? h0Var2 : h0VarI;
    }

    @NotNull
    public static final n0.j i(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        n0.j jVarC = androidx.compose.ui.layout.h0.c(g0Var);
        return n0.k.a(g0Var.w0(jVarC.E()), g0Var.w0(jVarC.n()));
    }
}
