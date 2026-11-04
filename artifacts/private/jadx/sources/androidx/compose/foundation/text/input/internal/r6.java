package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutStateKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n65#2:259\n65#2:262\n65#2:265\n69#2:268\n69#2:271\n69#2:274\n60#3:260\n60#3:263\n60#3:266\n70#3:269\n70#3:272\n70#3:275\n53#3,3:278\n22#4:261\n22#4:264\n22#4:267\n22#4:270\n22#4:273\n22#4:276\n30#5:277\n1#6:281\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutStateKt\n*L\n208#1:259\n209#1:262\n210#1:265\n214#1:268\n215#1:271\n216#1:274\n208#1:260\n209#1:263\n210#1:266\n214#1:269\n215#1:272\n216#1:275\n218#1:278,3\n208#1:261\n209#1:264\n210#1:267\n214#1:270\n215#1:273\n216#1:276\n218#1:277\n*E\n"})
public final class r6 {
    public static final long a(long j10, @NotNull n0.j jVar) {
        float fX;
        float fJ;
        int i10 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i10) < jVar.t()) {
            fX = jVar.t();
        } else {
            fX = Float.intBitsToFloat(i10) > jVar.x() ? jVar.x() : Float.intBitsToFloat(i10);
        }
        int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        if (Float.intBitsToFloat(i11) < jVar.B()) {
            fJ = jVar.B();
        } else {
            fJ = Float.intBitsToFloat(i11) > jVar.j() ? jVar.j() : Float.intBitsToFloat(i11);
        }
        return n0.g.g((((long) Float.floatToRawIntBits(fX)) << 32) | (((long) Float.floatToRawIntBits(fJ)) & com.rabbitmq.client.k0.f265952a));
    }

    public static final long b(@NotNull q6 q6Var, long j10) {
        n0.g gVarD;
        androidx.compose.ui.layout.g0 g0VarK = q6Var.k();
        if (g0VarK != null) {
            androidx.compose.ui.layout.g0 g0VarE = q6Var.e();
            if (g0VarE != null) {
                gVarD = n0.g.d((g0VarK.I() && g0VarE.I()) ? g0VarK.r0(g0VarE, j10) : j10);
            } else {
                gVarD = null;
            }
            if (gVarD != null) {
                return gVarD.B();
            }
        }
        return j10;
    }

    public static final long c(@NotNull q6 q6Var, long j10) {
        androidx.compose.ui.layout.g0 g0VarK = q6Var.k();
        if (g0VarK != null) {
            n0.g gVarD = null;
            if (!g0VarK.I()) {
                g0VarK = null;
            }
            if (g0VarK != null) {
                androidx.compose.ui.layout.g0 g0VarD = q6Var.d();
                if (g0VarD != null) {
                    if (!g0VarD.I()) {
                        g0VarD = null;
                    }
                    if (g0VarD != null) {
                        gVarD = n0.g.d(g0VarD.r0(g0VarK, j10));
                    }
                }
                if (gVarD != null) {
                    return gVarD.B();
                }
            }
        }
        return j10;
    }

    public static final long d(@NotNull q6 q6Var, long j10) {
        androidx.compose.ui.layout.g0 g0VarE = q6Var.e();
        return (g0VarE == null || !g0VarE.I()) ? j10 : g0VarE.w0(j10);
    }
}
