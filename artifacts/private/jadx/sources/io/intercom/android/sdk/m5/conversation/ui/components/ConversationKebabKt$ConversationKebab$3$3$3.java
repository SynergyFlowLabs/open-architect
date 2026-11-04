package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.n3;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationKebab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationKebab.kt\nio/intercom/android/sdk/m5/conversation/ui/components/ConversationKebabKt$ConversationKebab$3$3$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,172:1\n1863#2:173\n1864#2:180\n1282#3,6:174\n*S KotlinDebug\n*F\n+ 1 ConversationKebab.kt\nio/intercom/android/sdk/m5/conversation/ui/components/ConversationKebabKt$ConversationKebab$3$3$3\n*L\n95#1:173\n95#1:180\n103#1:174,6\n*E\n"})
final class ConversationKebabKt$ConversationKebab$3$3$3 implements pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> {
    final /* synthetic */ long $contentColor;
    final /* synthetic */ List<HeaderMenuItem> $headerMenuItems;
    final /* synthetic */ n3<Boolean> $isExpanded;
    final /* synthetic */ Function1<HeaderMenuItem, Unit> $onMenuClicked;
    final /* synthetic */ Function1<MetricData, Unit> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    ConversationKebabKt$ConversationKebab$3$3$3(List<? extends HeaderMenuItem> list, Function1<? super HeaderMenuItem, Unit> function1, Function1<? super MetricData, Unit> function2, long j10, n3<Boolean> n3Var) {
        this.$headerMenuItems = list;
        this.$onMenuClicked = function1;
        this.$trackMetric = function2;
        this.$contentColor = j10;
        this.$isExpanded = n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(n3 isExpanded, Function1 function1, HeaderMenuItem it, Function1 function2) {
        Intrinsics.checkNotNullParameter(isExpanded, "$isExpanded");
        Intrinsics.checkNotNullParameter(it, "$it");
        isExpanded.setValue(Boolean.FALSE);
        function1.invoke(it);
        function2.invoke(ConversationKebabKt.metricData(it, true));
        return Unit.f312394a;
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
        invoke(m0Var, c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(androidx.compose.foundation.layout.m0 DropdownMenu, androidx.compose.runtime.c0 c0Var, int i10) {
        androidx.compose.runtime.c0 c0Var2 = c0Var;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        if ((i10 & 81) == 16 && c0Var2.d()) {
            c0Var2.u();
            return;
        }
        List<HeaderMenuItem> list = this.$headerMenuItems;
        final Function1<HeaderMenuItem, Unit> function1 = this.$onMenuClicked;
        final Function1<MetricData, Unit> function2 = this.$trackMetric;
        long j10 = this.$contentColor;
        final n3<Boolean> n3Var = this.$isExpanded;
        for (final HeaderMenuItem headerMenuItem : list) {
            String text = headerMenuItem.getLabel().getText(c0Var2, StringProvider.$stable);
            int iIcon = ConversationKebabKt.icon(headerMenuItem);
            String strBadgeText = ConversationKebabKt.badgeText(headerMenuItem);
            boolean zShouldShowUnreadDot = ConversationKebabKt.shouldShowUnreadDot(headerMenuItem);
            c0Var2.E(1730714746);
            boolean zD = c0Var2.D(function1) | c0Var2.D(headerMenuItem) | c0Var2.D(function2);
            Object objI0 = c0Var2.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationKebabKt$ConversationKebab$3$3$3.invoke$lambda$2$lambda$1$lambda$0(n3Var, function1, headerMenuItem, function2);
                    }
                };
                c0Var2.Y(objI0);
            }
            c0Var2.A();
            HeaderMenuItemRowKt.m229HeaderMenuItemRow6RhP_wg(null, text, iIcon, strBadgeText, true, zShouldShowUnreadDot, true, (Function0) objI0, headerMenuItem.getEnabled(), j10, c0Var2, 1597440, 1);
            c0Var2 = c0Var;
            n3Var = n3Var;
        }
    }
}
