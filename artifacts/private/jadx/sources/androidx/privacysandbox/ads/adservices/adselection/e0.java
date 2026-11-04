package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 4), @androidx.annotation.x0(extension = 31, version = 9)})
@e.a({"NewApi", "ClassVerificationFailure"})
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
@SourceDebugExtension({"SMAP\nAdSelectionManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,230:1\n314#2,11:231\n314#2,11:242\n*S KotlinDebug\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon\n*L\n50#1:231,11\n70#1:242,11\n*E\n"})
public class e0 extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AdSelectionManager f73403b;

    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 10), @androidx.annotation.x0(extension = 31, version = 10)})
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0696a f73404a = new C0696a(null);

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.e0$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nAdSelectionManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,230:1\n314#2,11:231\n314#2,11:242\n314#2,11:253\n*S KotlinDebug\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl$Companion\n*L\n146#1:231,11\n165#1:242,11\n182#1:253,11\n*E\n"})
        public static final class C0696a {

            /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.e0$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", f = "AdSelectionManagerImplCommon.kt", i = {0, 0}, l = {231}, m = "getAdSelectionData", n = {"adSelectionManager", "getAdSelectionDataRequest"}, s = {"L$0", "L$1"})
            static final class C0697a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f73405a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f73406b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f73407c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f73409e;

                C0697a(kotlin.coroutines.d<? super C0697a> dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f73407c = obj;
                    this.f73409e |= Integer.MIN_VALUE;
                    return C0696a.this.a(null, null, this);
                }
            }

            /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.e0$a$a$b */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", f = "AdSelectionManagerImplCommon.kt", i = {0, 0}, l = {231}, m = "persistAdSelectionResult", n = {"adSelectionManager", "persistAdSelectionResultRequest"}, s = {"L$0", "L$1"})
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f73410a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f73411b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f73412c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f73414e;

                b(kotlin.coroutines.d<? super b> dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f73412c = obj;
                    this.f73414e |= Integer.MIN_VALUE;
                    return C0696a.this.b(null, null, this);
                }
            }

            /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.e0$a$a$c */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", f = "AdSelectionManagerImplCommon.kt", i = {0, 0}, l = {231}, m = "selectAds", n = {"adSelectionManager", "adSelectionFromOutcomesConfig"}, s = {"L$0", "L$1"})
            static final class c extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f73415a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f73416b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f73417c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f73419e;

                c(kotlin.coroutines.d<? super c> dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f73417c = obj;
                    this.f73419e |= Integer.MIN_VALUE;
                    int i10 = 6 >> 0;
                    return C0696a.this.c(null, null, this);
                }
            }

            public /* synthetic */ C0696a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0018  */
            @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @androidx.annotation.u
            @Nullable
            public final Object a(@NotNull AdSelectionManager adSelectionManager, @NotNull q0 q0Var, @NotNull kotlin.coroutines.d<? super m0> dVar) {
                C0697a c0697a;
                if (dVar instanceof C0697a) {
                    c0697a = (C0697a) dVar;
                    int i10 = c0697a.f73409e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0697a.f73409e = i10 - Integer.MIN_VALUE;
                    } else {
                        c0697a = new C0697a(dVar);
                    }
                } else {
                    c0697a = new C0697a(dVar);
                }
                Object objU = c0697a.f73407c;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c0697a.f73409e;
                if (i11 == 0) {
                    ResultKt.m(objU);
                    c0697a.f73405a = adSelectionManager;
                    c0697a.f73406b = q0Var;
                    c0697a.f73409e = 1;
                    kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(c0697a), 1);
                    pVar.p0();
                    adSelectionManager.getAdSelectionData(q0Var.a(), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
                    objU = pVar.u();
                    if (objU == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(c0697a);
                    }
                    if (objU == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.a(c0697a.f73405a);
                    ResultKt.m(objU);
                }
                return new m0(c0.a(objU));
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @androidx.annotation.u
            @Nullable
            public final Object b(@NotNull AdSelectionManager adSelectionManager, @NotNull x0 x0Var, @NotNull kotlin.coroutines.d<? super j0> dVar) {
                b bVar;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i10 = bVar.f73414e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        bVar.f73414e = i10 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(dVar);
                    }
                } else {
                    bVar = new b(dVar);
                }
                Object objU = bVar.f73412c;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = bVar.f73414e;
                if (i11 == 0) {
                    ResultKt.m(objU);
                    bVar.f73410a = adSelectionManager;
                    bVar.f73411b = x0Var;
                    bVar.f73414e = 1;
                    kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(bVar), 1);
                    pVar.p0();
                    adSelectionManager.persistAdSelectionResult(x0Var.a(), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
                    objU = pVar.u();
                    if (objU == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(bVar);
                    }
                    if (objU == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.a(bVar.f73410a);
                    ResultKt.m(objU);
                }
                return new j0(x.a(objU));
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0018  */
            @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @androidx.annotation.u
            @Nullable
            public final Object c(@NotNull AdSelectionManager adSelectionManager, @NotNull q qVar, @NotNull kotlin.coroutines.d<? super j0> dVar) {
                c cVar;
                if (dVar instanceof c) {
                    cVar = (c) dVar;
                    int i10 = cVar.f73419e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        cVar.f73419e = i10 - Integer.MIN_VALUE;
                    } else {
                        cVar = new c(dVar);
                    }
                } else {
                    cVar = new c(dVar);
                }
                Object objU = cVar.f73417c;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = cVar.f73419e;
                if (i11 == 0) {
                    ResultKt.m(objU);
                    cVar.f73415a = adSelectionManager;
                    cVar.f73416b = qVar;
                    cVar.f73419e = 1;
                    kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(cVar), 1);
                    pVar.p0();
                    adSelectionManager.selectAds(qVar.a(), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
                    objU = pVar.u();
                    if (objU == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(cVar);
                    }
                    if (objU == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.a(cVar.f73415a);
                    ResultKt.m(objU);
                }
                return new j0(x.a(objU));
            }

            private C0696a() {
            }
        }

        private a() {
        }
    }

    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 8), @androidx.annotation.x0(extension = 31, version = 9)})
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f73420a = new a(null);

        @SourceDebugExtension({"SMAP\nAdSelectionManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,230:1\n314#2,11:231\n314#2,11:242\n*S KotlinDebug\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl$Companion\n*L\n204#1:231,11\n219#1:242,11\n*E\n"})
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @androidx.annotation.u
            @Nullable
            public final Object a(@NotNull AdSelectionManager adSelectionManager, @NotNull y0 y0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                boolean z10 = true & true;
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
                pVar.p0();
                adSelectionManager.reportEvent(y0Var.a(), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
                Object objU = pVar.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
            }

            @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @androidx.annotation.u
            @Nullable
            public final Object b(@NotNull AdSelectionManager adSelectionManager, @NotNull k1 k1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
                pVar.p0();
                adSelectionManager.updateAdCounterHistogram(k1Var.a(), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
                Object objU = pVar.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
            }

            private a() {
            }
        }

        private b() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon", f = "AdSelectionManagerImplCommon.kt", i = {}, l = {44}, m = "selectAds$suspendImpl", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f73421a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f73423c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f73421a = obj;
            this.f73423c |= Integer.MIN_VALUE;
            return e0.o(e0.this, null, this);
        }
    }

    public e0(@NotNull AdSelectionManager mAdSelectionManager) {
        Intrinsics.checkNotNullParameter(mAdSelectionManager, "mAdSelectionManager");
        this.f73403b = mAdSelectionManager;
    }

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    static /* synthetic */ Object j(e0 e0Var, q0 q0Var, kotlin.coroutines.d<? super m0> dVar) {
        androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
        if (aVar.a() >= 10 || aVar.b() >= 10) {
            return a.f73404a.a(e0Var.f73403b, q0Var, dVar);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    static /* synthetic */ Object l(e0 e0Var, x0 x0Var, kotlin.coroutines.d<? super j0> dVar) {
        androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
        if (aVar.a() < 10 && aVar.b() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        return a.f73404a.b(e0Var.f73403b, x0Var, dVar);
    }

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    static /* synthetic */ Object m(e0 e0Var, y0 y0Var, kotlin.coroutines.d<? super Unit> dVar) {
        androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
        if (aVar.a() < 8 && aVar.b() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objA = b.f73420a.a(e0Var.f73403b, y0Var, dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    static /* synthetic */ Object n(e0 e0Var, g1 g1Var, kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        e0Var.k().reportImpression(g1Var.a(), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    static /* synthetic */ Object o(e0 e0Var, j jVar, kotlin.coroutines.d<? super j0> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f73423c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f73423c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = e0Var.new c(dVar);
            }
        } else {
            cVar = e0Var.new c(dVar);
        }
        Object objQ = cVar.f73421a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f73423c;
        if (i11 == 0) {
            ResultKt.m(objQ);
            AdSelectionConfig adSelectionConfigD = jVar.d();
            cVar.f73423c = 1;
            objQ = e0Var.q(adSelectionConfigD, cVar);
            if (objQ == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objQ);
        }
        return new j0(x.a(objQ));
    }

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    static /* synthetic */ Object p(e0 e0Var, q qVar, kotlin.coroutines.d<? super j0> dVar) {
        androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
        if (aVar.a() < 10 && aVar.b() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        return a.f73404a.c(e0Var.f73403b, qVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public final Object q(AdSelectionConfig adSelectionConfig, kotlin.coroutines.d<? super AdSelectionOutcome> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        k().selectAds(adSelectionConfig, new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    static /* synthetic */ Object r(e0 e0Var, k1 k1Var, kotlin.coroutines.d<? super Unit> dVar) {
        androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
        if (aVar.a() < 8 && aVar.b() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objB = b.f73420a.b(e0Var.f73403b, k1Var, dVar);
        return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.r
    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    @Nullable
    public Object a(@NotNull q0 q0Var, @NotNull kotlin.coroutines.d<? super m0> dVar) {
        return j(this, q0Var, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.r
    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    @Nullable
    public Object c(@NotNull x0 x0Var, @NotNull kotlin.coroutines.d<? super j0> dVar) {
        return l(this, x0Var, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.r
    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    @Nullable
    public Object d(@NotNull y0 y0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return m(this, y0Var, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.r
    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    @Nullable
    public Object e(@NotNull g1 g1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return n(this, g1Var, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.r
    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    @Nullable
    public Object f(@NotNull j jVar, @NotNull kotlin.coroutines.d<? super j0> dVar) {
        return o(this, jVar, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.r
    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    @Nullable
    public Object g(@NotNull q qVar, @NotNull kotlin.coroutines.d<? super j0> dVar) {
        return p(this, qVar, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.r
    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    @Nullable
    public Object h(@NotNull k1 k1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return r(this, k1Var, dVar);
    }

    @NotNull
    protected final AdSelectionManager k() {
        return this.f73403b;
    }
}
