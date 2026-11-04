package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class CreateTicketCardKt {
    private static final Block sampleBlock = new Block.Builder().withType(BlockType.CREATETICKETCARD.getSerializedName()).withText("Admin has requested you to create a ticket").withTitle("Create ticket").withTicketTypeTitle("Bug").withTicketType(new TicketType(1234, "Bug", "🎟", CollectionsKt.emptyList(), false)).build();

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt$CreateTicketCard$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nCreateTicketCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateTicketCard.kt\nio/intercom/android/sdk/tickets/create/ui/CreateTicketCardKt$CreateTicketCard$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,136:1\n1282#2,6:137\n70#3:143\n67#3,9:144\n77#3:265\n80#4,6:153\n87#4,3:168\n90#4,2:177\n80#4,6:187\n87#4,3:202\n90#4,2:211\n80#4,6:224\n87#4,3:239\n90#4,2:248\n94#4:254\n94#4:260\n94#4:264\n391#5,9:159\n400#5:179\n391#5,9:193\n400#5:213\n391#5,9:230\n400#5:250\n401#5,2:252\n401#5,2:258\n401#5,2:262\n4360#6,6:171\n4360#6,6:205\n4360#6,6:242\n113#7:180\n113#7:251\n113#7:256\n113#7:257\n99#8,6:181\n106#8:261\n87#9:214\n84#9,9:215\n94#9:255\n*S KotlinDebug\n*F\n+ 1 CreateTicketCard.kt\nio/intercom/android/sdk/tickets/create/ui/CreateTicketCardKt$CreateTicketCard$1\n*L\n48#1:137,6\n46#1:143\n46#1:144,9\n46#1:265\n46#1:153,6\n46#1:168,3\n46#1:177,2\n52#1:187,6\n52#1:202,3\n52#1:211,2\n59#1:224,6\n59#1:239,3\n59#1:248,2\n59#1:254\n52#1:260\n46#1:264\n46#1:159,9\n46#1:179\n52#1:193,9\n52#1:213\n59#1:230,9\n59#1:250\n59#1:252,2\n52#1:258,2\n46#1:262,2\n46#1:171,6\n52#1:205,6\n59#1:242,6\n55#1:180\n68#1:251\n76#1:256\n81#1:257\n52#1:181,6\n52#1:261\n59#1:214\n59#1:215,9\n59#1:255\n*E\n"})
    static final class AnonymousClass1 implements pj.n<m0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ BlockRenderData $blockRenderData;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function0<Unit> $onClick;

        AnonymousClass1(boolean z10, Function0<Unit> function0, BlockRenderData blockRenderData) {
            this.$enabled = z10;
            this.$onClick = function0;
            this.$blockRenderData = blockRenderData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(m0 m0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(m0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(m0 IntercomCard, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean z10 = this.$enabled;
            c0Var.E(2105918451);
            boolean zD = c0Var.D(this.$onClick);
            final Function0<Unit> function0 = this.$onClick;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateTicketCardKt.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                    }
                };
                c0Var.Y(objI0);
            }
            c0Var.A();
            androidx.compose.ui.a0 a0VarJ = i1.j(aVar, z10, null, null, null, (Function0) objI0, 14, null);
            boolean z11 = this.$enabled;
            BlockRenderData blockRenderData = this.$blockRenderData;
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarJ);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            float f10 = 16;
            androidx.compose.ui.a0 a0VarR = d5.r(i6.h(aVar, 0.0f, 1, null), androidx.compose.ui.unit.h.r(f10));
            androidx.compose.ui.e.c cVarQ = aVar2.q();
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            a1 a1VarE = u5.e(qVar.s(), cVarQ, c0Var, 54);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK2 = c0Var.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarR);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A2);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var);
            y7.n(c0VarD2, a1VarE, aVar3.e());
            y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar3.f());
            androidx.compose.ui.a0 a0VarQ = x5.q(y5.f16577a, aVar, 1.0f, false, 2, null);
            a1 a1VarB = j0.b(qVar.y(), aVar2.u(), c0Var, 0);
            int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK3 = c0Var.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var, a0VarQ);
            Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A3);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD3 = y7.d(c0Var);
            y7.n(c0VarD3, a1VarB, aVar3.e());
            y7.n(c0VarD3, b1VarK3, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN3, aVar3.f());
            n0 n0Var = n0.f16227a;
            String title = blockRenderData.getBlock().getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            q50.t(title, androidx.compose.ui.draw.a.a(aVar, BubbleMessageRowKt.contentAlpha(z11, c0Var, 0)), intercomTheme.getColors(c0Var, i11).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var, i11).getType04SemiBold(), c0Var, 0, 0, 131064);
            l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(2)), c0Var, 6);
            q50.t(blockRenderData.getBlock().getTicketType().getName(), androidx.compose.ui.draw.a.a(aVar, BubbleMessageRowKt.contentAlpha(z11, c0Var, 0)), s0.d(4285887861L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var, i11).getType04(), c0Var, a5.S0, 0, 131064);
            c0Var.o();
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
            ni.o(u0.e.c(R.drawable.intercom_ticket_detail_icon, c0Var, 0), null, androidx.compose.ui.draw.a.a(i6.w(aVar, androidx.compose.ui.unit.h.r(f10)), BubbleMessageRowKt.contentAlpha(z11, c0Var, 0)), intercomTheme.getColors(c0Var, i11).m685getActionContrastWhite0d7_KjU(), c0Var, 56, 0);
            c0Var.o();
            c0Var.o();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void CreateTicketCard(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final BlockRenderData blockRenderData, final boolean z10, @Nullable Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(blockRenderData, "blockRenderData");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-214450953);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Function0<Unit> function1 = (i11 & 8) != 0 ? null : function0;
        IntercomCardKt.IntercomCard(i6.h(a0Var2, 0.0f, 1, null), IntercomCardStyle.INSTANCE.m596conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c0VarR, IntercomCardStyle.$stable << 15, 31), androidx.compose.runtime.internal.w.e(1721044843, true, new AnonymousClass1(z10, function1, blockRenderData), c0VarR, 54), c0VarR, (IntercomCardStyle.Style.$stable << 3) | a5.S0, 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final Function0<Unit> function2 = function1;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTicketCardKt.CreateTicketCard$lambda$0(a0Var2, blockRenderData, z10, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketCard$lambda$0(androidx.compose.ui.a0 a0Var, BlockRenderData blockRenderData, boolean z10, Function0 function0, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(blockRenderData, "$blockRenderData");
        CreateTicketCard(a0Var, blockRenderData, z10, function0, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Disabled Light Mode", uiMode = 16), @d1.c(name = "Disabled Dark Mode", uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void DisabledCreateTicketCardPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1443652823);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketCardKt.INSTANCE.m549getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTicketCardKt.DisabledCreateTicketCardPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledCreateTicketCardPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        DisabledCreateTicketCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Enabled Light Mode", uiMode = 16), @d1.c(name = "Enabled Dark Mode", uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void EnabledCreateTicketCardPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1535832576);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketCardKt.INSTANCE.m548getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTicketCardKt.EnabledCreateTicketCardPreview$lambda$1(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnabledCreateTicketCardPreview$lambda$1(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        EnabledCreateTicketCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
