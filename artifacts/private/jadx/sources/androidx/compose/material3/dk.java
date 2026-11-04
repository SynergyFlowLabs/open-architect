package androidx.compose.material3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material3/MinimumInteractiveModifierNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n113#2:201\n152#2:202\n97#2:203\n113#2:204\n97#2:205\n26#3:206\n26#3:207\n1#4:208\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material3/MinimumInteractiveModifierNode\n*L\n102#1:201\n102#1:202\n104#1:203\n104#1:204\n106#1:205\n151#1:206\n153#1:207\n*E\n"})
public final class dk extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.h, androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f27119t = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Map<androidx.compose.ui.layout.a, Integer> f27120s;

    private final Map<androidx.compose.ui.layout.a, Integer> w9() {
        Map<androidx.compose.ui.layout.a, Integer> linkedHashMap = this.f27120s;
        if (linkedHashMap == null) {
            int i10 = 1 << 2;
            linkedHashMap = new LinkedHashMap<>(2);
            this.f27120s = linkedHashMap;
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x9(int i10, androidx.compose.ui.layout.i2 i2Var, int i11, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, kotlin.math.b.L0((i10 - i2Var.h1()) / 2.0f), kotlin.math.b.L0((i11 - i2Var.c1()) / 2.0f), 0.0f, 4, null);
        return Unit.f312394a;
    }

    private final void y9(int i10, androidx.compose.ui.layout.i2 i2Var) {
        Map<androidx.compose.ui.layout.a, Integer> mapW9 = w9();
        mapW9.put(wi.h(), Integer.valueOf(kotlin.ranges.r.u(Math.round((i10 - i2Var.h1()) / 2.0f), 0)));
        mapW9.put(wi.i(), Integer.valueOf(kotlin.ranges.r.u(Math.round((i10 - i2Var.c1()) / 2.0f), 0)));
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        float f10 = 0;
        float fR = androidx.compose.ui.unit.h.r(kotlin.ranges.r.t(((androidx.compose.ui.unit.h) androidx.compose.ui.node.i.a(this, wi.g())).O(), androidx.compose.ui.unit.h.r(f10)));
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        boolean z10 = a9() && !Float.isNaN(fR) && androidx.compose.ui.unit.h.q(fR, androidx.compose.ui.unit.h.r(f10)) > 0;
        int iG6 = Float.isNaN(fR) ? 0 : c1Var.g6(fR);
        final int iMax = z10 ? Math.max(i2VarP0.h1(), iG6) : i2VarP0.h1();
        final int iMax2 = z10 ? Math.max(i2VarP0.c1(), iG6) : i2VarP0.c1();
        if (z10) {
            y9(iG6, i2VarP0);
        }
        Map<androidx.compose.ui.layout.a, Integer> mapEmptyMap = this.f27120s;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return c1Var.S6(iMax, iMax2, mapEmptyMap, new Function1() { // from class: androidx.compose.material3.ck
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dk.x9(iMax, i2VarP0, iMax2, (androidx.compose.ui.layout.i2.a) obj);
            }
        });
    }
}
