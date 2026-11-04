package io.intercom.android.sdk.m5.conversation.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u7;
import androidx.compose.material3.f10;
import androidx.compose.material3.u10;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.z3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.PushNotificationsBannerState;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.states.TeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.TeammateSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt;
import io.intercom.android.sdk.m5.home.ui.helpers.InMemoryWebViewCacheKt;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.PreviewMediaContract;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1059:1\n75#2:1060\n75#2:1085\n75#2:1100\n75#2:1107\n75#2:1109\n75#2:1110\n75#2:1130\n1282#3,6:1061\n1282#3,6:1067\n1282#3,6:1073\n1282#3,6:1079\n1282#3,3:1093\n1285#3,3:1097\n1282#3,6:1101\n1282#3,6:1111\n1282#3,6:1117\n607#4:1086\n604#4,6:1087\n605#5:1096\n1#6:1108\n967#7,7:1123\n1863#7,2:1145\n52#8:1131\n113#9:1132\n152#9:1133\n113#9:1148\n113#9:1149\n113#9:1150\n85#10:1134\n117#10,2:1135\n85#10:1137\n117#10,2:1138\n85#10:1147\n66#11,5:1140\n*S KotlinDebug\n*F\n+ 1 ConversationScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationScreenKt\n*L\n158#1:1060\n442#1:1085\n445#1:1100\n489#1:1107\n491#1:1109\n492#1:1110\n912#1:1130\n159#1:1061,6\n227#1:1067,6\n337#1:1073,6\n403#1:1079,6\n443#1:1093,3\n443#1:1097,3\n453#1:1101,6\n497#1:1111,6\n524#1:1117,6\n443#1:1086\n443#1:1087,6\n443#1:1096\n895#1:1123,7\n285#1:1145,2\n918#1:1131\n918#1:1132\n918#1:1133\n905#1:1148\n906#1:1149\n907#1:1150\n160#1:1134\n160#1:1135,2\n162#1:1137\n162#1:1138,2\n446#1:1147\n213#1:1140,5\n*E\n"})
public final class ConversationScreenKt {
    private static final float JumpToBottomNewMessagesTopOffset = androidx.compose.ui.unit.h.r(180);
    private static final float JumpToBottomScrollOffset = androidx.compose.ui.unit.h.r(80);
    private static final float LazyListJumpToBottomScrollOffset = androidx.compose.ui.unit.h.r(40);

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$11, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$11", f = "ConversationScreen.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass11 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ConversationUiState $conversationUiState;
        final /* synthetic */ ConversationViewModel $conversationViewModel;
        final /* synthetic */ f10 $snackbarHostState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass11(ConversationUiState conversationUiState, f10 f10Var, Context context, ConversationViewModel conversationViewModel, kotlin.coroutines.d<? super AnonymousClass11> dVar) {
            super(2, dVar);
            this.$conversationUiState = conversationUiState;
            this.$snackbarHostState = f10Var;
            this.$context = context;
            this.$conversationViewModel = conversationViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ConversationViewModel conversationViewModel) {
            conversationViewModel.onNetworkMessageDismissed();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass11(this.$conversationUiState, this.$snackbarHostState, this.$context, this.$conversationViewModel, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                NetworkState networkState = ((ConversationUiState.Content) this.$conversationUiState).getNetworkState();
                f10 f10Var = this.$snackbarHostState;
                Context context = this.$context;
                final ConversationViewModel conversationViewModel = this.$conversationViewModel;
                Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.z1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationScreenKt.AnonymousClass11.invokeSuspend$lambda$0(conversationViewModel);
                    }
                };
                this.label = 1;
                if (ConversationScreenKt.showNetworkMessage(networkState, f10Var, context, function0, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass11) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$12, reason: invalid class name */
    /* synthetic */ class AnonymousClass12 extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        AnonymousClass12(Object obj) {
            super(0, obj, ConversationViewModel.class, "startVoiceRecording", "startVoiceRecording()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ConversationViewModel) this.receiver).startVoiceRecording();
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$13, reason: invalid class name */
    /* synthetic */ class AnonymousClass13 extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        AnonymousClass13(Object obj) {
            super(0, obj, ConversationViewModel.class, "stopVoiceRecordingAndTranscribe", "stopVoiceRecordingAndTranscribe()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ConversationViewModel) this.receiver).stopVoiceRecordingAndTranscribe();
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$14, reason: invalid class name */
    /* synthetic */ class AnonymousClass14 extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        AnonymousClass14(Object obj) {
            super(0, obj, ConversationViewModel.class, "cancelVoiceRecording", "cancelVoiceRecording()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ConversationViewModel) this.receiver).cancelVoiceRecording();
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$8, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$8", f = "ConversationScreen.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass8 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ConversationViewModel $conversationViewModel;
        final /* synthetic */ n3<Pair<Boolean, String>> $showUploadSizeLimitDialog$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(ConversationViewModel conversationViewModel, Context context, n3<Pair<Boolean, String>> n3Var, kotlin.coroutines.d<? super AnonymousClass8> dVar) {
            super(2, dVar);
            this.$conversationViewModel = conversationViewModel;
            this.$context = context;
            this.$showUploadSizeLimitDialog$delegate = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass8(this.$conversationViewModel, this.$context, this.$showUploadSizeLimitDialog$delegate, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.o0<ConversationUiEffect> uiEffect = this.$conversationViewModel.getUiEffect();
                final Context context = this.$context;
                final n3<Pair<Boolean, String>> n3Var = this.$showUploadSizeLimitDialog$delegate;
                kotlinx.coroutines.flow.j<? super ConversationUiEffect> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt.ConversationScreen.8.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((ConversationUiEffect) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(ConversationUiEffect conversationUiEffect, kotlin.coroutines.d<? super Unit> dVar) {
                        androidx.activity.l lVar;
                        if (conversationUiEffect instanceof ConversationUiEffect.ShowUploadSizeLimitDialog) {
                            ConversationScreenKt.ConversationScreen$lambda$10(n3Var, TuplesKt.to(kotlin.coroutines.jvm.internal.b.a(true), ((ConversationUiEffect.ShowUploadSizeLimitDialog) conversationUiEffect).getUploadSizeLimitMB()));
                        } else {
                            if (conversationUiEffect instanceof ConversationUiEffect.LockScreenOrientation) {
                                Context context2 = context;
                                lVar = context2 instanceof androidx.activity.l ? (androidx.activity.l) context2 : null;
                                if (lVar != null) {
                                    lVar.setRequestedOrientation(14);
                                }
                            } else {
                                if (!(conversationUiEffect instanceof ConversationUiEffect.UnlockScreenOrientation)) {
                                    throw new kotlin.k0();
                                }
                                Context context3 = context;
                                lVar = context3 instanceof androidx.activity.l ? (androidx.activity.l) context3 : null;
                                if (lVar != null) {
                                    lVar.setRequestedOrientation(-1);
                                }
                            }
                        }
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (uiEffect.collect(jVar, this) == objL) {
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
            return ((AnonymousClass8) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$35, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nConversationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationScreenKt$ConversationScreenContent$35\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1059:1\n87#2:1060\n84#2,9:1061\n94#2:1102\n80#3,6:1070\n87#3,3:1085\n90#3,2:1094\n94#3:1101\n391#4,9:1076\n400#4:1096\n401#4,2:1099\n4360#5,6:1088\n113#6:1097\n113#6:1098\n*S KotlinDebug\n*F\n+ 1 ConversationScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationScreenKt$ConversationScreenContent$35\n*L\n560#1:1060\n560#1:1061,9\n560#1:1102\n560#1:1070,6\n560#1:1085,3\n560#1:1094,2\n560#1:1101\n560#1:1076,9\n560#1:1096\n560#1:1099,2\n560#1:1088,6\n569#1:1097\n586#1:1098\n*E\n"})
    static final class AnonymousClass35 implements pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ kotlinx.coroutines.s0 $coroutineScope;
        final /* synthetic */ Function1<Block, Unit> $onGifClick;
        final /* synthetic */ Function1<String, Unit> $onGifSearchQueryChange;
        final /* synthetic */ Function1<List<? extends Uri>, Unit> $onMediaSelected;
        final /* synthetic */ n3<Boolean> $openBottomSheet;
        final /* synthetic */ Function1<String, Unit> $trackClickedInput;
        final /* synthetic */ ConversationUiState $uiState;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass35(ConversationUiState conversationUiState, Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, Function1<? super List<? extends Uri>, Unit> function3, kotlinx.coroutines.s0 s0Var, n3<Boolean> n3Var, Function1<? super Block, Unit> function4) {
            this.$uiState = conversationUiState;
            this.$trackClickedInput = function1;
            this.$onGifSearchQueryChange = function2;
            this.$onMediaSelected = function3;
            this.$coroutineScope = s0Var;
            this.$openBottomSheet = n3Var;
            this.$onGifClick = function4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$0(Function1 function1, kotlinx.coroutines.s0 coroutineScope, n3 openBottomSheet, List it) {
            Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
            Intrinsics.checkNotNullParameter(openBottomSheet, "$openBottomSheet");
            Intrinsics.checkNotNullParameter(it, "it");
            ConversationScreenKt.ConversationScreenContent$hideBottomSheet(coroutineScope, openBottomSheet);
            function1.invoke(it);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$1(kotlinx.coroutines.s0 coroutineScope, n3 openBottomSheet) {
            Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
            Intrinsics.checkNotNullParameter(openBottomSheet, "$openBottomSheet");
            ConversationScreenKt.ConversationScreenContent$hideBottomSheet(coroutineScope, openBottomSheet);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function1 function1, kotlinx.coroutines.s0 coroutineScope, n3 openBottomSheet, Block it) {
            Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
            Intrinsics.checkNotNullParameter(openBottomSheet, "$openBottomSheet");
            Intrinsics.checkNotNullParameter(it, "it");
            ConversationScreenKt.ConversationScreenContent$hideBottomSheet(coroutineScope, openBottomSheet);
            function1.invoke(it);
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(m0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.layout.m0 ModalBottomSheet, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.runtime.c0 c0Var2 = c0Var;
            Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
            if ((i10 & 81) == 16 && c0Var2.d()) {
                c0Var2.u();
                return;
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarE = u7.e(aVar);
            ConversationUiState conversationUiState = this.$uiState;
            Function1<String, Unit> function1 = this.$trackClickedInput;
            Function1<String, Unit> function2 = this.$onGifSearchQueryChange;
            final Function1<List<? extends Uri>, Unit> function3 = this.$onMediaSelected;
            final kotlinx.coroutines.s0 s0Var = this.$coroutineScope;
            final n3<Boolean> n3Var = this.$openBottomSheet;
            final Function1<Block, Unit> function4 = this.$onGifClick;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var2, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var2.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarE);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            c0Var2.E(-554919247);
            if (conversationUiState instanceof ConversationUiState.Content) {
                ConversationUiState.Content content = (ConversationUiState.Content) conversationUiState;
                BottomSheetState bottomSheetState = content.getBottomSheetState();
                if (bottomSheetState instanceof BottomSheetState.MediaInput) {
                    c0Var2.E(-22527620);
                    MediaInputSheetContentKt.MediaInputSheetContent(d5.r(i6.F(aVar, null, false, 3, null), androidx.compose.ui.unit.h.r(16)), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.c2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationScreenKt.AnonymousClass35.invoke$lambda$3$lambda$0(function3, s0Var, n3Var, (List) obj);
                        }
                    }, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.d2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationScreenKt.AnonymousClass35.invoke$lambda$3$lambda$1(s0Var, n3Var);
                        }
                    }, function1, content.getBottomBarUiState().getInputTypeState(), c0Var, 32774, 0);
                    c0Var2 = c0Var;
                    c0Var2.A();
                } else if (bottomSheetState instanceof BottomSheetState.TeammatePresence) {
                    c0Var2.E(-21710491);
                    TeammateSheetContentKt.TeammateSheetContent(d5.r(i6.F(aVar, null, false, 3, null), androidx.compose.ui.unit.h.r(16)), content.getTeamPresenceState().getSpecialNotice(), content.getTeamPresenceState().getExpandedTeamPresenceState(), c0Var2, 518, 0);
                    c0Var2.A();
                } else if (bottomSheetState instanceof BottomSheetState.GifSearch) {
                    c0Var2.E(-21184762);
                    GifGridKt.GifGrid(i6.d(aVar, 0.0f, 1, null), ((BottomSheetState.GifSearch) content.getBottomSheetState()).getGifs(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.e2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationScreenKt.AnonymousClass35.invoke$lambda$3$lambda$2(function4, s0Var, n3Var, (Block) obj);
                        }
                    }, function2, c0Var2, 70, 0);
                    c0Var2 = c0Var2;
                    c0Var2.A();
                } else if (bottomSheetState instanceof BottomSheetState.InlineSources) {
                    c0Var2.E(-20629862);
                    InlineSourcesSheetContentKt.InlineSourcesSheetContent(((BottomSheetState.InlineSources) content.getBottomSheetState()).getSelectedSources(), ((BottomSheetState.InlineSources) content.getBottomSheetState()).getSources(), i6.F(aVar, null, false, 3, null), c0Var2, 456, 0);
                    c0Var2.A();
                } else {
                    if (!Intrinsics.areEqual(bottomSheetState, BottomSheetState.Empty.INSTANCE)) {
                        c0Var2.E(-554917219);
                        c0Var2.A();
                        throw new kotlin.k0();
                    }
                    c0Var2.E(-20236782);
                    c0Var2.A();
                    ConversationScreenKt.ConversationScreenContent$hideBottomSheet(s0Var, n3Var);
                }
            }
            c0Var2.A();
            c0Var2.o();
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$showNetworkMessage$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt", f = "ConversationScreen.kt", i = {1}, l = {379, 387}, m = "showNetworkMessage", n = {"onDismiss"}, s = {"L$0"})
    static final class C28041 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C28041(kotlin.coroutines.d<? super C28041> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenKt.showNetworkMessage(null, null, null, null, this);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ConversationScreen(@NotNull final ConversationViewModel conversationViewModel, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function1<? super String, Unit> function3, @Nullable Function1<? super TicketType, Unit> function4, @Nullable Function1<? super HeaderMenuItem, Unit> function5, @Nullable Function1<? super String, Unit> function6, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "conversationViewModel");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1550678767);
        androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Function0<Unit> function7 = (i11 & 4) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function0;
        Function0<Unit> function8 = (i11 & 8) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function1;
        Function0<Unit> function9 = (i11 & 16) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function2;
        Function1<? super String, Unit> function10 = (i11 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$3((String) obj);
            }
        } : function3;
        Function1<? super TicketType, Unit> function11 = (i11 & 64) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$4((TicketType) obj);
            }
        } : function4;
        final Function1<? super HeaderMenuItem, Unit> function12 = (i11 & 128) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$5((HeaderMenuItem) obj);
            }
        } : function5;
        final Function1<? super String, Unit> function13 = (i11 & 256) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$6((String) obj);
            }
        } : function6;
        final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        c0VarR.E(1223584784);
        Object objI0 = c0VarR.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = new f10();
            c0VarR.Y(objI0);
        }
        f10 f10Var = (f10) objI0;
        c0VarR.A();
        final n3 n3Var = (n3) androidx.compose.runtime.saveable.i.k(new Object[0], new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationScreenKt.ConversationScreen$lambda$8();
            }
        }, c0VarR, 56);
        final Function0<Unit> function14 = function8;
        final n3 n3Var2 = (n3) androidx.compose.runtime.saveable.i.k(new Object[0], new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationScreenKt.ConversationScreen$lambda$11();
            }
        }, c0VarR, 56);
        final Function0<Unit> function15 = function9;
        final androidx.activity.compose.k kVarA = androidx.activity.compose.d.a(new PreviewMediaContract(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$15(conversationViewModel, n3Var2, (List) obj);
            }
        }, c0VarR, PreviewMediaContract.$stable);
        c0VarR.E(1223606009);
        androidx.compose.foundation.lazy.j1 j1VarF = getLazyMessageListEnabled() ? androidx.compose.foundation.lazy.o1.f(Integer.MAX_VALUE, 0, c0VarR, 6, 2) : null;
        c0VarR.A();
        androidx.compose.runtime.b2.i(null, new AnonymousClass8(conversationViewModel, context, n3Var, null), c0VarR, 70);
        androidx.compose.runtime.b2.d(null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$17((androidx.compose.runtime.v1) obj);
            }
        }, c0VarR, 54);
        c0VarR.E(1223661203);
        if (ConversationScreen$lambda$9(n3Var).getFirst().booleanValue()) {
            String string = Phrase.from(context, R.string.intercom_file_too_big).put("limit", ConversationScreen$lambda$9(n3Var).getSecond()).format().toString();
            String strD = u0.i.d(R.string.intercom_failed_to_send, c0VarR, 0);
            c0VarR.E(1223673400);
            boolean zD = c0VarR.D(n3Var);
            Object objI1 = c0VarR.i0();
            if (zD || objI1 == aVar.a()) {
                objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.m0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationScreenKt.ConversationScreen$lambda$19$lambda$18(n3Var);
                    }
                };
                c0VarR.Y(objI1);
            }
            c0VarR.A();
            UploadSizeLimitDialogKt.UploadSizeLimitDialog(strD, string, (Function0) objI1, c0VarR, 0, 0);
        }
        c0VarR.A();
        ConversationUiState conversationUiState = (ConversationUiState) w6.b(conversationViewModel.getUiState(), null, c0VarR, 8, 1).getValue();
        c0VarR.E(1223680144);
        boolean z10 = conversationUiState instanceof ConversationUiState.Content;
        if (z10) {
            androidx.compose.runtime.b2.i(((ConversationUiState.Content) conversationUiState).getNetworkState(), new AnonymousClass11(conversationUiState, f10Var, context, conversationViewModel, null), c0VarR, 64);
        }
        c0VarR.A();
        kotlinx.coroutines.flow.o0<ComposerUiEffect> composerUiEffect = conversationViewModel.getComposerUiEffect();
        VoiceTranscriptionState voiceTranscriptionState = z10 ? ((ConversationUiState.Content) conversationUiState).getVoiceTranscriptionState() : VoiceTranscriptionState.Idle.INSTANCE;
        kotlinx.coroutines.flow.z0<Float> amplitudeLevel = conversationViewModel.getAmplitudeLevel();
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(conversationViewModel);
        AnonymousClass13 anonymousClass13 = new AnonymousClass13(conversationViewModel);
        AnonymousClass14 anonymousClass14 = new AnonymousClass14(conversationViewModel);
        Function1 function16 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$20(conversationViewModel, (ReplySuggestion) obj);
            }
        };
        Function1 function17 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$21(conversationViewModel, (ReplyOption) obj);
            }
        };
        Function1 function18 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.t1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$22(conversationViewModel, context, (String) obj);
            }
        };
        Function1 function19 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.w1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$23(conversationViewModel, (ComposerInputType) obj);
            }
        };
        Function1 function20 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$24(kVarA, n3Var2, (Block) obj);
            }
        };
        Function1 function21 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$25(conversationViewModel, (String) obj);
            }
        };
        Function0 function22 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationScreenKt.ConversationScreen$lambda$26(conversationViewModel);
            }
        };
        Function1 function23 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$29(context, conversationViewModel, (List) obj);
            }
        };
        Function0 function24 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationScreenKt.ConversationScreen$lambda$30(conversationViewModel);
            }
        };
        Function0 function25 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationScreenKt.ConversationScreen$lambda$31(conversationViewModel);
            }
        };
        Function0 function26 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationScreenKt.ConversationScreen$lambda$32(conversationViewModel);
            }
        };
        Function1 function27 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$33(conversationViewModel, (Part) obj);
            }
        };
        Function1 function28 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$34(conversationViewModel, (PendingMessage.FailedImageUploadData) obj);
            }
        };
        Function0 function29 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationScreenKt.ConversationScreen$lambda$35(conversationViewModel);
            }
        };
        Function1 function30 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$36(conversationViewModel, (AttributeData) obj);
            }
        };
        Function1 function31 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$37(conversationViewModel, (String) obj);
            }
        };
        Function1 function32 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$38(conversationViewModel, (MetricData) obj);
            }
        };
        Function1 function33 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$39(conversationViewModel, (ConversationScrolledState) obj);
            }
        };
        Function2 function34 = new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.v
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ConversationScreenKt.ConversationScreen$lambda$40(conversationViewModel, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        };
        c0VarR.E(1223803945);
        boolean z11 = (((i10 & 234881024) ^ 100663296) > 67108864 && c0VarR.D(function13)) || (i10 & 100663296) == 67108864;
        Object objI2 = c0VarR.i0();
        if (z11 || objI2 == aVar.a()) {
            objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ConversationScreenKt.ConversationScreen$lambda$42$lambda$41(function13, (String) obj);
                }
            };
            c0VarR.Y(objI2);
        }
        c0VarR.A();
        ConversationScreenContent(a0Var2, conversationUiState, f10Var, function16, function17, function18, function19, function20, function21, function22, function23, function24, function25, function7, function26, function14, function27, function28, function29, function30, function15, function10, function12, function11, function31, function32, function33, function34, (Function1) objI2, j1VarF, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationScreenKt.ConversationScreen$lambda$43(conversationViewModel);
            }
        }, new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ConversationScreenKt.ConversationScreen$lambda$44(conversationViewModel, (List) obj, (List) obj2);
            }
        }, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationScreenKt.ConversationScreen$lambda$45(conversationViewModel);
            }
        }, composerUiEffect, new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.a0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ConversationScreenKt.ConversationScreen$lambda$46(conversationViewModel, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        }, voiceTranscriptionState, amplitudeLevel, anonymousClass12, anonymousClass13, anonymousClass14, c0VarR, ((i10 >> 3) & 14) | a5.S0, ((i10 << 3) & 7168) | ((i10 << 6) & 458752), ((i10 >> 12) & okhttp3.internal.ws.g.f334652s) | ((i10 >> 15) & 896) | ((i10 >> 9) & 7168), 2101248, 0, 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            final Function0<Unit> function35 = function7;
            final Function1<? super String, Unit> function36 = function10;
            final Function1<? super TicketType, Unit> function37 = function11;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationScreenKt.ConversationScreen$lambda$47(conversationViewModel, a0Var3, function35, function14, function15, function36, function37, function12, function13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean ConversationScreen$arePushNotificationsEnabled(Context context) {
        if (Build.VERSION.SDK_INT >= 33 && androidx.core.content.d.a(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConversationScreen$lambda$10(n3<Pair<Boolean, String>> n3Var, Pair<Boolean, String> pair) {
        n3Var.setValue(pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 ConversationScreen$lambda$11() {
        return d7.g(null, null, 2, null);
    }

    private static final MediaData.Gif ConversationScreen$lambda$12(n3<MediaData.Gif> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$15(ConversationViewModel conversationViewModel, n3 selectedGif$delegate, List it) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(selectedGif$delegate, "$selectedGif$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        if (((Uri) CollectionsKt.firstOrNull(it)) != null && ConversationScreen$lambda$12(selectedGif$delegate) != null) {
            MediaData.Gif gifConversationScreen$lambda$12 = ConversationScreen$lambda$12(selectedGif$delegate);
            Intrinsics.checkNotNull(gifConversationScreen$lambda$12);
            conversationViewModel.sendAfterPreview(gifConversationScreen$lambda$12);
            selectedGif$delegate.setValue(null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 ConversationScreen$lambda$17(androidx.compose.runtime.v1 DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new androidx.compose.runtime.u1() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$lambda$17$$inlined$onDispose$1
            @Override // androidx.compose.runtime.u1
            public void dispose() {
                InMemoryWebViewCacheKt.clearWebViewCache();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$19$lambda$18(n3 showUploadSizeLimitDialog$delegate) {
        Intrinsics.checkNotNullParameter(showUploadSizeLimitDialog$delegate, "$showUploadSizeLimitDialog$delegate");
        showUploadSizeLimitDialog$delegate.setValue(TuplesKt.to(Boolean.FALSE, com.facebook.appevents.p.f99189d0));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$20(ConversationViewModel conversationViewModel, ReplySuggestion it) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        conversationViewModel.onSuggestionClick(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$21(ConversationViewModel conversationViewModel, ReplyOption it) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        conversationViewModel.onReplyOptionClicked(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$22(ConversationViewModel conversationViewModel, Context context, String message) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(message, "message");
        conversationViewModel.sendMessage(message, ConversationScreen$arePushNotificationsEnabled(context));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$23(ConversationViewModel conversationViewModel, ComposerInputType it) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        conversationViewModel.onInputChange(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$24(androidx.activity.compose.k gifPreviewLauncher, n3 selectedGif$delegate, Block it) {
        Intrinsics.checkNotNullParameter(gifPreviewLauncher, "$gifPreviewLauncher");
        Intrinsics.checkNotNullParameter(selectedGif$delegate, "$selectedGif$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        int width = it.getWidth();
        int height = it.getHeight();
        String attribution = it.getAttribution();
        Intrinsics.checkNotNullExpressionValue(attribution, "getAttribution(...)");
        String url = it.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        selectedGif$delegate.setValue(new MediaData.Gif(width, height, url, attribution));
        String url2 = it.getUrl();
        Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
        gifPreviewLauncher.b(new IntercomPreviewArgs(CollectionsKt.listOf(new IntercomPreviewFile.NetworkFile(url2, "image/gif")), null, null, true, null, 22, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$25(ConversationViewModel conversationViewModel, String it) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        conversationViewModel.onGifSearchQueryChange(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$26(ConversationViewModel conversationViewModel) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        conversationViewModel.loadGifs();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$29(Context context, ConversationViewModel conversationViewModel, List uris) throws IOException {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(uris, "uris");
        Iterator it = uris.iterator();
        while (it.hasNext()) {
            MediaData.Media mediaData = URIExtensionsKt.getMediaData((Uri) it.next(), context, false);
            if (mediaData != null) {
                conversationViewModel.sendAfterPreview(mediaData);
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$30(ConversationViewModel conversationViewModel) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        conversationViewModel.updateBottomSheet(BottomSheetState.MediaInput.INSTANCE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$31(ConversationViewModel conversationViewModel) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        conversationViewModel.updateBottomSheet(BottomSheetState.TeammatePresence.INSTANCE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$32(ConversationViewModel conversationViewModel) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        conversationViewModel.onRetryClick();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$33(ConversationViewModel conversationViewModel, Part it) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        conversationViewModel.onRetryMessageClicked(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$34(ConversationViewModel conversationViewModel, PendingMessage.FailedImageUploadData it) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        conversationViewModel.onRetryMediaClicked(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$35(ConversationViewModel conversationViewModel) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        conversationViewModel.onTyping();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$36(ConversationViewModel conversationViewModel, AttributeData it) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        conversationViewModel.onSubmitAttribute(it.getAttribute(), it.getPartId());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$37(ConversationViewModel conversationViewModel, String it) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        conversationViewModel.trackClickedInput(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$38(ConversationViewModel conversationViewModel, MetricData it) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        conversationViewModel.trackMetric(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$39(ConversationViewModel conversationViewModel, ConversationScrolledState conversationScrollState) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(conversationScrollState, "conversationScrollState");
        conversationViewModel.onConversationScrolled(conversationScrollState);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$4(TicketType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$40(ConversationViewModel conversationViewModel, int i10, int i11) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        conversationViewModel.onJumpToBottomButtonClicked(i10, i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$42$lambda$41(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$43(ConversationViewModel conversationViewModel) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        conversationViewModel.onPrivacyNoticeDismissed();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$44(ConversationViewModel conversationViewModel, List selectedSources, List sources) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(selectedSources, "selectedSources");
        Intrinsics.checkNotNullParameter(sources, "sources");
        conversationViewModel.updateBottomSheet(new BottomSheetState.InlineSources(selectedSources, sources));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$45(ConversationViewModel conversationViewModel) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        conversationViewModel.onReportAiAnswer();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$46(ConversationViewModel conversationViewModel, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        conversationViewModel.updatePushNotificationsBanner(z10, z11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$47(ConversationViewModel conversationViewModel, androidx.compose.ui.a0 a0Var, Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        ConversationScreen(conversationViewModel, a0Var, function0, function1, function2, function3, function4, function5, function6, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$5(HeaderMenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$6(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 ConversationScreen$lambda$8() {
        return d7.g(TuplesKt.to(Boolean.FALSE, com.facebook.appevents.p.f99189d0), null, 2, null);
    }

    private static final Pair<Boolean, String> ConversationScreen$lambda$9(n3<Pair<Boolean, String>> n3Var) {
        return n3Var.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0269  */
    /* JADX WARN: Code duplicated, block: B:171:0x026e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0274  */
    /* JADX WARN: Code duplicated, block: B:175:0x027a  */
    /* JADX WARN: Code duplicated, block: B:176:0x027d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0286  */
    /* JADX WARN: Code duplicated, block: B:180:0x028f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0295  */
    /* JADX WARN: Code duplicated, block: B:184:0x029b  */
    /* JADX WARN: Code duplicated, block: B:185:0x029e  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:190:0x02af  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:194:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:200:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:202:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:205:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:209:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:210:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:212:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:214:0x0305  */
    /* JADX WARN: Code duplicated, block: B:215:0x030a  */
    /* JADX WARN: Code duplicated, block: B:219:0x0312  */
    /* JADX WARN: Code duplicated, block: B:221:0x0317  */
    /* JADX WARN: Code duplicated, block: B:223:0x031d  */
    /* JADX WARN: Code duplicated, block: B:225:0x0323  */
    /* JADX WARN: Code duplicated, block: B:226:0x0326  */
    /* JADX WARN: Code duplicated, block: B:228:0x032b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0331  */
    /* JADX WARN: Code duplicated, block: B:232:0x0334  */
    /* JADX WARN: Code duplicated, block: B:234:0x033a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0344  */
    /* JADX WARN: Code duplicated, block: B:237:0x0347  */
    /* JADX WARN: Code duplicated, block: B:240:0x034e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0355  */
    /* JADX WARN: Code duplicated, block: B:244:0x0358  */
    /* JADX WARN: Code duplicated, block: B:246:0x035e  */
    /* JADX WARN: Code duplicated, block: B:248:0x0366  */
    /* JADX WARN: Code duplicated, block: B:250:0x036d  */
    /* JADX WARN: Code duplicated, block: B:253:0x0379  */
    /* JADX WARN: Code duplicated, block: B:255:0x0380  */
    /* JADX WARN: Code duplicated, block: B:257:0x0384  */
    /* JADX WARN: Code duplicated, block: B:259:0x0390  */
    /* JADX WARN: Code duplicated, block: B:260:0x0393  */
    /* JADX WARN: Code duplicated, block: B:264:0x039b  */
    /* JADX WARN: Code duplicated, block: B:265:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:267:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:269:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:270:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:274:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:276:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:278:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:280:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:281:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:284:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:286:0x03db  */
    /* JADX WARN: Code duplicated, block: B:288:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:290:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:291:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:294:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:295:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:297:0x0404  */
    /* JADX WARN: Code duplicated, block: B:299:0x040a  */
    /* JADX WARN: Code duplicated, block: B:300:0x040d  */
    /* JADX WARN: Code duplicated, block: B:304:0x0415  */
    /* JADX WARN: Code duplicated, block: B:305:0x041e  */
    /* JADX WARN: Code duplicated, block: B:307:0x0426  */
    /* JADX WARN: Code duplicated, block: B:309:0x042c  */
    /* JADX WARN: Code duplicated, block: B:310:0x042f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0439  */
    /* JADX WARN: Code duplicated, block: B:315:0x0440  */
    /* JADX WARN: Code duplicated, block: B:317:0x0446  */
    /* JADX WARN: Code duplicated, block: B:319:0x044c  */
    /* JADX WARN: Code duplicated, block: B:320:0x044f  */
    /* JADX WARN: Code duplicated, block: B:322:0x0454  */
    /* JADX WARN: Code duplicated, block: B:325:0x045a  */
    /* JADX WARN: Code duplicated, block: B:327:0x045f  */
    /* JADX WARN: Code duplicated, block: B:329:0x0465  */
    /* JADX WARN: Code duplicated, block: B:331:0x046b  */
    /* JADX WARN: Code duplicated, block: B:335:0x0474  */
    /* JADX WARN: Code duplicated, block: B:336:0x0477  */
    /* JADX WARN: Code duplicated, block: B:338:0x047d  */
    /* JADX WARN: Code duplicated, block: B:340:0x0485  */
    /* JADX WARN: Code duplicated, block: B:343:0x048c  */
    /* JADX WARN: Code duplicated, block: B:346:0x0493  */
    /* JADX WARN: Code duplicated, block: B:349:0x0499  */
    /* JADX WARN: Code duplicated, block: B:351:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:353:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:355:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:359:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:362:0x04be  */
    /* JADX WARN: Code duplicated, block: B:363:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:365:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:367:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:371:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:373:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:375:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:377:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:381:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:383:0x0509  */
    /* JADX WARN: Code duplicated, block: B:385:0x050f  */
    /* JADX WARN: Code duplicated, block: B:387:0x051b  */
    /* JADX WARN: Code duplicated, block: B:388:0x051e  */
    /* JADX WARN: Code duplicated, block: B:392:0x0528  */
    /* JADX WARN: Code duplicated, block: B:404:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:406:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:413:0x0625 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:414:0x0627  */
    /* JADX WARN: Code duplicated, block: B:416:0x062d  */
    /* JADX WARN: Code duplicated, block: B:418:0x063f  */
    /* JADX WARN: Code duplicated, block: B:421:0x064f  */
    /* JADX WARN: Code duplicated, block: B:423:0x0657  */
    /* JADX WARN: Code duplicated, block: B:424:0x065d  */
    /* JADX WARN: Code duplicated, block: B:426:0x0663  */
    /* JADX WARN: Code duplicated, block: B:427:0x0669  */
    /* JADX WARN: Code duplicated, block: B:429:0x066f  */
    /* JADX WARN: Code duplicated, block: B:430:0x0675  */
    /* JADX WARN: Code duplicated, block: B:432:0x0679  */
    /* JADX WARN: Code duplicated, block: B:433:0x067f  */
    /* JADX WARN: Code duplicated, block: B:435:0x0683  */
    /* JADX WARN: Code duplicated, block: B:436:0x0689  */
    /* JADX WARN: Code duplicated, block: B:438:0x068d  */
    /* JADX WARN: Code duplicated, block: B:439:0x0693  */
    /* JADX WARN: Code duplicated, block: B:441:0x0697  */
    /* JADX WARN: Code duplicated, block: B:442:0x069d  */
    /* JADX WARN: Code duplicated, block: B:444:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:445:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:447:0x06af  */
    /* JADX WARN: Code duplicated, block: B:448:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:450:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:451:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:453:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:455:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:456:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:458:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:459:0x06de  */
    /* JADX WARN: Code duplicated, block: B:461:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:462:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:464:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:465:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:467:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:468:0x0700  */
    /* JADX WARN: Code duplicated, block: B:471:0x0708  */
    /* JADX WARN: Code duplicated, block: B:472:0x070e  */
    /* JADX WARN: Code duplicated, block: B:474:0x0712  */
    /* JADX WARN: Code duplicated, block: B:475:0x0718  */
    /* JADX WARN: Code duplicated, block: B:477:0x071e  */
    /* JADX WARN: Code duplicated, block: B:478:0x0724  */
    /* JADX WARN: Code duplicated, block: B:480:0x0728  */
    /* JADX WARN: Code duplicated, block: B:481:0x072e  */
    /* JADX WARN: Code duplicated, block: B:483:0x0732  */
    /* JADX WARN: Code duplicated, block: B:484:0x0738  */
    /* JADX WARN: Code duplicated, block: B:486:0x073e  */
    /* JADX WARN: Code duplicated, block: B:487:0x0744  */
    /* JADX WARN: Code duplicated, block: B:489:0x0748  */
    /* JADX WARN: Code duplicated, block: B:490:0x074b  */
    /* JADX WARN: Code duplicated, block: B:492:0x074f  */
    /* JADX WARN: Code duplicated, block: B:493:0x0755  */
    /* JADX WARN: Code duplicated, block: B:495:0x075b  */
    /* JADX WARN: Code duplicated, block: B:496:0x075e  */
    /* JADX WARN: Code duplicated, block: B:498:0x0762  */
    /* JADX WARN: Code duplicated, block: B:499:0x0768  */
    /* JADX WARN: Code duplicated, block: B:501:0x076e  */
    /* JADX WARN: Code duplicated, block: B:502:0x0771  */
    /* JADX WARN: Code duplicated, block: B:504:0x0777  */
    /* JADX WARN: Code duplicated, block: B:505:0x077d  */
    /* JADX WARN: Code duplicated, block: B:508:0x0785  */
    /* JADX WARN: Code duplicated, block: B:509:0x0788  */
    /* JADX WARN: Code duplicated, block: B:511:0x078e  */
    /* JADX WARN: Code duplicated, block: B:512:0x079e  */
    /* JADX WARN: Code duplicated, block: B:514:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:515:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:517:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:518:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:520:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:522:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:525:0x0858  */
    /* JADX WARN: Code duplicated, block: B:528:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:529:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:532:0x08af  */
    /* JADX WARN: Code duplicated, block: B:534:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:537:0x0911  */
    /* JADX WARN: Code duplicated, block: B:538:0x0913  */
    /* JADX WARN: Code duplicated, block: B:541:0x0919  */
    /* JADX WARN: Code duplicated, block: B:542:0x091b  */
    /* JADX WARN: Code duplicated, block: B:544:0x091e  */
    /* JADX WARN: Code duplicated, block: B:562:0x099f  */
    /* JADX WARN: Code duplicated, block: B:564:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:565:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:568:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:572:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:576:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:577:0x0ab3  */
    /* JADX WARN: Code duplicated, block: B:581:0x0bb3  */
    /* JADX WARN: Code duplicated, block: B:583:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:406:0x05c0
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ConversationScreenContent(@org.jetbrains.annotations.Nullable androidx.compose.ui.a0 r64, @org.jetbrains.annotations.NotNull final io.intercom.android.sdk.m5.conversation.states.ConversationUiState r65, @org.jetbrains.annotations.Nullable androidx.compose.material3.f10 r66, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.states.ReplySuggestion, kotlin.Unit> r67, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.models.ReplyOption, kotlin.Unit> r68, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r69, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType, kotlin.Unit> r70, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.blocks.lib.models.Block, kotlin.Unit> r71, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r72, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r73, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.util.List<? extends android.net.Uri>, kotlin.Unit> r74, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r75, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r76, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r77, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r78, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r79, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.models.Part, kotlin.Unit> r80, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.states.PendingMessage.FailedImageUploadData, kotlin.Unit> r81, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r82, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit> r83, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r84, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r85, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem, kotlin.Unit> r86, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.blocks.lib.models.TicketType, kotlin.Unit> r87, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r88, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.metrics.MetricData, kotlin.Unit> r89, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState, kotlin.Unit> r90, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r91, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r92, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.j1 r93, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r94, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.util.List<io.intercom.android.sdk.models.InlineSource>, ? super java.util.List<io.intercom.android.sdk.models.Source>, kotlin.Unit> r95, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r96, @org.jetbrains.annotations.Nullable kotlinx.coroutines.flow.o0<? extends io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect> r97, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> r98, @org.jetbrains.annotations.Nullable io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState r99, @org.jetbrains.annotations.Nullable kotlinx.coroutines.flow.z0<java.lang.Float> r100, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r101, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r102, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r103, @org.jetbrains.annotations.Nullable androidx.compose.runtime.c0 r104, final int r105, final int r106, final int r107, final int r108, final int r109, final int r110) {
        /*
            Method dump skipped, instruction units count: 3035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt.ConversationScreenContent(androidx.compose.ui.a0, io.intercom.android.sdk.m5.conversation.states.ConversationUiState, androidx.compose.material3.f10, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.foundation.lazy.j1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlinx.coroutines.flow.o0, kotlin.jvm.functions.Function2, io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState, kotlinx.coroutines.flow.z0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.c0, int, int, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConversationScreenContent$hideBottomSheet(kotlinx.coroutines.s0 s0Var, n3<Boolean> n3Var) {
        kotlinx.coroutines.k.f(s0Var, null, null, new ConversationScreenKt$ConversationScreenContent$hideBottomSheet$1(n3Var, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConversationScreenContent$hideKeyboardAndShowBottomSheet(z3 z3Var, kotlinx.coroutines.s0 s0Var, n3<Boolean> n3Var, n7<KeyboardState> n7Var) {
        if (z3Var != null) {
            z3Var.b();
        }
        kotlinx.coroutines.k.f(s0Var, null, null, new ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1(n3Var, n7Var, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$50(ReplySuggestion it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$51(ReplyOption it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$52(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$53(ComposerInputType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$54(Block it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$55(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$57(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$62(Part it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$63(PendingMessage.FailedImageUploadData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$65(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$67(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$68(HeaderMenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$69(TicketType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$70(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$71(MetricData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$72(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$75(boolean z10, boolean z11) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState ConversationScreenContent$lambda$79(n7<KeyboardState> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 ConversationScreenContent$lambda$80() {
        return d7.g(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$82$lambda$81(Function2 function2, boolean z10) {
        if (z10) {
            Boolean bool = Boolean.TRUE;
            function2.invoke(bool, bool);
        } else {
            function2.invoke(Boolean.TRUE, Boolean.FALSE);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$87(kotlinx.coroutines.s0 coroutineScope, n3 openBottomSheet) {
        Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
        Intrinsics.checkNotNullParameter(openBottomSheet, "$openBottomSheet");
        ConversationScreenContent$hideBottomSheet(coroutineScope, openBottomSheet);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContent$lambda$88(androidx.compose.ui.a0 a0Var, ConversationUiState uiState, f10 f10Var, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function0 function0, Function1 function7, Function0 function8, Function0 function9, Function0 function10, Function0 function11, Function0 onNewConversationClicked, Function1 function12, Function1 function13, Function0 function14, Function1 function15, Function0 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function20, Function1 function21, Function1 onConversationScrolled, Function2 onJumpToBottomButtonClicked, Function1 function22, androidx.compose.foundation.lazy.j1 j1Var, Function0 function23, Function2 function24, Function0 function25, kotlinx.coroutines.flow.o0 o0Var, Function2 function26, VoiceTranscriptionState voiceTranscriptionState, kotlinx.coroutines.flow.z0 z0Var, Function0 function27, Function0 function28, Function0 function29, int i10, int i11, int i12, int i13, int i14, int i15, androidx.compose.runtime.c0 c0Var, int i16) {
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "$onNewConversationClicked");
        Intrinsics.checkNotNullParameter(onConversationScrolled, "$onConversationScrolled");
        Intrinsics.checkNotNullParameter(onJumpToBottomButtonClicked, "$onJumpToBottomButtonClicked");
        ConversationScreenContent(a0Var, uiState, f10Var, function1, function2, function3, function4, function5, function6, function0, function7, function8, function9, function10, function11, onNewConversationClicked, function12, function13, function14, function15, function16, function17, function18, function19, function20, function21, onConversationScrolled, onJumpToBottomButtonClicked, function22, j1Var, function23, function24, function25, o0Var, function26, voiceTranscriptionState, z0Var, function27, function28, function29, c0Var, t4.a(i10 | 1), t4.a(i11), t4.a(i12), t4.a(i13), i14, i15);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConversationScreenContent$showBottomSheet(kotlinx.coroutines.s0 s0Var, n3<Boolean> n3Var) {
        int i10 = 4 | 0;
        kotlinx.coroutines.k.f(s0Var, null, null, new ConversationScreenKt$ConversationScreenContent$showBottomSheet$1(n3Var, null), 3, null);
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ConversationScreenContentPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1340943046);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            List listListOf = CollectionsKt.listOf(new Header.Expanded.Body(Header.Expanded.Style.CAPTION, "Active 15m ago", null));
            AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
            Avatar avatarCreate = Avatar.create("", "M");
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", androidx.exifinterface.media.a.S4);
            Intrinsics.checkNotNullExpressionValue(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "D");
            Intrinsics.checkNotNullExpressionValue(avatarCreate3, "create(...)");
            final ExpandedTeamPresenceState expandedTeamPresenceState = new ExpandedTeamPresenceState("Banana", listListOf, avatarType, CollectionsKt.listOf((Object[]) new AvatarWrapper[]{avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)}), CollectionsKt.emptyList(), CollectionsKt.emptyList(), false);
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(1448885348, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt.ConversationScreenContentPreview.1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContentPreview$1$1, reason: invalid class name and collision with other inner class name */
                static final class C20151 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
                    final /* synthetic */ ExpandedTeamPresenceState $expandedTeamPresenceState;

                    C20151(ExpandedTeamPresenceState expandedTeamPresenceState) {
                        this.$expandedTeamPresenceState = expandedTeamPresenceState;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1(ConversationScrolledState conversationScrolledState) {
                        Intrinsics.checkNotNullParameter(conversationScrolledState, "<unused var>");
                        return Unit.f312394a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2(int i10, int i11) {
                        return Unit.f312394a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                        invoke(c0Var, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
                        if ((i10 & 11) == 2 && c0Var.d()) {
                            c0Var.u();
                            return;
                        }
                        List listListOf = CollectionsKt.listOf((Object[]) new ContentRow[]{new ContentRow.TeamIntroRow("Our team is here to help you with any questions you have."), new ContentRow.SpecialNoticeRow("Our response times are slower than usual. We’re working hard to get to your message")});
                        BottomBarUiState bottomBarUiState = new BottomBarUiState(new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, null, null, 28, null), new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), InputTypeState.Companion.getDEFAULT(), null, 8, null);
                        StringProvider.ActualString actualString = new StringProvider.ActualString("Banana");
                        StringProvider.ActualString actualString2 = new StringProvider.ActualString("Active 15m ago");
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_clock);
                        Avatar avatarCreate = Avatar.create("", androidx.exifinterface.media.a.S4);
                        Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
                        ConversationScreenKt.ConversationScreenContent(null, new ConversationUiState.Content(new TopAppBarUiState(actualString, null, actualString2, numValueOf, CollectionsKt.listOf(new AvatarWrapper(avatarCreate, false, 2, null)), false, null, null, null, null, null, null, null, null, new PushNotificationsBannerState(false, 1, null), 16354, null), listListOf, bottomBarUiState, null, null, FloatingIndicatorState.None.INSTANCE, new TeamPresenceState(this.$expandedTeamPresenceState, "Our team is here to help you with any questions you have.", "Our response times are slower than usual. We’re working hard to get to your message"), null, 152, null), null, null, null, null, null, null, null, null, null, null, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.p2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        }, null, null, null, null, null, null, null, null, null, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.q2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationScreenKt.AnonymousClass1.C20151.invoke$lambda$1((ConversationScrolledState) obj);
                            }
                        }, new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.r2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ConversationScreenKt.AnonymousClass1.C20151.invoke$lambda$2(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                            }
                        }, null, null, null, null, null, null, null, null, null, null, null, null, c0Var, 64, androidx.profileinstaller.n.c.f73814m, 14155776, 0, 1946124285, 511);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i11) {
                    if ((i11 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(1537427391, true, new C20151(expandedTeamPresenceState), c0Var2, 54), c0Var2, 12582912, 127);
                    }
                }
            }, c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.v1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationScreenKt.ConversationScreenContentPreview$lambda$90(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreenContentPreview$lambda$90(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ConversationScreenContentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void NewConversationScreenContentPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1946511650);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            List listListOf = CollectionsKt.listOf(new Header.Expanded.Body(Header.Expanded.Style.CAPTION, "Active 15m ago", null));
            AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
            Avatar avatarCreate = Avatar.create("", androidx.exifinterface.media.a.S4);
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            final ExpandedTeamPresenceState expandedTeamPresenceState = new ExpandedTeamPresenceState("Banana", listListOf, avatarType, CollectionsKt.listOf(new AvatarWrapper(avatarCreate, false, 2, null)), CollectionsKt.emptyList(), CollectionsKt.emptyList(), false);
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(-2080970892, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt.NewConversationScreenContentPreview.1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$NewConversationScreenContentPreview$1$1, reason: invalid class name and collision with other inner class name */
                static final class C20161 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
                    final /* synthetic */ ExpandedTeamPresenceState $expandedTeamPresenceState;

                    C20161(ExpandedTeamPresenceState expandedTeamPresenceState) {
                        this.$expandedTeamPresenceState = expandedTeamPresenceState;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1(ConversationScrolledState conversationScrolledState) {
                        Intrinsics.checkNotNullParameter(conversationScrolledState, "<unused var>");
                        return Unit.f312394a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2(int i10, int i11) {
                        return Unit.f312394a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                        invoke(c0Var, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
                        if ((i10 & 11) == 2 && c0Var.d()) {
                            c0Var.u();
                            return;
                        }
                        List listListOf = CollectionsKt.listOf((Object[]) new ContentRow[]{new ContentRow.SpecialNoticeRow("Our response times are slower than usual. We’re working hard to get to your message"), new ContentRow.QuickRepliesRow(CollectionsKt.listOf((Object[]) new ReplyOption[]{new ReplyOption("Option 1", "1"), new ReplyOption("Option 2", "2"), new ReplyOption("Option 3", androidx.exifinterface.media.a.f51345a5)}), "1")});
                        BottomBarUiState bottomBarUiState = new BottomBarUiState(new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, null, null, 28, null), new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), InputTypeState.Companion.getDEFAULT(), null, 8, null);
                        StringProvider.ActualString actualString = new StringProvider.ActualString("Banana");
                        StringProvider.ActualString actualString2 = new StringProvider.ActualString("Active 15m ago");
                        Integer numValueOf = Integer.valueOf(R.drawable.intercom_clock);
                        Avatar avatarCreate = Avatar.create("", androidx.exifinterface.media.a.S4);
                        Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
                        ConversationScreenKt.ConversationScreenContent(null, new ConversationUiState.Content(new TopAppBarUiState(actualString, null, actualString2, numValueOf, CollectionsKt.listOf(new AvatarWrapper(avatarCreate, false, 2, null)), false, null, null, null, null, null, null, null, null, null, 16354, null), listListOf, bottomBarUiState, null, null, FloatingIndicatorState.None.INSTANCE, new TeamPresenceState(this.$expandedTeamPresenceState, "Our team is here to help you with any questions you have.", "Our response times are slower than usual. We’re working hard to get to your message"), null, 152, null), null, null, null, null, null, null, null, null, null, null, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.s2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        }, null, null, null, null, null, null, null, null, null, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.t2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ConversationScreenKt.C28031.C20161.invoke$lambda$1((ConversationScrolledState) obj);
                            }
                        }, new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.u2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ConversationScreenKt.C28031.C20161.invoke$lambda$2(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                            }
                        }, null, null, null, null, null, null, null, null, null, null, null, null, c0Var, 64, androidx.profileinstaller.n.c.f73814m, 14155776, 0, 1946124285, 511);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i11) {
                    if ((i11 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(-1434887623, true, new C20161(expandedTeamPresenceState), c0Var2, 54), c0Var2, 12582912, 127);
                    }
                }
            }, c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationScreenKt.NewConversationScreenContentPreview$lambda$91(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationScreenContentPreview$lambda$91(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        NewConversationScreenContentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final boolean getLazyMessageListEnabled() {
        if (Injector.isNotInitialised()) {
            return false;
        }
        return Injector.get().getAppConfigProvider().get().hasFeature(FeatureFlag.LAZY_MESSAGES_LIST_ENABLED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final g5 getPaddingValuesForComposer(g5 g5Var, BottomBarUiState bottomBarUiState, androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-849083091);
        if (bottomBarUiState.getComposerState() instanceof ComposerState.TextInput) {
            androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) c0Var.W(androidx.compose.ui.platform.q1.u());
            g5Var = d5.i(d5.o(g5Var, wVar), g5Var.d(), d5.n(g5Var, wVar), androidx.compose.ui.unit.h.r(kotlin.ranges.r.t(androidx.compose.ui.unit.h.r(g5Var.a() - MessageComposerKt.getComposerHalfSize()), androidx.compose.ui.unit.h.r(0))));
        }
        c0Var.A();
        return g5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLazyListScrolled(List<? extends androidx.compose.foundation.lazy.v> list, float f10, int i10) {
        androidx.compose.foundation.lazy.v vVar = (androidx.compose.foundation.lazy.v) CollectionsKt.lastOrNull((List) list);
        int index = vVar != null ? vVar.getIndex() : 0;
        List listReversed = CollectionsKt.reversed(list);
        ArrayList arrayList = new ArrayList();
        int size = 0;
        for (Object obj : listReversed) {
            androidx.compose.foundation.lazy.v vVar2 = (androidx.compose.foundation.lazy.v) obj;
            boolean z10 = ((float) size) <= f10;
            size += vVar2.getSize();
            if (!z10) {
                break;
            }
            arrayList.add(obj);
        }
        return i10 - index > arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (androidx.compose.material3.f10.f(r11, r2, null, false, r5, r6, 6, null) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r14 == r0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object showNetworkMessage(io.intercom.android.sdk.m5.conversation.states.NetworkState r10, androidx.compose.material3.f10 r11, android.content.Context r12, kotlin.jvm.functions.Function0<kotlin.Unit> r13, kotlin.coroutines.d<? super kotlin.Unit> r14) {
        /*
            boolean r0 = r14 instanceof io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt.C28041
            if (r0 == 0) goto L14
            r0 = r14
            io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$showNetworkMessage$1 r0 = (io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt.C28041) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$showNetworkMessage$1 r0 = new io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$showNetworkMessage$1
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r10 = r6.L$0
            r13 = r10
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            kotlin.ResultKt.m(r14)
            goto Lad
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            kotlin.ResultKt.m(r14)
            goto L70
        L40:
            kotlin.ResultKt.m(r14)
            io.intercom.android.sdk.m5.conversation.states.NetworkState$Connected r14 = io.intercom.android.sdk.m5.conversation.states.NetworkState.Connected.INSTANCE
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r14)
            if (r14 != 0) goto Lb9
            io.intercom.android.sdk.m5.conversation.states.NetworkState$Disconnected r14 = io.intercom.android.sdk.m5.conversation.states.NetworkState.Disconnected.INSTANCE
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r14)
            java.lang.String r1 = ".S.tgrtgq()ien"
            java.lang.String r1 = "getString(...)"
            if (r14 == 0) goto L73
            int r10 = io.intercom.android.sdk.R.string.intercom_no_network_connection
            java.lang.String r2 = r12.getString(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            androidx.compose.material3.w00 r5 = androidx.compose.material3.w00.Indefinite
            r6.label = r3
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            r1 = r11
            java.lang.Object r10 = androidx.compose.material3.f10.f(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L70
            goto Lac
        L70:
            kotlin.Unit r10 = kotlin.Unit.f312394a
            return r10
        L73:
            r9 = r1
            r9 = r1
            r1 = r11
            r11 = r9
            io.intercom.android.sdk.m5.conversation.states.NetworkState$Reconnected r14 = io.intercom.android.sdk.m5.conversation.states.NetworkState.Reconnected.INSTANCE
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r14)
            if (r10 == 0) goto Lb3
            int r10 = io.intercom.android.sdk.R.string.intercom_connected
            java.lang.String r10 = r12.getString(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            androidx.compose.material3.w00 r5 = androidx.compose.material3.w00.Long
            int r14 = io.intercom.android.sdk.R.string.intercom_dismiss
            java.lang.String r12 = r12.getString(r14)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r3 = r12.toUpperCase(r11)
            java.lang.String r11 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r11)
            r6.L$0 = r13
            r6.label = r2
            r4 = 0
            r7 = 4
            r8 = 0
            r2 = r10
            java.lang.Object r14 = androidx.compose.material3.f10.f(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 != r0) goto Lad
        Lac:
            return r0
        Lad:
            androidx.compose.material3.o10 r14 = (androidx.compose.material3.o10) r14
            r13.invoke()
            goto Lb9
        Lb3:
            kotlin.k0 r10 = new kotlin.k0
            r10.<init>()
            throw r10
        Lb9:
            kotlin.Unit r10 = kotlin.Unit.f312394a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt.showNetworkMessage(io.intercom.android.sdk.m5.conversation.states.NetworkState, androidx.compose.material3.f10, android.content.Context, kotlin.jvm.functions.Function0, kotlin.coroutines.d):java.lang.Object");
    }
}
