package com.planner5d.library.model.manager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nBlogRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogRepository.kt\ncom/planner5d/library/model/manager/BlogRepository\n*L\n1#1,113:1\n30#1:114\n30#1:115\n30#1:116\n30#1:117\n*S KotlinDebug\n*F\n+ 1 BlogRepository.kt\ncom/planner5d/library/model/manager/BlogRepository\n*L\n46#1:114\n51#1:115\n110#1:116\n111#1:117\n*E\n"})
public final class b implements z2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f180844f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f180845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.feed.data.a> f180846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f180847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f180848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f180849e;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.BlogRepository$fetchCategoriesFromApi$2", f = "BlogRepository.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super List<Integer>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180850a;

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.b$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.BlogRepository$fetchCategoriesFromApi$2$response$1", f = "BlogRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1569a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f180852a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f180853b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f180854c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f180855d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1569a(b bVar, kotlin.coroutines.d<? super C1569a> dVar) {
                super(3, dVar);
                this.f180855d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f180852a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f180853b).c((id.a) this.f180854c, this.f180855d.r());
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                C1569a c1569a = new C1569a(this.f180855d, dVar);
                c1569a.f180853b = bVar;
                c1569a.f180854c = aVar;
                return c1569a.invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f180850a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = b.this.f180848d;
                id.a aVarA = b.this.f180849e.a();
                C1569a c1569a = new C1569a(b.this, null);
                this.f180850a = 1;
                obj = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1569a, this, 2, null);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) obj;
            ArrayList arrayList = new ArrayList();
            int length = cVar2.b().length();
            for (int i11 = 0; i11 < length; i11++) {
                arrayList.add(kotlin.coroutines.jvm.internal.b.f(cVar2.b().getJSONObject(i11).getInt("id")));
            }
            return arrayList;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<Integer>> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.BlogRepository$fetchPostsFromApi$2", f = "BlogRepository.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "invokeSuspend", n = {}, s = {})
    static final class C1570b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super List<jc.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180856a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Integer> f180858c;

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.b$b$a */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.BlogRepository$fetchPostsFromApi$2$blogResponse$1", f = "BlogRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f180859a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f180860b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f180861c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f180862d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f180862d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f180859a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f180860b).b((id.a) this.f180861c, this.f180862d.r(), 1, this.f180862d.f180845a.getPackageName(), com.planner5d.library.services.utility.h3.j(this.f180862d.f180845a), com.planner5d.library.services.utility.h3.a());
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                a aVar2 = new a(this.f180862d, dVar);
                aVar2.f180860b = bVar;
                aVar2.f180861c = aVar;
                return aVar2.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1570b(List<Integer> list, kotlin.coroutines.d<? super C1570b> dVar) {
            super(2, dVar);
            this.f180858c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new C1570b(this.f180858c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            C1570b c1570b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f180856a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = b.this.f180848d;
                id.a aVarA = b.this.f180849e.a();
                a aVar = new a(b.this, null);
                this.f180856a = 1;
                c1570b = this;
                obj = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, aVar, c1570b, 2, null);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                c1570b = this;
            }
            com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) obj;
            ArrayList arrayList = new ArrayList();
            int length = cVar2.b().length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = cVar2.b().getJSONObject(i11);
                int iOptInt = jSONObject.optInt("categoryId", -1);
                if (iOptInt > 0 && c1570b.f180858c.contains(kotlin.coroutines.jvm.internal.b.f(iOptInt))) {
                    b bVar = b.this;
                    Intrinsics.checkNotNull(jSONObject);
                    arrayList.add(bVar.q(jSONObject));
                }
            }
            return arrayList;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<jc.a>> dVar) {
            return ((C1570b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.BlogRepository", f = "BlogRepository.kt", i = {0, 1, 1, 2}, l = {34, 35, 38}, m = "refreshPostsByCategories", n = {"this", "this", "postsFromApi", "postsByCategories"}, s = {"L$0", "L$0", "L$1", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f180865c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180867e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180865c = obj;
            this.f180867e |= Integer.MIN_VALUE;
            return b.this.t(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.BlogRepository$refreshPostsByCategories$postsByCategories$1", f = "BlogRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBlogRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogRepository.kt\ncom/planner5d/library/model/manager/BlogRepository$refreshPostsByCategories$postsByCategories$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,113:1\n1062#2:114\n1485#2:115\n1510#2,3:116\n1513#2,3:126\n381#3,7:119\n*S KotlinDebug\n*F\n+ 1 BlogRepository.kt\ncom/planner5d/library/model/manager/BlogRepository$refreshPostsByCategories$postsByCategories$1\n*L\n36#1:114\n36#1:115\n36#1:116,3\n36#1:126,3\n36#1:119,7\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Map<Integer, ? extends List<? extends jc.a>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<jc.a> f180869b;

        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 BlogRepository.kt\ncom/planner5d/library/model/manager/BlogRepository$refreshPostsByCategories$postsByCategories$1\n*L\n1#1,121:1\n36#2:122\n*E\n"})
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return kotlin.comparisons.a.l(((jc.a) t11).d(), ((jc.a) t10).d());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List<jc.a> list, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f180869b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f180869b, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Map<Integer, ? extends List<? extends jc.a>>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super Map<Integer, ? extends List<jc.a>>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f180868a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            List listSortedWith = CollectionsKt.sortedWith(this.f180869b, new a());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : listSortedWith) {
                Integer numB = ((jc.a) obj2).b();
                Object arrayList = linkedHashMap.get(numB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(numB, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            return linkedHashMap;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Map<Integer, ? extends List<jc.a>>> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.BlogRepository", f = "BlogRepository.kt", i = {0, 0, 0, 1, 1}, l = {45, 46, 47}, m = "storePosts", n = {"this", "postsFromApi", "hashCode", "this", "hashCode"}, s = {"L$0", "L$1", "I$0", "L$0", "I$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f180872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f180873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f180874e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180876g;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180874e = obj;
            this.f180876g |= Integer.MIN_VALUE;
            return b.this.w(null, this);
        }
    }

    @ij.a
    public b(@NotNull com.planner5d.library.application.b application, @NotNull fg.e<com.planner5d.library.feed.data.a> lazyBlogPostDao, @NotNull com.planner5d.library.model.manager.config.p sharedPreferences, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull com.planner5d.library.modules.user.user.t userAuthorization) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(lazyBlogPostDao, "lazyBlogPostDao");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f180845a = application;
        this.f180846b = lazyBlogPostDao;
        this.f180847c = sharedPreferences;
        this.f180848d = userApiRequester;
        this.f180849e = userAuthorization;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(List<Integer> list, kotlin.coroutines.d<? super List<jc.a>> dVar) throws JSONException, com.planner5d.library.api.e {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.b(), new C1570b(list, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    public final jc.a q(JSONObject jSONObject) throws JSONException {
        return new jc.a(jSONObject.getInt("id"), Integer.valueOf(jSONObject.getInt("categoryId")), jSONObject.getString("title"), jSONObject.getString("imageUri"), jSONObject.getString("thumbnailImageUri"), jSONObject.getString("announcement"), jSONObject.getString("contentUri"), jSONObject.getString("videoUri"), jSONObject.getString("publicUri"), jSONObject.getString("ghostUri"), jSONObject.getString("createdAt"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String r() {
        String string = this.f180845a.getResources().getConfiguration().getLocales().get(0).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.j2(string, '_', org.apache.commons.codec.language.l.f335457d, false, 4, null);
    }

    private final com.planner5d.library.feed.data.a s() {
        com.planner5d.library.feed.data.a aVar = this.f180846b.get();
        Intrinsics.checkNotNullExpressionValue(aVar, "get(...)");
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        if (r10.t(r11, r9, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.util.List<jc.a> r10, kotlin.coroutines.d<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.b.w(java.util.List, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final Object n(@NotNull kotlin.coroutines.d<? super List<Integer>> dVar) throws JSONException {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.b(), new a(null), dVar);
    }

    @Nullable
    public final Object o(@NotNull kotlin.coroutines.d<? super List<jc.a>> dVar) {
        com.planner5d.library.feed.data.a aVar = this.f180846b.get();
        Intrinsics.checkNotNullExpressionValue(aVar, "get(...)");
        return aVar.b(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object t(@NotNull List<Integer> list, @NotNull kotlin.coroutines.d<? super Map<Integer, ? extends List<jc.a>>> dVar) throws JSONException, com.planner5d.library.api.e {
        c cVar;
        b bVar;
        List<jc.a> list2;
        Map map;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f180867e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f180867e = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objP = cVar.f180865c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f180867e;
        if (i11 == 0) {
            ResultKt.m(objP);
            cVar.f180863a = this;
            cVar.f180867e = 1;
            objP = p(list, cVar);
            if (objP != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (b) cVar.f180863a;
            ResultKt.m(objP);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Map map2 = (Map) cVar.f180863a;
                ResultKt.m(objP);
                return map2;
            }
            list2 = (List) cVar.f180864b;
            bVar = (b) cVar.f180863a;
            ResultKt.m(objP);
        }
        map = (Map) objP;
        cVar.f180863a = map;
        cVar.f180864b = null;
        cVar.f180867e = 3;
        if (bVar.w(list2, cVar) != objL) {
            return objL;
        }
        return map;
        List<jc.a> list3 = (List) objP;
        kotlinx.coroutines.z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
        d dVar2 = new d(list3, null);
        cVar.f180863a = this;
        cVar.f180864b = list3;
        cVar.f180867e = 2;
        objP = kotlinx.coroutines.i.h(z1VarH, dVar2, cVar);
        if (objP != objL) {
            bVar = this;
            list2 = list3;
            map = (Map) objP;
            cVar.f180863a = map;
            cVar.f180864b = null;
            cVar.f180867e = 3;
            if (bVar.w(list2, cVar) != objL) {
                return map;
            }
        }
        return objL;
    }

    @Nullable
    public final Object u(@NotNull String str, @NotNull kotlin.coroutines.d<? super jc.a> dVar) {
        com.planner5d.library.feed.data.a aVar = this.f180846b.get();
        Intrinsics.checkNotNullExpressionValue(aVar, "get(...)");
        return aVar.c(str, dVar);
    }

    @Nullable
    public final Object v(@NotNull String str, @NotNull kotlin.coroutines.d<? super jc.a> dVar) {
        com.planner5d.library.feed.data.a aVar = this.f180846b.get();
        Intrinsics.checkNotNullExpressionValue(aVar, "get(...)");
        return aVar.d(str, dVar);
    }
}
