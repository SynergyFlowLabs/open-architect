package io.intercom.android.sdk.m5.inbox;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import androidx.paging.h2;
import androidx.paging.v1;
import androidx.paging.w1;
import androidx.paging.x1;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.m5.inbox.data.InboxRepository;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.f0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.u0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class InboxViewModel extends f2 {

    @NotNull
    private final j0<InboxUiEffects> _effect;

    @NotNull
    private final CommonRepository commonRepository;

    @NotNull
    private final n0 dispatcher;

    @NotNull
    private final o0<InboxUiEffects> effect;

    @NotNull
    private EmptyState emptyState;

    @NotNull
    private final i<x1<Conversation>> inboxPagingData;

    @NotNull
    private final InboxRepository inboxRepository;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$1", f = "InboxViewModel.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nInboxViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboxViewModel.kt\nio/intercom/android/sdk/m5/inbox/InboxViewModel$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,102:1\n32#2:103\n17#2:104\n19#2:108\n17#2:109\n19#2:113\n46#3:105\n51#3:107\n46#3:110\n51#3:112\n105#4:106\n105#4:111\n*S KotlinDebug\n*F\n+ 1 InboxViewModel.kt\nio/intercom/android/sdk/m5/inbox/InboxViewModel$1\n*L\n70#1:103\n70#1:104\n70#1:108\n71#1:109\n71#1:113\n70#1:105\n70#1:107\n71#1:110\n71#1:112\n70#1:106\n71#1:111\n*E\n"})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return InboxViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final i<ParsedNexusEvent> iVarRealTimeEvents = InboxViewModel.this.inboxRepository.realTimeEvents();
                final i<Object> iVar = new i<Object>() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @f(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "InboxViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
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
                i<ParsedNexusEvent.ConversationNexusEvent> iVar2 = new i<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 InboxViewModel.kt\nio/intercom/android/sdk/m5/inbox/InboxViewModel$1\n*L\n1#1,218:1\n18#2:219\n19#2:221\n71#3:220\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @f(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filter$1$2", f = "InboxViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
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
                };
                final InboxViewModel inboxViewModel = InboxViewModel.this;
                j<? super ParsedNexusEvent.ConversationNexusEvent> jVar = new j() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel.1.2
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, d<? super Unit> dVar) {
                        Object objEmit = inboxViewModel._effect.emit(InboxUiEffects.RefreshInbox.INSTANCE, dVar);
                        return objEmit == b.l() ? objEmit : Unit.f312394a;
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

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.sdk.m5.inbox.InboxViewModel$Companion$factory$1] */
        private final InboxViewModel$Companion$factory$1 factory() {
            return new j2.c() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$Companion$factory$1
                @Override // androidx.lifecycle.j2.c
                public <T extends f2> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new InboxViewModel(null, null, null, null, 15, null);
                }
            };
        }

        @NotNull
        public final InboxViewModel create(@NotNull m2 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return (InboxViewModel) new j2(owner, factory()).c(InboxViewModel.class);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$onConversationClick$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$onConversationClick$1", f = "InboxViewModel.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    static final class C28221 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Conversation $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28221(Conversation conversation, d<? super C28221> dVar) {
            super(2, dVar);
            this.$it = conversation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return InboxViewModel.this.new C28221(this.$it, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0 j0Var = InboxViewModel.this._effect;
                InboxUiEffects.NavigateToConversation navigateToConversation = new InboxUiEffects.NavigateToConversation(this.$it);
                this.label = 1;
                if (j0Var.emit(navigateToConversation, this) == objL) {
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
            return ((C28221) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public InboxViewModel() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h2 inboxPagingData$lambda$0(InboxViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new InboxPagingSource(this$0.inboxRepository, this$0.intercomDataLayer, new InboxViewModel$inboxPagingData$1$1(this$0, null));
    }

    @NotNull
    public final o0<InboxUiEffects> getEffect() {
        return this.effect;
    }

    @NotNull
    public final EmptyState getEmptyState() {
        return this.emptyState;
    }

    @NotNull
    public final i<x1<Conversation>> getInboxPagingData() {
        return this.inboxPagingData;
    }

    public final void onConversationClick(@NotNull Conversation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k.f(g2.a(this), this.dispatcher, null, new C28221(it, null), 2, null);
    }

    public /* synthetic */ InboxViewModel(InboxRepository inboxRepository, n0 n0Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            inboxRepository = new InboxRepository(null, null, null, 7, null);
        }
        n0Var = (i10 & 2) != 0 ? l1.c() : n0Var;
        intercomDataLayer = (i10 & 4) != 0 ? Injector.get().getDataLayer() : intercomDataLayer;
        if ((i10 & 8) != 0) {
            MessengerApi messengerApi = Injector.get().getMessengerApi();
            Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
            commonRepository = new CommonRepository(messengerApi, intercomDataLayer);
        }
        this(inboxRepository, n0Var, intercomDataLayer, commonRepository);
    }

    public InboxViewModel(@NotNull InboxRepository inboxRepository, @NotNull n0 dispatcher, @NotNull IntercomDataLayer intercomDataLayer, @NotNull CommonRepository commonRepository) {
        Intrinsics.checkNotNullParameter(inboxRepository, "inboxRepository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        this.inboxRepository = inboxRepository;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        this.emptyState = EmptyState.Companion.getNULL();
        int i10 = 6 | 0;
        this.inboxPagingData = androidx.paging.j.a(new v1(new w1(20, 0, false, 0, 0, 0, 58, null), null, new Function0() { // from class: io.intercom.android.sdk.m5.inbox.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InboxViewModel.inboxPagingData$lambda$0(this.f292949a);
            }
        }, 2, null).a(), g2.a(this));
        j0<InboxUiEffects> j0VarB = q0.b(0, 0, null, 7, null);
        this._effect = j0VarB;
        this.effect = f0.h(j0VarB, g2.a(this), u0.f314834a.c(), 0, 4, null);
        k.f(g2.a(this), null, null, new AnonymousClass1(null), 3, null);
    }
}
