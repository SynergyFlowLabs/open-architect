package androidx.compose.ui.layout;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutCoordinates.kt\nandroidx/compose/ui/layout/LayoutCoordinatesKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,266:1\n54#2:267\n59#2:269\n54#2:355\n59#2:357\n85#3:268\n90#3:270\n53#3,3:312\n53#3,3:316\n53#3,3:320\n53#3,3:324\n60#3:328\n60#3:331\n60#3:334\n60#3:337\n70#3:342\n70#3:345\n70#3:348\n70#3:351\n85#3:356\n90#3:358\n65#4,10:271\n65#4,10:281\n65#4,10:291\n65#4,10:301\n46#4:339\n56#4:340\n46#4:353\n56#4:354\n30#5:311\n30#5:315\n30#5:319\n30#5:323\n65#6:327\n65#6:330\n65#6:333\n65#6:336\n69#6:341\n69#6:344\n69#6:347\n69#6:350\n22#7:329\n22#7:332\n22#7:335\n22#7:338\n22#7:343\n22#7:346\n22#7:349\n22#7:352\n*S KotlinDebug\n*F\n+ 1 LayoutCoordinates.kt\nandroidx/compose/ui/layout/LayoutCoordinatesKt\n*L\n195#1:267\n196#1:269\n243#1:355\n243#1:357\n195#1:268\n196#1:270\n208#1:312,3\n209#1:316,3\n210#1:320,3\n211#1:324,3\n213#1:328\n214#1:331\n215#1:334\n216#1:337\n221#1:342\n222#1:345\n223#1:348\n224#1:351\n243#1:356\n243#1:358\n199#1:271,10\n200#1:281,10\n201#1:291,10\n202#1:301,10\n218#1:339\n219#1:340\n226#1:353\n227#1:354\n208#1:311\n209#1:315\n210#1:319\n211#1:323\n213#1:327\n214#1:330\n215#1:333\n216#1:336\n221#1:341\n222#1:344\n223#1:347\n224#1:350\n213#1:329\n214#1:332\n215#1:335\n216#1:338\n221#1:343\n222#1:346\n223#1:349\n224#1:352\n*E\n"})
public final class h0 {
    @NotNull
    public static final n0.j a(@NotNull g0 g0Var) {
        n0.j jVarW;
        g0 g0VarG0 = g0Var.g0();
        return (g0VarG0 == null || (jVarW = g0.W(g0VarG0, g0Var, false, 2, null)) == null) ? new n0.j(0.0f, 0.0f, (int) (g0Var.a() >> 32), (int) (g0Var.a() & com.rabbitmq.client.k0.f265952a)) : jVarW;
    }

    @NotNull
    public static final n0.j b(@NotNull g0 g0Var) {
        return g0.W(d(g0Var), g0Var, false, 2, null);
    }

    @NotNull
    public static final n0.j c(@NotNull g0 g0Var) {
        g0 g0VarD = d(g0Var);
        float fA = (int) (g0VarD.a() >> 32);
        float fA2 = (int) (g0VarD.a() & com.rabbitmq.client.k0.f265952a);
        n0.j jVarW = g0.W(g0VarD, g0Var, false, 2, null);
        float fT = jVarW.t();
        if (fT < 0.0f) {
            fT = 0.0f;
        }
        if (fT > fA) {
            fT = fA;
        }
        float fB = jVarW.B();
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        if (fB > fA2) {
            fB = fA2;
        }
        float fX = jVarW.x();
        if (fX < 0.0f) {
            fX = 0.0f;
        }
        if (fX <= fA) {
            fA = fX;
        }
        float fJ = jVarW.j();
        float f10 = fJ >= 0.0f ? fJ : 0.0f;
        if (f10 <= fA2) {
            fA2 = f10;
        }
        if (fT == fA || fB == fA2) {
            return n0.j.f332705e.a();
        }
        long jC0 = g0VarD.c0(n0.g.g((((long) Float.floatToRawIntBits(fT)) << 32) | (((long) Float.floatToRawIntBits(fB)) & com.rabbitmq.client.k0.f265952a)));
        long jC1 = g0VarD.c0(n0.g.g((((long) Float.floatToRawIntBits(fB)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fA)) << 32)));
        long jC2 = g0VarD.c0(n0.g.g((((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & com.rabbitmq.client.k0.f265952a)));
        long jC3 = g0VarD.c0(n0.g.g((((long) Float.floatToRawIntBits(fA2)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fT)) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jC0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC1 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jC3 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jC2 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jC0 & com.rabbitmq.client.k0.f265952a));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jC1 & com.rabbitmq.client.k0.f265952a));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jC3 & com.rabbitmq.client.k0.f265952a));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jC2 & com.rabbitmq.client.k0.f265952a));
        return new n0.j(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    @NotNull
    public static final g0 d(@NotNull g0 g0Var) {
        g0 g0Var2;
        g0 g0VarG0 = g0Var.g0();
        while (true) {
            g0 g0Var3 = g0VarG0;
            g0Var2 = g0Var;
            g0Var = g0Var3;
            if (g0Var == null) {
                break;
            }
            g0VarG0 = g0Var.g0();
        }
        androidx.compose.ui.node.k1 k1Var = g0Var2 instanceof androidx.compose.ui.node.k1 ? (androidx.compose.ui.node.k1) g0Var2 : null;
        if (k1Var == null) {
            return g0Var2;
        }
        androidx.compose.ui.node.k1 k1VarA5 = k1Var.a5();
        while (true) {
            androidx.compose.ui.node.k1 k1Var2 = k1VarA5;
            androidx.compose.ui.node.k1 k1Var3 = k1Var;
            k1Var = k1Var2;
            if (k1Var == null) {
                return k1Var3;
            }
            k1VarA5 = k1Var.a5();
        }
    }

    public static final long e(@NotNull g0 g0Var) {
        g0 g0VarG0 = g0Var.g0();
        return g0VarG0 != null ? g0VarG0.r0(g0Var, n0.g.f332700b.e()) : n0.g.f332700b.e();
    }

    public static final long f(@NotNull g0 g0Var) {
        return g0Var.k0(n0.g.f332700b.e());
    }

    public static final long g(@NotNull g0 g0Var) {
        return g0Var.c0(n0.g.f332700b.e());
    }

    public static final long h(@NotNull g0 g0Var) {
        return g0Var.K(n0.g.f332700b.e());
    }
}
