package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import androidx.compose.foundation.layout.b7;
import androidx.compose.foundation.layout.b8;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u7;
import androidx.compose.foundation.layout.v6;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.z3;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.ConversationReactionListener;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.m5.components.ConversationEndedCardKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationBottomBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationBottomBar.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/ConversationBottomBarKt$ConversationBottomBar$6\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n52#2:289\n113#3:290\n152#3:291\n113#3:414\n113#3:415\n113#3:436\n75#4:292\n75#4:413\n75#4:422\n87#5:293\n84#5,9:294\n87#5:368\n84#5,9:369\n94#5:408\n94#5:432\n80#6,6:303\n87#6,3:318\n90#6,2:327\n80#6,6:341\n87#6,3:356\n90#6,2:365\n80#6,6:378\n87#6,3:393\n90#6,2:402\n94#6:407\n94#6:411\n94#6:431\n391#7,9:309\n400#7:329\n391#7,9:347\n400#7:367\n391#7,9:384\n400#7,3:404\n401#7,2:409\n401#7,2:429\n4360#8,6:321\n4360#8,6:359\n4360#8,6:396\n70#9:330\n66#9,10:331\n77#9:412\n1282#10,6:416\n1282#10,6:423\n85#11:433\n85#11:434\n1#12:435\n*S KotlinDebug\n*F\n+ 1 ConversationBottomBar.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/ConversationBottomBarKt$ConversationBottomBar$6\n*L\n90#1:289\n90#1:290\n90#1:291\n128#1:414\n157#1:415\n182#1:436\n91#1:292\n122#1:413\n177#1:422\n93#1:293\n93#1:294,9\n102#1:368\n102#1:369,9\n102#1:408\n93#1:432\n93#1:303,6\n93#1:318,3\n93#1:327,2\n101#1:341,6\n101#1:356,3\n101#1:365,2\n102#1:378,6\n102#1:393,3\n102#1:402,2\n102#1:407\n101#1:411\n93#1:431\n93#1:309,9\n93#1:329\n101#1:347,9\n101#1:367\n102#1:384,9\n102#1:404,3\n101#1:409,2\n93#1:429,2\n93#1:321,6\n101#1:359,6\n102#1:396,6\n101#1:330\n101#1:331,10\n101#1:412\n172#1:416,6\n181#1:423,6\n92#1:433\n172#1:434\n*E\n"})
final class ConversationBottomBarKt$ConversationBottomBar$6 implements pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit> {
    final /* synthetic */ kotlinx.coroutines.flow.z0<Float> $amplitudeLevel;
    final /* synthetic */ BottomBarUiState $bottomBarUiState;
    final /* synthetic */ kotlinx.coroutines.flow.o0<ComposerUiEffect> $composerUiEffect;
    final /* synthetic */ Function1<String, Unit> $navigateToAnotherConversation;
    final /* synthetic */ Function0<Unit> $onCancelVoiceRecording;
    final /* synthetic */ Function0<Unit> $onGifInputSelected;
    final /* synthetic */ Function1<ComposerInputType, Unit> $onInputChange;
    final /* synthetic */ Function0<Unit> $onMediaInputSelected;
    final /* synthetic */ Function0<Unit> $onNewConversationClicked;
    final /* synthetic */ Function0<Unit> $onPrivacyNoticeDismissed;
    final /* synthetic */ Function1<String, Unit> $onSendMessage;
    final /* synthetic */ Function0<Unit> $onStartVoiceRecording;
    final /* synthetic */ Function0<Unit> $onStopVoiceRecording;
    final /* synthetic */ Function0<Unit> $onTyping;
    final /* synthetic */ float $topSpacing;
    final /* synthetic */ Function1<MetricData, Unit> $trackMetric;
    final /* synthetic */ VoiceTranscriptionState $voiceTranscriptionState;

    /* JADX WARN: Multi-variable type inference failed */
    ConversationBottomBarKt$ConversationBottomBar$6(float f10, BottomBarUiState bottomBarUiState, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function2, Function1<? super ComposerInputType, Unit> function3, Function1<? super MetricData, Unit> function4, Function0<Unit> function5, kotlinx.coroutines.flow.o0<? extends ComposerUiEffect> o0Var, VoiceTranscriptionState voiceTranscriptionState, kotlinx.coroutines.flow.z0<Float> z0Var, Function0<Unit> function6, Function0<Unit> function7, Function0<Unit> function8, Function0<Unit> function9, Function1<? super String, Unit> function10, Function0<Unit> function11) {
        this.$topSpacing = f10;
        this.$bottomBarUiState = bottomBarUiState;
        this.$onSendMessage = function1;
        this.$onGifInputSelected = function0;
        this.$onMediaInputSelected = function2;
        this.$onInputChange = function3;
        this.$trackMetric = function4;
        this.$onTyping = function5;
        this.$composerUiEffect = o0Var;
        this.$voiceTranscriptionState = voiceTranscriptionState;
        this.$amplitudeLevel = z0Var;
        this.$onStartVoiceRecording = function6;
        this.$onStopVoiceRecording = function7;
        this.$onCancelVoiceRecording = function8;
        this.$onNewConversationClicked = function9;
        this.$navigateToAnotherConversation = function10;
        this.$onPrivacyNoticeDismissed = function11;
    }

    private static final KeyboardState invoke$lambda$0(n7<KeyboardState> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$13$lambda$12$lambda$11(androidx.compose.ui.unit.d density, int i10) {
        Intrinsics.checkNotNullParameter(density, "$density");
        return -density.g6(androidx.compose.ui.unit.h.r(40));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$4$lambda$3$lambda$2$lambda$1(Function1 navigateToAnotherConversation, ComposerState.ConversationEnded.ConversationEndedCta it) {
        Intrinsics.checkNotNullParameter(navigateToAnotherConversation, "$navigateToAnotherConversation");
        Intrinsics.checkNotNullParameter(it, "$it");
        navigateToAnotherConversation.invoke(it.getLinkedConversationId());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactionInputView invoke$lambda$13$lambda$6(BottomBarUiState bottomBarUiState, ReactionListener reactionListener, Context it) {
        Intrinsics.checkNotNullParameter(bottomBarUiState, "$bottomBarUiState");
        Intrinsics.checkNotNullParameter(reactionListener, "$reactionListener");
        Intrinsics.checkNotNullParameter(it, "it");
        ReactionInputView reactionInputView = new ReactionInputView(it);
        reactionInputView.setUpReactions(((ComposerState.Reactions) bottomBarUiState.getComposerState()).getReactionReply(), true, reactionListener);
        return reactionInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$13$lambda$8$lambda$7(n7 keyboardAsState$delegate) {
        Intrinsics.checkNotNullParameter(keyboardAsState$delegate, "$keyboardAsState$delegate");
        return invoke$lambda$0(keyboardAsState$delegate).isDismissed();
    }

    private static final boolean invoke$lambda$13$lambda$9(n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
        invoke(h0Var, c0Var, num.intValue());
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:86:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:91:0x0411  */
    /* JADX WARN: Type inference failed for: r10v10, types: [androidx.compose.animation.core.y0, java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(androidx.compose.foundation.layout.h0 BoxWithConstraints, androidx.compose.runtime.c0 c0Var, int i10) {
        int i11;
        Function0<Unit> function0;
        float f10;
        ?? r10;
        ?? r12;
        Object obj;
        boolean z10;
        z3 z3Var;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        final androidx.compose.ui.unit.d dVar;
        boolean zD;
        Object objI1;
        Function0<Unit> function1;
        androidx.compose.runtime.c0 c0Var2 = c0Var;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i10 & 14) == 0) {
            i11 = i10 | (c0Var2.D(BoxWithConstraints) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) == 18 && c0Var2.d()) {
            c0Var2.u();
            return;
        }
        float fR = androidx.compose.ui.unit.h.r(kotlin.ranges.r.t(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(BoxWithConstraints.g() - this.$topSpacing) - b7.h(b8.E(v6.f16495a, c0Var2, 8), c0Var2, 0).d()), androidx.compose.ui.unit.h.r(0)));
        Context context = (Context) c0Var2.W(AndroidCompositionLocals_androidKt.g());
        n7<KeyboardState> n7VarKeyboardAsState = KeyboardStateKt.keyboardAsState(c0Var2, 0);
        androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarE = u7.e(i6.k(i6.h(aVar2, 0.0f, 1, null), 0.0f, fR, 1, null));
        BottomBarUiState bottomBarUiState = this.$bottomBarUiState;
        Function1<String, Unit> function2 = this.$onSendMessage;
        Function0<Unit> function3 = this.$onGifInputSelected;
        Function0<Unit> function4 = this.$onMediaInputSelected;
        Function1<ComposerInputType, Unit> function5 = this.$onInputChange;
        n7<KeyboardState> n7Var = n7VarKeyboardAsState;
        Function1<MetricData, Unit> function6 = this.$trackMetric;
        Function0<Unit> function7 = this.$onTyping;
        kotlinx.coroutines.flow.o0<ComposerUiEffect> o0Var = this.$composerUiEffect;
        final BottomBarUiState bottomBarUiState2 = bottomBarUiState;
        VoiceTranscriptionState voiceTranscriptionState = this.$voiceTranscriptionState;
        kotlinx.coroutines.flow.z0<Float> z0Var = this.$amplitudeLevel;
        Function0<Unit> function8 = this.$onStartVoiceRecording;
        Function0<Unit> function9 = this.$onStopVoiceRecording;
        Function0<Unit> function10 = this.$onCancelVoiceRecording;
        Function0<Unit> function11 = this.$onNewConversationClicked;
        final Function1<String, Unit> function12 = this.$navigateToAnotherConversation;
        Function0<Unit> function13 = this.$onPrivacyNoticeDismissed;
        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
        androidx.compose.foundation.layout.q.m mVarY = qVar.y();
        androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar3.u(), c0Var2, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
        androidx.compose.runtime.b1 b1VarK = c0Var2.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarE);
        androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar4.a();
        if (c0Var2.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var2.q();
        if (c0Var2.P()) {
            c0Var2.q0(function0A);
        } else {
            c0Var2.l();
        }
        androidx.compose.runtime.c0 c0VarD = y7.d(c0Var2);
        y7.n(c0VarD, a1VarB, aVar4.e());
        y7.n(c0VarD, b1VarK, aVar4.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar4.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        ComposerState composerState = bottomBarUiState2.getComposerState();
        if (!(composerState instanceof ComposerState.ConversationEnded)) {
            function0 = function13;
            if (composerState instanceof ComposerState.Hidden) {
                c0Var2.E(518901630);
                if (((ComposerState.Hidden) bottomBarUiState2.getComposerState()).getHideKeyboard() && (z3Var = (z3) c0Var2.W(androidx.compose.ui.platform.q1.y())) != null) {
                    z3Var.b();
                    Unit unit = Unit.f312394a;
                }
                c0Var2.A();
                obj = null;
                z10 = true;
            } else if (composerState instanceof ComposerState.TextInput) {
                c0Var2.E(519156698);
                float f11 = 16;
                n7Var = n7Var;
                n0Var = n0Var;
                MessageComposerKt.MessageComposer(d5.v(aVar2, androidx.compose.ui.unit.h.r(f11), 0.0f, androidx.compose.ui.unit.h.r(f11), androidx.compose.ui.unit.h.r(8), 2, null), function2, (ComposerState.TextInput) bottomBarUiState2.getComposerState(), function3, function4, function5, function6, function7, o0Var, voiceTranscriptionState, z0Var, function8, function9, function10, c0Var, 134218246, 8, 0);
                c0Var2 = c0Var;
                c0Var2.A();
                f10 = 0.0f;
                r10 = 0;
                bottomBarUiState2 = bottomBarUiState2;
                aVar2 = aVar2;
                r12 = 1;
            } else {
                n0Var = n0Var;
                n7Var = n7Var;
                if (!(composerState instanceof ComposerState.Reactions)) {
                    c0Var2.E(1956369733);
                    c0Var2.A();
                    throw new kotlin.k0();
                }
                c0Var2.E(520187107);
                final ConversationReactionListener conversationReactionListener = new ConversationReactionListener(MetricTracker.ReactionLocation.CONVERSATION, ((ComposerState.Reactions) bottomBarUiState2.getComposerState()).getLastPartId(), ((ComposerState.Reactions) bottomBarUiState2.getComposerState()).getConversationId(), Injector.get().getApi(), Injector.get().getMetricTracker());
                aVar2 = aVar2;
                f10 = 0.0f;
                r10 = 0;
                r12 = 1;
                bottomBarUiState2 = bottomBarUiState2;
                androidx.compose.ui.viewinterop.e.a(new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.w0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ConversationBottomBarKt$ConversationBottomBar$6.invoke$lambda$13$lambda$6(bottomBarUiState2, conversationReactionListener, (Context) obj2);
                    }
                }, d5.r(i6.h(aVar2, 0.0f, 1, null), androidx.compose.ui.unit.h.r(24)), null, c0Var2, 48, 4);
                c0Var2.A();
            }
            c0Var2.E(1956479606);
            if (!Intrinsics.areEqual(bottomBarUiState2.getBottomBadge(), BottomBarUiState.BottomBadgeState.None.INSTANCE)) {
                c0Var2.E(1956481175);
                objI0 = c0Var2.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    final n7<KeyboardState> n7Var2 = n7Var;
                    objI0 = w6.e(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.x0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(ConversationBottomBarKt$ConversationBottomBar$6.invoke$lambda$13$lambda$8$lambda$7(n7Var2));
                        }
                    });
                    c0Var2.Y(objI0);
                }
                c0Var2.A();
                dVar = (androidx.compose.ui.unit.d) c0Var2.W(androidx.compose.ui.platform.q1.m());
                androidx.compose.foundation.layout.n0 n0Var2 = n0Var;
                androidx.compose.ui.a0 a0VarP = n0Var2.p(aVar2, aVar3.m());
                boolean zInvoke$lambda$13$lambda$9 = invoke$lambda$13$lambda$9((n7) objI0);
                c0Var2.E(1956494016);
                zD = c0Var2.D(dVar);
                objI1 = c0Var2.i0();
                if (zD || objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.y0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Integer.valueOf(ConversationBottomBarKt$ConversationBottomBar$6.invoke$lambda$13$lambda$12$lambda$11(dVar, ((Integer) obj2).intValue()));
                        }
                    };
                    c0Var2.Y(objI1);
                }
                c0Var2.A();
                androidx.compose.runtime.c0 c0Var3 = c0Var2;
                androidx.compose.animation.k.g(n0Var2, zInvoke$lambda$13$lambda$9, a0VarP, androidx.compose.animation.b0.I(r10, (Function1) objI1, r12, r10).c(androidx.compose.animation.b0.m(null, aVar3.w(), false, null, 13, null)).c(androidx.compose.animation.b0.o(r10, 0.3f, r12, r10)), androidx.compose.animation.b0.O(r10, r10, 3, r10).d(androidx.compose.animation.b0.C(null, null, false, null, 15, null)).d(androidx.compose.animation.b0.q(r10, f10, 3, r10)), null, androidx.compose.runtime.internal.w.e(-274395025, r12, new ConversationBottomBarKt$ConversationBottomBar$6$1$4(bottomBarUiState2, function0, n0Var2, function6, context), c0Var2, 54), c0Var3, 1597446, 16);
                c0Var2 = c0Var3;
            }
            c0Var2.A();
            c0Var2.o();
        }
        c0Var2.E(517935453);
        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
        androidx.compose.runtime.b1 b1VarK2 = c0Var2.k();
        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, aVar2);
        Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
        if (c0Var2.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var2.q();
        if (c0Var2.P()) {
            c0Var2.q0(function0A2);
        } else {
            c0Var2.l();
        }
        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
        y7.n(c0VarD2, a1VarK, aVar4.e());
        y7.n(c0VarD2, b1VarK2, aVar4.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar4.f());
        androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.layout.d0.f15956a.b(aVar2, aVar3.i());
        androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar3.u(), c0Var2, 0);
        int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
        androidx.compose.runtime.b1 b1VarK3 = c0Var2.k();
        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var2, a0VarB);
        Function0<androidx.compose.ui.node.g> function0A3 = aVar4.a();
        if (c0Var2.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var2.q();
        if (c0Var2.P()) {
            c0Var2.q0(function0A3);
        } else {
            c0Var2.l();
        }
        androidx.compose.runtime.c0 c0VarD3 = y7.d(c0Var2);
        y7.n(c0VarD3, a1VarB2, aVar4.e());
        y7.n(c0VarD3, b1VarK3, aVar4.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar4.b();
        if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
            c0VarD3.Y(Integer.valueOf(iHashCode3));
            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
        }
        y7.n(c0VarD3, a0VarN3, aVar4.f());
        obj = null;
        IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
        final ComposerState.ConversationEnded.ConversationEndedCta cta = ((ComposerState.ConversationEnded) bottomBarUiState2.getComposerState()).getCta();
        if (cta != null) {
            String linkedConversationId = cta.getLinkedConversationId();
            function1 = (linkedConversationId == null || linkedConversationId.length() == 0) ? function11 : new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.v0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConversationBottomBarKt$ConversationBottomBar$6.invoke$lambda$13$lambda$4$lambda$3$lambda$2$lambda$1(function12, cta);
                }
            };
        } else {
            function1 = null;
        }
        function0 = function13;
        ConversationEndedCardKt.ConversationEndedCard(null, function1, (ComposerState.ConversationEnded) bottomBarUiState2.getComposerState(), c0Var2, StringProvider.$stable << 6, 1);
        c0Var2.o();
        c0Var2.o();
        c0Var2.A();
        z10 = true;
        f10 = 0.0f;
        r10 = obj;
        r12 = z10;
        c0Var2.E(1956479606);
        if (!Intrinsics.areEqual(bottomBarUiState2.getBottomBadge(), BottomBarUiState.BottomBadgeState.None.INSTANCE)) {
            c0Var2.E(1956481175);
            objI0 = c0Var2.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                final n7 n7Var3 = n7Var;
                objI0 = w6.e(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.x0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(ConversationBottomBarKt$ConversationBottomBar$6.invoke$lambda$13$lambda$8$lambda$7(n7Var3));
                    }
                });
                c0Var2.Y(objI0);
            }
            c0Var2.A();
            dVar = (androidx.compose.ui.unit.d) c0Var2.W(androidx.compose.ui.platform.q1.m());
            androidx.compose.foundation.layout.n0 n0Var3 = n0Var;
            androidx.compose.ui.a0 a0VarP2 = n0Var3.p(aVar2, aVar3.m());
            boolean zInvoke$lambda$13$lambda$10 = invoke$lambda$13$lambda$9((n7) objI0);
            c0Var2.E(1956494016);
            zD = c0Var2.D(dVar);
            objI1 = c0Var2.i0();
            if (zD) {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.y0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Integer.valueOf(ConversationBottomBarKt$ConversationBottomBar$6.invoke$lambda$13$lambda$12$lambda$11(dVar, ((Integer) obj2).intValue()));
                    }
                };
                c0Var2.Y(objI1);
            } else {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.y0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Integer.valueOf(ConversationBottomBarKt$ConversationBottomBar$6.invoke$lambda$13$lambda$12$lambda$11(dVar, ((Integer) obj2).intValue()));
                    }
                };
                c0Var2.Y(objI1);
            }
            c0Var2.A();
            androidx.compose.runtime.c0 c0Var4 = c0Var2;
            androidx.compose.animation.k.g(n0Var3, zInvoke$lambda$13$lambda$10, a0VarP2, androidx.compose.animation.b0.I(r10, (Function1) objI1, r12, r10).c(androidx.compose.animation.b0.m(null, aVar3.w(), false, null, 13, null)).c(androidx.compose.animation.b0.o(r10, 0.3f, r12, r10)), androidx.compose.animation.b0.O(r10, r10, 3, r10).d(androidx.compose.animation.b0.C(null, null, false, null, 15, null)).d(androidx.compose.animation.b0.q(r10, f10, 3, r10)), null, androidx.compose.runtime.internal.w.e(-274395025, r12, new ConversationBottomBarKt$ConversationBottomBar$6$1$4(bottomBarUiState2, function0, n0Var3, function6, context), c0Var2, 54), c0Var4, 1597446, 16);
            c0Var2 = c0Var4;
        }
        c0Var2.A();
        c0Var2.o();
    }
}
