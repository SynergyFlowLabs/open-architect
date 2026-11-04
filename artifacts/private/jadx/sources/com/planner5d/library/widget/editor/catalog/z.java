package com.planner5d.library.widget.editor.catalog;

import android.content.Context;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.editor.helper.a2;
import com.planner5d.library.widget.j0;

/* JADX INFO: loaded from: classes12.dex */
public class z extends RecyclerViewCatalog {

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    @ij.a
    protected a2 f254711a5;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.services.utility.w f254712b5;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.target.h f254713c5;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.catalog.adapter.a.b f254714d5;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    private boolean f254715e5;

    public z(Context context, com.planner5d.library.services.bitmaploader.target.h hVar, com.planner5d.library.widget.editor.catalog.adapter.a.b bVar) {
        super(context);
        this.f254715e5 = false;
        this.f254713c5 = hVar;
        this.f254714d5 = bVar;
        setSpanCount(3);
        n(new j0(getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167378xh)));
        com.planner5d.library.application.b.r().X0(this);
    }

    public void f2() {
        this.f254715e5 = true;
        setAdapter(null);
    }

    public void setSearchResultsData(@NonNull wc.a aVar) {
        setAdapter(this.f254715e5 ? null : new com.planner5d.library.widget.editor.catalog.adapter.a(getContext(), aVar, true, this.f254713c5, this.f254711a5, this.f254714d5));
    }
}
