package com.superwall.sdk.paywall.request;

import androidx.core.app.w;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.EitherKt;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.network.Network;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.paywall.presentation.internal.request.ProductOverride;
import com.superwall.sdk.store.GetProductsResponse;
import com.superwall.sdk.store.StoreKit;
import com.superwall.sdk.store.StoreManager;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPaywallRequestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallRequestManager.kt\ncom/superwall/sdk/paywall/request/PaywallRequestManager\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n136#2,10:376\n1557#3:386\n1628#3,3:387\n560#4:390\n545#4,6:391\n1#5:397\n*S KotlinDebug\n*F\n+ 1 PaywallRequestManager.kt\ncom/superwall/sdk/paywall/request/PaywallRequestManager\n*L\n59#1:376,10\n352#1:386\n352#1:387,3\n372#1:390\n372#1:391,6\n*E\n"})
public final class PaywallRequestManager {

    @NotNull
    private final Map<String, a1<Paywall>> activeTasks;

    @NotNull
    private final PaywallRequestManagerDepFactory factory;

    @NotNull
    private final Function0<Map<String, String>> getGlobalOverrides;

    @NotNull
    private final IOScope ioScope;

    @NotNull
    private final Network network;

    @NotNull
    private final Map<String, Paywall> paywallsByHash;

    @NotNull
    private final StoreManager storeManager;

    @NotNull
    private final Function2<TrackableSuperwallEvent, d<? super Unit>, Object> track;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$1", f = "PaywallRequestManager.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends o implements Function2<TrackableSuperwallEvent, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TrackableSuperwallEvent trackableSuperwallEvent, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(trackableSuperwallEvent, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                TrackableSuperwallEvent trackableSuperwallEvent = (TrackableSuperwallEvent) this.L$0;
                Superwall companion = Superwall.Companion.getInstance();
                this.label = 1;
                if (TrackingKt.track(companion, trackableSuperwallEvent, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ((Result) obj).j();
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$addProducts$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$addProducts$2", f = "PaywallRequestManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.M1, com.planner5d.library.engine.input.f.b.P1, 250}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Paywall>, Object> {
        final /* synthetic */ Paywall $paywall;
        final /* synthetic */ PaywallRequest $request;
        int label;
        final /* synthetic */ PaywallRequestManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Paywall paywall, PaywallRequestManager paywallRequestManager, PaywallRequest paywallRequest, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$paywall = paywall;
            this.this$0 = paywallRequestManager;
            this.$request = paywallRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$paywall, this.this$0, this.$request, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            if (r8 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.label
                r6 = 3
                r2 = 3
                r3 = 2
                r6 = 3
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L22
                if (r1 != r2) goto L17
                kotlin.ResultKt.m(r8)
                goto L67
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "ilsuo/ toecloe /ro h/u/b ntmvirkr/aee/ tceoew s/fni"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                r6 = 1
                throw r7
            L22:
                r6 = 2
                kotlin.ResultKt.m(r8)
                goto L52
            L27:
                kotlin.ResultKt.m(r8)
                goto L41
            L2b:
                kotlin.ResultKt.m(r8)
                r6 = 0
                com.superwall.sdk.models.paywall.Paywall r8 = r7.$paywall
                com.superwall.sdk.paywall.request.PaywallRequestManager r1 = r7.this$0
                r6 = 6
                com.superwall.sdk.paywall.request.PaywallRequest r5 = r7.$request
                r7.label = r4
                r6 = 6
                java.lang.Object r8 = com.superwall.sdk.paywall.request.PaywallRequestManager.access$trackProductsLoadStart(r1, r8, r5, r7)
                if (r8 != r0) goto L41
                r6 = 3
                goto L66
            L41:
                com.superwall.sdk.models.paywall.Paywall r8 = (com.superwall.sdk.models.paywall.Paywall) r8
                r6 = 6
                com.superwall.sdk.paywall.request.PaywallRequestManager r1 = r7.this$0
                com.superwall.sdk.paywall.request.PaywallRequest r4 = r7.$request
                r6 = 4
                r7.label = r3
                java.lang.Object r8 = com.superwall.sdk.paywall.request.PaywallRequestManager.access$getProducts(r1, r8, r4, r7)
                if (r8 != r0) goto L52
                goto L66
            L52:
                r6 = 6
                com.superwall.sdk.models.paywall.Paywall r8 = (com.superwall.sdk.models.paywall.Paywall) r8
                com.superwall.sdk.paywall.request.PaywallRequestManager r1 = r7.this$0
                com.superwall.sdk.paywall.request.PaywallRequest r3 = r7.$request
                com.superwall.sdk.models.events.EventData r3 = r3.getEventData()
                r7.label = r2
                java.lang.Object r8 = com.superwall.sdk.paywall.request.PaywallRequestManager.access$trackProductsLoadFinish(r1, r8, r3, r7)
                r6 = 4
                if (r8 != r0) goto L67
            L66:
                return r0
            L67:
                com.superwall.sdk.models.paywall.Paywall r8 = (com.superwall.sdk.models.paywall.Paywall) r8
                r6 = 3
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.request.PaywallRequestManager.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Paywall> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$convertProductOverrides$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager", f = "PaywallRequestManager.kt", i = {0, 0}, l = {350}, m = "convertProductOverrides", n = {"productOverrides", "convertedProducts"}, s = {"L$0", "L$1"})
    static final class C26921 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C26921(d<? super C26921> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaywallRequestManager.this.convertProductOverrides(null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$getPaywall$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager", f = "PaywallRequestManager.kt", i = {}, l = {60}, m = "getPaywall", n = {}, s = {})
    static final class C26931 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C26931(d<? super C26931> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            boolean z10 = true;
            return PaywallRequestManager.this.getPaywall(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$getPaywallResponse$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$getPaywallResponse$2", f = "PaywallRequestManager.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {182, 186, 199}, m = "invokeSuspend", n = {"responseLoadStartTime", "paywallId", w.I0, "responseLoadStartTime", "paywallId", w.I0, w.I0}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
    static final class C26942 extends o implements Function2<s0, d<? super Either<? extends Paywall, ?>>, Object> {
        final /* synthetic */ boolean $isPreloading;
        final /* synthetic */ PaywallRequest $request;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ PaywallRequestManager this$0;

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$getPaywallResponse$2$2, reason: invalid class name and collision with other inner class name */
        @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$getPaywallResponse$2$2", f = "PaywallRequestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C18802 extends o implements Function2<Paywall, d<? super Unit>, Object> {
            final /* synthetic */ String $paywallId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18802(String str, d<? super C18802> dVar) {
                super(2, dVar);
                this.$paywallId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C18802 c18802 = new C18802(this.$paywallId, dVar);
                c18802.L$0 = obj;
                return c18802;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Paywall paywall, d<? super Unit> dVar) {
                return ((C18802) create(paywall, dVar)).invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                Paywall paywall = (Paywall) this.L$0;
                Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "!!getPaywallResponse - " + this.$paywallId + " - " + paywall, null, null, 24, null);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$getPaywallResponse$2$4, reason: invalid class name */
        @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$getPaywallResponse$2$4", f = "PaywallRequestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends o implements Function2<Paywall, d<? super Unit>, Object> {
            final /* synthetic */ String $paywallId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(String str, d<? super AnonymousClass4> dVar) {
                super(2, dVar);
                this.$paywallId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$paywallId, dVar);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Paywall paywall, d<? super Unit> dVar) {
                return ((AnonymousClass4) create(paywall, dVar)).invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                Paywall paywall = (Paywall) this.L$0;
                Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "!!getPaywallResponse - " + this.$paywallId + " - " + paywall + " - " + paywall.getExperiment(), null, null, 24, null);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26942(PaywallRequest paywallRequest, PaywallRequestManager paywallRequestManager, boolean z10, d<? super C26942> dVar) {
            super(2, dVar);
            this.$request = paywallRequest;
            this.this$0 = paywallRequestManager;
            this.$isPreloading = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Paywall invokeSuspend$lambda$1(boolean z10, PaywallRequestManager paywallRequestManager, PaywallRequest paywallRequest, Date date, Paywall paywall) {
            if (z10 && Intrinsics.areEqual(paywall.getIdentifier(), paywallRequestManager.factory.activePaywallId())) {
                return paywall;
            }
            paywall.setExperiment(paywallRequest.getResponseIdentifiers().getExperiment());
            paywall.getResponseLoadingInfo().setStartAt(date);
            paywall.getResponseLoadingInfo().setEndAt(new Date());
            return paywall;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C26942(this.$request, this.this$0, this.$isPreloading, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, d<? super Either<? extends Paywall, ?>> dVar) {
            return invoke2(s0Var, (d<? super Either<Paywall, ?>>) dVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:30:0x00ef  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Date date;
            String paywallId;
            EventData eventData;
            String str;
            Date date2;
            Either success;
            final Date date3;
            Object objThen;
            String str2;
            final EventData eventData2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    eventData = (EventData) this.L$2;
                    str = (String) this.L$1;
                    date = (Date) this.L$0;
                    ResultKt.m(obj);
                } else {
                    if (i10 == 2) {
                        eventData = (EventData) this.L$2;
                        str2 = (String) this.L$1;
                        date3 = (Date) this.L$0;
                        ResultKt.m(obj);
                        final boolean z10 = this.$isPreloading;
                        final PaywallRequestManager paywallRequestManager = this.this$0;
                        final PaywallRequest paywallRequest = this.$request;
                        Either map = EitherKt.map((Either) obj, new Function1() { // from class: com.superwall.sdk.paywall.request.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return PaywallRequestManager.C26942.invokeSuspend$lambda$1(z10, paywallRequestManager, paywallRequest, date3, (Paywall) obj2);
                            }
                        });
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(str2, null);
                        this.L$0 = eventData;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        obj = EitherKt.then(map, anonymousClass4, this);
                        if (obj != objL) {
                            eventData2 = eventData;
                        }
                        return objL;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eventData2 = (EventData) this.L$0;
                    ResultKt.m(obj);
                }
                return EitherKt.mapError((Either) obj, new Function1<?, Throwable>() { // from class: com.superwall.sdk.paywall.request.PaywallRequestManager.getPaywallResponse.2.5
                    @Override // kotlin.jvm.functions.Function1
                    public final Throwable invoke(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return PaywallLogic.handlePaywallError$default(PaywallLogic.INSTANCE, it, eventData2, null, 4, null);
                    }
                });
            }
            ResultKt.m(obj);
            date = new Date();
            paywallId = this.$request.getResponseIdentifiers().getPaywallId();
            eventData = this.$request.getEventData();
            Paywall paywallMakeStaticPaywall = this.this$0.factory.makeStaticPaywall(paywallId, this.$request.isDebuggerLaunched());
            if (paywallMakeStaticPaywall != null) {
                date2 = date;
                success = new Either.Success(paywallMakeStaticPaywall);
                date3 = date2;
                C18802 c18802 = new C18802(paywallId, null);
                this.L$0 = date3;
                this.L$1 = paywallId;
                this.L$2 = eventData;
                this.label = 2;
                objThen = EitherKt.then(success, c18802, this);
                if (objThen != objL) {
                    str2 = paywallId;
                    obj = objThen;
                    final boolean z11 = this.$isPreloading;
                    final PaywallRequestManager paywallRequestManager2 = this.this$0;
                    final PaywallRequest paywallRequest2 = this.$request;
                    Either map2 = EitherKt.map((Either) obj, new Function1() { // from class: com.superwall.sdk.paywall.request.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PaywallRequestManager.C26942.invokeSuspend$lambda$1(z11, paywallRequestManager2, paywallRequest2, date3, (Paywall) obj2);
                        }
                    });
                    AnonymousClass4 anonymousClass5 = new AnonymousClass4(str2, null);
                    this.L$0 = eventData;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    obj = EitherKt.then(map2, anonymousClass5, this);
                    if (obj != objL) {
                        eventData2 = eventData;
                        return EitherKt.mapError((Either) obj, new Function1<?, Throwable>() { // from class: com.superwall.sdk.paywall.request.PaywallRequestManager.getPaywallResponse.2.5
                            @Override // kotlin.jvm.functions.Function1
                            public final Throwable invoke(Throwable it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return PaywallLogic.handlePaywallError$default(PaywallLogic.INSTANCE, it, eventData2, null, 4, null);
                            }
                        });
                    }
                }
            } else {
                Network network = this.this$0.network;
                this.L$0 = date;
                this.L$1 = paywallId;
                this.L$2 = eventData;
                this.label = 1;
                Object paywall = network.getPaywall(paywallId, eventData, this);
                if (paywall != objL) {
                    str = paywallId;
                    obj = paywall;
                }
            }
            return objL;
            date2 = date;
            success = (Either) obj;
            paywallId = str;
            date3 = date2;
            C18802 c18803 = new C18802(paywallId, null);
            this.L$0 = date3;
            this.L$1 = paywallId;
            this.L$2 = eventData;
            this.label = 2;
            objThen = EitherKt.then(success, c18803, this);
            if (objThen != objL) {
                str2 = paywallId;
                obj = objThen;
                final boolean z12 = this.$isPreloading;
                final PaywallRequestManager paywallRequestManager3 = this.this$0;
                final PaywallRequest paywallRequest3 = this.$request;
                Either map3 = EitherKt.map((Either) obj, new Function1() { // from class: com.superwall.sdk.paywall.request.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PaywallRequestManager.C26942.invokeSuspend$lambda$1(z12, paywallRequestManager3, paywallRequest3, date3, (Paywall) obj2);
                    }
                });
                AnonymousClass4 anonymousClass6 = new AnonymousClass4(str2, null);
                this.L$0 = eventData;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                obj = EitherKt.then(map3, anonymousClass6, this);
                if (obj != objL) {
                    eventData2 = eventData;
                    return EitherKt.mapError((Either) obj, new Function1<?, Throwable>() { // from class: com.superwall.sdk.paywall.request.PaywallRequestManager.getPaywallResponse.2.5
                        @Override // kotlin.jvm.functions.Function1
                        public final Throwable invoke(Throwable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return PaywallLogic.handlePaywallError$default(PaywallLogic.INSTANCE, it, eventData2, null, 4, null);
                        }
                    });
                }
            }
            return objL;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, d<? super Either<Paywall, ?>> dVar) {
            return ((C26942) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$getProducts$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$getProducts$2", f = "PaywallRequestManager.kt", i = {0, 1}, l = {270, 277}, m = "invokeSuspend", n = {"paywall", "paywall"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nPaywallRequestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallRequestManager.kt\ncom/superwall/sdk/paywall/request/PaywallRequestManager$getProducts$2\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,375:1\n462#2:376\n412#2:377\n1246#3,4:378\n*S KotlinDebug\n*F\n+ 1 PaywallRequestManager.kt\ncom/superwall/sdk/paywall/request/PaywallRequestManager$getProducts$2\n*L\n269#1:376\n269#1:377\n269#1:378,4\n*E\n"})
    static final class C26952 extends o implements Function2<s0, d<? super Paywall>, Object> {
        final /* synthetic */ Paywall $paywall;
        final /* synthetic */ PaywallRequest $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PaywallRequestManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26952(Paywall paywall, PaywallRequest paywallRequest, PaywallRequestManager paywallRequestManager, d<? super C26952> dVar) {
            super(2, dVar);
            this.$paywall = paywall;
            this.$request = paywallRequest;
            this.this$0 = paywallRequestManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            C26952 c26952 = new C26952(this.$paywall, this.$request, this.this$0, dVar);
            c26952.L$0 = obj;
            return c26952;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Paywall paywall;
            Map<String, StoreProduct> products;
            Paywall paywall2;
            GetProductsResponse getProductsResponse;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    paywall = (Paywall) this.L$0;
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    paywall2 = (Paywall) this.L$0;
                    ResultKt.m(obj);
                }
                getProductsResponse = (GetProductsResponse) obj;
                if (getProductsResponse.getPaywall() != null) {
                    paywall2 = getProductsResponse.getPaywall();
                }
                paywall2.setProductItems(getProductsResponse.getProductItems());
                ProductProcessingOutcome variablesAndFreeTrial = PaywallLogic.INSTANCE.getVariablesAndFreeTrial(getProductsResponse.getProductItems(), getProductsResponse.getProductsByFullId(), this.$request.getOverrides().isFreeTrial());
                paywall2.setProductVariables(variablesAndFreeTrial.getProductVariables());
                paywall2.setFreeTrialAvailable(variablesAndFreeTrial.isFreeTrialAvailable());
                return paywall2;
            }
            ResultKt.m(obj);
            paywall = this.$paywall;
            products = this.$request.getOverrides().getProducts();
            if (products == null) {
                PaywallRequestManager paywallRequestManager = this.this$0;
                Map map = (Map) paywallRequestManager.getGlobalOverrides.invoke();
                if (map.isEmpty()) {
                    products = null;
                    StoreManager storeManager = this.this$0.storeManager;
                    PaywallRequest paywallRequest = this.$request;
                    this.L$0 = paywall;
                    this.label = 2;
                    obj = storeManager.getProducts(products, paywall, paywallRequest, this);
                    if (obj != objL) {
                        paywall2 = paywall;
                        getProductsResponse = (GetProductsResponse) obj;
                        if (getProductsResponse.getPaywall() != null) {
                            paywall2 = getProductsResponse.getPaywall();
                        }
                        paywall2.setProductItems(getProductsResponse.getProductItems());
                        ProductProcessingOutcome variablesAndFreeTrial2 = PaywallLogic.INSTANCE.getVariablesAndFreeTrial(getProductsResponse.getProductItems(), getProductsResponse.getProductsByFullId(), this.$request.getOverrides().isFreeTrial());
                        paywall2.setProductVariables(variablesAndFreeTrial2.getProductVariables());
                        paywall2.setFreeTrialAvailable(variablesAndFreeTrial2.isFreeTrialAvailable());
                        return paywall2;
                    }
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), new ProductOverride.ById((String) entry.getValue()));
                    }
                    this.L$0 = paywall;
                    this.label = 1;
                    obj = paywallRequestManager.convertProductOverrides(linkedHashMap, this);
                    if (obj == objL) {
                    }
                }
            } else {
                StoreManager storeManager2 = this.this$0.storeManager;
                PaywallRequest paywallRequest2 = this.$request;
                this.L$0 = paywall;
                this.label = 2;
                obj = storeManager2.getProducts(products, paywall, paywallRequest2, this);
                if (obj != objL) {
                    paywall2 = paywall;
                    getProductsResponse = (GetProductsResponse) obj;
                    if (getProductsResponse.getPaywall() != null) {
                        paywall2 = getProductsResponse.getPaywall();
                    }
                    paywall2.setProductItems(getProductsResponse.getProductItems());
                    ProductProcessingOutcome variablesAndFreeTrial3 = PaywallLogic.INSTANCE.getVariablesAndFreeTrial(getProductsResponse.getProductItems(), getProductsResponse.getProductsByFullId(), this.$request.getOverrides().isFreeTrial());
                    paywall2.setProductVariables(variablesAndFreeTrial3.getProductVariables());
                    paywall2.setFreeTrialAvailable(variablesAndFreeTrial3.isFreeTrialAvailable());
                    return paywall2;
                }
            }
            return objL;
            products = (Map) obj;
            StoreManager storeManager3 = this.this$0.storeManager;
            PaywallRequest paywallRequest3 = this.$request;
            this.L$0 = paywall;
            this.label = 2;
            obj = storeManager3.getProducts(products, paywall, paywallRequest3, this);
            if (obj != objL) {
                paywall2 = paywall;
                getProductsResponse = (GetProductsResponse) obj;
                if (getProductsResponse.getPaywall() != null) {
                    paywall2 = getProductsResponse.getPaywall();
                }
                paywall2.setProductItems(getProductsResponse.getProductItems());
                ProductProcessingOutcome variablesAndFreeTrial4 = PaywallLogic.INSTANCE.getVariablesAndFreeTrial(getProductsResponse.getProductItems(), getProductsResponse.getProductsByFullId(), this.$request.getOverrides().isFreeTrial());
                paywall2.setProductVariables(variablesAndFreeTrial4.getProductVariables());
                paywall2.setFreeTrialAvailable(variablesAndFreeTrial4.isFreeTrialAvailable());
                return paywall2;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Paywall> dVar) {
            return ((C26952) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$getRawPaywall$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$getRawPaywall$2", f = "PaywallRequestManager.kt", i = {}, l = {152, 153, androidx.media2.widget.f.i.f59793p0}, m = "invokeSuspend", n = {}, s = {})
    static final class C26962 extends o implements Function2<s0, d<? super Either<? extends Paywall, ?>>, Object> {
        final /* synthetic */ boolean $isPreloading;
        final /* synthetic */ PaywallRequest $request;
        int label;
        final /* synthetic */ PaywallRequestManager this$0;

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$getRawPaywall$2$1, reason: invalid class name */
        @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$getRawPaywall$2$1", f = "PaywallRequestManager.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends o implements Function2<Paywall, d<? super Unit>, Object> {
            final /* synthetic */ PaywallRequest $request;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PaywallRequestManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PaywallRequest paywallRequest, PaywallRequestManager paywallRequestManager, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$request = paywallRequest;
                this.this$0 = paywallRequestManager;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$request, this.this$0, dVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Paywall paywall, d<? super Unit> dVar) {
                return ((AnonymousClass1) create(paywall, dVar)).invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                int i11 = 6 ^ 1;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    PaywallInfo info = ((Paywall) this.L$0).getInfo(this.$request.getEventData());
                    PaywallRequestManager paywallRequestManager = this.this$0;
                    EventData eventData = this.$request.getEventData();
                    this.label = 1;
                    if (paywallRequestManager.trackResponseLoaded(info, eventData, this) == objL) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26962(PaywallRequest paywallRequest, PaywallRequestManager paywallRequestManager, boolean z10, d<? super C26962> dVar) {
            super(2, dVar);
            this.$request = paywallRequest;
            this.this$0 = paywallRequestManager;
            this.$isPreloading = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C26962(this.$request, this.this$0, this.$isPreloading, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, d<? super Either<? extends Paywall, ?>> dVar) {
            return invoke2(s0Var, (d<? super Either<Paywall, ?>>) dVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0099  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objThen;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                        return obj;
                    }
                    ResultKt.m(obj);
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$request, this.this$0, null);
                this.label = 3;
                objThen = EitherKt.then((Either) obj, anonymousClass1, this);
                if (objThen != objL) {
                    return objThen;
                }
                return objL;
            }
            ResultKt.m(obj);
            Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "!!getRawPaywall - " + this.$request.getResponseIdentifiers().getPaywallId(), null, null, 24, null);
            PaywallRequestManager paywallRequestManager = this.this$0;
            EventData eventData = this.$request.getEventData();
            this.label = 1;
            if (paywallRequestManager.trackResponseStarted(eventData, this) != objL) {
            }
            return objL;
            PaywallRequestManager paywallRequestManager2 = this.this$0;
            PaywallRequest paywallRequest = this.$request;
            boolean z10 = this.$isPreloading;
            this.label = 2;
            obj = paywallRequestManager2.getPaywallResponse(paywallRequest, z10, this);
            if (obj != objL) {
                AnonymousClass1 anonymousClass2 = new AnonymousClass1(this.$request, this.this$0, null);
                this.label = 3;
                objThen = EitherKt.then((Either) obj, anonymousClass2, this);
                if (objThen != objL) {
                    return objThen;
                }
            }
            return objL;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, d<? super Either<Paywall, ?>> dVar) {
            return ((C26962) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$saveRequestHash$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$saveRequestHash$2", f = "PaywallRequestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C26972 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ boolean $isDebuggerLaunched;
        final /* synthetic */ Paywall $paywall;
        final /* synthetic */ String $requestHash;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26972(String str, boolean z10, Paywall paywall, d<? super C26972> dVar) {
            super(2, dVar);
            this.$requestHash = str;
            this.$isDebuggerLaunched = z10;
            this.$paywall = paywall;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PaywallRequestManager.this.new C26972(this.$requestHash, this.$isDebuggerLaunched, this.$paywall, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            PaywallRequestManager.this.activeTasks.remove(this.$requestHash);
            if (!this.$isDebuggerLaunched) {
                PaywallRequestManager.this.paywallsByHash.put(this.$requestHash, this.$paywall);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26972) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$trackProductsLoadFinish$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$trackProductsLoadFinish$2", f = "PaywallRequestManager.kt", i = {0}, l = {332}, m = "invokeSuspend", n = {"paywall"}, s = {"L$0"})
    static final class C26982 extends o implements Function2<s0, d<? super Paywall>, Object> {
        final /* synthetic */ EventData $event;
        final /* synthetic */ Paywall $paywall;
        Object L$0;
        int label;
        final /* synthetic */ PaywallRequestManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26982(Paywall paywall, EventData eventData, PaywallRequestManager paywallRequestManager, d<? super C26982> dVar) {
            super(2, dVar);
            this.$paywall = paywall;
            this.$event = eventData;
            this.this$0 = paywallRequestManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C26982(this.$paywall, this.$event, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Paywall paywall = (Paywall) this.L$0;
                ResultKt.m(obj);
                return paywall;
            }
            ResultKt.m(obj);
            Paywall paywall2 = this.$paywall;
            paywall2.getProductsLoadingInfo().setEndAt(new Date());
            InternalSuperwallEvent.PaywallProductsLoad paywallProductsLoad = new InternalSuperwallEvent.PaywallProductsLoad(new InternalSuperwallEvent.PaywallProductsLoad.State.Complete(), paywall2.getInfo(this.$event), this.$event);
            Function2 function2 = this.this$0.track;
            this.L$0 = paywall2;
            this.label = 1;
            return function2.invoke(paywallProductsLoad, this) == objL ? objL : paywall2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Paywall> dVar) {
            return ((C26982) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$trackProductsLoadStart$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$trackProductsLoadStart$2", f = "PaywallRequestManager.kt", i = {0}, l = {314}, m = "invokeSuspend", n = {"paywall"}, s = {"L$0"})
    static final class C26992 extends o implements Function2<s0, d<? super Paywall>, Object> {
        final /* synthetic */ Paywall $paywall;
        final /* synthetic */ PaywallRequest $request;
        Object L$0;
        int label;
        final /* synthetic */ PaywallRequestManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26992(Paywall paywall, PaywallRequest paywallRequest, PaywallRequestManager paywallRequestManager, d<? super C26992> dVar) {
            super(2, dVar);
            this.$paywall = paywall;
            this.$request = paywallRequest;
            this.this$0 = paywallRequestManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C26992(this.$paywall, this.$request, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Paywall paywall = (Paywall) this.L$0;
                ResultKt.m(obj);
                return paywall;
            }
            ResultKt.m(obj);
            Paywall paywall2 = this.$paywall;
            paywall2.getProductsLoadingInfo().setStartAt(new Date());
            InternalSuperwallEvent.PaywallProductsLoad paywallProductsLoad = new InternalSuperwallEvent.PaywallProductsLoad(new InternalSuperwallEvent.PaywallProductsLoad.State.Start(), paywall2.getInfo(this.$request.getEventData()), this.$request.getEventData());
            Function2 function2 = this.this$0.track;
            this.L$0 = paywall2;
            this.label = 1;
            return function2.invoke(paywallProductsLoad, this) == objL ? objL : paywall2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Paywall> dVar) {
            return ((C26992) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$trackResponseLoaded$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$trackResponseLoaded$2", f = "PaywallRequestManager.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    static final class C27002 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ EventData $event;
        final /* synthetic */ PaywallInfo $paywallInfo;
        int label;
        final /* synthetic */ PaywallRequestManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27002(PaywallInfo paywallInfo, EventData eventData, PaywallRequestManager paywallRequestManager, d<? super C27002> dVar) {
            super(2, dVar);
            this.$paywallInfo = paywallInfo;
            this.$event = eventData;
            this.this$0 = paywallRequestManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C27002(this.$paywallInfo, this.$event, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                InternalSuperwallEvent.PaywallLoad paywallLoad = new InternalSuperwallEvent.PaywallLoad(new InternalSuperwallEvent.PaywallLoad.State.Complete(this.$paywallInfo), this.$event);
                Function2 function2 = this.this$0.track;
                this.label = 1;
                if (function2.invoke(paywallLoad, this) == objL) {
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
            return ((C27002) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$trackResponseStarted$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$trackResponseStarted$2", f = "PaywallRequestManager.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
    static final class C27012 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ EventData $event;
        int label;
        final /* synthetic */ PaywallRequestManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27012(EventData eventData, PaywallRequestManager paywallRequestManager, d<? super C27012> dVar) {
            super(2, dVar);
            this.$event = eventData;
            this.this$0 = paywallRequestManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C27012(this.$event, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                InternalSuperwallEvent.PaywallLoad paywallLoad = new InternalSuperwallEvent.PaywallLoad(new InternalSuperwallEvent.PaywallLoad.State.Start(), this.$event);
                Function2 function2 = this.this$0.track;
                this.label = 1;
                if (function2.invoke(paywallLoad, this) == objL) {
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
            return ((C27012) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$updatePaywall$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$updatePaywall$2", f = "PaywallRequestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27022 extends o implements Function2<s0, d<? super Paywall>, Object> {
        final /* synthetic */ Paywall $paywall;
        final /* synthetic */ PaywallRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27022(Paywall paywall, PaywallRequest paywallRequest, d<? super C27022> dVar) {
            super(2, dVar);
            this.$paywall = paywall;
            this.$request = paywallRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C27022(this.$paywall, this.$request, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Paywall paywall = this.$paywall;
            paywall.setExperiment(this.$request.getResponseIdentifiers().getExperiment());
            paywall.setPresentationSourceType(this.$request.getPresentationSourceType());
            return paywall;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Paywall> dVar) {
            return ((C27022) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallRequestManager(@NotNull StoreManager storeManager, @NotNull Network network, @NotNull PaywallRequestManagerDepFactory factory, @NotNull IOScope ioScope, @NotNull Function2<? super TrackableSuperwallEvent, ? super d<? super Unit>, ? extends Object> track, @NotNull Function0<? extends Map<String, String>> getGlobalOverrides) {
        Intrinsics.checkNotNullParameter(storeManager, "storeManager");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(getGlobalOverrides, "getGlobalOverrides");
        this.storeManager = storeManager;
        this.network = network;
        this.factory = factory;
        this.ioScope = ioScope;
        this.track = track;
        this.getGlobalOverrides = getGlobalOverrides;
        this.activeTasks = new LinkedHashMap();
        this.paywallsByHash = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map _init_$lambda$0() {
        return Superwall.Companion.getInstance().getOverrideProductsByName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public final Object convertProductOverrides(Map<String, ? extends ProductOverride> map, d<? super Map<String, StoreProduct>> dVar) {
        C26921 c26921;
        Map map2;
        String productIdentifier;
        if (dVar instanceof C26921) {
            c26921 = (C26921) dVar;
            int i10 = c26921.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26921.label = i10 - Integer.MIN_VALUE;
            } else {
                c26921 = new C26921(dVar);
            }
        } else {
            c26921 = new C26921(dVar);
        }
        C26921 c26922 = c26921;
        Object obj = c26922.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26922.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (map == null || map.isEmpty()) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            StoreManager storeManager = this.storeManager;
            Collection<? extends ProductOverride> collectionValues = map.values();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
            for (ProductOverride productOverride : collectionValues) {
                if (productOverride instanceof ProductOverride.ById) {
                    productIdentifier = ((ProductOverride.ById) productOverride).getProductId();
                } else {
                    if (!(productOverride instanceof ProductOverride.ByProduct)) {
                        throw new k0();
                    }
                    productIdentifier = ((ProductOverride.ByProduct) productOverride).getProduct().getProductIdentifier();
                }
                arrayList.add(productIdentifier);
            }
            List list = CollectionsKt.toList(arrayList);
            c26922.L$0 = map;
            c26922.L$1 = linkedHashMap;
            c26922.label = 1;
            Object productsWithoutPaywall$default = StoreKit.DefaultImpls.getProductsWithoutPaywall$default(storeManager, list, null, c26922, 2, null);
            if (productsWithoutPaywall$default == objL) {
                return objL;
            }
            obj = productsWithoutPaywall$default;
            map2 = linkedHashMap;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map2 = (Map) c26922.L$1;
            map = (Map) c26922.L$0;
            ResultKt.m(obj);
        }
        Map map3 = (Map) obj;
        for (Map.Entry<String, ? extends ProductOverride> entry : map.entrySet()) {
            String key = entry.getKey();
            ProductOverride value = entry.getValue();
            if (value instanceof ProductOverride.ByProduct) {
                map2.put(key, ((ProductOverride.ByProduct) value).getProduct());
            } else {
                if (!(value instanceof ProductOverride.ById)) {
                    throw new k0();
                }
                map2.put(key, (StoreProduct) map3.get(((ProductOverride.ById) value).getProductId()));
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (entry2.getValue() != null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        if (linkedHashMap2.isEmpty()) {
            return null;
        }
        return linkedHashMap2;
    }

    public static /* synthetic */ Object getPaywall$default(PaywallRequestManager paywallRequestManager, PaywallRequest paywallRequest, boolean z10, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return paywallRequestManager.getPaywall(paywallRequest, z10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getPaywallResponse(PaywallRequest paywallRequest, boolean z10, d<? super Either<Paywall, ?>> dVar) {
        return i.h(this.ioScope.getCoroutineContext(), new C26942(paywallRequest, this, z10, null), dVar);
    }

    static /* synthetic */ Object getPaywallResponse$default(PaywallRequestManager paywallRequestManager, PaywallRequest paywallRequest, boolean z10, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return paywallRequestManager.getPaywallResponse(paywallRequest, z10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getProducts(Paywall paywall, PaywallRequest paywallRequest, d<? super Paywall> dVar) {
        return i.h(this.ioScope.getCoroutineContext(), new C26952(paywall, paywallRequest, this, null), dVar);
    }

    public static /* synthetic */ Object getRawPaywall$default(PaywallRequestManager paywallRequestManager, PaywallRequest paywallRequest, boolean z10, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return paywallRequestManager.getRawPaywall(paywallRequest, z10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveRequestHash(String str, Paywall paywall, boolean z10, d<? super Unit> dVar) {
        Object objH = i.h(this.ioScope.getCoroutineContext(), new C26972(str, z10, paywall, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackProductsLoadFinish(Paywall paywall, EventData eventData, d<? super Paywall> dVar) {
        return i.h(this.ioScope.getCoroutineContext(), new C26982(paywall, eventData, this, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackProductsLoadStart(Paywall paywall, PaywallRequest paywallRequest, d<? super Paywall> dVar) {
        return i.h(this.ioScope.getCoroutineContext(), new C26992(paywall, paywallRequest, this, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackResponseLoaded(PaywallInfo paywallInfo, EventData eventData, d<? super Unit> dVar) {
        Object objH = i.h(this.ioScope.getCoroutineContext(), new C27002(paywallInfo, eventData, this, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackResponseStarted(EventData eventData, d<? super Unit> dVar) {
        Object objH = i.h(this.ioScope.getCoroutineContext(), new C27012(eventData, this, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updatePaywall(Paywall paywall, PaywallRequest paywallRequest, d<? super Paywall> dVar) {
        return i.h(this.ioScope.getCoroutineContext(), new C27022(paywall, paywallRequest, null), dVar);
    }

    @Nullable
    public final Object addProducts(@NotNull Paywall paywall, @NotNull PaywallRequest paywallRequest, @NotNull d<? super Paywall> dVar) {
        return i.h(this.ioScope.getCoroutineContext(), new AnonymousClass2(paywall, this, paywallRequest, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object getPaywall(@NotNull PaywallRequest paywallRequest, boolean z10, @NotNull d<? super Either<Paywall, Throwable>> dVar) {
        C26931 c26931;
        if (dVar instanceof C26931) {
            c26931 = (C26931) dVar;
            int i10 = c26931.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26931.label = i10 - Integer.MIN_VALUE;
            } else {
                c26931 = new C26931(dVar);
            }
        } else {
            c26931 = new C26931(dVar);
        }
        Object objH = c26931.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26931.label;
        try {
            if (i11 == 0) {
                ResultKt.m(objH);
                CoroutineContext coroutineContext = this.ioScope.getCoroutineContext();
                PaywallRequestManager$getPaywall$2$1 paywallRequestManager$getPaywall$2$1 = new PaywallRequestManager$getPaywall$2$1(this, paywallRequest, z10, null);
                c26931.label = 1;
                objH = i.h(coroutineContext, paywallRequestManager$getPaywall$2$1, c26931);
                if (objH == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objH);
            }
            return new Either.Success((Paywall) objH);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            return new Either.Failure(th2);
        }
    }

    @Nullable
    public final Object getRawPaywall(@NotNull PaywallRequest paywallRequest, boolean z10, @NotNull d<? super Either<Paywall, ?>> dVar) {
        return i.h(this.ioScope.getCoroutineContext(), new C26962(paywallRequest, this, z10, null), dVar);
    }

    public final void resetCache$superwall_release() {
        this.paywallsByHash.clear();
    }

    public /* synthetic */ PaywallRequestManager(StoreManager storeManager, Network network, PaywallRequestManagerDepFactory paywallRequestManagerDepFactory, IOScope iOScope, Function2 function2, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storeManager, network, paywallRequestManagerDepFactory, iOScope, (i10 & 16) != 0 ? new AnonymousClass1(null) : function2, (i10 & 32) != 0 ? new Function0() { // from class: com.superwall.sdk.paywall.request.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaywallRequestManager._init_$lambda$0();
            }
        } : function0);
    }
}
