package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationBottomBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationBottomBar.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/ConversationBottomBarKt$ConversationBottomBar$6$1$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,288:1\n113#2:289\n*S KotlinDebug\n*F\n+ 1 ConversationBottomBar.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/ConversationBottomBarKt$ConversationBottomBar$6$1$4\n*L\n210#1:289\n*E\n"})
final class ConversationBottomBarKt$ConversationBottomBar$6$1$4 implements pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> {
    final /* synthetic */ BottomBarUiState $bottomBarUiState;
    final /* synthetic */ Context $context;
    final /* synthetic */ Function0<Unit> $onPrivacyNoticeDismissed;
    final /* synthetic */ androidx.compose.foundation.layout.m0 $this_Column;
    final /* synthetic */ Function1<MetricData, Unit> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    ConversationBottomBarKt$ConversationBottomBar$6$1$4(BottomBarUiState bottomBarUiState, Function0<Unit> function0, androidx.compose.foundation.layout.m0 m0Var, Function1<? super MetricData, Unit> function1, Context context) {
        this.$bottomBarUiState = bottomBarUiState;
        this.$onPrivacyNoticeDismissed = function0;
        this.$this_Column = m0Var;
        this.$trackMetric = function1;
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, PoweredBy this_with, Context context) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(context, "$context");
        function1.invoke(MetricData.PoweredByClicked.INSTANCE);
        LinkOpener.handleUrl(this_with.getLinkUrl(), context, Injector.get().getApi());
        return Unit.f312394a;
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var, Integer num) {
        invoke(lVar, c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        BottomBarUiState.BottomBadgeState bottomBadge = this.$bottomBarUiState.getBottomBadge();
        if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.PoweredByBadgeState) {
            c0Var.E(-248826298);
            final PoweredBy poweredBy = ((BottomBarUiState.BottomBadgeState.PoweredByBadgeState) this.$bottomBarUiState.getBottomBadge()).getPoweredBy();
            androidx.compose.foundation.layout.m0 m0Var = this.$this_Column;
            final Function1<MetricData, Unit> function1 = this.$trackMetric;
            final Context context = this.$context;
            PoweredByBadgeKt.m170PoweredByBadgewBJOh4Y(poweredBy.getText(), poweredBy.getIcon(), new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConversationBottomBarKt$ConversationBottomBar$6$1$4.invoke$lambda$1$lambda$0(function1, poweredBy, context);
                }
            }, m0Var.p(androidx.compose.ui.a0.E, androidx.compose.ui.e.f37317a.m()), androidx.compose.ui.graphics.q0.f38131b.s(), IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), c0Var, 24576, 0);
            c0Var.A();
            return;
        }
        if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState) {
            c0Var.E(-247756612);
            PrivacyPolicyKt.PrivacyPolicy(((BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState) this.$bottomBarUiState.getBottomBadge()).getText(), d5.s(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(4)), this.$onPrivacyNoticeDismissed, c0Var, 48, 0);
            c0Var.A();
        } else if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.None) {
            c0Var.E(-247352651);
            c0Var.A();
        } else {
            c0Var.E(-1254955894);
            c0Var.A();
            throw new kotlin.k0();
        }
    }
}
