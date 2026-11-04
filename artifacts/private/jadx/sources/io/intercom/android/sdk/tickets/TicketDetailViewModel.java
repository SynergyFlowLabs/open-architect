package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTicketDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketDetailViewModel.kt\nio/intercom/android/sdk/tickets/TicketDetailViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,173:1\n1557#2:174\n1628#2,3:175\n*S KotlinDebug\n*F\n+ 1 TicketDetailViewModel.kt\nio/intercom/android/sdk/tickets/TicketDetailViewModel\n*L\n59#1:174\n59#1:175,3\n*E\n"})
public final class TicketDetailViewModel extends f2 {

    @NotNull
    private final kotlinx.coroutines.flow.k0<TicketDetailState> _stateFlow;

    @NotNull
    private final kotlinx.coroutines.n0 dispatcher;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    @NotNull
    private final TicketLaunchedFrom launchedFrom;
    private boolean metricSent;

    @NotNull
    private final MetricTracker metricTracker;

    @NotNull
    private final TicketRepository repository;

    @NotNull
    private final z0<TicketDetailState> stateFlow;

    @Nullable
    private String ticketId;

    @NotNull
    private final UserIdentity user;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2", f = "TicketDetailViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160702k0}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTicketDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketDetailViewModel.kt\nio/intercom/android/sdk/tickets/TicketDetailViewModel$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,173:1\n32#2:174\n17#2:175\n19#2:179\n17#2:180\n19#2:184\n46#3:176\n51#3:178\n46#3:181\n51#3:183\n105#4:177\n105#4:182\n*S KotlinDebug\n*F\n+ 1 TicketDetailViewModel.kt\nio/intercom/android/sdk/tickets/TicketDetailViewModel$2\n*L\n84#1:174\n84#1:175\n84#1:179\n85#1:180\n85#1:184\n84#1:176\n84#1:178\n85#1:181\n85#1:183\n84#1:177\n85#1:182\n*E\n"})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return TicketDetailViewModel.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final kotlinx.coroutines.flow.i<ParsedNexusEvent> iVarRealTimeEvents = TicketDetailViewModel.this.repository.realTimeEvents();
                final kotlinx.coroutines.flow.i<Object> iVar = new kotlinx.coroutines.flow.i<Object>() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                        final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "TicketDetailViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(kotlin.coroutines.d dVar) {
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

                        public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
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
                            Object objL = kotlin.coroutines.intrinsics.b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                kotlinx.coroutines.flow.j jVar = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment) {
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
                    public Object collect(@NotNull kotlinx.coroutines.flow.j<? super Object> jVar, @NotNull kotlin.coroutines.d dVar) {
                        Object objCollect = iVarRealTimeEvents.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final TicketDetailViewModel ticketDetailViewModel = TicketDetailViewModel.this;
                kotlinx.coroutines.flow.i<ParsedNexusEvent.ConversationNexusEvent.NewComment> iVar2 = new kotlinx.coroutines.flow.i<ParsedNexusEvent.ConversationNexusEvent.NewComment>() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TicketDetailViewModel.kt\nio/intercom/android/sdk/tickets/TicketDetailViewModel$2\n*L\n1#1,218:1\n18#2:219\n19#2:221\n85#3:220\n*E\n"})
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                        final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;
                        final /* synthetic */ TicketDetailViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "TicketDetailViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(kotlin.coroutines.d dVar) {
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

                        public AnonymousClass2(kotlinx.coroutines.flow.j jVar, TicketDetailViewModel ticketDetailViewModel) {
                            this.$this_unsafeFlow = jVar;
                            this.this$0 = ticketDetailViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
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
                            Object objL = kotlin.coroutines.intrinsics.b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                kotlinx.coroutines.flow.j jVar = this.$this_unsafeFlow;
                                ParsedNexusEvent.ConversationNexusEvent.NewComment newComment = (ParsedNexusEvent.ConversationNexusEvent.NewComment) obj;
                                String ticketId = newComment.getTicketId();
                                if (ticketId != null && !StringsKt.w3(ticketId) && Intrinsics.areEqual(newComment.getTicketId(), this.this$0.ticketId)) {
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
                    public Object collect(@NotNull kotlinx.coroutines.flow.j<? super ParsedNexusEvent.ConversationNexusEvent.NewComment> jVar, @NotNull kotlin.coroutines.d dVar) {
                        Object objCollect = iVar.collect(new AnonymousClass2(jVar, ticketDetailViewModel), dVar);
                        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final TicketDetailViewModel ticketDetailViewModel2 = TicketDetailViewModel.this;
                kotlinx.coroutines.flow.j<? super ParsedNexusEvent.ConversationNexusEvent.NewComment> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel.2.2
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent.NewComment) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent.NewComment newComment, kotlin.coroutines.d<? super Unit> dVar) {
                        TicketDetailViewModel ticketDetailViewModel3 = ticketDetailViewModel2;
                        String str = ticketDetailViewModel3.ticketId;
                        Intrinsics.checkNotNull(str);
                        ticketDetailViewModel3.fetchTicketDetail$intercom_sdk_base_release(str);
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.sdk.tickets.TicketDetailViewModel$Companion$factory$1] */
        private final TicketDetailViewModel$Companion$factory$1 factory(final TicketLaunchedFrom ticketLaunchedFrom) {
            return new j2.c() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$Companion$factory$1
                @Override // androidx.lifecycle.j2.c
                public <T extends f2> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new TicketDetailViewModel(ticketLaunchedFrom, null, null, null, null, null, 62, null);
                }
            };
        }

        @NotNull
        public final TicketDetailViewModel create(@NotNull m2 owner, @NotNull TicketLaunchedFrom launchedFrom) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(launchedFrom, "launchedFrom");
            return (TicketDetailViewModel) new j2(owner, factory(launchedFrom)).c(TicketDetailViewModel.class);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$markAsReadIfNecessary$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$markAsReadIfNecessary$1", f = "TicketDetailViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160706l1}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Ticket $ticket;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ticket ticket, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$ticket = ticket;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return TicketDetailViewModel.this.new AnonymousClass1(this.$ticket, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                TicketRepository ticketRepository = TicketDetailViewModel.this.repository;
                String id2 = this.$ticket.getId();
                this.label = 1;
                if (ticketRepository.markAsRead(id2, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ TicketDetailViewModel(TicketLaunchedFrom ticketLaunchedFrom, UserIdentity userIdentity, MetricTracker metricTracker, TicketRepository ticketRepository, kotlinx.coroutines.n0 n0Var, IntercomDataLayer intercomDataLayer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(ticketLaunchedFrom, (i10 & 2) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i10 & 4) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i10 & 8) != 0 ? new TicketRepository(null, null, null, null, null, 31, null) : ticketRepository, (i10 & 16) != 0 ? l1.c() : n0Var, (i10 & 32) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireMetricIfNecessary(Ticket ticket) {
        if (this.metricSent) {
            return;
        }
        MetricTracker metricTracker = this.metricTracker;
        Integer numValueOf = Integer.valueOf(ticket.getTicketTypeId());
        String conversationId = ticket.getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        metricTracker.viewedTicketDetails(numValueOf, conversationId, ticket.getCurrentStatus().getType(), this.launchedFrom.getFrom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AvatarWrapper> getActiveAdminsAvatars() {
        List<Participant> builtActiveAdmins = this.intercomDataLayer.getTeamPresence().getValue().getBuiltActiveAdmins();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(builtActiveAdmins, 10));
        for (Participant participant : builtActiveAdmins) {
            Avatar avatar = participant.getAvatar();
            Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
            Boolean boolIsBot = participant.isBot();
            Intrinsics.checkNotNullExpressionValue(boolIsBot, "isBot(...)");
            arrayList.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markAsReadIfNecessary(Ticket ticket) {
        if (Intrinsics.areEqual(ticket.isRead(), Boolean.FALSE)) {
            kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new AnonymousClass1(ticket, null), 2, null);
        }
    }

    @androidx.annotation.l1
    public final void fetchTicketDetail$intercom_sdk_base_release(@NotNull String ticketId) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        if (StringsKt.w3(ticketId)) {
            this._stateFlow.setValue(new TicketDetailState.Error(new ErrorState.WithoutCTA(0, 0, Integer.valueOf(R.string.intercom_error_loading_ticket), 3, null)));
        } else {
            kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new TicketDetailViewModel$fetchTicketDetail$1(this, ticketId, null), 2, null);
        }
    }

    @NotNull
    public final z0<TicketDetailState> getStateFlow() {
        return this.stateFlow;
    }

    public TicketDetailViewModel(@NotNull TicketLaunchedFrom launchedFrom, @NotNull UserIdentity user, @NotNull MetricTracker metricTracker, @NotNull TicketRepository repository, @NotNull kotlinx.coroutines.n0 dispatcher, @NotNull IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(launchedFrom, "launchedFrom");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.launchedFrom = launchedFrom;
        this.user = user;
        this.metricTracker = metricTracker;
        this.repository = repository;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        kotlinx.coroutines.flow.k0<TicketDetailState> k0VarA = b1.a(TicketDetailState.Initial.INSTANCE);
        this._stateFlow = k0VarA;
        this.stateFlow = k0VarA;
        if (launchedFrom instanceof TicketLaunchedFrom.Conversation) {
            fireMetricIfNecessary(((TicketLaunchedFrom.Conversation) launchedFrom).getTicket());
            markAsReadIfNecessary(((TicketLaunchedFrom.Conversation) launchedFrom).getTicket());
            Ticket ticket = ((TicketLaunchedFrom.Conversation) launchedFrom).getTicket();
            this.ticketId = ticket.getId();
            k0VarA.setValue(TicketDetailReducerKt.computeTicketViewState(ticket, user, getActiveAdminsAvatars(), launchedFrom));
        } else {
            if (!(launchedFrom instanceof TicketLaunchedFrom.Other)) {
                throw new kotlin.k0();
            }
            fetchTicketDetail$intercom_sdk_base_release(((TicketLaunchedFrom.Other) launchedFrom).getTicketId());
        }
        kotlinx.coroutines.k.f(g2.a(this), null, null, new AnonymousClass2(null), 3, null);
    }
}
