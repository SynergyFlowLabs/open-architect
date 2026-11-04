package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ei;
import androidx.compose.material3.jh;
import androidx.compose.material3.kh;
import androidx.compose.material3.ni;
import androidx.compose.material3.os;
import androidx.compose.material3.q50;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.s3;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.c4;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioPermissionHandlerKt;
import io.intercom.android.sdk.m5.utils.TextFieldSaver;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nMessageComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageComposer.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/MessageComposerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,516:1\n1282#2,6:517\n1282#2,6:523\n1282#2,6:529\n1282#2,6:535\n1282#2,6:541\n1282#2,6:547\n1282#2,6:556\n1282#2,6:563\n1282#2,6:570\n75#3:553\n75#3:554\n75#3:555\n113#4:562\n113#4:576\n113#4:577\n113#4:611\n113#4:648\n113#4:687\n113#4:688\n113#4:693\n113#4:740\n113#4:758\n1#5:569\n99#6,6:578\n99#6:649\n95#6,10:650\n106#6:692\n99#6:694\n95#6,10:695\n106#6:735\n106#6:744\n80#7,6:584\n87#7,3:599\n90#7,2:608\n80#7,6:621\n87#7,3:636\n90#7,2:645\n80#7,6:660\n87#7,3:675\n90#7,2:684\n94#7:691\n80#7,6:705\n87#7,3:720\n90#7,2:729\n94#7:734\n94#7:738\n94#7:743\n391#8,9:590\n400#8:610\n391#8,9:627\n400#8:647\n391#8,9:666\n400#8:686\n401#8,2:689\n391#8,9:711\n400#8,3:731\n401#8,2:736\n401#8,2:741\n4360#9,6:602\n4360#9,6:639\n4360#9,6:678\n4360#9,6:723\n70#10:612\n68#10,8:613\n77#10:739\n85#11:745\n117#11,2:746\n85#11:748\n117#11,2:749\n85#11:751\n117#11,2:752\n85#11:754\n117#11,2:755\n85#11:757\n60#12:759\n*S KotlinDebug\n*F\n+ 1 MessageComposer.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/MessageComposerKt\n*L\n90#1:517,6\n100#1:523,6\n111#1:529,6\n114#1:535,6\n116#1:541,6\n117#1:547,6\n159#1:556,6\n178#1:563,6\n184#1:570,6\n124#1:553\n132#1:554\n133#1:555\n173#1:562\n329#1:576\n331#1:577\n334#1:611\n364#1:648\n367#1:687\n369#1:688\n382#1:693\n404#1:740\n305#1:758\n326#1:578,6\n362#1:649\n362#1:650,10\n362#1:692\n380#1:694\n380#1:695,10\n380#1:735\n326#1:744\n326#1:584,6\n326#1:599,3\n326#1:608,2\n349#1:621,6\n349#1:636,3\n349#1:645,2\n362#1:660,6\n362#1:675,3\n362#1:684,2\n362#1:691\n380#1:705,6\n380#1:720,3\n380#1:729,2\n380#1:734\n349#1:738\n326#1:743\n326#1:590,9\n326#1:610\n349#1:627,9\n349#1:647\n362#1:666,9\n362#1:686\n362#1:689,2\n380#1:711,9\n380#1:731,3\n349#1:736,2\n326#1:741,2\n326#1:602,6\n349#1:639,6\n362#1:678,6\n380#1:723,6\n349#1:612\n349#1:613,8\n349#1:739\n90#1:745\n90#1:746,2\n100#1:748\n100#1:749,2\n111#1:751\n111#1:752,2\n114#1:754\n114#1:755,2\n123#1:757\n306#1:759\n*E\n"})
public final class MessageComposerKt {
    private static final float ComposerHalfSize;
    private static final float ComposerMinSize;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$10, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$10", f = "MessageComposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass10 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ androidx.compose.ui.focus.q $focusManager;
        final /* synthetic */ n7<KeyboardState> $keyboardAsState$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(androidx.compose.ui.focus.q qVar, n7<KeyboardState> n7Var, kotlin.coroutines.d<? super AnonymousClass10> dVar) {
            super(2, dVar);
            this.$focusManager = qVar;
            this.$keyboardAsState$delegate = n7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass10(this.$focusManager, this.$keyboardAsState$delegate, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (MessageComposerKt.MessageComposer$lambda$23(this.$keyboardAsState$delegate).isDismissed()) {
                androidx.compose.ui.focus.q.o(this.$focusManager, false, 1, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass10) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$11, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$11", f = "MessageComposer.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass11 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.o0<ComposerUiEffect> $composerUiEffect;
        final /* synthetic */ String $reportAiMessage;
        final /* synthetic */ n3<androidx.compose.ui.text.input.y0> $textFieldValue$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass11(kotlinx.coroutines.flow.o0<? extends ComposerUiEffect> o0Var, String str, n3<androidx.compose.ui.text.input.y0> n3Var, kotlin.coroutines.d<? super AnonymousClass11> dVar) {
            super(2, dVar);
            this.$composerUiEffect = o0Var;
            this.$reportAiMessage = str;
            this.$textFieldValue$delegate = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass11(this.$composerUiEffect, this.$reportAiMessage, this.$textFieldValue$delegate, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.o0<ComposerUiEffect> o0Var = this.$composerUiEffect;
                if (o0Var == null) {
                    return Unit.f312394a;
                }
                final String str = this.$reportAiMessage;
                final n3<androidx.compose.ui.text.input.y0> n3Var = this.$textFieldValue$delegate;
                kotlinx.coroutines.flow.j<? super ComposerUiEffect> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.MessageComposer.11.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((ComposerUiEffect) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(ComposerUiEffect composerUiEffect, kotlin.coroutines.d<? super Unit> dVar) {
                        if (Intrinsics.areEqual(composerUiEffect, ComposerUiEffect.ReportAiAnswer.INSTANCE)) {
                            n3<androidx.compose.ui.text.input.y0> n3Var2 = n3Var;
                            String str2 = str;
                            MessageComposerKt.MessageComposer$lambda$11(n3Var2, new androidx.compose.ui.text.input.y0(str2, x3.a(str2.length()), (w3) null, 4, (DefaultConstructorMarker) null));
                        } else {
                            if (!(composerUiEffect instanceof ComposerUiEffect.UpdateTranscribedText)) {
                                throw new kotlin.k0();
                            }
                            ComposerUiEffect.UpdateTranscribedText updateTranscribedText = (ComposerUiEffect.UpdateTranscribedText) composerUiEffect;
                            MessageComposerKt.MessageComposer$lambda$11(n3Var, new androidx.compose.ui.text.input.y0(updateTranscribedText.getText(), x3.a(updateTranscribedText.getText().length()), (w3) null, 4, (DefaultConstructorMarker) null));
                        }
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (o0Var.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new kotlin.a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass11) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$15, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nMessageComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageComposer.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/MessageComposerKt$MessageComposer$15\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,516:1\n118#2:517\n113#2:567\n113#2:609\n113#2:610\n113#2:670\n113#2:671\n99#3:518\n96#3,9:519\n106#3:681\n80#4,6:528\n87#4,3:543\n90#4,2:552\n80#4,6:578\n87#4,3:593\n90#4,2:602\n94#4:607\n80#4,6:621\n87#4,3:636\n90#4,2:645\n94#4:650\n94#4:680\n391#5,9:534\n400#5:554\n391#5,9:584\n400#5,3:604\n391#5,9:627\n400#5,3:647\n401#5,2:678\n4360#6,6:546\n4360#6,6:596\n4360#6,6:639\n1282#7,6:555\n1282#7,6:561\n1282#7,6:652\n1282#7,6:658\n1282#7,6:664\n1282#7,6:672\n70#8:568\n67#8,9:569\n77#8:608\n70#8:611\n67#8,9:612\n77#8:651\n*S KotlinDebug\n*F\n+ 1 MessageComposer.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/MessageComposerKt$MessageComposer$15\n*L\n202#1:517\n232#1:567\n237#1:609\n241#1:610\n277#1:670\n278#1:671\n194#1:518\n194#1:519,9\n194#1:681\n194#1:528,6\n194#1:543,3\n194#1:552,2\n232#1:578,6\n232#1:593,3\n232#1:602,2\n232#1:607\n238#1:621,6\n238#1:636,3\n238#1:645,2\n238#1:650\n194#1:680\n194#1:534,9\n194#1:554\n232#1:584,9\n232#1:604,3\n238#1:627,9\n238#1:647,3\n194#1:678,2\n194#1:546,6\n232#1:596,6\n238#1:639,6\n220#1:555,6\n225#1:561,6\n260#1:652,6\n264#1:658,6\n267#1:664,6\n280#1:672,6\n232#1:568\n232#1:569,9\n232#1:608\n238#1:611\n238#1:612,9\n238#1:651\n*E\n"})
    static final class AnonymousClass15 implements pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends Unit>, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ kotlinx.coroutines.flow.z0<Float> $amplitudeLevel;
        final /* synthetic */ n3<androidx.compose.ui.graphics.q0> $borderColor$delegate;
        final /* synthetic */ Function0<Unit> $checkAudioPermission;
        final /* synthetic */ long $defaultColor;
        final /* synthetic */ n3<androidx.compose.ui.graphics.q0> $disableColor$delegate;
        final /* synthetic */ StringProvider $hintText;
        final /* synthetic */ boolean $isDisabled;
        final /* synthetic */ Function0<Unit> $onCancelVoiceRecording;
        final /* synthetic */ Function0<Unit> $onGifInputSelected;
        final /* synthetic */ Function1<ComposerInputType, Unit> $onInputChange;
        final /* synthetic */ Function0<Unit> $onMediaInputSelected;
        final /* synthetic */ Function1<String, Unit> $onSendMessage;
        final /* synthetic */ Function0<Unit> $onStopVoiceRecording;
        final /* synthetic */ androidx.compose.foundation.shape.n $shape;
        final /* synthetic */ n3<androidx.compose.ui.text.input.y0> $textFieldValue$delegate;
        final /* synthetic */ ComposerState.TextInput $textInput;
        final /* synthetic */ Function1<MetricData, Unit> $trackMetric;
        final /* synthetic */ VoiceTranscriptionState $voiceTranscriptionState;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass15(androidx.compose.foundation.shape.n nVar, n3<androidx.compose.ui.graphics.q0> n3Var, ComposerState.TextInput textInput, VoiceTranscriptionState voiceTranscriptionState, kotlinx.coroutines.flow.z0<Float> z0Var, Function0<Unit> function0, n3<androidx.compose.ui.text.input.y0> n3Var2, Function1<? super ComposerInputType, Unit> function1, Function0<Unit> function2, boolean z10, Function1<? super MetricData, Unit> function3, Function0<Unit> function4, Function0<Unit> function5, Function0<Unit> function6, Function1<? super String, Unit> function7, n3<androidx.compose.ui.graphics.q0> n3Var3, StringProvider stringProvider, long j10) {
            this.$shape = nVar;
            this.$borderColor$delegate = n3Var;
            this.$textInput = textInput;
            this.$voiceTranscriptionState = voiceTranscriptionState;
            this.$amplitudeLevel = z0Var;
            this.$onCancelVoiceRecording = function0;
            this.$textFieldValue$delegate = n3Var2;
            this.$onInputChange = function1;
            this.$onStopVoiceRecording = function2;
            this.$isDisabled = z10;
            this.$trackMetric = function3;
            this.$onGifInputSelected = function4;
            this.$onMediaInputSelected = function5;
            this.$checkAudioPermission = function6;
            this.$onSendMessage = function7;
            this.$disableColor$delegate = n3Var3;
            this.$hintText = stringProvider;
            this.$defaultColor = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$1$lambda$0(Function0 function0, Function1 function1, n3 textFieldValue$delegate) {
            Intrinsics.checkNotNullParameter(textFieldValue$delegate, "$textFieldValue$delegate");
            function0.invoke();
            MessageComposerKt.MessageComposer$lambda$11(textFieldValue$delegate, new androidx.compose.ui.text.input.y0("", 0L, (w3) null, 6, (DefaultConstructorMarker) null));
            function1.invoke(ComposerInputType.Text.INSTANCE);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$11$lambda$10(Function0 checkAudioPermission) {
            Intrinsics.checkNotNullParameter(checkAudioPermission, "$checkAudioPermission");
            checkAudioPermission.invoke();
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$13$lambda$12(Function1 onSendMessage, n3 textFieldValue$delegate) {
            Intrinsics.checkNotNullParameter(onSendMessage, "$onSendMessage");
            Intrinsics.checkNotNullParameter(textFieldValue$delegate, "$textFieldValue$delegate");
            onSendMessage.invoke(MessageComposerKt.MessageComposer$lambda$10(textFieldValue$delegate).m());
            boolean z10 = true | false;
            MessageComposerKt.MessageComposer$lambda$11(textFieldValue$delegate, new androidx.compose.ui.text.input.y0("", 0L, (w3) null, 6, (DefaultConstructorMarker) null));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$3$lambda$2(Function0 function0) {
            function0.invoke();
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$7$lambda$6(Function1 function1, Function0 function0) {
            function1.invoke(new MetricData.ComposerInputClicked(MetricTracker.Object.GIF_INPUT));
            function0.invoke();
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$9$lambda$8(Function0 function0) {
            function0.invoke();
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends Unit> function2, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke((Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>) function2, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        public final void invoke(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> innerTextField, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            float f10;
            y5 y5Var;
            androidx.compose.ui.a0.a aVar;
            IntercomTheme intercomTheme;
            int i12;
            final Function1<MetricData, Unit> function1;
            Function0<Unit> function0;
            Function0<Unit> function2;
            Function0<Unit> function3;
            n3<androidx.compose.ui.graphics.q0> n3Var;
            boolean z10;
            androidx.compose.runtime.c0 c0Var2 = c0Var;
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i10 & 14) == 0) {
                i11 = i10 | (c0Var2.k0(innerTextField) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && c0Var2.d()) {
                c0Var2.u();
                return;
            }
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarH = i6.h(aVar2, 0.0f, 1, null);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i13 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0VarG = androidx.compose.foundation.t0.g(androidx.compose.foundation.v.c(a0VarH, intercomTheme2.getColors(c0Var2, i13).m706getInputAlt0d7_KjU(), this.$shape), androidx.compose.foundation.b1.a(androidx.compose.ui.unit.h.r((float) 1.5d), MessageComposerKt.MessageComposer$lambda$16(this.$borderColor$delegate)), this.$shape);
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarQ = aVar3.q();
            ComposerState.TextInput textInput = this.$textInput;
            VoiceTranscriptionState voiceTranscriptionState = this.$voiceTranscriptionState;
            kotlinx.coroutines.flow.z0<Float> z0Var = this.$amplitudeLevel;
            final Function0<Unit> function4 = this.$onCancelVoiceRecording;
            final n3<androidx.compose.ui.text.input.y0> n3Var2 = this.$textFieldValue$delegate;
            final Function1<ComposerInputType, Unit> function5 = this.$onInputChange;
            final Function0<Unit> function6 = this.$onStopVoiceRecording;
            boolean z11 = this.$isDisabled;
            Function1<MetricData, Unit> function7 = this.$trackMetric;
            Function0<Unit> function8 = this.$onGifInputSelected;
            Function0<Unit> function9 = this.$onMediaInputSelected;
            Function0<Unit> function10 = this.$checkAudioPermission;
            final Function1<String, Unit> function11 = this.$onSendMessage;
            n3<androidx.compose.ui.graphics.q0> n3Var3 = this.$disableColor$delegate;
            StringProvider stringProvider = this.$hintText;
            long j10 = this.$defaultColor;
            androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var2, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var2.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarG);
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
            y7.n(c0VarD, a1VarE, aVar4.e());
            y7.n(c0VarD, b1VarK, aVar4.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar4.f());
            y5 y5Var2 = y5.f16577a;
            if ((textInput.getInputType() instanceof ComposerInputType.VoiceNotes) || !(voiceTranscriptionState instanceof VoiceTranscriptionState.Idle)) {
                c0Var2.E(1077635067);
                if (voiceTranscriptionState instanceof VoiceTranscriptionState.Idle) {
                    voiceTranscriptionState = VoiceTranscriptionState.Recording.INSTANCE;
                }
                long jMessageComposer$lambda$19 = MessageComposerKt.MessageComposer$lambda$19(n3Var3);
                c0Var2.E(1697351143);
                boolean zD = c0Var2.D(function4) | c0Var2.D(n3Var2) | c0Var2.D(function5);
                Object objI0 = c0Var2.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.b2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageComposerKt.AnonymousClass15.invoke$lambda$14$lambda$1$lambda$0(function4, function5, n3Var2);
                        }
                    };
                    c0Var2.Y(objI0);
                }
                Function0 function12 = (Function0) objI0;
                c0Var2.A();
                c0Var2.E(1697359516);
                boolean zD2 = c0Var2.D(function6);
                Object objI1 = c0Var2.i0();
                if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.c2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageComposerKt.AnonymousClass15.invoke$lambda$14$lambda$3$lambda$2(function6);
                        }
                    };
                    c0Var2.Y(objI1);
                }
                c0Var2.A();
                MessageComposerKt.m267VoiceNotesComposercf5BqRc(voiceTranscriptionState, z0Var, jMessageComposer$lambda$19, function12, (Function0) objI1, c0Var2, 64);
                c0Var2 = c0Var2;
                androidx.compose.ui.a0 a0VarW = i6.w(aVar2, androidx.compose.ui.unit.h.r(0));
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                androidx.compose.runtime.b1 b1VarK2 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, a0VarW);
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
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                innerTextField.invoke(c0Var2, Integer.valueOf(i11 & 14));
                c0Var2.o();
                c0Var2.A();
            } else {
                c0Var2.E(1079026006);
                l6.a(i6.B(aVar2, androidx.compose.ui.unit.h.r(16)), c0Var2, 6);
                float f11 = 8;
                androidx.compose.ui.a0 a0VarT = d5.t(x5.q(y5Var2, aVar2, 1.0f, false, 2, null), 0.0f, androidx.compose.ui.unit.h.r(f11), 1, null);
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                androidx.compose.runtime.b1 b1VarK3 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var2, a0VarT);
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
                y7.n(c0VarD3, a1VarK2, aVar4.e());
                y7.n(c0VarD3, b1VarK3, aVar4.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar4.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN3, aVar4.f());
                androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                c0Var2.E(-598917947);
                if (MessageComposerKt.MessageComposer$lambda$10(n3Var2).m().length() == 0) {
                    f10 = f11;
                    z10 = true;
                    y5Var = y5Var2;
                    i12 = i13;
                    aVar = aVar2;
                    function1 = function7;
                    function0 = function8;
                    function2 = function9;
                    function3 = function10;
                    intercomTheme = intercomTheme2;
                    n3Var = n3Var3;
                    q50.t(stringProvider.getText(c0Var2, StringProvider.$stable), null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c0Var2, i13).getType04(), c0Var, 0, 0, 131066);
                    c0Var2 = c0Var;
                } else {
                    f10 = f11;
                    y5Var = y5Var2;
                    aVar = aVar2;
                    intercomTheme = intercomTheme2;
                    i12 = i13;
                    function1 = function7;
                    function0 = function8;
                    function2 = function9;
                    function3 = function10;
                    n3Var = n3Var3;
                    z10 = true;
                }
                c0Var2.A();
                innerTextField.invoke(c0Var2, Integer.valueOf(i11 & 14));
                c0Var2.o();
                boolean zShouldShowButtons = MessageComposerKt.shouldShowButtons(MessageComposerKt.MessageComposer$lambda$10(r0).m(), textInput.getButtons());
                c0Var2.E(1697401850);
                if (zShouldShowButtons) {
                    List<BottomBarUiState.BottomBarButton> buttons = textInput.getButtons();
                    boolean z12 = !z11;
                    c0Var2.E(1697408783);
                    final Function0<Unit> function13 = function0;
                    boolean zD3 = c0Var2.D(function1) | c0Var2.D(function13);
                    Object objI2 = c0Var2.i0();
                    if (zD3 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.d2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MessageComposerKt.AnonymousClass15.invoke$lambda$14$lambda$7$lambda$6(function1, function13);
                            }
                        };
                        c0Var2.Y(objI2);
                    }
                    Function0 function14 = (Function0) objI2;
                    c0Var2.A();
                    c0Var2.E(1697416548);
                    final Function0<Unit> function15 = function2;
                    boolean zD4 = c0Var2.D(function15);
                    Object objI3 = c0Var2.i0();
                    if (zD4 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.e2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MessageComposerKt.AnonymousClass15.invoke$lambda$14$lambda$9$lambda$8(function15);
                            }
                        };
                        c0Var2.Y(objI3);
                    }
                    Function0 function16 = (Function0) objI3;
                    c0Var2.A();
                    c0Var2.E(1697421238);
                    final Function0<Unit> function17 = function3;
                    boolean zD5 = c0Var2.D(function17);
                    Object objI4 = c0Var2.i0();
                    if (zD5 || objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MessageComposerKt.AnonymousClass15.invoke$lambda$14$lambda$11$lambda$10(function17);
                            }
                        };
                        c0Var2.Y(objI4);
                    }
                    c0Var2.A();
                    BottomBarButtonComponentKt.BottomBarButtonComponent(null, buttons, z12, function14, function16, (Function0) objI4, c0Var2, 64, 1);
                }
                c0Var2.A();
                if (!zShouldShowButtons) {
                    androidx.compose.ui.a0 a0VarN4 = y5Var.n(i6.w(d5.r(c4.a(aVar, "send_button"), androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(32)), aVar3.a());
                    boolean z13 = (StringsKt.w3(MessageComposerKt.MessageComposer$lambda$10(r0).m()) || r18 != 0) ? false : z10;
                    IntercomTheme intercomTheme3 = intercomTheme;
                    int i14 = i12;
                    androidx.compose.runtime.c0 c0Var3 = c0Var2;
                    jh jhVarY = kh.f30051a.y(intercomTheme3.getColors(c0Var2, i14).m685getActionContrastWhite0d7_KjU(), intercomTheme3.getColors(c0Var2, i14).m709getOnActionContrastWhite0d7_KjU(), MessageComposerKt.MessageComposer$lambda$19(n3Var), intercomTheme3.getColors(c0Var2, i14).m709getOnActionContrastWhite0d7_KjU(), c0Var3, kh.f30052b << 12, 0);
                    c0Var3.E(1697440532);
                    boolean zD6 = c0Var3.D(function11) | c0Var3.D(r0);
                    Object objI5 = c0Var3.i0();
                    if (zD6 || objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MessageComposerKt.AnonymousClass15.invoke$lambda$14$lambda$13$lambda$12(function11, n3Var2);
                            }
                        };
                        c0Var3.Y(objI5);
                    }
                    c0Var3.A();
                    ei.t((Function0) objI5, a0VarN4, z13, null, jhVarY, null, ComposableSingletons$MessageComposerKt.INSTANCE.m247getLambda1$intercom_sdk_base_release(), c0Var3, 1572864, 40);
                    c0Var2 = c0Var3;
                }
                c0Var2.A();
            }
            c0Var2.o();
        }
    }

    static {
        float fR = androidx.compose.ui.unit.h.r(48);
        ComposerMinSize = fR;
        ComposerHalfSize = androidx.compose.ui.unit.h.r(fR / 2);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x030e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0392  */
    /* JADX WARN: Code duplicated, block: B:115:0x041d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0426  */
    /* JADX WARN: Code duplicated, block: B:121:0x042c A[PHI: r3
      0x042c: PHI (r3v36 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r3v30 kotlin.jvm.functions.Function0<kotlin.Unit>), (r3v37 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:120:0x042a, B:116:0x0423] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x042e  */
    /* JADX WARN: Code duplicated, block: B:125:0x043a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0440  */
    /* JADX WARN: Code duplicated, block: B:130:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x0175  */
    /* JADX WARN: Code duplicated, block: B:64:0x0195  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0209  */
    /* JADX WARN: Code duplicated, block: B:75:0x0222  */
    /* JADX WARN: Code duplicated, block: B:78:0x0247  */
    /* JADX WARN: Code duplicated, block: B:81:0x029c  */
    /* JADX WARN: Code duplicated, block: B:82:0x029e  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:86:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:88:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ce  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void MessageComposer(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final Function1<? super String, Unit> onSendMessage, @NotNull final ComposerState.TextInput textInput, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function1<? super ComposerInputType, Unit> function2, @Nullable Function1<? super MetricData, Unit> function3, @Nullable Function0<Unit> function4, @Nullable kotlinx.coroutines.flow.o0<? extends ComposerUiEffect> o0Var, @Nullable VoiceTranscriptionState voiceTranscriptionState, @Nullable kotlinx.coroutines.flow.z0<Float> z0Var, @Nullable Function0<Unit> function5, @Nullable Function0<Unit> function6, @Nullable Function0<Unit> function7, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        kotlinx.coroutines.flow.z0<Float> z0Var2;
        final n3 n3VarH;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        n3 n3Var;
        IntercomTheme intercomTheme;
        int i13;
        final Function0<Unit> function8;
        final VoiceTranscriptionState voiceTranscriptionState2;
        final long jM698getComposerBorder0d7_KjU;
        long jM684getAction0d7_KjU;
        final long j10;
        Object objI1;
        final Function0<Unit> function9;
        final n3 n3Var2;
        final long jM700getDisabled0d7_KjU;
        final long jD;
        Object objI2;
        Function0<Unit> function10;
        final n3 n3Var3;
        Object objI3;
        androidx.compose.ui.focus.g0 g0Var;
        Object objI4;
        boolean z10;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        Object objI5;
        boolean zL;
        Object objI6;
        final Function0<Unit> function11;
        boolean z13;
        boolean zD;
        Object objI7;
        final kotlinx.coroutines.flow.z0<Float> z0Var3;
        final Function0<Unit> function12;
        final androidx.compose.ui.a0 a0Var2;
        final Function0<Unit> function13;
        final kotlinx.coroutines.flow.o0<? extends ComposerUiEffect> o0Var2;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(onSendMessage, "onSendMessage");
        Intrinsics.checkNotNullParameter(textInput, "textInput");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-542978555);
        androidx.compose.ui.a0 a0Var3 = (i12 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Function0<Unit> function14 = (i12 & 8) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.t1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function0;
        Function0<Unit> function15 = (i12 & 16) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.y1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function1;
        Function1<? super ComposerInputType, Unit> function16 = (i12 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MessageComposerKt.MessageComposer$lambda$2((ComposerInputType) obj);
            }
        } : function2;
        Function1<? super MetricData, Unit> function17 = (i12 & 64) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MessageComposerKt.MessageComposer$lambda$3((MetricData) obj);
            }
        } : function3;
        Function0<Unit> function18 = (i12 & 128) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function4;
        kotlinx.coroutines.flow.o0<? extends ComposerUiEffect> o0Var3 = (i12 & 256) != 0 ? null : o0Var;
        VoiceTranscriptionState voiceTranscriptionState3 = (i12 & 512) != 0 ? VoiceTranscriptionState.Idle.INSTANCE : voiceTranscriptionState;
        kotlinx.coroutines.flow.z0<Float> z0VarA = (i12 & 1024) != 0 ? kotlinx.coroutines.flow.b1.a(Float.valueOf(0.0f)) : z0Var;
        final Function0<Unit> function19 = (i12 & 2048) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function5;
        Function0<Unit> function20 = (i12 & 4096) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function6;
        Function0<Unit> function21 = (i12 & 8192) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function7;
        Pair pair = new Pair(textInput.getInitialMessage(), textInput.getHintText());
        final String str = (String) pair.component1();
        StringProvider stringProvider = (StringProvider) pair.component2();
        final Function1<? super MetricData, Unit> function22 = function17;
        kotlinx.coroutines.flow.z0<Float> z0Var4 = z0VarA;
        final Function0<Unit> function23 = function20;
        boolean zIsDisabled = textInput.isDisabled();
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.input.y0, ?> textFieldValueSaver = TextFieldSaver.INSTANCE.getTextFieldValueSaver();
        final Function1<? super ComposerInputType, Unit> function24 = function16;
        c0VarR.E(319554768);
        boolean zD2 = c0VarR.D(str);
        Object objI8 = c0VarR.i0();
        if (!zD2) {
            z0Var2 = z0Var4;
            if (objI8 == androidx.compose.runtime.c0.f35327a.a()) {
            }
            c0VarR.A();
            n3VarH = androidx.compose.runtime.saveable.i.h(objArr, textFieldValueSaver, (Function0) objI8, c0VarR, 72);
            c0VarR.E(319562738);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI0);
            }
            n3Var = (n3) objI0;
            c0VarR.A();
            androidx.compose.foundation.shape.n nVarH = androidx.compose.foundation.shape.o.h(ComposerHalfSize);
            intercomTheme = IntercomTheme.INSTANCE;
            i13 = IntercomTheme.$stable;
            long jW = androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i13).m714getPrimaryText0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            function8 = function21;
            voiceTranscriptionState2 = voiceTranscriptionState3;
            jM698getComposerBorder0d7_KjU = intercomTheme.getColors(c0VarR, i13).m698getComposerBorder0d7_KjU();
            if (ColorExtensionsKt.m736isLightColor8_81llA(intercomTheme.getColors(c0VarR, i13).m684getAction0d7_KjU())) {
                c0VarR.E(1316814398);
                jM684getAction0d7_KjU = ColorExtensionsKt.m728darken8_81llA(intercomTheme.getColors(c0VarR, i13).m684getAction0d7_KjU());
                c0VarR.A();
            } else {
                c0VarR.E(1316871655);
                jM684getAction0d7_KjU = intercomTheme.getColors(c0VarR, i13).m684getAction0d7_KjU();
                c0VarR.A();
            }
            j10 = jM684getAction0d7_KjU;
            c0VarR.E(319576575);
            objI1 = c0VarR.i0();
            function9 = function14;
            if (objI1 == aVar.a()) {
                objI1 = d7.g(androidx.compose.ui.graphics.q0.n(jM698getComposerBorder0d7_KjU), null, 2, null);
                c0VarR.Y(objI1);
            }
            n3Var2 = (n3) objI1;
            c0VarR.A();
            jM700getDisabled0d7_KjU = intercomTheme.getColors(c0VarR, i13).m700getDisabled0d7_KjU();
            jD = androidx.compose.ui.graphics.s0.d(4289901234L);
            c0VarR.E(319582401);
            objI2 = c0VarR.i0();
            function10 = function18;
            if (objI2 == aVar.a()) {
                objI2 = d7.g(androidx.compose.ui.graphics.q0.n(jM700getDisabled0d7_KjU), null, 2, null);
                c0VarR.Y(objI2);
            }
            n3Var3 = (n3) objI2;
            c0VarR.A();
            c0VarR.E(319584813);
            objI3 = c0VarR.i0();
            if (objI3 == aVar.a()) {
                objI3 = new androidx.compose.ui.focus.g0();
                c0VarR.Y(objI3);
            }
            g0Var = (androidx.compose.ui.focus.g0) objI3;
            c0VarR.A();
            Boolean boolValueOf = Boolean.valueOf(MessageComposer$lambda$13(n3Var));
            c0VarR.E(319587124);
            objI4 = c0VarR.i0();
            if (objI4 == aVar.a()) {
                objI4 = new MessageComposerKt$MessageComposer$9$1(g0Var, n3Var, null);
                c0VarR.Y(objI4);
            }
            c0VarR.A();
            androidx.compose.runtime.b2.i(boolValueOf, (Function2) objI4, c0VarR, 64);
            n7<KeyboardState> n7VarKeyboardAsState = KeyboardStateKt.keyboardAsState(c0VarR, 0);
            androidx.compose.runtime.b2.i(Boolean.valueOf(MessageComposer$lambda$23(n7VarKeyboardAsState).isDismissed()), new AnonymousClass10((androidx.compose.ui.focus.q) c0VarR.W(androidx.compose.ui.platform.q1.n()), n7VarKeyboardAsState, null), c0VarR, 64);
            c0VarR.E(319599771);
            c0VarR.E(319600157);
            if (((Configuration) c0VarR.W(AndroidCompositionLocals_androidKt.f())).orientation == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            c0VarR.A();
            if (z10) {
                i15 = 2;
            } else {
                c0VarR.E(319603028);
                if (((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).m0() > 1.5d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c0VarR.A();
                if (z11) {
                    i14 = 4;
                } else {
                    i14 = 5;
                }
                i15 = i14;
            }
            c0VarR.A();
            androidx.compose.runtime.b2.i(null, new AnonymousClass11(o0Var3, u0.i.d(R.string.intercom_report_ai_answer_message, c0VarR, 0), n3VarH, null), c0VarR, 70);
            c0VarR.E(319632671);
            z12 = (((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0VarR.D(function19)) || (i11 & 48) == 32;
            objI5 = c0VarR.i0();
            if (z12 || objI5 == aVar.a()) {
                objI5 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MessageComposerKt.MessageComposer$lambda$25$lambda$24(function19);
                    }
                };
                c0VarR.Y(objI5);
            }
            c0VarR.A();
            Function0<Unit> function0RememberAudioPermissionHandler = AudioPermissionHandlerKt.rememberAudioPermissionHandler((Function0) objI5, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.u1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, c0VarR, 48);
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.draw.x.f(androidx.compose.ui.focus.j0.a(i6.b(i6.h(a0Var3, 0.0f, 1, null), 0.0f, ComposerMinSize, 1, null), g0Var), androidx.compose.ui.unit.h.r(28), nVarH, false, androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i13).m718getShadow0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i13).m718getShadow0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null), 4, null);
            c0VarR.E(319652463);
            zL = c0VarR.L(j10) | c0VarR.L(jM698getComposerBorder0d7_KjU) | c0VarR.L(jM700getDisabled0d7_KjU);
            objI6 = c0VarR.i0();
            if (zL || objI6 == aVar.a()) {
                objI6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.v1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageComposerKt.MessageComposer$lambda$28$lambda$27(j10, jM698getComposerBorder0d7_KjU, jD, jM700getDisabled0d7_KjU, n3Var2, n3Var3, (androidx.compose.ui.focus.p0) obj);
                    }
                };
                c0VarR.Y(objI6);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.focus.d.a(a0VarF, (Function1) objI6);
            androidx.compose.ui.text.input.y0 y0VarMessageComposer$lambda$10 = MessageComposer$lambda$10(n3VarH);
            boolean z14 = !zIsDisabled;
            s3 s3Var = new s3(intercomTheme.getColors(c0VarR, i13).m714getPrimaryText0d7_KjU(), null);
            y3 y3VarM = y3.m(intercomTheme.getTypography(c0VarR, i13).getType04(), intercomTheme.getColors(c0VarR, i13).m714getPrimaryText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            c0VarR.E(319662450);
            if (((i10 & 29360128) ^ 12582912) > 8388608) {
                function11 = function10;
                if (!c0VarR.D(function11)) {
                    z13 = true;
                }
                zD = z13 | c0VarR.D(n3VarH);
                objI7 = c0VarR.i0();
                if (zD || objI7 == aVar.a()) {
                    objI7 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.w1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MessageComposerKt.MessageComposer$lambda$31$lambda$30(function11, n3VarH, (androidx.compose.ui.text.input.y0) obj);
                        }
                    };
                    c0VarR.Y(objI7);
                }
                c0VarR.A();
                z0Var3 = z0Var2;
                function12 = function11;
                a0Var2 = a0Var3;
                function13 = function19;
                o0Var2 = o0Var3;
                androidx.compose.foundation.text.s0.x(y0VarMessageComposer$lambda$10, (Function1) objI7, a0VarA, z14, false, y3VarM, null, null, false, i15, 0, null, null, null, s3Var, androidx.compose.runtime.internal.w.e(-1470391550, true, new AnonymousClass15(nVarH, n3Var2, textInput, voiceTranscriptionState2, z0Var3, function8, n3VarH, function24, function23, zIsDisabled, function22, function9, function15, function0RememberAudioPermissionHandler, onSendMessage, n3Var3, stringProvider, jW), c0VarR, 54), c0VarR, 0, androidx.profileinstaller.n.c.f73814m, 15824);
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final Function0<Unit> function25 = function15;
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.x1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MessageComposerKt.MessageComposer$lambda$32(a0Var2, onSendMessage, textInput, function9, function25, function24, function22, function12, o0Var2, voiceTranscriptionState2, z0Var3, function13, function23, function8, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            function11 = function10;
            if ((i10 & 12582912) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            zD = z13 | c0VarR.D(n3VarH);
            objI7 = c0VarR.i0();
            if (zD) {
                objI7 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.w1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageComposerKt.MessageComposer$lambda$31$lambda$30(function11, n3VarH, (androidx.compose.ui.text.input.y0) obj);
                    }
                };
                c0VarR.Y(objI7);
            } else {
                objI7 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.w1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageComposerKt.MessageComposer$lambda$31$lambda$30(function11, n3VarH, (androidx.compose.ui.text.input.y0) obj);
                    }
                };
                c0VarR.Y(objI7);
            }
            c0VarR.A();
            z0Var3 = z0Var2;
            function12 = function11;
            a0Var2 = a0Var3;
            function13 = function19;
            o0Var2 = o0Var3;
            androidx.compose.foundation.text.s0.x(y0VarMessageComposer$lambda$10, (Function1) objI7, a0VarA, z14, false, y3VarM, null, null, false, i15, 0, null, null, null, s3Var, androidx.compose.runtime.internal.w.e(-1470391550, true, new AnonymousClass15(nVarH, n3Var2, textInput, voiceTranscriptionState2, z0Var3, function8, n3VarH, function24, function23, zIsDisabled, function22, function9, function15, function0RememberAudioPermissionHandler, onSendMessage, n3Var3, stringProvider, jW), c0VarR, 54), c0VarR, 0, androidx.profileinstaller.n.c.f73814m, 15824);
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final Function0 function26 = function15;
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.x1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MessageComposerKt.MessageComposer$lambda$32(a0Var2, onSendMessage, textInput, function9, function26, function24, function22, function12, o0Var2, voiceTranscriptionState2, z0Var3, function13, function23, function8, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        z0Var2 = z0Var4;
        objI8 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MessageComposerKt.MessageComposer$lambda$9$lambda$8(str);
            }
        };
        c0VarR.Y(objI8);
        c0VarR.A();
        n3VarH = androidx.compose.runtime.saveable.i.h(objArr, textFieldValueSaver, (Function0) objI8, c0VarR, 72);
        c0VarR.E(319562738);
        objI0 = c0VarR.i0();
        aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(Boolean.FALSE, null, 2, null);
            c0VarR.Y(objI0);
        }
        n3Var = (n3) objI0;
        c0VarR.A();
        androidx.compose.foundation.shape.n nVarH2 = androidx.compose.foundation.shape.o.h(ComposerHalfSize);
        intercomTheme = IntercomTheme.INSTANCE;
        i13 = IntercomTheme.$stable;
        long jW2 = androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i13).m714getPrimaryText0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
        function8 = function21;
        voiceTranscriptionState2 = voiceTranscriptionState3;
        jM698getComposerBorder0d7_KjU = intercomTheme.getColors(c0VarR, i13).m698getComposerBorder0d7_KjU();
        if (ColorExtensionsKt.m736isLightColor8_81llA(intercomTheme.getColors(c0VarR, i13).m684getAction0d7_KjU())) {
            c0VarR.E(1316814398);
            jM684getAction0d7_KjU = ColorExtensionsKt.m728darken8_81llA(intercomTheme.getColors(c0VarR, i13).m684getAction0d7_KjU());
            c0VarR.A();
        } else {
            c0VarR.E(1316871655);
            jM684getAction0d7_KjU = intercomTheme.getColors(c0VarR, i13).m684getAction0d7_KjU();
            c0VarR.A();
        }
        j10 = jM684getAction0d7_KjU;
        c0VarR.E(319576575);
        objI1 = c0VarR.i0();
        function9 = function14;
        if (objI1 == aVar.a()) {
            objI1 = d7.g(androidx.compose.ui.graphics.q0.n(jM698getComposerBorder0d7_KjU), null, 2, null);
            c0VarR.Y(objI1);
        }
        n3Var2 = (n3) objI1;
        c0VarR.A();
        jM700getDisabled0d7_KjU = intercomTheme.getColors(c0VarR, i13).m700getDisabled0d7_KjU();
        jD = androidx.compose.ui.graphics.s0.d(4289901234L);
        c0VarR.E(319582401);
        objI2 = c0VarR.i0();
        function10 = function18;
        if (objI2 == aVar.a()) {
            objI2 = d7.g(androidx.compose.ui.graphics.q0.n(jM700getDisabled0d7_KjU), null, 2, null);
            c0VarR.Y(objI2);
        }
        n3Var3 = (n3) objI2;
        c0VarR.A();
        c0VarR.E(319584813);
        objI3 = c0VarR.i0();
        if (objI3 == aVar.a()) {
            objI3 = new androidx.compose.ui.focus.g0();
            c0VarR.Y(objI3);
        }
        g0Var = (androidx.compose.ui.focus.g0) objI3;
        c0VarR.A();
        Boolean boolValueOf2 = Boolean.valueOf(MessageComposer$lambda$13(n3Var));
        c0VarR.E(319587124);
        objI4 = c0VarR.i0();
        if (objI4 == aVar.a()) {
            objI4 = new MessageComposerKt$MessageComposer$9$1(g0Var, n3Var, null);
            c0VarR.Y(objI4);
        }
        c0VarR.A();
        androidx.compose.runtime.b2.i(boolValueOf2, (Function2) objI4, c0VarR, 64);
        n7<KeyboardState> n7VarKeyboardAsState2 = KeyboardStateKt.keyboardAsState(c0VarR, 0);
        androidx.compose.runtime.b2.i(Boolean.valueOf(MessageComposer$lambda$23(n7VarKeyboardAsState2).isDismissed()), new AnonymousClass10((androidx.compose.ui.focus.q) c0VarR.W(androidx.compose.ui.platform.q1.n()), n7VarKeyboardAsState2, null), c0VarR, 64);
        c0VarR.E(319599771);
        c0VarR.E(319600157);
        if (((Configuration) c0VarR.W(AndroidCompositionLocals_androidKt.f())).orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        c0VarR.A();
        if (z10) {
            i15 = 2;
        } else {
            c0VarR.E(319603028);
            if (((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).m0() > 1.5d) {
                z11 = true;
            } else {
                z11 = false;
            }
            c0VarR.A();
            if (z11) {
                i14 = 4;
            } else {
                i14 = 5;
            }
            i15 = i14;
        }
        c0VarR.A();
        androidx.compose.runtime.b2.i(null, new AnonymousClass11(o0Var3, u0.i.d(R.string.intercom_report_ai_answer_message, c0VarR, 0), n3VarH, null), c0VarR, 70);
        c0VarR.E(319632671);
        if (((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32) {
        }
        objI5 = c0VarR.i0();
        if (z12) {
            objI5 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MessageComposerKt.MessageComposer$lambda$25$lambda$24(function19);
                }
            };
            c0VarR.Y(objI5);
        } else {
            objI5 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MessageComposerKt.MessageComposer$lambda$25$lambda$24(function19);
                }
            };
            c0VarR.Y(objI5);
        }
        c0VarR.A();
        Function0<Unit> function0RememberAudioPermissionHandler2 = AudioPermissionHandlerKt.rememberAudioPermissionHandler((Function0) objI5, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, c0VarR, 48);
        androidx.compose.ui.a0 a0VarF2 = androidx.compose.ui.draw.x.f(androidx.compose.ui.focus.j0.a(i6.b(i6.h(a0Var3, 0.0f, 1, null), 0.0f, ComposerMinSize, 1, null), g0Var), androidx.compose.ui.unit.h.r(28), nVarH2, false, androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i13).m718getShadow0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i13).m718getShadow0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null), 4, null);
        c0VarR.E(319652463);
        zL = c0VarR.L(j10) | c0VarR.L(jM698getComposerBorder0d7_KjU) | c0VarR.L(jM700getDisabled0d7_KjU);
        objI6 = c0VarR.i0();
        if (zL) {
            objI6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.v1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MessageComposerKt.MessageComposer$lambda$28$lambda$27(j10, jM698getComposerBorder0d7_KjU, jD, jM700getDisabled0d7_KjU, n3Var2, n3Var3, (androidx.compose.ui.focus.p0) obj);
                }
            };
            c0VarR.Y(objI6);
        } else {
            objI6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.v1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MessageComposerKt.MessageComposer$lambda$28$lambda$27(j10, jM698getComposerBorder0d7_KjU, jD, jM700getDisabled0d7_KjU, n3Var2, n3Var3, (androidx.compose.ui.focus.p0) obj);
                }
            };
            c0VarR.Y(objI6);
        }
        c0VarR.A();
        androidx.compose.ui.a0 a0VarA2 = androidx.compose.ui.focus.d.a(a0VarF2, (Function1) objI6);
        androidx.compose.ui.text.input.y0 y0VarMessageComposer$lambda$11 = MessageComposer$lambda$10(n3VarH);
        boolean z15 = !zIsDisabled;
        s3 s3Var2 = new s3(intercomTheme.getColors(c0VarR, i13).m714getPrimaryText0d7_KjU(), null);
        y3 y3VarM2 = y3.m(intercomTheme.getTypography(c0VarR, i13).getType04(), intercomTheme.getColors(c0VarR, i13).m714getPrimaryText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        c0VarR.E(319662450);
        if (((i10 & 29360128) ^ 12582912) > 8388608) {
            function11 = function10;
            if (!c0VarR.D(function11)) {
                z13 = true;
            }
            zD = z13 | c0VarR.D(n3VarH);
            objI7 = c0VarR.i0();
            if (zD) {
                objI7 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.w1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageComposerKt.MessageComposer$lambda$31$lambda$30(function11, n3VarH, (androidx.compose.ui.text.input.y0) obj);
                    }
                };
                c0VarR.Y(objI7);
            } else {
                objI7 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.w1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageComposerKt.MessageComposer$lambda$31$lambda$30(function11, n3VarH, (androidx.compose.ui.text.input.y0) obj);
                    }
                };
                c0VarR.Y(objI7);
            }
            c0VarR.A();
            z0Var3 = z0Var2;
            function12 = function11;
            a0Var2 = a0Var3;
            function13 = function19;
            o0Var2 = o0Var3;
            androidx.compose.foundation.text.s0.x(y0VarMessageComposer$lambda$11, (Function1) objI7, a0VarA2, z15, false, y3VarM2, null, null, false, i15, 0, null, null, null, s3Var2, androidx.compose.runtime.internal.w.e(-1470391550, true, new AnonymousClass15(nVarH2, n3Var2, textInput, voiceTranscriptionState2, z0Var3, function8, n3VarH, function24, function23, zIsDisabled, function22, function9, function15, function0RememberAudioPermissionHandler2, onSendMessage, n3Var3, stringProvider, jW2), c0VarR, 54), c0VarR, 0, androidx.profileinstaller.n.c.f73814m, 15824);
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final Function0 function27 = function15;
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.x1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MessageComposerKt.MessageComposer$lambda$32(a0Var2, onSendMessage, textInput, function9, function27, function24, function22, function12, o0Var2, voiceTranscriptionState2, z0Var3, function13, function23, function8, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        function11 = function10;
        if ((i10 & 12582912) == 8388608) {
            z13 = true;
        } else {
            z13 = false;
        }
        zD = z13 | c0VarR.D(n3VarH);
        objI7 = c0VarR.i0();
        if (zD) {
            objI7 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.w1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MessageComposerKt.MessageComposer$lambda$31$lambda$30(function11, n3VarH, (androidx.compose.ui.text.input.y0) obj);
                }
            };
            c0VarR.Y(objI7);
        } else {
            objI7 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.w1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MessageComposerKt.MessageComposer$lambda$31$lambda$30(function11, n3VarH, (androidx.compose.ui.text.input.y0) obj);
                }
            };
            c0VarR.Y(objI7);
        }
        c0VarR.A();
        z0Var3 = z0Var2;
        function12 = function11;
        a0Var2 = a0Var3;
        function13 = function19;
        o0Var2 = o0Var3;
        androidx.compose.foundation.text.s0.x(y0VarMessageComposer$lambda$11, (Function1) objI7, a0VarA2, z15, false, y3VarM2, null, null, false, i15, 0, null, null, null, s3Var2, androidx.compose.runtime.internal.w.e(-1470391550, true, new AnonymousClass15(nVarH2, n3Var2, textInput, voiceTranscriptionState2, z0Var3, function8, n3VarH, function24, function23, zIsDisabled, function22, function9, function15, function0RememberAudioPermissionHandler2, onSendMessage, n3Var3, stringProvider, jW2), c0VarR, 54), c0VarR, 0, androidx.profileinstaller.n.c.f73814m, 15824);
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final Function0 function28 = function15;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.x1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageComposerKt.MessageComposer$lambda$32(a0Var2, onSendMessage, textInput, function9, function28, function24, function22, function12, o0Var2, voiceTranscriptionState2, z0Var3, function13, function23, function8, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.y0 MessageComposer$lambda$10(n3<androidx.compose.ui.text.input.y0> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageComposer$lambda$11(n3<androidx.compose.ui.text.input.y0> n3Var, androidx.compose.ui.text.input.y0 y0Var) {
        n3Var.setValue(y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MessageComposer$lambda$13(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageComposer$lambda$14(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MessageComposer$lambda$16(n3<androidx.compose.ui.graphics.q0> n3Var) {
        return n3Var.getValue().M();
    }

    private static final void MessageComposer$lambda$17(n3<androidx.compose.ui.graphics.q0> n3Var, long j10) {
        n3Var.setValue(androidx.compose.ui.graphics.q0.n(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MessageComposer$lambda$19(n3<androidx.compose.ui.graphics.q0> n3Var) {
        return n3Var.getValue().M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposer$lambda$2(ComposerInputType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    private static final void MessageComposer$lambda$20(n3<androidx.compose.ui.graphics.q0> n3Var, long j10) {
        n3Var.setValue(androidx.compose.ui.graphics.q0.n(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState MessageComposer$lambda$23(n7<KeyboardState> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposer$lambda$25$lambda$24(Function0 function0) {
        function0.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposer$lambda$28$lambda$27(long j10, long j11, long j12, long j13, n3 borderColor$delegate, n3 disableColor$delegate, androidx.compose.ui.focus.p0 focused) {
        Intrinsics.checkNotNullParameter(borderColor$delegate, "$borderColor$delegate");
        Intrinsics.checkNotNullParameter(disableColor$delegate, "$disableColor$delegate");
        Intrinsics.checkNotNullParameter(focused, "focused");
        if (!focused.k()) {
            j10 = j11;
        }
        MessageComposer$lambda$17(borderColor$delegate, j10);
        if (!focused.k()) {
            j12 = j13;
        }
        MessageComposer$lambda$20(disableColor$delegate, j12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposer$lambda$3(MetricData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposer$lambda$31$lambda$30(Function0 function0, n3 textFieldValue$delegate, androidx.compose.ui.text.input.y0 it) {
        Intrinsics.checkNotNullParameter(textFieldValue$delegate, "$textFieldValue$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        textFieldValue$delegate.setValue(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposer$lambda$32(androidx.compose.ui.a0 a0Var, Function1 onSendMessage, ComposerState.TextInput textInput, Function0 function0, Function0 function1, Function1 function2, Function1 function3, Function0 function4, kotlinx.coroutines.flow.o0 o0Var, VoiceTranscriptionState voiceTranscriptionState, kotlinx.coroutines.flow.z0 z0Var, Function0 function5, Function0 function6, Function0 function7, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        Intrinsics.checkNotNullParameter(onSendMessage, "$onSendMessage");
        Intrinsics.checkNotNullParameter(textInput, "$textInput");
        MessageComposer(a0Var, onSendMessage, textInput, function0, function1, function2, function3, function4, o0Var, voiceTranscriptionState, z0Var, function5, function6, function7, c0Var, t4.a(i10 | 1), t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 MessageComposer$lambda$9$lambda$8(String initialMessage) {
        Intrinsics.checkNotNullParameter(initialMessage, "$initialMessage");
        int i10 = 6 | 4;
        return d7.g(new androidx.compose.ui.text.input.y0(initialMessage, x3.a(initialMessage.length()), (w3) null, 4, (DefaultConstructorMarker) null), null, 2, null);
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextComposerPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-609144377);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m249getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageComposerKt.TextComposerPreview$lambda$38(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextComposerPreview$lambda$38(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextComposerPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextComposerWithButtonsPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1468421996);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m250getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.r1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageComposerKt.TextComposerWithButtonsPreview$lambda$39(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextComposerWithButtonsPreview$lambda$39(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextComposerWithButtonsPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextComposerWithInitialTextPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-986390788);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m251getLambda5$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageComposerKt.TextComposerWithInitialTextPreview$lambda$40(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextComposerWithInitialTextPreview$lambda$40(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextComposerWithInitialTextPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:63:0x0480  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: VoiceNotesComposer-cf5BqRc, reason: not valid java name */
    public static final void m267VoiceNotesComposercf5BqRc(final VoiceTranscriptionState voiceTranscriptionState, final kotlinx.coroutines.flow.z0<Float> z0Var, final long j10, final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.c0 c0Var, final int i10) {
        IntercomTheme intercomTheme;
        int i11;
        int i12;
        s5 s5VarT;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-103778572);
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        float f10 = 8;
        androidx.compose.ui.a0 a0VarR = d5.r(i6.h(aVar, 0.0f, 1, null), androidx.compose.ui.unit.h.r(f10));
        androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
        androidx.compose.ui.e.c cVarQ = aVar2.q();
        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
        androidx.compose.ui.layout.a1 a1VarE = u5.e(qVar.G(androidx.compose.ui.unit.h.r(f10)), cVarQ, c0VarR, 54);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarR);
        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
        y7.n(c0VarD, a1VarE, aVar3.e());
        y7.n(c0VarD, b1VarK, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar3.f());
        y5 y5Var = y5.f16577a;
        float f11 = 32;
        androidx.compose.ui.a0 a0VarW = i6.w(aVar, androidx.compose.ui.unit.h.r(f11));
        kh khVar = kh.f30051a;
        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
        int i13 = IntercomTheme.$stable;
        long jW = androidx.compose.ui.graphics.q0.w(intercomTheme2.getColors(c0VarR, i13).m713getPrimaryIcon0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        long jM699getDescriptionText0d7_KjU = intercomTheme2.getColors(c0VarR, i13).m699getDescriptionText0d7_KjU();
        long jM709getOnActionContrastWhite0d7_KjU = intercomTheme2.getColors(c0VarR, i13).m709getOnActionContrastWhite0d7_KjU();
        int i14 = i10 & 896;
        int i15 = kh.f30052b;
        androidx.compose.runtime.c0 c0Var2 = c0VarR;
        ei.t(function0, a0VarW, false, null, khVar.y(jW, jM699getDescriptionText0d7_KjU, j10, jM709getOnActionContrastWhite0d7_KjU, c0VarR, i14 | (i15 << 12), 0), null, ComposableSingletons$MessageComposerKt.INSTANCE.m248getLambda2$intercom_sdk_base_release(), c0Var2, ((i10 >> 9) & 14) | 1572912, 44);
        androidx.compose.ui.a0 a0VarQ = x5.q(y5Var, aVar, 1.0f, false, 2, null);
        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.i(), false);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
        androidx.compose.runtime.b1 b1VarK2 = c0Var2.k();
        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, a0VarQ);
        Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
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
        y7.n(c0VarD2, a1VarK, aVar3.e());
        y7.n(c0VarD2, b1VarK2, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar3.f());
        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
        boolean z10 = voiceTranscriptionState instanceof VoiceTranscriptionState.Recording;
        if (!z10) {
            if (voiceTranscriptionState instanceof VoiceTranscriptionState.Processing) {
                c0Var2.E(1107501069);
                androidx.compose.ui.layout.a1 a1VarE2 = u5.e(qVar.G(androidx.compose.ui.unit.h.r(4)), aVar2.q(), c0Var2, 54);
                int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                androidx.compose.runtime.b1 b1VarK3 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var2, aVar);
                Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
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
                y7.n(c0VarD3, a1VarE2, aVar3.e());
                y7.n(c0VarD3, b1VarK3, aVar3.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN3, aVar3.f());
                intercomTheme = intercomTheme2;
                os.F(i6.w(aVar, androidx.compose.ui.unit.h.r(16)), intercomTheme2.getColors(c0Var2, i13).m699getDescriptionText0d7_KjU(), androidx.compose.ui.unit.h.r(2), 0L, 0, 0.0f, c0Var2, 390, 56);
                i11 = i13;
                q50.t(u0.i.d(R.string.intercom_transcribing, c0Var2, 0), null, intercomTheme.getColors(c0Var2, i11).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var2, i11).getType04(), c0Var2, 0, 0, 131066);
                c0Var2 = c0Var2;
                c0Var2.o();
                c0Var2.A();
            } else if (voiceTranscriptionState instanceof VoiceTranscriptionState.Error) {
                c0Var2.E(1108332675);
                androidx.compose.ui.layout.a1 a1VarE3 = u5.e(qVar.G(androidx.compose.ui.unit.h.r(4)), aVar2.q(), c0Var2, 54);
                int iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                androidx.compose.runtime.b1 b1VarK4 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0Var2, aVar);
                Function0<androidx.compose.ui.node.g> function0A4 = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A4);
                } else {
                    c0Var2.l();
                }
                androidx.compose.runtime.c0 c0VarD4 = y7.d(c0Var2);
                y7.n(c0VarD4, a1VarE3, aVar3.e());
                y7.n(c0VarD4, b1VarK4, aVar3.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4 = aVar3.b();
                if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iHashCode4))) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN4, aVar3.f());
                intercomTheme = intercomTheme2;
                i11 = i13;
                i12 = 54;
                ni.o(u0.e.c(io.intercom.android.sdk.ui.R.drawable.intercom_ic_error, c0Var2, 0), null, null, intercomTheme2.getColors(c0Var2, i13).m702getError0d7_KjU(), c0Var2, 56, 4);
                q50.t(((VoiceTranscriptionState.Error) voiceTranscriptionState).getError().getUserMessage().getText(c0Var2, StringProvider.$stable), null, intercomTheme.getColors(c0Var2, i11).m702getError0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var2, i11).getType04(), c0Var2, 0, 0, 131066);
                c0Var2 = c0Var2;
                c0Var2.o();
                c0Var2.A();
            } else {
                intercomTheme = intercomTheme2;
                i11 = i13;
                i12 = 54;
                c0Var2.E(1109094872);
                c0Var2.A();
            }
            c0Var2.o();
            androidx.compose.runtime.c0 c0Var3 = c0Var2;
            ei.t(function1, i6.w(aVar, androidx.compose.ui.unit.h.r(f11)), z10, null, khVar.y(intercomTheme.getColors(c0Var2, i11).m685getActionContrastWhite0d7_KjU(), intercomTheme.getColors(c0Var2, i11).m709getOnActionContrastWhite0d7_KjU(), j10, intercomTheme.getColors(c0Var2, i11).m709getOnActionContrastWhite0d7_KjU(), c0Var3, i14 | (i15 << 12), 0), null, androidx.compose.runtime.internal.w.e(2001037145, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$VoiceNotesComposer$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                    invoke(c0Var4, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var4, int i16) {
                    if ((i16 & 11) == 2 && c0Var4.d()) {
                        c0Var4.u();
                        return;
                    }
                    VoiceTranscriptionState voiceTranscriptionState2 = voiceTranscriptionState;
                    ni.o(u0.e.c(voiceTranscriptionState2 instanceof VoiceTranscriptionState.Recording ? io.intercom.android.sdk.ui.R.drawable.intercom_ic_stop : R.drawable.intercom_ic_up_arrow, c0Var4, 0), null, i6.w(androidx.compose.ui.a0.E, voiceTranscriptionState2 instanceof VoiceTranscriptionState.Recording ? androidx.compose.ui.unit.h.r(16) : androidx.compose.ui.unit.h.r(24)), 0L, c0Var4, 56, 8);
                }
            }, c0Var3, i12), c0Var3, ((i10 >> 12) & 14) | 1572912, 40);
            c0Var3.o();
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.i1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MessageComposerKt.VoiceNotesComposer_cf5BqRc$lambda$37(voiceTranscriptionState, z0Var, j10, function0, function1, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        c0Var2.E(1107214474);
        intercomTheme = intercomTheme2;
        i11 = i13;
        SoundWaveVisualizationKt.m269SoundWaveVisualizationFNF3uiM(z0Var, null, intercomTheme.getColors(c0Var2, i11).m699getDescriptionText0d7_KjU(), c0Var2, 8, 2);
        c0Var2.A();
        i12 = 54;
        c0Var2.o();
        androidx.compose.runtime.c0 c0Var4 = c0Var2;
        ei.t(function1, i6.w(aVar, androidx.compose.ui.unit.h.r(f11)), z10, null, khVar.y(intercomTheme.getColors(c0Var2, i11).m685getActionContrastWhite0d7_KjU(), intercomTheme.getColors(c0Var2, i11).m709getOnActionContrastWhite0d7_KjU(), j10, intercomTheme.getColors(c0Var2, i11).m709getOnActionContrastWhite0d7_KjU(), c0Var4, i14 | (i15 << 12), 0), null, androidx.compose.runtime.internal.w.e(2001037145, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$VoiceNotesComposer$1$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var5, Integer num) {
                invoke(c0Var5, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.runtime.c0 c0Var5, int i16) {
                if ((i16 & 11) == 2 && c0Var5.d()) {
                    c0Var5.u();
                    return;
                }
                VoiceTranscriptionState voiceTranscriptionState2 = voiceTranscriptionState;
                ni.o(u0.e.c(voiceTranscriptionState2 instanceof VoiceTranscriptionState.Recording ? io.intercom.android.sdk.ui.R.drawable.intercom_ic_stop : R.drawable.intercom_ic_up_arrow, c0Var5, 0), null, i6.w(androidx.compose.ui.a0.E, voiceTranscriptionState2 instanceof VoiceTranscriptionState.Recording ? androidx.compose.ui.unit.h.r(16) : androidx.compose.ui.unit.h.r(24)), 0L, c0Var5, 56, 8);
            }
        }, c0Var4, i12), c0Var4, ((i10 >> 12) & 14) | 1572912, 40);
        c0Var4.o();
        s5VarT = c0Var4.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.i1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageComposerKt.VoiceNotesComposer_cf5BqRc$lambda$37(voiceTranscriptionState, z0Var, j10, function0, function1, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void VoiceNotesComposerPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1575191241);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m252getLambda6$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.s1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageComposerKt.VoiceNotesComposerPreview$lambda$41(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VoiceNotesComposerPreview$lambda$41(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        VoiceNotesComposerPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VoiceNotesComposer_cf5BqRc$lambda$37(VoiceTranscriptionState state, kotlinx.coroutines.flow.z0 amplitudeLevel, long j10, Function0 onCloseClick, Function0 onStopRecordingClick, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(amplitudeLevel, "$amplitudeLevel");
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        Intrinsics.checkNotNullParameter(onStopRecordingClick, "$onStopRecordingClick");
        m267VoiceNotesComposercf5BqRc(state, amplitudeLevel, j10, onCloseClick, onStopRecordingClick, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final float getComposerHalfSize() {
        return ComposerHalfSize;
    }

    public static final float getComposerMinSize() {
        return ComposerMinSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldShowButtons(String str, List<? extends BottomBarUiState.BottomBarButton> list) {
        return str.length() == 0 && !list.isEmpty();
    }
}
