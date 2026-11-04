package com.planner5d.library.widget.editor.catalog.drawer;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.w;
import com.planner5d.library.activity.helper.l0;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.l2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCatalogDrawerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogDrawerViewModel.kt\ncom/planner5d/library/widget/editor/catalog/drawer/CatalogDrawerViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1#2:262\n774#3:263\n865#3,2:264\n*S KotlinDebug\n*F\n+ 1 CatalogDrawerViewModel.kt\ncom/planner5d/library/widget/editor/catalog/drawer/CatalogDrawerViewModel\n*L\n225#1:263\n225#1:264,2\n*E\n"})
public final class r {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final b f254500u = new b(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f254501v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f254502w = 105;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.d f254503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.catalog.g f254504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final le.h f254505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f254506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.unlockeditems.b f254507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final t0 f254508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final l0 f254509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f254510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final k0<Boolean> f254511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Boolean> f254512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final k0<Boolean> f254513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Boolean> f254514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final k0<List<CatalogCategory>> f254515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<List<CatalogCategory>> f254516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final k0<a> f254517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<a> f254518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final k0<c> f254519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<c> f254520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final s0 f254521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final l2 f254522t;

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c {

        @w0(parameters = 1)
        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f254530a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f254531b = 0;

            private a() {
            }
        }

        @oj.g
        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f254532a;

            private /* synthetic */ b(int i10) {
                this.f254532a = i10;
            }

            public static final /* synthetic */ b a(int i10) {
                return new b(i10);
            }

            public static int b(int i10) {
                return i10;
            }

            public static boolean c(int i10, Object obj) {
                if ((obj instanceof b) && i10 == ((b) obj).h()) {
                    return true;
                }
                return false;
            }

            public static final boolean d(int i10, int i11) {
                return i10 == i11;
            }

            public static int f(int i10) {
                return Integer.hashCode(i10);
            }

            public static String g(int i10) {
                return "Showing(secondsLeft=" + i10 + ")";
            }

            public final int e() {
                return this.f254532a;
            }

            public boolean equals(Object obj) {
                return c(this.f254532a, obj);
            }

            public final /* synthetic */ int h() {
                return this.f254532a;
            }

            public int hashCode() {
                return f(this.f254532a);
            }

            public String toString() {
                return g(this.f254532a);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel$loadCategory$4", f = "CatalogDrawerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super CatalogCategory>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f254533a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f254535c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f254535c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new d(this.f254535c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f254533a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            CatalogCategory catalogCategoryA = r.this.f254503a.a(this.f254535c);
            if (catalogCategoryA != null) {
                return r.this.f254504b.n(catalogCategoryA);
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super CatalogCategory> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel", f = "CatalogDrawerViewModel.kt", i = {}, l = {211, 210}, m = "loadCategoryItemsData", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f254536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f254537b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f254539d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f254537b = obj;
            this.f254539d |= Integer.MIN_VALUE;
            return r.this.D(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel$loadCategoryItemsData$2", f = "CatalogDrawerViewModel.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<?>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f254540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f254541b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CatalogCategory f254543d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CatalogCategory catalogCategory, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f254543d = catalogCategory;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new f(this.f254543d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f254541b;
            if (i10 == 0) {
                ResultKt.m(obj);
                r rVar2 = r.this;
                com.planner5d.library.widget.editor.catalog.g gVar = rVar2.f254504b;
                CatalogCategory catalogCategory = this.f254543d;
                this.f254540a = rVar2;
                this.f254541b = 1;
                Object objR = gVar.r(catalogCategory, this);
                if (objR == objL) {
                    return objL;
                }
                obj = objR;
                rVar = rVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (r) this.f254540a;
                ResultKt.m(obj);
            }
            return rVar.N((List) obj);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<?>> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel$loadParentOrPreviousCategory$2", f = "CatalogDrawerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super CatalogCategory>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f254544a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CatalogCategory f254546c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(CatalogCategory catalogCategory, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f254546c = catalogCategory;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new g(this.f254546c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f254544a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return r.this.f254503a.i(this.f254546c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super CatalogCategory> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel", f = "CatalogDrawerViewModel.kt", i = {}, l = {150}, m = "loadRootCategories", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f254547a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f254549c;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f254547a = obj;
            this.f254549c |= Integer.MIN_VALUE;
            return r.this.F(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel$loadRootCategories$2", f = "CatalogDrawerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<CatalogCategory>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f254550a;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new i(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f254550a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            List<CatalogCategory> listB = r.this.f254503a.b(null);
            if (r.this.f254506d.a(com.planner5d.library.model.manager.config.f.CatalogSearch)) {
                listB.add(new CatalogCategory(new k3(com.planner5d.library.f.s.H2, new Object[0]), null, 105, -1L, -1L));
            }
            return listB;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<CatalogCategory>> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel$loadRootCategoryId$2", f = "CatalogDrawerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f254552a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CatalogCategory f254554c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(CatalogCategory catalogCategory, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f254554c = catalogCategory;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new j(this.f254554c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f254552a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            CatalogCategory catalogCategoryH = r.this.f254503a.h(this.f254554c, 0);
            if (catalogCategoryH != null) {
                return kotlin.coroutines.jvm.internal.b.g(catalogCategoryH.getId());
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel$refreshTrialState$1", f = "CatalogDrawerViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f254555a;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f254555a;
            if (i10 == 0) {
                ResultKt.m(obj);
                r rVar = r.this;
                this.f254555a = 1;
                if (rVar.I(this) == objL) {
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
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel", f = "CatalogDrawerViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.S1}, m = "refreshTrialState", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f254557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f254558b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f254560d;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f254558b = obj;
            this.f254560d |= Integer.MIN_VALUE;
            return r.this.I(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel$reloadCatalog$1", f = "CatalogDrawerViewModel.kt", i = {}, l = {85, 89}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f254561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f254562b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f254564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Long f254565e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Long l10, Long l11, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f254564d = l10;
            this.f254565e = l11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new m(this.f254564d, this.f254565e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            m mVar;
            k0 k0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f254562b;
            if (i10 == 0) {
                ResultKt.m(obj);
                r.this.f254511i.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                r rVar = r.this;
                this.f254562b = 1;
                obj = rVar.F(this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k0Var = (k0) this.f254561a;
                ResultKt.m(obj);
                mVar = this;
            }
            k0Var.setValue(obj);
            r.this.f254513k.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
            List list = (List) obj;
            r.this.f254515m.setValue(list);
            r.this.f254511i.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            r.this.f254513k.setValue(kotlin.coroutines.jvm.internal.b.a(true));
            k0 k0Var2 = r.this.f254517o;
            r rVar2 = r.this;
            CatalogCategory catalogCategory = (CatalogCategory) CollectionsKt.firstOrNull(list);
            if (catalogCategory == null) {
                throw new IllegalStateException("At least one root category must be present");
            }
            long id2 = catalogCategory.getId();
            Long l10 = this.f254564d;
            Long l11 = this.f254565e;
            this.f254561a = k0Var2;
            this.f254562b = 2;
            mVar = this;
            obj = rVar2.M(id2, l10, l11, mVar);
            if (obj != objL) {
                k0Var = k0Var2;
                k0Var.setValue(obj);
                r.this.f254513k.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                return Unit.f312394a;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel", f = "CatalogDrawerViewModel.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2}, l = {187, 189, 189}, m = "reloadSelection", n = {"this", "forceCategoryId", "currentSelection", "previousCategoryId", "targetCategoryId", "this", "forceCategoryId", "currentSelection", "previousCategoryId", "targetCategory", "forceCategoryId", "currentSelection", "previousCategoryId"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2"})
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f254566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f254567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f254568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f254569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f254570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f254571f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f254572g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f254573h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f254575j;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f254573h = obj;
            this.f254575j |= Integer.MIN_VALUE;
            return r.this.M(0L, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel$selectCategory$1", f = "CatalogDrawerViewModel.kt", i = {1, 2}, l = {108, 114, 114, 115}, m = "invokeSuspend", n = {"loadedCategory", "loadedCategory"}, s = {"L$0", "L$0"})
    static final class o extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f254576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f254577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f254578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f254579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f254580e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f254582g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(long j10, kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
            this.f254582g = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new o(this.f254582g, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:36:0x0103  */
        /* JADX WARN: Code duplicated, block: B:39:0x010f  */
        /* JADX WARN: Code duplicated, block: B:41:0x011a  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CatalogCategory catalogCategory;
            k0 k0Var;
            CatalogCategory catalogCategory2;
            wc.a aVar;
            Object objG;
            wc.a aVar2;
            CatalogCategory catalogCategory3;
            Long l10;
            Object objE;
            Long l11;
            k0 k0Var2;
            CatalogCategory catalogCategory4;
            Long lG;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f254580e;
            if (i10 == 0) {
                ResultKt.m(obj);
                r.this.f254513k.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                r rVar = r.this;
                long j10 = this.f254582g;
                this.f254580e = 1;
                obj = rVar.C(j10, this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
            } else {
                if (i10 == 2) {
                    catalogCategory = (CatalogCategory) this.f254578c;
                    k0Var = (k0) this.f254577b;
                    catalogCategory2 = (CatalogCategory) this.f254576a;
                    ResultKt.m(obj);
                    aVar = (wc.a) obj;
                    r rVar2 = r.this;
                    this.f254576a = catalogCategory2;
                    this.f254577b = k0Var;
                    this.f254578c = catalogCategory;
                    this.f254579d = aVar;
                    this.f254580e = 3;
                    objG = rVar2.G(catalogCategory2, this);
                    if (objG != objL) {
                        CatalogCategory catalogCategory5 = catalogCategory;
                        aVar2 = aVar;
                        obj = objG;
                        catalogCategory3 = catalogCategory5;
                        l10 = (Long) obj;
                        r rVar3 = r.this;
                        this.f254576a = k0Var;
                        this.f254577b = catalogCategory3;
                        this.f254578c = aVar2;
                        this.f254579d = l10;
                        this.f254580e = 4;
                        objE = rVar3.E(catalogCategory2, this);
                        if (objE != objL) {
                            l11 = l10;
                            obj = objE;
                            k0Var2 = k0Var;
                        }
                    }
                    return objL;
                }
                if (i10 == 3) {
                    aVar2 = (wc.a) this.f254579d;
                    catalogCategory3 = (CatalogCategory) this.f254578c;
                    k0Var = (k0) this.f254577b;
                    catalogCategory2 = (CatalogCategory) this.f254576a;
                    ResultKt.m(obj);
                    l10 = (Long) obj;
                    r rVar4 = r.this;
                    this.f254576a = k0Var;
                    this.f254577b = catalogCategory3;
                    this.f254578c = aVar2;
                    this.f254579d = l10;
                    this.f254580e = 4;
                    objE = rVar4.E(catalogCategory2, this);
                    if (objE != objL) {
                        l11 = l10;
                        obj = objE;
                        k0Var2 = k0Var;
                    }
                    return objL;
                }
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Long l12 = (Long) this.f254579d;
                aVar2 = (wc.a) this.f254578c;
                CatalogCategory catalogCategory6 = (CatalogCategory) this.f254577b;
                k0 k0Var3 = (k0) this.f254576a;
                ResultKt.m(obj);
                l11 = l12;
                k0Var2 = k0Var3;
                catalogCategory3 = catalogCategory6;
            }
            wc.a aVar3 = aVar2;
            catalogCategory4 = (CatalogCategory) obj;
            if (catalogCategory4 != null) {
                lG = kotlin.coroutines.jvm.internal.b.g(catalogCategory4.getId());
            } else {
                lG = null;
            }
            k0Var2.setValue(new a(catalogCategory3, aVar3, l11, lG, false, false, 48, null));
            r.this.f254513k.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
            catalogCategory = (CatalogCategory) obj;
            if (catalogCategory == null) {
                r.this.f254513k.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                return Unit.f312394a;
            }
            k0 k0Var4 = r.this.f254517o;
            r rVar5 = r.this;
            this.f254576a = catalogCategory;
            this.f254577b = k0Var4;
            this.f254578c = catalogCategory;
            this.f254580e = 2;
            Object objD = rVar5.D(catalogCategory, this);
            if (objD != objL) {
                k0Var = k0Var4;
                obj = objD;
                catalogCategory2 = catalogCategory;
                aVar = (wc.a) obj;
                r rVar6 = r.this;
                this.f254576a = catalogCategory2;
                this.f254577b = k0Var;
                this.f254578c = catalogCategory;
                this.f254579d = aVar;
                this.f254580e = 3;
                objG = rVar6.G(catalogCategory2, this);
                if (objG != objL) {
                    CatalogCategory catalogCategory7 = catalogCategory;
                    aVar2 = aVar;
                    obj = objG;
                    catalogCategory3 = catalogCategory7;
                    l10 = (Long) obj;
                    r rVar7 = r.this;
                    this.f254576a = k0Var;
                    this.f254577b = catalogCategory3;
                    this.f254578c = aVar2;
                    this.f254579d = l10;
                    this.f254580e = 4;
                    objE = rVar7.E(catalogCategory2, this);
                    if (objE != objL) {
                        l11 = l10;
                        obj = objE;
                        k0Var2 = k0Var;
                        wc.a aVar4 = aVar2;
                        catalogCategory4 = (CatalogCategory) obj;
                        if (catalogCategory4 != null) {
                            lG = kotlin.coroutines.jvm.internal.b.g(catalogCategory4.getId());
                        } else {
                            lG = null;
                        }
                        k0Var2.setValue(new a(catalogCategory3, aVar4, l11, lG, false, false, 48, null));
                        r.this.f254513k.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                        return Unit.f312394a;
                    }
                }
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawerViewModel$updateTrialStatus$1", f = "CatalogDrawerViewModel.kt", i = {}, l = {135, 136}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f254583a;

        p(kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new p(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r7.I(r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f254583a
                r5 = 7
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L14
                r5 = 5
                kotlin.ResultKt.m(r7)
                goto L53
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 7
                throw r6
            L1d:
                kotlin.ResultKt.m(r7)
                goto L46
            L21:
                kotlin.ResultKt.m(r7)
                com.planner5d.library.widget.editor.catalog.drawer.r r7 = com.planner5d.library.widget.editor.catalog.drawer.r.this
                com.planner5d.library.model.manager.unlockeditems.b r7 = com.planner5d.library.widget.editor.catalog.drawer.r.h(r7)
                com.planner5d.library.widget.editor.catalog.drawer.r r1 = com.planner5d.library.widget.editor.catalog.drawer.r.this
                com.planner5d.library.modules.user.user.t r1 = com.planner5d.library.widget.editor.catalog.drawer.r.i(r1)
                r5 = 4
                id.a r1 = r1.a()
                com.planner5d.library.widget.editor.catalog.drawer.r r4 = com.planner5d.library.widget.editor.catalog.drawer.r.this
                r5 = 7
                com.planner5d.library.modules.user.user.t0 r4 = com.planner5d.library.widget.editor.catalog.drawer.r.j(r4)
                r5 = 6
                r6.f254583a = r3
                java.lang.Object r7 = r7.m(r1, r4, r6)
                if (r7 != r0) goto L46
                goto L52
            L46:
                r5 = 7
                com.planner5d.library.widget.editor.catalog.drawer.r r7 = com.planner5d.library.widget.editor.catalog.drawer.r.this
                r5 = 2
                r6.f254583a = r2
                java.lang.Object r6 = com.planner5d.library.widget.editor.catalog.drawer.r.p(r7, r6)
                if (r6 != r0) goto L53
            L52:
                return r0
            L53:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.catalog.drawer.r.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public r(@NotNull com.planner5d.library.model.manager.d catalogCategoryManager, @NotNull com.planner5d.library.widget.editor.catalog.g catalogLoader, @NotNull le.h prepareCatalogItemsDataUseCase, @NotNull com.planner5d.library.model.manager.config.j configuration, @NotNull com.planner5d.library.model.manager.unlockeditems.b trialUnlockManager, @NotNull t0 userPurchases, @NotNull l0 helperPayment, @NotNull com.planner5d.library.modules.user.user.t userAuthorization) {
        Intrinsics.checkNotNullParameter(catalogCategoryManager, "catalogCategoryManager");
        Intrinsics.checkNotNullParameter(catalogLoader, "catalogLoader");
        Intrinsics.checkNotNullParameter(prepareCatalogItemsDataUseCase, "prepareCatalogItemsDataUseCase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(trialUnlockManager, "trialUnlockManager");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(helperPayment, "helperPayment");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f254503a = catalogCategoryManager;
        this.f254504b = catalogLoader;
        this.f254505c = prepareCatalogItemsDataUseCase;
        this.f254506d = configuration;
        this.f254507e = trialUnlockManager;
        this.f254508f = userPurchases;
        this.f254509g = helperPayment;
        this.f254510h = userAuthorization;
        Boolean bool = Boolean.FALSE;
        k0<Boolean> k0VarA = b1.a(bool);
        this.f254511i = k0VarA;
        this.f254512j = w.g(k0VarA, null, 0L, 3, null);
        k0<Boolean> k0VarA2 = b1.a(bool);
        this.f254513k = k0VarA2;
        this.f254514l = w.g(k0VarA2, null, 0L, 3, null);
        k0<List<CatalogCategory>> k0VarA3 = b1.a(null);
        this.f254515m = k0VarA3;
        this.f254516n = w.g(kotlinx.coroutines.flow.k.v0(k0VarA3), null, 0L, 3, null);
        k0<a> k0VarA4 = b1.a(null);
        this.f254517o = k0VarA4;
        this.f254518p = w.g(kotlinx.coroutines.flow.k.v0(k0VarA4), null, 0L, 3, null);
        k0<c> k0VarA5 = b1.a(c.a.f254530a);
        this.f254519q = k0VarA5;
        this.f254520r = w.g(k0VarA5, null, 0L, 3, null);
        s0 s0VarA = kotlinx.coroutines.t0.a(q3.c(null, 1, null).plus(com.planner5d.library.services.utility.s.f229729a.a()));
        this.f254521s = s0VarA;
        this.f254522t = new l2(s0VarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(long j10, kotlin.coroutines.d<? super CatalogCategory> dVar) {
        Object next;
        List<CatalogCategory> value = this.f254515m.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((CatalogCategory) next).getId() != j10);
            CatalogCategory catalogCategory = (CatalogCategory) next;
            if (catalogCategory != null) {
                return catalogCategory;
            }
        }
        return kotlinx.coroutines.i.h(v(), new d(j10, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r14 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(com.planner5d.library.model.item.catalog.CatalogCategory r13, kotlin.coroutines.d<? super wc.a> r14) throws java.lang.RuntimeException {
        /*
            r12 = this;
            r11 = 2
            boolean r0 = r14 instanceof com.planner5d.library.widget.editor.catalog.drawer.r.e
            if (r0 == 0) goto L17
            r0 = r14
            r11 = 7
            com.planner5d.library.widget.editor.catalog.drawer.r$e r0 = (com.planner5d.library.widget.editor.catalog.drawer.r.e) r0
            r11 = 4
            int r1 = r0.f254539d
            r11 = 4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f254539d = r1
            goto L1d
        L17:
            com.planner5d.library.widget.editor.catalog.drawer.r$e r0 = new com.planner5d.library.widget.editor.catalog.drawer.r$e
            r11 = 3
            r0.<init>(r14)
        L1d:
            java.lang.Object r14 = r0.f254537b
            r11 = 0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f254539d
            r3 = 2
            r4 = 1
            r11 = 3
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L34
            kotlin.ResultKt.m(r14)
            goto L84
        L34:
            r11 = 7
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r11 = 0
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r11 = 3
            r12.<init>(r13)
            throw r12
        L3f:
            java.lang.Object r12 = r0.f254536a
            le.h r12 = (le.h) r12
            kotlin.ResultKt.m(r14)
            goto L74
        L47:
            kotlin.ResultKt.m(r14)
            long r6 = r13.getId()
            r8 = -1
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r11 = 2
            if (r14 != 0) goto L56
            return r5
        L56:
            r11 = 0
            le.h r14 = r12.f254505c
            r11 = 6
            kotlinx.coroutines.n0 r2 = r12.v()
            r11 = 7
            com.planner5d.library.widget.editor.catalog.drawer.r$f r6 = new com.planner5d.library.widget.editor.catalog.drawer.r$f
            r11 = 2
            r6.<init>(r13, r5)
            r0.f254536a = r14
            r0.f254539d = r4
            java.lang.Object r12 = kotlinx.coroutines.i.h(r2, r6, r0)
            if (r12 != r1) goto L71
            r11 = 5
            goto L82
        L71:
            r10 = r14
            r14 = r12
            r12 = r10
        L74:
            r11 = 3
            java.util.List r14 = (java.util.List) r14
            r0.f254536a = r5
            r0.f254539d = r3
            r13 = 0
            java.lang.Object r14 = r12.a(r14, r13, r0)
            if (r14 != r1) goto L84
        L82:
            r11 = 0
            return r1
        L84:
            wc.a r14 = (wc.a) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.catalog.drawer.r.D(com.planner5d.library.model.item.catalog.CatalogCategory, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(CatalogCategory catalogCategory, kotlin.coroutines.d<? super CatalogCategory> dVar) {
        if (catalogCategory.getId() != -1) {
            return kotlinx.coroutines.i.h(v(), new g(catalogCategory, null), dVar);
        }
        a value = this.f254517o.getValue();
        if (value != null) {
            return value.a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object F(kotlin.coroutines.d<? super List<CatalogCategory>> dVar) {
        h hVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f254549c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f254549c = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object objH = hVar.f254547a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar.f254549c;
        if (i11 == 0) {
            ResultKt.m(objH);
            n0 n0VarV = v();
            i iVar = new i(null);
            hVar.f254549c = 1;
            objH = kotlinx.coroutines.i.h(n0VarV, iVar, hVar);
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
    public final Object G(CatalogCategory catalogCategory, kotlin.coroutines.d<? super Long> dVar) {
        return catalogCategory.getId() == -1 ? kotlin.coroutines.jvm.internal.b.g(catalogCategory.getId()) : kotlinx.coroutines.i.h(v(), new j(catalogCategory, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object I(kotlin.coroutines.d<? super Unit> dVar) {
        l lVar;
        k0<c> k0Var;
        c cVar;
        k0<c> k0Var2;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i10 = lVar.f254560d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f254560d = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar);
            }
        } else {
            lVar = new l(dVar);
        }
        Object obj = lVar.f254558b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = lVar.f254560d;
        if (i11 == 0) {
            ResultKt.m(obj);
            k0Var = this.f254519q;
            if (this.f254507e.a()) {
                com.planner5d.library.model.manager.unlockeditems.b bVar = this.f254507e;
                lVar.f254557a = k0Var;
                lVar.f254560d = 1;
                Object objJ = bVar.j(lVar);
                if (objJ == objL) {
                    return objL;
                }
                obj = objJ;
                k0Var2 = k0Var;
            } else {
                cVar = c.a.f254530a;
            }
            k0Var.setValue(cVar);
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k0Var2 = (k0) lVar.f254557a;
        ResultKt.m(obj);
        c.b bVarA = c.b.a(c.b.b(((Number) obj).intValue()));
        k0Var = k0Var2;
        cVar = bVarA;
        k0Var.setValue(cVar);
        return Unit.f312394a;
    }

    public static /* synthetic */ void L(r rVar, Long l10, Long l11, int i10, Object obj) throws RuntimeException {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        if ((i10 & 2) != 0) {
            l11 = null;
        }
        rVar.K(l10, l11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:45:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object M(long j10, Long l10, Long l11, kotlin.coroutines.d<? super a> dVar) throws RuntimeException {
        n nVar;
        a value;
        long id2;
        Long lE;
        Long l12;
        r rVar;
        Long l13;
        long j11;
        CatalogCategory catalogCategory;
        Object objD;
        CatalogCategory catalogCategory2;
        a aVar;
        Long l14;
        r rVar2;
        wc.a aVar2;
        Long l15;
        a aVar3;
        Long l16;
        boolean z10;
        boolean z11;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.f254575j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f254575j = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        Object objG = nVar.f254573h;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = nVar.f254575j;
        if (i11 == 0) {
            ResultKt.m(objG);
            value = this.f254517o.getValue();
            if (l10 != null) {
                id2 = l10.longValue();
                lE = l11;
            } else if (value != null) {
                id2 = value.a().getId();
                lE = value.e();
            } else {
                id2 = j10;
                lE = null;
            }
            nVar.f254566a = this;
            nVar.f254567b = l10;
            nVar.f254568c = value;
            nVar.f254569d = lE;
            nVar.f254572g = id2;
            nVar.f254575j = 1;
            Object objC = C(id2, nVar);
            if (objC != objL) {
                l12 = lE;
                objG = objC;
                long j12 = id2;
                rVar = this;
                l13 = l10;
                j11 = j12;
            }
            return objL;
        }
        if (i11 == 1) {
            j11 = nVar.f254572g;
            l12 = (Long) nVar.f254569d;
            value = (a) nVar.f254568c;
            l13 = (Long) nVar.f254567b;
            rVar = (r) nVar.f254566a;
            ResultKt.m(objG);
        } else {
            if (i11 == 2) {
                CatalogCategory catalogCategory3 = (CatalogCategory) nVar.f254571f;
                CatalogCategory catalogCategory4 = (CatalogCategory) nVar.f254570e;
                l12 = (Long) nVar.f254569d;
                aVar = (a) nVar.f254568c;
                l14 = (Long) nVar.f254567b;
                rVar2 = (r) nVar.f254566a;
                ResultKt.m(objG);
                catalogCategory2 = catalogCategory3;
                objD = objG;
                catalogCategory = catalogCategory4;
                aVar2 = (wc.a) objD;
                nVar.f254566a = l14;
                nVar.f254567b = aVar;
                nVar.f254568c = l12;
                nVar.f254569d = catalogCategory2;
                nVar.f254570e = aVar2;
                nVar.f254571f = null;
                nVar.f254575j = 3;
                objG = rVar2.G(catalogCategory, nVar);
                if (objG != objL) {
                    l15 = l12;
                    aVar3 = aVar;
                    l16 = l14;
                }
                return objL;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (wc.a) nVar.f254570e;
            catalogCategory2 = (CatalogCategory) nVar.f254569d;
            Long l17 = (Long) nVar.f254568c;
            aVar3 = (a) nVar.f254567b;
            l16 = (Long) nVar.f254566a;
            ResultKt.m(objG);
            l15 = l17;
        }
        wc.a aVar4 = aVar2;
        CatalogCategory catalogCategory5 = catalogCategory2;
        Long l18 = (Long) objG;
        if (aVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (l16 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new a(catalogCategory5, aVar4, l18, l15, z10, z11);
        catalogCategory = (CatalogCategory) objG;
        if (catalogCategory == null) {
            throw new IllegalStateException("No category found for ID = " + j11);
        }
        nVar.f254566a = rVar;
        nVar.f254567b = l13;
        nVar.f254568c = value;
        nVar.f254569d = l12;
        nVar.f254570e = catalogCategory;
        nVar.f254571f = catalogCategory;
        nVar.f254575j = 2;
        objD = rVar.D(catalogCategory, nVar);
        if (objD != objL) {
            catalogCategory2 = catalogCategory;
            aVar = value;
            l14 = l13;
            rVar2 = rVar;
            aVar2 = (wc.a) objD;
            nVar.f254566a = l14;
            nVar.f254567b = aVar;
            nVar.f254568c = l12;
            nVar.f254569d = catalogCategory2;
            nVar.f254570e = aVar2;
            nVar.f254571f = null;
            nVar.f254575j = 3;
            objG = rVar2.G(catalogCategory, nVar);
            if (objG != objL) {
                l15 = l12;
                aVar3 = aVar;
                l16 = l14;
                wc.a aVar5 = aVar2;
                CatalogCategory catalogCategory6 = catalogCategory2;
                Long l19 = (Long) objG;
                if (aVar3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (l16 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return new a(catalogCategory6, aVar5, l19, l15, z10, z11);
            }
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final List<?> N(List<?> list) {
        if (this.f254506d.a(com.planner5d.library.model.manager.config.f.SmartWizard)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof CatalogItem) {
                String id2 = ((CatalogItem) obj).f180761id;
                Intrinsics.checkNotNullExpressionValue(id2, "id");
                if (!StringsKt.V2(id2, com.planner5d.library.activity.fragment.smartwizard.w.f135875b, false, 2, null)) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    private final n0 v() {
        return com.planner5d.library.services.utility.s.f229729a.h();
    }

    private static Object w(r rVar) {
        return j1.t(new c1(com.planner5d.library.services.utility.s.f229729a, com.planner5d.library.services.utility.s.class, "DispatcherBackground", "getDispatcherBackground()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", 0));
    }

    @NotNull
    public final androidx.lifecycle.w0<c> A() {
        return this.f254520r;
    }

    public final void B(boolean z10, @Nullable Long l10) throws RuntimeException {
        this.f254504b.v(z10);
        this.f254504b.u(l10);
        this.f254503a.p(l10);
        L(this, null, null, 3, null);
    }

    public final void H() {
        kotlinx.coroutines.t0.f(this.f254521s, null, 1, null);
    }

    public final void J(boolean z10) {
        if (z10) {
            kotlinx.coroutines.k.f(this.f254521s, null, null, new k(null), 3, null);
        } else {
            this.f254519q.setValue(c.a.f254530a);
        }
    }

    public final void K(@Nullable Long l10, @Nullable Long l11) throws RuntimeException {
        l2.e(this.f254522t, null, null, new m(l10, l11, null), 3, null);
    }

    public final void O(@NotNull CatalogItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f254509g.A(y3.c.locked_item, item.f180761id, t3.d.on_locked_item_click);
    }

    public final void P(long j10) throws RuntimeException {
        l2.e(this.f254522t, null, null, new o(j10, null), 3, null);
    }

    public final void Q(@NotNull CatalogCategory category) throws RuntimeException {
        Intrinsics.checkNotNullParameter(category, "category");
        P(category.getId());
    }

    public final void R() throws RuntimeException {
        Long lE;
        a value = this.f254517o.getValue();
        if (value == null || (lE = value.e()) == null) {
            return;
        }
        P(lE.longValue());
    }

    public final void S() {
        kotlinx.coroutines.k.f(this.f254521s, null, null, new p(null), 3, null);
    }

    public final void s() {
        this.f254519q.setValue(c.a.f254530a);
        this.f254507e.f();
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> t() {
        return this.f254514l;
    }

    public final void u(@NotNull CatalogCategory category, @NotNull com.planner5d.library.services.bitmaploader.target.a target) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f254503a.c(category.getIcon(), target);
    }

    @NotNull
    public final androidx.lifecycle.w0<List<CatalogCategory>> x() {
        return this.f254516n;
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> y() {
        return this.f254512j;
    }

    @NotNull
    public final androidx.lifecycle.w0<a> z() {
        return this.f254518p;
    }

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f254523g = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final CatalogCategory f254524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final wc.a f254525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Long f254526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final Long f254527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f254528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f254529f;

        public a(@NotNull CatalogCategory category, @Nullable wc.a aVar, @Nullable Long l10, @Nullable Long l11, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(category, "category");
            this.f254524a = category;
            this.f254525b = aVar;
            this.f254526c = l10;
            this.f254527d = l11;
            this.f254528e = z10;
            this.f254529f = z11;
        }

        @NotNull
        public final CatalogCategory a() {
            return this.f254524a;
        }

        public final boolean b() {
            return this.f254529f;
        }

        public final boolean c() {
            return this.f254528e;
        }

        @Nullable
        public final wc.a d() {
            return this.f254525b;
        }

        @Nullable
        public final Long e() {
            return this.f254527d;
        }

        @Nullable
        public final Long f() {
            return this.f254526c;
        }

        public /* synthetic */ a(CatalogCategory catalogCategory, wc.a aVar, Long l10, Long l11, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(catalogCategory, aVar, l10, l11, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
        }
    }
}
