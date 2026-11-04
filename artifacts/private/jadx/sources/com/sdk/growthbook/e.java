package com.sdk.growthbook;

import com.facebook.internal.p;
import com.sdk.growthbook.evaluators.l;
import com.sdk.growthbook.evaluators.m;
import com.sdk.growthbook.evaluators.n;
import com.sdk.growthbook.evaluators.o;
import com.sdk.growthbook.features.j;
import com.sdk.growthbook.model.q;
import com.sdk.growthbook.network.i;
import com.sdk.growthbook.utils.k;
import com.sdk.growthbook.utils.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlinx.coroutines.d1;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGrowthBookSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrowthBookSDK.kt\ncom/sdk/growthbook/GrowthBookSDK\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n465#2:404\n415#2:405\n1252#3,4:406\n*S KotlinDebug\n*F\n+ 1 GrowthBookSDK.kt\ncom/sdk/growthbook/GrowthBookSDK\n*L\n169#1:404\n169#1:405\n169#1:406,4\n*E\n"})
public final class e implements j {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f266181k = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.sdk.growthbook.model.d f266182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Function2<Boolean, com.sdk.growthbook.utils.j, Unit> f266183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, ? extends q> f266184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Map<String, ? extends q> f266185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Map<String, ? extends q> f266186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private b f266187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final m f266188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private List<Function2<com.sdk.growthbook.model.f, com.sdk.growthbook.model.g, Unit>> f266189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private Map<String, Pair<com.sdk.growthbook.model.f, com.sdk.growthbook.model.g>> f266190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private com.sdk.growthbook.features.q f266191j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.sdk.growthbook.evaluators.a b(com.sdk.growthbook.model.d dVar, m mVar) {
            boolean zU = dVar.u();
            Map<String, com.sdk.growthbook.model.h> mapW = dVar.w();
            Map<String, q> mapC = dVar.C();
            boolean zT = dVar.t();
            Function2<String, com.sdk.growthbook.model.j, Unit> function2Z = dVar.z();
            return new com.sdk.growthbook.evaluators.a(zU, mapW, new o(dVar.A(), dVar.s(), dVar.D()), zT, mapC, dVar.x(), dVar.G(), mVar, dVar.F(), function2Z);
        }

        private a() {
        }
    }

    private enum b {
        NoResultYet,
        Success,
        Failed;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f266196e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f266196e;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f266197a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.NoResultYet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Failed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f266197a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.sdk.growthbook.GrowthBookSDK", f = "GrowthBookSDK.kt", i = {0, 2}, l = {p.f100029m, 191, 195, 196}, m = "suspendFeature", n = {"id", "id"}, s = {"L$0", "L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f266198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f266199b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f266201d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f266199b = obj;
            this.f266201d |= Integer.MIN_VALUE;
            return e.this.B(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull com.sdk.growthbook.model.d gbContext, @Nullable Function2<? super Boolean, ? super com.sdk.growthbook.utils.j, Unit> function2, @NotNull i networkDispatcher, @Nullable Map<String, com.sdk.growthbook.model.h> map, @Nullable Map<String, ? extends q> map2, boolean z10) {
        Intrinsics.checkNotNullParameter(gbContext, "gbContext");
        Intrinsics.checkNotNullParameter(networkDispatcher, "networkDispatcher");
        this.f266182a = gbContext;
        this.f266183b = function2;
        this.f266184c = MapsKt.emptyMap();
        this.f266185d = MapsKt.emptyMap();
        this.f266186e = MapsKt.emptyMap();
        this.f266187f = b.NoResultYet;
        this.f266188g = new m();
        this.f266189h = new ArrayList();
        this.f266190i = new LinkedHashMap();
        this.f266191j = new com.sdk.growthbook.features.q(this, new com.sdk.growthbook.features.i(networkDispatcher, gbContext), gbContext.v(), z10);
        if (map != null) {
            gbContext.I(map);
        } else {
            q();
        }
        this.f266184c = map2;
        t(this, null, 1, null);
    }

    private final com.sdk.growthbook.evaluators.a g() {
        return Companion.b(this.f266182a, this.f266188g);
    }

    private final void j(com.sdk.growthbook.model.f fVar, com.sdk.growthbook.model.g gVar) {
        String strI = fVar.I();
        Pair<com.sdk.growthbook.model.f, com.sdk.growthbook.model.g> pair = this.f266190i.get(strI);
        if (pair == null || pair.getSecond().u() != gVar.u() || pair.getSecond().A() != gVar.A()) {
            this.f266190i.put(strI, TuplesKt.to(fVar, gVar));
        }
        Iterator<Function2<com.sdk.growthbook.model.f, com.sdk.growthbook.model.g, Unit>> it = this.f266189h.iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(fVar, gVar);
            } catch (Exception e10) {
                if (this.f266182a.t()) {
                    System.out.println((Object) ("Error while run subscriptions: " + e10.getMessage()));
                }
            }
        }
    }

    private final void r() {
        if (this.f266182a.B()) {
            this.f266191j.j(this.f266182a.B(), new k(this.f266182a.s(), this.f266185d, this.f266182a.x()));
        }
    }

    private final void s(com.sdk.growthbook.features.b bVar) {
        if (this.f266182a.F() != null) {
            com.sdk.growthbook.utils.o.Companion.z(this.f266182a, bVar, this.f266186e);
        }
    }

    static /* synthetic */ void t(e eVar, com.sdk.growthbook.features.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = null;
        }
        eVar.s(bVar);
    }

    public final void A(@NotNull Map<String, ? extends Number> forcedVariations) {
        Intrinsics.checkNotNullParameter(forcedVariations, "forcedVariations");
        this.f266182a.J(forcedVariations);
        r();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object B(@NotNull String str, @NotNull kotlin.coroutines.d<? super com.sdk.growthbook.model.j> dVar) {
        d dVar2;
        Object objB;
        Object objB2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f266201d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f266201d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f266199b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f266201d;
        if (i11 == 0) {
            ResultKt.m(obj);
            int i12 = c.f266197a[this.f266187f.ordinal()];
            if (i12 == 1) {
                return h(str);
            }
            if (i12 == 2) {
                dVar2.f266198a = str;
                dVar2.f266201d = 1;
                if (d1.b(1000L, dVar2) != objL) {
                    dVar2.f266198a = null;
                    dVar2.f266201d = 2;
                    objB = B(str, dVar2);
                    if (objB == objL) {
                        return objB;
                    }
                }
            } else {
                if (i12 != 3) {
                    throw new k0();
                }
                com.sdk.growthbook.features.q.k(this.f266191j, false, null, 3, null);
                dVar2.f266198a = str;
                dVar2.f266201d = 3;
                if (d1.b(1000L, dVar2) != objL) {
                    dVar2.f266198a = null;
                    dVar2.f266201d = 4;
                    objB2 = B(str, dVar2);
                    if (objB2 == objL) {
                        return objB2;
                    }
                }
            }
        } else if (i11 == 1) {
            str = (String) dVar2.f266198a;
            ResultKt.m(obj);
            dVar2.f266198a = null;
            dVar2.f266201d = 2;
            objB = B(str, dVar2);
            if (objB == objL) {
                return objB;
            }
        } else {
            if (i11 == 2) {
                ResultKt.m(obj);
                return obj;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            str = (String) dVar2.f266198a;
            ResultKt.m(obj);
            dVar2.f266198a = null;
            dVar2.f266201d = 4;
            objB2 = B(str, dVar2);
            if (objB2 == objL) {
                return objB2;
            }
        }
        return objL;
    }

    @Override // com.sdk.growthbook.features.j
    public void a(@NotNull com.sdk.growthbook.utils.j error, boolean z10) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (z10) {
            this.f266187f = b.Failed;
            Function2<Boolean, com.sdk.growthbook.utils.j, Unit> function2 = this.f266183b;
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, error);
            }
        }
    }

    @Override // com.sdk.growthbook.features.j
    public void b(@NotNull JsonObject savedGroups, boolean z10) {
        Function2<Boolean, com.sdk.growthbook.utils.j, Unit> function2;
        Intrinsics.checkNotNullParameter(savedGroups, "savedGroups");
        com.sdk.growthbook.model.d dVar = this.f266182a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(savedGroups.size()));
        Iterator<T> it = savedGroups.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), nf.a.a(q.Companion, (JsonElement) entry.getValue()));
        }
        dVar.K(linkedHashMap);
        if (z10 && (function2 = this.f266183b) != null) {
            function2.invoke(Boolean.TRUE, null);
        }
    }

    @Override // com.sdk.growthbook.features.j
    public void c(@NotNull Map<String, com.sdk.growthbook.model.h> features, boolean z10) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f266182a.I(features);
        if (z10) {
            this.f266187f = b.Success;
            Function2<Boolean, com.sdk.growthbook.utils.j, Unit> function2 = this.f266183b;
            if (function2 != null) {
                boolean z11 = true | false;
                function2.invoke(Boolean.TRUE, null);
            }
        }
    }

    @Override // com.sdk.growthbook.features.j
    public void d(@NotNull com.sdk.growthbook.utils.j error, boolean z10) {
        Function2<Boolean, com.sdk.growthbook.utils.j, Unit> function2;
        Intrinsics.checkNotNullParameter(error, "error");
        if (!z10 || (function2 = this.f266183b) == null) {
            return;
        }
        function2.invoke(Boolean.FALSE, error);
    }

    @Override // com.sdk.growthbook.features.j
    public void e(@NotNull com.sdk.growthbook.features.b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        s(model);
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<s<Map<String, com.sdk.growthbook.model.h>>> f() {
        return this.f266191j.g();
    }

    @NotNull
    public final com.sdk.growthbook.model.j h(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int i10 = 0 >> 4;
        return n.b(new n(g(), this.f266185d), id2, this.f266186e, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <V> V i(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        List listListOf = CollectionsKt.listOf((Object[]) new kotlin.reflect.d[]{j1.d(Boolean.TYPE), j1.d(String.class), j1.d(Number.class), j1.d(Short.TYPE), j1.d(Integer.TYPE), j1.d(Long.TYPE), j1.d(Float.TYPE), j1.d(Double.TYPE), j1.d(com.sdk.growthbook.model.m.class)});
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.Y4);
        if (!CollectionsKt.contains(listListOf, j1.d(Object.class))) {
            return null;
        }
        V v10 = (V) h(id2).k();
        if (v10 instanceof com.sdk.growthbook.model.n) {
            return null;
        }
        if (v10 instanceof com.sdk.growthbook.model.c) {
            V v11 = (V) Boolean.valueOf(((com.sdk.growthbook.model.c) v10).m());
            Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.Y4);
            return v11;
        }
        if (v10 instanceof com.sdk.growthbook.model.p) {
            V v12 = (V) ((com.sdk.growthbook.model.p) v10).m();
            Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.Y4);
            return v12;
        }
        if (v10 instanceof com.sdk.growthbook.model.o) {
            V v13 = (V) ((com.sdk.growthbook.model.o) v10).i();
            Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.Y4);
            return v13;
        }
        if (v10 instanceof com.sdk.growthbook.model.m) {
            Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.Y4);
            return v10;
        }
        if ((v10 instanceof q.b) || (v10 instanceof com.sdk.growthbook.model.b) || v10 == 0) {
            return null;
        }
        throw new k0();
    }

    @NotNull
    public final Map<String, Object> k() {
        return this.f266186e;
    }

    @NotNull
    public final Map<String, com.sdk.growthbook.model.h> l() {
        return this.f266182a.w();
    }

    @NotNull
    public final com.sdk.growthbook.features.q m() {
        return this.f266191j;
    }

    @NotNull
    public final Map<String, q> n() {
        return this.f266185d;
    }

    @NotNull
    public final com.sdk.growthbook.model.d o() {
        return this.f266182a;
    }

    public final boolean p(@NotNull String featureId) {
        Intrinsics.checkNotNullParameter(featureId, "featureId");
        return h(featureId).m();
    }

    public final void q() {
        if (this.f266182a.B()) {
            r();
        } else {
            com.sdk.growthbook.features.q.k(this.f266191j, false, null, 3, null);
        }
    }

    @NotNull
    public final com.sdk.growthbook.model.g u(@NotNull com.sdk.growthbook.model.f experiment) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        com.sdk.growthbook.model.g gVarB = l.b(new l(g()), experiment, this.f266186e, null, 4, null);
        j(experiment, gVarB);
        return gVarB;
    }

    public final void v(@NotNull Map<String, ? extends q> overrides) {
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        this.f266186e = overrides;
        if (this.f266182a.F() != null) {
            t(this, null, 1, null);
        }
        r();
    }

    public final void w(@NotNull Map<String, ? extends q> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f266182a.H(attributes);
        t(this, null, 1, null);
    }

    public final void x(@NotNull String encryptedString, @NotNull String encryptionKey, @Nullable com.sdk.growthbook.utils.c cVar) {
        Intrinsics.checkNotNullParameter(encryptedString, "encryptedString");
        Intrinsics.checkNotNullParameter(encryptionKey, "encryptionKey");
        Map<String, com.sdk.growthbook.model.h> mapE = com.sdk.growthbook.utils.e.e(encryptedString, encryptionKey, cVar);
        com.sdk.growthbook.model.d dVar = this.f266182a;
        if (mapE == null) {
            return;
        }
        dVar.I(mapE);
    }

    public final void y(@NotNull com.sdk.growthbook.features.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.f266191j = qVar;
    }

    public final void z(@NotNull Map<String, ? extends q> forcedFeatures) {
        Intrinsics.checkNotNullParameter(forcedFeatures, "forcedFeatures");
        this.f266185d = forcedFeatures;
    }

    public /* synthetic */ e(com.sdk.growthbook.model.d dVar, Function2 function2, i iVar, Map map, Map map2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, function2, iVar, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? null : map2, z10);
    }
}
