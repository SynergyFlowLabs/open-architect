package com.planner5d.library.activity.fragment.dialog.onboarding;

import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.statistics.events.v3;
import com.planner5d.library.model.manager.w;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.services.utility.v1;
import io.intercom.android.sdk.models.carousel.ActionType;
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
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f132202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p f132203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v3 f132204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v1.b f132205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c1<Integer> f132206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final w0<Integer> f132207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final w0<Integer> f132208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<l> f132209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<l> f132210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<l> f132211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<l> f132212k;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.onboarding.OnboardingDialogViewModel$nextStep$1", f = "OnboardingDialogViewModel.kt", i = {}, l = {androidx.media2.widget.f.i.f59775g0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132213a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132213a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f132213a = 1;
                if (d1.b(250L, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (j.this.p0() < 3) {
                j.this.f132206e.r(kotlin.coroutines.jvm.internal.b.f(j.this.p0() + 1));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.onboarding.OnboardingDialogViewModel$onFinish$1", f = "OnboardingDialogViewModel.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132215a;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.onboarding.OnboardingDialogViewModel$onFinish$1$1", f = "OnboardingDialogViewModel.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nOnboardingDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnboardingDialogViewModel.kt\ncom/planner5d/library/activity/fragment/dialog/onboarding/OnboardingDialogViewModel$onFinish$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,196:1\n1#2:197\n1485#3:198\n1510#3,3:199\n1513#3,3:209\n1557#3:216\n1628#3,3:217\n381#4,7:202\n126#5:212\n153#5,3:213\n*S KotlinDebug\n*F\n+ 1 OnboardingDialogViewModel.kt\ncom/planner5d/library/activity/fragment/dialog/onboarding/OnboardingDialogViewModel$onFinish$1$1\n*L\n180#1:198\n180#1:199,3\n180#1:209,3\n182#1:216\n182#1:217,3\n180#1:202,7\n181#1:212\n181#1:213,3\n*E\n"})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f132217a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f132218b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f132218b = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f132218b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object next;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f132217a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Iterator it = this.f132218b.f132209h.iterator();
                    do {
                        obj2 = null;
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((l) next).i());
                    l lVar = (l) next;
                    if (lVar != null) {
                        j jVar = this.f132218b;
                        jVar.f132204c.a(jVar.f132209h.indexOf(lVar) + 1, lVar.g());
                    }
                    this.f132218b.o0(5);
                    for (Object obj3 : this.f132218b.f132211j) {
                        if (((l) obj3).i()) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    l lVar2 = (l) obj2;
                    if (lVar2 != null) {
                        j jVar2 = this.f132218b;
                        jVar2.f132204c.s(jVar2.f132211j.indexOf(lVar2) + 1, lVar2.g());
                    }
                    this.f132218b.o0(6);
                    v3 v3Var = this.f132218b.f132204c;
                    List list = this.f132218b.f132212k;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj4 : list) {
                        String strG = ((l) obj4).g();
                        Object arrayList = linkedHashMap.get(strG);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(strG, arrayList);
                        }
                        ((List) arrayList).add(obj4);
                    }
                    ArrayList<Pair> arrayList2 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        Object key = entry.getKey();
                        Iterator it2 = ((Iterable) entry.getValue()).iterator();
                        long j10 = 0;
                        while (it2.hasNext()) {
                            j10 += ((l) it2.next()).i() ? 1L : 0L;
                        }
                        arrayList2.add(TuplesKt.to(key, kotlin.coroutines.jvm.internal.b.g(j10)));
                    }
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    for (Pair pair : arrayList2) {
                        arrayList3.add(new Pair<>(pair.getFirst(), kotlin.coroutines.jvm.internal.b.f((int) Math.min(((Number) pair.getSecond()).longValue(), 1L))));
                    }
                    v3Var.N(arrayList3);
                    p pVar = this.f132218b.f132203b;
                    r rVar = r.onboardingClosed;
                    this.f132217a = 1;
                    if (pVar.L(rVar, true, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                this.f132218b.o0(7);
                this.f132218b.f132204c.h1();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132215a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarW = s.f229729a.d();
                a aVar = new a(j.this, null);
                this.f132215a = 1;
                if (kotlinx.coroutines.i.h(z1VarW, aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            j.this.f132205d.u();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public j(@NotNull w featureConfigManager, @NotNull p preferences, @NotNull v3 statisticsEventOnboarding) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(statisticsEventOnboarding, "statisticsEventOnboarding");
        this.f132202a = featureConfigManager;
        this.f132203b = preferences;
        this.f132204c = statisticsEventOnboarding;
        v1.b bVarK = v1.f229769a.k();
        this.f132205d = bVarK;
        c1<Integer> c1Var = new c1<>(Integer.valueOf(c0()));
        this.f132206e = c1Var;
        this.f132207f = bVarK;
        this.f132208g = c1Var;
        o0(c0());
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f132209h = CollectionsKt.shuffled(CollectionsKt.listOf((Object[]) new l[]{new l(Integer.valueOf(pc.b.r.lr), pc.b.g.G8, "design_dream_home", false, 8, null), new l(Integer.valueOf(pc.b.r.mr), pc.b.g.C8, "home_building_renovation", false, 8, null), new l(Integer.valueOf(pc.b.r.nr), pc.b.g.B8, "study_interior_design", false, 8, null), new l(Integer.valueOf(pc.b.r.or), pc.b.g.H8, "for_clients", false, 8, defaultConstructorMarker)}));
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        this.f132210i = CollectionsKt.shuffled(CollectionsKt.listOf((Object[]) new l[]{new l(Integer.valueOf(pc.b.r.cr), pc.b.g.N7, FirebaseAnalytics.c.f120629o, false, 8, null), new l(Integer.valueOf(pc.b.r.dr), pc.b.g.f343087za, "youtube", false, 8, null), new l(Integer.valueOf(pc.b.r.er), pc.b.g.H9, "school", false, 8, null), new l(Integer.valueOf(pc.b.r.fr), pc.b.g.f342680ba, "tiktok", false, 8, defaultConstructorMarker), new l(Integer.valueOf(pc.b.r.gr), pc.b.g.f342678b8, "ig_fb", false, 8, null), new l(Integer.valueOf(pc.b.r.hr), pc.b.g.V8, "podcast", false, 8, null), new l(Integer.valueOf(pc.b.r.ir), pc.b.g.K7, com.facebook.internal.w0.f100168g1, false, 8, null), new l(Integer.valueOf(pc.b.r.jr), pc.b.g.P7, "find_in_store", false, 8, defaultConstructorMarker2)}));
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        this.f132211j = CollectionsKt.shuffled(CollectionsKt.listOf((Object[]) new l[]{new l(Integer.valueOf(pc.b.r.qr), pc.b.g.A8, "apartment", false, 8, null), new l(Integer.valueOf(pc.b.r.rr), pc.b.g.D8, "house", false, 8, null), new l(Integer.valueOf(pc.b.r.sr), pc.b.g.E8, "office", false, 8, null), new l(Integer.valueOf(pc.b.r.tr), pc.b.g.F8, ItemWall.FIELD_MATERIAL_OUTDOOR, false, 8, defaultConstructorMarker3)}));
        this.f132212k = CollectionsKt.listOf((Object[]) new l[]{new l(null, pc.b.g.Rd, "style_scandinavian", false, 8, null), new l(null, pc.b.g.Vd, "style_scandinavian", false, 8, null), new l(null, pc.b.g.Xd, "style_country", false, 8, null), new l(null, pc.b.g.Wd, "style_eclectic", false, 8, defaultConstructorMarker3), new l(null, pc.b.g.Zd, "style_modern", false, 8, null), new l(null, pc.b.g.Yd, "style_eclectic", false, 8, null), new l(null, pc.b.g.f342684be, "style_classic", false, 8, null), new l(null, pc.b.g.f342667ae, "style_eclectic", false, 8, defaultConstructorMarker2), new l(null, pc.b.g.Sd, "style_modern", false, 8, null), new l(null, pc.b.g.f342701ce, "style_industrial", false, 8, null), new l(null, pc.b.g.Ud, "style_boho", false, 8, null), new l(null, pc.b.g.Td, "style_minimalist", false, 8, null)});
    }

    private final int c0() {
        return !this.f132202a.a(com.planner5d.library.model.manager.config.f.OnboardingHowFind) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int p0() {
        Integer numF = this.f132206e.f();
        return numF != null ? numF.intValue() : c0();
    }

    @NotNull
    public final w0<Integer> d0() {
        return this.f132207f;
    }

    @NotNull
    public final List<l> f0(int i10) {
        if (i10 == 0) {
            return this.f132210i;
        }
        if (i10 != 1) {
            return i10 != 2 ? this.f132212k : this.f132211j;
        }
        return this.f132209h;
    }

    @NotNull
    public final w0<Integer> g0() {
        return this.f132208g;
    }

    public final int h0(int i10) {
        if (i10 == 0) {
            return pc.b.r.kr;
        }
        if (i10 != 1) {
            return i10 != 2 ? pc.b.r.vr : pc.b.r.ur;
        }
        return pc.b.r.pr;
    }

    public final boolean i0() {
        Integer numF = this.f132206e.f();
        return (numF != null ? numF.intValue() : 0) > c0();
    }

    public final void j0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    public final void k0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(null), 3, null);
    }

    public final void l0() {
        if (p0() > c0()) {
            this.f132206e.r(Integer.valueOf(p0() - 1));
        }
    }

    public final void m0() {
        this.f132204c.y0(ActionType.SKIP);
    }

    public final void n0(int i10) {
        this.f132204c.y0(this.f132210i.get(i10).g());
    }

    public final void o0(int i10) {
        this.f132204c.L(i10);
    }
}
