package com.planner5d.library.activity.fragment.gallery;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.helper.m1;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.j1;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.services.utility.k3;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class Gallery extends FragmentController implements com.planner5d.library.activity.helper.ui.a, o0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f133680e = com.planner5d.library.util.navigation.uiview.f.c(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private List<WeakReference<o0>> f133681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<com.planner5d.library.services.r, Integer> f133682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private rd.l f133683h;

    @ij.a
    public b2 messageManager;

    public Gallery() {
        com.planner5d.library.application.b.f142455c.a().J0(this);
        this.f133681f = new ArrayList();
        int i10 = 0 << 2;
        this.f133682g = MapsKt.mapOf(TuplesKt.to(com.planner5d.library.services.r.floorPlansList, 0), TuplesKt.to(com.planner5d.library.services.r.snapshotsList, 1), TuplesKt.to(com.planner5d.library.services.r.favoritesList, 2));
    }

    private final com.planner5d.library.util.navigation.uiview.c B() {
        return (com.planner5d.library.util.navigation.uiview.c) this.f133680e.getValue();
    }

    private final com.planner5d.library.widget.tab.f C(final com.planner5d.library.services.utility.j jVar) {
        List listListOf = CollectionsKt.listOf((Object[]) new com.planner5d.library.widget.tab.f.a[]{new com.planner5d.library.widget.tab.f.a(r3.d.projects_gallery, com.planner5d.library.f.s.f169299nc, new Function0() { // from class: com.planner5d.library.activity.fragment.gallery.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Gallery.D(jVar, this);
            }
        }, null, 8, null), new com.planner5d.library.widget.tab.f.a(r3.d.snapshots_gallery, com.planner5d.library.f.s.MC, new Function0() { // from class: com.planner5d.library.activity.fragment.gallery.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Gallery.E(jVar, this);
            }
        }, null, 8, null), new com.planner5d.library.widget.tab.f.a(r3.d.favorites_gallery, com.planner5d.library.f.s.Jr, new Function0() { // from class: com.planner5d.library.activity.fragment.gallery.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Gallery.F(jVar, this);
            }
        }, null, 8, null)});
        Map<com.planner5d.library.services.r, Integer> map = this.f133682g;
        Serializable serializableS = jVar.s(com.planner5d.library.services.r.tab, null);
        Integer num = map.get(serializableS instanceof com.planner5d.library.services.r ? (com.planner5d.library.services.r) serializableS : null);
        return new com.planner5d.library.widget.tab.f(listListOf, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment D(com.planner5d.library.services.utility.j jVar, Gallery gallery) {
        GalleryPageProjects galleryPageProjects = new GalleryPageProjects();
        galleryPageProjects.setArguments(jVar.h(com.planner5d.library.services.r.floorPlansList, null));
        galleryPageProjects.setOnFavoriteUpdated(gallery);
        gallery.f133681f.add(new WeakReference<>(galleryPageProjects));
        return galleryPageProjects;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment E(com.planner5d.library.services.utility.j jVar, Gallery gallery) {
        GalleryPageSnapshots galleryPageSnapshots = new GalleryPageSnapshots();
        galleryPageSnapshots.setArguments(jVar.h(com.planner5d.library.services.r.snapshotsList, null));
        galleryPageSnapshots.setOnFavoriteUpdated(gallery);
        gallery.f133681f.add(new WeakReference<>(galleryPageSnapshots));
        return galleryPageSnapshots;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment F(com.planner5d.library.services.utility.j jVar, Gallery gallery) {
        GalleryPageFavorites galleryPageFavorites = new GalleryPageFavorites();
        galleryPageFavorites.setArguments(jVar.h(com.planner5d.library.services.r.favoritesList, null));
        galleryPageFavorites.setOnFavoriteUpdated(gallery);
        gallery.f133681f.add(new WeakReference<>(galleryPageFavorites));
        return galleryPageFavorites;
    }

    @NotNull
    public final b2 getMessageManager() {
        b2 b2Var = this.messageManager;
        if (b2Var != null) {
            return b2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageManager");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).w(true).L(true).K(new k3(com.planner5d.library.f.s.Xc, new Object[0])).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        rd.l lVarD = rd.l.d(inflater, viewGroup, false);
        this.f133683h = lVarD;
        if (lVarD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewSimplePagerBinding");
            lVarD = null;
        }
        ViewPager2 root = lVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.planner5d.library.activity.fragment.gallery.o0
    public void onFavoriteUpdated(@NotNull com.planner5d.library.model.k item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Iterator<WeakReference<o0>> it = this.f133681f.iterator();
        while (it.hasNext()) {
            o0 o0Var = it.next().get();
            if (o0Var != null) {
                o0Var.onFavoriteUpdated(item);
            }
        }
    }

    public final void setMessageManager(@NotNull b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "<set-?>");
        this.messageManager = b2Var;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void w(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        rd.l lVar = this.f133683h;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewSimplePagerBinding");
            lVar = null;
        }
        ViewPager2 pager = lVar.f366632b;
        Intrinsics.checkNotNullExpressionValue(pager, "pager");
        com.planner5d.library.widget.tab.f fVarC = C(new com.planner5d.library.services.utility.j(getArguments()));
        B().a(fVarC, pager);
        pager.o(new com.planner5d.library.widget.tab.a(j1.f216988b, fVarC.b()));
        TabLayout.i iVarD = m1.k(getActivity()).D(2);
        if (iVarD != null) {
            iVarD.u(com.planner5d.library.f.m.f168768m9);
        }
    }
}
