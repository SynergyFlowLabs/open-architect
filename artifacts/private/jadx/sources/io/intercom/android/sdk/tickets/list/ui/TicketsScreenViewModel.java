package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import androidx.paging.c2;
import androidx.paging.h2;
import androidx.paging.v1;
import androidx.paging.w1;
import androidx.paging.x1;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.list.data.TicketsPagingSource;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.f0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.u0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTicketsScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketsScreenViewModel.kt\nio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,81:1\n49#2:82\n51#2:86\n46#3:83\n51#3:85\n105#4:84\n*S KotlinDebug\n*F\n+ 1 TicketsScreenViewModel.kt\nio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel\n*L\n36#1:82\n36#1:86\n36#1:83\n36#1:85\n36#1:84\n*E\n"})
public final class TicketsScreenViewModel extends f2 {

    @NotNull
    private final j0<TicketsScreenEffects> _effect;

    @NotNull
    private final o0<TicketsScreenEffects> effect;

    @NotNull
    private final kotlinx.coroutines.flow.i<x1<TicketRowData>> pagerFlow;

    @NotNull
    private final TicketRepository repository;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2", f = "TicketsScreenViewModel.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTicketsScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketsScreenViewModel.kt\nio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,81:1\n32#2:82\n17#2:83\n19#2:87\n17#2:88\n19#2:92\n46#3:84\n51#3:86\n46#3:89\n51#3:91\n105#4:85\n105#4:90\n*S KotlinDebug\n*F\n+ 1 TicketsScreenViewModel.kt\nio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel$2\n*L\n47#1:82\n47#1:83\n47#1:87\n48#1:88\n48#1:92\n47#1:84\n47#1:86\n48#1:89\n48#1:91\n47#1:85\n48#1:90\n*E\n"})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return TicketsScreenViewModel.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final kotlinx.coroutines.flow.i<ParsedNexusEvent> iVarRealTimeEvents = TicketsScreenViewModel.this.repository.realTimeEvents();
                final kotlinx.coroutines.flow.i<Object> iVar = new kotlinx.coroutines.flow.i<Object>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                        final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "TicketsScreenViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
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

                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
                kotlinx.coroutines.flow.i<ParsedNexusEvent.ConversationNexusEvent.NewComment> iVar2 = new kotlinx.coroutines.flow.i<ParsedNexusEvent.ConversationNexusEvent.NewComment>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TicketsScreenViewModel.kt\nio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel$2\n*L\n1#1,218:1\n18#2:219\n19#2:221\n48#3:220\n*E\n"})
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                        final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "TicketsScreenViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
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

                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
                                String ticketId = ((ParsedNexusEvent.ConversationNexusEvent.NewComment) obj).getTicketId();
                                if (!(ticketId == null || ticketId.length() == 0)) {
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
                        Object objCollect = iVar.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final TicketsScreenViewModel ticketsScreenViewModel = TicketsScreenViewModel.this;
                kotlinx.coroutines.flow.j<? super ParsedNexusEvent.ConversationNexusEvent.NewComment> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel.2.2
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent.NewComment) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent.NewComment newComment, kotlin.coroutines.d<? super Unit> dVar) {
                        Object objEmit = ticketsScreenViewModel._effect.emit(TicketsScreenEffects.RefreshTickets.INSTANCE, dVar);
                        return objEmit == kotlin.coroutines.intrinsics.b.l() ? objEmit : Unit.f312394a;
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

        /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$Companion$factory$1] */
        private final TicketsScreenViewModel$Companion$factory$1 factory() {
            return new j2.c() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$Companion$factory$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.j2.c
                public <T extends f2> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new TicketsScreenViewModel(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }
            };
        }

        @NotNull
        public final TicketsScreenViewModel create(@NotNull m2 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return (TicketsScreenViewModel) new j2(owner, factory()).c(TicketsScreenViewModel.class);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TicketsScreenViewModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h2 _init_$lambda$0(TicketRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "$repository");
        return new TicketsPagingSource(repository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pagerFlow$lambda$1$reduceTicketRowData(Ticket ticket, kotlin.coroutines.d dVar) {
        return TicketRowReducerKt.reduceTicketRowData(ticket);
    }

    @NotNull
    public final o0<TicketsScreenEffects> getEffect() {
        return this.effect;
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<x1<TicketRowData>> getPagerFlow() {
        return this.pagerFlow;
    }

    public /* synthetic */ TicketsScreenViewModel(final TicketRepository ticketRepository, v1 v1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            ticketRepository = new TicketRepository(null, null, null, null, null, 31, null);
        }
        if ((i10 & 2) != 0) {
            int i11 = 3 | 0;
            v1Var = new v1(new w1(10, 0, false, 0, 0, 0, 58, null), null, new Function0() { // from class: io.intercom.android.sdk.tickets.list.ui.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TicketsScreenViewModel._init_$lambda$0(ticketRepository);
                }
            }, 2, null);
        }
        this(ticketRepository, v1Var);
    }

    public TicketsScreenViewModel(@NotNull TicketRepository repository, @NotNull v1<Long, Ticket> pager) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pager, "pager");
        this.repository = repository;
        final kotlinx.coroutines.flow.i<x1<Ticket>> iVarA = pager.a();
        this.pagerFlow = androidx.paging.j.a(new kotlinx.coroutines.flow.i<x1<TicketRowData>>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TicketsScreenViewModel.kt\nio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel\n*L\n1#1,218:1\n50#2:219\n37#3:220\n*E\n"})
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2", f = "TicketsScreenViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
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

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
                        x1 x1VarK = c2.k((x1) obj, TicketsScreenViewModel$pagerFlow$1$1.INSTANCE);
                        anonymousClass1.label = 1;
                        if (jVar.emit(x1VarK, anonymousClass1) == objL) {
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
            public Object collect(@NotNull kotlinx.coroutines.flow.j<? super x1<TicketRowData>> jVar, @NotNull kotlin.coroutines.d dVar) {
                Object objCollect = iVarA.collect(new AnonymousClass2(jVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
            }
        }, g2.a(this));
        int i10 = 3 << 7;
        j0<TicketsScreenEffects> j0VarB = q0.b(0, 0, null, 7, null);
        this._effect = j0VarB;
        this.effect = f0.h(j0VarB, g2.a(this), u0.f314834a.c(), 0, 4, null);
        kotlinx.coroutines.k.f(g2.a(this), null, null, new AnonymousClass2(null), 3, null);
    }
}
