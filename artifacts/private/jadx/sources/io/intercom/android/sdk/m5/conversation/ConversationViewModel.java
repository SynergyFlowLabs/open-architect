package io.intercom.android.sdk.m5.conversation;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.reducers.ConversationReducer;
import io.intercom.android.sdk.m5.conversation.reducers.InitialStateReducerKt;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.usecase.Action;
import io.intercom.android.sdk.m5.conversation.usecase.AppendPartToConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.AudioRecordingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.ChangeInputUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState;
import io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.MarkUserContentAsSeenByAdmin;
import io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.PushNotificationsBannerUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RecordOpenedInteractionUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendGifUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.TrackLastReceivedPartsUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.UpdateFloatingIndicatorUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioRecordingManager;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.f0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.u0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nConversationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,709:1\n49#2:710\n51#2:714\n46#3:711\n51#3:713\n105#4:712\n226#5,5:715\n226#5,5:720\n226#5,5:725\n226#5,5:730\n226#5,5:735\n226#5,5:740\n226#5,5:745\n*S KotlinDebug\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel\n*L\n201#1:710\n201#1:714\n201#1:711\n201#1:713\n201#1:712\n379#1:715,5\n391#1:720,5\n508#1:725,5\n521#1:730,5\n548#1:735,5\n595#1:740,5\n618#1:745,5\n*E\n"})
public final class ConversationViewModel extends f2 {
    private static final long DEBOUNCE_DELAY_MS = 500;

    @NotNull
    private final j0<ComposerUiEffect> _composerUiEffect;

    @NotNull
    private final j0<ConversationUiEffect> _uiEffect;

    @Nullable
    private p2 adminIsTypingJob;

    @NotNull
    private final ShowAdminIsTypingUseCase adminIsTypingUseCase;

    @NotNull
    private final AppendPartToConversationUseCase appendPartToConversationUseCase;

    @Nullable
    private final ArticleMetadata articleMetadata;

    @NotNull
    private final s0 audioAmplitudeCoroutineScope;

    @NotNull
    private final AudioRecordingManager audioRecordingManager;

    @NotNull
    private final AudioRecordingUseCase audioRecordingUseCase;

    @NotNull
    private final ChangeInputUseCase changeInputUseCase;

    @NotNull
    private final k0<ConversationClientState> clientState;

    @NotNull
    private final o0<ComposerUiEffect> composerUiEffect;

    @NotNull
    private final ConversationReducer conversationReducer;

    @NotNull
    private final ConversationRepository conversationRepository;
    private final String decodedInitialMessage;

    @NotNull
    private final n0 dispatcher;

    @NotNull
    private final FallbackPollingUseCase fallbackPollingUseCase;

    @NotNull
    private final FinStreamingUseCase finStreamingUseCase;

    @NotNull
    private final k0<SearchQuery> gifQueryStateFlow;

    @Nullable
    private final String initialConversationId;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    @NotNull
    private final LaunchMode launchMode;

    @NotNull
    private final LoadGifUseCase loadGifUseCase;

    @NotNull
    private final MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin;

    @NotNull
    private final MetricTracker metricTracker;

    @NotNull
    private final NetworkConnectivityMonitor networkConnectivityMonitor;

    @NotNull
    private final s0 nexusCoroutineScope;

    @NotNull
    private final OpenConversationUseCase openConversationUseCase;

    @NotNull
    private final PushNotificationsBannerUseCase pushNotificationsBannerUseCase;

    @NotNull
    private final RecordOpenedInteractionUseCase recordOpenedInteractionUseCase;

    @NotNull
    private final RefreshConversationUseCase refreshConversationUseCase;

    @NotNull
    private final RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase;

    @NotNull
    private final k0<Boolean> resumedState;

    @NotNull
    private final SendGifUseCase sendGifUseCase;

    @NotNull
    private final SendMediaUseCase sendMediaUseCase;

    @NotNull
    private final SendMessageUseCase sendMessageUseCase;

    @NotNull
    private final SendQuickReplyUseCase sendQuickReplyUseCase;

    @NotNull
    private final SendSuggestionUseCase sendSuggestionUseCase;

    @NotNull
    private final SoundEffectsUseCase soundEffectsUseCase;

    @NotNull
    private final SoundPlayer soundPlayer;

    @NotNull
    private final SubmitAttributeUseCase submitAttributeUseCase;

    @NotNull
    private final TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase;

    @NotNull
    private final Twig twig;

    @NotNull
    private final o0<ConversationUiEffect> uiEffect;

    @NotNull
    private final z0<ConversationUiState> uiState;

    @NotNull
    private final UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase;

    @NotNull
    private final VoiceTranscriptionUseCase voiceTranscriptionUseCase;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1", f = "ConversationViewModel.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nConversationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,709:1\n32#2:710\n17#2:711\n19#2:715\n17#2:716\n19#2:720\n46#3:712\n51#3:714\n46#3:717\n51#3:719\n105#4:713\n105#4:718\n*S KotlinDebug\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$1\n*L\n228#1:710\n228#1:711\n228#1:715\n229#1:716\n229#1:720\n228#1:712\n228#1:714\n229#1:717\n229#1:719\n228#1:713\n229#1:718\n*E\n"})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = ConversationViewModel.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final s0 s0Var = (s0) this.L$0;
                final i<ParsedNexusEvent> iVarRealTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                final i<Object> iVar = new i<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull d dVar) {
                            AnonymousClass1 anonymousClass1;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(dVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objL = b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                j jVar = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
                                    anonymousClass1.label = 1;
                                    if (jVar.emit(obj, anonymousClass1) == objL) {
                                        return objL;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj2);
                            }
                            return Unit.f312394a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.i
                    @Nullable
                    public Object collect(@NotNull j<? super Object> jVar, @NotNull d dVar) {
                        Object objCollect = iVarRealTimeEvents.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                i<ParsedNexusEvent.ConversationNexusEvent> iVar2 = new i<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$1\n*L\n1#1,218:1\n18#2:219\n19#2:222\n230#3,2:220\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar, ConversationViewModel conversationViewModel) {
                            this.$this_unsafeFlow = jVar;
                            this.this$0 = conversationViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:23:0x0080  */
                        /* JADX WARN: Code duplicated, block: B:25:0x0089 A[RETURN] */
                        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull d dVar) {
                            AnonymousClass1 anonymousClass1;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(dVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objL = b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                j jVar = this.$this_unsafeFlow;
                                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) obj;
                                if (Intrinsics.areEqual(conversationNexusEvent.getConversationId(), ((ConversationClientState) this.this$0.clientState.getValue()).getConversationId())) {
                                    anonymousClass1.label = 1;
                                    if (jVar.emit(obj, anonymousClass1) == objL) {
                                        return objL;
                                    }
                                } else {
                                    ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping adminIsTyping = conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping ? (ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) conversationNexusEvent : null;
                                    if (adminIsTyping != null && ConversationViewModelKt.isFastFinTyping(adminIsTyping, (ConversationClientState) this.this$0.clientState.getValue())) {
                                        anonymousClass1.label = 1;
                                        if (jVar.emit(obj, anonymousClass1) == objL) {
                                            return objL;
                                        }
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj2);
                            }
                            return Unit.f312394a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.i
                    @Nullable
                    public Object collect(@NotNull j<? super ParsedNexusEvent.ConversationNexusEvent> jVar, @NotNull d dVar) {
                        Object objCollect = iVar.collect(new AnonymousClass2(jVar, conversationViewModel), dVar);
                        return objCollect == b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final ConversationViewModel conversationViewModel2 = ConversationViewModel.this;
                j<? super ParsedNexusEvent.ConversationNexusEvent> jVar = new j() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.1.2

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$1, reason: invalid class name and collision with other inner class name */
                    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$1", f = "ConversationViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.P1}, m = "invokeSuspend", n = {}, s = {})
                    static final class C20111 extends o implements Function2<s0, d<? super Unit>, Object> {
                        final /* synthetic */ ParsedNexusEvent.ConversationNexusEvent $it;
                        int label;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C20111(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, ConversationViewModel conversationViewModel, d<? super C20111> dVar) {
                            super(2, dVar);
                            this.$it = conversationNexusEvent;
                            this.this$0 = conversationViewModel;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final d<Unit> create(Object obj, d<?> dVar) {
                            return new C20111(this.$it, this.this$0, dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object objL = b.l();
                            int i10 = this.label;
                            if (i10 == 0) {
                                ResultKt.m(obj);
                                if (((ParsedNexusEvent.ConversationNexusEvent.NewComment) this.$it).getPartBuilder() != null) {
                                    this.this$0.appendPartToConversationUseCase.invoke(this.this$0.clientState, ((ParsedNexusEvent.ConversationNexusEvent.NewComment) this.$it).getPartBuilder());
                                } else {
                                    RefreshConversationUseCase refreshConversationUseCase = this.this$0.refreshConversationUseCase;
                                    k0<ConversationClientState> k0Var = this.this$0.clientState;
                                    GetConversationReason getConversationReason = GetConversationReason.NEW_COMMENT;
                                    this.label = 1;
                                    if (refreshConversationUseCase.invoke(k0Var, getConversationReason, this) == objL) {
                                        return objL;
                                    }
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj);
                            }
                            this.this$0.soundEffectsUseCase.invoke$intercom_sdk_base_release(StringsKt.w3(((ParsedNexusEvent.ConversationNexusEvent.NewComment) this.$it).getCreatedByUser()) ? Action.OPERATOR_MESSAGE_RECEIVED : Action.ADMIN_MESSAGE_RECEIVED);
                            return Unit.f312394a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
                            return ((C20111) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                        }
                    }

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$2, reason: invalid class name and collision with other inner class name */
                    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$2", f = "ConversationViewModel.kt", i = {}, l = {262}, m = "invokeSuspend", n = {}, s = {})
                    static final class C20122 extends o implements Function2<s0, d<? super Unit>, Object> {
                        final /* synthetic */ ParsedNexusEvent.ConversationNexusEvent $it;
                        int label;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C20122(ConversationViewModel conversationViewModel, ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, d<? super C20122> dVar) {
                            super(2, dVar);
                            this.this$0 = conversationViewModel;
                            this.$it = conversationNexusEvent;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final d<Unit> create(Object obj, d<?> dVar) {
                            return new C20122(this.this$0, this.$it, dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object objL = b.l();
                            int i10 = this.label;
                            if (i10 == 0) {
                                ResultKt.m(obj);
                                ShowAdminIsTypingUseCase showAdminIsTypingUseCase = this.this$0.adminIsTypingUseCase;
                                k0<ConversationClientState> k0Var = this.this$0.clientState;
                                Avatar avatar = ((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) this.$it).getAvatar();
                                boolean zIsBot = ((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) this.$it).isBot();
                                boolean showAvatar = ((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) this.$it).getShowAvatar();
                                this.label = 1;
                                if (showAdminIsTypingUseCase.invoke(k0Var, avatar, zIsBot, showAvatar, this) == objL) {
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
                        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
                            return ((C20122) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, d<? super Unit> dVar) {
                        if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment) {
                            k.f(s0Var, null, null, new C20111(conversationNexusEvent, conversationViewModel2, null), 3, null);
                        } else if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) {
                            p2 p2Var = conversationViewModel2.adminIsTypingJob;
                            if (p2Var != null) {
                                p2.a.b(p2Var, null, 1, null);
                            }
                            ConversationViewModel conversationViewModel3 = conversationViewModel2;
                            conversationViewModel3.adminIsTypingJob = k.f(s0Var, null, null, new C20122(conversationViewModel3, conversationNexusEvent, null), 3, null);
                        } else if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.UserContentSeenByAdmin) {
                            conversationViewModel2.markUserContentAsSeenByAdmin.invoke(conversationViewModel2.clientState);
                        } else if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.FinStreaming) {
                            Object objInvoke = conversationViewModel2.finStreamingUseCase.invoke(conversationViewModel2.clientState, (ParsedNexusEvent.ConversationNexusEvent.FinStreaming) conversationNexusEvent, dVar);
                            return objInvoke == b.l() ? objInvoke : Unit.f312394a;
                        }
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (iVar2.collect(jVar, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$2, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$2", f = "ConversationViewModel.kt", i = {}, l = {com.google.android.vending.licensing.k.f115074c}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                FallbackPollingUseCase fallbackPollingUseCase = ConversationViewModel.this.fallbackPollingUseCase;
                k0<ConversationClientState> k0Var = ConversationViewModel.this.clientState;
                this.label = 1;
                if (fallbackPollingUseCase.invoke(k0Var, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3", f = "ConversationViewModel.kt", i = {}, l = {303}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nConversationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$3\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,709:1\n32#2:710\n17#2:711\n19#2:715\n17#2:716\n19#2:720\n46#3:712\n51#3:714\n46#3:717\n51#3:719\n105#4:713\n105#4:718\n*S KotlinDebug\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$3\n*L\n297#1:710\n297#1:711\n297#1:715\n298#1:716\n298#1:720\n297#1:712\n297#1:714\n298#1:717\n298#1:719\n297#1:713\n298#1:718\n*E\n"})
    static final class AnonymousClass3 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$2, reason: invalid class name */
        @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$2", f = "ConversationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends o implements n<ParsedNexusEvent.ConversationNexusEvent, Boolean, d<? super ParsedNexusEvent.ConversationNexusEvent>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass2(d<? super AnonymousClass2> dVar) {
                super(3, dVar);
            }

            public final Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, boolean z10, d<? super ParsedNexusEvent.ConversationNexusEvent> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
                anonymousClass2.L$0 = conversationNexusEvent;
                anonymousClass2.Z$0 = z10;
                return anonymousClass2.invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) this.L$0;
                if (this.Z$0) {
                    return conversationNexusEvent;
                }
                return null;
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, Boolean bool, d<? super ParsedNexusEvent.ConversationNexusEvent> dVar) {
                return invoke(conversationNexusEvent, bool.booleanValue(), dVar);
            }
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$3, reason: invalid class name and collision with other inner class name */
        @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$3", f = "ConversationViewModel.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
        static final class C20133 extends o implements Function2<ParsedNexusEvent.ConversationNexusEvent, d<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C20133(ConversationViewModel conversationViewModel, d<? super C20133> dVar) {
                super(2, dVar);
                this.this$0 = conversationViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C20133(this.this$0, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, d<? super Unit> dVar) {
                return ((C20133) create(conversationNexusEvent, dVar)).invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase = this.this$0.refreshUnreadConversationsCountUseCase;
                    k0<ConversationClientState> k0Var = this.this$0.clientState;
                    this.label = 1;
                    if (refreshUnreadConversationsCountUseCase.invoke(k0Var, this) == objL) {
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
        }

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new AnonymousClass3(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final i<ParsedNexusEvent> iVarRealTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                final i<Object> iVar = new i<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull d dVar) {
                            AnonymousClass1 anonymousClass1;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(dVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objL = b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                j jVar = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
                                    anonymousClass1.label = 1;
                                    if (jVar.emit(obj, anonymousClass1) == objL) {
                                        return objL;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj2);
                            }
                            return Unit.f312394a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.i
                    @Nullable
                    public Object collect(@NotNull j<? super Object> jVar, @NotNull d dVar) {
                        Object objCollect = iVarRealTimeEvents.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                int i11 = 4 ^ 0;
                i iVarV0 = kotlinx.coroutines.flow.k.v0(kotlinx.coroutines.flow.k.L0(new i<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$3\n*L\n1#1,218:1\n18#2:219\n19#2:221\n298#3:220\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar, ConversationViewModel conversationViewModel) {
                            this.$this_unsafeFlow = jVar;
                            this.this$0 = conversationViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull d dVar) {
                            AnonymousClass1 anonymousClass1;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(dVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objL = b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                j jVar = this.$this_unsafeFlow;
                                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) obj;
                                if (!Intrinsics.areEqual(conversationNexusEvent.getConversationId(), ((ConversationClientState) this.this$0.clientState.getValue()).getConversationId()) && (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment)) {
                                    anonymousClass1.label = 1;
                                    if (jVar.emit(obj, anonymousClass1) == objL) {
                                        return objL;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj2);
                            }
                            return Unit.f312394a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.i
                    @Nullable
                    public Object collect(@NotNull j<? super ParsedNexusEvent.ConversationNexusEvent> jVar, @NotNull d dVar) {
                        Object objCollect = iVar.collect(new AnonymousClass2(jVar, conversationViewModel), dVar);
                        return objCollect == b.l() ? objCollect : Unit.f312394a;
                    }
                }, ConversationViewModel.this.resumedState, new AnonymousClass2(null)));
                C20133 c20133 = new C20133(ConversationViewModel.this, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.k.C(iVarV0, c20133, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$4", f = "ConversationViewModel.kt", i = {}, l = {312}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nConversationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$4\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,709:1\n32#2:710\n17#2:711\n19#2:715\n46#3:712\n51#3:714\n105#4:713\n*S KotlinDebug\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$4\n*L\n311#1:710\n311#1:711\n311#1:715\n311#1:712\n311#1:714\n311#1:713\n*E\n"})
    static final class AnonymousClass4 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        AnonymousClass4(d<? super AnonymousClass4> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new AnonymousClass4(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final i<ParsedNexusEvent> iVarRealTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                i<Object> iVar = new i<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull d dVar) {
                            AnonymousClass1 anonymousClass1;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(dVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objL = b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                j jVar = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.NexusConnected) {
                                    anonymousClass1.label = 1;
                                    if (jVar.emit(obj, anonymousClass1) == objL) {
                                        return objL;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj2);
                            }
                            return Unit.f312394a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.i
                    @Nullable
                    public Object collect(@NotNull j<? super Object> jVar, @NotNull d dVar) {
                        Object objCollect = iVarRealTimeEvents.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                j<? super Object> jVar = new j() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.4.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((ParsedNexusEvent.NexusConnected) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(ParsedNexusEvent.NexusConnected nexusConnected, d<? super Unit> dVar) {
                        conversationViewModel.twig.d("Nexus connected", new Object[0]);
                        Object objInvoke = conversationViewModel.refreshConversationUseCase.invoke(conversationViewModel.clientState, GetConversationReason.NEXUS_CONNECTED, dVar);
                        return objInvoke == b.l() ? objInvoke : Unit.f312394a;
                    }
                };
                this.label = 1;
                if (iVar.collect(jVar, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass4) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5", f = "ConversationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nConversationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$5\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,709:1\n32#2:710\n17#2:711\n19#2:715\n17#2:716\n19#2:720\n46#3:712\n51#3:714\n46#3:717\n51#3:719\n105#4:713\n105#4:718\n*S KotlinDebug\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$5\n*L\n324#1:710\n324#1:711\n324#1:715\n325#1:716\n325#1:720\n324#1:712\n324#1:714\n325#1:717\n325#1:719\n324#1:713\n325#1:718\n*E\n"})
    static final class AnonymousClass5 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$2, reason: invalid class name */
        @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$2", f = "ConversationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends o implements n<ParsedNexusEvent.ConversationNexusEvent, Boolean, d<? super ParsedNexusEvent.ConversationNexusEvent>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass2(d<? super AnonymousClass2> dVar) {
                super(3, dVar);
            }

            public final Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, boolean z10, d<? super ParsedNexusEvent.ConversationNexusEvent> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
                anonymousClass2.L$0 = conversationNexusEvent;
                anonymousClass2.Z$0 = z10;
                return anonymousClass2.invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) this.L$0;
                if (this.Z$0) {
                    return conversationNexusEvent;
                }
                return null;
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, Boolean bool, d<? super ParsedNexusEvent.ConversationNexusEvent> dVar) {
                return invoke(conversationNexusEvent, bool.booleanValue(), dVar);
            }
        }

        AnonymousClass5(d<? super AnonymousClass5> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new AnonymousClass5(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            final i<ParsedNexusEvent> iVarRealTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
            final i<Object> iVar = new i<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                public static final class AnonymousClass2<T> implements j {
                    final /* synthetic */ j $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(j jVar) {
                        this.$this_unsafeFlow = jVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                    @Override // kotlinx.coroutines.flow.j
                    @Nullable
                    public final Object emit(Object obj, @NotNull d dVar) {
                        AnonymousClass1 anonymousClass1;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i10 = anonymousClass1.label;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objL = b.l();
                        int i11 = anonymousClass1.label;
                        if (i11 == 0) {
                            ResultKt.m(obj2);
                            j jVar = this.$this_unsafeFlow;
                            if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
                                anonymousClass1.label = 1;
                                if (jVar.emit(obj, anonymousClass1) == objL) {
                                    return objL;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj2);
                        }
                        return Unit.f312394a;
                    }
                }

                @Override // kotlinx.coroutines.flow.i
                @Nullable
                public Object collect(@NotNull j<? super Object> jVar, @NotNull d dVar) {
                    Object objCollect = iVarRealTimeEvents.collect(new AnonymousClass2(jVar), dVar);
                    return objCollect == b.l() ? objCollect : Unit.f312394a;
                }
            };
            kotlinx.coroutines.flow.k.v0(kotlinx.coroutines.flow.k.L0(new i<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$5\n*L\n1#1,218:1\n18#2:219\n19#2:221\n325#3:220\n*E\n"})
                public static final class AnonymousClass2<T> implements j {
                    final /* synthetic */ j $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filter$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(j jVar) {
                        this.$this_unsafeFlow = jVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                    @Override // kotlinx.coroutines.flow.j
                    @Nullable
                    public final Object emit(Object obj, @NotNull d dVar) {
                        AnonymousClass1 anonymousClass1;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i10 = anonymousClass1.label;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objL = b.l();
                        int i11 = anonymousClass1.label;
                        if (i11 == 0) {
                            ResultKt.m(obj2);
                            j jVar = this.$this_unsafeFlow;
                            if (((ParsedNexusEvent.ConversationNexusEvent) obj).getEventType() == NexusEventType.NewComment) {
                                anonymousClass1.label = 1;
                                if (jVar.emit(obj, anonymousClass1) == objL) {
                                    return objL;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj2);
                        }
                        return Unit.f312394a;
                    }
                }

                @Override // kotlinx.coroutines.flow.i
                @Nullable
                public Object collect(@NotNull j<? super ParsedNexusEvent.ConversationNexusEvent> jVar, @NotNull d dVar) {
                    Object objCollect = iVar.collect(new AnonymousClass2(jVar), dVar);
                    return objCollect == b.l() ? objCollect : Unit.f312394a;
                }
            }, ConversationViewModel.this.resumedState, new AnonymousClass2(null)));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass5) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$6, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$6", f = "ConversationViewModel.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass6 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ GetNetworkState $getNetworkState;
        int label;
        final /* synthetic */ ConversationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(GetNetworkState getNetworkState, ConversationViewModel conversationViewModel, d<? super AnonymousClass6> dVar) {
            super(2, dVar);
            this.$getNetworkState = getNetworkState;
            this.this$0 = conversationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass6(this.$getNetworkState, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                i iVarI0 = kotlinx.coroutines.flow.k.i0(this.$getNetworkState.invoke());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.label = 1;
                if (iVarI0.collect(anonymousClass1, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass6) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1, reason: invalid class name */
        @SourceDebugExtension({"SMAP\nConversationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$6$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,709:1\n226#2,5:710\n*S KotlinDebug\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$6$1\n*L\n341#1:710,5\n*E\n"})
        static final class AnonymousClass1<T> implements j {
            final /* synthetic */ ConversationViewModel this$0;

            AnonymousClass1(ConversationViewModel conversationViewModel) {
                this.this$0 = conversationViewModel;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Multi-variable type inference failed */
            public final Object emit(NetworkState networkState, d<? super Unit> dVar) {
                ConversationViewModel$6$1$emit$1 conversationViewModel$6$1$emit$1;
                Object value;
                AnonymousClass1<T> anonymousClass1 = this;
                NetworkState networkState2 = networkState;
                if (dVar instanceof ConversationViewModel$6$1$emit$1) {
                    conversationViewModel$6$1$emit$1 = (ConversationViewModel$6$1$emit$1) dVar;
                    int i10 = conversationViewModel$6$1$emit$1.label;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        conversationViewModel$6$1$emit$1.label = i10 - Integer.MIN_VALUE;
                    } else {
                        conversationViewModel$6$1$emit$1 = new ConversationViewModel$6$1$emit$1(anonymousClass1, dVar);
                    }
                } else {
                    conversationViewModel$6$1$emit$1 = new ConversationViewModel$6$1$emit$1(anonymousClass1, dVar);
                }
                Object obj = conversationViewModel$6$1$emit$1.result;
                Object objL = b.l();
                int i11 = conversationViewModel$6$1$emit$1.label;
                if (i11 == 0) {
                    ResultKt.m(obj);
                    if (Intrinsics.areEqual(networkState2, NetworkState.Reconnected.INSTANCE)) {
                        OpenConversationUseCase openConversationUseCase = anonymousClass1.this$0.openConversationUseCase;
                        k0<ConversationClientState> k0Var = anonymousClass1.this$0.clientState;
                        GetConversationReason getConversationReason = GetConversationReason.NETWORK_CONNECTED;
                        conversationViewModel$6$1$emit$1.L$0 = anonymousClass1;
                        conversationViewModel$6$1$emit$1.L$1 = networkState2;
                        conversationViewModel$6$1$emit$1.label = 1;
                        if (openConversationUseCase.invoke(k0Var, getConversationReason, conversationViewModel$6$1$emit$1) == objL) {
                            return objL;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    NetworkState networkState3 = (NetworkState) conversationViewModel$6$1$emit$1.L$1;
                    AnonymousClass1<T> anonymousClass2 = (AnonymousClass1) conversationViewModel$6$1$emit$1.L$0;
                    ResultKt.m(obj);
                    networkState2 = networkState3;
                    anonymousClass1 = anonymousClass2;
                }
                NetworkState networkState4 = networkState2;
                k0 k0Var2 = anonymousClass1.this$0.clientState;
                do {
                    value = k0Var2.getValue();
                } while (!k0Var2.compareAndSet(value, ConversationClientState.copy$default((ConversationClientState) value, null, null, null, null, null, null, null, null, null, networkState4, null, null, null, null, 0, 0, null, null, false, false, null, null, 4193791, null)));
                return Unit.f312394a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
                return emit((NetworkState) obj, (d<? super Unit>) dVar);
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7", f = "ConversationViewModel.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nConversationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$7\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,709:1\n32#2:710\n17#2:711\n19#2:715\n49#2:716\n51#2:720\n46#3:712\n51#3:714\n46#3:717\n51#3:719\n105#4:713\n105#4:718\n*S KotlinDebug\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$7\n*L\n349#1:710\n349#1:711\n349#1:715\n350#1:716\n350#1:720\n349#1:712\n349#1:714\n350#1:717\n350#1:719\n349#1:713\n350#1:718\n*E\n"})
    static final class AnonymousClass7 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$2, reason: invalid class name */
        @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$2", f = "ConversationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends o implements Function2<String, d<? super String>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(d<? super AnonymousClass2> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return StringsKt.E5((String) this.L$0).toString();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, d<? super String> dVar) {
                return ((AnonymousClass2) create(str, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        AnonymousClass7(d<? super AnonymousClass7> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new AnonymousClass7(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final k0 k0Var = ConversationViewModel.this.gifQueryStateFlow;
                final i<Object> iVar = new i<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull d dVar) {
                            AnonymousClass1 anonymousClass1;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(dVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objL = b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                j jVar = this.$this_unsafeFlow;
                                if (obj instanceof SearchQuery.Query) {
                                    anonymousClass1.label = 1;
                                    if (jVar.emit(obj, anonymousClass1) == objL) {
                                        return objL;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj2);
                            }
                            return Unit.f312394a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.i
                    @Nullable
                    public Object collect(@NotNull j<? super Object> jVar, @NotNull d dVar) {
                        Object objCollect = k0Var.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == b.l() ? objCollect : Unit.f312394a;
                    }
                };
                i iVarI0 = kotlinx.coroutines.flow.k.i0(kotlinx.coroutines.flow.k.Y0(kotlinx.coroutines.flow.k.c0(new i<String>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$7\n*L\n1#1,218:1\n50#2:219\n350#3:220\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull d dVar) {
                            AnonymousClass1 anonymousClass1;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(dVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objL = b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                j jVar = this.$this_unsafeFlow;
                                String value = ((SearchQuery.Query) obj).getValue();
                                anonymousClass1.label = 1;
                                if (jVar.emit(value, anonymousClass1) == objL) {
                                    return objL;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj2);
                            }
                            return Unit.f312394a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.i
                    @Nullable
                    public Object collect(@NotNull j<? super String> jVar, @NotNull d dVar) {
                        Object objCollect = iVar.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == b.l() ? objCollect : Unit.f312394a;
                    }
                }, 500L), new AnonymousClass2(null)));
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                j jVar = new j() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.7.3
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((String) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(String str, d<? super Unit> dVar) {
                        Object objInvoke = conversationViewModel.loadGifUseCase.invoke(conversationViewModel.clientState, str, dVar);
                        return objInvoke == b.l() ? objInvoke : Unit.f312394a;
                    }
                };
                this.label = 1;
                if (iVarI0.collect(jVar, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass7) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ConversationViewModel create$default(Companion companion, m2 m2Var, String str, String str2, ArticleMetadata articleMetadata, LaunchMode launchMode, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str2 = "";
            }
            String str3 = str2;
            if ((i10 & 8) != 0) {
                articleMetadata = null;
            }
            return companion.create(m2Var, str, str3, articleMetadata, launchMode);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.sdk.m5.conversation.ConversationViewModel$Companion$factory$1] */
        private final ConversationViewModel$Companion$factory$1 factory(final String str, final String str2, final ArticleMetadata articleMetadata, final LaunchMode launchMode) {
            return new j2.c() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$Companion$factory$1
                @Override // androidx.lifecycle.j2.c
                public <T extends f2> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new ConversationViewModel(str, launchMode, articleMetadata, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16, 127, null);
                }
            };
        }

        @NotNull
        public final ConversationViewModel create(@NotNull m2 owner, @Nullable String str, @NotNull String initialMessage, @Nullable ArticleMetadata articleMetadata, @NotNull LaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(initialMessage, "initialMessage");
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            return (ConversationViewModel) new j2(owner, factory(str, initialMessage, articleMetadata, launchMode)).c(ConversationViewModel.class);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$cancelVoiceRecording$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$cancelVoiceRecording$1", f = "ConversationViewModel.kt", i = {}, l = {661}, m = "invokeSuspend", n = {}, s = {})
    static final class C27851 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C27851(d<? super C27851> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27851(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                VoiceTranscriptionUseCase voiceTranscriptionUseCase = ConversationViewModel.this.voiceTranscriptionUseCase;
                k0<ConversationClientState> k0Var = ConversationViewModel.this.clientState;
                j0<ConversationUiEffect> j0Var = ConversationViewModel.this._uiEffect;
                this.label = 1;
                if (voiceTranscriptionUseCase.cancelRecording(k0Var, j0Var, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27851) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$loadConversation$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$loadConversation$1", f = "ConversationViewModel.kt", i = {}, l = {v.e.f44051t}, m = "invokeSuspend", n = {}, s = {})
    static final class C27861 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C27861(d<? super C27861> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27861(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                OpenConversationUseCase openConversationUseCase = ConversationViewModel.this.openConversationUseCase;
                k0 k0Var = ConversationViewModel.this.clientState;
                this.label = 1;
                int i11 = 4 << 0;
                if (OpenConversationUseCase.invoke$default(openConversationUseCase, k0Var, null, this, 2, null) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27861) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$loadGifs$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$loadGifs$2", f = "ConversationViewModel.kt", i = {}, l = {512}, m = "invokeSuspend", n = {}, s = {})
    static final class C27872 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C27872(d<? super C27872> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27872(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                LoadGifUseCase loadGifUseCase = ConversationViewModel.this.loadGifUseCase;
                k0 k0Var = ConversationViewModel.this.clientState;
                this.label = 1;
                if (LoadGifUseCase.invoke$default(loadGifUseCase, k0Var, null, this, 2, null) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27872) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onInputChange$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onInputChange$1", f = "ConversationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27881 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ ComposerInputType $inputType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27881(ComposerInputType composerInputType, d<? super C27881> dVar) {
            super(2, dVar);
            this.$inputType = composerInputType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27881(this.$inputType, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ConversationViewModel.this.changeInputUseCase.invoke(ConversationViewModel.this.clientState, this.$inputType);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27881) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onReplyOptionClicked$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onReplyOptionClicked$1", f = "ConversationViewModel.kt", i = {}, l = {433}, m = "invokeSuspend", n = {}, s = {})
    static final class C27891 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ ReplyOption $replyOption;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27891(ReplyOption replyOption, d<? super C27891> dVar) {
            super(2, dVar);
            this.$replyOption = replyOption;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27891(this.$replyOption, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Conversation conversation = ((ConversationClientState) ConversationViewModel.this.clientState.getValue()).getConversation();
                if (conversation != null) {
                    ConversationViewModel conversationViewModel = ConversationViewModel.this;
                    ReplyOption replyOption = this.$replyOption;
                    SendQuickReplyUseCase sendQuickReplyUseCase = conversationViewModel.sendQuickReplyUseCase;
                    k0<ConversationClientState> k0Var = conversationViewModel.clientState;
                    Part part = (Part) CollectionsKt.last((List) conversation.parts());
                    this.label = 1;
                    if (sendQuickReplyUseCase.invoke(k0Var, replyOption, part, this) == objL) {
                        return objL;
                    }
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27891) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onReportAiAnswer$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onReportAiAnswer$1", f = "ConversationViewModel.kt", i = {}, l = {626}, m = "invokeSuspend", n = {}, s = {})
    static final class C27901 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C27901(d<? super C27901> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27901(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0 j0Var = ConversationViewModel.this._composerUiEffect;
                ComposerUiEffect.ReportAiAnswer reportAiAnswer = ComposerUiEffect.ReportAiAnswer.INSTANCE;
                this.label = 1;
                if (j0Var.emit(reportAiAnswer, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27901) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryClick$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryClick$2", f = "ConversationViewModel.kt", i = {}, l = {525}, m = "invokeSuspend", n = {}, s = {})
    static final class C27912 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C27912(d<? super C27912> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27912(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                OpenConversationUseCase openConversationUseCase = ConversationViewModel.this.openConversationUseCase;
                k0 k0Var = ConversationViewModel.this.clientState;
                this.label = 1;
                if (OpenConversationUseCase.invoke$default(openConversationUseCase, k0Var, null, this, 2, null) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27912) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMediaClicked$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMediaClicked$1", f = "ConversationViewModel.kt", i = {}, l = {577}, m = "invokeSuspend", n = {}, s = {})
    static final class C27921 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ PendingMessage.FailedImageUploadData $failedImageUploadData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27921(PendingMessage.FailedImageUploadData failedImageUploadData, d<? super C27921> dVar) {
            super(2, dVar);
            this.$failedImageUploadData = failedImageUploadData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27921(this.$failedImageUploadData, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                SendMediaUseCase sendMediaUseCase = ConversationViewModel.this.sendMediaUseCase;
                k0<ConversationClientState> k0Var = ConversationViewModel.this.clientState;
                j0<ConversationUiEffect> j0Var = ConversationViewModel.this._uiEffect;
                MediaData.Media imageData = this.$failedImageUploadData.getImageData();
                String clientAssignedUUID = this.$failedImageUploadData.getClientAssignedUUID();
                this.label = 1;
                if (sendMediaUseCase.invoke(k0Var, j0Var, imageData, clientAssignedUUID, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27921) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMessageClicked$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMessageClicked$1", f = "ConversationViewModel.kt", i = {}, l = {567}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nConversationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$onRetryMessageClicked$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,709:1\n1557#2:710\n1628#2,3:711\n*S KotlinDebug\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel$onRetryMessageClicked$1\n*L\n569#1:710\n569#1:711,3\n*E\n"})
    static final class C27931 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Part $part;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27931(Part part, d<? super C27931> dVar) {
            super(2, dVar);
            this.$part = part;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27931(this.$part, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                SendMessageUseCase sendMessageUseCase = ConversationViewModel.this.sendMessageUseCase;
                k0<ConversationClientState> k0Var = ConversationViewModel.this.clientState;
                List<Block> blocks = this.$part.getBlocks();
                Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
                List<Block> list = blocks;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Block) it.next()).toBuilder());
                }
                String uuid = this.$part.getUuid();
                Intrinsics.checkNotNullExpressionValue(uuid, "getUuid(...)");
                this.label = 1;
                if (sendMessageUseCase.invoke(k0Var, arrayList, uuid, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27931) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onSubmitAttribute$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onSubmitAttribute$1", f = "ConversationViewModel.kt", i = {}, l = {533}, m = "invokeSuspend", n = {}, s = {})
    static final class C27941 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Attribute $attribute;
        final /* synthetic */ String $partId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27941(Attribute attribute, String str, d<? super C27941> dVar) {
            super(2, dVar);
            this.$attribute = attribute;
            this.$partId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27941(this.$attribute, this.$partId, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                SubmitAttributeUseCase submitAttributeUseCase = ConversationViewModel.this.submitAttributeUseCase;
                k0<ConversationClientState> k0Var = ConversationViewModel.this.clientState;
                Attribute attribute = this.$attribute;
                String str = this.$partId;
                this.label = 1;
                if (submitAttributeUseCase.invoke(k0Var, attribute, str, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27941) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onSuggestionClick$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onSuggestionClick$1", f = "ConversationViewModel.kt", i = {}, l = {v.c.f44020u}, m = "invokeSuspend", n = {}, s = {})
    static final class C27951 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ ReplySuggestion $suggestion;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27951(ReplySuggestion replySuggestion, d<? super C27951> dVar) {
            super(2, dVar);
            this.$suggestion = replySuggestion;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27951(this.$suggestion, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                SendSuggestionUseCase sendSuggestionUseCase = ConversationViewModel.this.sendSuggestionUseCase;
                k0<ConversationClientState> k0Var = ConversationViewModel.this.clientState;
                ReplySuggestion replySuggestion = this.$suggestion;
                this.label = 1;
                if (sendSuggestionUseCase.invoke(k0Var, replySuggestion, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27951) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendGif$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendGif$1", f = "ConversationViewModel.kt", i = {}, l = {500}, m = "invokeSuspend", n = {}, s = {})
    static final class C27961 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ MediaData.Gif $mediaData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27961(MediaData.Gif gif, d<? super C27961> dVar) {
            super(2, dVar);
            this.$mediaData = gif;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27961(this.$mediaData, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                SendGifUseCase sendGifUseCase = ConversationViewModel.this.sendGifUseCase;
                k0<ConversationClientState> k0Var = ConversationViewModel.this.clientState;
                MediaData.Gif gif = this.$mediaData;
                this.label = 1;
                if (sendGifUseCase.invoke(k0Var, gif, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27961) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendMedia$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendMedia$1", f = "ConversationViewModel.kt", i = {}, l = {539}, m = "invokeSuspend", n = {}, s = {})
    static final class C27971 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ MediaData.Media $mediaData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27971(MediaData.Media media, d<? super C27971> dVar) {
            super(2, dVar);
            this.$mediaData = media;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27971(this.$mediaData, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                SendMediaUseCase sendMediaUseCase = ConversationViewModel.this.sendMediaUseCase;
                k0 k0Var = ConversationViewModel.this.clientState;
                j0 j0Var = ConversationViewModel.this._uiEffect;
                MediaData.Media media = this.$mediaData;
                this.label = 1;
                if (SendMediaUseCase.invoke$default(sendMediaUseCase, k0Var, j0Var, media, null, this, 8, null) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27971) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendMessage$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendMessage$1", f = "ConversationViewModel.kt", i = {}, l = {410}, m = "invokeSuspend", n = {}, s = {})
    static final class C27981 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ String $messageText;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27981(String str, d<? super C27981> dVar) {
            super(2, dVar);
            this.$messageText = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27981(this.$messageText, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                SendMessageUseCase sendMessageUseCase = ConversationViewModel.this.sendMessageUseCase;
                k0<ConversationClientState> k0Var = ConversationViewModel.this.clientState;
                String str = this.$messageText;
                this.label = 1;
                if (sendMessageUseCase.invoke(k0Var, str, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27981) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$startVoiceRecording$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$startVoiceRecording$1", f = "ConversationViewModel.kt", i = {}, l = {649}, m = "invokeSuspend", n = {}, s = {})
    static final class C27991 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C27991(d<? super C27991> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C27991(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                VoiceTranscriptionUseCase voiceTranscriptionUseCase = ConversationViewModel.this.voiceTranscriptionUseCase;
                k0<ConversationClientState> k0Var = ConversationViewModel.this.clientState;
                j0<ConversationUiEffect> j0Var = ConversationViewModel.this._uiEffect;
                this.label = 1;
                if (voiceTranscriptionUseCase.startRecording(k0Var, j0Var, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27991) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$stopVoiceRecordingAndTranscribe$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$stopVoiceRecordingAndTranscribe$1", f = "ConversationViewModel.kt", i = {}, l = {655}, m = "invokeSuspend", n = {}, s = {})
    static final class C28001 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C28001(d<? super C28001> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C28001(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                VoiceTranscriptionUseCase voiceTranscriptionUseCase = ConversationViewModel.this.voiceTranscriptionUseCase;
                k0<ConversationClientState> k0Var = ConversationViewModel.this.clientState;
                j0<ConversationUiEffect> j0Var = ConversationViewModel.this._uiEffect;
                j0<ComposerUiEffect> j0Var2 = ConversationViewModel.this._composerUiEffect;
                this.label = 1;
                if (voiceTranscriptionUseCase.stopRecordingAndTranscribe(k0Var, j0Var, j0Var2, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28001) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$updateTranscribedText$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$updateTranscribedText$1", f = "ConversationViewModel.kt", i = {}, l = {632}, m = "invokeSuspend", n = {}, s = {})
    static final class C28011 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ String $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28011(String str, d<? super C28011> dVar) {
            super(2, dVar);
            this.$text = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ConversationViewModel.this.new C28011(this.$text, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0 j0Var = ConversationViewModel.this._composerUiEffect;
                ComposerUiEffect.UpdateTranscribedText updateTranscribedText = new ComposerUiEffect.UpdateTranscribedText(this.$text);
                this.label = 1;
                if (j0Var.emit(updateTranscribedText, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28011) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ConversationViewModel(String str, LaunchMode launchMode, ArticleMetadata articleMetadata, String str2, NetworkConnectivityMonitor networkConnectivityMonitor, SoundPlayer soundPlayer, s0 s0Var, s0 s0Var2, ConversationRepository conversationRepository, ConversationReducer conversationReducer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase, SoundEffectsUseCase soundEffectsUseCase, SendSuggestionUseCase sendSuggestionUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, RefreshConversationUseCase refreshConversationUseCase, AppendPartToConversationUseCase appendPartToConversationUseCase, OpenConversationUseCase openConversationUseCase, SendMessageUseCase sendMessageUseCase, SendQuickReplyUseCase sendQuickReplyUseCase, LoadGifUseCase loadGifUseCase, ChangeInputUseCase changeInputUseCase, SendGifUseCase sendGifUseCase, SendMediaUseCase sendMediaUseCase, UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase, GetNetworkState getNetworkState, ShowAdminIsTypingUseCase showAdminIsTypingUseCase, SubmitAttributeUseCase submitAttributeUseCase, FallbackPollingUseCase fallbackPollingUseCase, PushNotificationsBannerUseCase pushNotificationsBannerUseCase, AudioRecordingManager audioRecordingManager, AudioRecordingUseCase audioRecordingUseCase, VoiceTranscriptionUseCase voiceTranscriptionUseCase, MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin, FinStreamingUseCase finStreamingUseCase, n0 n0Var, MetricTracker metricTracker, IntercomDataLayer intercomDataLayer, Twig twig, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        SendMessageUseCase sendMessageUseCase2;
        SendMediaUseCase sendMediaUseCase2;
        AudioRecordingManager audioRecordingManager2;
        MetricTracker metricTracker2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        String str3 = (i10 & 1) != 0 ? null : str;
        ArticleMetadata articleMetadata2 = (i10 & 4) != 0 ? null : articleMetadata;
        NetworkConnectivityMonitor networkConnectivityMonitor2 = (i10 & 16) != 0 ? new NetworkConnectivityMonitor() : networkConnectivityMonitor;
        SoundPlayer soundPlayer2 = (i10 & 32) != 0 ? new SoundPlayer() : soundPlayer;
        s0 s0VarA = (i10 & 64) != 0 ? t0.a(l1.c()) : s0Var;
        s0 s0VarA2 = (i10 & 128) != 0 ? t0.a(l1.c()) : s0Var2;
        s0 s0Var3 = s0VarA;
        ConversationRepository conversationRepository2 = (i10 & 256) != 0 ? new ConversationRepository(null, null, null, null, null, null, s0Var3, 63, null) : conversationRepository;
        ConversationReducer conversationReducer2 = (i10 & 512) != 0 ? new ConversationReducer(null, null, null, null, 15, null) : conversationReducer;
        int i12 = 3;
        TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase2 = (i10 & 1024) != 0 ? new TrackLastReceivedPartsUseCase(metricTracker2, objArr8 == true ? 1 : 0, i12, objArr7 == true ? 1 : 0) : trackLastReceivedPartsUseCase;
        RecordOpenedInteractionUseCase recordOpenedInteractionUseCase2 = (i10 & 2048) != 0 ? new RecordOpenedInteractionUseCase(conversationRepository2) : recordOpenedInteractionUseCase;
        SoundEffectsUseCase soundEffectsUseCase2 = (i10 & 4096) != 0 ? new SoundEffectsUseCase(null, soundPlayer2, 1, null) : soundEffectsUseCase;
        SendSuggestionUseCase sendSuggestionUseCase2 = (i10 & 8192) != 0 ? new SendSuggestionUseCase(conversationRepository2, soundEffectsUseCase2, null, null, 12, null) : sendSuggestionUseCase;
        RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase2 = (i10 & 16384) != 0 ? new RefreshUnreadConversationsCountUseCase(objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, i12, objArr4 == true ? 1 : 0) : refreshUnreadConversationsCountUseCase;
        RefreshConversationUseCase refreshConversationUseCase2 = (32768 & i10) != 0 ? new RefreshConversationUseCase(conversationRepository2, null, trackLastReceivedPartsUseCase2, recordOpenedInteractionUseCase2, 2, null) : refreshConversationUseCase;
        AppendPartToConversationUseCase appendPartToConversationUseCase2 = (65536 & i10) != 0 ? new AppendPartToConversationUseCase(trackLastReceivedPartsUseCase2, recordOpenedInteractionUseCase2) : appendPartToConversationUseCase;
        OpenConversationUseCase openConversationUseCase2 = (131072 & i10) != 0 ? new OpenConversationUseCase(refreshConversationUseCase2, refreshUnreadConversationsCountUseCase2, null, 4, null) : openConversationUseCase;
        SendMessageUseCase sendMessageUseCase3 = (262144 & i10) != 0 ? new SendMessageUseCase(conversationRepository2, refreshConversationUseCase2, soundEffectsUseCase2, null, null, 24, null) : sendMessageUseCase;
        SendQuickReplyUseCase sendQuickReplyUseCase2 = (524288 & i10) != 0 ? new SendQuickReplyUseCase(conversationRepository2, refreshConversationUseCase2, soundEffectsUseCase2, null, 8, null) : sendQuickReplyUseCase;
        LoadGifUseCase loadGifUseCase2 = (1048576 & i10) != 0 ? new LoadGifUseCase(conversationRepository2) : loadGifUseCase;
        ChangeInputUseCase changeInputUseCase2 = (2097152 & i10) != 0 ? new ChangeInputUseCase() : changeInputUseCase;
        SendGifUseCase sendGifUseCase2 = (4194304 & i10) != 0 ? new SendGifUseCase(sendMessageUseCase3, changeInputUseCase2) : sendGifUseCase;
        if ((8388608 & i10) != 0) {
            SendMessageUseCase sendMessageUseCase4 = sendMessageUseCase3;
            sendMessageUseCase2 = sendMessageUseCase4;
            sendMediaUseCase2 = new SendMediaUseCase(sendMessageUseCase4, conversationRepository2, null, null, null, 28, null);
        } else {
            sendMessageUseCase2 = sendMessageUseCase3;
            sendMediaUseCase2 = sendMediaUseCase;
        }
        UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase2 = (16777216 & i10) != 0 ? new UpdateFloatingIndicatorUseCase() : updateFloatingIndicatorUseCase;
        GetNetworkState getNetworkState2 = (33554432 & i10) != 0 ? new GetNetworkState(networkConnectivityMonitor2) : getNetworkState;
        ShowAdminIsTypingUseCase showAdminIsTypingUseCase2 = (67108864 & i10) != 0 ? new ShowAdminIsTypingUseCase() : showAdminIsTypingUseCase;
        SubmitAttributeUseCase submitAttributeUseCase2 = (134217728 & i10) != 0 ? new SubmitAttributeUseCase(conversationRepository2) : submitAttributeUseCase;
        FallbackPollingUseCase fallbackPollingUseCase2 = (268435456 & i10) != 0 ? new FallbackPollingUseCase(null, null, refreshConversationUseCase2, 3, null) : fallbackPollingUseCase;
        PushNotificationsBannerUseCase pushNotificationsBannerUseCase2 = (536870912 & i10) != 0 ? new PushNotificationsBannerUseCase(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0) : pushNotificationsBannerUseCase;
        if ((1073741824 & i10) != 0) {
            Application application = Injector.get().getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            audioRecordingManager2 = new AudioRecordingManager(application, s0VarA2);
        } else {
            audioRecordingManager2 = audioRecordingManager;
        }
        AudioRecordingUseCase audioRecordingUseCase2 = (i10 & Integer.MIN_VALUE) != 0 ? new AudioRecordingUseCase(audioRecordingManager2, null, 2, null) : audioRecordingUseCase;
        this(str3, launchMode, articleMetadata2, str2, networkConnectivityMonitor2, soundPlayer2, s0Var3, s0VarA2, conversationRepository2, conversationReducer2, trackLastReceivedPartsUseCase2, recordOpenedInteractionUseCase2, soundEffectsUseCase2, sendSuggestionUseCase2, refreshUnreadConversationsCountUseCase2, refreshConversationUseCase2, appendPartToConversationUseCase2, openConversationUseCase2, sendMessageUseCase2, sendQuickReplyUseCase2, loadGifUseCase2, changeInputUseCase2, sendGifUseCase2, sendMediaUseCase2, updateFloatingIndicatorUseCase2, getNetworkState2, showAdminIsTypingUseCase2, submitAttributeUseCase2, fallbackPollingUseCase2, pushNotificationsBannerUseCase2, audioRecordingManager2, audioRecordingUseCase2, (i11 & 1) != 0 ? new VoiceTranscriptionUseCase(audioRecordingUseCase2, conversationRepository2) : voiceTranscriptionUseCase, (i11 & 2) != 0 ? new MarkUserContentAsSeenByAdmin() : markUserContentAsSeenByAdmin, (i11 & 4) != 0 ? new FinStreamingUseCase() : finStreamingUseCase, (i11 & 8) != 0 ? l1.c() : n0Var, (i11 & 16) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i11 & 32) != 0 ? Injector.get().getDataLayer() : intercomDataLayer, (i11 & 64) != 0 ? LumberMill.getLogger() : twig);
    }

    private final String getConversationContext() {
        return this.clientState.getValue().getConversationId() == null ? "new_conversation" : MetricTracker.Context.EXISTING_CONVERSATION;
    }

    private final void loadConversation() {
        k.f(g2.a(this), this.dispatcher, null, new C27861(null), 2, null);
    }

    private final void sendGif(MediaData.Gif gif) {
        k.f(g2.a(this), this.dispatcher, null, new C27961(gif, null), 2, null);
    }

    private final void sendMedia(MediaData.Media media) {
        k.f(g2.a(this), this.dispatcher, null, new C27971(media, null), 2, null);
    }

    public final void cancelVoiceRecording() {
        k.f(g2.a(this), this.dispatcher, null, new C27851(null), 2, null);
    }

    @NotNull
    public final z0<Float> getAmplitudeLevel() {
        return this.audioRecordingManager.getAmplitudeLevel();
    }

    @NotNull
    public final o0<ComposerUiEffect> getComposerUiEffect() {
        return this.composerUiEffect;
    }

    @Nullable
    public final String getConversationId() {
        return this.clientState.getValue().getConversationId();
    }

    @NotNull
    public final o0<ConversationUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    @NotNull
    public final z0<ConversationUiState> getUiState() {
        return this.uiState;
    }

    public final void loadGifs() {
        ConversationClientState value;
        k0<ConversationClientState> k0Var = this.clientState;
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, new BottomSheetState.GifSearch(CollectionsKt.emptyList()), null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194271, null)));
        k.f(g2.a(this), this.dispatcher, null, new C27872(null), 2, null);
    }

    @Override // androidx.lifecycle.f2
    protected void onCleared() {
        super.onCleared();
        int i10 = 0 >> 1;
        t0.f(this.nexusCoroutineScope, null, 1, null);
        t0.f(this.audioAmplitudeCoroutineScope, null, 1, null);
        this.audioRecordingManager.dispose();
    }

    public final void onConversationScrolled(@NotNull ConversationScrolledState conversationScrolledState) {
        ConversationClientState value;
        Intrinsics.checkNotNullParameter(conversationScrolledState, "conversationScrolledState");
        k0<ConversationClientState> k0Var = this.clientState;
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, conversationScrolledState.getScrolled(), false, null, null, 3932159, null)));
        this.updateFloatingIndicatorUseCase.invoke(this.clientState, conversationScrolledState);
    }

    public final void onGifSearchQueryChange(@NotNull String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.gifQueryStateFlow.setValue(new SearchQuery.Query(searchQuery));
    }

    public final void onInputChange(@NotNull ComposerInputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        k.f(g2.a(this), this.dispatcher, null, new C27881(inputType, null), 2, null);
    }

    public final void onJumpToBottomButtonClicked(int i10, int i11) {
        ConversationClientState value;
        FloatingIndicatorState floatingIndicatorState = this.clientState.getValue().getFloatingIndicatorState();
        if (floatingIndicatorState instanceof FloatingIndicatorState.JumpToBottomIndicator) {
            k0<ConversationClientState> k0Var = this.clientState;
            do {
                value = k0Var.getValue();
            } while (!k0Var.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, ((FloatingIndicatorState.JumpToBottomIndicator) floatingIndicatorState).copy(new JumpToBottomButtonState(0, i10, i11)), null, false, false, null, null, 4128767, null)));
        }
    }

    public final void onNetworkMessageDismissed() {
        ConversationClientState value;
        if (Intrinsics.areEqual(this.clientState.getValue().getNetworkState(), NetworkState.Reconnected.INSTANCE)) {
            k0<ConversationClientState> k0Var = this.clientState;
            do {
                value = k0Var.getValue();
            } while (!k0Var.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, NetworkState.Connected.INSTANCE, null, null, null, null, 0, 0, null, null, false, false, null, null, 4193791, null)));
        }
    }

    public final void onPause(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.networkConnectivityMonitor.stopListening(context);
        this.soundPlayer.release();
        this.resumedState.setValue(Boolean.FALSE);
        cancelVoiceRecording();
    }

    public final void onPrivacyNoticeDismissed() {
        ConversationClientState value;
        k0<ConversationClientState> k0Var = this.clientState;
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, true, null, null, 3670015, null)));
        this.conversationRepository.dismissPrivacyPolicy();
    }

    public final void onReplyOptionClicked(@NotNull ReplyOption replyOption) {
        Intrinsics.checkNotNullParameter(replyOption, "replyOption");
        int i10 = 5 << 0;
        k.f(g2.a(this), this.dispatcher, null, new C27891(replyOption, null), 2, null);
    }

    public final void onReportAiAnswer() {
        k.f(g2.a(this), this.dispatcher, null, new C27901(null), 2, null);
    }

    public final void onResume(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.networkConnectivityMonitor.startListening(context);
        this.soundPlayer.loadSounds(context);
        this.resumedState.setValue(Boolean.TRUE);
    }

    public final void onRetryClick() {
        ConversationClientState value;
        k0<ConversationClientState> k0Var = this.clientState;
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194175, null)));
        k.f(g2.a(this), this.dispatcher, null, new C27912(null), 2, null);
    }

    public final void onRetryMediaClicked(@NotNull PendingMessage.FailedImageUploadData failedImageUploadData) {
        Intrinsics.checkNotNullParameter(failedImageUploadData, "failedImageUploadData");
        k.f(g2.a(this), this.dispatcher, null, new C27921(failedImageUploadData, null), 2, null);
    }

    public final void onRetryMessageClicked(@NotNull Part part) {
        Intrinsics.checkNotNullParameter(part, "part");
        k.f(g2.a(this), this.dispatcher, null, new C27931(part, null), 2, null);
    }

    public final void onSubmitAttribute(@NotNull Attribute attribute, @NotNull String partId) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(partId, "partId");
        k.f(g2.a(this), this.dispatcher, null, new C27941(attribute, partId, null), 2, null);
    }

    public final void onSuggestionClick(@NotNull ReplySuggestion suggestion) {
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        k.f(g2.a(this), this.dispatcher, null, new C27951(suggestion, null), 2, null);
    }

    public final void onTyping() {
        String conversationId = this.clientState.getValue().getConversationId();
        if (conversationId != null) {
            this.conversationRepository.nexusEventsRepository().userTyping(conversationId);
        }
    }

    public final void sendAfterPreview(@NotNull MediaData mediaData) {
        Intrinsics.checkNotNullParameter(mediaData, "mediaData");
        if (mediaData instanceof MediaData.Media) {
            sendMedia((MediaData.Media) mediaData);
        } else {
            if (!(mediaData instanceof MediaData.Gif)) {
                throw new kotlin.k0();
            }
            sendGif((MediaData.Gif) mediaData);
        }
    }

    public final void sendMessage(@NotNull String messageText, boolean z10) {
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        k.f(g2.a(this), this.dispatcher, null, new C27981(messageText, null), 2, null);
        this.pushNotificationsBannerUseCase.invoke(this.clientState, z10);
    }

    public final void startVoiceRecording() {
        k.f(g2.a(this), this.dispatcher, null, new C27991(null), 2, null);
    }

    public final void stopVoiceRecordingAndTranscribe() {
        k.f(g2.a(this), this.dispatcher, null, new C28001(null), 2, null);
    }

    @l(message = "Use trackMetric instead")
    public final void trackClickedInput(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        MetricTracker metricTracker = this.metricTracker;
        String conversationId = this.clientState.getValue().getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        metricTracker.clickedInput(conversationId, input);
    }

    public final void trackMetric(@NotNull MetricData metricData) {
        Intrinsics.checkNotNullParameter(metricData, "metricData");
        if (metricData instanceof MetricData.MoreMenuClicked) {
            this.metricTracker.moreMenuClicked(getConversationContext());
            return;
        }
        if (metricData instanceof MetricData.ConversationsInMoreMenuClicked) {
            this.metricTracker.conversationsInMoreMenuClicked(((MetricData.ConversationsInMoreMenuClicked) metricData).isMoreMenuContext() ? "more_menu" : getConversationContext());
            return;
        }
        if (metricData instanceof MetricData.NewConversationInMoreMenuClicked) {
            this.metricTracker.newConversationInMoreMenuClicked(((MetricData.NewConversationInMoreMenuClicked) metricData).isMoreMenuContext() ? "more_menu" : getConversationContext());
            return;
        }
        if (metricData instanceof MetricData.TicketsInMoreMenuClicked) {
            this.metricTracker.ticketsInMoreMenuClicked(((MetricData.TicketsInMoreMenuClicked) metricData).isMoreMenuContext() ? "more_menu" : getConversationContext());
            return;
        }
        if (Intrinsics.areEqual(metricData, MetricData.HelpInMoreMenuClicked.INSTANCE)) {
            this.metricTracker.helpInMoreMenuClicked(getConversationContext());
            return;
        }
        if (Intrinsics.areEqual(metricData, MetricData.PoweredByClicked.INSTANCE)) {
            this.metricTracker.clickedPoweredBy("conversation");
            return;
        }
        if (!(metricData instanceof MetricData.ComposerInputClicked)) {
            throw new kotlin.k0();
        }
        MetricTracker metricTracker = this.metricTracker;
        String conversationId = this.clientState.getValue().getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        metricTracker.clickedInput(conversationId, ((MetricData.ComposerInputClicked) metricData).getInput());
    }

    public final void updateBottomSheet(@NotNull BottomSheetState bottomSheetState) {
        BottomSheetState bottomSheetState2 = bottomSheetState;
        Intrinsics.checkNotNullParameter(bottomSheetState2, "bottomSheetState");
        k0<ConversationClientState> k0Var = this.clientState;
        while (true) {
            ConversationClientState value = k0Var.getValue();
            if (k0Var.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, bottomSheetState2, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194271, null))) {
                return;
            } else {
                bottomSheetState2 = bottomSheetState;
            }
        }
    }

    public final void updatePushNotificationsBanner(boolean z10, boolean z11) {
        this.intercomDataLayer.updatePushNotificationsBannerDismissed(z10);
        this.pushNotificationsBannerUseCase.invoke(this.clientState, z11);
    }

    public final void updateTranscribedText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int i10 = 1 << 0;
        k.f(g2.a(this), this.dispatcher, null, new C28011(text, null), 2, null);
    }

    public ConversationViewModel(@Nullable String str, @NotNull LaunchMode launchMode, @Nullable ArticleMetadata articleMetadata, @NotNull String initialMessage, @NotNull NetworkConnectivityMonitor networkConnectivityMonitor, @NotNull SoundPlayer soundPlayer, @NotNull s0 nexusCoroutineScope, @NotNull s0 audioAmplitudeCoroutineScope, @NotNull ConversationRepository conversationRepository, @NotNull final ConversationReducer conversationReducer, @NotNull TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, @NotNull RecordOpenedInteractionUseCase recordOpenedInteractionUseCase, @NotNull SoundEffectsUseCase soundEffectsUseCase, @NotNull SendSuggestionUseCase sendSuggestionUseCase, @NotNull RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, @NotNull RefreshConversationUseCase refreshConversationUseCase, @NotNull AppendPartToConversationUseCase appendPartToConversationUseCase, @NotNull OpenConversationUseCase openConversationUseCase, @NotNull SendMessageUseCase sendMessageUseCase, @NotNull SendQuickReplyUseCase sendQuickReplyUseCase, @NotNull LoadGifUseCase loadGifUseCase, @NotNull ChangeInputUseCase changeInputUseCase, @NotNull SendGifUseCase sendGifUseCase, @NotNull SendMediaUseCase sendMediaUseCase, @NotNull UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase, @NotNull GetNetworkState getNetworkState, @NotNull ShowAdminIsTypingUseCase adminIsTypingUseCase, @NotNull SubmitAttributeUseCase submitAttributeUseCase, @NotNull FallbackPollingUseCase fallbackPollingUseCase, @NotNull PushNotificationsBannerUseCase pushNotificationsBannerUseCase, @NotNull AudioRecordingManager audioRecordingManager, @NotNull AudioRecordingUseCase audioRecordingUseCase, @NotNull VoiceTranscriptionUseCase voiceTranscriptionUseCase, @NotNull MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin, @NotNull FinStreamingUseCase finStreamingUseCase, @NotNull n0 dispatcher, @NotNull MetricTracker metricTracker, @NotNull IntercomDataLayer intercomDataLayer, @NotNull Twig twig) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(initialMessage, "initialMessage");
        Intrinsics.checkNotNullParameter(networkConnectivityMonitor, "networkConnectivityMonitor");
        Intrinsics.checkNotNullParameter(soundPlayer, "soundPlayer");
        Intrinsics.checkNotNullParameter(nexusCoroutineScope, "nexusCoroutineScope");
        Intrinsics.checkNotNullParameter(audioAmplitudeCoroutineScope, "audioAmplitudeCoroutineScope");
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(conversationReducer, "conversationReducer");
        Intrinsics.checkNotNullParameter(trackLastReceivedPartsUseCase, "trackLastReceivedPartsUseCase");
        Intrinsics.checkNotNullParameter(recordOpenedInteractionUseCase, "recordOpenedInteractionUseCase");
        Intrinsics.checkNotNullParameter(soundEffectsUseCase, "soundEffectsUseCase");
        Intrinsics.checkNotNullParameter(sendSuggestionUseCase, "sendSuggestionUseCase");
        Intrinsics.checkNotNullParameter(refreshUnreadConversationsCountUseCase, "refreshUnreadConversationsCountUseCase");
        Intrinsics.checkNotNullParameter(refreshConversationUseCase, "refreshConversationUseCase");
        Intrinsics.checkNotNullParameter(appendPartToConversationUseCase, "appendPartToConversationUseCase");
        Intrinsics.checkNotNullParameter(openConversationUseCase, "openConversationUseCase");
        Intrinsics.checkNotNullParameter(sendMessageUseCase, "sendMessageUseCase");
        Intrinsics.checkNotNullParameter(sendQuickReplyUseCase, "sendQuickReplyUseCase");
        Intrinsics.checkNotNullParameter(loadGifUseCase, "loadGifUseCase");
        Intrinsics.checkNotNullParameter(changeInputUseCase, "changeInputUseCase");
        Intrinsics.checkNotNullParameter(sendGifUseCase, "sendGifUseCase");
        Intrinsics.checkNotNullParameter(sendMediaUseCase, "sendMediaUseCase");
        Intrinsics.checkNotNullParameter(updateFloatingIndicatorUseCase, "updateFloatingIndicatorUseCase");
        Intrinsics.checkNotNullParameter(getNetworkState, "getNetworkState");
        Intrinsics.checkNotNullParameter(adminIsTypingUseCase, "adminIsTypingUseCase");
        Intrinsics.checkNotNullParameter(submitAttributeUseCase, "submitAttributeUseCase");
        Intrinsics.checkNotNullParameter(fallbackPollingUseCase, "fallbackPollingUseCase");
        Intrinsics.checkNotNullParameter(pushNotificationsBannerUseCase, "pushNotificationsBannerUseCase");
        Intrinsics.checkNotNullParameter(audioRecordingManager, "audioRecordingManager");
        Intrinsics.checkNotNullParameter(audioRecordingUseCase, "audioRecordingUseCase");
        Intrinsics.checkNotNullParameter(voiceTranscriptionUseCase, "voiceTranscriptionUseCase");
        Intrinsics.checkNotNullParameter(markUserContentAsSeenByAdmin, "markUserContentAsSeenByAdmin");
        Intrinsics.checkNotNullParameter(finStreamingUseCase, "finStreamingUseCase");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(twig, "twig");
        this.initialConversationId = str;
        this.launchMode = launchMode;
        this.articleMetadata = articleMetadata;
        this.networkConnectivityMonitor = networkConnectivityMonitor;
        this.soundPlayer = soundPlayer;
        this.nexusCoroutineScope = nexusCoroutineScope;
        this.audioAmplitudeCoroutineScope = audioAmplitudeCoroutineScope;
        this.conversationRepository = conversationRepository;
        this.conversationReducer = conversationReducer;
        this.trackLastReceivedPartsUseCase = trackLastReceivedPartsUseCase;
        this.recordOpenedInteractionUseCase = recordOpenedInteractionUseCase;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.sendSuggestionUseCase = sendSuggestionUseCase;
        this.refreshUnreadConversationsCountUseCase = refreshUnreadConversationsCountUseCase;
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.appendPartToConversationUseCase = appendPartToConversationUseCase;
        this.openConversationUseCase = openConversationUseCase;
        this.sendMessageUseCase = sendMessageUseCase;
        this.sendQuickReplyUseCase = sendQuickReplyUseCase;
        this.loadGifUseCase = loadGifUseCase;
        this.changeInputUseCase = changeInputUseCase;
        this.sendGifUseCase = sendGifUseCase;
        this.sendMediaUseCase = sendMediaUseCase;
        this.updateFloatingIndicatorUseCase = updateFloatingIndicatorUseCase;
        this.adminIsTypingUseCase = adminIsTypingUseCase;
        this.submitAttributeUseCase = submitAttributeUseCase;
        this.fallbackPollingUseCase = fallbackPollingUseCase;
        this.pushNotificationsBannerUseCase = pushNotificationsBannerUseCase;
        this.audioRecordingManager = audioRecordingManager;
        this.audioRecordingUseCase = audioRecordingUseCase;
        this.voiceTranscriptionUseCase = voiceTranscriptionUseCase;
        this.markUserContentAsSeenByAdmin = markUserContentAsSeenByAdmin;
        this.finStreamingUseCase = finStreamingUseCase;
        this.dispatcher = dispatcher;
        this.metricTracker = metricTracker;
        this.intercomDataLayer = intercomDataLayer;
        this.twig = twig;
        String decodedInitialMessage = Uri.decode(initialMessage);
        this.decodedInitialMessage = decodedInitialMessage;
        Intrinsics.checkNotNullExpressionValue(decodedInitialMessage, "decodedInitialMessage");
        final k0<ConversationClientState> k0VarA = b1.a(new ConversationClientState(null, null, str, null, new ComposerState.TextInput(decodedInitialMessage, new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, null, null, 28, null), null, launchMode, null, articleMetadata, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4193963, null));
        this.clientState = k0VarA;
        i<ConversationUiState> iVar = new i<ConversationUiState>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModel\n*L\n1#1,218:1\n50#2:219\n201#3:220\n*E\n"})
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;
                final /* synthetic */ ConversationReducer receiver$inlined;

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar, ConversationReducer conversationReducer) {
                    this.$this_unsafeFlow = jVar;
                    this.receiver$inlined = conversationReducer;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.j
                @Nullable
                public final Object emit(Object obj, @NotNull d dVar) {
                    AnonymousClass1 anonymousClass1;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objL = b.l();
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        ResultKt.m(obj2);
                        j jVar = this.$this_unsafeFlow;
                        ConversationUiState conversationUiStateComputeUiState$intercom_sdk_base_release = this.receiver$inlined.computeUiState$intercom_sdk_base_release((ConversationClientState) obj);
                        anonymousClass1.label = 1;
                        if (jVar.emit(conversationUiStateComputeUiState$intercom_sdk_base_release, anonymousClass1) == objL) {
                            return objL;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj2);
                    }
                    return Unit.f312394a;
                }
            }

            @Override // kotlinx.coroutines.flow.i
            @Nullable
            public Object collect(@NotNull j<? super ConversationUiState> jVar, @NotNull d dVar) {
                Object objCollect = k0VarA.collect(new AnonymousClass2(jVar, conversationReducer), dVar);
                return objCollect == b.l() ? objCollect : Unit.f312394a;
            }
        };
        s0 s0VarA = g2.a(this);
        u0.a aVar = u0.f314834a;
        this.uiState = kotlinx.coroutines.flow.k.Q1(iVar, s0VarA, u0.a.b(aVar, 5000L, 0L, 2, null), InitialStateReducerKt.reduceInitialState(k0VarA.getValue().getLaunchMode()));
        this.gifQueryStateFlow = b1.a(SearchQuery.None.INSTANCE);
        j0<ConversationUiEffect> j0VarB = q0.b(0, 0, null, 7, null);
        this._uiEffect = j0VarB;
        this.uiEffect = f0.h(j0VarB, g2.a(this), aVar.c(), 0, 4, null);
        j0<ComposerUiEffect> j0VarB2 = q0.b(0, 0, null, 7, null);
        this._composerUiEffect = j0VarB2;
        this.composerUiEffect = f0.h(j0VarB2, g2.a(this), aVar.c(), 0, 4, null);
        this.resumedState = b1.a(Boolean.FALSE);
        k.f(g2.a(this), dispatcher, null, new AnonymousClass1(null), 2, null);
        k.f(g2.a(this), dispatcher, null, new AnonymousClass2(null), 2, null);
        k.f(g2.a(this), dispatcher, null, new AnonymousClass3(null), 2, null);
        k.f(g2.a(this), dispatcher, null, new AnonymousClass4(null), 2, null);
        k.f(g2.a(this), null, null, new AnonymousClass5(null), 3, null);
        k.f(g2.a(this), dispatcher, null, new AnonymousClass6(getNetworkState, this, null), 2, null);
        k.f(g2.a(this), dispatcher, null, new AnonymousClass7(null), 2, null);
        if (str == null) {
            Injector.get().getDataLayer().clearOpenResponse();
        }
        loadConversation();
    }
}
