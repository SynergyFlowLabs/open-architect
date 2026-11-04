package com.planner5d.library.activity.fragment.gallery;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class GalleryPageFavorites extends GalleryPage {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f133709g3 = true;

    private final void Y() {
        if (this.f133698s) {
            return;
        }
        l lVar = this.f133695o;
        lVar.P(new com.planner5d.library.model.manager.q0.d((String) null, lVar.K()));
        Q(true);
        this.f133709g3 = false;
    }

    @Override // com.planner5d.library.activity.fragment.gallery.GalleryPage
    protected int J() {
        return com.planner5d.library.f.m.O1;
    }

    @Override // com.planner5d.library.activity.fragment.gallery.GalleryPage
    @NotNull
    protected com.planner5d.library.model.manager.q0.c L() {
        return com.planner5d.library.model.manager.q0.c.favorites;
    }

    @Override // com.planner5d.library.activity.fragment.gallery.GalleryPage
    protected boolean M() {
        return false;
    }

    @Override // com.planner5d.library.activity.fragment.gallery.GalleryPage, com.planner5d.library.activity.fragment.gallery.o0
    public void onFavoriteUpdated(@NotNull com.planner5d.library.model.k item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f133709g3 = true;
        if (isVisible()) {
            Y();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f133709g3) {
            Y();
        }
    }
}
