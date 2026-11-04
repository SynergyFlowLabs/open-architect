package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationBottomBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationBottomBar.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/ConversationBottomBarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,288:1\n113#2:289\n*S KotlinDebug\n*F\n+ 1 ConversationBottomBar.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/ConversationBottomBarKt\n*L\n74#1:289\n*E\n"})
public final class ConversationBottomBarKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: ConversationBottomBar-n745XfY, reason: not valid java name */
    public static final void m258ConversationBottomBarn745XfY(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final BottomBarUiState bottomBarUiState, @NotNull final Function1<? super String, Unit> onSendMessage, @NotNull final Function1<? super ComposerInputType, Unit> onInputChange, @NotNull final Function0<Unit> onGifInputSelected, @NotNull final Function0<Unit> onNewConversationClicked, @NotNull final Function0<Unit> onMediaInputSelected, @Nullable Function1<? super MetricData, Unit> function1, float f10, @NotNull final Function1<? super String, Unit> navigateToAnotherConversation, @NotNull final Function0<Unit> onPrivacyNoticeDismissed, @Nullable Function0<Unit> function0, @Nullable kotlinx.coroutines.flow.o0<? extends ComposerUiEffect> o0Var, @Nullable VoiceTranscriptionState voiceTranscriptionState, @Nullable kotlinx.coroutines.flow.z0<Float> z0Var, @Nullable Function0<Unit> function2, @Nullable Function0<Unit> function3, @Nullable Function0<Unit> function4, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        Intrinsics.checkNotNullParameter(bottomBarUiState, "bottomBarUiState");
        Intrinsics.checkNotNullParameter(onSendMessage, "onSendMessage");
        Intrinsics.checkNotNullParameter(onInputChange, "onInputChange");
        Intrinsics.checkNotNullParameter(onGifInputSelected, "onGifInputSelected");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "onNewConversationClicked");
        Intrinsics.checkNotNullParameter(onMediaInputSelected, "onMediaInputSelected");
        Intrinsics.checkNotNullParameter(navigateToAnotherConversation, "navigateToAnotherConversation");
        Intrinsics.checkNotNullParameter(onPrivacyNoticeDismissed, "onPrivacyNoticeDismissed");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-919677456);
        androidx.compose.ui.a0 a0Var2 = (i12 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Function1<? super MetricData, Unit> function5 = (i12 & 128) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationBottomBarKt.ConversationBottomBar_n745XfY$lambda$0((MetricData) obj);
            }
        } : function1;
        float fR = (i12 & 256) != 0 ? androidx.compose.ui.unit.h.r(0) : f10;
        Function0<Unit> function6 = (i12 & 2048) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function0;
        kotlinx.coroutines.flow.o0<? extends ComposerUiEffect> o0Var2 = (i12 & 4096) != 0 ? null : o0Var;
        VoiceTranscriptionState voiceTranscriptionState2 = (i12 & 8192) != 0 ? VoiceTranscriptionState.Idle.INSTANCE : voiceTranscriptionState;
        kotlinx.coroutines.flow.z0<Float> z0VarA = (i12 & 16384) != 0 ? kotlinx.coroutines.flow.b1.a(Float.valueOf(0.0f)) : z0Var;
        Function0<Unit> function7 = (i12 & 32768) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function2;
        Function0<Unit> function8 = (i12 & 65536) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function3;
        final Function0<Unit> function9 = (i12 & 131072) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function4;
        final Function0<Unit> function10 = function6;
        final VoiceTranscriptionState voiceTranscriptionState3 = voiceTranscriptionState2;
        final Function0<Unit> function11 = function7;
        final kotlinx.coroutines.flow.o0<? extends ComposerUiEffect> o0Var3 = o0Var2;
        final kotlinx.coroutines.flow.z0<Float> z0Var2 = z0VarA;
        final Function0<Unit> function12 = function8;
        final float f11 = fR;
        final Function1<? super MetricData, Unit> function13 = function5;
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        androidx.compose.foundation.layout.g0.c(a0Var3, null, false, androidx.compose.runtime.internal.w.e(1065060166, true, new ConversationBottomBarKt$ConversationBottomBar$6(f11, bottomBarUiState, onSendMessage, onGifInputSelected, onMediaInputSelected, onInputChange, function13, function10, o0Var3, voiceTranscriptionState3, z0Var2, function11, function12, function9, onNewConversationClicked, navigateToAnotherConversation, onPrivacyNoticeDismissed), c0VarR, 54), c0VarR, (i10 & 14) | 3072, 6);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.s0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationBottomBarKt.ConversationBottomBar_n745XfY$lambda$5(a0Var3, bottomBarUiState, onSendMessage, onInputChange, onGifInputSelected, onNewConversationClicked, onMediaInputSelected, function13, f11, navigateToAnotherConversation, onPrivacyNoticeDismissed, function10, o0Var3, voiceTranscriptionState3, z0Var2, function11, function12, function9, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationBottomBar_n745XfY$lambda$0(MetricData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationBottomBar_n745XfY$lambda$5(androidx.compose.ui.a0 a0Var, BottomBarUiState bottomBarUiState, Function1 onSendMessage, Function1 onInputChange, Function0 onGifInputSelected, Function0 onNewConversationClicked, Function0 onMediaInputSelected, Function1 function1, float f10, Function1 navigateToAnotherConversation, Function0 onPrivacyNoticeDismissed, Function0 function0, kotlinx.coroutines.flow.o0 o0Var, VoiceTranscriptionState voiceTranscriptionState, kotlinx.coroutines.flow.z0 z0Var, Function0 function2, Function0 function3, Function0 function4, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        Intrinsics.checkNotNullParameter(bottomBarUiState, "$bottomBarUiState");
        Intrinsics.checkNotNullParameter(onSendMessage, "$onSendMessage");
        Intrinsics.checkNotNullParameter(onInputChange, "$onInputChange");
        Intrinsics.checkNotNullParameter(onGifInputSelected, "$onGifInputSelected");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "$onNewConversationClicked");
        Intrinsics.checkNotNullParameter(onMediaInputSelected, "$onMediaInputSelected");
        Intrinsics.checkNotNullParameter(navigateToAnotherConversation, "$navigateToAnotherConversation");
        Intrinsics.checkNotNullParameter(onPrivacyNoticeDismissed, "$onPrivacyNoticeDismissed");
        m258ConversationBottomBarn745XfY(a0Var, bottomBarUiState, onSendMessage, onInputChange, onGifInputSelected, onNewConversationClicked, onMediaInputSelected, function1, f10, navigateToAnotherConversation, onPrivacyNoticeDismissed, function0, o0Var, voiceTranscriptionState, z0Var, function2, function3, function4, c0Var, t4.a(i10 | 1), t4.a(i11), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void MessageComposerLongTextPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1582182192);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationBottomBarKt.INSTANCE.m243getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.t0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationBottomBarKt.MessageComposerLongTextPreview$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposerLongTextPreview$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        MessageComposerLongTextPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void MessageComposerPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-961451097);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationBottomBarKt.INSTANCE.m241getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.u0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationBottomBarKt.MessageComposerPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposerPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        MessageComposerPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
