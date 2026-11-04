package io.intercom.android.sdk.m5.home.ui;

import androidx.compose.foundation.b5;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.k3;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.q1;
import com.rabbitmq.client.k0;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHomeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeScreen.kt\nio/intercom/android/sdk/m5/home/ui/HomeScreenKt$HomeScreen$3$2$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,272:1\n87#2:273\n83#2,10:274\n94#2:320\n80#3,6:284\n87#3,3:299\n90#3,2:308\n94#3:319\n391#4,9:290\n400#4:310\n401#4,2:317\n4360#5,6:302\n1282#6,6:311\n59#7:321\n90#8:322\n*S KotlinDebug\n*F\n+ 1 HomeScreen.kt\nio/intercom/android/sdk/m5/home/ui/HomeScreenKt$HomeScreen$3$2$2\n*L\n168#1:273\n168#1:274,10\n168#1:320\n168#1:284,6\n168#1:299,3\n168#1:308,2\n168#1:319\n168#1:290,9\n168#1:310\n168#1:317,2\n168#1:302,6\n177#1:311,6\n178#1:321\n178#1:322\n*E\n"})
final class HomeScreenKt$HomeScreen$3$2$2 implements pj.n<androidx.compose.animation.l, c0, Integer, Unit> {
    final /* synthetic */ k3 $headerHeightPx;
    final /* synthetic */ HomeUiState $homeState;
    final /* synthetic */ Function1<Conversation, Unit> $onConversationClicked;
    final /* synthetic */ Function0<Unit> $onHelpClicked;
    final /* synthetic */ Function0<Unit> $onMessagesClicked;
    final /* synthetic */ Function0<Unit> $onNewConversationClicked;
    final /* synthetic */ Function1<String, Unit> $onTicketItemClicked;
    final /* synthetic */ Function1<TicketType, Unit> $onTicketLinkClicked;
    final /* synthetic */ Function0<Unit> $onTicketsClicked;
    final /* synthetic */ b5 $scrollState;

    /* JADX WARN: Multi-variable type inference failed */
    HomeScreenKt$HomeScreen$3$2$2(HomeUiState homeUiState, b5 b5Var, k3 k3Var, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, Function1<? super String, Unit> function3, Function0<Unit> function4, Function1<? super Conversation, Unit> function5, Function1<? super TicketType, Unit> function6) {
        this.$homeState = homeUiState;
        this.$scrollState = b5Var;
        this.$headerHeightPx = k3Var;
        this.$onMessagesClicked = function0;
        this.$onHelpClicked = function1;
        this.$onTicketsClicked = function2;
        this.$onTicketItemClicked = function3;
        this.$onNewConversationClicked = function4;
        this.$onConversationClicked = function5;
        this.$onTicketLinkClicked = function6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(k3 headerHeightPx, g0 it) {
        Intrinsics.checkNotNullParameter(headerHeightPx, "$headerHeightPx");
        Intrinsics.checkNotNullParameter(it, "it");
        headerHeightPx.q((int) (it.a() & k0.f265952a));
        return Unit.f312394a;
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, c0 c0Var, Integer num) {
        invoke(lVar, c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(androidx.compose.animation.l AnimatedVisibility, c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        HomeUiState homeUiState = this.$homeState;
        if (homeUiState instanceof HomeUiState.Content) {
            b5 b5Var = this.$scrollState;
            final k3 k3Var = this.$headerHeightPx;
            Function0<Unit> function0 = this.$onMessagesClicked;
            Function0<Unit> function1 = this.$onHelpClicked;
            Function0<Unit> function2 = this.$onTicketsClicked;
            Function1<String, Unit> function3 = this.$onTicketItemClicked;
            Function0<Unit> function4 = this.$onNewConversationClicked;
            Function1<Conversation, Unit> function5 = this.$onConversationClicked;
            Function1<TicketType, Unit> function6 = this.$onTicketLinkClicked;
            a0.a aVar = a0.E;
            a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iHashCode = Long.hashCode(v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            n0 n0Var = n0.f16227a;
            a0 a0VarA = androidx.compose.ui.draw.a.a(aVar, HomeScreenKt.getHeaderContentOpacity(b5Var.B(), k3Var.V0()));
            c0Var.E(1117660256);
            Object objI0 = c0Var.i0();
            if (objI0 == c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeScreenKt$HomeScreen$3$2$2.invoke$lambda$2$lambda$1$lambda$0(k3Var, (g0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            c0Var.A();
            a0 a0VarA2 = q1.a(a0VarA, (Function1) objI0);
            HomeUiState.Content content = (HomeUiState.Content) homeUiState;
            HomeHeaderKt.HomeContentHeader(a0VarA2, content.getHeader(), c0Var, 64, 0);
            HomeContentScreenKt.HomeContentScreen(null, content, function0, function1, function2, function3, function4, function5, function6, c0Var, 64, 1);
            c0Var.o();
        }
    }
}
