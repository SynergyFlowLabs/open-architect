package androidx.compose.foundation.text.input.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextFieldTextLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,217:1\n54#2:218\n54#2:220\n59#2:222\n59#2:224\n54#2:229\n59#2:231\n85#3:219\n85#3:221\n90#3:223\n90#3:225\n85#3:230\n90#3:232\n113#4:226\n26#5:227\n26#5:228\n*S KotlinDebug\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode\n*L\n185#1:218\n186#1:220\n187#1:222\n188#1:224\n209#1:229\n210#1:231\n185#1:219\n186#1:221\n187#1:223\n188#1:225\n209#1:230\n210#1:232\n200#1:226\n204#1:227\n205#1:228\n*E\n"})
public final class n6 extends androidx.compose.ui.node.m implements androidx.compose.ui.node.g0, androidx.compose.ui.node.v, androidx.compose.ui.node.h {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f19718p0 = 8;
    private boolean X;

    @NotNull
    private final androidx.compose.foundation.relocation.g Y;

    @Nullable
    private Map<androidx.compose.ui.layout.a, Integer> Z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private q6 f19719w;

    public n6(@NotNull q6 q6Var, @NotNull w6 w6Var, @NotNull androidx.compose.ui.text.y3 y3Var, boolean z10, @Nullable Function2<? super androidx.compose.ui.unit.d, ? super Function0<androidx.compose.ui.text.p3>, Unit> function2, @NotNull androidx.compose.foundation.text.b4 b4Var) {
        this.f19719w = q6Var;
        this.X = z10;
        this.Y = (androidx.compose.foundation.relocation.g) v9(new androidx.compose.foundation.relocation.g(this.f19719w.c()));
        this.f19719w.r(function2);
        q6 q6Var2 = this.f19719w;
        boolean z11 = this.X;
        q6Var2.t(w6Var, y3Var, z11, !z11, b4Var);
    }

    private static /* synthetic */ void H9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I9(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        int i10 = 4 ^ 0;
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    public final void J9(@NotNull q6 q6Var, @NotNull w6 w6Var, @NotNull androidx.compose.ui.text.y3 y3Var, boolean z10, @Nullable Function2<? super androidx.compose.ui.unit.d, ? super Function0<androidx.compose.ui.text.p3>, Unit> function2, @NotNull androidx.compose.foundation.text.b4 b4Var) {
        q6 q6Var2 = this.f19719w;
        this.f19719w = q6Var;
        q6Var.r(function2);
        this.X = z10;
        this.f19719w.t(w6Var, y3Var, z10, !z10, b4Var);
        if (Intrinsics.areEqual(q6Var2, q6Var)) {
            return;
        }
        this.Y.w9(q6Var.c());
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        androidx.compose.ui.text.p3 p3VarM = this.f19719w.m(c1Var, c1Var.getLayoutDirection(), (androidx.compose.ui.text.font.y.b) androidx.compose.ui.node.i.a(this, androidx.compose.ui.platform.q1.o()), j10);
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.f42658b.b((int) (p3VarM.C() >> 32), (int) (p3VarM.C() >> 32), (int) (p3VarM.C() & com.rabbitmq.client.k0.f265952a), (int) (p3VarM.C() & com.rabbitmq.client.k0.f265952a)));
        int i10 = 6 & 0;
        this.f19719w.q(this.X ? c1Var.D3(androidx.compose.foundation.text.j5.a(p3VarM.n(0))) : androidx.compose.ui.unit.h.r(0));
        Map<androidx.compose.ui.layout.a, Integer> linkedHashMap = this.Z;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>(2);
        }
        linkedHashMap.put(androidx.compose.ui.layout.b.a(), Integer.valueOf(Math.round(p3VarM.h())));
        linkedHashMap.put(androidx.compose.ui.layout.b.b(), Integer.valueOf(Math.round(p3VarM.k())));
        this.Z = linkedHashMap;
        int iC = (int) (p3VarM.C() >> 32);
        int iC2 = (int) (p3VarM.C() & com.rabbitmq.client.k0.f265952a);
        Map<androidx.compose.ui.layout.a, Integer> map = this.Z;
        Intrinsics.checkNotNull(map);
        return c1Var.S6(iC, iC2, map, new Function1() { // from class: androidx.compose.foundation.text.input.internal.m6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n6.I9(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        });
    }

    @Override // androidx.compose.ui.node.v
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        this.f19719w.s(g0Var);
    }
}
