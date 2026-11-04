package androidx.compose.ui.graphics;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 8 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,291:1\n226#1,12:292\n240#1,2:311\n226#1,12:313\n240#1,2:332\n48#2:304\n48#2:325\n48#2:356\n53#2:359\n48#2:362\n48#2:365\n48#2:368\n53#2:371\n53#2:374\n53#2:377\n60#3:305\n53#3,3:308\n60#3:326\n53#3,3:329\n53#3,3:335\n53#3,3:345\n53#3,3:349\n53#3,3:353\n60#3:357\n70#3:360\n60#3:363\n60#3:366\n60#3:369\n70#3:372\n70#3:375\n70#3:378\n22#4:306\n22#4:327\n22#4:358\n22#4:361\n22#4:364\n22#4:367\n22#4:370\n22#4:373\n22#4:376\n22#4:379\n33#5:307\n33#5:328\n30#6:334\n30#6:348\n57#7,6:338\n33#8:344\n33#8:352\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n143#1:292,12\n143#1:311,2\n183#1:313,12\n183#1:332,2\n149#1:304\n189#1:325\n266#1:356\n267#1:359\n282#1:362\n283#1:365\n284#1:368\n286#1:371\n287#1:374\n288#1:377\n149#1:305\n154#1:308,3\n189#1:326\n194#1:329,3\n205#1:335,3\n208#1:345,3\n211#1:349,3\n214#1:353,3\n266#1:357\n267#1:360\n282#1:363\n283#1:366\n284#1:369\n286#1:372\n287#1:375\n288#1:378\n149#1:306\n189#1:327\n266#1:358\n267#1:361\n282#1:364\n283#1:367\n284#1:370\n286#1:373\n287#1:376\n288#1:379\n154#1:307\n194#1:328\n205#1:334\n211#1:348\n208#1:338,6\n208#1:344\n214#1:352\n*E\n"})
public final class g2 {
    public static final void a(@NotNull k2 k2Var, @NotNull f2 f2Var) {
        if (f2Var instanceof f2.b) {
            k2.g(k2Var, ((f2.b) f2Var).b(), null, 2, null);
        } else if (f2Var instanceof f2.c) {
            k2.S(k2Var, ((f2.c) f2Var).b(), null, 2, null);
        } else {
            if (!(f2Var instanceof f2.a)) {
                throw new kotlin.k0();
            }
            k2.y(k2Var, ((f2.a) f2Var).b(), 0L, 2, null);
        }
    }

    public static final void b(@NotNull k0 k0Var, @NotNull f2 f2Var, @NotNull h2 h2Var) {
        if (f2Var instanceof f2.b) {
            k0Var.o(((f2.b) f2Var).b(), h2Var);
            return;
        }
        if (!(f2Var instanceof f2.c)) {
            if (!(f2Var instanceof f2.a)) {
                throw new kotlin.k0();
            }
            k0Var.M(((f2.a) f2Var).b(), h2Var);
        } else {
            f2.c cVar = (f2.c) f2Var;
            k2 k2VarC = cVar.c();
            if (k2VarC != null) {
                k0Var.M(k2VarC, h2Var);
            } else {
                k0Var.P(cVar.b().q(), cVar.b().s(), cVar.b().r(), cVar.b().m(), Float.intBitsToFloat((int) (cVar.b().n() >> 32)), Float.intBitsToFloat((int) (cVar.b().n() & com.rabbitmq.client.k0.f265952a)), h2Var);
            }
        }
    }

    public static final void c(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, @NotNull f2 f2Var, @NotNull i0 i0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable r0 r0Var, int i10) {
        if (f2Var instanceof f2.b) {
            n0.j jVarB = ((f2.b) f2Var).b();
            fVar.L2(i0Var, k(jVarB), i(jVarB), f10, iVar, r0Var, i10);
            return;
        }
        if (!(f2Var instanceof f2.c)) {
            if (!(f2Var instanceof f2.a)) {
                throw new kotlin.k0();
            }
            fVar.F1(((f2.a) f2Var).b(), i0Var, f10, iVar, r0Var, i10);
            return;
        }
        f2.c cVar = (f2.c) f2Var;
        k2 k2VarC = cVar.c();
        if (k2VarC != null) {
            fVar.F1(k2VarC, i0Var, f10, iVar, r0Var, i10);
            return;
        }
        n0.l lVarB = cVar.b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (lVarB.n() >> 32));
        fVar.C7(i0Var, l(lVarB), j(lVarB), n0.a.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), f10, iVar, r0Var, i10);
    }

    public static /* synthetic */ void d(androidx.compose.ui.graphics.drawscope.f fVar, f2 f2Var, i0 i0Var, float f10, androidx.compose.ui.graphics.drawscope.i iVar, r0 r0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            iVar = androidx.compose.ui.graphics.drawscope.m.f37744a;
        }
        androidx.compose.ui.graphics.drawscope.i iVar2 = iVar;
        if ((i11 & 16) != 0) {
            r0Var = null;
        }
        r0 r0Var2 = r0Var;
        if ((i11 & 32) != 0) {
            i10 = androidx.compose.ui.graphics.drawscope.f.H.a();
        }
        c(fVar, f2Var, i0Var, f11, iVar2, r0Var2, i10);
    }

    public static final void e(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, @NotNull f2 f2Var, long j10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable r0 r0Var, int i10) {
        if (f2Var instanceof f2.b) {
            n0.j jVarB = ((f2.b) f2Var).b();
            fVar.W6(j10, k(jVarB), i(jVarB), f10, iVar, r0Var, i10);
            return;
        }
        if (!(f2Var instanceof f2.c)) {
            if (!(f2Var instanceof f2.a)) {
                throw new kotlin.k0();
            }
            fVar.T2(((f2.a) f2Var).b(), j10, f10, iVar, r0Var, i10);
            return;
        }
        f2.c cVar = (f2.c) f2Var;
        k2 k2VarC = cVar.c();
        if (k2VarC != null) {
            fVar.T2(k2VarC, j10, f10, iVar, r0Var, i10);
            return;
        }
        n0.l lVarB = cVar.b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (lVarB.n() >> 32));
        fVar.n6(j10, l(lVarB), j(lVarB), n0.a.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), iVar, f10, r0Var, i10);
    }

    public static /* synthetic */ void f(androidx.compose.ui.graphics.drawscope.f fVar, f2 f2Var, long j10, float f10, androidx.compose.ui.graphics.drawscope.i iVar, r0 r0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            iVar = androidx.compose.ui.graphics.drawscope.m.f37744a;
        }
        androidx.compose.ui.graphics.drawscope.i iVar2 = iVar;
        if ((i11 & 16) != 0) {
            r0Var = null;
        }
        e(fVar, f2Var, j10, f11, iVar2, r0Var, (i11 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.a() : i10);
    }

    private static final void g(androidx.compose.ui.graphics.drawscope.f fVar, f2 f2Var, Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.j, Unit> function2, Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.l, Unit> function3, Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super k2, Unit> function4) {
        if (f2Var instanceof f2.b) {
            function2.invoke(fVar, ((f2.b) f2Var).b());
            return;
        }
        if (!(f2Var instanceof f2.c)) {
            if (!(f2Var instanceof f2.a)) {
                throw new kotlin.k0();
            }
            function4.invoke(fVar, ((f2.a) f2Var).b());
        } else {
            f2.c cVar = (f2.c) f2Var;
            k2 k2VarC = cVar.c();
            if (k2VarC != null) {
                function4.invoke(fVar, k2VarC);
            } else {
                function3.invoke(fVar, cVar.b());
            }
        }
    }

    private static final boolean h(n0.l lVar) {
        return ((Float.intBitsToFloat((int) (lVar.n() >> 32)) > Float.intBitsToFloat((int) (lVar.o() >> 32)) ? 1 : (Float.intBitsToFloat((int) (lVar.n() >> 32)) == Float.intBitsToFloat((int) (lVar.o() >> 32)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (lVar.o() >> 32)) > Float.intBitsToFloat((int) (lVar.u() >> 32)) ? 1 : (Float.intBitsToFloat((int) (lVar.o() >> 32)) == Float.intBitsToFloat((int) (lVar.u() >> 32)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (lVar.u() >> 32)) > Float.intBitsToFloat((int) (lVar.t() >> 32)) ? 1 : (Float.intBitsToFloat((int) (lVar.u() >> 32)) == Float.intBitsToFloat((int) (lVar.t() >> 32)) ? 0 : -1)) == 0) && ((Float.intBitsToFloat((int) (lVar.n() & com.rabbitmq.client.k0.f265952a)) > Float.intBitsToFloat((int) (lVar.o() & com.rabbitmq.client.k0.f265952a)) ? 1 : (Float.intBitsToFloat((int) (lVar.n() & com.rabbitmq.client.k0.f265952a)) == Float.intBitsToFloat((int) (lVar.o() & com.rabbitmq.client.k0.f265952a)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (lVar.o() & com.rabbitmq.client.k0.f265952a)) > Float.intBitsToFloat((int) (lVar.u() & com.rabbitmq.client.k0.f265952a)) ? 1 : (Float.intBitsToFloat((int) (lVar.o() & com.rabbitmq.client.k0.f265952a)) == Float.intBitsToFloat((int) (lVar.u() & com.rabbitmq.client.k0.f265952a)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (lVar.u() & com.rabbitmq.client.k0.f265952a)) > Float.intBitsToFloat((int) (lVar.t() & com.rabbitmq.client.k0.f265952a)) ? 1 : (Float.intBitsToFloat((int) (lVar.u() & com.rabbitmq.client.k0.f265952a)) == Float.intBitsToFloat((int) (lVar.t() & com.rabbitmq.client.k0.f265952a)) ? 0 : -1)) == 0);
    }

    private static final long i(n0.j jVar) {
        float fX = jVar.x() - jVar.t();
        return n0.n.f((((long) Float.floatToRawIntBits(jVar.j() - jVar.B())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fX) << 32));
    }

    private static final long j(n0.l lVar) {
        float fV = lVar.v();
        float fP = lVar.p();
        return n0.n.f((((long) Float.floatToRawIntBits(fV)) << 32) | (((long) Float.floatToRawIntBits(fP)) & com.rabbitmq.client.k0.f265952a));
    }

    private static final long k(n0.j jVar) {
        float fT = jVar.t();
        float fB = jVar.B();
        return n0.g.g((((long) Float.floatToRawIntBits(fT)) << 32) | (((long) Float.floatToRawIntBits(fB)) & com.rabbitmq.client.k0.f265952a));
    }

    private static final long l(n0.l lVar) {
        float fQ = lVar.q();
        float fS = lVar.s();
        return n0.g.g((((long) Float.floatToRawIntBits(fQ)) << 32) | (((long) Float.floatToRawIntBits(fS)) & com.rabbitmq.client.k0.f265952a));
    }
}
