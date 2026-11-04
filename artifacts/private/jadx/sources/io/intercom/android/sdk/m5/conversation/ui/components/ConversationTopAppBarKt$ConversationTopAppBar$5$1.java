package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.x5;
import androidx.compose.runtime.n7;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationTopAppBar.kt\nio/intercom/android/sdk/m5/conversation/ui/components/ConversationTopAppBarKt$ConversationTopAppBar$5$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,95:1\n1282#2,6:96\n*S KotlinDebug\n*F\n+ 1 ConversationTopAppBar.kt\nio/intercom/android/sdk/m5/conversation/ui/components/ConversationTopAppBarKt$ConversationTopAppBar$5$1\n*L\n75#1:96,6\n*E\n"})
final class ConversationTopAppBarKt$ConversationTopAppBar$5$1 implements pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> {
    final /* synthetic */ n7<androidx.compose.ui.graphics.q0> $contentColorState;
    final /* synthetic */ Function1<HeaderMenuItem, Unit> $onMenuClicked;
    final /* synthetic */ TopAppBarUiState $topAppBarUiState;
    final /* synthetic */ Function1<MetricData, Unit> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    ConversationTopAppBarKt$ConversationTopAppBar$5$1(TopAppBarUiState topAppBarUiState, Function1<? super HeaderMenuItem, Unit> function1, n7<androidx.compose.ui.graphics.q0> n7Var, Function1<? super MetricData, Unit> function2) {
        this.$topAppBarUiState = topAppBarUiState;
        this.$onMenuClicked = function1;
        this.$contentColorState = n7Var;
        this.$trackMetric = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, HeaderMenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        function1.invoke(item);
        return Unit.f312394a;
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
        invoke(x5Var, c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(x5 TopActionBar, androidx.compose.runtime.c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(TopActionBar, "$this$TopActionBar");
        if ((i10 & 81) == 16 && c0Var.d()) {
            c0Var.u();
            return;
        }
        List<HeaderMenuItem> headerMenuItems = this.$topAppBarUiState.getHeaderMenuItems();
        c0Var.E(-1166850860);
        boolean zD = c0Var.D(this.$onMenuClicked);
        final Function1<HeaderMenuItem, Unit> function1 = this.$onMenuClicked;
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ConversationTopAppBarKt$ConversationTopAppBar$5$1.invoke$lambda$1$lambda$0(function1, (HeaderMenuItem) obj);
                }
            };
            c0Var.Y(objI0);
        }
        c0Var.A();
        ConversationKebabKt.m227ConversationKebabcf5BqRc(headerMenuItems, (Function1) objI0, this.$contentColorState.getValue().M(), this.$trackMetric, c0Var, 8, 0);
    }
}
