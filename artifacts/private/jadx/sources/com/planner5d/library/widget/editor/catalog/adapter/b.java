package com.planner5d.library.widget.editor.catalog.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import com.planner5d.library.services.utility.u2;
import com.planner5d.library.services.utility.w;
import com.planner5d.library.widget.editor.catalog.RecyclerViewCatalog;
import com.planner5d.library.widget.editor.helper.a2;
import com.planner5d.library.widget.f1;
import com.planner5d.library.widget.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCatalogPagerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogPagerAdapter.kt\ncom/planner5d/library/widget/editor/catalog/adapter/CatalogPagerAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n37#2,2:134\n1#3:136\n*S KotlinDebug\n*F\n+ 1 CatalogPagerAdapter.kt\ncom/planner5d/library/widget/editor/catalog/adapter/CatalogPagerAdapter\n*L\n34#1:134,2\n*E\n"})
public class b extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f254383i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f254384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a2 f254385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w f254386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private CatalogCategory[] f254387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<RecyclerView.h<?>, com.planner5d.library.services.bitmaploader.target.h> f254388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<RecyclerView.h<?>, CatalogCategory> f254389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<WeakReference<RecyclerView>> f254390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f254391h;

    public b(@NotNull Context context, @NotNull a2 helperEditorDragItem, @NotNull w coroutineExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helperEditorDragItem, "helperEditorDragItem");
        Intrinsics.checkNotNullParameter(coroutineExecutor, "coroutineExecutor");
        this.f254384a = context;
        this.f254385b = helperEditorDragItem;
        this.f254386c = coroutineExecutor;
        this.f254387d = new CatalogCategory[0];
        this.f254388e = new LinkedHashMap();
        this.f254389f = new LinkedHashMap();
        this.f254390g = new ArrayList();
    }

    private final com.planner5d.library.services.bitmaploader.target.h a(RecyclerView recyclerView) {
        com.planner5d.library.services.bitmaploader.target.h hVarRemove;
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter != null && (hVarRemove = this.f254388e.remove(adapter)) != null) {
            hVarRemove.a();
        }
        return new com.planner5d.library.services.bitmaploader.target.h();
    }

    private final View e(ViewGroup viewGroup, int i10) {
        for (View view : androidx.core.view.a2.e(viewGroup)) {
            if (isViewFromObject(view, Integer.valueOf(i10))) {
                return view;
            }
        }
        return null;
    }

    public final void b() {
        this.f254391h = true;
        Iterator<WeakReference<RecyclerView>> it = this.f254390g.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                recyclerView.setAdapter(null);
            }
        }
        while (!this.f254388e.isEmpty()) {
            Map<RecyclerView.h<?>, com.planner5d.library.services.bitmaploader.target.h> map = this.f254388e;
            com.planner5d.library.services.bitmaploader.target.h hVarRemove = map.remove(map.keySet().iterator().next());
            if (hVarRemove != null) {
                hVarRemove.a();
            }
        }
    }

    @NotNull
    public final CatalogCategory c(int i10) {
        return this.f254387d[i10];
    }

    @NotNull
    public final u2 d(@Nullable ViewGroup viewGroup, int i10) {
        if (viewGroup != null) {
            View viewE = e(viewGroup, i10);
            u2 scrollPosition = viewE instanceof f1 ? ((f1) viewE).getScrollPosition() : null;
            if (scrollPosition != null) {
                return scrollPosition;
            }
        }
        return new u2(0, 0, 0);
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(@NotNull ViewGroup container, int i10, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        View viewE = e(container, i10);
        if (viewE != null) {
            container.removeView(viewE);
        }
    }

    public final void f(int i10, @Nullable CatalogCategory catalogCategory, @NotNull wc.a itemsData, @NotNull ViewGroup container, @Nullable a.b bVar) {
        Intrinsics.checkNotNullParameter(itemsData, "itemsData");
        Intrinsics.checkNotNullParameter(container, "container");
        if (catalogCategory == null) {
            return;
        }
        View viewE = e(container, i10);
        if (!(viewE instanceof f1) || this.f254391h) {
            return;
        }
        com.planner5d.library.services.bitmaploader.target.h hVarA = a((RecyclerView) viewE);
        f1 f1Var = (f1) viewE;
        this.f254389f.remove(f1Var.getAdapter());
        a aVar = new a(this.f254384a, itemsData, false, hVarA, this.f254385b, bVar);
        this.f254389f.put(aVar, catalogCategory);
        this.f254388e.put(aVar, hVarA);
        f1Var.setAdapter(aVar);
        this.f254390g.add(new WeakReference<>(viewE));
    }

    public final void g(@Nullable ViewGroup viewGroup, int i10, @NotNull u2 scrollToPos) {
        Intrinsics.checkNotNullParameter(scrollToPos, "scrollToPos");
        if (viewGroup != null) {
            View viewE = e(viewGroup, i10);
            if (viewE instanceof f1) {
                ((f1) viewE).d2(scrollToPos);
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f254387d.length;
    }

    @Override // androidx.viewpager.widget.a
    @NotNull
    public CharSequence getPageTitle(int i10) {
        return this.f254387d[i10].getTitle().i(this.f254384a);
    }

    public final void h(@NotNull List<CatalogCategory> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f254387d = (CatalogCategory[]) categories.toArray(new CatalogCategory[0]);
        notifyDataSetChanged();
    }

    public final void i(@NotNull ViewGroup container, int i10, @NotNull String[] freeModels, boolean z10) {
        RecyclerView.h adapter;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(freeModels, "freeModels");
        View viewE = e(container, i10);
        if ((viewE instanceof RecyclerViewCatalog) && (adapter = ((RecyclerViewCatalog) viewE).getAdapter()) != null && (adapter instanceof a)) {
            ((a) adapter).l(freeModels, z10);
        }
    }

    @Override // androidx.viewpager.widget.a
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, int i10) {
        Intrinsics.checkNotNullParameter(container, "container");
        View viewInflate = LayoutInflater.from(container.getContext()).inflate(com.planner5d.library.f.m.f168754l6, container, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.planner5d.library.widget.editor.catalog.RecyclerViewCatalog");
        RecyclerViewCatalog recyclerViewCatalog = (RecyclerViewCatalog) viewInflate;
        recyclerViewCatalog.setSpanCount(3);
        recyclerViewCatalog.n(new i0());
        recyclerViewCatalog.setTag(Integer.valueOf(i10));
        container.addView(recyclerViewCatalog);
        Object tag = recyclerViewCatalog.getTag();
        Intrinsics.checkNotNullExpressionValue(tag, "getTag(...)");
        return tag;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "object");
        return view.getTag() == object;
    }
}
