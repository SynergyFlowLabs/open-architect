package com.planner5d.library.widget.editor.catalog.adapter;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
class f extends RecyclerView.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.C1723a f254399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.a f254400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View.OnClickListener f254401c;

    f(@NonNull View view, final a aVar) {
        super(new com.planner5d.library.widget.editor.catalog.e(view.getContext()));
        this.f254399a = null;
        this.f254400b = null;
        this.f254401c = new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.catalog.adapter.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f254397a.i(aVar, view2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(a aVar, View view) {
        aVar.k(this.f254399a, null, false);
    }

    void h(@NonNull com.planner5d.library.services.bitmaploader.target.h hVar, Function2<Integer, com.planner5d.library.services.bitmaploader.target.a, Unit> function2, a.C1723a c1723a, boolean z10, boolean z11) {
        hVar.d(this.f254400b);
        com.planner5d.library.widget.editor.catalog.e eVar = (com.planner5d.library.widget.editor.catalog.e) this.itemView;
        this.f254399a = c1723a;
        com.planner5d.library.services.bitmaploader.target.a aVarY = eVar.y(c1723a.f254379a, function2, z11 || z10, z11);
        this.f254400b = aVarY;
        this.f254400b = hVar.c(aVarY);
        this.itemView.setOnClickListener(z10 ? this.f254401c : null);
        this.itemView.setClickable(z10);
    }
}
