package androidx.compose.ui.text;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 9 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,389:1\n249#2,8:390\n257#2,6:403\n249#2,8:409\n257#2,6:422\n249#2,8:428\n257#2:441\n259#2,4:445\n249#2,8:449\n257#2,6:462\n65#3:398\n69#3:401\n65#3:417\n69#3:420\n65#3:436\n69#3:439\n65#3:457\n69#3:460\n65#3:479\n69#3:495\n60#4:399\n70#4:402\n60#4:418\n70#4:421\n60#4:437\n70#4:440\n60#4:458\n70#4:461\n85#4:469\n90#4:471\n60#4:474\n60#4:477\n60#4:482\n70#4:490\n70#4:493\n70#4:498\n22#5:400\n22#5:419\n22#5:438\n22#5:459\n22#5:475\n22#5:478\n26#5:480\n22#5,5:483\n22#5:491\n22#5:494\n26#5:496\n22#5,5:499\n640#6:442\n646#6:443\n635#6:444\n54#7:468\n59#7:470\n141#8:472\n141#8:488\n57#9:473\n57#9:476\n57#9:481\n61#9:489\n61#9:492\n61#9:497\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n168#1:390,8\n168#1:403,6\n231#1:409,8\n231#1:422,6\n271#1:428,8\n271#1:441\n271#1:445,4\n331#1:449,8\n331#1:462,6\n169#1:398\n169#1:401\n232#1:417\n232#1:420\n272#1:436\n272#1:439\n332#1:457\n332#1:460\n368#1:479\n380#1:495\n169#1:399\n169#1:402\n232#1:418\n232#1:421\n272#1:437\n272#1:440\n332#1:458\n332#1:461\n355#1:469\n356#1:471\n365#1:474\n368#1:477\n370#1:482\n377#1:490\n380#1:493\n382#1:498\n169#1:400\n232#1:419\n272#1:438\n332#1:459\n365#1:475\n368#1:478\n368#1:480\n370#1:483,5\n377#1:491\n380#1:494\n380#1:496\n382#1:499,5\n278#1:442\n291#1:443\n291#1:444\n355#1:468\n356#1:470\n365#1:472\n377#1:488\n365#1:473\n368#1:476\n370#1:481\n377#1:489\n380#1:492\n382#1:497\n*E\n"})
public final class v3 {
    private static final void a(androidx.compose.ui.graphics.drawscope.j jVar, p3 p3Var) {
        if (p3Var.i() && !androidx.compose.ui.text.style.v.i(p3Var.l().h(), androidx.compose.ui.text.style.v.f42256b.i())) {
            androidx.compose.ui.graphics.drawscope.j.l(jVar, 0.0f, 0.0f, (int) (p3Var.C() >> 32), (int) (p3Var.C() & com.rabbitmq.client.k0.f265952a), 0, 16, null);
        }
    }

    public static final void b(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, @NotNull r3 r3Var, @NotNull f fVar2, long j10, @NotNull y3 y3Var, int i10, boolean z10, int i11, @NotNull List<f.e<v0>> list, long j11, int i12) {
        p3 p3VarD = r3.d(r3Var, fVar2, y3Var, i10, z10, i11, list, j(fVar, j11, j10), fVar.getLayoutDirection(), fVar, null, false, 1536, null);
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            androidx.compose.ui.graphics.drawscope.j jVarI = dVarZ3.i();
            jVarI.c(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
            a(jVarI, p3VarD);
            p3VarD.x().O(fVar.Z3().f(), (32 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.a() : i12);
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    public static final void d(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, @NotNull p3 p3Var, @NotNull androidx.compose.ui.graphics.i0 i0Var, long j10, float f10, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.drawscope.i iVar, int i10) {
        androidx.compose.ui.graphics.o3 o3VarN = o3Var == null ? p3Var.l().m().N() : o3Var;
        androidx.compose.ui.text.style.k kVarS = kVar == null ? p3Var.l().m().S() : kVar;
        androidx.compose.ui.graphics.drawscope.i iVarU = iVar == null ? p3Var.l().m().u() : iVar;
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            androidx.compose.ui.graphics.drawscope.j jVarI = dVarZ3.i();
            jVarI.c(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10)));
            a(jVarI, p3Var);
            p3Var.x().S(fVar.Z3().f(), i0Var, !Float.isNaN(f10) ? f10 : p3Var.l().m().p(), o3VarN, kVarS, iVarU, i10);
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    public static final void f(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, @NotNull r3 r3Var, @NotNull String str, long j10, @NotNull y3 y3Var, int i10, boolean z10, int i11, long j11, int i12) {
        p3 p3VarD = r3.d(r3Var, new f(str, null, 2, null), y3Var, i10, z10, i11, null, j(fVar, j11, j10), fVar.getLayoutDirection(), fVar, null, false, 1568, null);
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            androidx.compose.ui.graphics.drawscope.j jVarI = dVarZ3.i();
            jVarI.c(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
            a(jVarI, p3VarD);
            p3VarD.x().O(fVar.Z3().f(), (32 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.a() : i12);
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    public static final void h(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, @NotNull p3 p3Var, long j10, long j11, float f10, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.drawscope.i iVar, int i10) {
        androidx.compose.ui.graphics.o3 o3VarN = o3Var == null ? p3Var.l().m().N() : o3Var;
        androidx.compose.ui.text.style.k kVarS = kVar == null ? p3Var.l().m().S() : kVar;
        androidx.compose.ui.graphics.drawscope.i iVarU = iVar == null ? p3Var.l().m().u() : iVar;
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            androidx.compose.ui.graphics.drawscope.j jVarI = dVarZ3.i();
            jVarI.c(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j11)));
            a(jVarI, p3Var);
            androidx.compose.ui.graphics.i0 i0VarS = p3Var.l().m().s();
            if (i0VarS == null || j10 != 16) {
                f0 f0VarX = p3Var.x();
                androidx.compose.ui.graphics.k0 k0VarF = fVar.Z3().f();
                if (j10 == 16) {
                    j10 = p3Var.l().m().t();
                }
                f0VarX.O(k0VarF, androidx.compose.ui.text.style.m.c(j10, f10), o3VarN, kVarS, iVarU, i10);
            } else {
                p3Var.x().S(fVar.Z3().f(), i0VarS, !Float.isNaN(f10) ? f10 : p3Var.l().m().p(), o3VarN, kVarS, iVarU, i10);
            }
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    private static final long j(androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11) {
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4 = 0;
        if (j10 == n0.d.f332689d || Float.isNaN(Float.intBitsToFloat((int) (j10 >> 32)))) {
            iRound = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (fVar.d() >> 32)) - Float.intBitsToFloat((int) (j11 >> 32))));
            iRound2 = 0;
        } else {
            iRound2 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (j10 >> 32))));
            iRound = iRound2;
        }
        if (j10 == n0.d.f332689d || Float.isNaN(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)))) {
            iRound3 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)) - Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a))));
        } else {
            iRound4 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a))));
            iRound3 = iRound4;
        }
        return androidx.compose.ui.unit.c.a(iRound2, iRound, iRound4, iRound3);
    }
}
