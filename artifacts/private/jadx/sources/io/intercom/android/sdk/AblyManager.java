package io.intercom.android.sdk;

import androidx.compose.runtime.internal.w0;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ParsedAblyEvent;
import io.intercom.android.sdk.m5.conversation.data.ParsedAblyEventKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AblyAuthResponse;
import io.intercom.android.sdk.models.AblyEndpoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n1;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.u0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AblyManager {
    public static final int $stable = 8;

    @Nullable
    private o0<? extends ParsedAblyEvent> _sharedEventFlow;

    @Nullable
    private io.ably.lib.realtime.a ablyRealtime;

    @Nullable
    private io.ably.lib.realtime.k connectionListener;

    @Nullable
    private io.ably.lib.realtime.b currentChannel;

    @Nullable
    private io.ably.lib.realtime.b.a messageListener;

    @NotNull
    private final MessengerApi messengerApi;

    @NotNull
    private final s0 scope;

    @NotNull
    private final Twig twig;

    /* JADX INFO: renamed from: io.intercom.android.sdk.AblyManager$connect$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.AblyManager$connect$1", f = "AblyManager.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nAblyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AblyManager.kt\nio/intercom/android/sdk/AblyManager$connect$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,262:1\n1368#2:263\n1454#2,5:264\n37#3,2:269\n*S KotlinDebug\n*F\n+ 1 AblyManager.kt\nio/intercom/android/sdk/AblyManager$connect$1\n*L\n130#1:263\n130#1:264,5\n134#1:269,2\n*E\n"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(AblyManager ablyManager, io.ably.lib.realtime.k.a aVar) {
            String strName = aVar.f287641c.name();
            if (Intrinsics.areEqual(strName, "connected")) {
                ablyManager.twig.d("AblyManager: Connected", new Object[0]);
            } else if (Intrinsics.areEqual(strName, MetricTracker.Action.FAILED)) {
                ablyManager.twig.e("AblyManager: Connection failed: " + aVar.f287643e, new Object[0]);
            }
            io.ably.lib.realtime.k kVar = ablyManager.connectionListener;
            if (kVar != null) {
                kVar.c(aVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3(AblyManager ablyManager, io.ably.lib.types.u uVar) {
            io.ably.lib.realtime.b.a aVar = ablyManager.messageListener;
            if (aVar != null) {
                aVar.e(uVar);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return AblyManager.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            io.ably.lib.realtime.a.b bVar;
            io.ably.lib.realtime.h hVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    AblyManager.this.twig.d("AblyManager: Connecting...", new Object[0]);
                    AblyManager ablyManager = AblyManager.this;
                    this.label = 1;
                    obj = ablyManager.getAblyConfiguration(this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                n1 n1Var = (n1) obj;
                if (n1Var == null) {
                    return Unit.f312394a;
                }
                String str = (String) n1Var.a();
                String str2 = (String) n1Var.b();
                List<AblyEndpoint> list = (List) n1Var.c();
                io.ably.lib.types.n nVar = new io.ably.lib.types.n();
                AblyManager ablyManager2 = AblyManager.this;
                nVar.f287715e = str;
                nVar.f287711a = ablyManager2.createAuthCallback();
                ArrayList arrayList = new ArrayList();
                for (AblyEndpoint ablyEndpoint : list) {
                    List listListOf = CollectionsKt.listOf(ablyEndpoint.getEndpoint());
                    List<String> fallback = ablyEndpoint.getFallback();
                    if (fallback == null) {
                        fallback = CollectionsKt.emptyList();
                    }
                    CollectionsKt.addAll(arrayList, CollectionsKt.plus((Collection) listListOf, (Iterable) fallback));
                }
                if (!arrayList.isEmpty()) {
                    nVar.H = (String[]) arrayList.toArray(new String[0]);
                }
                AblyManager.this.ablyRealtime = new io.ably.lib.realtime.a(nVar);
                io.ably.lib.realtime.a aVar = AblyManager.this.ablyRealtime;
                if (aVar != null && (hVar = aVar.f287532i) != null) {
                    final AblyManager ablyManager3 = AblyManager.this;
                    hVar.f(new io.ably.lib.realtime.k() { // from class: io.intercom.android.sdk.b
                        @Override // io.ably.lib.realtime.k
                        public final void c(io.ably.lib.realtime.k.a aVar2) {
                            AblyManager.AnonymousClass1.invokeSuspend$lambda$2(ablyManager3, aVar2);
                        }
                    });
                }
                AblyManager ablyManager4 = AblyManager.this;
                io.ably.lib.realtime.a aVar2 = ablyManager4.ablyRealtime;
                ablyManager4.currentChannel = (aVar2 == null || (bVar = aVar2.f287533j) == null) ? null : bVar.get(str2);
                io.ably.lib.realtime.b bVar2 = AblyManager.this.currentChannel;
                if (bVar2 != null) {
                    final AblyManager ablyManager5 = AblyManager.this;
                    bVar2.A0(new io.ably.lib.realtime.c.l() { // from class: io.intercom.android.sdk.c
                        @Override // io.ably.lib.realtime.c.l
                        public final void e(io.ably.lib.types.u uVar) {
                            AblyManager.AnonymousClass1.invokeSuspend$lambda$3(ablyManager5, uVar);
                        }
                    });
                }
                return Unit.f312394a;
            } catch (Exception e10) {
                AblyManager.this.twig.e("AblyManager: Connection error: " + e10.getMessage(), new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.AblyManager$createAblyEventFlow$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.AblyManager$createAblyEventFlow$1", f = "AblyManager.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    static final class C27691 extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super ParsedAblyEvent>, kotlin.coroutines.d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C27691(kotlin.coroutines.d<? super C27691> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(AblyManager ablyManager, l0 l0Var, io.ably.lib.types.u uVar) {
            ablyManager.twig.d("AblyManager: Received message: " + uVar.f288181s, new Object[0]);
            Intrinsics.checkNotNull(uVar);
            ParsedAblyEvent parsedAblyEventAsAblyData = ParsedAblyEventKt.asAblyData(uVar);
            ablyManager.twig.d("AblyManager: Parsed event: " + parsedAblyEventAsAblyData, new Object[0]);
            l0Var.p(parsedAblyEventAsAblyData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(l0 l0Var, AblyManager ablyManager, io.ably.lib.realtime.k.a aVar) {
            String strName = aVar.f287641c.name();
            int iHashCode = strName.hashCode();
            if (iHashCode == -1357520532) {
                if (strName.equals(MetricTracker.Action.CLOSED)) {
                    l0Var.p(ParsedAblyEvent.AblyClosed.INSTANCE);
                    ablyManager.twig.d("AblyManager: Connection closed", new Object[0]);
                    return;
                }
                return;
            }
            if (iHashCode != -1281977283) {
                if (iHashCode == -579210487 && strName.equals("connected")) {
                    l0Var.p(ParsedAblyEvent.AblyConnected.INSTANCE);
                    return;
                }
                return;
            }
            if (strName.equals(MetricTracker.Action.FAILED)) {
                l0Var.p(ParsedAblyEvent.AblyFailed.INSTANCE);
                ablyManager.twig.e("AblyManager: Connection failed", new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(AblyManager ablyManager) {
            ablyManager.removeListeners();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C27691 c27691 = AblyManager.this.new C27691(dVar);
            c27691.L$0 = obj;
            return c27691;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final l0 l0Var = (l0) this.L$0;
                final AblyManager ablyManager = AblyManager.this;
                io.ably.lib.realtime.b.a aVar = new io.ably.lib.realtime.b.a() { // from class: io.intercom.android.sdk.d
                    @Override // io.ably.lib.realtime.c.l
                    public final void e(io.ably.lib.types.u uVar) {
                        AblyManager.C27691.invokeSuspend$lambda$0(ablyManager, l0Var, uVar);
                    }
                };
                final AblyManager ablyManager2 = AblyManager.this;
                io.ably.lib.realtime.k kVar = new io.ably.lib.realtime.k() { // from class: io.intercom.android.sdk.e
                    @Override // io.ably.lib.realtime.k
                    public final void c(io.ably.lib.realtime.k.a aVar2) {
                        AblyManager.C27691.invokeSuspend$lambda$1(l0Var, ablyManager2, aVar2);
                    }
                };
                AblyManager.this.messageListener = aVar;
                AblyManager.this.connectionListener = kVar;
                if (AblyManager.this.ablyRealtime == null) {
                    AblyManager.this.connect();
                }
                final AblyManager ablyManager3 = AblyManager.this;
                Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AblyManager.C27691.invokeSuspend$lambda$2(ablyManager3);
                    }
                };
                this.label = 1;
                if (j0.b(l0Var, function0, this) == objL) {
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
        public final Object invoke(l0<? super ParsedAblyEvent> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27691) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.AblyManager$disconnect$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.AblyManager$disconnect$1", f = "AblyManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27701 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        C27701(kotlin.coroutines.d<? super C27701> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return AblyManager.this.new C27701(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            io.ably.lib.realtime.h hVar;
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                io.ably.lib.realtime.b bVar = AblyManager.this.currentChannel;
                if (bVar != null) {
                    bVar.G0();
                }
                io.ably.lib.realtime.a aVar = AblyManager.this.ablyRealtime;
                if (aVar != null && (hVar = aVar.f287532i) != null) {
                    hVar.k();
                }
                AblyManager.this.ablyRealtime = null;
                AblyManager.this.currentChannel = null;
                AblyManager.this.messageListener = null;
                AblyManager.this.connectionListener = null;
                AblyManager.this.twig.d("AblyManager: Disconnected from Ably", new Object[0]);
            } catch (Exception e10) {
                AblyManager.this.twig.e("AblyManager: Disconnect error: " + e10.getMessage(), new Object[0]);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27701) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.AblyManager$getAblyConfiguration$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.AblyManager", f = "AblyManager.kt", i = {0, 1, 1}, l = {170, 180}, m = "getAblyConfiguration", n = {"this", "this", "connectConfig"}, s = {"L$0", "L$0", "L$1"})
    static final class C27711 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C27711(kotlin.coroutines.d<? super C27711> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AblyManager.this.getAblyConfiguration(this);
        }
    }

    public AblyManager(@NotNull Twig twig, @NotNull MessengerApi messengerApi) {
        Intrinsics.checkNotNullParameter(twig, "twig");
        Intrinsics.checkNotNullParameter(messengerApi, "messengerApi");
        this.twig = twig;
        this.messengerApi = messengerApi;
        this.scope = t0.a(q3.c(null, 1, null).plus(l1.c()));
    }

    private final kotlinx.coroutines.flow.i<ParsedAblyEvent> createAblyEventFlow() {
        return kotlinx.coroutines.flow.k.t(new C27691(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.ably.lib.rest.d.h createAuthCallback() {
        return new io.ably.lib.rest.d.h() { // from class: io.intercom.android.sdk.a
            @Override // io.ably.lib.rest.d.h
            public final Object a(io.ably.lib.rest.d.j jVar) {
                return AblyManager.createAuthCallback$lambda$1(this.f291510a, jVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createAuthCallback$lambda$1(AblyManager this$0, io.ably.lib.rest.d.j jVar) throws Exception {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            NetworkResponse networkResponse = (NetworkResponse) kotlinx.coroutines.j.b(null, new AblyManager$createAuthCallback$1$authResponse$1(this$0, null), 1, null);
            if (networkResponse instanceof NetworkResponse.Success) {
                this$0.twig.d("AblyManager: Auth callback got fresh token", new Object[0]);
                return ((AblyAuthResponse) ((NetworkResponse.Success) networkResponse).getBody()).getToken();
            }
            this$0.twig.e("AblyManager: Auth callback failed to get token", new Object[0]);
            throw new Exception("Failed to get auth token from server");
        } catch (Exception e10) {
            this$0.twig.e("AblyManager: Auth callback error: " + e10.getMessage(), new Object[0]);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r0 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAblyConfiguration(kotlin.coroutines.d<? super kotlin.n1<java.lang.String, java.lang.String, ? extends java.util.List<io.intercom.android.sdk.models.AblyEndpoint>>> r10) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.AblyManager.getAblyConfiguration(kotlin.coroutines.d):java.lang.Object");
    }

    public final void connect() {
    }

    public final void disconnect() {
        kotlinx.coroutines.k.f(this.scope, null, null, new C27701(null), 3, null);
    }

    @NotNull
    public final o0<ParsedAblyEvent> getSharedEventFlow() {
        this.twig.d("AblyManager: getSharedEventFlow() called", new Object[0]);
        if (this._sharedEventFlow == null) {
            synchronized (this) {
                try {
                    if (this._sharedEventFlow == null) {
                        this.twig.d("AblyManager: Creating new shared flow", new Object[0]);
                        this._sharedEventFlow = kotlinx.coroutines.flow.k.I1(createAblyEventFlow(), this.scope, u0.f314834a.c(), 0);
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        o0 o0Var = this._sharedEventFlow;
        Intrinsics.checkNotNull(o0Var);
        return o0Var;
    }

    public final boolean isConnected() {
        io.ably.lib.realtime.h hVar;
        io.ably.lib.realtime.j jVar;
        io.ably.lib.realtime.a aVar = this.ablyRealtime;
        return Intrinsics.areEqual((aVar == null || (hVar = aVar.f287532i) == null || (jVar = hVar.f287612c) == null) ? null : jVar.name(), "connected");
    }

    public final void removeListeners() {
        this.messageListener = null;
        this.connectionListener = null;
    }
}
