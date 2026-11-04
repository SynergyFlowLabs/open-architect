package com.planner5d.library.widget.tab;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.c0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.planner5d.library.widget.AppBarLayout;
import com.planner5d.library.widget.ScalableTabLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTabsAndPagesInflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabsAndPagesInflater.kt\ncom/planner5d/library/widget/tab/TabsAndPagesInflater\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,61:1\n1557#2:62\n1628#2,3:63\n1557#2:66\n1628#2,3:67\n1557#2:78\n1628#2,3:79\n1557#2:82\n1628#2,3:83\n67#3,4:70\n37#3,2:74\n55#3:76\n72#3:77\n*S KotlinDebug\n*F\n+ 1 TabsAndPagesInflater.kt\ncom/planner5d/library/widget/tab/TabsAndPagesInflater\n*L\n31#1:62\n31#1:63,3\n40#1:66\n40#1:67,3\n55#1:78\n55#1:79,3\n56#1:82\n56#1:83,3\n42#1:70,4\n42#1:74,2\n42#1:76\n42#1:77\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f258786f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<Fragment> f258787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Function0<Fragment>> f258788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Integer> f258789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private androidx.viewpager2.adapter.a f258790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Function1<? super Integer, Unit> f258791e;

    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 TabsAndPagesInflater.kt\ncom/planner5d/library/widget/tab/TabsAndPagesInflater\n*L\n1#1,52:1\n70#2:53\n43#3,8:54\n*E\n"})
    public static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TabLayout f258792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPager2 f258793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppBarLayout f258794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f258795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f258796e;

        public a(TabLayout tabLayout, ViewPager2 viewPager2, AppBarLayout appBarLayout, e eVar, f fVar) {
            this.f258792a = tabLayout;
            this.f258793b = viewPager2;
            this.f258794c = appBarLayout;
            this.f258795d = eVar;
            this.f258796e = fVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            new com.google.android.material.tabs.e(this.f258792a, this.f258793b, true, true, this.f258795d.new c()).a();
            if (this.f258794c != null) {
                this.f258793b.o(new com.planner5d.library.widget.toolbar.b(this.f258794c, this.f258795d.new d()));
            }
            Function1 function1 = this.f258795d.f258791e;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(this.f258796e.a()));
            }
        }
    }

    public static final class b extends androidx.viewpager2.adapter.a {
        b(FragmentManager fragmentManager, c0 c0Var) {
            super(fragmentManager, c0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return e.this.f258788b.size();
        }

        @Override // androidx.viewpager2.adapter.a
        public Fragment j(int i10) {
            return (Fragment) ((Function0) e.this.f258788b.get(i10)).invoke();
        }
    }

    static final class c implements com.google.android.material.tabs.e.b {
        c() {
        }

        @Override // com.google.android.material.tabs.e.b
        public final void a(TabLayout.i tab, int i10) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            tab.C(((Number) e.this.f258789c.get(i10)).intValue());
        }
    }

    static final class d<T> implements ij.c {
        d() {
        }

        @Override // ij.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View get() {
            View viewRequireView;
            Fragment fragment = (Fragment) e.this.f258787a.get();
            if (fragment == null || (viewRequireView = fragment.requireView()) == null) {
                return null;
            }
            return viewRequireView.getRootView();
        }
    }

    public e(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f258787a = new WeakReference<>(fragment);
        this.f258788b = new ArrayList();
        this.f258789c = new ArrayList();
    }

    private final void g(f fVar, final ViewPager2 viewPager2, TabLayout tabLayout, AppBarLayout appBarLayout) {
        List<Function0<Fragment>> list = this.f258788b;
        List<f.a> listB = fVar.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((f.a) it.next()).a());
        }
        list.addAll(arrayList);
        Fragment fragment = this.f258787a.get();
        if (fragment == null) {
            return;
        }
        b bVar = new b(fragment.getChildFragmentManager(), fragment.getLifecycle());
        this.f258790d = bVar;
        viewPager2.setAdapter(bVar);
        List<Integer> list2 = this.f258789c;
        List<f.a> listB2 = fVar.b();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB2, 10));
        Iterator<T> it2 = listB2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((f.a) it2.next()).d()));
        }
        list2.addAll(arrayList2);
        this.f258791e = new Function1() { // from class: com.planner5d.library.widget.tab.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.i(viewPager2, ((Integer) obj).intValue());
            }
        };
        if (!tabLayout.isLaidOut() || tabLayout.isLayoutRequested()) {
            tabLayout.addOnLayoutChangeListener(new a(tabLayout, viewPager2, appBarLayout, this, fVar));
            return;
        }
        new com.google.android.material.tabs.e(tabLayout, viewPager2, true, true, new c()).a();
        if (appBarLayout != null) {
            viewPager2.o(new com.planner5d.library.widget.toolbar.b(appBarLayout, new d()));
        }
        Function1 function1 = this.f258791e;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(fVar.a()));
        }
    }

    static /* synthetic */ void h(e eVar, f fVar, ViewPager2 viewPager2, TabLayout tabLayout, AppBarLayout appBarLayout, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            appBarLayout = null;
        }
        eVar.g(fVar, viewPager2, tabLayout, appBarLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(ViewPager2 viewPager2, int i10) {
        viewPager2.t(i10, false);
        return Unit.f312394a;
    }

    public static /* synthetic */ void k(e eVar, f fVar, ViewPager2 viewPager2, ScalableTabLayout scalableTabLayout, AppBarLayout appBarLayout, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        eVar.j(fVar, viewPager2, scalableTabLayout, appBarLayout, z10);
    }

    public final void f(@NotNull f tabsData) {
        Intrinsics.checkNotNullParameter(tabsData, "tabsData");
        int lastIndex = CollectionsKt.getLastIndex(this.f258788b);
        List<Function0<Fragment>> list = this.f258788b;
        List<f.a> listB = tabsData.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((f.a) it.next()).a());
        }
        list.addAll(arrayList);
        List<Integer> list2 = this.f258789c;
        List<f.a> listB2 = tabsData.b();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB2, 10));
        Iterator<T> it2 = listB2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((f.a) it2.next()).d()));
        }
        list2.addAll(arrayList2);
        androidx.viewpager2.adapter.a aVar = this.f258790d;
        if (aVar != null) {
            aVar.notifyItemRangeInserted(lastIndex, tabsData.b().size());
        }
        Function1<? super Integer, Unit> function1 = this.f258791e;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(tabsData.a()));
        }
    }

    public final void j(@NotNull f tabsData, @NotNull ViewPager2 viewPager, @NotNull ScalableTabLayout tabLayout, @NotNull AppBarLayout appBarLayout, boolean z10) {
        Intrinsics.checkNotNullParameter(tabsData, "tabsData");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        if (!z10) {
            appBarLayout = null;
        }
        g(tabsData, viewPager, tabLayout, appBarLayout);
    }
}
