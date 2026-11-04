package androidx.compose.ui.platform;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nShapeContainingUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapeContainingUtil.kt\nandroidx/compose/ui/platform/ShapeContainingUtilKt\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,160:1\n48#2:161\n53#2:164\n48#2:167\n53#2:170\n48#2:173\n53#2:176\n53#2:179\n48#2:182\n48#2:185\n48#2:188\n53#2:191\n53#2:194\n48#2:197\n53#2:200\n60#3:162\n70#3:165\n60#3:168\n70#3:171\n60#3:174\n70#3:177\n70#3:180\n60#3:183\n60#3:186\n60#3:189\n70#3:192\n70#3:195\n60#3:198\n70#3:201\n22#4:163\n22#4:166\n22#4:169\n22#4:172\n22#4:175\n22#4:178\n22#4:181\n22#4:184\n22#4:187\n22#4:190\n22#4:193\n22#4:196\n22#4:199\n22#4:202\n*S KotlinDebug\n*F\n+ 1 ShapeContainingUtil.kt\nandroidx/compose/ui/platform/ShapeContainingUtilKt\n*L\n76#1:161\n77#1:164\n79#1:167\n80#1:170\n82#1:173\n83#1:176\n85#1:179\n86#1:182\n110#1:185\n111#1:188\n112#1:191\n113#1:194\n129#1:197\n130#1:200\n76#1:162\n77#1:165\n79#1:168\n80#1:171\n82#1:174\n83#1:177\n85#1:180\n86#1:183\n110#1:186\n111#1:189\n112#1:192\n113#1:195\n129#1:198\n130#1:201\n76#1:163\n77#1:166\n79#1:169\n80#1:172\n82#1:175\n83#1:178\n85#1:181\n86#1:184\n110#1:187\n111#1:190\n112#1:193\n113#1:196\n129#1:199\n130#1:202\n*E\n"})
public final class y3 {
    private static final boolean a(n0.l lVar) {
        return Float.intBitsToFloat((int) (lVar.t() >> 32)) + Float.intBitsToFloat((int) (lVar.u() >> 32)) <= lVar.v() && Float.intBitsToFloat((int) (lVar.n() >> 32)) + Float.intBitsToFloat((int) (lVar.o() >> 32)) <= lVar.v() && Float.intBitsToFloat((int) (lVar.t() & com.rabbitmq.client.k0.f265952a)) + Float.intBitsToFloat((int) (lVar.n() & com.rabbitmq.client.k0.f265952a)) <= lVar.p() && Float.intBitsToFloat((int) (lVar.u() & com.rabbitmq.client.k0.f265952a)) + Float.intBitsToFloat((int) (lVar.o() & com.rabbitmq.client.k0.f265952a)) <= lVar.p();
    }

    public static final boolean b(@NotNull androidx.compose.ui.graphics.f2 f2Var, float f10, float f11, @Nullable androidx.compose.ui.graphics.k2 k2Var, @Nullable androidx.compose.ui.graphics.k2 k2Var2) {
        if (f2Var instanceof androidx.compose.ui.graphics.f2.b) {
            return e(((androidx.compose.ui.graphics.f2.b) f2Var).b(), f10, f11);
        }
        if (f2Var instanceof androidx.compose.ui.graphics.f2.c) {
            return f((androidx.compose.ui.graphics.f2.c) f2Var, f10, f11, k2Var, k2Var2);
        }
        if (f2Var instanceof androidx.compose.ui.graphics.f2.a) {
            return d(((androidx.compose.ui.graphics.f2.a) f2Var).b(), f10, f11, k2Var, k2Var2);
        }
        throw new kotlin.k0();
    }

    public static /* synthetic */ boolean c(androidx.compose.ui.graphics.f2 f2Var, float f10, float f11, androidx.compose.ui.graphics.k2 k2Var, androidx.compose.ui.graphics.k2 k2Var2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            k2Var = null;
        }
        if ((i10 & 16) != 0) {
            k2Var2 = null;
        }
        return b(f2Var, f10, f11, k2Var, k2Var2);
    }

    private static final boolean d(androidx.compose.ui.graphics.k2 k2Var, float f10, float f11, androidx.compose.ui.graphics.k2 k2Var2, androidx.compose.ui.graphics.k2 k2Var3) {
        n0.j jVar = new n0.j(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (k2Var2 == null) {
            k2Var2 = androidx.compose.ui.graphics.u.a();
        }
        androidx.compose.ui.graphics.k2.g(k2Var2, jVar, null, 2, null);
        if (k2Var3 == null) {
            k2Var3 = androidx.compose.ui.graphics.u.a();
        }
        k2Var3.X(k2Var, k2Var2, androidx.compose.ui.graphics.t2.f38235b.b());
        boolean zIsEmpty = k2Var3.isEmpty();
        k2Var3.reset();
        k2Var2.reset();
        return !zIsEmpty;
    }

    private static final boolean e(n0.j jVar, float f10, float f11) {
        if (jVar.t() > f10 || f10 >= jVar.x() || jVar.B() > f11 || f11 >= jVar.j()) {
            return false;
        }
        int i10 = 1 >> 1;
        return true;
    }

    private static final boolean f(androidx.compose.ui.graphics.f2.c cVar, float f10, float f11, androidx.compose.ui.graphics.k2 k2Var, androidx.compose.ui.graphics.k2 k2Var2) {
        n0.l lVarB = cVar.b();
        if (f10 < lVarB.q() || f10 >= lVarB.r() || f11 < lVarB.s() || f11 >= lVarB.m()) {
            return false;
        }
        if (!a(lVarB)) {
            androidx.compose.ui.graphics.k2 k2VarA = k2Var2 == null ? androidx.compose.ui.graphics.u.a() : k2Var2;
            androidx.compose.ui.graphics.k2.S(k2VarA, lVarB, null, 2, null);
            return d(k2VarA, f10, f11, k2Var, k2Var2);
        }
        float fQ = lVarB.q() + Float.intBitsToFloat((int) (lVarB.t() >> 32));
        float fS = lVarB.s() + Float.intBitsToFloat((int) (lVarB.t() & com.rabbitmq.client.k0.f265952a));
        float fR = lVarB.r() - Float.intBitsToFloat((int) (lVarB.u() >> 32));
        float fS2 = lVarB.s() + Float.intBitsToFloat((int) (lVarB.u() & com.rabbitmq.client.k0.f265952a));
        float fR2 = lVarB.r() - Float.intBitsToFloat((int) (lVarB.o() >> 32));
        float fM = lVarB.m() - Float.intBitsToFloat((int) (lVarB.o() & com.rabbitmq.client.k0.f265952a));
        float fM2 = lVarB.m() - Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & lVarB.n()));
        float fQ2 = lVarB.q() + Float.intBitsToFloat((int) (lVarB.n() >> 32));
        if (f10 < fQ && f11 < fS) {
            return g(f10, f11, lVarB.t(), fQ, fS);
        }
        if (f10 < fQ2 && f11 > fM2) {
            return g(f10, f11, lVarB.n(), fQ2, fM2);
        }
        if (f10 > fR && f11 < fS2) {
            return g(f10, f11, lVarB.u(), fR, fS2);
        }
        if (f10 <= fR2 || f11 <= fM) {
            return true;
        }
        return g(f10, f11, lVarB.o(), fR2, fM);
    }

    private static final boolean g(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
        return ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }
}
