package com.planner5d.library.model.manager.contest;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.activeandroid.Model;
import com.activeandroid.query.Select;
import com.activeandroid.util.TransactionUtils;
import com.devtodev.core.data.consts.RequestParams;
import com.devtodev.core.data.metrics.MetricConsts;
import com.planner5d.library.database.model.catalog.Catalog;
import com.planner5d.library.database.model.catalog.CatalogCategoryLink;
import com.planner5d.library.database.model.catalog.CatalogItemLink;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.contest.ContestPrize;
import com.planner5d.library.database.model.contest.ContestWinner;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.p0;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nContestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestManager.kt\ncom/planner5d/library/model/manager/contest/ContestManager\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,484:1\n116#2,11:485\n1#3:496\n1#3:500\n1#3:512\n163#4,3:497\n167#4:501\n1611#5,9:502\n1863#5:511\n1864#5:513\n1620#5:514\n1863#5,2:515\n1620#5:517\n1557#5:518\n1628#5,3:519\n1755#5,3:522\n1557#5:525\n1628#5,3:526\n*S KotlinDebug\n*F\n+ 1 ContestManager.kt\ncom/planner5d/library/model/manager/contest/ContestManager\n*L\n82#1:485,11\n106#1:500\n375#1:512\n106#1:497,3\n106#1:501\n375#1:502,9\n375#1:511\n375#1:513\n375#1:514\n375#1:515,2\n375#1:517\n376#1:518\n376#1:519,3\n390#1:522,3\n406#1:525\n406#1:526,3\n*E\n"})
public final class g implements com.planner5d.library.contest.data.i, x1, kb.b<Contest> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a f190979o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f190980p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final jb.a f190981q = new jb.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f190982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Application f190983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final p0 f190984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f190985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f190986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f190987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.g0 f190988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kb.a<Contest> f190989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Map<Long, List<Contest>> f190990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final z1 f190991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final z1 f190992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f190993n;

    @SourceDebugExtension({"SMAP\nContestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestManager.kt\ncom/planner5d/library/model/manager/contest/ContestManager$Companion\n+ 2 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,484:1\n163#2,3:485\n167#2:489\n163#2,3:492\n167#2:496\n1#3:488\n1#3:495\n1#3:497\n37#4,2:490\n*S KotlinDebug\n*F\n+ 1 ContestManager.kt\ncom/planner5d/library/model/manager/contest/ContestManager$Companion\n*L\n435#1:485,3\n435#1:489\n438#1:492,3\n438#1:496\n435#1:488\n438#1:495\n435#1:490,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
        public final eb.d[] c(JSONObject jSONObject) throws JSONException {
            ?? EmptyList;
            JSONArray jSONArray = jSONObject.getJSONArray(com.planner5d.library.services.r.list.f224891a);
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            int length = jSONArray.length();
            if (length > 0) {
                EmptyList = new ArrayList(length);
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                    EmptyList.add(g.f190979o.d(jSONObject2));
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            return (eb.d[]) ((Collection) EmptyList).toArray(new eb.d[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
        private final eb.d d(JSONObject jSONObject) throws JSONException {
            ?? EmptyList;
            String string = jSONObject.getString(com.planner5d.library.services.r.id.f224891a);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            JSONArray jSONArray = jSONObject.getJSONArray(com.planner5d.library.services.r.works.f224891a);
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            int length = jSONArray.length();
            if (length > 0) {
                EmptyList = new ArrayList(length);
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                    EmptyList.add(g.f190979o.e(jSONObject2));
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            return new eb.d(string, EmptyList, null, 4, null);
        }

        private final eb.b e(JSONObject jSONObject) {
            URI uriCreate = URI.create(jSONObject.getString(com.planner5d.library.services.r.image.f224891a));
            Intrinsics.checkNotNullExpressionValue(uriCreate, "create(...)");
            return new eb.b(uriCreate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final eb.c f(JSONObject jSONObject) throws JSONException {
            String string;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.user;
            JSONObject jSONObject2 = jSONObject.has(rVar.f224891a) ? jSONObject.getJSONObject(rVar.f224891a) : null;
            if (jSONObject2 == null || (string = jSONObject2.getString(com.planner5d.library.services.r.contestWinnerName.f224891a)) == null) {
                string = com.planner5d.library.model.payments.a.f222474i;
            }
            String strConvert = g.f190981q.convert(jSONObject2);
            return new eb.c(string, strConvert != null ? URI.create(strConvert) : null, k1.h(jSONObject, com.planner5d.library.services.r.votesPercentage, 0.0f));
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {0, 0, 1}, l = {com.google.api.client.http.a0.f115563p, com.google.api.client.http.a0.f115563p}, m = "shouldNotifyAboutVoting", n = {"this", "contest", "contest"}, s = {"L$0", "L$1", "L$0"})
    static final class a0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f190996c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f190998e;

        a0(kotlin.coroutines.d<? super a0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190996c = obj;
            this.f190998e |= Integer.MIN_VALUE;
            return g.this.i0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$downloadCatalog$2", f = "ContestManager.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190999a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f191001c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$downloadCatalog$2$response$1", f = "ContestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f191002a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f191003b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f191004c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Contest f191005d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Contest contest, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f191005d = contest;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f191002a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                com.planner5d.library.api.b bVar = (com.planner5d.library.api.b) this.f191003b;
                id.a aVar = (id.a) this.f191004c;
                String str = this.f191005d.uid;
                Intrinsics.checkNotNull(str);
                return bVar.N(aVar, Long.parseLong(str));
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                a aVar2 = new a(this.f191005d, dVar);
                aVar2.f191003b = bVar;
                aVar2.f191004c = aVar;
                return aVar2.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Contest contest, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f191001c = contest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Long m(com.planner5d.library.api.c cVar, long j10) throws JSONException {
            JSONArray jSONArray = cVar.a().getJSONArray(com.planner5d.library.services.r.categories.f224891a);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                CatalogCategoryLink catalogCategoryLink = new CatalogCategoryLink();
                catalogCategoryLink.w(Long.valueOf(j10));
                String string = jSONObject.getString(com.planner5d.library.services.r.cid.f224891a);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                catalogCategoryLink.x(Long.valueOf(Long.parseLong(string)));
                String string2 = jSONObject.getString(com.planner5d.library.services.r.pid.f224891a);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                catalogCategoryLink.y(Long.valueOf(Long.parseLong(string2)));
                catalogCategoryLink.save();
            }
            JSONArray jSONArray2 = cVar.a().getJSONArray(com.planner5d.library.services.r.items.f224891a);
            int length2 = jSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i11);
                CatalogItemLink catalogItemLink = new CatalogItemLink();
                catalogItemLink.x(Long.valueOf(j10));
                catalogItemLink.A(jSONObject2.getString(com.planner5d.library.services.r.id.f224891a));
                String string3 = jSONObject2.getString(com.planner5d.library.services.r.cid.f224891a);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                catalogItemLink.y(Long.valueOf(Long.parseLong(string3)));
                Intrinsics.checkNotNull(jSONObject2);
                catalogItemLink.z(k1.a(jSONObject2, com.planner5d.library.services.r.free));
                catalogItemLink.save();
            }
            Catalog catalog = new Catalog();
            catalog.y(cVar.a().getString(com.planner5d.library.services.r.catalogName.f224891a));
            catalog.save(Long.valueOf(j10));
            return Long.valueOf(j10);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new b(this.f191001c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            b bVar;
            JSONObject jSONObjectA;
            String string;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f190999a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.api.requests.c cVar = g.this.f190982c;
                    id.a aVarA = g.this.f190987h.a();
                    a aVar = new a(this.f191001c, null);
                    this.f190999a = 1;
                    bVar = this;
                    obj = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, aVar, bVar, 2, null);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    bVar = this;
                }
                final com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) obj;
                if (cVar2 != null && (jSONObjectA = cVar2.a()) != null && (string = jSONObjectA.getString(com.planner5d.library.services.r.id.f224891a)) != null) {
                    final long j10 = Long.parseLong(string);
                    bVar.f191001c.S(kotlin.coroutines.jvm.internal.b.g(j10));
                    bVar.f191001c.save();
                    return g.this.a0(j10) ? kotlin.coroutines.jvm.internal.b.g(j10) : (Long) TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.contest.h
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return g.b.m(cVar2, j10);
                        }
                    });
                }
                return null;
            } catch (Exception e10) {
                timber.log.b.f381052a.f(e10, "Failed to get catalog", new Object[0]);
                throw e10;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {}, l = {322}, m = "submit", n = {}, s = {})
    static final class b0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f191006a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f191008c;

        b0(kotlin.coroutines.d<? super b0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191006a = obj;
            this.f191008c |= Integer.MIN_VALUE;
            return g.this.j0(0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160700j1}, m = "get", n = {RequestParams.UID}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191010b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191012d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191010b = obj;
            this.f191012d |= Integer.MIN_VALUE;
            int i10 = 5 & 0;
            return g.this.j(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$submit$2", f = "ContestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nContestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestManager.kt\ncom/planner5d/library/model/manager/contest/ContestManager$submit$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,484:1\n1#2:485\n*E\n"})
    static final class c0 extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f191014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f191016d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f191017e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f191018f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(long j10, g gVar, String str, kotlin.coroutines.d<? super c0> dVar) {
            super(3, dVar);
            this.f191016d = j10;
            this.f191017e = gVar;
            this.f191018f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191013a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            com.planner5d.library.api.b bVar = (com.planner5d.library.api.b) this.f191014b;
            id.a aVar = (id.a) this.f191015c;
            long j10 = this.f191016d;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.planner5d.library.services.r.work.f224891a, this.f191018f);
            jSONObject.put(com.planner5d.library.services.r.description.f224891a, "");
            Unit unit = Unit.f312394a;
            return bVar.k(aVar, j10, jSONObject, this.f191017e.f190983d.getPackageName(), h3.j(this.f191017e.f190983d), h3.a());
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            c0 c0Var = new c0(this.f191016d, this.f191017e, this.f191018f, dVar);
            c0Var.f191014b = bVar;
            c0Var.f191015c = aVar;
            return c0Var.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {0, 1}, l = {386, 386}, m = "getActive", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f191022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f191023e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f191025g;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191023e = obj;
            this.f191025g |= Integer.MIN_VALUE;
            return g.this.r(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$submitBackground$1", f = "ContestManager.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
    static final class d0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191026a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f191028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f191029d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(long j10, String str, kotlin.coroutines.d<? super d0> dVar) {
            super(2, dVar);
            this.f191028c = j10;
            this.f191029d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new d0(this.f191028c, this.f191029d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191026a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            g gVar = g.this;
            long j10 = this.f191028c;
            String str = this.f191029d;
            this.f191026a = 1;
            Object objJ0 = gVar.j0(j10, str, this);
            return objJ0 == objL ? objL : objJ0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((d0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$getContestCatalogId$2", f = "ContestManager.kt", i = {}, l = {309}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Contest f191031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f191032c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Contest contest, g gVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f191031b = contest;
            this.f191032c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f191031b, this.f191032c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191030a;
            if (i10 == 0) {
                ResultKt.m(obj);
                Long lY = this.f191031b.y();
                if (lY != null && this.f191032c.a0(lY.longValue())) {
                    return lY;
                }
                g gVar = this.f191032c;
                Contest contest = this.f191031b;
                this.f191030a = 1;
                obj = gVar.R(contest, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return (Long) obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$synchronize$1", f = "ContestManager.kt", i = {1, 2}, l = {128, 131, 490}, m = "invokeSuspend", n = {MetricConsts.Install, "$this$withLock_u24default$iv"}, s = {"L$2", "L$0"})
    @SourceDebugExtension({"SMAP\nContestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestManager.kt\ncom/planner5d/library/model/manager/contest/ContestManager$synchronize$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,484:1\n116#2,11:485\n*S KotlinDebug\n*F\n+ 1 ContestManager.kt\ncom/planner5d/library/model/manager/contest/ContestManager$synchronize$1\n*L\n137#1:485,11\n*E\n"})
    static final class e0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191036d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ id.a f191038f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$synchronize$1$1", f = "ContestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f191039a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f191040b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f191041c;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f191039a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f191040b).p((id.a) this.f191041c);
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                a aVar2 = new a(dVar);
                aVar2.f191040b = bVar;
                aVar2.f191041c = aVar;
                return aVar2.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(id.a aVar, kotlin.coroutines.d<? super e0> dVar) {
            super(2, dVar);
            this.f191038f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new e0(this.f191038f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00be A[Catch: all -> 0x0100, LOOP:0: B:31:0x00bc->B:32:0x00be, LOOP_END, TryCatch #0 {all -> 0x0100, blocks: (B:10:0x001e, B:39:0x00f4, B:41:0x00fa, B:42:0x00ff, B:15:0x003a, B:30:0x00ae, B:32:0x00be, B:33:0x00d0, B:16:0x003f, B:22:0x0065, B:24:0x006a, B:26:0x0072, B:19:0x0048, B:38:0x00eb), top: B:47:0x000b, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e0 e0Var;
            JSONObject jSONObjectA;
            g gVar;
            id.a aVar;
            kotlinx.coroutines.sync.a aVar2;
            g gVar2;
            g gVar3;
            JSONArray jSONArray;
            int length;
            int i10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f191036d;
            try {
                if (i11 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.api.requests.c cVar = g.this.f190982c;
                    id.a aVar3 = this.f191038f;
                    a aVar4 = new a(null);
                    this.f191036d = 1;
                    e0Var = this;
                    obj = com.planner5d.library.api.requests.c.g(cVar, aVar3, null, aVar4, e0Var, 2, null);
                    if (obj == objL) {
                    }
                    return objL;
                }
                if (i11 == 1) {
                    ResultKt.m(obj);
                    e0Var = this;
                } else {
                    if (i11 == 2) {
                        jSONObjectA = (JSONObject) this.f191035c;
                        aVar = (id.a) this.f191034b;
                        gVar = (g) this.f191033a;
                        ResultKt.m(obj);
                        e0Var = this;
                        jSONArray = jSONObjectA.getJSONArray(com.planner5d.library.services.r.contestList.f224891a);
                        length = jSONArray.length();
                        for (i10 = 0; i10 < length; i10++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                            gVar.l(aVar, jSONObject);
                        }
                        aVar2 = g.this.f190993n;
                        gVar2 = g.this;
                        e0Var.f191033a = aVar2;
                        e0Var.f191034b = gVar2;
                        e0Var.f191035c = null;
                        e0Var.f191036d = 3;
                        if (aVar2.h(null, e0Var) != objL) {
                            gVar3 = gVar2;
                        }
                        return objL;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar3 = (g) this.f191034b;
                    aVar2 = (kotlinx.coroutines.sync.a) this.f191033a;
                    ResultKt.m(obj);
                }
                try {
                    gVar3.f190990k.clear();
                    Unit unit = Unit.f312394a;
                    return Unit.f312394a;
                } finally {
                    aVar2.i(null);
                }
                com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) obj;
                if (cVar2 == null || (jSONObjectA = cVar2.a()) == null) {
                    aVar2 = g.this.f190993n;
                    gVar2 = g.this;
                    e0Var.f191033a = aVar2;
                    e0Var.f191034b = gVar2;
                    e0Var.f191035c = null;
                    e0Var.f191036d = 3;
                    if (aVar2.h(null, e0Var) != objL) {
                        gVar3 = gVar2;
                        gVar3.f190990k.clear();
                        Unit unit2 = Unit.f312394a;
                        return Unit.f312394a;
                    }
                } else {
                    gVar = g.this;
                    id.a aVar5 = e0Var.f191038f;
                    com.planner5d.library.model.manager.config.p pVar = gVar.f190985f;
                    com.planner5d.library.services.r rVar = com.planner5d.library.services.r.serverTimeDelta;
                    long time = gVar.f190984e.g(jSONObjectA.getString(com.planner5d.library.services.r.now.f224891a)).getTime() - new Date().getTime();
                    e0Var.f191033a = gVar;
                    e0Var.f191034b = aVar5;
                    e0Var.f191035c = jSONObjectA;
                    e0Var.f191036d = 2;
                    if (pVar.r(rVar, time, e0Var) != objL) {
                        aVar = aVar5;
                        jSONArray = jSONObjectA.getJSONArray(com.planner5d.library.services.r.contestList.f224891a);
                        length = jSONArray.length();
                        while (i10 < length) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                            gVar.l(aVar, jSONObject2);
                        }
                        aVar2 = g.this.f190993n;
                        gVar2 = g.this;
                        e0Var.f191033a = aVar2;
                        e0Var.f191034b = gVar2;
                        e0Var.f191035c = null;
                        e0Var.f191036d = 3;
                        if (aVar2.h(null, e0Var) != objL) {
                            gVar3 = gVar2;
                            gVar3.f190990k.clear();
                            Unit unit3 = Unit.f312394a;
                            return Unit.f312394a;
                        }
                    }
                }
                return objL;
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$getContestCatalogIdAsObservable$1", f = "ContestManager.kt", i = {}, l = {258}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191042a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f191044c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Contest contest, kotlin.coroutines.d<? super f> dVar) {
            super(1, dVar);
            this.f191044c = contest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return g.this.new f(this.f191044c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191042a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            g gVar = g.this;
            Contest contest = this.f191044c;
            this.f191042a = 1;
            Object objT = gVar.T(contest, this);
            return objT == objL ? objL : objT;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Long> dVar) {
            return ((f) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {0}, l = {96}, m = "vote", n = {"tuple"}, s = {"L$0"})
    static final class f0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191046b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191048d;

        f0(kotlin.coroutines.d<? super f0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191046b = obj;
            this.f191048d |= Integer.MIN_VALUE;
            return g.this.b(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.contest.g$g, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {0, 0, 0}, l = {490, com.planner5d.library.engine.input.f.b.f160705l0}, m = "getContests", n = {"this", "$this$withLock_u24default$iv", MetricConsts.Install}, s = {"L$0", "L$1", "J$0"})
    static final class C1589g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f191051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191052d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191054f;

        C1589g(kotlin.coroutines.d<? super C1589g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191052d = obj;
            this.f191054f |= Integer.MIN_VALUE;
            return g.this.t(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$vote$2", f = "ContestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g0 extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f191056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Contest f191058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ eb.d f191059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f191060f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(Contest contest, eb.d dVar, Integer num, kotlin.coroutines.d<? super g0> dVar2) {
            super(3, dVar2);
            this.f191058d = contest;
            this.f191059e = dVar;
            this.f191060f = num;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191055a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            com.planner5d.library.api.b bVar = (com.planner5d.library.api.b) this.f191056b;
            id.a aVar = (id.a) this.f191057c;
            String str = this.f191058d.uid;
            Intrinsics.checkNotNull(str);
            long j10 = Long.parseLong(str);
            JSONObject jSONObject = new JSONObject();
            eb.d dVar = this.f191059e;
            Integer num = this.f191060f;
            jSONObject.put(com.planner5d.library.services.r.pair.f224891a, dVar.f());
            jSONObject.put(com.planner5d.library.services.r.vote.f224891a, (num != null ? num.intValue() : -1) + 1);
            Unit unit = Unit.f312394a;
            return bVar.W(aVar, j10, jSONObject);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            g0 g0Var = new g0(this.f191058d, this.f191059e, this.f191060f, dVar);
            g0Var.f191056b = bVar;
            g0Var.f191057c = aVar;
            return g0Var.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {0, 1, 1, 2}, l = {372, 373, 374}, m = "getPrizeRows", n = {"this", "this", "contestId", "prizesRenders"}, s = {"L$0", "L$0", "J$0", "L$0"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f191062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191063c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191065e;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191063c = obj;
            this.f191065e |= Integer.MIN_VALUE;
            return g.this.q(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {}, l = {412}, m = "votingStarted", n = {}, s = {})
    static final class h0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191067b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191069d;

        h0(kotlin.coroutines.d<? super h0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191067b = obj;
            this.f191069d |= Integer.MIN_VALUE;
            return g.this.i(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {}, l = {366}, m = "getPrizesByType", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f191070a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f191072c;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191070a = obj;
            this.f191072c |= Integer.MIN_VALUE;
            return g.this.W(0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$votingStartedBlocking$1", f = "ContestManager.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
    static final class i0 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191073a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f191075c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(Contest contest, kotlin.coroutines.d<? super i0> dVar) {
            super(2, dVar);
            this.f191075c = contest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new i0(this.f191075c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191073a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            g gVar = g.this;
            Contest contest = this.f191075c;
            this.f191073a = 1;
            Object objI = gVar.i(contest, this);
            return objI == objL ? objL : objI;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((i0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$getPrizesByType$2", f = "ContestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<ContestPrize>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f191077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f191078c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j10, String str, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f191077b = j10;
            this.f191078c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new j(this.f191077b, this.f191078c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191076a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return new Select().from(ContestPrize.class).where("contest = ? AND type = ?", kotlin.coroutines.jvm.internal.b.g(this.f191077b), this.f191078c).orderBy("place ASC").execute();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<ContestPrize>> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.X}, m = "getServerTime", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191080b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191082d;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191080b = obj;
            this.f191082d |= Integer.MIN_VALUE;
            return g.this.v(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {0}, l = {398}, m = "getTopParticipants", n = {"fromCurrentUser"}, s = {"L$0"})
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191084b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191086d;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191084b = obj;
            this.f191086d |= Integer.MIN_VALUE;
            return g.this.n(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$getTopParticipants$fromWinners$1", f = "ContestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends eb.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191087a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f191089c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Contest contest, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f191089c = contest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new m(this.f191089c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends eb.a>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<eb.a>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191087a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return g.this.n0(this.f191089c.d0());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super List<eb.a>> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {0, 0, 0}, l = {352, 358}, m = "getUserPlaceAndPrizes", n = {"this", "prizeTypes", "test"}, s = {"L$0", "L$1", "Z$0"})
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f191092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191093d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191095f;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191093d = obj;
            this.f191095f |= Integer.MIN_VALUE;
            boolean z10 = true | false;
            return g.this.o(0L, false, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$getUserPlaceAndPrizes$2", f = "ContestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<ContestPrize>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f191097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f191098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f191099d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, Contest contest, int i10, kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
            this.f191097b = str;
            this.f191098c = contest;
            this.f191099d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new o(this.f191097b, this.f191098c, this.f191099d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191096a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return new Select().from(ContestPrize.class).where("contest = ? AND place = ? " + this.f191097b, this.f191098c.getId(), kotlin.coroutines.jvm.internal.b.f(this.f191099d)).execute();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<ContestPrize>> dVar) {
            return ((o) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {}, l = {androidx.media3.extractor.metadata.dvbsi.b.f67479d}, m = "getVoteBatch", n = {}, s = {})
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f191100a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f191102c;

        p(kotlin.coroutines.d<? super p> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191100a = obj;
            this.f191102c |= Integer.MIN_VALUE;
            return g.this.f(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$getVoteBatch$2", f = "ContestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class q extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f191104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Contest f191106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f191107e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Contest contest, g gVar, kotlin.coroutines.d<? super q> dVar) {
            super(3, dVar);
            this.f191106d = contest;
            this.f191107e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191103a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            com.planner5d.library.api.b bVar = (com.planner5d.library.api.b) this.f191104b;
            id.a aVar = (id.a) this.f191105c;
            String str = this.f191106d.uid;
            Intrinsics.checkNotNull(str);
            return bVar.q(aVar, Long.parseLong(str), this.f191107e.f190983d.getPackageName(), h3.j(this.f191107e.f190983d), h3.a(), 1L);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            q qVar = new q(this.f191106d, this.f191107e, dVar);
            qVar.f191104b = bVar;
            qVar.f191105c = aVar;
            return qVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {0, 1}, l = {389, 390}, m = "hasExpiredActiveContest", n = {"this", "serverTime"}, s = {"L$0", "L$0"})
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191109b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191111d;

        r(kotlin.coroutines.d<? super r> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191109b = obj;
            this.f191111d |= Integer.MIN_VALUE;
            return g.this.Y(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$hasExpiredActiveContestBlocking$1", f = "ContestManager.kt", i = {}, l = {394}, m = "invokeSuspend", n = {}, s = {})
    static final class s extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191112a;

        s(kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new s(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191112a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            g gVar = g.this;
            this.f191112a = 1;
            Object objY = gVar.Y(this);
            return objY == objL ? objL : objY;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((s) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.O1}, m = "join", n = {}, s = {})
    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f191114a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f191116c;

        t(kotlin.coroutines.d<? super t> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191114a = obj;
            this.f191116c |= Integer.MIN_VALUE;
            return g.this.m(0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$join$response$1", f = "ContestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class u extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f191118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f191120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f191121e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(long j10, g gVar, kotlin.coroutines.d<? super u> dVar) {
            super(3, dVar);
            this.f191120d = j10;
            this.f191121e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191117a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return ((com.planner5d.library.api.b) this.f191118b).a0((id.a) this.f191119c, this.f191120d, this.f191121e.f190983d.getPackageName(), h3.j(this.f191121e.f190983d), h3.a());
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            u uVar = new u(this.f191120d, this.f191121e, dVar);
            uVar.f191118b = bVar;
            uVar.f191119c = aVar;
            return uVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {}, l = {85}, m = "loadContestsForUser", n = {}, s = {})
    static final class v extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f191122a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f191124c;

        v(kotlin.coroutines.d<? super v> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191122a = obj;
            this.f191124c |= Integer.MIN_VALUE;
            return g.this.b0(0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$loadContestsForUser$2", f = "ContestManager.kt", i = {0, 0}, l = {490}, m = "invokeSuspend", n = {MetricConsts.Install, "$this$withLock_u24default$iv"}, s = {"L$2", "L$3"})
    @SourceDebugExtension({"SMAP\nContestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestManager.kt\ncom/planner5d/library/model/manager/contest/ContestManager$loadContestsForUser$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,484:1\n116#2,11:485\n*S KotlinDebug\n*F\n+ 1 ContestManager.kt\ncom/planner5d/library/model/manager/contest/ContestManager$loadContestsForUser$2\n*L\n89#1:485,11\n*E\n"})
    static final class w extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<Contest>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f191128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f191129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f191131g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ g f191132h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(long j10, g gVar, kotlin.coroutines.d<? super w> dVar) {
            super(2, dVar);
            this.f191131g = j10;
            this.f191132h = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new w(this.f191131g, this.f191132h, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List listExecute;
            g gVar;
            kotlinx.coroutines.sync.a aVar;
            List list;
            long j10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191130f;
            if (i10 == 0) {
                ResultKt.m(obj);
                listExecute = new Select().from(Contest.class).where("user_id = ?", kotlin.coroutines.jvm.internal.b.g(this.f191131g)).orderBy("date_start DESC").execute();
                gVar = this.f191132h;
                long j11 = this.f191131g;
                kotlinx.coroutines.sync.a aVar2 = gVar.f190993n;
                this.f191125a = listExecute;
                this.f191126b = gVar;
                this.f191127c = listExecute;
                this.f191128d = aVar2;
                this.f191129e = j11;
                this.f191130f = 1;
                if (aVar2.h(null, this) == objL) {
                    return objL;
                }
                aVar = aVar2;
                list = listExecute;
                j10 = j11;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f191129e;
                aVar = (kotlinx.coroutines.sync.a) this.f191128d;
                listExecute = (List) this.f191127c;
                gVar = (g) this.f191126b;
                list = (List) this.f191125a;
                ResultKt.m(obj);
            }
            try {
                gVar.f190990k.put(kotlin.coroutines.jvm.internal.b.g(j10), listExecute);
                Unit unit = Unit.f312394a;
                return list;
            } finally {
                aVar.i(null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<Contest>> dVar) {
            return ((w) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {0}, l = {androidx.constraintlayout.core.motion.utils.v.c.f44017r, 418}, m = "setNotifiedAboutVoting", n = {"contestUid"}, s = {"L$0"})
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191136d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191138f;

        x(kotlin.coroutines.d<? super x> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191136d = obj;
            this.f191138f |= Integer.MIN_VALUE;
            return g.this.g0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager", f = "ContestManager.kt", i = {0, 0}, l = {475}, m = "shareActive", n = {"this", "activity"}, s = {"L$0", "L$1"})
    static final class y extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191141c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191143e;

        y(kotlin.coroutines.d<? super y> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191141c = obj;
            this.f191143e |= Integer.MIN_VALUE;
            return g.this.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.contest.ContestManager$shareActiveBlocking$1", f = "ContestManager.kt", i = {}, l = {472}, m = "invokeSuspend", n = {}, s = {})
    static final class z extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191144a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f191146c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(Activity activity, kotlin.coroutines.d<? super z> dVar) {
            super(2, dVar);
            this.f191146c = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new z(this.f191146c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191144a;
            if (i10 == 0) {
                ResultKt.m(obj);
                g gVar = g.this;
                Activity activity = this.f191146c;
                this.f191144a = 1;
                if (gVar.a(activity, this) == objL) {
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
            return ((z) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        int i10 = 5 | 0;
    }

    @ij.a
    public g(@NotNull com.planner5d.library.api.requests.c api, @NotNull Application application, @NotNull p0 formatter, @NotNull com.planner5d.library.model.manager.config.p preferencesManager, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.modules.user.user.w userAuthorization, @NotNull com.planner5d.library.services.g0 contestProjectSharer) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(contestProjectSharer, "contestProjectSharer");
        this.f190982c = api;
        this.f190983d = application;
        this.f190984e = formatter;
        this.f190985f = preferencesManager;
        this.f190986g = projectManager;
        this.f190987h = userAuthorization;
        this.f190988i = contestProjectSharer;
        this.f190989j = new kb.a<>(formatter, Contest.class);
        this.f190990k = new LinkedHashMap();
        com.planner5d.library.services.utility.s sVar = com.planner5d.library.services.utility.s.f229729a;
        this.f190991l = sVar.d();
        this.f190992m = sVar.h();
        this.f190993n = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Q(kotlin.coroutines.d<? super Set<String>> dVar) {
        return this.f190985f.i(com.planner5d.library.services.r.contestVotingNotifiedUids, new LinkedHashSet(), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object R(Contest contest, kotlin.coroutines.d<? super Long> dVar) {
        return kotlinx.coroutines.i.h(this.f190992m, new b(contest, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T(Contest contest, kotlin.coroutines.d<? super Long> dVar) {
        return kotlinx.coroutines.i.h(this.f190992m, new e(contest, this, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object W(long j10, String str, kotlin.coroutines.d<? super List<ContestPrize>> dVar) {
        i iVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f191072c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f191072c = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objH = iVar.f191070a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar.f191072c;
        if (i11 == 0) {
            ResultKt.m(objH);
            z1 z1Var = this.f190992m;
            j jVar = new j(j10, str, null);
            iVar.f191072c = 1;
            objH = kotlinx.coroutines.i.h(z1Var, jVar, iVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        Intrinsics.checkNotNullExpressionValue(objH, "withContext(...)");
        return objH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence X(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String lowerCase = it.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return "'" + lowerCase + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:31:0x0088->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object Y(kotlin.coroutines.d<? super Boolean> dVar) {
        r rVar;
        Date date;
        Iterable iterable;
        Iterator it;
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i10 = rVar.f191111d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f191111d = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(dVar);
            }
        } else {
            rVar = new r(dVar);
        }
        Object objV = rVar.f191109b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = rVar.f191111d;
        boolean z10 = true;
        if (i11 == 0) {
            ResultKt.m(objV);
            rVar.f191108a = this;
            rVar.f191111d = 1;
            objV = v(rVar);
            if (objV != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (g) rVar.f191108a;
            ResultKt.m(objV);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            date = (Date) rVar.f191108a;
            ResultKt.m(objV);
        }
        iterable = (Iterable) objV;
        if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            it = iterable.iterator();
            while (it.hasNext()) {
                if (((Contest) it.next()).O(date)) {
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
        Date date2 = (Date) objV;
        rVar.f191108a = date2;
        rVar.f191111d = 2;
        Object objT = this.t(rVar);
        if (objT != objL) {
            objV = objT;
            date = date2;
            iterable = (Iterable) objV;
            if (iterable instanceof Collection) {
                it = iterable.iterator();
                while (it.hasNext()) {
                    if (((Contest) it.next()).O(date)) {
                    }
                }
                z10 = false;
            } else {
                it = iterable.iterator();
                while (it.hasNext()) {
                    if (((Contest) it.next()).O(date)) {
                    }
                }
                z10 = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final boolean a0(long j10) {
        return Model.load(Catalog.class, j10) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object b0(long j10, kotlin.coroutines.d<? super List<Contest>> dVar) {
        v vVar;
        if (dVar instanceof v) {
            vVar = (v) dVar;
            int i10 = vVar.f191124c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f191124c = i10 - Integer.MIN_VALUE;
            } else {
                vVar = new v(dVar);
            }
        } else {
            vVar = new v(dVar);
        }
        Object objH = vVar.f191122a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = vVar.f191124c;
        if (i11 == 0) {
            ResultKt.m(objH);
            z1 z1Var = this.f190992m;
            w wVar = new w(j10, this, null);
            vVar.f191124c = 1;
            objH = kotlinx.coroutines.i.h(z1Var, wVar, vVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        Intrinsics.checkNotNullExpressionValue(objH, "withContext(...)");
        return objH;
    }

    @m1
    private final void c0(final Contest contest, final JSONArray jSONArray) {
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.contest.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.d0(contest, jSONArray);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(Contest contest, JSONArray jSONArray) throws JSONException {
        List listExecute = new Select().from(ContestPrize.class).where("contest = ?", contest.getId()).orderBy("id").execute();
        ArrayList arrayList = new ArrayList(listExecute != null ? listExecute : CollectionsKt.emptyList());
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            ContestPrize contestPrize = new ContestPrize();
            contestPrize.z(contest);
            contestPrize.D(Long.valueOf(jSONObject.getLong(com.planner5d.library.services.r.id.f224891a)));
            contestPrize.C(jSONObject.getString(com.planner5d.library.services.r.type.f224891a));
            contestPrize.A(Integer.valueOf(jSONObject.getInt(com.planner5d.library.services.r.place.f224891a)));
            Intrinsics.checkNotNull(jSONObject);
            contestPrize.B(Integer.valueOf(k1.m(jSONObject, com.planner5d.library.services.r.quantity, 1)));
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                ContestPrize contestPrize2 = (ContestPrize) obj;
                if (!Intrinsics.areEqual(contestPrize2, contestPrize)) {
                    contestPrize2.s(contestPrize).save();
                }
            } else {
                contestPrize.save();
            }
        }
        int length2 = jSONArray.length();
        int lastIndex = CollectionsKt.getLastIndex(arrayList);
        if (length2 <= lastIndex) {
            while (true) {
                ((ContestPrize) arrayList.get(length2)).delete();
                if (length2 == lastIndex) {
                    break;
                }
                length2++;
            }
        }
        return Unit.f312394a;
    }

    @m1
    private final void e0(final Contest contest, final JSONArray jSONArray) {
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.contest.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.f0(contest, jSONArray);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(Contest contest, JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList(new Select().from(ContestWinner.class).where("contest = ?", contest.getId()).orderBy("id").execute());
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            ContestWinner contestWinner = new ContestWinner();
            contestWinner.B(contest);
            contestWinner.D(jSONObject.getString(com.planner5d.library.services.r.contestWinnerName.f224891a));
            contestWinner.H(jSONObject.getString(com.planner5d.library.services.r.contestWinnerUserpic.f224891a));
            contestWinner.E(Integer.valueOf(jSONObject.getInt(com.planner5d.library.services.r.place.f224891a)));
            contestWinner.F(Integer.valueOf(jSONObject.getInt(com.planner5d.library.services.r.userRate.f224891a)));
            contestWinner.G(Integer.valueOf(jSONObject.getInt(com.planner5d.library.services.r.rateRatio.f224891a)));
            contestWinner.C(jSONObject.getString(com.planner5d.library.services.r.image.f224891a));
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                ContestWinner contestWinner2 = (ContestWinner) obj;
                if (!Intrinsics.areEqual(contestWinner2, contestWinner)) {
                    contestWinner2.s(contestWinner).save();
                }
            } else {
                contestWinner.save();
            }
        }
        int length2 = jSONArray.length();
        int lastIndex = CollectionsKt.getLastIndex(arrayList);
        if (length2 <= lastIndex) {
            while (true) {
                ((ContestWinner) arrayList.get(length2)).delete();
                if (length2 == lastIndex) {
                    break;
                }
                length2++;
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<eb.a> n0(List<ContestWinner> list) {
        List<ContestWinner> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.planner5d.library.contest.data.j.f148541a.b((ContestWinner) it.next()));
        }
        return arrayList;
    }

    @Override // kb.b
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void d(@NotNull id.a user, @NotNull Contest model, @NotNull JSONObject data) throws JSONException {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f190989j.d(model, data);
        model.R(k1.a(data, com.planner5d.library.services.r.active));
        model.V(new com.planner5d.library.model.a0(data.getJSONObject(com.planner5d.library.services.r.contestName.f224891a)));
        model.Y(new com.planner5d.library.model.a0(data.getJSONObject(com.planner5d.library.services.r.requirements.f224891a)));
        model.U(data.getString(com.planner5d.library.services.r.image.f224891a));
        model.Z(this.f190984e.g(data.getString(com.planner5d.library.services.r.startdate.f224891a)));
        model.a0(this.f190984e.g(data.getString(com.planner5d.library.services.r.dateofvoting.f224891a)));
        model.T(this.f190984e.g(data.getString(com.planner5d.library.services.r.enddate.f224891a)));
        model.W(k1.m(data, com.planner5d.library.services.r.numberofworks, 0));
        model.b0(k1.p(data, com.planner5d.library.services.r.userplace));
        model.c0(Integer.valueOf(k1.m(data, com.planner5d.library.services.r.userRate, 0)));
        model.X(Integer.valueOf(k1.m(data, com.planner5d.library.services.r.rateRatio, 0)));
    }

    @NotNull
    public final Observable<Long> U(@NotNull Contest contest) {
        Intrinsics.checkNotNullParameter(contest, "contest");
        return com.planner5d.library.services.utility.c0.F(com.planner5d.library.services.utility.c0.f225068a, null, new f(contest, null), 1, null);
    }

    @m1
    @NotNull
    public final List<ContestPrize> V(long j10) {
        List<ContestPrize> listExecute = new Select().from(ContestPrize.class).where("contest = ?", Long.valueOf(j10)).execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        return listExecute;
    }

    @m1
    public final boolean Z() {
        return ((Boolean) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, true, new s(null), 1, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.planner5d.library.contest.data.i
    @Nullable
    public Object a(@NotNull Activity activity, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        y yVar;
        Project projectU;
        if (dVar instanceof y) {
            yVar = (y) dVar;
            int i10 = yVar.f191143e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.f191143e = i10 - Integer.MIN_VALUE;
            } else {
                yVar = new y(dVar);
            }
        } else {
            yVar = new y(dVar);
        }
        Object objR = yVar.f191141c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = yVar.f191143e;
        if (i11 == 0) {
            ResultKt.m(objR);
            yVar.f191139a = this;
            yVar.f191140b = activity;
            yVar.f191143e = 1;
            objR = r(yVar);
            if (objR == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (Activity) yVar.f191140b;
            this = (g) yVar.f191139a;
            ResultKt.m(objR);
        }
        Activity activity2 = activity;
        Contest contest = (Contest) objR;
        if (contest != null && (projectU = this.u(contest)) != null) {
            this.f190988i.a(activity2, projectU, contest, com.planner5d.library.f.s.S5, l3.b.project_submit_screen);
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.ArrayList] */
    @Override // com.planner5d.library.contest.data.i
    @Nullable
    public Object b(@NotNull Contest contest, @NotNull eb.d dVar, @Nullable Integer num, @NotNull kotlin.coroutines.d<? super Boolean> dVar2) throws ErrorMessageException, JSONException {
        f0 f0Var;
        JSONObject jSONObjectA;
        ?? EmptyList;
        if (dVar2 instanceof f0) {
            f0Var = (f0) dVar2;
            int i10 = f0Var.f191048d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f0Var.f191048d = i10 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(dVar2);
            }
        } else {
            f0Var = new f0(dVar2);
        }
        f0 f0Var2 = f0Var;
        Object objG = f0Var2.f191046b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = f0Var2.f191048d;
        if (i11 == 0) {
            ResultKt.m(objG);
            com.planner5d.library.api.requests.c cVar = this.f190982c;
            id.a aVarA = this.f190987h.a();
            g0 g0Var = new g0(contest, dVar, num, null);
            f0Var2.f191045a = dVar;
            f0Var2.f191048d = 1;
            objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, g0Var, f0Var2, 2, null);
            if (objG == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (eb.d) f0Var2.f191045a;
            ResultKt.m(objG);
        }
        com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) objG;
        if (cVar2 == null || (jSONObjectA = cVar2.a()) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(dVar.f(), jSONObjectA.getString(com.planner5d.library.services.r.id.f224891a))) {
            throw new ErrorMessageException(com.planner5d.library.f.s.T8, new String[0]);
        }
        List<eb.c> listH = dVar.h();
        JSONArray jSONArray = jSONObjectA.getJSONArray(com.planner5d.library.services.r.works.f224891a);
        Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
        int length = jSONArray.length();
        if (length > 0) {
            EmptyList = new ArrayList(length);
            for (int i12 = 0; i12 < length; i12++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i12);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                EmptyList.add(f190979o.f(jSONObject));
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        return kotlin.coroutines.jvm.internal.b.a(listH.addAll((Collection) EmptyList));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // com.planner5d.library.contest.data.i
    @Nullable
    public Object f(@NotNull Contest contest, @NotNull kotlin.coroutines.d<? super eb.d[]> dVar) {
        p pVar;
        JSONObject jSONObjectA;
        eb.d[] dVarArrC;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i10 = pVar.f191102c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f191102c = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(dVar);
            }
        } else {
            pVar = new p(dVar);
        }
        p pVar2 = pVar;
        Object objG = pVar2.f191100a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = pVar2.f191102c;
        if (i11 == 0) {
            ResultKt.m(objG);
            com.planner5d.library.api.requests.c cVar = this.f190982c;
            id.a aVarA = this.f190987h.a();
            q qVar = new q(contest, this, null);
            pVar2.f191102c = 1;
            objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, qVar, pVar2, 2, null);
            if (objG == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objG);
        }
        com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) objG;
        return (cVar2 == null || (jSONObjectA = cVar2.a()) == null || (dVarArrC = f190979o.c(jSONObjectA)) == null) ? new eb.d[0] : dVarArrC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (r8.A(r7, r9, r0) == r1) goto L27;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.planner5d.library.model.manager.contest.g.x
            if (r0 == 0) goto L17
            r0 = r9
            r0 = r9
            com.planner5d.library.model.manager.contest.g$x r0 = (com.planner5d.library.model.manager.contest.g.x) r0
            int r1 = r0.f191138f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 5
            r3 = r1 & r2
            r6 = 5
            if (r3 == 0) goto L17
            r6 = 0
            int r1 = r1 - r2
            r0.f191138f = r1
            goto L1c
        L17:
            com.planner5d.library.model.manager.contest.g$x r0 = new com.planner5d.library.model.manager.contest.g$x
            r0.<init>(r9)
        L1c:
            java.lang.Object r9 = r0.f191136d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f191138f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            r6 = 7
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L31
            kotlin.ResultKt.m(r9)
            goto L92
        L31:
            r6 = 6
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "tkvte/clq os r/e e  i/iboo/nrewm/e/h/lcoue aourtn/i"
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.f191135c
            r6 = 3
            com.planner5d.library.services.r r7 = (com.planner5d.library.services.r) r7
            r6 = 1
            java.lang.Object r8 = r0.f191134b
            com.planner5d.library.model.manager.config.p r8 = (com.planner5d.library.model.manager.config.p) r8
            java.lang.Object r2 = r0.f191133a
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.m(r9)
            goto L6a
        L4e:
            kotlin.ResultKt.m(r9)
            com.planner5d.library.model.manager.config.p r9 = r7.f190985f
            com.planner5d.library.services.r r2 = com.planner5d.library.services.r.contestVotingNotifiedUids
            r0.f191133a = r8
            r0.f191134b = r9
            r0.f191135c = r2
            r0.f191138f = r4
            r6 = 6
            java.lang.Object r7 = r7.Q(r0)
            if (r7 != r1) goto L65
            goto L91
        L65:
            r5 = r9
            r9 = r7
            r7 = r2
            r2 = r8
            r8 = r5
        L6a:
            r6 = 7
            java.util.Set r9 = (java.util.Set) r9
            boolean r4 = r9.contains(r2)
            r6 = 6
            if (r4 == 0) goto L76
            r6 = 4
            goto L80
        L76:
            java.util.Set r2 = kotlin.collections.SetsKt.setOf(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r9 = kotlin.collections.SetsKt.plus(r9, r2)
        L80:
            r2 = 0
            r0.f191133a = r2
            r6 = 7
            r0.f191134b = r2
            r0.f191135c = r2
            r0.f191138f = r3
            java.lang.Object r7 = r8.A(r7, r9, r0)
            r6 = 6
            if (r7 != r1) goto L92
        L91:
            return r1
        L92:
            r6 = 7
            kotlin.Unit r7 = kotlin.Unit.f312394a
            r6 = 5
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.contest.g.g0(java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.contest.data.i
    @NotNull
    public List<ContestPrize> h() {
        ContestPrize contestPrize = new ContestPrize();
        contestPrize.B(1);
        contestPrize.C(fd.k.RENDERS.q());
        Unit unit = Unit.f312394a;
        ContestPrize contestPrize2 = new ContestPrize();
        contestPrize2.B(1);
        contestPrize2.C(fd.k.TEXTURES.q());
        ContestPrize contestPrize3 = new ContestPrize();
        contestPrize3.B(1);
        contestPrize3.C(fd.k.CATALOG.q());
        return CollectionsKt.listOf((Object[]) new ContestPrize[]{contestPrize, contestPrize2, contestPrize3});
    }

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "shareActive()", imports = {}))
    public final void h0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new z(activity, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.planner5d.library.contest.data.i
    @Nullable
    public Object i(@NotNull Contest contest, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        h0 h0Var;
        if (dVar instanceof h0) {
            h0Var = (h0) dVar;
            int i10 = h0Var.f191069d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h0Var.f191069d = i10 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(dVar);
            }
        } else {
            h0Var = new h0(dVar);
        }
        Object objV = h0Var.f191067b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = h0Var.f191069d;
        if (i11 == 0) {
            ResultKt.m(objV);
            h0Var.f191066a = contest;
            h0Var.f191069d = 1;
            objV = v(h0Var);
            if (objV == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            contest = (Contest) h0Var.f191066a;
            ResultKt.m(objV);
        }
        return kotlin.coroutines.jvm.internal.b.a(contest.P((Date) objV));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object i0(@NotNull Contest contest, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        a0 a0Var;
        Contest contest2;
        Set set;
        String str;
        if (dVar instanceof a0) {
            a0Var = (a0) dVar;
            int i10 = a0Var.f190998e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.f190998e = i10 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(dVar);
            }
        } else {
            a0Var = new a0(dVar);
        }
        Object objI = a0Var.f190996c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = a0Var.f190998e;
        if (i11 == 0) {
            ResultKt.m(objI);
            a0Var.f190994a = this;
            a0Var.f190995b = contest;
            a0Var.f190998e = 1;
            objI = i(contest, a0Var);
            if (objI != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            contest = (Contest) a0Var.f190995b;
            this = (g) a0Var.f190994a;
            ResultKt.m(objI);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            contest2 = (Contest) a0Var.f190994a;
            ResultKt.m(objI);
        }
        set = (Set) objI;
        str = contest2.uid;
        if (str == null) {
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
        boolean z10 = set.contains(str) ? false : true;
        return kotlin.coroutines.jvm.internal.b.a(z10);
        if (((Boolean) objI).booleanValue()) {
            a0Var.f190994a = contest;
            a0Var.f190995b = null;
            a0Var.f190998e = 2;
            objI = this.Q(a0Var);
            if (objI != objL) {
                contest2 = contest;
                set = (Set) objI;
                str = contest2.uid;
                if (str == null) {
                    return kotlin.coroutines.jvm.internal.b.a(true);
                }
                if (set.contains(str)) {
                }
            }
            return objL;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.planner5d.library.contest.data.i
    @Nullable
    public Object j(@Nullable Long l10, @NotNull kotlin.coroutines.d<? super Contest> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f191012d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f191012d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objT = cVar.f191010b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f191012d;
        if (i11 == 0) {
            ResultKt.m(objT);
            cVar.f191009a = l10;
            cVar.f191012d = 1;
            objT = t(cVar);
            if (objT == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l10 = (Long) cVar.f191009a;
            ResultKt.m(objT);
        }
        for (Object obj : (Iterable) objT) {
            if (Intrinsics.areEqual(((Contest) obj).uid, String.valueOf(l10))) {
                return obj;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Nullable
    public final Object j0(long j10, @Nullable String str, @NotNull kotlin.coroutines.d<? super String> dVar) throws Exception {
        b0 b0Var;
        JSONObject jSONObjectA;
        String string;
        if (dVar instanceof b0) {
            b0Var = (b0) dVar;
            int i10 = b0Var.f191008c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b0Var.f191008c = i10 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(dVar);
            }
        } else {
            b0Var = new b0(dVar);
        }
        b0 b0Var2 = b0Var;
        Object objG = b0Var2.f191006a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = b0Var2.f191008c;
        try {
            if (i11 == 0) {
                ResultKt.m(objG);
                com.planner5d.library.api.requests.c cVar = this.f190982c;
                id.a aVarA = this.f190987h.a();
                c0 c0Var = new c0(j10, this, str, null);
                b0Var2.f191008c = 1;
                objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c0Var, b0Var2, 2, null);
                if (objG == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objG);
            }
            com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) objG;
            if (cVar2 == null || (jSONObjectA = cVar2.a()) == null || (string = jSONObjectA.getString(com.planner5d.library.services.r.id.f224891a)) == null) {
                throw new Exception("Failed to submit work");
            }
            return string;
        } catch (Exception unused) {
            throw new Exception("Failed to submit work");
        }
    }

    @Override // kb.b
    @NotNull
    public List<Contest> k(@NotNull id.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        return CollectionsKt.emptyList();
    }

    @m1
    @Nullable
    public final Void k0(long j10, @Nullable String str) {
        com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new d0(j10, str, null), 3, null);
        return null;
    }

    @Override // kb.b
    @m1
    public void l(@NotNull id.a user, @NotNull JSONObject data) throws JSONException {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(data, "data");
        Contest contest = (Contest) this.f190989j.g(user, data, this);
        if (contest != null) {
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.winners;
            if (data.has(rVar.f224891a)) {
                JSONArray jSONArray = data.getJSONArray(rVar.f224891a);
                Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
                e0(contest, jSONArray);
            }
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.prizes;
            if (data.has(rVar2.f224891a)) {
                JSONArray jSONArray2 = data.getJSONArray(rVar2.f224891a);
                Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
                c0(contest, jSONArray2);
            }
        }
    }

    @m1
    public final void l0(@NotNull id.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        int i10 = 2 & 0;
        com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, this.f190991l, false, new e0(user, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // com.planner5d.library.contest.data.i
    @Nullable
    public Object m(long j10, @NotNull kotlin.coroutines.d<? super String> dVar) throws Exception {
        t tVar;
        JSONObject jSONObjectA;
        String string;
        if (dVar instanceof t) {
            tVar = (t) dVar;
            int i10 = tVar.f191116c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f191116c = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(dVar);
            }
        } else {
            tVar = new t(dVar);
        }
        t tVar2 = tVar;
        Object objG = tVar2.f191114a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = tVar2.f191116c;
        try {
            if (i11 == 0) {
                ResultKt.m(objG);
                com.planner5d.library.api.requests.c cVar = this.f190982c;
                id.a aVarA = this.f190987h.a();
                u uVar = new u(j10, this, null);
                tVar2.f191116c = 1;
                objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, uVar, tVar2, 2, null);
                if (objG == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objG);
            }
            com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) objG;
            if (cVar2 == null || (jSONObjectA = cVar2.a()) == null || (string = jSONObjectA.getString(com.planner5d.library.services.r.work.f224891a)) == null) {
                throw new Exception("Failed to join contest");
            }
            return string;
        } catch (Throwable unused) {
            throw new Exception("Failed to join contest");
        }
    }

    @Override // kb.b
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void c(@NotNull Contest model, @NotNull Contest modelConflict) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelConflict, "modelConflict");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.planner5d.library.contest.data.i
    @Nullable
    public Object n(@NotNull Contest contest, @NotNull kotlin.coroutines.d<? super List<eb.a>> dVar) {
        l lVar;
        eb.a aVar;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i10 = lVar.f191086d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f191086d = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar);
            }
        } else {
            lVar = new l(dVar);
        }
        Object obj = lVar.f191084b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = lVar.f191086d;
        if (i11 == 0) {
            ResultKt.m(obj);
            eb.a aVarA = com.planner5d.library.contest.data.j.f148541a.a(contest, this.f190987h.a());
            z1 z1Var = this.f190992m;
            m mVar = new m(contest, null);
            lVar.f191083a = aVarA;
            lVar.f191086d = 1;
            Object objH = kotlinx.coroutines.i.h(z1Var, mVar, lVar);
            if (objH == objL) {
                return objL;
            }
            obj = objH;
            aVar = aVarA;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (eb.a) lVar.f191083a;
            ResultKt.m(obj);
        }
        List list = (List) obj;
        if (aVar == null) {
            return list;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.add(0, aVar);
        return mutableList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.planner5d.library.contest.data.i
    @Nullable
    public Object o(long j10, boolean z10, @NotNull String[] strArr, @NotNull kotlin.coroutines.d<? super Pair<Integer, ? extends List<ContestPrize>>> dVar) {
        n nVar;
        String[] strArr2;
        boolean z11;
        int iIntValue;
        String str;
        Integer num;
        g gVar = this;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.f191095f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f191095f = i10 - Integer.MIN_VALUE;
            } else {
                nVar = gVar.new n(dVar);
            }
        } else {
            nVar = gVar.new n(dVar);
        }
        Object objJ = nVar.f191093d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = nVar.f191095f;
        if (i11 == 0) {
            ResultKt.m(objJ);
            Long lG = kotlin.coroutines.jvm.internal.b.g(j10);
            nVar.f191090a = gVar;
            strArr2 = strArr;
            nVar.f191091b = strArr2;
            z11 = z10;
            nVar.f191092c = z11;
            nVar.f191095f = 1;
            objJ = gVar.j(lG, nVar);
            if (objJ != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            boolean z12 = nVar.f191092c;
            strArr2 = (String[]) nVar.f191091b;
            g gVar2 = (g) nVar.f191090a;
            ResultKt.m(objJ);
            z11 = z12;
            gVar = gVar2;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (Integer) nVar.f191090a;
            ResultKt.m(objJ);
        }
        return new Pair(num, objJ);
        String[] strArr3 = strArr2;
        Contest contest = (Contest) objJ;
        if (contest == null) {
            return null;
        }
        if (z11) {
            iIntValue = 1;
        } else {
            Integer numK = contest.K();
            if (numK == null) {
                return null;
            }
            iIntValue = numK.intValue();
        }
        if (strArr3.length == 0) {
            str = "";
        } else {
            str = "AND type IN (" + ArraysKt.joinToString$default(strArr3, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.planner5d.library.model.manager.contest.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.X((String) obj);
                }
            }, 30, (Object) null) + ")";
        }
        Integer numF = kotlin.coroutines.jvm.internal.b.f(iIntValue);
        z1 z1Var = gVar.f190992m;
        o oVar = new o(str, contest, iIntValue, null);
        nVar.f191090a = numF;
        nVar.f191091b = null;
        nVar.f191095f = 2;
        objJ = kotlinx.coroutines.i.h(z1Var, oVar, nVar);
        if (objJ != objL) {
            num = numF;
            return new Pair(num, objJ);
        }
        return objL;
    }

    @Override // kb.b
    @NotNull
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public JSONObject w(@NotNull id.a user, @NotNull Contest model) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(model, "model");
        return new JSONObject();
    }

    @Override // kb.b
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void p(@NotNull Contest model, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x0116  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0168  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:83:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0149 A[SYNTHETIC] */
    @Override // com.planner5d.library.contest.data.i
    @Nullable
    public Object q(@NotNull kotlin.coroutines.d<? super List<hb.a>> dVar) {
        h hVar;
        Long id2;
        long j10;
        List list;
        Object objW;
        List list2;
        List list3;
        ArrayList arrayList;
        Iterator it;
        List list4;
        ArrayList arrayList2;
        Iterator it2;
        ArrayList arrayList3;
        Iterator it3;
        Iterator it4;
        Object obj;
        Object next;
        ContestPrize contestPrize;
        int iIntValue;
        ContestPrize contestPrize2;
        Integer numW;
        Integer numV;
        Integer numW2;
        Integer numV2;
        Integer numV3;
        Integer numV4;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f191065e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f191065e = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object objR = hVar.f191063c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar.f191065e;
        int i12 = 3 | 3;
        if (i11 == 0) {
            ResultKt.m(objR);
            hVar.f191061a = this;
            hVar.f191065e = 1;
            objR = r(hVar);
            if (objR != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (g) hVar.f191061a;
            ResultKt.m(objR);
        } else {
            if (i11 == 2) {
                j10 = hVar.f191062b;
                this = (g) hVar.f191061a;
                ResultKt.m(objR);
                list = (List) objR;
                String strQ = fd.k.TEXTURES.q();
                hVar.f191061a = list;
                hVar.f191065e = 3;
                objW = this.W(j10, strQ, hVar);
                if (objW != objL) {
                    objR = objW;
                    list2 = list;
                }
                return objL;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) hVar.f191061a;
            ResultKt.m(objR);
        }
        List list5 = (List) objR;
        list3 = list2;
        arrayList = new ArrayList();
        it = list3.iterator();
        while (it.hasNext()) {
            numV4 = ((ContestPrize) it.next()).v();
            if (numV4 != null) {
                arrayList.add(numV4);
            }
        }
        list4 = list5;
        arrayList2 = new ArrayList();
        it2 = list4.iterator();
        while (it2.hasNext()) {
            numV3 = ((ContestPrize) it2.next()).v();
            if (numV3 != null) {
                arrayList2.add(numV3);
            }
        }
        Set setIntersect = CollectionsKt.intersect(arrayList, CollectionsKt.toSet(arrayList2));
        arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setIntersect, 10));
        it3 = setIntersect.iterator();
        while (it3.hasNext()) {
            int iIntValue2 = ((Number) it3.next()).intValue();
            it4 = list3.iterator();
            while (true) {
                obj = null;
                if (it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                numV2 = ((ContestPrize) next).v();
                if (numV2 != null && numV2.intValue() == iIntValue2) {
                    break;
                }
            }
            contestPrize = (ContestPrize) next;
            int iIntValue3 = 0;
            if (contestPrize != null || (numW2 = contestPrize.w()) == null) {
                iIntValue = 0;
            } else {
                iIntValue = numW2.intValue();
            }
            for (Object obj2 : list4) {
                numV = ((ContestPrize) obj2).v();
                if (numV != null && numV.intValue() == iIntValue2) {
                    obj = obj2;
                    break;
                }
            }
            contestPrize2 = (ContestPrize) obj;
            if (contestPrize2 == null && (numW = contestPrize2.w()) != null) {
                iIntValue3 = numW.intValue();
            }
            arrayList3.add(new hb.a(iIntValue2, iIntValue, iIntValue3));
        }
        return arrayList3;
        Contest contest = (Contest) objR;
        if (contest == null || (id2 = contest.getId()) == null) {
            return CollectionsKt.emptyList();
        }
        long jLongValue = id2.longValue();
        String strQ2 = fd.k.RENDERS.q();
        hVar.f191061a = this;
        hVar.f191062b = jLongValue;
        hVar.f191065e = 2;
        objR = this.W(jLongValue, strQ2, hVar);
        if (objR != objL) {
            j10 = jLongValue;
            list = (List) objR;
            String strQ3 = fd.k.TEXTURES.q();
            hVar.f191061a = list;
            hVar.f191065e = 3;
            objW = this.W(j10, strQ3, hVar);
            if (objW != objL) {
                objR = objW;
                list2 = list;
                List list6 = (List) objR;
                list3 = list2;
                arrayList = new ArrayList();
                it = list3.iterator();
                while (it.hasNext()) {
                    numV4 = ((ContestPrize) it.next()).v();
                    if (numV4 != null) {
                        arrayList.add(numV4);
                    }
                }
                list4 = list6;
                arrayList2 = new ArrayList();
                it2 = list4.iterator();
                while (it2.hasNext()) {
                    numV3 = ((ContestPrize) it2.next()).v();
                    if (numV3 != null) {
                        arrayList2.add(numV3);
                    }
                }
                Set setIntersect2 = CollectionsKt.intersect(arrayList, CollectionsKt.toSet(arrayList2));
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setIntersect2, 10));
                it3 = setIntersect2.iterator();
                while (it3.hasNext()) {
                    int iIntValue4 = ((Number) it3.next()).intValue();
                    it4 = list3.iterator();
                    while (true) {
                        obj = null;
                        if (it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                        numV2 = ((ContestPrize) next).v();
                        if (numV2 != null) {
                            break;
                            break;
                        }
                    }
                    contestPrize = (ContestPrize) next;
                    int iIntValue5 = 0;
                    if (contestPrize != null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = 0;
                    }
                    while (r6.hasNext()) {
                        numV = ((ContestPrize) obj2).v();
                        if (numV != null) {
                            obj = obj2;
                            break;
                        }
                    }
                    contestPrize2 = (ContestPrize) obj;
                    if (contestPrize2 == null) {
                    }
                    arrayList3.add(new hb.a(iIntValue4, iIntValue, iIntValue5));
                }
                return arrayList3;
            }
        }
        return objL;
    }

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "votingStarted()", imports = {}))
    public final boolean q0(@NotNull Contest contest) {
        Intrinsics.checkNotNullParameter(contest, "contest");
        return ((Boolean) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new i0(contest, null), 3, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0092 -> B:25:0x0095). Please report as a decompilation issue!!! */
    @Override // com.planner5d.library.contest.data.i
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super com.planner5d.library.database.model.contest.Contest> r8) {
        /*
            r7 = this;
            r6 = 7
            boolean r0 = r8 instanceof com.planner5d.library.model.manager.contest.g.d
            if (r0 == 0) goto L18
            r0 = r8
            com.planner5d.library.model.manager.contest.g$d r0 = (com.planner5d.library.model.manager.contest.g.d) r0
            r6 = 1
            int r1 = r0.f191025g
            r6 = 6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r6 = 7
            if (r3 == 0) goto L18
            r6 = 3
            int r1 = r1 - r2
            r0.f191025g = r1
            goto L1d
        L18:
            com.planner5d.library.model.manager.contest.g$d r0 = new com.planner5d.library.model.manager.contest.g$d
            r0.<init>(r8)
        L1d:
            java.lang.Object r8 = r0.f191023e
            r6 = 7
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f191025g
            r6 = 4
            r3 = 2
            r6 = 3
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L4e
            if (r2 != r3) goto L45
            java.lang.Object r7 = r0.f191022d
            com.planner5d.library.database.model.contest.Contest r7 = (com.planner5d.library.database.model.contest.Contest) r7
            java.lang.Object r2 = r0.f191021c
            java.lang.Object r4 = r0.f191020b
            java.util.Iterator r4 = (java.util.Iterator) r4
            r6 = 5
            java.lang.Object r5 = r0.f191019a
            r6 = 2
            com.planner5d.library.model.manager.contest.g r5 = (com.planner5d.library.model.manager.contest.g) r5
            kotlin.ResultKt.m(r8)
            r6 = 1
            goto L95
        L45:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 4
            r7.<init>(r8)
            throw r7
        L4e:
            java.lang.Object r7 = r0.f191019a
            com.planner5d.library.model.manager.contest.g r7 = (com.planner5d.library.model.manager.contest.g) r7
            kotlin.ResultKt.m(r8)
            goto L66
        L56:
            kotlin.ResultKt.m(r8)
            r0.f191019a = r7
            r0.f191025g = r4
            r6 = 2
            java.lang.Object r8 = r7.t(r0)
            if (r8 != r1) goto L66
            r6 = 6
            goto L94
        L66:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r6 = 0
            java.util.Iterator r8 = r8.iterator()
            r5 = r7
            r4 = r8
            r4 = r8
        L70:
            r6 = 5
            boolean r7 = r4.hasNext()
            r6 = 1
            if (r7 == 0) goto L9e
            java.lang.Object r2 = r4.next()
            r7 = r2
            r6 = 4
            com.planner5d.library.database.model.contest.Contest r7 = (com.planner5d.library.database.model.contest.Contest) r7
            r6 = 4
            r0.f191019a = r5
            r0.f191020b = r4
            r6 = 6
            r0.f191021c = r2
            r6 = 2
            r0.f191022d = r7
            r0.f191025g = r3
            java.lang.Object r8 = r5.v(r0)
            r6 = 4
            if (r8 != r1) goto L95
        L94:
            return r1
        L95:
            java.util.Date r8 = (java.util.Date) r8
            boolean r7 = r7.M(r8)
            if (r7 == 0) goto L70
            return r2
        L9e:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.contest.g.r(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r10 == r1) goto L24;
     */
    @Override // com.planner5d.library.contest.data.i
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.List<com.planner5d.library.database.model.contest.Contest>> r10) {
        /*
            r9 = this;
            r8 = 4
            boolean r0 = r10 instanceof com.planner5d.library.model.manager.contest.g.C1589g
            r8 = 5
            if (r0 == 0) goto L18
            r0 = r10
            r0 = r10
            r8 = 2
            com.planner5d.library.model.manager.contest.g$g r0 = (com.planner5d.library.model.manager.contest.g.C1589g) r0
            int r1 = r0.f191054f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f191054f = r1
            r8 = 7
            goto L1e
        L18:
            com.planner5d.library.model.manager.contest.g$g r0 = new com.planner5d.library.model.manager.contest.g$g
            r8 = 7
            r0.<init>(r10)
        L1e:
            java.lang.Object r10 = r0.f191052d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f191054f
            r3 = 2
            r4 = 1
            r5 = 0
            r8 = r5
            if (r2 == 0) goto L50
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.ResultKt.m(r10)
            goto L91
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            r8 = 5
            long r6 = r0.f191051c
            java.lang.Object r9 = r0.f191050b
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.a) r9
            r8 = 5
            java.lang.Object r2 = r0.f191049a
            r8 = 6
            com.planner5d.library.model.manager.contest.g r2 = (com.planner5d.library.model.manager.contest.g) r2
            kotlin.ResultKt.m(r10)
            r10 = r9
            r10 = r9
            r9 = r2
            goto L6e
        L50:
            r8 = 3
            kotlin.ResultKt.m(r10)
            com.planner5d.library.modules.user.user.w r10 = r9.f190987h
            r8 = 3
            long r6 = r10.e()
            r8 = 2
            kotlinx.coroutines.sync.a r10 = r9.f190993n
            r0.f191049a = r9
            r0.f191050b = r10
            r0.f191051c = r6
            r0.f191054f = r4
            java.lang.Object r2 = r10.h(r5, r0)
            r8 = 2
            if (r2 != r1) goto L6e
            goto L8f
        L6e:
            java.util.Map<java.lang.Long, java.util.List<com.planner5d.library.database.model.contest.Contest>> r2 = r9.f190990k     // Catch: java.lang.Throwable -> L95
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.b.g(r6)     // Catch: java.lang.Throwable -> L95
            r8 = 1
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L95
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L95
            r10.i(r5)
            if (r2 != 0) goto L94
            r0.f191049a = r5
            r8 = 4
            r0.f191050b = r5
            r0.f191054f = r3
            r8 = 0
            java.lang.Object r10 = r9.b0(r6, r0)
            r8 = 4
            if (r10 != r1) goto L91
        L8f:
            r8 = 0
            return r1
        L91:
            java.util.List r10 = (java.util.List) r10
            return r10
        L94:
            return r2
        L95:
            r9 = move-exception
            r8 = 5
            r10.i(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.contest.g.t(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.contest.data.i
    @m1
    @Nullable
    public Project u(@NotNull Contest contest) {
        Intrinsics.checkNotNullParameter(contest, "contest");
        return this.f190986g.b(this.f190987h.a(), contest);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.planner5d.library.contest.data.i
    @Nullable
    public Object v(@NotNull kotlin.coroutines.d<? super Date> dVar) {
        k kVar;
        Date date;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i10 = kVar.f191082d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f191082d = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar);
            }
        } else {
            kVar = new k(dVar);
        }
        Object obj = kVar.f191080b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = kVar.f191082d;
        if (i11 == 0) {
            ResultKt.m(obj);
            Date date2 = new Date();
            com.planner5d.library.model.manager.config.p pVar = this.f190985f;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.serverTimeDelta;
            kVar.f191079a = date2;
            kVar.f191082d = 1;
            Object objO = pVar.o(rVar, 0L, kVar);
            if (objO == objL) {
                return objL;
            }
            obj = objO;
            date = date2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            date = (Date) kVar.f191079a;
            ResultKt.m(obj);
        }
        return com.planner5d.library.services.utility.i0.a(date, ((Number) obj).longValue());
    }
}
