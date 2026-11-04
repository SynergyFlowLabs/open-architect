package com.planner5d.library.activity.fragment.gallery;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.d1;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.CheckableBottomSheetMenuFragment;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.e1;
import com.planner5d.library.services.utility.n3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.services.utility.u2;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.widget.EnhancedRecyclerView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class GalleryPage extends FragmentController implements com.planner5d.library.activity.fragment.gallery.a, l.a, com.planner5d.library.activity.helper.ui.a, o0 {
    static final int H1 = -1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final long f133684p2 = 1;
    private WeakReference<o0> Y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.q0 f133685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    protected y0 f133686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.builtin.i f133687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.application.d f133688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.activity.fragment.gallery.c f133689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ij.a
    protected b2 f133690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ij.a
    protected m f133691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.favorite.a f133692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @ij.a
    protected c2 f133693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @ij.a
    protected le.o f133694n;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Subscription f133701w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected l f133695o = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f133698s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f133699t = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    private final n3<com.planner5d.library.services.network.b> f133700v = com.planner5d.library.services.network.f.a(this);
    private final com.planner5d.library.widget.preloader.t X = new com.planner5d.library.widget.preloader.t();
    private final Map<com.planner5d.library.model.manager.q0.c, com.planner5d.library.services.r> Z = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final com.planner5d.library.model.manager.statistics.b<b4.c> f133696p0 = new com.planner5d.library.model.manager.statistics.b<>(b4.c.gallery);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final n3<x> f133697p1 = t3.e(this, x.class);

    class a extends HashMap<com.planner5d.library.model.manager.q0.c, com.planner5d.library.services.r> {
        a() {
            put(com.planner5d.library.model.manager.q0.c.projects, com.planner5d.library.services.r.floorPlansList);
            put(com.planner5d.library.model.manager.q0.c.ideas, com.planner5d.library.services.r.snapshotsList);
            put(com.planner5d.library.model.manager.q0.c.favorites, com.planner5d.library.services.r.favoritesList);
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            GalleryPage.this.Q(false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(@NonNull RecyclerView recyclerView, int i10, int i11) {
            if (!recyclerView.canScrollVertically(1)) {
                recyclerView.post(new Runnable() { // from class: com.planner5d.library.activity.fragment.gallery.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f133904a.d();
                    }
                });
            }
        }
    }

    class c extends com.planner5d.library.services.rx.e<com.planner5d.library.model.k[]> {
        c() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            if (ErrorMessageException.isWithCode(th2, com.planner5d.library.f.s.I9)) {
                GalleryPage.this.f133690j.h();
                GalleryPage.this.S();
            } else {
                GalleryPage.this.f133690j.i(th2);
            }
            onCompleted();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(com.planner5d.library.model.k[] kVarArr) {
            if (kVarArr.length == 0) {
                GalleryPage.this.f133699t = false;
                if (GalleryPage.this.f133695o.K().f197680a == null) {
                    GalleryPage.this.f133695o.D(kVarArr);
                    return;
                }
                return;
            }
            GalleryPage.this.f133699t = true;
            if (GalleryPage.this.f133695o.K().f197680a == null) {
                GalleryPage.this.f133695o.D(kVarArr);
            } else {
                GalleryPage.this.f133695o.l(kVarArr);
            }
            GalleryPage.this.f133695o.P(new com.planner5d.library.model.manager.q0.d(kVarArr[kVarArr.length - 1].b().f180740b, GalleryPage.this.f133695o.K()));
            GalleryPage galleryPage = GalleryPage.this;
            galleryPage.f133691k.b(galleryPage.L(), GalleryPage.this.f133695o);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            GalleryPage galleryPage = GalleryPage.this;
            galleryPage.f133698s = false;
            galleryPage.X.a().b();
            GalleryPage.this.T();
        }
    }

    class d extends com.planner5d.library.services.rx.e<le.o.a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.k f133705d;

        d(com.planner5d.library.model.k kVar) {
            this.f133705d = kVar;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(le.o.a aVar) {
            com.planner5d.library.model.k kVar;
            o0 o0VarK = GalleryPage.this.K();
            if (o0VarK == null) {
                return;
            }
            int i10 = e.f133708b[aVar.b().ordinal()];
            if (i10 == 1) {
                kVar = new com.planner5d.library.model.k(aVar.a(), Boolean.TRUE);
            } else if (i10 == 2) {
                kVar = new com.planner5d.library.model.k(aVar.a(), Boolean.FALSE);
            } else {
                if (i10 != 3) {
                    throw new IncompatibleClassChangeError();
                }
                kVar = this.f133705d;
            }
            o0VarK.onFavoriteUpdated(kVar);
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f133707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f133708b;

        static {
            int[] iArr = new int[le.o.a.EnumC2327a.values().length];
            f133708b = iArr;
            int i10 = 5 >> 1;
            try {
                iArr[le.o.a.EnumC2327a.LIKE_ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133708b[le.o.a.EnumC2327a.LIKE_REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133708b[le.o.a.EnumC2327a.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.planner5d.library.activity.fragment.gallery.a.EnumC1468a.values().length];
            f133707a = iArr2;
            try {
                iArr2[com.planner5d.library.activity.fragment.gallery.a.EnumC1468a.CATEGORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f133707a[com.planner5d.library.activity.fragment.gallery.a.EnumC1468a.SORTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public GalleryPage() {
        com.planner5d.library.application.b.r().y2(this);
        this.f133689i.b(this);
    }

    @androidx.annotation.l0
    private void I() {
        Subscription subscription = this.f133701w;
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.p0
    public o0 K() {
        WeakReference<o0> weakReference = this.Y;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit N() {
        this.f133690j.f();
        Q(false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(Long l10) {
        com.planner5d.library.model.manager.q0.d dVarK = this.f133695o.K();
        V(new com.planner5d.library.model.manager.q0.d(L(), dVarK.f197681b, dVarK.f197680a, l10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit P(ue.b bVar) {
        applyFiltering(com.planner5d.library.activity.fragment.gallery.a.EnumC1468a.CATEGORY, ((Integer) ((Pair) bVar).first).toString());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        if (e1.f225196a.d(this)) {
            this.f133700v.a().f(new Function0() { // from class: com.planner5d.library.activity.fragment.gallery.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f133902a.N();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        if (this.f133693m.d(getActivity())) {
            this.f133701w = Observable.timer(1L, TimeUnit.MINUTES).observeOn(com.planner5d.library.services.rx.c.f224934d).doOnCompleted(new Action0() { // from class: com.planner5d.library.activity.fragment.gallery.t
                @Override // rx.functions.Action0
                public final void call() {
                    this.f133903a.R();
                }
            }).subscribe((Subscriber<? super Long>) new com.planner5d.library.services.rx.e());
        } else {
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        View view = getView();
        if (view == null) {
            return;
        }
        View viewFindViewById = view.findViewById(com.planner5d.library.f.j.Yk);
        View viewFindViewById2 = view.findViewById(com.planner5d.library.f.j.Wk);
        if (viewFindViewById instanceof TextView) {
            int i10 = (this.f133695o.u().size() > 0 || this.f133698s) ? 8 : 0;
            viewFindViewById.setVisibility(i10);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(i10);
            }
        }
    }

    private void U(String str) {
        this.f133697p1.a().b0(str);
    }

    private void V(com.planner5d.library.model.manager.q0.d dVar) {
        if (dVar.equals(this.f133695o.K())) {
            return;
        }
        this.f133695o.P(new com.planner5d.library.model.manager.q0.d((String) null, dVar));
        this.f133695o.D(new com.planner5d.library.model.k[0]);
        Q(true);
    }

    private void W(String str) {
        if (getActivity() != null && str != null && !str.isEmpty()) {
            com.planner5d.library.model.manager.q0.d dVarK = this.f133695o.K();
            V(new com.planner5d.library.model.manager.q0.d(L(), this.f133685e.x(Integer.valueOf(str).intValue()), dVarK.f197680a, dVarK.f197683d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(@NonNull x.a aVar) {
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        new CheckableBottomSheetMenuFragment(supportFragmentManager, getString(com.planner5d.library.f.s.DB), aVar.a(), aVar.b(), new Function1() { // from class: com.planner5d.library.activity.fragment.gallery.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f133901a.P((ue.b) obj);
            }
        }).showMenu(supportFragmentManager, null);
    }

    protected int J() {
        return com.planner5d.library.f.m.N1;
    }

    protected abstract com.planner5d.library.model.manager.q0.c L();

    protected boolean M() {
        return true;
    }

    @androidx.annotation.l0
    protected void Q(boolean z10) {
        I();
        if (z10) {
            this.f133699t = true;
        }
        if (!this.f133698s && this.f133699t) {
            if (!this.f133693m.d(getActivity())) {
                this.f133690j.h();
                this.X.a().b();
                T();
                R();
                return;
            }
            this.f133698s = true;
            T();
            this.X.a().l(Integer.valueOf(com.planner5d.library.widget.preloader.h0.f258546c));
            this.X.a().p(getString(com.planner5d.library.f.s.on), false);
            this.f133685e.u(this.f133695o.K()).subscribe((Subscriber<? super com.planner5d.library.model.k[]>) new c());
        }
    }

    @Override // com.planner5d.library.activity.fragment.gallery.a
    public void applyFiltering(@NonNull com.planner5d.library.activity.fragment.gallery.a.EnumC1468a enumC1468a, @androidx.annotation.p0 String str) {
        int i10 = e.f133707a[enumC1468a.ordinal()];
        if (i10 == 1) {
            U(str);
        } else {
            if (i10 != 2) {
                return;
            }
            W(str);
        }
    }

    @Override // com.planner5d.library.activity.fragment.gallery.l.a
    @androidx.annotation.p0
    public String getCategoryTitle() {
        com.planner5d.library.model.manager.q0.d dVarK = this.f133695o.K();
        Long l10 = dVarK != null ? dVarK.f197683d : null;
        if (l10 == null) {
            return getString(com.planner5d.library.f.s.D1);
        }
        return l10.longValue() == 777 ? getString(com.planner5d.library.f.s.Ub) : this.f133687g.d0(l10.longValue()).f222848b;
    }

    @Override // com.planner5d.library.activity.fragment.gallery.a
    @NonNull
    public com.planner5d.library.model.manager.q0.d getListFilter() {
        return this.f133695o.K();
    }

    @Override // com.planner5d.library.activity.fragment.gallery.l.a
    @androidx.annotation.p0
    public String getSortOrderTitle() {
        com.planner5d.library.model.manager.q0.d dVarK = this.f133695o.K();
        if (dVarK != null) {
            return this.f133685e.z(requireContext())[this.f133685e.y(dVarK.f197681b)];
        }
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    public com.planner5d.library.activity.helper.ui.d getUiState(Context context) {
        return new com.planner5d.library.activity.helper.ui.d.b(context, this).w(true).x();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    public void onActivityCreatedExtended(Bundle bundle) {
        Q(false);
    }

    @Override // com.planner5d.library.activity.fragment.gallery.l.a
    public void onCategorySelectorClick() {
        this.f133697p1.a().c0(getListFilter());
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    public View onCreateViewExtended(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.planner5d.library.model.manager.q0.d dVar;
        View viewInflate = layoutInflater.inflate(J(), viewGroup, false);
        this.X.b(viewInflate);
        EnhancedRecyclerView enhancedRecyclerView = (EnhancedRecyclerView) viewInflate.findViewById(com.planner5d.library.f.j.f168332qg);
        com.planner5d.library.widget.x.i(enhancedRecyclerView, requireContext(), Integer.valueOf(com.planner5d.library.f.g.f167420zh), Integer.valueOf(com.planner5d.library.f.g.f167420zh), Integer.valueOf(com.planner5d.library.f.g.f167420zh));
        enhancedRecyclerView.r(new b());
        m.a aVarA = this.f133691k.a(L());
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.filter;
        if (jVar.a(rVar)) {
            dVar = new com.planner5d.library.model.manager.q0.d(jVar.h(rVar, null));
        } else if (aVarA == null) {
            dVar = new com.planner5d.library.model.manager.q0.d(L(), L().equals(com.planner5d.library.model.manager.q0.c.favorites) ? 777L : this.f133688h.m());
        } else {
            dVar = aVarA.f133804a;
        }
        com.planner5d.library.model.manager.q0.d dVar2 = dVar;
        this.f133696p0.b(bundle, getArguments());
        l lVar = new l(enhancedRecyclerView, this.f133686f, new com.planner5d.library.services.bitmaploader.target.h.a().a(this), dVar2, this, M(), (b4.c) this.f133696p0.a());
        this.f133695o = lVar;
        if (aVarA != null) {
            lVar.C(aVarA.f133805b);
        }
        this.f133691k.b(L(), this.f133695o);
        enhancedRecyclerView.setAdapter(this.f133695o);
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.scrollPosition;
        if (jVar.a(rVar2)) {
            enhancedRecyclerView.d2(new u2(jVar.h(rVar2, null)));
        }
        v1.r(this.f133697p1.a().a0(), getViewLifecycleOwner(), new d1() { // from class: com.planner5d.library.activity.fragment.gallery.p
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f133819a.X((x.a) obj);
            }
        });
        this.f133697p1.a().Y().k(getViewLifecycleOwner(), new d1() { // from class: com.planner5d.library.activity.fragment.gallery.q
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f133897a.O((Long) obj);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        I();
    }

    @Override // com.planner5d.library.activity.fragment.gallery.o0
    public void onFavoriteUpdated(@NonNull com.planner5d.library.model.k kVar) {
        this.f133691k.c(kVar);
        l lVar = this.f133695o;
        if (lVar != null) {
            lVar.Q(kVar);
        }
    }

    @Override // com.planner5d.library.activity.fragment.gallery.l.a
    public void onGalleryItemClick(@NonNull com.planner5d.library.model.h hVar, b4.c cVar) {
        View view = getView();
        EnhancedRecyclerView enhancedRecyclerView = view != null ? (EnhancedRecyclerView) view.findViewById(com.planner5d.library.f.j.f168332qg) : null;
        Bundle contentBundleWithScrollPosition = enhancedRecyclerView != null ? enhancedRecyclerView.getContentBundleWithScrollPosition() : null;
        com.planner5d.library.services.r rVar = this.Z.get(L());
        com.planner5d.library.activity.fragment.x xVar = this.f131538b;
        com.planner5d.library.activity.helper.event.content.d dVar = new com.planner5d.library.activity.helper.event.content.d(hVar, getListFilter(), hVar, cVar);
        com.planner5d.library.services.utility.i iVarT = new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, rVar);
        if (rVar == null) {
            rVar = com.planner5d.library.services.r.floorPlansList;
        }
        xVar.e(dVar.k(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) Gallery.class, iVarT.h(rVar, contentBundleWithScrollPosition).a())));
    }

    @Override // com.planner5d.library.activity.fragment.gallery.l.a
    public void onGalleryItemFavoriteClick(@NonNull com.planner5d.library.model.k kVar) {
        o0 o0VarK = K();
        if (o0VarK != null) {
            o0VarK.onFavoriteUpdated(new com.planner5d.library.model.k(kVar.b(), null));
        }
        com.planner5d.library.model.h hVarB = kVar.b();
        le.o oVar = this.f133694n;
        Objects.requireNonNull(oVar);
        com.planner5d.library.services.utility.c0.y(hVarB, new o(oVar)).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber) new d(kVar));
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        this.f133696p0.c(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.planner5d.library.activity.fragment.gallery.l.a
    public void onSortOrderSelectorClick() {
        this.f133689i.c(requireActivity());
    }

    public void setOnFavoriteUpdated(o0 o0Var) {
        this.Y = new WeakReference<>(o0Var);
    }
}
