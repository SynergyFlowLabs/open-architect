package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1099:1\n30#2:1100\n53#3,3:1101\n60#3:1105\n60#3:1108\n70#3:1111\n70#3:1114\n70#3:1117\n60#3:1120\n65#4:1104\n65#4:1107\n69#4:1110\n69#4:1113\n69#4:1116\n65#4:1119\n22#5:1106\n22#5:1109\n22#5:1112\n22#5:1115\n22#5:1118\n22#5:1121\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt\n*L\n865#1:1100\n865#1:1101,3\n1051#1:1105\n1053#1:1108\n1069#1:1111\n1072#1:1114\n1073#1:1117\n1078#1:1120\n1051#1:1104\n1053#1:1107\n1069#1:1110\n1072#1:1113\n1073#1:1116\n1078#1:1119\n1051#1:1106\n1053#1:1109\n1069#1:1112\n1072#1:1115\n1073#1:1118\n1078#1:1121\n*E\n"})
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f19578a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f19579b = 160;

    public static final class a implements androidx.compose.ui.text.input.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.j[] f19580a;

        a(androidx.compose.ui.text.input.j[] jVarArr) {
            this.f19580a = jVarArr;
        }

        @Override // androidx.compose.ui.text.input.j
        public void a(androidx.compose.ui.text.input.n nVar) {
            for (androidx.compose.ui.text.input.j jVar : this.f19580a) {
                jVar.a(nVar);
            }
        }
    }

    private static final boolean A(int i10) {
        int type = Character.getType(i10);
        return type == 14 || type == 13 || i10 == 10;
    }

    private static final boolean B(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean C(int i10) {
        return Character.isWhitespace(i10) || i10 == 160;
    }

    private static final boolean D(int i10) {
        return C(i10) && !A(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long E(CharSequence charSequence, int i10) {
        int iCharCount = i10;
        while (iCharCount > 0) {
            int iC = s.c(charSequence, iCharCount);
            if (!C(iC)) {
                break;
            }
            iCharCount -= Character.charCount(iC);
        }
        while (i10 < charSequence.length()) {
            int iB = s.b(charSequence, i10);
            if (!C(iB)) {
                break;
            }
            i10 += s.a(iB);
        }
        return androidx.compose.ui.text.x3.b(iCharCount, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long F(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        return n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10, CharSequence charSequence) {
        int iN = androidx.compose.ui.text.w3.n(j10);
        int i10 = androidx.compose.ui.text.w3.i(j10);
        int iCodePointBefore = iN > 0 ? Character.codePointBefore(charSequence, iN) : 10;
        int iCodePointAt = i10 < charSequence.length() ? Character.codePointAt(charSequence, i10) : 10;
        if (D(iCodePointBefore) && (C(iCodePointAt) || B(iCodePointAt))) {
            do {
                iN -= Character.charCount(iCodePointBefore);
                if (iN == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iN);
            } while (D(iCodePointBefore));
            return androidx.compose.ui.text.x3.b(iN, i10);
        }
        if (D(iCodePointAt) && (C(iCodePointBefore) || B(iCodePointBefore))) {
            do {
                i10 += Character.charCount(iCodePointAt);
                if (i10 == charSequence.length()) {
                    break;
                }
                iCodePointAt = Character.codePointAt(charSequence, i10);
            } while (D(iCodePointAt));
            j10 = androidx.compose.ui.text.x3.b(iN, i10);
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.j n(androidx.compose.ui.text.input.j... jVarArr) {
        return new a(jVarArr);
    }

    private static final long o(long j10, long j11) {
        return androidx.compose.ui.text.x3.b(Math.min(androidx.compose.ui.text.w3.n(j10), androidx.compose.ui.text.w3.n(j10)), Math.max(androidx.compose.ui.text.w3.i(j11), androidx.compose.ui.text.w3.i(j11)));
    }

    private static final int p(androidx.compose.ui.text.f0 f0Var, long j10, androidx.compose.ui.platform.o4 o4Var) {
        float fH = o4Var != null ? o4Var.h() : 0.0f;
        int i10 = (int) (com.rabbitmq.client.k0.f265952a & j10);
        int iU = f0Var.u(Float.intBitsToFloat(i10));
        if (Float.intBitsToFloat(i10) >= f0Var.z(iU) - fH && Float.intBitsToFloat(i10) <= f0Var.p(iU) + fH) {
            int i11 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i11) >= (-fH) && Float.intBitsToFloat(i11) <= f0Var.L() + fH) {
                return iU;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(androidx.compose.foundation.text.g4 g4Var, long j10, androidx.compose.ui.platform.o4 o4Var) {
        androidx.compose.ui.text.p3 p3VarI;
        androidx.compose.ui.text.f0 f0VarX;
        androidx.compose.foundation.text.y6 y6VarN = g4Var.n();
        if (y6VarN == null || (p3VarI = y6VarN.i()) == null || (f0VarX = p3VarI.x()) == null) {
            return -1;
        }
        return s(f0VarX, j10, g4Var.m(), o4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(q6 q6Var, long j10, androidx.compose.ui.platform.o4 o4Var) {
        androidx.compose.ui.text.f0 f0VarX;
        androidx.compose.ui.text.p3 p3VarF = q6Var.f();
        if (p3VarF == null || (f0VarX = p3VarF.x()) == null) {
            return -1;
        }
        return s(f0VarX, j10, q6Var.k(), o4Var);
    }

    private static final int s(androidx.compose.ui.text.f0 f0Var, long j10, androidx.compose.ui.layout.g0 g0Var, androidx.compose.ui.platform.o4 o4Var) {
        long jW;
        int iP;
        if (g0Var != null && (iP = p(f0Var, (jW = g0Var.w(j10)), o4Var)) != -1) {
            return f0Var.E(n0.g.i(jW, 0.0f, (f0Var.z(iP) + f0Var.p(iP)) / 2.0f, 1, null));
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long t(androidx.compose.ui.text.p3 p3Var, long j10, long j11, androidx.compose.ui.layout.g0 g0Var, androidx.compose.ui.platform.o4 o4Var) {
        if (p3Var == null || g0Var == null) {
            return androidx.compose.ui.text.w3.f42333b.a();
        }
        long jW = g0Var.w(j10);
        long jW2 = g0Var.w(j11);
        int iP = p(p3Var.x(), jW, o4Var);
        int iP2 = p(p3Var.x(), jW2, o4Var);
        if (iP != -1) {
            if (iP2 != -1) {
                iP = Math.min(iP, iP2);
            }
            iP2 = iP;
        } else if (iP2 == -1) {
            return androidx.compose.ui.text.w3.f42333b.a();
        }
        float fW = (p3Var.w(iP2) + p3Var.n(iP2)) / 2;
        int i10 = (int) (jW >> 32);
        int i11 = (int) (jW2 >> 32);
        return p3Var.x().K(new n0.j(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), fW - 0.1f, Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), fW + 0.1f), androidx.compose.ui.text.i3.f41793b.a(), androidx.compose.ui.text.m3.f41991a.g());
    }

    private static final long u(androidx.compose.ui.text.f0 f0Var, n0.j jVar, androidx.compose.ui.layout.g0 g0Var, int i10, androidx.compose.ui.text.m3 m3Var) {
        return (f0Var == null || g0Var == null) ? androidx.compose.ui.text.w3.f42333b.a() : f0Var.K(jVar.T(g0Var.w(n0.g.f332700b.e())), i10, m3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(androidx.compose.foundation.text.g4 g4Var, n0.j jVar, int i10, androidx.compose.ui.text.m3 m3Var) {
        androidx.compose.ui.text.p3 p3VarI;
        androidx.compose.foundation.text.y6 y6VarN = g4Var.n();
        return u((y6VarN == null || (p3VarI = y6VarN.i()) == null) ? null : p3VarI.x(), jVar, g4Var.m(), i10, m3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(q6 q6Var, n0.j jVar, int i10, androidx.compose.ui.text.m3 m3Var) {
        androidx.compose.ui.text.p3 p3VarF = q6Var.f();
        return u(p3VarF != null ? p3VarF.x() : null, jVar, q6Var.k(), i10, m3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long x(androidx.compose.foundation.text.g4 g4Var, n0.j jVar, n0.j jVar2, int i10, androidx.compose.ui.text.m3 m3Var) {
        long jV = v(g4Var, jVar, i10, m3Var);
        if (androidx.compose.ui.text.w3.h(jV)) {
            return androidx.compose.ui.text.w3.f42333b.a();
        }
        long jV2 = v(g4Var, jVar2, i10, m3Var);
        return androidx.compose.ui.text.w3.h(jV2) ? androidx.compose.ui.text.w3.f42333b.a() : o(jV, jV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long y(q6 q6Var, n0.j jVar, n0.j jVar2, int i10, androidx.compose.ui.text.m3 m3Var) {
        long jW = w(q6Var, jVar, i10, m3Var);
        if (androidx.compose.ui.text.w3.h(jW)) {
            return androidx.compose.ui.text.w3.f42333b.a();
        }
        long jW2 = w(q6Var, jVar2, i10, m3Var);
        return androidx.compose.ui.text.w3.h(jW2) ? androidx.compose.ui.text.w3.f42333b.a() : o(jW, jW2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(androidx.compose.ui.text.p3 p3Var, int i10) {
        int iR = p3Var.r(i10);
        if (i10 == p3Var.v(iR) || i10 == androidx.compose.ui.text.p3.q(p3Var, iR, false, 2, null)) {
            return p3Var.z(i10) != p3Var.c(i10);
        }
        return p3Var.c(i10) != p3Var.c(i10 - 1);
    }
}
