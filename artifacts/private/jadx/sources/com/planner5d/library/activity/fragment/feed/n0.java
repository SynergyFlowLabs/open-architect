package com.planner5d.library.activity.fragment.feed;

import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.services.utility.v1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFeedListItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedListItems.kt\ncom/planner5d/library/activity/fragment/feed/FeedListItems\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,166:1\n139#1,13:170\n139#1,13:183\n13409#2,2:167\n216#3:169\n217#3:196\n*S KotlinDebug\n*F\n+ 1 FeedListItems.kt\ncom/planner5d/library/activity/fragment/feed/FeedListItems\n*L\n81#1:170,13\n85#1:183,13\n62#1:167,2\n71#1:169\n71#1:196\n*E\n"})
public final class n0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f133534k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f133535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f133536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.contest.g f133537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.p f133538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.feed.usecase.a f133539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.w f133540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f133541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f133542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f133543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<hc.a.EnumC1914a, hc.a> f133544j;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133545a;

        static {
            int[] iArr = new int[hc.a.EnumC1914a.values().length];
            try {
                iArr[hc.a.EnumC1914a.ProjectList.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hc.a.EnumC1914a.DesignGeneratorLabel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hc.a.EnumC1914a.DesignGeneratorItem.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[hc.a.EnumC1914a.DesignBattleLabel.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[hc.a.EnumC1914a.DesignBattleItem.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[hc.a.EnumC1914a.DesignOfDay.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[hc.a.EnumC1914a.Inspiration.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[hc.a.EnumC1914a.ForYourHome.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[hc.a.EnumC1914a.Tips.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[hc.a.EnumC1914a.Videos.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[hc.a.EnumC1914a.Unknown.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[hc.a.EnumC1914a.AllArticles.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f133545a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedListItems$createProjectsItem$2", f = "FeedListItems.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFeedListItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedListItems.kt\ncom/planner5d/library/activity/fragment/feed/FeedListItems$createProjectsItem$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,166:1\n1557#2:167\n1628#2,3:168\n*S KotlinDebug\n*F\n+ 1 FeedListItems.kt\ncom/planner5d/library/activity/fragment/feed/FeedListItems$createProjectsItem$2\n*L\n129#1:167\n129#1:168,3\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super hc.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133546a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f133548c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f133548c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n0.this.new b(this.f133548c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f133546a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            hc.a.EnumC1914a enumC1914a = hc.a.EnumC1914a.ProjectList;
            List<Project> listU0 = n0.this.f133536b.u0(n0.this.f133535a.a(), null, com.planner5d.library.model.manager.project.d0.d.BY_DATE, this.f133548c);
            Intrinsics.checkNotNullExpressionValue(listU0, "getBackground(...)");
            List<Project> list = listU0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Project project : list) {
                Intrinsics.checkNotNull(project);
                arrayList.add(new yc.d(project, false));
            }
            return new hc.a(enumC1914a, arrayList);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super hc.a> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedListItems$prepareDesignOfTheDayItem$1", f = "FeedListItems.kt", i = {}, l = {androidx.media2.widget.f.i.f59799s0}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f133550b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n0.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.c1 c1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133550b;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.lifecycle.c1 c1VarL = n0.this.l();
                com.planner5d.library.feed.usecase.a aVar = n0.this.f133539e;
                this.f133549a = c1VarL;
                this.f133550b = 1;
                Object objA = aVar.a(this);
                if (objA == objL) {
                    return objL;
                }
                obj = objA;
                c1Var = c1VarL;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1Var = (androidx.lifecycle.c1) this.f133549a;
                ResultKt.m(obj);
            }
            c1Var.r(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedListItems", f = "FeedListItems.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {70, com.planner5d.library.engine.input.f.b.C0, com.planner5d.library.engine.input.f.b.f160696i0}, m = "refreshItems", n = {"this", "withSynchronized", "withDesignOfTheDay", "hasDesignGeneratorFeature", "hasContestsFeature", "this", "activeContest", "viewType", "withSynchronized", "withDesignOfTheDay", "hasDesignGeneratorFeature", "hasContestsFeature", "this", "activeContest", "viewType", "withSynchronized", "withDesignOfTheDay", "hasDesignGeneratorFeature", "hasContestsFeature"}, s = {"L$0", "Z$0", "Z$1", "Z$2", "Z$3", "L$0", "L$1", "L$3", "Z$0", "Z$1", "Z$2", "Z$3", "L$0", "L$1", "L$3", "Z$0", "Z$1", "Z$2", "Z$3"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f133553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f133554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f133555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f133556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f133557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f133558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f133559h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f133560i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f133561j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f133562k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f133564m;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f133562k = obj;
            this.f133564m |= Integer.MIN_VALUE;
            return n0.this.o(false, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedListItems$refreshItems$2$2$1", f = "FeedListItems.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Pair<? extends Contest, ? extends Project>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Contest f133566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f133567c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Contest contest, n0 n0Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f133566b = contest;
            this.f133567c = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f133566b, this.f133567c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Pair<? extends Contest, ? extends Project>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super Pair<Contest, Project>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f133565a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return new Pair(this.f133566b, this.f133567c.f133537c.u(this.f133566b));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Pair<Contest, Project>> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedListItems$toggleDesignOfTheDayFavorite$1", f = "FeedListItems.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFeedListItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedListItems.kt\ncom/planner5d/library/activity/fragment/feed/FeedListItems$toggleDesignOfTheDayFavorite$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,166:1\n1557#2:167\n1628#2,3:168\n1557#2:171\n1628#2,3:172\n*S KotlinDebug\n*F\n+ 1 FeedListItems.kt\ncom/planner5d/library/activity/fragment/feed/FeedListItems$toggleDesignOfTheDayFavorite$1\n*L\n106#1:167\n106#1:168,3\n116#1:171\n116#1:172,3\n*E\n"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133568a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ jc.e f133570c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f133571a;

            static {
                int[] iArr = new int[com.planner5d.library.model.manager.favorite.a.b.values().length];
                try {
                    iArr[com.planner5d.library.model.manager.favorite.a.b.ADDED_TO_FAVORITES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.planner5d.library.model.manager.favorite.a.b.IGNORED_BECAUSE_ONGOING_TO_FAVORITES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.planner5d.library.model.manager.favorite.a.b.REMOVED_FROM_FAVORITES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.planner5d.library.model.manager.favorite.a.b.IGNORED_BECAUSE_ONGOING_FROM_FAVORITES.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f133571a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(jc.e eVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f133570c = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List n(jc.e eVar, List list) {
            if (list == null) {
                return null;
            }
            List<jc.e> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (jc.e eVarH : list2) {
                if (Intrinsics.areEqual(eVarH.l(), eVar.l())) {
                    eVarH = jc.e.h(eVarH, null, null, null, null, null, !eVar.k(), 31, null);
                }
                arrayList.add(eVarH);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List s(jc.e eVar, boolean z10, List list) {
            boolean z11;
            if (list == null) {
                return null;
            }
            List<jc.e> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (jc.e eVarH : list2) {
                if (Intrinsics.areEqual(eVarH.l(), eVar.l())) {
                    z11 = z10;
                    eVarH = jc.e.h(eVarH, null, null, null, null, null, z11, 31, null);
                } else {
                    z11 = z10;
                }
                arrayList.add(eVarH);
                z10 = z11;
            }
            return arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n0.this.new f(this.f133570c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133568a;
            final boolean zK = true;
            int i11 = 3 & 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                v1 v1Var = v1.f229769a;
                androidx.lifecycle.c1 c1VarL = n0.this.l();
                final jc.e eVar = this.f133570c;
                v1Var.A(c1VarL, new Function1() { // from class: com.planner5d.library.activity.fragment.feed.o0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return n0.f.n(eVar, (List) obj2);
                    }
                });
                com.planner5d.library.model.manager.p pVar = n0.this.f133538d;
                String strL = this.f133570c.l();
                this.f133568a = 1;
                obj = pVar.b(strL, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            com.planner5d.library.model.manager.favorite.a.b bVar = (com.planner5d.library.model.manager.favorite.a.b) obj;
            int i12 = bVar == null ? -1 : a.f133571a[bVar.ordinal()];
            if (i12 == -1) {
                zK = this.f133570c.k();
            } else if (i12 != 1 && i12 != 2) {
                if (i12 != 3 && i12 != 4) {
                    throw new kotlin.k0();
                }
                zK = false;
            }
            v1 v1Var2 = v1.f229769a;
            androidx.lifecycle.c1 c1VarL2 = n0.this.l();
            final jc.e eVar2 = this.f133570c;
            v1Var2.A(c1VarL2, new Function1() { // from class: com.planner5d.library.activity.fragment.feed.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return n0.f.s(eVar2, zK, (List) obj2);
                }
            });
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public n0(@NotNull com.planner5d.library.modules.user.user.w userAuthorization, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.model.manager.contest.g contestManager, @NotNull com.planner5d.library.model.manager.p favoriteManager, @NotNull com.planner5d.library.feed.usecase.a getDesignOfTheDayData, @NotNull com.planner5d.library.model.manager.w featureConfigManager, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers, @NotNull kotlinx.coroutines.s0 viewModelScope) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(getDesignOfTheDayData, "getDesignOfTheDayData");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        this.f133535a = userAuthorization;
        this.f133536b = projectManager;
        this.f133537c = contestManager;
        this.f133538d = favoriteManager;
        this.f133539e = getDesignOfTheDayData;
        this.f133540f = featureConfigManager;
        this.f133541g = coroutineDispatchers;
        this.f133542h = viewModelScope;
        this.f133543i = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.feed.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n0.k();
            }
        });
        Map<hc.a.EnumC1914a, hc.a> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        hc.a.EnumC1914a[] enumC1914aArr = {hc.a.EnumC1914a.ProjectList, hc.a.EnumC1914a.DesignGeneratorLabel, hc.a.EnumC1914a.DesignGeneratorItem, hc.a.EnumC1914a.DesignBattleLabel, hc.a.EnumC1914a.DesignBattleItem, hc.a.EnumC1914a.DesignOfDay, hc.a.EnumC1914a.Inspiration, hc.a.EnumC1914a.ForYourHome, hc.a.EnumC1914a.Tips, hc.a.EnumC1914a.Videos};
        for (int i10 = 0; i10 < 10; i10++) {
            mapSynchronizedMap.put(enumC1914aArr[i10], null);
        }
        this.f133544j = mapSynchronizedMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(boolean z10, kotlin.coroutines.d<? super hc.a> dVar) {
        return kotlinx.coroutines.i.h(this.f133541g.h(), new b(z10, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.c1 k() {
        return new androidx.lifecycle.c1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.lifecycle.c1<List<jc.e>> l() {
        return (androidx.lifecycle.c1) this.f133543i.getValue();
    }

    private final Object m(boolean z10, boolean z11, Contest contest, hc.a aVar, Function2<? super Contest, ? super kotlin.coroutines.d<? super hc.a>, ? extends Object> function2, kotlin.coroutines.d<? super hc.a> dVar) {
        if (!z10) {
            return null;
        }
        if (!z11) {
            return aVar;
        }
        if (contest != null) {
            return (hc.a) function2.invoke(contest, dVar);
        }
        return null;
    }

    private final hc.a n(boolean z10) {
        if (!this.f133540f.a(com.planner5d.library.model.manager.config.f.DesignOfTheDay)) {
            return null;
        }
        if (z10) {
            kotlinx.coroutines.k.f(this.f133542h, null, null, new c(null), 3, null);
        }
        return new hc.a(hc.a.EnumC1914a.DesignOfDay, l());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0124  */
    /* JADX WARN: Code duplicated, block: B:33:0x0126  */
    /* JADX WARN: Code duplicated, block: B:72:0x0216  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0140 -> B:73:0x0218). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0196 -> B:49:0x0199). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01a6 -> B:73:0x0218). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01aa -> B:73:0x0218). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01b8 -> B:73:0x0218). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01c2 -> B:73:0x0218). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01c8 -> B:73:0x0218). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object o(boolean r19, boolean r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.List<hc.a>> r21) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.feed.n0.o(boolean, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    public final void p(@NotNull jc.e targetItem) {
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        kotlinx.coroutines.k.f(this.f133542h, null, null, new f(targetItem, null), 3, null);
    }
}
