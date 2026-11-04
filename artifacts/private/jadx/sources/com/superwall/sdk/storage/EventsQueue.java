package com.superwall.sdk.storage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.analytics.internal.trackable.Trackable;
import com.superwall.sdk.analytics.internal.trackable.UserInitiatedEvent;
import com.superwall.sdk.config.ConfigManager;
import com.superwall.sdk.config.options.SuperwallOptions;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.misc.MainScope;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.events.EventsRequest;
import com.superwall.sdk.network.Network;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class EventsQueue extends BroadcastReceiver implements s0 {

    @NotNull
    private final ConfigManager configManager;

    @NotNull
    private final Context context;

    @NotNull
    private final CoroutineContext coroutineContext;

    @NotNull
    private List<EventData> elements;

    @NotNull
    private final IOScope ioScope;

    @Nullable
    private p2 job;

    @NotNull
    private final MainScope mainScope;
    private final int maxEventCount;

    @NotNull
    private final Network network;

    @NotNull
    private final j0<Long> timer;

    /* JADX INFO: renamed from: com.superwall.sdk.storage.EventsQueue$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.storage.EventsQueue$1", f = "EventsQueue.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return EventsQueue.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                EventsQueue eventsQueue = EventsQueue.this;
                this.label = 1;
                if (eventsQueue.setupTimer(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            EventsQueue.this.addObserver();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.EventsQueue$enqueue$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.EventsQueue$enqueue$1", f = "EventsQueue.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27261 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ EventData $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27261(EventData eventData, d<? super C27261> dVar) {
            super(2, dVar);
            this.$data = eventData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return EventsQueue.this.new C27261(this.$data, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            EventsQueue.this.elements.add(this.$data);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27261) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.EventsQueue$flushInternal$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.storage.EventsQueue$flushInternal$2", f = "EventsQueue.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160742x1}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ int $depth;
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.storage.EventsQueue$flushInternal$2$1, reason: invalid class name */
        @f(c = "com.superwall.sdk.storage.EventsQueue$flushInternal$2$1", f = "EventsQueue.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
            final /* synthetic */ EventsRequest $events;
            int label;
            final /* synthetic */ EventsQueue this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventsQueue eventsQueue, EventsRequest eventsRequest, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = eventsQueue;
                this.$events = eventsRequest;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.this$0, this.$events, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Network network = this.this$0.network;
                    EventsRequest eventsRequest = this.$events;
                    this.label = 1;
                    if (network.sendEvents(eventsRequest, this) == objL) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$depth = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return EventsQueue.this.new AnonymousClass2(this.$depth, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            Object objL = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m(obj);
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < EventsQueue.this.maxEventCount && !EventsQueue.this.elements.isEmpty(); i12++) {
                    arrayList.add(EventsQueue.this.elements.remove(0));
                }
                if (!arrayList.isEmpty()) {
                    k.f(EventsQueue.this.ioScope, null, null, new AnonymousClass1(EventsQueue.this, new EventsRequest(arrayList), null), 3, null);
                }
                if (!EventsQueue.this.elements.isEmpty() && (i10 = this.$depth) > 0) {
                    this.label = 1;
                    if (EventsQueue.this.flushInternal(i10 - 1, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i11 != 1) {
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

    /* JADX INFO: renamed from: com.superwall.sdk.storage.EventsQueue$onReceive$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.EventsQueue$onReceive$1", f = "EventsQueue.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    static final class C27271 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C27271(d<? super C27271> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return EventsQueue.this.new C27271(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                EventsQueue eventsQueue = EventsQueue.this;
                this.label = 1;
                if (EventsQueue.flushInternal$default(eventsQueue, 0, this, 1, null) == objL) {
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
            return ((C27271) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.EventsQueue$setupTimer$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.EventsQueue", f = "EventsQueue.kt", i = {}, l = {53}, m = "setupTimer", n = {}, s = {})
    static final class C27281 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C27281(d<? super C27281> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventsQueue.this.setupTimer(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.EventsQueue$setupTimer$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.EventsQueue$setupTimer$2", f = "EventsQueue.kt", i = {0, 1}, l = {49, 50}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    static final class C27292 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ long $timeInterval;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EventsQueue this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27292(long j10, EventsQueue eventsQueue, d<? super C27292> dVar) {
            super(2, dVar);
            this.$timeInterval = j10;
            this.this$0 = eventsQueue;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            C27292 c27292 = new C27292(this.$timeInterval, this.this$0, dVar);
            c27292.L$0 = obj;
            return c27292;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x003e  */
        /* JADX WARN: Code duplicated, block: B:18:0x0050  */
        /* JADX WARN: Code duplicated, block: B:23:0x006f  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
        
            if (r10.emit(r4, r9) == r0) goto L21;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006b -> B:8:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.label
                r8 = 2
                r2 = 2
                r3 = 1
                r8 = 0
                if (r1 == 0) goto L2d
                r8 = 7
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r9.L$0
                r8 = 7
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                kotlin.ResultKt.m(r10)
            L19:
                r10 = r1
                goto L36
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r8 = 0
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L24:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                r8 = 3
                kotlin.ResultKt.m(r10)
                goto L51
            L2d:
                r8 = 7
                kotlin.ResultKt.m(r10)
                r8 = 6
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.s0 r10 = (kotlinx.coroutines.s0) r10
            L36:
                r8 = 3
                boolean r1 = kotlinx.coroutines.t0.k(r10)
                r8 = 4
                if (r1 == 0) goto L6f
                long r4 = r9.$timeInterval
                r1 = 1000(0x3e8, float:1.401E-42)
                long r6 = (long) r1
                long r4 = r4 * r6
                r9.L$0 = r10
                r8 = 4
                r9.label = r3
                java.lang.Object r1 = kotlinx.coroutines.d1.b(r4, r9)
                if (r1 != r0) goto L50
                goto L6d
            L50:
                r1 = r10
            L51:
                r8 = 3
                com.superwall.sdk.storage.EventsQueue r10 = r9.this$0
                r8 = 5
                kotlinx.coroutines.flow.j0 r10 = com.superwall.sdk.storage.EventsQueue.access$getTimer$p(r10)
                long r4 = java.lang.System.currentTimeMillis()
                r8 = 0
                java.lang.Long r4 = kotlin.coroutines.jvm.internal.b.g(r4)
                r8 = 4
                r9.L$0 = r1
                r9.label = r2
                java.lang.Object r10 = r10.emit(r4, r9)
                if (r10 != r0) goto L19
            L6d:
                r8 = 2
                return r0
            L6f:
                kotlin.Unit r9 = kotlin.Unit.f312394a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.storage.EventsQueue.C27292.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27292) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public EventsQueue(@NotNull Context context, @NotNull Network network, @NotNull IOScope ioScope, @NotNull MainScope mainScope, @NotNull ConfigManager configManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(mainScope, "mainScope");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        this.context = context;
        this.network = network;
        this.ioScope = ioScope;
        this.mainScope = mainScope;
        this.configManager = configManager;
        this.maxEventCount = 50;
        this.elements = new ArrayList();
        this.timer = q0.b(0, 0, null, 7, null);
        this.coroutineContext = n0.d0(l1.c(), 1, null, 2, null);
        int i10 = 4 << 0;
        k.f(mainScope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.context.registerReceiver(this, intentFilter);
    }

    private final boolean externalDataCollectionAllowed(Trackable trackable) {
        if (Superwall.Companion.getInstance().getOptions().isExternalDataCollectionEnabled()) {
            return true;
        }
        return ((trackable instanceof InternalSuperwallEvent.TriggerFire) || (trackable instanceof InternalSuperwallEvent.Attributes) || (trackable instanceof UserInitiatedEvent.Track)) ? false : true;
    }

    public static /* synthetic */ Object flushInternal$default(EventsQueue eventsQueue, int i10, d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 10;
        }
        return eventsQueue.flushInternal(i10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object setupTimer(d<? super Unit> dVar) {
        C27281 c27281;
        if (dVar instanceof C27281) {
            c27281 = (C27281) dVar;
            int i10 = c27281.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27281.label = i10 - Integer.MIN_VALUE;
            } else {
                c27281 = new C27281(dVar);
            }
        } else {
            c27281 = new C27281(dVar);
        }
        Object obj = c27281.result;
        Object objL = b.l();
        int i11 = c27281.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            SuperwallOptions options = this.configManager.getOptions();
            this.job = k.f(this.ioScope, null, null, new C27292((options != null ? options.getNetworkEnvironment() : null) instanceof SuperwallOptions.NetworkEnvironment.Release ? 20L : 1L, this, null), 3, null);
            j0<Long> j0Var = this.timer;
            j<? super Long> jVar = new j() { // from class: com.superwall.sdk.storage.EventsQueue.setupTimer.3
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar2) {
                    return emit(((Number) obj2).longValue(), (d<? super Unit>) dVar2);
                }

                public final Object emit(long j10, d<? super Unit> dVar2) {
                    Object objFlushInternal$default = EventsQueue.flushInternal$default(EventsQueue.this, 0, dVar2, 1, null);
                    return objFlushInternal$default == b.l() ? objFlushInternal$default : Unit.f312394a;
                }
            };
            c27281.label = 1;
            if (j0Var.collect(jVar, c27281) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new a0();
    }

    public final void enqueue(@NotNull EventData data, @NotNull Trackable event) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(event, "event");
        if (externalDataCollectionAllowed(event)) {
            k.f(this, null, null, new C27261(data, null), 3, null);
        }
    }

    @Nullable
    public final Object flushInternal(int i10, @NotNull d<? super Unit> dVar) {
        k.f(this, null, null, new AnonymousClass2(i10, null), 3, null);
        return Unit.f312394a;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == -2128145023 && action.equals("android.intent.action.SCREEN_OFF")) {
            k.f(this.ioScope, null, null, new C27271(null), 3, null);
        }
    }
}
