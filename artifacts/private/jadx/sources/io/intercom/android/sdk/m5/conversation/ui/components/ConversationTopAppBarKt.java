package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.tickets.TicketProgressBannerKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationTopAppBar.kt\nio/intercom/android/sdk/m5/conversation/ui/components/ConversationTopAppBarKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,95:1\n87#2:96\n83#2,10:97\n94#2:137\n80#3,6:107\n87#3,3:122\n90#3,2:131\n94#3:136\n391#4,9:113\n400#4,3:133\n4360#5,6:125\n*S KotlinDebug\n*F\n+ 1 ConversationTopAppBar.kt\nio/intercom/android/sdk/m5/conversation/ui/components/ConversationTopAppBarKt\n*L\n59#1:96\n59#1:97,10\n59#1:137\n59#1:107,6\n59#1:122,3\n59#1:131,2\n59#1:136\n59#1:113,9\n59#1:133,3\n59#1:125,6\n*E\n"})
public final class ConversationTopAppBarKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int i10 = 0 << 3;
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ConversationTopAppBar(@NotNull final TopAppBarUiState topAppBarUiState, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function1<? super HeaderMenuItem, Unit> function3, @Nullable Function1<? super MetricData, Unit> function4, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z10;
        long jM704getHeader0d7_KjU;
        long jM711getOnHeader0d7_KjU;
        long jM699getDescriptionText0d7_KjU;
        Function0<Unit> function5;
        Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1613129219);
        Function0<Unit> function6 = (i11 & 2) != 0 ? null : function0;
        Function0<Unit> function7 = (i11 & 4) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function1;
        Function0<Unit> function8 = (i11 & 8) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function2;
        Function1<? super HeaderMenuItem, Unit> function9 = (i11 & 16) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationTopAppBarKt.ConversationTopAppBar$lambda$2((HeaderMenuItem) obj);
            }
        } : function3;
        Function1<? super MetricData, Unit> function10 = (i11 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationTopAppBarKt.ConversationTopAppBar$lambda$3((MetricData) obj);
            }
        } : function4;
        boolean zA = androidx.compose.foundation.t1.a(c0VarR, 0);
        int i12 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        if (i12 == 1) {
            z10 = true;
        } else if (i12 == 2) {
            z10 = false;
        } else {
            if (i12 != 3) {
                throw new kotlin.k0();
            }
            z10 = zA;
        }
        c0VarR.E(-287873620);
        if (!z10 || topAppBarUiState.m190getBackgroundColorDarkQN2ZGVo() == null) {
            androidx.compose.ui.graphics.q0 q0VarM189getBackgroundColorQN2ZGVo = topAppBarUiState.m189getBackgroundColorQN2ZGVo();
            jM704getHeader0d7_KjU = q0VarM189getBackgroundColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m704getHeader0d7_KjU() : q0VarM189getBackgroundColorQN2ZGVo.M();
        } else {
            jM704getHeader0d7_KjU = topAppBarUiState.m190getBackgroundColorDarkQN2ZGVo().M();
        }
        c0VarR.A();
        n7<androidx.compose.ui.graphics.q0> n7VarC = androidx.compose.animation.e1.c(jM704getHeader0d7_KjU, null, "bgColorState", null, c0VarR, a5.S0, 10);
        c0VarR.E(-287862139);
        if (!z10 || topAppBarUiState.m192getContentColorDarkQN2ZGVo() == null) {
            androidx.compose.ui.graphics.q0 q0VarM191getContentColorQN2ZGVo = topAppBarUiState.m191getContentColorQN2ZGVo();
            jM711getOnHeader0d7_KjU = q0VarM191getContentColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m711getOnHeader0d7_KjU() : q0VarM191getContentColorQN2ZGVo.M();
        } else {
            jM711getOnHeader0d7_KjU = topAppBarUiState.m192getContentColorDarkQN2ZGVo().M();
        }
        c0VarR.A();
        n7<androidx.compose.ui.graphics.q0> n7VarC2 = androidx.compose.animation.e1.c(jM711getOnHeader0d7_KjU, null, "contentColorState", null, c0VarR, a5.S0, 10);
        c0VarR.E(-287850801);
        if (!z10 || topAppBarUiState.m194getSubTitleColorDarkQN2ZGVo() == null) {
            androidx.compose.ui.graphics.q0 q0VarM193getSubTitleColorQN2ZGVo = topAppBarUiState.m193getSubTitleColorQN2ZGVo();
            jM699getDescriptionText0d7_KjU = q0VarM193getSubTitleColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU() : q0VarM193getSubTitleColorQN2ZGVo.M();
        } else {
            jM699getDescriptionText0d7_KjU = topAppBarUiState.m194getSubTitleColorDarkQN2ZGVo().M();
        }
        c0VarR.A();
        n7<androidx.compose.ui.graphics.q0> n7VarC3 = androidx.compose.animation.e1.c(jM699getDescriptionText0d7_KjU, null, "subTitleColorState", null, c0VarR, a5.S0, 10);
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarB, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        StringProvider title = topAppBarUiState.getTitle();
        int i13 = StringProvider.$stable;
        String text = title.getText(c0VarR, i13);
        StringProvider subTitle = topAppBarUiState.getSubTitle();
        c0VarR.E(603575221);
        String text2 = subTitle != null ? subTitle.getText(c0VarR, i13) : null;
        c0VarR.A();
        final Function1<? super MetricData, Unit> function11 = function10;
        final Function0<Unit> function12 = function6;
        final Function1<? super HeaderMenuItem, Unit> function13 = function9;
        TopActionBarKt.m172TopActionBarNpQZenA(null, text, text2, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), function12, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), n7VarC.getValue().M(), n7VarC2.getValue().M(), n7VarC3.getValue().M(), function7, androidx.compose.runtime.internal.w.e(-69139937, true, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, function9, n7VarC2, function10), c0VarR, 54), c0VarR, ((i10 << 12) & 458752) | 32768, ((i10 >> 3) & com.planner5d.library.engine.input.f.b.B) | a5.S0, 1);
        androidx.compose.runtime.c0 c0Var2 = c0VarR;
        TicketProgressRowState ticketStatusState = topAppBarUiState.getTicketStatusState();
        c0Var2.E(603606749);
        if (ticketStatusState == null) {
            function5 = function8;
        } else {
            function5 = function8;
            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), function5, true, null, c0Var2, ((i10 >> 6) & com.planner5d.library.engine.input.f.b.B) | a5.S0, 8);
            c0Var2 = c0Var2;
        }
        c0Var2.A();
        c0Var2.o();
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            final Function0<Unit> function14 = function5;
            final Function0<Unit> function15 = function7;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationTopAppBarKt.ConversationTopAppBar$lambda$6(topAppBarUiState, function12, function15, function14, function13, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationTopAppBar$lambda$2(HeaderMenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationTopAppBar$lambda$3(MetricData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationTopAppBar$lambda$6(TopAppBarUiState topAppBarUiState, Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function1 function4, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(topAppBarUiState, "$topAppBarUiState");
        ConversationTopAppBar(topAppBarUiState, function0, function1, function2, function3, function4, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
