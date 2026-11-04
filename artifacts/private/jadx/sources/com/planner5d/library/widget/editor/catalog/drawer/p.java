package com.planner5d.library.widget.editor.catalog.drawer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u1;
import androidx.lifecycle.c0;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.planner5d.library.activity.fragment.dialog.iteminfo.ItemInfo;
import com.planner5d.library.databinding.l3;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.manager.statistics.events.l2;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.u2;
import com.planner5d.library.services.utility.w;
import com.planner5d.library.widget.ViewPagerCompat;
import com.planner5d.library.widget.editor.catalog.UnlockCountdownBannerView;
import com.planner5d.library.widget.editor.catalog.v;
import com.planner5d.library.widget.editor.helper.a2;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.s2;
import com.planner5d.library.widget.preloader.PreloaderSimpleV2View;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.k0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCatalogDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogDrawer.kt\ncom/planner5d/library/widget/editor/catalog/drawer/CatalogDrawer\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Rect.kt\nandroidx/core/graphics/RectKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,530:1\n504#1,3:539\n508#1,3:545\n504#1,7:548\n504#1,7:565\n278#2,2:531\n327#2,4:534\n257#2,2:555\n257#2,2:557\n257#2,2:559\n257#2,2:562\n257#2,2:572\n257#2,2:574\n257#2,2:576\n257#2,2:578\n1#3:533\n271#4:538\n1872#5,3:542\n1863#5:561\n1864#5:564\n*S KotlinDebug\n*F\n+ 1 CatalogDrawer.kt\ncom/planner5d/library/widget/editor/catalog/drawer/CatalogDrawer\n*L\n377#1:539,3\n377#1:545,3\n406#1:548,7\n452#1:565,7\n146#1:531,2\n213#1:534,4\n433#1:555,2\n435#1:557,2\n436#1:559,2\n441#1:562,2\n282#1:572,2\n328#1:574,2\n362#1:576,2\n368#1:578,2\n224#1:538\n379#1:542,3\n440#1:561\n440#1:564\n*E\n"})
public final class p extends FrameLayout {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final long f254463h3 = -1;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final long f254464i3 = 13;

    @NotNull
    private final f0 H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    public a2 f254466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    public ia.b f254467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k f254468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    public v.c f254469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    public r f254470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    public w f254471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g1 f254472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private q f254473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private v f254474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final l3 f254475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final TabLayout f254476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final ViewPagerCompat f254477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final AdvancedBottomSheetBehavior<View> f254478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f254479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private b f254480o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final g f254481p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.catalog.adapter.a.b f254482p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f254483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final o0 f254484t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.ui.c f254485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f254486w;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    public static final a f254465p2 = new a(null);

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f254462g3 = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Long f254487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Long f254488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f254489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final u2 f254490d;

        public b(@Nullable Long l10, @Nullable Long l11, int i10, @NotNull u2 scrollPosition) {
            Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
            this.f254487a = l10;
            this.f254488b = l11;
            this.f254489c = i10;
            this.f254490d = scrollPosition;
        }

        public final int a() {
            return this.f254489c;
        }

        @Nullable
        public final Long b() {
            return this.f254488b;
        }

        @NotNull
        public final u2 c() {
            return this.f254490d;
        }

        @Nullable
        public final Long d() {
            return this.f254487a;
        }
    }

    public static final class c extends AdvancedBottomSheetBehavior.e {
        c() {
        }

        @Override // com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior.e
        public void b(View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior.e
        public void c(View bottomSheet, int i10) {
            v vVar;
            v vVar2;
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if ((i10 == 6 || i10 == 4 || i10 == 7) && (vVar = p.this.f254474i) != null && vVar.x() && (vVar2 = p.this.f254474i) != null) {
                com.planner5d.library.services.s.f(vVar2.f254680b.getSearchInput(), false);
            }
        }
    }

    public static final class d implements View.OnGenericMotionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f254492a = new Rect();

        d() {
        }

        @Override // android.view.View.OnGenericMotionListener
        public boolean onGenericMotion(View view, MotionEvent motionEvent) {
            if (motionEvent == null || motionEvent.getAction() != 8) {
                return false;
            }
            p.this.f254475j.f159284b.getGlobalVisibleRect(this.f254492a);
            return this.f254492a.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
    }

    public static final class e extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ TabLayout.i f254494h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p f254495i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f254496j;

        e(TabLayout.i iVar, p pVar, int i10) {
            this.f254494h = iVar;
            this.f254495i = pVar;
            this.f254496j = i10;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            TabLayout.i iVar = this.f254494h;
            com.planner5d.library.widget.drawable.c cVar = com.planner5d.library.widget.drawable.c.f254258a;
            Resources resources = this.f254495i.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            int i10 = this.f254496j;
            iVar.x(cVar.i(cVar.e(resources, bitmap, i10, i10), null));
        }
    }

    public static final class f implements o0 {
        f() {
        }

        @Override // androidx.lifecycle.o0
        public c0 getLifecycle() {
            return p.this.f254485v;
        }
    }

    public static final class g implements TabLayout.f {
        g() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.i tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            p.this.getViewModel().P(p.this.y(tab));
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.i tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            a(tab);
        }
    }

    static final class h implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f254499a;

        h(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f254499a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f254499a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f254499a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public p(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void A() {
        AdvancedBottomSheetBehavior<View> advancedBottomSheetBehavior = this.f254478m;
        advancedBottomSheetBehavior.X0(getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167420zh));
        advancedBottomSheetBehavior.L0(getResources().getDimensionPixelSize(com.planner5d.library.f.g.f166901c1));
        advancedBottomSheetBehavior.Q0(true);
        ViewPagerCompat viewPagerCompat = this.f254477l;
        View editorCatalogAnchor = this.f254475j.f159288f;
        Intrinsics.checkNotNullExpressionValue(editorCatalogAnchor, "editorCatalogAnchor");
        advancedBottomSheetBehavior.W(new com.planner5d.library.bottomsheet.b(viewPagerCompat, editorCatalogAnchor));
        advancedBottomSheetBehavior.W(new c());
    }

    private final void B() {
        ViewPagerCompat viewPagerCompat = this.f254477l;
        viewPagerCompat.c(new TabLayout.m(this.f254476k));
        viewPagerCompat.setAdapter(getViewPagerAdapter());
        getViewModel().z().k(this.f254484t, new h(new Function1() { // from class: com.planner5d.library.widget.editor.catalog.drawer.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.C(this.f254447a, (r.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(p pVar, r.a aVar) {
        p pVar2;
        boolean z10 = true;
        pVar.f254483s = aVar.e() != null;
        boolean Z = pVar.Z();
        TabLayout tabLayout = pVar.f254476k;
        if (!Z && pVar.f254483s) {
            z10 = false;
        }
        tabLayout.setVisibility(z10 ? 0 : 8);
        pVar.Y();
        pVar.a0(Z, pVar.f254483s, aVar.a());
        if (Z || aVar.d() == null) {
            pVar2 = pVar;
        } else {
            pVar2 = pVar;
            pVar2.W(aVar.f(), aVar.a(), aVar.d(), aVar.b(), pVar.f254480o);
        }
        pVar2.V(aVar.b(), aVar.c(), Z, pVar2.f254480o);
        if (!aVar.c() && aVar.a().getId() != -1) {
            g1 g1Var = pVar2.f254472g;
            if (g1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helperEditor");
                g1Var = null;
            }
            s2 s2Var = g1Var.B3;
            CatalogCategory catalogCategoryA = aVar.a();
            g1 g1Var2 = pVar2.f254472g;
            if (g1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helperEditor");
                g1Var2 = null;
            }
            s2Var.d(catalogCategoryA, g1Var2.m1());
        }
        if (aVar.b()) {
            pVar2.f254480o = null;
        }
        return Unit.f312394a;
    }

    private final void D() {
        this.f254475j.f159287e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.catalog.drawer.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.E(this.f254446a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(p pVar, View view) {
        if (pVar.f254478m.getState() == 7) {
            pVar.v();
        }
    }

    private final void F() {
        setOnGenericMotionListener(new d());
    }

    private final void G() {
        LinearProgressIndicator linearProgressIndicator = this.f254475j.f159289g;
        linearProgressIndicator.setIndicatorColor(0, 0, linearProgressIndicator.getContext().getColor(com.planner5d.library.f.C1549f.Mh));
        linearProgressIndicator.setIndeterminateAnimationType(0);
        linearProgressIndicator.j();
        getViewModel().y().k(this.f254484t, new h(new Function1() { // from class: com.planner5d.library.widget.editor.catalog.drawer.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.H(this.f254456a, (Boolean) obj);
            }
        }));
        getViewModel().t().k(this.f254484t, new h(new Function1() { // from class: com.planner5d.library.widget.editor.catalog.drawer.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.I(this.f254457a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(p pVar, Boolean bool) {
        PreloaderSimpleV2View editorCatalogTabsPreloader = pVar.f254475j.f159292j;
        Intrinsics.checkNotNullExpressionValue(editorCatalogTabsPreloader, "editorCatalogTabsPreloader");
        editorCatalogTabsPreloader.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(p pVar, Boolean bool) {
        LinearProgressIndicator linearProgressIndicator = pVar.f254475j.f159289g;
        if (bool.booleanValue()) {
            linearProgressIndicator.q();
        } else {
            linearProgressIndicator.j();
        }
        return Unit.f312394a;
    }

    private final void J() {
        TabLayout tabLayout = this.f254476k;
        tabLayout.h(new TabLayout.o(this.f254477l));
        tabLayout.h(this.f254481p0);
        getViewModel().x().k(this.f254484t, new h(new Function1() { // from class: com.planner5d.library.widget.editor.catalog.drawer.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.K(this.f254458a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(p pVar, List list) {
        pVar.b0();
        Intrinsics.checkNotNull(list);
        pVar.X(list);
        pVar.getViewPagerAdapter().h(list);
        pVar.Y();
        return Unit.f312394a;
    }

    private final void L() {
        this.f254475j.f159293k.setTextColor(androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166273bi));
        ImageView imageView = this.f254475j.f159294l;
        imageView.setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.k(imageView.getContext(), com.planner5d.library.f.h.F6, com.planner5d.library.f.h.N8, Integer.valueOf(androidx.core.content.d.g(imageView.getContext(), com.planner5d.library.f.C1549f.f166403h2))));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.catalog.drawer.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.M(this.f254459a, view);
            }
        });
        this.f254475j.f159295m.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.catalog.drawer.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.N(this.f254460a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(p pVar, View view) {
        pVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(p pVar, View view) {
        if (pVar.f254478m.getState() != 6) {
            int i10 = 1 ^ 3;
            if (pVar.f254478m.getState() != 3) {
                return;
            }
        }
        pVar.v();
    }

    private final void O() {
        final UnlockCountdownBannerView unlockCatalogBanner = this.f254475j.f159296n;
        Intrinsics.checkNotNullExpressionValue(unlockCatalogBanner, "unlockCatalogBanner");
        unlockCatalogBanner.setOnButtonClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.catalog.drawer.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.P(this.f254453a, view);
            }
        });
        getViewModel().A().k(this.f254484t, new h(new Function1() { // from class: com.planner5d.library.widget.editor.catalog.drawer.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.R(unlockCatalogBanner, this, (r.c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(final p pVar, View view) {
        pVar.getPaywallStrategy().b(pVar.getDialogLauncher(), com.planner5d.library.model.manager.config.purchaseplacement.b.a.menu_catalog, y3.c.menu_catalog, null, new Function1() { // from class: com.planner5d.library.widget.editor.catalog.drawer.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.Q(this.f254450a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(p pVar, boolean z10) {
        pVar.getViewModel().S();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(UnlockCountdownBannerView unlockCountdownBannerView, final p pVar, r.c cVar) {
        if (cVar instanceof r.c.b) {
            unlockCountdownBannerView.setVisibility(0);
            unlockCountdownBannerView.startCountdown(((r.c.b) cVar).h(), new Function0() { // from class: com.planner5d.library.widget.editor.catalog.drawer.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.S(this.f254461a);
                }
            });
        } else {
            if (!Intrinsics.areEqual(cVar, r.c.a.f254530a)) {
                throw new k0();
            }
            unlockCountdownBannerView.setVisibility(8);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(p pVar) {
        pVar.getViewModel().s();
        return Unit.f312394a;
    }

    private final void T() {
        int i10 = 3 << 0;
        u1.j2(this.f254475j.f159285c, new ef.g(0, 1, null));
    }

    private final void V(boolean z10, boolean z11, boolean z12, b bVar) {
        if (z10) {
            if (bVar != null) {
                this.f254478m.g(bVar.a());
            }
        } else if (!z11 && ((z12 && (this.f254478m.getState() == 4 || this.f254478m.getState() == 7)) || (!z12 && this.f254478m.getState() == 4))) {
            e0();
        }
    }

    private final void W(Long l10, CatalogCategory catalogCategory, wc.a aVar, boolean z10, b bVar) throws IllegalStateException {
        Integer numZ;
        int currentItem = (l10 == null || (numZ = z(l10.longValue())) == null) ? this.f254477l.getCurrentItem() : numZ.intValue();
        this.f254476k.N(this.f254481p0);
        try {
            this.f254477l.setCurrentItem(currentItem);
            this.f254476k.h(this.f254481p0);
            getViewPagerAdapter().f(currentItem, catalogCategory, aVar, this.f254477l, this.f254482p1);
            if (!z10 || bVar == null) {
                return;
            }
            getViewPagerAdapter().g(this.f254477l, currentItem, bVar.c());
        } catch (Throwable th2) {
            this.f254476k.h(this.f254481p0);
            throw th2;
        }
    }

    private final void X(List<CatalogCategory> list) {
        Drawable drawableA = com.planner5d.library.widget.drawable.h.a(getContext(), com.planner5d.library.widget.drawable.h.b.Small);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.planner5d.library.f.g.Dh);
        this.f254476k.N(this.f254481p0);
        try {
            this.f254476k.L();
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                CatalogCategory catalogCategory = (CatalogCategory) obj;
                TabLayout.i iVarX = this.f254476k.I().y(i10).x(drawableA);
                k3 title = catalogCategory.getTitle();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                TabLayout.i iVarB = iVarX.D(title.i(context)).B(Long.valueOf(catalogCategory.getId()));
                Intrinsics.checkNotNullExpressionValue(iVarB, "setTag(...)");
                this.f254476k.i(iVarB);
                r viewModel = getViewModel();
                com.planner5d.library.services.bitmaploader.target.a aVarC = this.f254486w.c(new e(iVarB, this, dimensionPixelSize));
                Intrinsics.checkNotNullExpressionValue(aVarC, "register(...)");
                viewModel.u(catalogCategory, aVarC);
                i10 = i11;
            }
            this.f254476k.h(this.f254481p0);
        } catch (Throwable th2) {
            this.f254476k.h(this.f254481p0);
            throw th2;
        }
    }

    private final void Y() throws IllegalStateException {
        CatalogCategory catalogCategoryA;
        r.a aVarF = getViewModel().z().f();
        if (aVarF == null || (catalogCategoryA = aVarF.a()) == null) {
            return;
        }
        long id2 = catalogCategoryA.getId();
        int tabCount = this.f254476k.getTabCount();
        for (int i10 = 0; i10 < tabCount; i10++) {
            TabLayout.i iVarD = this.f254476k.D(i10);
            if (iVarD != null && y(iVarD) == id2) {
                this.f254476k.N(this.f254481p0);
                try {
                    iVarD.r();
                    TabLayout tabLayout = this.f254476k;
                    return;
                } finally {
                    this.f254476k.h(this.f254481p0);
                }
            }
        }
    }

    private final boolean Z() {
        CatalogCategory catalogCategoryA;
        r.a aVarF = getViewModel().z().f();
        boolean z10 = false;
        if (aVarF != null && (catalogCategoryA = aVarF.a()) != null && catalogCategoryA.getId() == -1) {
            z10 = true;
        }
        v vVar = this.f254474i;
        if (vVar != null && vVar.x() != z10) {
            vVar.J(z10);
            if (!z10) {
                vVar.C();
            }
        }
        return z10;
    }

    private final void a0(boolean z10, boolean z11, CatalogCategory catalogCategory) {
        if (!z10) {
            TextView textView = this.f254475j.f159293k;
            k3 title = catalogCategory.getTitle();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setText(title.i(context));
            l3 l3Var = this.f254475j;
            int i10 = 3 | 1;
            Iterator it = CollectionsKt.listOf((Object[]) new View[]{l3Var.f159293k, l3Var.f159294l, l3Var.f159295m}).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(z11 ? 0 : 8);
            }
            return;
        }
        l3 l3Var2 = this.f254475j;
        TextView textView2 = l3Var2.f159293k;
        textView2.setText((CharSequence) null);
        Intrinsics.checkNotNull(textView2);
        textView2.setVisibility(8);
        ImageView editorCatalogTitleBack = l3Var2.f159294l;
        Intrinsics.checkNotNullExpressionValue(editorCatalogTitleBack, "editorCatalogTitleBack");
        editorCatalogTitleBack.setVisibility(8);
        ImageView editorCatalogTitleClose = l3Var2.f159295m;
        Intrinsics.checkNotNullExpressionValue(editorCatalogTitleClose, "editorCatalogTitleClose");
        editorCatalogTitleClose.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    private final void b0() {
        boolean z10;
        r viewModel = getViewModel();
        g1 g1Var = this.f254472g;
        g1 g1Var2 = null;
        if (g1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperEditor");
            g1Var = null;
        }
        if (g1Var.N1()) {
            z10 = false;
        } else {
            g1 g1Var3 = this.f254472g;
            if (g1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helperEditor");
            } else {
                g1Var2 = g1Var3;
            }
            if (g1Var2.z1()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        viewModel.J(z10);
    }

    private final com.planner5d.library.widget.editor.catalog.adapter.c getViewPagerAdapter() {
        return (com.planner5d.library.widget.editor.catalog.adapter.c) this.H1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.widget.editor.catalog.adapter.c i0(Context context, final p pVar) {
        return new com.planner5d.library.widget.editor.catalog.adapter.c(context, pVar.getHelperEditorDragItem(), pVar.getCoroutineExecutor(), new Function1() { // from class: com.planner5d.library.widget.editor.catalog.drawer.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.j0(this.f254448a, (FrameLayout) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(final p pVar, FrameLayout container) {
        Intrinsics.checkNotNullParameter(container, "container");
        v.c catalogSearchFactory = pVar.getCatalogSearchFactory();
        com.planner5d.library.services.bitmaploader.target.h hVar = pVar.f254486w;
        com.planner5d.library.widget.editor.catalog.adapter.a.b bVar = pVar.f254482p1;
        g1 g1Var = pVar.f254472g;
        if (g1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperEditor");
            g1Var = null;
        }
        pVar.f254474i = catalogSearchFactory.a(container, hVar, bVar, g1Var.B3, pVar.getHelperEditorDragItem(), new v.d() { // from class: com.planner5d.library.widget.editor.catalog.drawer.e
            @Override // com.planner5d.library.widget.editor.catalog.v.d
            public final void a() {
                p.k0(this.f254449a);
            }
        });
        pVar.Z();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(p pVar) {
        pVar.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(p pVar, com.planner5d.library.widget.editor.catalog.adapter.a.C1723a c1723a, y3.c cVar, boolean z10) {
        CatalogItem catalogItem = c1723a.f254380b;
        if (catalogItem == null) {
            if (c1723a.f254379a != null) {
                pVar.getViewModel().Q(c1723a.f254379a);
            }
        } else {
            if (z10) {
                ItemInfo.show(pVar.getDialogLauncher(), c1723a.f254380b);
                return;
            }
            if (cVar != null) {
                l2.f217094b.u(cVar, null);
                pVar.getViewModel().O(c1723a.f254380b);
            } else {
                q qVar = pVar.f254473h;
                if (qVar != null) {
                    qVar.a(catalogItem);
                }
            }
        }
    }

    private final void w(Function0<Unit> function0) {
        this.f254476k.N(this.f254481p0);
        try {
            function0.invoke();
        } finally {
            h0.d(1);
            this.f254476k.h(this.f254481p0);
            h0.c(1);
        }
    }

    private final void x() {
        if (this.f254478m.getState() != 6 && this.f254478m.getState() != 4) {
            return;
        }
        this.f254478m.g(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(TabLayout.i iVar) throws IllegalStateException {
        Object objM = iVar.m();
        Long l10 = objM instanceof Long ? (Long) objM : null;
        if (l10 != null) {
            return l10.longValue();
        }
        throw new IllegalStateException("No category ID is present for the tab");
    }

    private final Integer z(long j10) throws IllegalStateException {
        int tabCount = this.f254476k.getTabCount();
        for (int i10 = 0; i10 < tabCount; i10++) {
            TabLayout.i iVarD = this.f254476k.D(i10);
            if (iVarD != null && y(iVarD) == j10) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    public final void U(@NotNull g1 helperEditor, boolean z10, @Nullable Long l10, @NotNull q listener) {
        Intrinsics.checkNotNullParameter(helperEditor, "helperEditor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f254472g = helperEditor;
        this.f254473h = listener;
        getViewModel().B(z10, l10);
    }

    public final boolean c0() {
        return this.f254483s;
    }

    public final void d0(int i10) {
        if (i10 != this.f254479n) {
            this.f254479n = i10;
            CoordinatorLayout catalogDrawerCoordinator = this.f254475j.f159285c;
            Intrinsics.checkNotNullExpressionValue(catalogDrawerCoordinator, "catalogDrawerCoordinator");
            ViewGroup.LayoutParams layoutParams = catalogDrawerCoordinator.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.planner5d.library.f.g.f166945e1);
            if (dimensionPixelSize <= 0) {
                dimensionPixelSize = -1;
            }
            layoutParams.width = dimensionPixelSize;
            catalogDrawerCoordinator.setLayoutParams(layoutParams);
            v();
        }
    }

    public final void e0() {
        this.f254478m.g(6);
    }

    public final void f0() {
        this.f254486w.e();
        r.L(getViewModel(), null, null, 3, null);
    }

    public final void g0() {
        getViewModel().P(13L);
        this.f254478m.g(3);
    }

    @NotNull
    public final AdvancedBottomSheetBehavior<View> getBottomSheet() {
        return this.f254478m;
    }

    @NotNull
    public final v.c getCatalogSearchFactory() {
        v.c cVar = this.f254469d;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("catalogSearchFactory");
        return null;
    }

    @NotNull
    public final w getCoroutineExecutor() {
        w wVar = this.f254471f;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineExecutor");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k getDialogLauncher() {
        com.planner5d.library.activity.fragment.dialog.k kVar = this.f254468c;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @kotlin.l(message = "Remove once we have cleaner solution to obtain all editor item action views")
    @NotNull
    public final RectF getDrawerBounds() {
        Rect rect = new Rect();
        this.f254475j.f159284b.getGlobalVisibleRect(rect);
        return new RectF(rect);
    }

    @NotNull
    public final a2 getHelperEditorDragItem() {
        a2 a2Var = this.f254466a;
        if (a2Var != null) {
            return a2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperEditorDragItem");
        return null;
    }

    @NotNull
    public final ia.b getPaywallStrategy() {
        ia.b bVar = this.f254467b;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paywallStrategy");
        return null;
    }

    @NotNull
    public final Bundle getState() {
        CatalogCategory catalogCategoryA;
        r.a aVarF = getViewModel().z().f();
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.state;
        Long lValueOf = (aVarF == null || (catalogCategoryA = aVarF.a()) == null) ? null : Long.valueOf(catalogCategoryA.getId());
        Long lE = aVarF != null ? aVarF.e() : null;
        int iO0 = this.f254478m.o0();
        com.planner5d.library.widget.editor.catalog.adapter.c viewPagerAdapter = getViewPagerAdapter();
        ViewPagerCompat viewPagerCompat = this.f254477l;
        return iVar.t(rVar, new b(lValueOf, lE, iO0, viewPagerAdapter.d(viewPagerCompat, viewPagerCompat.getCurrentItem()))).a();
    }

    @NotNull
    public final r getViewModel() {
        r rVar = this.f254470e;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void h0(boolean z10) {
        getViewModel().J(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f254485v.o(c0.a.ON_START);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f254485v.o(c0.a.ON_DESTROY);
        getViewModel().H();
        this.f254486w.a();
    }

    public final void setCatalogSearchFactory(@NotNull v.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f254469d = cVar;
    }

    public final void setCoroutineExecutor(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.f254471f = wVar;
    }

    public final void setDialogLauncher(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f254468c = kVar;
    }

    public final void setHelperEditorDragItem(@NotNull a2 a2Var) {
        Intrinsics.checkNotNullParameter(a2Var, "<set-?>");
        this.f254466a = a2Var;
    }

    public final void setPaywallStrategy(@NotNull ia.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f254467b = bVar;
    }

    public final void setState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Serializable serializableS = new com.planner5d.library.services.utility.j(bundle).s(com.planner5d.library.services.r.state, null);
        b bVar = serializableS instanceof b ? (b) serializableS : null;
        if (bVar == null) {
            return;
        }
        this.f254480o = bVar;
        if (bVar.d() != null) {
            getViewModel().K(bVar.d(), bVar.b());
        }
    }

    public final void setViewModel(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.f254470e = rVar;
    }

    public final void u() {
        v vVar = this.f254474i;
        if (vVar == null || !vVar.x() || vVar.w()) {
            getViewModel().R();
        } else {
            vVar.r();
        }
    }

    public final void v() {
        this.f254478m.g(4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public p(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ p(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public p(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        l3 l3VarB = l3.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(l3VarB, "inflate(...)");
        this.f254475j = l3VarB;
        com.planner5d.library.widget.TabLayout editorCatalogTabs = l3VarB.f159291i;
        Intrinsics.checkNotNullExpressionValue(editorCatalogTabs, "editorCatalogTabs");
        this.f254476k = editorCatalogTabs;
        ViewPagerCompat editorCatalogContent = l3VarB.f159290h;
        Intrinsics.checkNotNullExpressionValue(editorCatalogContent, "editorCatalogContent");
        this.f254477l = editorCatalogContent;
        AdvancedBottomSheetBehavior<View> advancedBottomSheetBehaviorI0 = AdvancedBottomSheetBehavior.i0(l3VarB.f159284b);
        Intrinsics.checkNotNullExpressionValue(advancedBottomSheetBehaviorI0, "from(...)");
        this.f254478m = advancedBottomSheetBehaviorI0;
        this.f254479n = getResources().getConfiguration().orientation;
        f fVar = new f();
        this.f254484t = fVar;
        this.f254485v = new com.planner5d.library.activity.helper.ui.c(fVar);
        this.f254486w = new com.planner5d.library.services.bitmaploader.target.h();
        this.f254481p0 = new g();
        this.f254482p1 = new com.planner5d.library.widget.editor.catalog.adapter.a.b() { // from class: com.planner5d.library.widget.editor.catalog.drawer.a
            @Override // com.planner5d.library.widget.editor.catalog.adapter.a.b
            public final void a(com.planner5d.library.widget.editor.catalog.adapter.a.C1723a c1723a, y3.c cVar, boolean z10) {
                p.t(this.f254445a, c1723a, cVar, z10);
            }
        };
        this.H1 = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.catalog.drawer.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.i0(context, this);
            }
        });
        setVisibility(4);
        com.planner5d.library.application.b.f142455c.a().h1(this);
        T();
        F();
        A();
        D();
        G();
        L();
        J();
        B();
        O();
    }
}
