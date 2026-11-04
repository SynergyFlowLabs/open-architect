package com.planner5d.library.model.manager.config.source.growthbook;

import android.app.Application;
import androidx.annotation.m1;
import com.planner5d.library.model.manager.config.source.n;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.utility.d3;
import com.planner5d.library.services.utility.e0;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.services.utility.v2;
import com.sdk.growthbook.model.m;
import com.sdk.growthbook.model.q;
import io.sentry.a8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nGrowthBookFeatureConfigsSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrowthBookFeatureConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/growthbook/GrowthBookFeatureConfigsSource\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,203:1\n61#1:247\n116#2,11:204\n116#2,11:215\n116#2,8:226\n125#2,2:235\n116#2,8:239\n125#2,2:248\n116#2,11:250\n116#2,11:261\n1#3:234\n1863#4,2:237\n*S KotlinDebug\n*F\n+ 1 GrowthBookFeatureConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/growthbook/GrowthBookFeatureConfigsSource\n*L\n135#1:247\n92#1:204,11\n96#1:215,11\n111#1:226,8\n111#1:235,2\n132#1:239,8\n132#1:248,2\n139#1:250,11\n145#1:261,11\n128#1:237,2\n*E\n"})
public final class d implements com.planner5d.library.model.manager.config.source.d, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.source.growthbook.b f181705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final r3 f181706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.attributes.c f181707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final j f181708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final u1 f181709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f181710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f181711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final LinkedList<v2> f181712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private m f181713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final d3<com.sdk.growthbook.e> f181714j;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookFeatureConfigsSource", f = "GrowthBookFeatureConfigsSource.kt", i = {0, 0, 1, 1, 2, 3}, l = {209, 134, 135, 135}, m = "activateFetched", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f181717c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181719e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181717c = obj;
            this.f181719e |= Integer.MIN_VALUE;
            return d.this.f(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookFeatureConfigsSource$activateFetched$2$1", f = "GrowthBookFeatureConfigsSource.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Map<String, ? extends com.planner5d.library.model.manager.config.g>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f181721b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Map<String, ? extends com.planner5d.library.model.manager.config.g>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super Map<String, com.planner5d.library.model.manager.config.g>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            d dVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181721b;
            if (i10 == 0) {
                ResultKt.m(obj);
                d dVar2 = d.this;
                d3 d3Var = dVar2.f181714j;
                this.f181720a = dVar2;
                this.f181721b = 1;
                Object objA = d3Var.a(this);
                if (objA == objL) {
                    return objL;
                }
                obj = objA;
                dVar = dVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (d) this.f181720a;
                ResultKt.m(obj);
            }
            return dVar.o((com.sdk.growthbook.e) obj);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super Map<String, com.planner5d.library.model.manager.config.g>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookFeatureConfigsSource", f = "GrowthBookFeatureConfigsSource.kt", i = {0, 0, 1}, l = {209, 139}, m = "dropFetchedAndActivated", n = {"this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f181725c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181727e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181725c = obj;
            this.f181727e |= Integer.MIN_VALUE;
            return d.this.c(this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.source.growthbook.d$d, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookFeatureConfigsSource", f = "GrowthBookFeatureConfigsSource.kt", i = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, l = {209, 118, 119, 120, 125, 128}, m = "fetchLatest", n = {"this", "$this$withLock_u24default$iv", "this", "allOngoingLatches", "$this$fetchLatest_u24lambda_u245", "allOngoingLatches", "$this$fetchLatest_u24lambda_u245", "allOngoingLatches", a8.b.f303905f, "allOngoingLatches"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class C1580d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f181730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f181731d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f181733f;

        C1580d(kotlin.coroutines.d<? super C1580d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181731d = obj;
            this.f181733f |= Integer.MIN_VALUE;
            return d.this.b(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookFeatureConfigsSource", f = "GrowthBookFeatureConfigsSource.kt", i = {0, 0, 0, 1}, l = {209, com.planner5d.library.engine.input.f.b.f160700j1}, m = "getFeatureConfig", n = {"this", "feature", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f181736c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f181737d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f181739f;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181737d = obj;
            this.f181739f |= Integer.MIN_VALUE;
            return d.this.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookFeatureConfigsSource", f = "GrowthBookFeatureConfigsSource.kt", i = {0, 0, 1, 1}, l = {209, 146}, m = "getVariationAttributes", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f181742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f181743d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f181745f;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181743d = obj;
            this.f181745f |= Integer.MIN_VALUE;
            return d.this.r(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookFeatureConfigsSource$growthBook$1", f = "GrowthBookFeatureConfigsSource.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nGrowthBookFeatureConfigsSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrowthBookFeatureConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/growthbook/GrowthBookFeatureConfigsSource$growthBook$1\n+ 2 GrowthBookFeatureConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/growthbook/GrowthBookFeatureConfigsSource\n*L\n1#1,203:1\n61#2:204\n*S KotlinDebug\n*F\n+ 1 GrowthBookFeatureConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/growthbook/GrowthBookFeatureConfigsSource$growthBook$1\n*L\n67#1:204\n*E\n"})
    static final class g extends o implements Function1<kotlin.coroutines.d<? super com.sdk.growthbook.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181746a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Application f181748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f1 f181749d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookFeatureConfigsSource$growthBook$1$1", f = "GrowthBookFeatureConfigsSource.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super com.sdk.growthbook.e>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f181750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f181751b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f181752c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f181753d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Application f181754e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f181755f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ f1 f181756g;

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.source.growthbook.d$g$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookFeatureConfigsSource$growthBook$1$1$2$1", f = "GrowthBookFeatureConfigsSource.kt", i = {0, 1}, l = {209, com.planner5d.library.engine.input.f.b.B0}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
            @SourceDebugExtension({"SMAP\nGrowthBookFeatureConfigsSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrowthBookFeatureConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/growthbook/GrowthBookFeatureConfigsSource$growthBook$1$1$2$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,203:1\n116#2,11:204\n*S KotlinDebug\n*F\n+ 1 GrowthBookFeatureConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/growthbook/GrowthBookFeatureConfigsSource$growthBook$1$1$2$1\n*L\n83#1:204,11\n*E\n"})
            static final class C1581a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f181757a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f181758b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f181759c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ d f181760d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1581a(d dVar, kotlin.coroutines.d<? super C1581a> dVar2) {
                    super(2, dVar2);
                    this.f181760d = dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C1581a(this.f181760d, dVar);
                }

                /* JADX WARN: Code duplicated, block: B:25:0x007a A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x001a, B:23:0x006b, B:25:0x007a, B:26:0x007d), top: B:35:0x001a }] */
                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    kotlinx.coroutines.sync.a aVar;
                    d dVar;
                    Throwable th2;
                    kotlinx.coroutines.sync.a aVar2;
                    d dVar2;
                    v2 v2Var;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f181759c;
                    try {
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            aVar = this.f181760d.f181711g;
                            dVar = this.f181760d;
                            this.f181757a = aVar;
                            this.f181758b = dVar;
                            this.f181759c = 1;
                            if (aVar.h(null, this) != objL) {
                            }
                            return objL;
                        }
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            dVar2 = (d) this.f181758b;
                            aVar2 = (kotlinx.coroutines.sync.a) this.f181757a;
                            try {
                                ResultKt.m(obj);
                                v2Var = (v2) dVar2.f181712h.poll();
                                if (v2Var != null) {
                                    v2Var.b();
                                }
                                Unit unit = Unit.f312394a;
                                aVar2.i(null);
                                return unit;
                            } catch (Throwable th3) {
                                th2 = th3;
                                aVar2.i(null);
                                throw th2;
                            }
                        }
                        dVar = (d) this.f181758b;
                        kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f181757a;
                        ResultKt.m(obj);
                        aVar = aVar3;
                        com.planner5d.library.model.manager.config.source.growthbook.b bVar = dVar.f181705a;
                        this.f181757a = aVar;
                        this.f181758b = dVar;
                        this.f181759c = 2;
                        if (bVar.i(this) != objL) {
                            aVar2 = aVar;
                            dVar2 = dVar;
                            v2Var = (v2) dVar2.f181712h.poll();
                            if (v2Var != null) {
                                v2Var.b();
                            }
                            Unit unit2 = Unit.f312394a;
                            aVar2.i(null);
                            return unit2;
                        }
                        return objL;
                    } catch (Throwable th4) {
                        kotlinx.coroutines.sync.a aVar4 = aVar;
                        th2 = th4;
                        aVar2 = aVar4;
                        aVar2.i(null);
                        throw th2;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C1581a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Application application, d dVar, f1 f1Var, kotlin.coroutines.d<? super a> dVar2) {
                super(2, dVar2);
                this.f181754e = application;
                this.f181755f = dVar;
                this.f181756g = f1Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit n(d dVar, com.sdk.growthbook.model.f fVar, com.sdk.growthbook.model.g gVar) {
                dVar.f181706b.M(fVar.I(), String.valueOf(gVar.A()), "growthbook", String.valueOf(dVar.f181708d.c(gVar.z())));
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(f1 f1Var, d dVar, boolean z10, com.sdk.growthbook.utils.j jVar) {
                boolean z11 = false | false;
                kotlinx.coroutines.k.f(f1Var, null, null, new C1581a(dVar, null), 3, null);
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f181754e, this.f181755f, this.f181756g, dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                String str;
                String str2;
                com.sdk.growthbook.network.i iVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f181753d;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    String string = this.f181754e.getString(l.q.f184746sc);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = this.f181754e.getString(l.q.f184770tc);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    boolean z10 = 2 & 0;
                    com.sdk.growthbook.network.b bVar = new com.sdk.growthbook.network.b(null, false, 3, 0 == true ? 1 : 0);
                    d dVar = this.f181755f;
                    this.f181750a = string;
                    this.f181751b = string2;
                    this.f181752c = bVar;
                    this.f181753d = 1;
                    Object objR = dVar.r(this);
                    if (objR == objL) {
                        return objL;
                    }
                    str = string;
                    obj = objR;
                    str2 = string2;
                    iVar = bVar;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.sdk.growthbook.network.i iVar2 = (com.sdk.growthbook.network.i) this.f181752c;
                    String str3 = (String) this.f181751b;
                    String str4 = (String) this.f181750a;
                    ResultKt.m(obj);
                    str2 = str3;
                    str = str4;
                    iVar = iVar2;
                }
                Map mapEmptyMap = (m) obj;
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                Map map = mapEmptyMap;
                String strJ = e0.j(128);
                final d dVar2 = this.f181755f;
                com.sdk.growthbook.d dVar3 = new com.sdk.growthbook.d(str, str2, iVar, map, strJ, new Function2() { // from class: com.planner5d.library.model.manager.config.source.growthbook.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return d.g.a.n(dVar2, (com.sdk.growthbook.model.f) obj2, (com.sdk.growthbook.model.g) obj3);
                    }
                }, false, false, false, 448, null);
                final f1 f1Var = this.f181756g;
                final d dVar4 = this.f181755f;
                return dVar3.z(new Function2() { // from class: com.planner5d.library.model.manager.config.source.growthbook.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return d.g.a.s(f1Var, dVar4, ((Boolean) obj2).booleanValue(), (com.sdk.growthbook.utils.j) obj3);
                    }
                }).l();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.sdk.growthbook.e> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Application application, f1 f1Var, kotlin.coroutines.d<? super g> dVar) {
            super(1, dVar);
            this.f181748c = application;
            this.f181749d = f1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return d.this.new g(this.f181748c, this.f181749d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181746a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            z1 z1VarH = s.f229729a.h();
            int i11 = 4 & 0;
            a aVar = new a(this.f181748c, d.this, this.f181749d, null);
            this.f181746a = 1;
            Object objH = kotlinx.coroutines.i.h(z1VarH, aVar, this);
            return objH == objL ? objL : objH;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super com.sdk.growthbook.e> dVar) {
            return ((g) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookFeatureConfigsSource", f = "GrowthBookFeatureConfigsSource.kt", i = {0, 0, 1, 1, 2}, l = {209, com.planner5d.library.engine.input.f.b.f160715o1, com.planner5d.library.engine.input.f.b.f160715o1}, m = "hasFetchedOrActivated", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f181763c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181765e;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181763c = obj;
            this.f181765e |= Integer.MIN_VALUE;
            return d.this.e(this);
        }
    }

    @ij.a
    public d(@NotNull Application application, @NotNull com.planner5d.library.model.manager.config.source.growthbook.b configsStorage, @NotNull r3 statistics, @NotNull com.planner5d.library.model.manager.config.attributes.c variationAttributesProvider, @NotNull j valueConverter, @NotNull u1 logRecordManager, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configsStorage, "configsStorage");
        Intrinsics.checkNotNullParameter(statistics, "statistics");
        Intrinsics.checkNotNullParameter(variationAttributesProvider, "variationAttributesProvider");
        Intrinsics.checkNotNullParameter(valueConverter, "valueConverter");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f181705a = configsStorage;
        this.f181706b = statistics;
        this.f181707c = variationAttributesProvider;
        this.f181708d = valueConverter;
        this.f181709e = logRecordManager;
        this.f181710f = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f181711g = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f181712h = new LinkedList<>();
        this.f181714j = new d3<>(new g(application, coroutineScope, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final Map<String, com.planner5d.library.model.manager.config.g> o(com.sdk.growthbook.e eVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, com.sdk.growthbook.model.h>> it = eVar.l().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            q qVarK = eVar.h(key).k();
            m mVar = qVarK instanceof m ? (m) qVarK : null;
            if (mVar != null && StringsKt.u2(key, "feature_", false, 2, null)) {
                com.planner5d.library.model.manager.config.g gVarT = t(this.f181708d.e(mVar), key);
                if (gVarT != null) {
                    linkedHashMap.put(key, gVarT);
                } else {
                    arrayList.add(key);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            s(arrayList);
        }
        return linkedHashMap;
    }

    private final n0 p() {
        return s.f229729a.h();
    }

    @kotlinx.coroutines.f1
    private static /* synthetic */ void q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003c, B:27:0x008d, B:30:0x00a0), top: B:37:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object r(kotlin.coroutines.d<? super m> dVar) throws Throwable {
        f fVar;
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        d dVar2;
        j jVar;
        m mVarH;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f181745f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f181745f = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f181743d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f181745f;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar = this.f181710f;
                fVar.f181740a = this;
                fVar.f181741b = aVar;
                fVar.f181745f = 1;
                if (aVar.h(null, fVar) != objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (j) fVar.f181742c;
                aVar2 = (kotlinx.coroutines.sync.a) fVar.f181741b;
                dVar2 = (d) fVar.f181740a;
                try {
                    ResultKt.m(obj);
                    mVarH = jVar.h((Map) obj);
                    if (Intrinsics.areEqual(mVarH, dVar2.f181713i)) {
                        mVarH = null;
                    } else {
                        dVar2.f181713i = mVarH;
                    }
                    aVar2.i(null);
                    return mVarH;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.i(null);
                    throw th;
                }
            }
            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) fVar.f181741b;
            d dVar3 = (d) fVar.f181740a;
            ResultKt.m(obj);
            aVar = aVar3;
            this = dVar3;
            j jVar2 = this.f181708d;
            com.planner5d.library.model.manager.config.attributes.c cVar = this.f181707c;
            fVar.f181740a = this;
            fVar.f181741b = aVar;
            fVar.f181742c = jVar2;
            fVar.f181745f = 2;
            Object objA = cVar.a(fVar);
            if (objA != objL) {
                aVar2 = aVar;
                obj = objA;
                dVar2 = this;
                jVar = jVar2;
                mVarH = jVar.h((Map) obj);
                if (Intrinsics.areEqual(mVarH, dVar2.f181713i)) {
                    mVarH = null;
                } else {
                    dVar2.f181713i = mVarH;
                }
                aVar2.i(null);
                return mVarH;
            }
            return objL;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }

    private final void s(List<String> list) {
        String strJoinToString$default = CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null);
        timber.log.b.f381052a.d("Malformed feature configs are encountered: " + strJoinToString$default, new Object[0]);
        this.f181709e.a("malformed_feature_configs", strJoinToString$default, null, 8L, TimeUnit.HOURS);
    }

    @m1
    private final com.planner5d.library.model.manager.config.g t(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            return new com.planner5d.library.model.manager.config.g(jSONObject2);
        } catch (JSONException e10) {
            timber.log.b.f381052a.e(e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.planner5d.library.model.manager.config.source.d
    @Nullable
    public Object a(@NotNull com.planner5d.library.model.manager.config.f fVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.manager.config.g> dVar) throws Throwable {
        e eVar;
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f181739f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f181739f = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f181737d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f181739f;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar = this.f181711g;
                eVar.f181734a = this;
                eVar.f181735b = fVar;
                eVar.f181736c = aVar;
                eVar.f181739f = 1;
                if (aVar.h(null, eVar) != objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (kotlinx.coroutines.sync.a) eVar.f181734a;
                try {
                    ResultKt.m(obj);
                    com.planner5d.library.model.manager.config.g gVar = (com.planner5d.library.model.manager.config.g) obj;
                    aVar2.i(null);
                    return gVar;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.i(null);
                    throw th;
                }
            }
            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) eVar.f181736c;
            fVar = (com.planner5d.library.model.manager.config.f) eVar.f181735b;
            d dVar2 = (d) eVar.f181734a;
            ResultKt.m(obj);
            aVar = aVar3;
            this = dVar2;
            com.planner5d.library.model.manager.config.source.growthbook.b bVar = this.f181705a;
            String str = "feature_" + fVar.getId();
            eVar.f181734a = aVar;
            eVar.f181735b = null;
            eVar.f181736c = null;
            eVar.f181739f = 2;
            Object objD = bVar.d(str, eVar);
            if (objD != objL) {
                kotlinx.coroutines.sync.a aVar4 = aVar;
                obj = objD;
                aVar2 = aVar4;
                com.planner5d.library.model.manager.config.g gVar2 = (com.planner5d.library.model.manager.config.g) obj;
                aVar2.i(null);
                return gVar2;
            }
            return objL;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:28:0x00de  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f1 A[PHI: r2 r7 r8
      0x00f1: PHI (r2v11 java.util.List) = (r2v8 java.util.List), (r2v13 java.util.List) binds: [B:29:0x00ee, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r7v13 com.planner5d.library.services.utility.d3<com.sdk.growthbook.e>) = 
      (r7v7 com.planner5d.library.services.utility.d3<com.sdk.growthbook.e>)
      (r7v18 com.planner5d.library.services.utility.d3<com.sdk.growthbook.e>)
     binds: [B:29:0x00ee, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r8v13 java.lang.Object) = (r8v12 java.lang.Object), (r8v1 java.lang.Object) binds: [B:29:0x00ee, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:38:0x010b  */
    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
    /* JADX WARN: Code duplicated, block: B:43:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[LOOP:0: B:46:0x0136->B:61:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.planner5d.library.model.manager.config.source.n
    @kotlinx.coroutines.f1
    @Nullable
    public Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        C1580d c1580d;
        kotlinx.coroutines.sync.a aVar;
        List list;
        d3<com.sdk.growthbook.e> d3Var;
        Object objB;
        d dVar2;
        d3<com.sdk.growthbook.e> d3Var2;
        List list2;
        m mVar;
        Object objA;
        m mVar2;
        Iterator it;
        v2 v2Var;
        if (dVar instanceof C1580d) {
            c1580d = (C1580d) dVar;
            int i10 = c1580d.f181733f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1580d.f181733f = i10 - Integer.MIN_VALUE;
            } else {
                c1580d = new C1580d(dVar);
            }
        } else {
            c1580d = new C1580d(dVar);
        }
        Object objR = c1580d.f181731d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        switch (c1580d.f181733f) {
            case 0:
                ResultKt.m(objR);
                aVar = this.f181711g;
                c1580d.f181728a = this;
                c1580d.f181729b = aVar;
                c1580d.f181733f = 1;
                if (aVar.h(null, c1580d) != objL) {
                    try {
                        this.f181712h.add(new v2());
                        list = CollectionsKt.toList(this.f181712h);
                        aVar.i(null);
                        d3Var = this.f181714j;
                        c1580d.f181728a = this;
                        c1580d.f181729b = list;
                        c1580d.f181730c = d3Var;
                        c1580d.f181733f = 2;
                        objB = d3Var.b(c1580d);
                        if (objB == objL) {
                            dVar2 = this;
                            d3Var2 = d3Var;
                            objR = objB;
                            if (((Boolean) objR).booleanValue()) {
                                c1580d.f181728a = list;
                                c1580d.f181729b = d3Var2;
                                c1580d.f181730c = null;
                                c1580d.f181733f = 3;
                                objR = dVar2.r(c1580d);
                                if (objR != objL) {
                                    mVar = (m) objR;
                                    if (mVar == null) {
                                        return Unit.f312394a;
                                    }
                                    c1580d.f181728a = list;
                                    c1580d.f181729b = mVar;
                                    c1580d.f181733f = 4;
                                    objA = d3Var2.a(c1580d);
                                    if (objA != objL) {
                                        objR = objA;
                                        mVar2 = mVar;
                                        com.sdk.growthbook.e eVar = (com.sdk.growthbook.e) objR;
                                        eVar.w(mVar2);
                                        eVar.q();
                                        Unit unit = Unit.f312394a;
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            v2Var = (v2) it.next();
                                            c1580d.f181728a = it;
                                            c1580d.f181729b = null;
                                            c1580d.f181733f = 6;
                                            if (v2Var.a(c1580d) == objL) {
                                            }
                                        }
                                        return Unit.f312394a;
                                    }
                                }
                            } else {
                                c1580d.f181728a = list;
                                c1580d.f181729b = null;
                                c1580d.f181730c = null;
                                c1580d.f181733f = 5;
                                if (d3Var2.a(c1580d) != objL) {
                                    list2 = list;
                                    list = list2;
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        v2Var = (v2) it.next();
                                        c1580d.f181728a = it;
                                        c1580d.f181729b = null;
                                        c1580d.f181733f = 6;
                                        if (v2Var.a(c1580d) == objL) {
                                        }
                                    }
                                    return Unit.f312394a;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        aVar.i(null);
                        throw th2;
                    }
                }
                return objL;
            case 1:
                kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) c1580d.f181729b;
                d dVar3 = (d) c1580d.f181728a;
                ResultKt.m(objR);
                aVar = aVar2;
                this = dVar3;
                this.f181712h.add(new v2());
                list = CollectionsKt.toList(this.f181712h);
                aVar.i(null);
                d3Var = this.f181714j;
                c1580d.f181728a = this;
                c1580d.f181729b = list;
                c1580d.f181730c = d3Var;
                c1580d.f181733f = 2;
                objB = d3Var.b(c1580d);
                if (objB == objL) {
                    dVar2 = this;
                    d3Var2 = d3Var;
                    objR = objB;
                    if (((Boolean) objR).booleanValue()) {
                        c1580d.f181728a = list;
                        c1580d.f181729b = d3Var2;
                        c1580d.f181730c = null;
                        c1580d.f181733f = 3;
                        objR = dVar2.r(c1580d);
                        if (objR != objL) {
                            mVar = (m) objR;
                            if (mVar == null) {
                                return Unit.f312394a;
                            }
                            c1580d.f181728a = list;
                            c1580d.f181729b = mVar;
                            c1580d.f181733f = 4;
                            objA = d3Var2.a(c1580d);
                            if (objA != objL) {
                                objR = objA;
                                mVar2 = mVar;
                                com.sdk.growthbook.e eVar2 = (com.sdk.growthbook.e) objR;
                                eVar2.w(mVar2);
                                eVar2.q();
                                Unit unit2 = Unit.f312394a;
                                it = list.iterator();
                                while (it.hasNext()) {
                                    v2Var = (v2) it.next();
                                    c1580d.f181728a = it;
                                    c1580d.f181729b = null;
                                    c1580d.f181733f = 6;
                                    if (v2Var.a(c1580d) == objL) {
                                    }
                                }
                                return Unit.f312394a;
                            }
                        }
                    } else {
                        c1580d.f181728a = list;
                        c1580d.f181729b = null;
                        c1580d.f181730c = null;
                        c1580d.f181733f = 5;
                        if (d3Var2.a(c1580d) != objL) {
                            list2 = list;
                            list = list2;
                            it = list.iterator();
                            while (it.hasNext()) {
                                v2Var = (v2) it.next();
                                c1580d.f181728a = it;
                                c1580d.f181729b = null;
                                c1580d.f181733f = 6;
                                if (v2Var.a(c1580d) == objL) {
                                }
                            }
                            return Unit.f312394a;
                        }
                    }
                }
                return objL;
            case 2:
                d3Var2 = (d3) c1580d.f181730c;
                list = (List) c1580d.f181729b;
                dVar2 = (d) c1580d.f181728a;
                ResultKt.m(objR);
                if (((Boolean) objR).booleanValue()) {
                    c1580d.f181728a = list;
                    c1580d.f181729b = d3Var2;
                    c1580d.f181730c = null;
                    c1580d.f181733f = 3;
                    objR = dVar2.r(c1580d);
                    if (objR != objL) {
                        mVar = (m) objR;
                        if (mVar == null) {
                            return Unit.f312394a;
                        }
                        c1580d.f181728a = list;
                        c1580d.f181729b = mVar;
                        c1580d.f181733f = 4;
                        objA = d3Var2.a(c1580d);
                        if (objA != objL) {
                            objR = objA;
                            mVar2 = mVar;
                            com.sdk.growthbook.e eVar3 = (com.sdk.growthbook.e) objR;
                            eVar3.w(mVar2);
                            eVar3.q();
                            Unit unit3 = Unit.f312394a;
                            it = list.iterator();
                            while (it.hasNext()) {
                                v2Var = (v2) it.next();
                                c1580d.f181728a = it;
                                c1580d.f181729b = null;
                                c1580d.f181733f = 6;
                                if (v2Var.a(c1580d) == objL) {
                                }
                            }
                            return Unit.f312394a;
                        }
                    }
                } else {
                    c1580d.f181728a = list;
                    c1580d.f181729b = null;
                    c1580d.f181730c = null;
                    c1580d.f181733f = 5;
                    if (d3Var2.a(c1580d) != objL) {
                        list2 = list;
                        list = list2;
                        it = list.iterator();
                        while (it.hasNext()) {
                            v2Var = (v2) it.next();
                            c1580d.f181728a = it;
                            c1580d.f181729b = null;
                            c1580d.f181733f = 6;
                            if (v2Var.a(c1580d) == objL) {
                            }
                        }
                        return Unit.f312394a;
                    }
                }
                return objL;
            case 3:
                d3Var2 = (d3) c1580d.f181729b;
                list = (List) c1580d.f181728a;
                ResultKt.m(objR);
                mVar = (m) objR;
                if (mVar == null) {
                    return Unit.f312394a;
                }
                c1580d.f181728a = list;
                c1580d.f181729b = mVar;
                c1580d.f181733f = 4;
                objA = d3Var2.a(c1580d);
                if (objA != objL) {
                    objR = objA;
                    mVar2 = mVar;
                    com.sdk.growthbook.e eVar4 = (com.sdk.growthbook.e) objR;
                    eVar4.w(mVar2);
                    eVar4.q();
                    Unit unit4 = Unit.f312394a;
                    it = list.iterator();
                    while (it.hasNext()) {
                        v2Var = (v2) it.next();
                        c1580d.f181728a = it;
                        c1580d.f181729b = null;
                        c1580d.f181733f = 6;
                        if (v2Var.a(c1580d) == objL) {
                        }
                    }
                    return Unit.f312394a;
                }
                return objL;
            case 4:
                mVar2 = (m) c1580d.f181729b;
                list = (List) c1580d.f181728a;
                ResultKt.m(objR);
                com.sdk.growthbook.e eVar5 = (com.sdk.growthbook.e) objR;
                eVar5.w(mVar2);
                eVar5.q();
                Unit unit5 = Unit.f312394a;
                it = list.iterator();
                while (it.hasNext()) {
                    v2Var = (v2) it.next();
                    c1580d.f181728a = it;
                    c1580d.f181729b = null;
                    c1580d.f181733f = 6;
                    if (v2Var.a(c1580d) == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            case 5:
                list2 = (List) c1580d.f181728a;
                ResultKt.m(objR);
                list = list2;
                it = list.iterator();
                while (it.hasNext()) {
                    v2Var = (v2) it.next();
                    c1580d.f181728a = it;
                    c1580d.f181729b = null;
                    c1580d.f181733f = 6;
                    if (v2Var.a(c1580d) == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            case 6:
                it = (Iterator) c1580d.f181728a;
                ResultKt.m(objR);
                while (it.hasNext()) {
                    v2Var = (v2) it.next();
                    c1580d.f181728a = it;
                    c1580d.f181729b = null;
                    c1580d.f181733f = 6;
                    if (v2Var.a(c1580d) == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        c cVar;
        kotlinx.coroutines.sync.a aVar;
        Throwable th2;
        kotlinx.coroutines.sync.a aVar2;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f181727e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f181727e = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f181725c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f181727e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar = this.f181711g;
                cVar.f181723a = this;
                cVar.f181724b = aVar;
                cVar.f181727e = 1;
                if (aVar.h(null, cVar) != objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (kotlinx.coroutines.sync.a) cVar.f181723a;
                try {
                    ResultKt.m(obj);
                    Unit unit = Unit.f312394a;
                    aVar2.i(null);
                    return unit;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.i(null);
                    throw th2;
                }
            }
            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) cVar.f181724b;
            d dVar2 = (d) cVar.f181723a;
            ResultKt.m(obj);
            aVar = aVar3;
            this = dVar2;
            com.planner5d.library.model.manager.config.source.growthbook.b bVar = this.f181705a;
            cVar.f181723a = aVar;
            cVar.f181724b = null;
            cVar.f181727e = 2;
            if (bVar.c(cVar) != objL) {
                aVar2 = aVar;
                Unit unit2 = Unit.f312394a;
                aVar2.i(null);
                return unit2;
            }
            return objL;
        } catch (Throwable th4) {
            kotlinx.coroutines.sync.a aVar4 = aVar;
            th2 = th4;
            aVar2 = aVar4;
            aVar2.i(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:15:0x0037, B:37:0x00aa, B:41:0x00b6, B:22:0x0052, B:32:0x0091, B:34:0x009a), top: B:48:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.planner5d.library.model.manager.config.source.growthbook.d] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.planner5d.library.model.manager.config.source.growthbook.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.planner5d.library.model.manager.config.source.growthbook.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8, types: [kotlinx.coroutines.sync.a] */
    @Override // com.planner5d.library.model.manager.config.source.n
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Boolean> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.source.growthbook.d.e(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ba A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:15:0x003e, B:48:0x00ee, B:27:0x006e, B:37:0x00b1, B:39:0x00ba), top: B:55:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.planner5d.library.model.manager.config.source.growthbook.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.planner5d.library.model.manager.config.source.growthbook.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.planner5d.library.model.manager.config.source.growthbook.d] */
    @Override // com.planner5d.library.model.manager.config.source.n
    @kotlinx.coroutines.f1
    @Nullable
    public Object f(@NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        a aVar;
        ?? r10;
        kotlinx.coroutines.sync.a aVar2;
        ?? r11;
        ?? r12;
        kotlinx.coroutines.sync.a aVar3;
        com.planner5d.library.model.manager.config.source.growthbook.b bVar;
        Object objH;
        kotlinx.coroutines.sync.a aVar4;
        com.planner5d.library.model.manager.config.source.growthbook.b bVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f181719e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f181719e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f181717c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f181719e;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.m(obj);
                    aVar2 = this.f181711g;
                    aVar.f181715a = this;
                    aVar.f181716b = aVar2;
                    aVar.f181719e = 1;
                    if (aVar2.h(null, aVar) != objL) {
                    }
                    this = this;
                    return objL;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            bVar2 = (com.planner5d.library.model.manager.config.source.growthbook.b) aVar.f181716b;
                            aVar4 = (kotlinx.coroutines.sync.a) aVar.f181715a;
                            try {
                                ResultKt.m(obj);
                                aVar4 = aVar4;
                                aVar.f181715a = aVar4;
                                aVar.f181716b = null;
                                aVar.f181719e = 4;
                                if (bVar2.h((Map) obj, aVar) != objL) {
                                    this = aVar4;
                                }
                                this = this;
                                return objL;
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = aVar4;
                                r10.i(null);
                                throw th;
                            }
                        }
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) aVar.f181715a;
                        ResultKt.m(obj);
                        this = aVar5;
                        Unit unit = Unit.f312394a;
                        this.i(null);
                        return unit;
                    }
                    kotlinx.coroutines.sync.a aVar6 = (kotlinx.coroutines.sync.a) aVar.f181716b;
                    d dVar2 = (d) aVar.f181715a;
                    ResultKt.m(obj);
                    r12 = dVar2;
                    aVar3 = aVar6;
                    this = aVar3;
                    if (((Boolean) obj).booleanValue()) {
                        bVar = r12.f181705a;
                        z1 z1VarH = s.f229729a.h();
                        b bVar3 = new b(null);
                        aVar.f181715a = aVar3;
                        aVar.f181716b = bVar;
                        aVar.f181719e = 3;
                        objH = kotlinx.coroutines.i.h(z1VarH, bVar3, aVar);
                        if (objH == objL) {
                            aVar4 = aVar3;
                            bVar2 = bVar;
                            obj = objH;
                            aVar.f181715a = aVar4;
                            aVar.f181716b = null;
                            aVar.f181719e = 4;
                            if (bVar2.h((Map) obj, aVar) != objL) {
                                this = aVar4;
                            }
                        }
                        this = this;
                        return objL;
                    }
                    Unit unit2 = Unit.f312394a;
                    this.i(null);
                    return unit2;
                }
                kotlinx.coroutines.sync.a aVar7 = (kotlinx.coroutines.sync.a) aVar.f181716b;
                d dVar3 = (d) aVar.f181715a;
                ResultKt.m(obj);
                aVar2 = aVar7;
                r11 = dVar3;
                this = this;
                com.planner5d.library.model.manager.config.source.growthbook.b bVar4 = r11.f181705a;
                aVar.f181715a = r11;
                aVar.f181716b = aVar2;
                aVar.f181719e = 2;
                Object objG = bVar4.g(aVar);
                if (objG != objL) {
                    r12 = r11;
                    aVar3 = aVar2;
                    obj = objG;
                    this = aVar3;
                    if (((Boolean) obj).booleanValue()) {
                        bVar = r12.f181705a;
                        z1 z1VarH2 = s.f229729a.h();
                        b bVar5 = new b(null);
                        aVar.f181715a = aVar3;
                        aVar.f181716b = bVar;
                        aVar.f181719e = 3;
                        objH = kotlinx.coroutines.i.h(z1VarH2, bVar5, aVar);
                        if (objH == objL) {
                            aVar4 = aVar3;
                            bVar2 = bVar;
                            obj = objH;
                            aVar.f181715a = aVar4;
                            aVar.f181716b = null;
                            aVar.f181719e = 4;
                            if (bVar2.h((Map) obj, aVar) != objL) {
                                this = aVar4;
                            }
                        }
                    }
                    Unit unit3 = Unit.f312394a;
                    this.i(null);
                    return unit3;
                }
                this = this;
                return objL;
            } catch (Throwable th3) {
                kotlinx.coroutines.sync.a aVar8 = aVar2;
                th = th3;
                r10 = aVar8;
                r10.i(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            r10 = this;
        }
    }
}
