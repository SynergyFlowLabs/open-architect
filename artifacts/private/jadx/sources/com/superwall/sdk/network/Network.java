package com.superwall.sdk.network;

import androidx.core.app.w;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.superwall.sdk.dependencies.ApiFactory;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.EitherKt;
import com.superwall.sdk.models.assignment.Assignment;
import com.superwall.sdk.models.assignment.AssignmentPostback;
import com.superwall.sdk.models.assignment.ConfirmedAssignmentResponse;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.models.enrichment.Enrichment;
import com.superwall.sdk.models.enrichment.EnrichmentRequest;
import com.superwall.sdk.models.entitlements.Redeemable;
import com.superwall.sdk.models.entitlements.TransactionReceipt;
import com.superwall.sdk.models.entitlements.WebEntitlements;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.events.EventsRequest;
import com.superwall.sdk.models.events.EventsResponse;
import com.superwall.sdk.models.internal.DeviceVendorId;
import com.superwall.sdk.models.internal.WebRedemptionResponse;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.paywall.Paywalls;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nNetwork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Network.kt\ncom/superwall/sdk/network/Network\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,173:1\n1#2:174\n17#3:175\n19#3:179\n46#4:176\n51#4:178\n105#5:177\n*S KotlinDebug\n*F\n+ 1 Network.kt\ncom/superwall/sdk/network/Network\n*L\n156#1:175\n156#1:179\n156#1:176\n156#1:178\n156#1:177\n*E\n"})
public class Network implements SuperwallAPI {

    @NotNull
    private final BaseHostService baseHostService;

    @NotNull
    private final CollectorService collectorService;

    @NotNull
    private final EnrichmentService enrichmentService;

    @NotNull
    private final ApiFactory factory;

    @NotNull
    private final SubscriptionService subscriptionService;

    /* JADX INFO: renamed from: com.superwall.sdk.network.Network$confirmAssignments$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.Network", f = "Network.kt", i = {0}, l = {70}, m = "confirmAssignments$suspendImpl", n = {"confirmableAssignments"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Network.confirmAssignments$suspendImpl(Network.this, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.network.Network$getAssignments$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.Network", f = "Network.kt", i = {}, l = {123}, m = "getAssignments$suspendImpl", n = {}, s = {})
    static final class C26641 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C26641(kotlin.coroutines.d<? super C26641> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Network.getAssignments$suspendImpl(Network.this, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.network.Network$getConfig$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.Network", f = "Network.kt", i = {0, 1}, l = {55, 60}, m = "getConfig$suspendImpl", n = {"$this", "requestId"}, s = {"L$0", "L$0"})
    static final class C26651 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C26651(kotlin.coroutines.d<? super C26651> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Network.getConfig$suspendImpl(Network.this, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.network.Network$getPaywall$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.Network", f = "Network.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.X}, m = "getPaywall$suspendImpl", n = {"identifier", w.I0}, s = {"L$0", "L$1"})
    static final class C26661 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C26661(kotlin.coroutines.d<? super C26661> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            int i10 = 4 << 0;
            return Network.getPaywall$suspendImpl(Network.this, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.network.Network$getPaywalls$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.Network", f = "Network.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160703k1}, m = "getPaywalls$suspendImpl", n = {}, s = {})
    static final class C26671 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C26671(kotlin.coroutines.d<? super C26671> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Network.getPaywalls$suspendImpl(Network.this, false, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.network.Network$sendEvents$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.Network", f = "Network.kt", i = {0}, l = {41}, m = "sendEvents$suspendImpl", n = {EventEntry.tableName}, s = {"L$0"})
    static final class C26681 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C26681(kotlin.coroutines.d<? super C26681> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Network.sendEvents$suspendImpl(Network.this, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.network.Network$webEntitlementsByDeviceID$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.Network", f = "Network.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.H1}, m = "webEntitlementsByDeviceID$suspendImpl", n = {}, s = {})
    static final class C26691 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C26691(kotlin.coroutines.d<? super C26691> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Network.webEntitlementsByDeviceID$suspendImpl(Network.this, null, this);
        }
    }

    public Network(@NotNull BaseHostService baseHostService, @NotNull CollectorService collectorService, @NotNull EnrichmentService enrichmentService, @NotNull ApiFactory factory, @NotNull SubscriptionService subscriptionService) {
        Intrinsics.checkNotNullParameter(baseHostService, "baseHostService");
        Intrinsics.checkNotNullParameter(collectorService, "collectorService");
        Intrinsics.checkNotNullParameter(enrichmentService, "enrichmentService");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(subscriptionService, "subscriptionService");
        this.baseHostService = baseHostService;
        this.collectorService = collectorService;
        this.enrichmentService = enrichmentService;
        this.factory = factory;
        this.subscriptionService = subscriptionService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitUntilAppInForeground(kotlin.coroutines.d<? super Unit> dVar) {
        final z0<Boolean> z0VarIsInBackground = this.factory.getAppLifecycleObserver().isInBackground();
        Object objW0 = k.w0(new kotlinx.coroutines.flow.i<Boolean>() { // from class: com.superwall.sdk.network.Network$awaitUntilAppInForeground$$inlined$filter$1

            /* JADX INFO: renamed from: com.superwall.sdk.network.Network$awaitUntilAppInForeground$$inlined$filter$1$2, reason: invalid class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Network.kt\ncom/superwall/sdk/network/Network\n*L\n1#1,49:1\n18#2:50\n19#2:52\n156#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.superwall.sdk.network.Network$awaitUntilAppInForeground$$inlined$filter$1$2$1, reason: invalid class name */
                @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.Network$awaitUntilAppInForeground$$inlined$filter$1$2", f = "Network.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                @Override // kotlinx.coroutines.flow.j
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
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
                        if (!((Boolean) obj).booleanValue()) {
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
            public Object collect(kotlinx.coroutines.flow.j<? super Boolean> jVar, kotlin.coroutines.d dVar2) {
                Object objCollect = z0VarIsInBackground.collect(new AnonymousClass2(jVar), dVar2);
                return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
            }
        }, dVar);
        return objW0 == kotlin.coroutines.intrinsics.b.l() ? objW0 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit confirmAssignments$lambda$2(ConfirmedAssignmentResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    static /* synthetic */ Object confirmAssignments$suspendImpl(Network network, AssignmentPostback assignmentPostback, kotlin.coroutines.d<? super Either<Unit, NetworkError>> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = network.new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = network.new AnonymousClass1(dVar);
        }
        Object objConfirmAssignments = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(objConfirmAssignments);
            BaseHostService baseHostService = network.baseHostService;
            anonymousClass1.L$0 = assignmentPostback;
            anonymousClass1.L$1 = network;
            anonymousClass1.label = 1;
            objConfirmAssignments = baseHostService.confirmAssignments(assignmentPostback, anonymousClass1);
            if (objConfirmAssignments == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            network = (Network) anonymousClass1.L$1;
            assignmentPostback = (AssignmentPostback) anonymousClass1.L$0;
            ResultKt.m(objConfirmAssignments);
        }
        return network.logError(EitherKt.map((Either) objConfirmAssignments, new Function1() { // from class: com.superwall.sdk.network.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Network.confirmAssignments$lambda$2((ConfirmedAssignmentResponse) obj);
            }
        }), "/confirm_assignments", MapsKt.mapOf(TuplesKt.to("assignments", assignmentPostback)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAssignments$lambda$5(ConfirmedAssignmentResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAssignments();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    static /* synthetic */ Object getAssignments$suspendImpl(Network network, kotlin.coroutines.d<? super Either<? extends List<Assignment>, NetworkError>> dVar) {
        C26641 c26641;
        if (dVar instanceof C26641) {
            c26641 = (C26641) dVar;
            int i10 = c26641.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26641.label = i10 - Integer.MIN_VALUE;
            } else {
                c26641 = network.new C26641(dVar);
            }
        } else {
            c26641 = network.new C26641(dVar);
        }
        Object objAssignments = c26641.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26641.label;
        if (i11 == 0) {
            ResultKt.m(objAssignments);
            BaseHostService baseHostService = network.baseHostService;
            c26641.L$0 = network;
            c26641.label = 1;
            objAssignments = baseHostService.assignments(c26641);
            if (objAssignments == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            network = (Network) c26641.L$0;
            ResultKt.m(objAssignments);
        }
        return logError$default(network, EitherKt.map((Either) objAssignments, new Function1() { // from class: com.superwall.sdk.network.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Network.getAssignments$lambda$5((ConfirmedAssignmentResponse) obj);
            }
        }), "/assignments", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Config getConfig$lambda$1(String str, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setRequestId(str);
        return config;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    static /* synthetic */ Object getConfig$suspendImpl(Network network, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super Either<Config, NetworkError>> dVar) {
        C26651 c26651;
        final String str;
        if (dVar instanceof C26651) {
            c26651 = (C26651) dVar;
            int i10 = c26651.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26651.label = i10 - Integer.MIN_VALUE;
            } else {
                c26651 = network.new C26651(dVar);
            }
        } else {
            c26651 = network.new C26651(dVar);
        }
        Object obj = c26651.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26651.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            c26651.L$0 = network;
            c26651.label = 1;
            if (network.awaitUntilAppInForeground(c26651) != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            network = (Network) c26651.L$0;
            ResultKt.m(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            network = (Network) c26651.L$1;
            str = (String) c26651.L$0;
            ResultKt.m(obj);
        }
        return logError$default(network, EitherKt.map((Either) obj, new Function1() { // from class: com.superwall.sdk.network.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Network.getConfig$lambda$1(str, (Config) obj2);
            }
        }), "/static_config", null, 2, null);
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        BaseHostService baseHostService = network.baseHostService;
        c26651.L$0 = string;
        c26651.L$1 = network;
        c26651.label = 2;
        Object objConfig = baseHostService.config(string, c26651);
        if (objConfig != objL) {
            obj = objConfig;
            str = string;
            return logError$default(network, EitherKt.map((Either) obj, new Function1() { // from class: com.superwall.sdk.network.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Network.getConfig$lambda$1(str, (Config) obj2);
                }
            }), "/static_config", null, 2, null);
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ee A[PHI: r0 r3 r14
      0x00ee: PHI (r0v10 java.lang.Object) = (r0v9 java.lang.Object), (r0v1 java.lang.Object) binds: [B:36:0x00eb, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r3v8 com.superwall.sdk.network.Network) = (r3v7 com.superwall.sdk.network.Network), (r3v18 com.superwall.sdk.network.Network) binds: [B:36:0x00eb, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r14v9 com.superwall.sdk.network.Network) = (r14v8 com.superwall.sdk.network.Network), (r14v18 com.superwall.sdk.network.Network) binds: [B:36:0x00eb, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (r0 == r2) goto L40;
     */
    /* JADX INFO: renamed from: getEnrichment-exY8QGI$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object m57getEnrichmentexY8QGI$suspendImpl(com.superwall.sdk.network.Network r14, com.superwall.sdk.models.enrichment.EnrichmentRequest r15, int r16, long r17, kotlin.coroutines.d<? super com.superwall.sdk.misc.Either<com.superwall.sdk.models.enrichment.Enrichment, com.superwall.sdk.network.NetworkError>> r19) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.network.Network.m57getEnrichmentexY8QGI$suspendImpl(com.superwall.sdk.network.Network, com.superwall.sdk.models.enrichment.EnrichmentRequest, int, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    static /* synthetic */ Object getPaywall$suspendImpl(Network network, String str, EventData eventData, kotlin.coroutines.d<? super Either<Paywall, NetworkError>> dVar) {
        C26661 c26661;
        String str2;
        Map<String, ? extends Object> mapMapOf;
        String name;
        if (dVar instanceof C26661) {
            c26661 = (C26661) dVar;
            int i10 = c26661.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26661.label = i10 - Integer.MIN_VALUE;
            } else {
                c26661 = network.new C26661(dVar);
            }
        } else {
            c26661 = network.new C26661(dVar);
        }
        Object objPaywall = c26661.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26661.label;
        int i12 = 3 ^ 1;
        if (i11 == 0) {
            ResultKt.m(objPaywall);
            BaseHostService baseHostService = network.baseHostService;
            c26661.L$0 = str;
            c26661.L$1 = eventData;
            c26661.L$2 = network;
            c26661.label = 1;
            objPaywall = baseHostService.paywall(str, c26661);
            if (objPaywall == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            network = (Network) c26661.L$2;
            eventData = (EventData) c26661.L$1;
            str = (String) c26661.L$0;
            ResultKt.m(objPaywall);
        }
        Either either = (Either) objPaywall;
        String str3 = "";
        if (str != null) {
            str2 = "/:" + str;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        String str4 = "/paywall" + str2;
        if (str == null) {
            Pair pair = TuplesKt.to("identifier", "none");
            if (eventData != null && (name = eventData.getName()) != null) {
                str3 = name;
            }
            mapMapOf = MapsKt.mapOf(pair, TuplesKt.to(w.I0, str3));
        } else {
            mapMapOf = null;
        }
        return network.logError(either, str4, mapMapOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getPaywalls$lambda$4(Paywalls it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPaywalls();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    static /* synthetic */ Object getPaywalls$suspendImpl(Network network, boolean z10, kotlin.coroutines.d<? super Either<? extends List<Paywall>, NetworkError>> dVar) {
        C26671 c26671;
        if (dVar instanceof C26671) {
            c26671 = (C26671) dVar;
            int i10 = c26671.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26671.label = i10 - Integer.MIN_VALUE;
            } else {
                c26671 = network.new C26671(dVar);
            }
        } else {
            c26671 = network.new C26671(dVar);
        }
        Object objPaywalls = c26671.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26671.label;
        if (i11 == 0) {
            ResultKt.m(objPaywalls);
            BaseHostService baseHostService = network.baseHostService;
            c26671.L$0 = network;
            c26671.label = 1;
            objPaywalls = baseHostService.paywalls(z10, c26671);
            if (objPaywalls == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            network = (Network) c26671.L$0;
            ResultKt.m(objPaywalls);
        }
        return logError$default(network, EitherKt.map((Either) objPaywalls, new Function1() { // from class: com.superwall.sdk.network.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Network.getPaywalls$lambda$4((Paywalls) obj);
            }
        }), "/paywalls", null, 2, null);
    }

    private final <T> Either<T, NetworkError> logError(Either<? extends T, NetworkError> either, final String str, final Map<String, ? extends Object> map) {
        return EitherKt.onError(either, new Function1() { // from class: com.superwall.sdk.network.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Network.logError$lambda$7(str, map, (NetworkError) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Either logError$default(Network network, Either either, String str, Map map, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logError");
        }
        if ((i10 & 2) != 0) {
            map = null;
        }
        return network.logError(either, str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logError$lambda$7(String str, Map map, NetworkError it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.INSTANCE.debug(LogLevel.error, LogScope.network, "Request Failed: " + str, map, it);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: redeemToken-mylZ20U$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m58redeemTokenmylZ20U$suspendImpl(Network network, List<Redeemable> list, String str, String str2, DeviceVendorId deviceVendorId, List<TransactionReceipt> list2, String str3, kotlin.coroutines.d<? super Either<WebRedemptionResponse, NetworkError>> dVar) {
        Network$redeemToken$1 network$redeemToken$1;
        if (dVar instanceof Network$redeemToken$1) {
            network$redeemToken$1 = (Network$redeemToken$1) dVar;
            int i10 = network$redeemToken$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                network$redeemToken$1.label = i10 - Integer.MIN_VALUE;
            } else {
                network$redeemToken$1 = new Network$redeemToken$1(network, dVar);
            }
        } else {
            network$redeemToken$1 = new Network$redeemToken$1(network, dVar);
        }
        Network$redeemToken$1 network$redeemToken$2 = network$redeemToken$1;
        Object objM63redeemTokenmylZ20U = network$redeemToken$2.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = network$redeemToken$2.label;
        if (i11 == 0) {
            ResultKt.m(objM63redeemTokenmylZ20U);
            SubscriptionService subscriptionService = network.subscriptionService;
            network$redeemToken$2.L$0 = network;
            network$redeemToken$2.label = 1;
            objM63redeemTokenmylZ20U = subscriptionService.m63redeemTokenmylZ20U(list, str, str2, deviceVendorId, list2, str3, network$redeemToken$2);
            if (objM63redeemTokenmylZ20U == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            network = (Network) network$redeemToken$2.L$0;
            ResultKt.m(objM63redeemTokenmylZ20U);
        }
        return logError$default(network, (Either) objM63redeemTokenmylZ20U, "/redeem", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendEvents$lambda$0(EventsResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getStatus() == EventsResponse.Status.PARTIAL_SUCCESS) {
            boolean z10 = false & false;
            Logger.debug$default(Logger.INSTANCE, LogLevel.warn, LogScope.network, "Request had partial success: /events", null, null, 24, null);
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    static /* synthetic */ Object sendEvents$suspendImpl(Network network, EventsRequest eventsRequest, kotlin.coroutines.d<? super Either<Unit, NetworkError>> dVar) {
        C26681 c26681;
        if (dVar instanceof C26681) {
            c26681 = (C26681) dVar;
            int i10 = c26681.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26681.label = i10 - Integer.MIN_VALUE;
            } else {
                c26681 = network.new C26681(dVar);
            }
        } else {
            c26681 = network.new C26681(dVar);
        }
        Object objEvents = c26681.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26681.label;
        if (i11 == 0) {
            ResultKt.m(objEvents);
            CollectorService collectorService = network.collectorService;
            c26681.L$0 = eventsRequest;
            c26681.L$1 = network;
            c26681.label = 1;
            objEvents = collectorService.events(eventsRequest, c26681);
            if (objEvents == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            network = (Network) c26681.L$1;
            eventsRequest = (EventsRequest) c26681.L$0;
            ResultKt.m(objEvents);
        }
        return network.logError(EitherKt.map((Either) objEvents, new Function1() { // from class: com.superwall.sdk.network.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Network.sendEvents$lambda$0((EventsResponse) obj);
            }
        }), "/events", MapsKt.mapOf(TuplesKt.to("payload", eventsRequest)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    static /* synthetic */ Object webEntitlementsByDeviceID$suspendImpl(Network network, DeviceVendorId deviceVendorId, kotlin.coroutines.d<? super Either<WebEntitlements, NetworkError>> dVar) {
        C26691 c26691;
        if (dVar instanceof C26691) {
            c26691 = (C26691) dVar;
            int i10 = c26691.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26691.label = i10 - Integer.MIN_VALUE;
            } else {
                c26691 = network.new C26691(dVar);
            }
        } else {
            c26691 = network.new C26691(dVar);
        }
        Object objWebEntitlementsByDeviceId = c26691.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26691.label;
        if (i11 == 0) {
            ResultKt.m(objWebEntitlementsByDeviceId);
            SubscriptionService subscriptionService = network.subscriptionService;
            c26691.L$0 = network;
            c26691.label = 1;
            objWebEntitlementsByDeviceId = subscriptionService.webEntitlementsByDeviceId(deviceVendorId, c26691);
            if (objWebEntitlementsByDeviceId == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            network = (Network) c26691.L$0;
            ResultKt.m(objWebEntitlementsByDeviceId);
        }
        return logError$default(network, (Either) objWebEntitlementsByDeviceId, "/redeem", null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: webEntitlementsByUserId-5PBZuVg$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m59webEntitlementsByUserId5PBZuVg$suspendImpl(Network network, String str, DeviceVendorId deviceVendorId, kotlin.coroutines.d<? super Either<WebEntitlements, NetworkError>> dVar) {
        Network$webEntitlementsByUserId$1 network$webEntitlementsByUserId$1;
        if (dVar instanceof Network$webEntitlementsByUserId$1) {
            network$webEntitlementsByUserId$1 = (Network$webEntitlementsByUserId$1) dVar;
            int i10 = network$webEntitlementsByUserId$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                network$webEntitlementsByUserId$1.label = i10 - Integer.MIN_VALUE;
            } else {
                network$webEntitlementsByUserId$1 = new Network$webEntitlementsByUserId$1(network, dVar);
            }
        } else {
            network$webEntitlementsByUserId$1 = new Network$webEntitlementsByUserId$1(network, dVar);
        }
        Object objM64webEntitlementsByUserIdAKGx8qU = network$webEntitlementsByUserId$1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = network$webEntitlementsByUserId$1.label;
        if (i11 == 0) {
            ResultKt.m(objM64webEntitlementsByUserIdAKGx8qU);
            SubscriptionService subscriptionService = network.subscriptionService;
            network$webEntitlementsByUserId$1.L$0 = network;
            network$webEntitlementsByUserId$1.label = 1;
            objM64webEntitlementsByUserIdAKGx8qU = subscriptionService.m64webEntitlementsByUserIdAKGx8qU(str, deviceVendorId, network$webEntitlementsByUserId$1);
            if (objM64webEntitlementsByUserIdAKGx8qU == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            network = (Network) network$webEntitlementsByUserId$1.L$0;
            ResultKt.m(objM64webEntitlementsByUserIdAKGx8qU);
        }
        return logError$default(network, (Either) objM64webEntitlementsByUserIdAKGx8qU, "/redeem", null, 2, null);
    }

    @Override // com.superwall.sdk.network.SuperwallAPI
    @Nullable
    public Object confirmAssignments(@NotNull AssignmentPostback assignmentPostback, @NotNull kotlin.coroutines.d<? super Either<Unit, NetworkError>> dVar) {
        return confirmAssignments$suspendImpl(this, assignmentPostback, dVar);
    }

    @Override // com.superwall.sdk.network.SuperwallAPI
    @Nullable
    public Object getAssignments(@NotNull kotlin.coroutines.d<? super Either<? extends List<Assignment>, NetworkError>> dVar) {
        return getAssignments$suspendImpl(this, dVar);
    }

    @Override // com.superwall.sdk.network.SuperwallAPI
    @Nullable
    public Object getConfig(@NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Either<Config, NetworkError>> dVar) {
        return getConfig$suspendImpl(this, function1, dVar);
    }

    @Override // com.superwall.sdk.network.SuperwallAPI
    @Nullable
    /* JADX INFO: renamed from: getEnrichment-exY8QGI, reason: not valid java name */
    public Object mo60getEnrichmentexY8QGI(@NotNull EnrichmentRequest enrichmentRequest, int i10, long j10, @NotNull kotlin.coroutines.d<? super Either<Enrichment, NetworkError>> dVar) {
        return m57getEnrichmentexY8QGI$suspendImpl(this, enrichmentRequest, i10, j10, dVar);
    }

    @Override // com.superwall.sdk.network.SuperwallAPI
    @Nullable
    public Object getPaywall(@Nullable String str, @Nullable EventData eventData, @NotNull kotlin.coroutines.d<? super Either<Paywall, NetworkError>> dVar) {
        return getPaywall$suspendImpl(this, str, eventData, dVar);
    }

    @Override // com.superwall.sdk.network.SuperwallAPI
    @Nullable
    public Object getPaywalls(boolean z10, @NotNull kotlin.coroutines.d<? super Either<? extends List<Paywall>, NetworkError>> dVar) {
        return getPaywalls$suspendImpl(this, z10, dVar);
    }

    @Override // com.superwall.sdk.network.SuperwallAPI
    @Nullable
    /* JADX INFO: renamed from: redeemToken-mylZ20U, reason: not valid java name */
    public Object mo61redeemTokenmylZ20U(@NotNull List<Redeemable> list, @Nullable String str, @Nullable String str2, @NotNull DeviceVendorId deviceVendorId, @NotNull List<TransactionReceipt> list2, @NotNull String str3, @NotNull kotlin.coroutines.d<? super Either<WebRedemptionResponse, NetworkError>> dVar) {
        return m58redeemTokenmylZ20U$suspendImpl(this, list, str, str2, deviceVendorId, list2, str3, dVar);
    }

    @Override // com.superwall.sdk.network.SuperwallAPI
    @Nullable
    public Object sendEvents(@NotNull EventsRequest eventsRequest, @NotNull kotlin.coroutines.d<? super Either<Unit, NetworkError>> dVar) {
        return sendEvents$suspendImpl(this, eventsRequest, dVar);
    }

    @Override // com.superwall.sdk.network.SuperwallAPI
    @Nullable
    public Object webEntitlementsByDeviceID(@NotNull DeviceVendorId deviceVendorId, @NotNull kotlin.coroutines.d<? super Either<WebEntitlements, NetworkError>> dVar) {
        return webEntitlementsByDeviceID$suspendImpl(this, deviceVendorId, dVar);
    }

    @Override // com.superwall.sdk.network.SuperwallAPI
    @Nullable
    /* JADX INFO: renamed from: webEntitlementsByUserId-5PBZuVg, reason: not valid java name */
    public Object mo62webEntitlementsByUserId5PBZuVg(@NotNull String str, @NotNull DeviceVendorId deviceVendorId, @NotNull kotlin.coroutines.d<? super Either<WebEntitlements, NetworkError>> dVar) {
        return m59webEntitlementsByUserId5PBZuVg$suspendImpl(this, str, deviceVendorId, dVar);
    }
}
