package com.planner5d.library.model.manager.config;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.model.manager.x2;
import com.planner5d.library.services.utility.k1;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigManager.kt\ncom/planner5d/library/model/manager/config/ConfigManager\n+ 2 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CollectionUtils.kt\ncom/planner5d/library/services/utility/CollectionUtils\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,212:1\n158#2:213\n158#2:215\n158#2:221\n158#2:224\n1#3:214\n1#3:216\n1#3:217\n1#3:222\n1#3:223\n1#3:225\n1#3:226\n10#4:218\n32#5,2:219\n*S KotlinDebug\n*F\n+ 1 ConfigManager.kt\ncom/planner5d/library/model/manager/config/ConfigManager\n*L\n87#1:213\n120#1:215\n150#1:221\n169#1:224\n87#1:214\n120#1:216\n150#1:222\n169#1:225\n132#1:218\n133#1:219,2\n*E\n"})
public final class d implements com.planner5d.library.model.manager.h, x1, x2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f181460k = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f181461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.source.g.a> f181462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.source.l f181463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.source.j> f181464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final j f181465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f181466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private List<String> f181467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f181468j;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181469a;

        static {
            int[] iArr = new int[j.a.values().length];
            try {
                iArr[j.a.REFRESHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.a.DROPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f181469a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.ConfigManager", f = "ConfigManager.kt", i = {0}, l = {64, 66}, m = "getLatestAllowedProducts", n = {"this"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f181471b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f181473d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181471b = obj;
            this.f181473d |= Integer.MIN_VALUE;
            return d.this.d(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.ConfigManager$getLatestAllowedProducts$2$1", f = "ConfigManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends com.planner5d.library.model.manager.config.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f181475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f181476c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g gVar, d dVar, kotlin.coroutines.d<? super c> dVar2) {
            super(2, dVar2);
            this.f181475b = gVar;
            this.f181476c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f181475b, this.f181476c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends com.planner5d.library.model.manager.config.a>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<com.planner5d.library.model.manager.config.a>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f181474a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            g gVar = this.f181475b;
            return gVar != null ? this.f181476c.u(gVar) : this.f181476c.o();
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super List<com.planner5d.library.model.manager.config.a>> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.d$d, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.ConfigManager", f = "ConfigManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p}, m = "getLatestRabbitMqUri", n = {}, s = {})
    static final class C1576d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f181477a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f181479c;

        C1576d(kotlin.coroutines.d<? super C1576d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181477a = obj;
            this.f181479c |= Integer.MIN_VALUE;
            return d.this.f(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.ConfigManager", f = "ConfigManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160707m}, m = "getLatestSurveysData", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f181480a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f181482c;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181480a = obj;
            this.f181482c |= Integer.MIN_VALUE;
            return d.this.c(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.ConfigManager", f = "ConfigManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160717p0}, m = "getSearchSuggestions", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f181483a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f181485c;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181483a = obj;
            this.f181485c |= Integer.MIN_VALUE;
            return d.this.r(this);
        }
    }

    @ij.a
    @m1
    public d(@NotNull com.planner5d.library.application.d applicationConfiguration, @NotNull fg.e<com.planner5d.library.model.manager.config.source.g.a> firebaseConfigsProvider, @NotNull com.planner5d.library.model.manager.config.source.l serverConfigs, @NotNull fg.e<com.planner5d.library.model.manager.config.source.j> allFeatureConfigs, @NotNull j featureConfigManager, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(applicationConfiguration, "applicationConfiguration");
        Intrinsics.checkNotNullParameter(firebaseConfigsProvider, "firebaseConfigsProvider");
        Intrinsics.checkNotNullParameter(serverConfigs, "serverConfigs");
        Intrinsics.checkNotNullParameter(allFeatureConfigs, "allFeatureConfigs");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f181461c = applicationConfiguration;
        this.f181462d = firebaseConfigsProvider;
        this.f181463e = serverConfigs;
        this.f181464f = allFeatureConfigs;
        this.f181465g = featureConfigManager;
        this.f181466h = coroutineDispatchers;
        this.f181468j = new Object();
        featureConfigManager.c(new Function1() { // from class: com.planner5d.library.model.manager.config.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.l(this.f181459a, (j.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(d dVar, j.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f181469a[it.ordinal()];
        if (i10 == 1) {
            dVar.v();
        } else if (i10 != 2) {
            throw new k0();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.l(message = "Left as fallback during transition. Use parsed products from allFeatureConfigs instead.")
    public final List<com.planner5d.library.model.manager.config.a> o() {
        com.planner5d.library.model.manager.config.source.g gVarA = this.f181462d.get().a();
        if (gVarA != null) {
            return (List) gVarA.j(com.planner5d.library.services.r.products.f224891a, new Function1() { // from class: com.planner5d.library.model.manager.config.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d.p(this.f181458a, (String) obj);
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(d dVar, String rawProducts) {
        Intrinsics.checkNotNullParameter(rawProducts, "rawProducts");
        return dVar.t(new JSONArray(rawProducts));
    }

    private final List<String> q() {
        g value = this.f181465g.s(com.planner5d.library.model.manager.config.f.SuperwallEventsEnabled).getValue();
        if (value != null) {
            if (!Intrinsics.areEqual(value.b(), Boolean.TRUE)) {
                value = null;
            }
            if (value != null) {
                try {
                    return k1.A(value.d(), com.planner5d.library.services.r.events);
                } catch (Throwable th2) {
                    timber.log.b.f381052a.f(th2, "Failed to get enabled superwall events", new Object[0]);
                }
            }
        }
        return null;
    }

    private final List<com.planner5d.library.model.manager.config.a> t(JSONArray jSONArray) throws JSONException, NoSuchElementException {
        com.planner5d.library.model.manager.config.a aVar;
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            EnumSet enumSetNoneOf = null;
            if (obj instanceof String) {
                aVar = new com.planner5d.library.model.manager.config.a((String) obj, null);
            } else {
                if (!(obj instanceof JSONObject)) {
                    throw new JSONException("Invalid products JSON array: " + jSONArray);
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() != 1) {
                    throw new JSONException("Invalid products JSON array element: " + obj);
                }
                String next = jSONObject.keys().next();
                k1 k1Var = k1.f225294a;
                Intrinsics.checkNotNull(next);
                JSONArray jSONArrayS = k1Var.s(jSONObject, next);
                if (jSONArrayS != null) {
                    if (jSONArrayS.length() <= 0) {
                        jSONArrayS = null;
                    }
                    if (jSONArrayS != null) {
                        com.planner5d.library.services.utility.m mVar = com.planner5d.library.services.utility.m.f225326a;
                        enumSetNoneOf = EnumSet.noneOf(com.planner5d.library.model.manager.config.a.EnumC1573a.class);
                        com.planner5d.library.services.jsoniterator.b bVar = new com.planner5d.library.services.jsoniterator.b(jSONArrayS);
                        while (bVar.hasNext()) {
                            com.planner5d.library.model.manager.config.a.EnumC1573a enumC1573aA = com.planner5d.library.model.manager.config.a.EnumC1573a.f181423b.a(bVar.next());
                            if (enumC1573aA != null) {
                                enumSetNoneOf.add(enumC1573aA);
                            }
                        }
                        Intrinsics.checkNotNullExpressionValue(enumSetNoneOf, "apply(...)");
                    }
                }
                aVar = new com.planner5d.library.model.manager.config.a(next, enumSetNoneOf);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<com.planner5d.library.model.manager.config.a> u(g gVar) {
        JSONObject jSONObjectD;
        List<com.planner5d.library.model.manager.config.a> listT = null;
        if (Intrinsics.areEqual(gVar.b(), Boolean.TRUE) && (jSONObjectD = gVar.d()) != null) {
            try {
                JSONArray jSONArrayR = k1.f225294a.r(jSONObjectD, com.planner5d.library.services.r.products);
                Intrinsics.checkNotNull(jSONArrayR);
                listT = t(jSONArrayR);
            } catch (Exception e10) {
                timber.log.b.f381052a.e(e10);
            }
        }
        return listT;
    }

    private final void v() {
        synchronized (this.f181468j) {
            try {
                this.f181467i = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.x2
    public boolean a() {
        return this.f181461c.a();
    }

    @Override // com.planner5d.library.model.manager.h
    @Nullable
    public List<Pair<Integer, String>> b() {
        JSONArray jSONArray;
        g value = this.f181465g.s(com.planner5d.library.model.manager.config.f.BernardNewUi).getValue();
        if (value == null) {
            return null;
        }
        if (!Intrinsics.areEqual(value.b(), Boolean.TRUE)) {
            value = null;
        }
        if (value == null) {
            return null;
        }
        try {
            JSONObject jSONObjectD = value.d();
            if (jSONObjectD == null || (jSONArray = jSONObjectD.getJSONArray("startSuggestions")) == null) {
                return null;
            }
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = jSONArray.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                Integer numValueOf = Integer.valueOf(k1.m(jSONObject, com.planner5d.library.services.r.icon, 1));
                String strW = k1.w(jSONObject, com.planner5d.library.services.r.text, null);
                if (strW == null) {
                    strW = com.planner5d.library.model.payments.a.f222474i;
                }
                arrayList.add(new Pair(numValueOf, strW));
            }
            return arrayList;
        } catch (Throwable th2) {
            timber.log.b.f381052a.z(th2, "Failed to get ai chat suggestions", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.planner5d.library.model.manager.h
    @Nullable
    public Object c(@NotNull kotlin.coroutines.d<? super JSONArray> dVar) throws Throwable {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f181482c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f181482c = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objO = eVar.f181480a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f181482c;
        JSONArray jSONArray = null;
        try {
            if (i11 == 0) {
                ResultKt.m(objO);
                com.planner5d.library.model.manager.config.source.l lVar = this.f181463e;
                eVar.f181482c = 1;
                objO = lVar.o(eVar);
                if (objO == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objO);
            }
            JSONObject jSONObject = (JSONObject) objO;
            if (jSONObject != null) {
                jSONArray = jSONObject.getJSONArray(com.planner5d.library.services.r.surveys.f224891a);
            }
        } catch (JSONException unused) {
        }
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r8 == r1) goto L22;
     */
    @Override // com.planner5d.library.model.manager.h
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.List<com.planner5d.library.model.manager.config.a>> r8) {
        /*
            r7 = this;
            r6 = 7
            boolean r0 = r8 instanceof com.planner5d.library.model.manager.config.d.b
            if (r0 == 0) goto L15
            r0 = r8
            r6 = 2
            com.planner5d.library.model.manager.config.d$b r0 = (com.planner5d.library.model.manager.config.d.b) r0
            int r1 = r0.f181473d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f181473d = r1
            goto L1a
        L15:
            com.planner5d.library.model.manager.config.d$b r0 = new com.planner5d.library.model.manager.config.d$b
            r0.<init>(r8)
        L1a:
            r6 = 0
            java.lang.Object r8 = r0.f181471b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 3
            int r2 = r0.f181473d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            r6 = 7
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L31
            kotlin.ResultKt.m(r8)
            goto L79
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "r/nascuoev  e//i/uulekwt/iom eiertelohn// / ocfotb "
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.Object r7 = r0.f181470a
            com.planner5d.library.model.manager.config.d r7 = (com.planner5d.library.model.manager.config.d) r7
            kotlin.ResultKt.m(r8)
            r6 = 7
            goto L5f
        L44:
            kotlin.ResultKt.m(r8)
            fg.e<com.planner5d.library.model.manager.config.source.j> r8 = r7.f181464f
            java.lang.Object r8 = r8.get()
            r6 = 6
            com.planner5d.library.model.manager.config.source.j r8 = (com.planner5d.library.model.manager.config.source.j) r8
            r6 = 6
            com.planner5d.library.model.manager.config.f r2 = com.planner5d.library.model.manager.config.f.Products
            r0.f181470a = r7
            r6 = 4
            r0.f181473d = r4
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L5f
            goto L78
        L5f:
            com.planner5d.library.model.manager.config.g r8 = (com.planner5d.library.model.manager.config.g) r8
            com.planner5d.library.services.utility.t r2 = r7.f181466h
            kotlinx.coroutines.n0 r2 = r2.h()
            com.planner5d.library.model.manager.config.d$c r4 = new com.planner5d.library.model.manager.config.d$c
            r5 = 0
            r4.<init>(r8, r7, r5)
            r0.f181470a = r5
            r0.f181473d = r3
            java.lang.Object r8 = kotlinx.coroutines.i.h(r2, r4, r0)
            r6 = 3
            if (r8 != r1) goto L79
        L78:
            return r1
        L79:
            r6 = 0
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.d.d(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.planner5d.library.model.manager.h
    @Nullable
    public Object f(@NotNull kotlin.coroutines.d<? super String> dVar) throws Throwable {
        C1576d c1576d;
        if (dVar instanceof C1576d) {
            c1576d = (C1576d) dVar;
            int i10 = c1576d.f181479c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1576d.f181479c = i10 - Integer.MIN_VALUE;
            } else {
                c1576d = new C1576d(dVar);
            }
        } else {
            c1576d = new C1576d(dVar);
        }
        Object objO = c1576d.f181477a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1576d.f181479c;
        int i12 = 7 & 0;
        try {
            if (i11 == 0) {
                ResultKt.m(objO);
                com.planner5d.library.model.manager.config.source.l lVar = this.f181463e;
                c1576d.f181479c = 1;
                objO = lVar.o(c1576d);
                if (objO == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objO);
            }
            JSONObject jSONObject = (JSONObject) objO;
            return k1.z(jSONObject != null ? jSONObject.getJSONObject(com.planner5d.library.services.r.queues.f224891a) : null, com.planner5d.library.services.r.aiTaskResults.f224891a, null, 4, null);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.planner5d.library.model.manager.h
    @Nullable
    public List<Pair<Integer, String>> h() {
        JSONArray jSONArray;
        g value = this.f181465g.s(com.planner5d.library.model.manager.config.f.BernardHome).getValue();
        if (value == null) {
            return null;
        }
        if (!Intrinsics.areEqual(value.b(), Boolean.TRUE)) {
            value = null;
        }
        if (value == null) {
            return null;
        }
        try {
            JSONObject jSONObjectD = value.d();
            if (jSONObjectD == null || (jSONArray = jSONObjectD.getJSONArray("startSuggestions")) == null) {
                return null;
            }
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = jSONArray.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                Integer numValueOf = Integer.valueOf(k1.m(jSONObject, com.planner5d.library.services.r.icon, 1));
                String strW = k1.w(jSONObject, com.planner5d.library.services.r.text, null);
                if (strW == null) {
                    strW = com.planner5d.library.model.payments.a.f222474i;
                }
                arrayList.add(new Pair(numValueOf, strW));
            }
            return arrayList;
        } catch (Throwable th2) {
            timber.log.b.f381052a.z(th2, "Failed to get ai chat suggestions", new Object[0]);
            return null;
        }
    }

    @Override // com.planner5d.library.model.manager.h
    @NotNull
    public List<String> i() {
        List<String> listQ;
        synchronized (this.f181468j) {
            try {
                listQ = this.f181467i;
                if (listQ == null) {
                    listQ = q();
                    if (listQ == null) {
                        listQ = CollectionsKt.emptyList();
                    }
                    this.f181467i = listQ;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listQ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object r(@NotNull kotlin.coroutines.d<? super List<String>> dVar) {
        f fVar;
        JSONArray jSONArray;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f181485c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f181485c = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objA = fVar.f181483a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f181485c;
        if (i11 == 0) {
            ResultKt.m(objA);
            com.planner5d.library.model.manager.config.source.j jVar = this.f181464f.get();
            com.planner5d.library.model.manager.config.f fVar2 = com.planner5d.library.model.manager.config.f.CatalogSearchSuggestions;
            fVar.f181485c = 1;
            objA = jVar.a(fVar2, fVar);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objA);
        }
        g gVar = (g) objA;
        if (gVar != null && Intrinsics.areEqual(gVar.b(), kotlin.coroutines.jvm.internal.b.a(true))) {
            try {
                JSONObject jSONObjectD = gVar.d();
                if (jSONObjectD != null && (jSONArray = jSONObjectD.getJSONArray("searchTerms")) != null) {
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i12 = 0; i12 < length; i12++) {
                        Object obj = jSONArray.get(i12);
                        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                        arrayList.add((String) obj);
                    }
                    return arrayList;
                }
            } catch (Throwable th2) {
                timber.log.b.f381052a.z(th2, "Failed to get search suggestions", new Object[0]);
            }
        }
        return null;
    }
}
