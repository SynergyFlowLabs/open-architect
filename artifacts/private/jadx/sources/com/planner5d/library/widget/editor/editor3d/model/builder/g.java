package com.planner5d.library.widget.editor.editor3d.model.builder;

import com.planner5d.library.model.item.ItemEarth;
import com.planner5d.library.model.item.ItemGrid;
import com.planner5d.library.model.item.ItemMaterial;

/* JADX INFO: loaded from: classes12.dex */
public class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ItemMaterial f255656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dc.a<cc.a> f255657b;

    public g(ItemGrid itemGrid, dc.d<cc.a> dVar) {
        this.f255656a = itemGrid.getMaterial();
        this.f255657b = dVar.a(itemGrid instanceof ItemEarth, gc.d.e(itemGrid.getSize(new com.planner5d.library.math.k())));
    }

    @Override // com.planner5d.library.widget.editor.editor3d.model.builder.e
    public cc.a a(com.planner5d.library.engine.a aVar, ve.b bVar) {
        return this.f255657b.m(bVar.b(aVar, false, this.f255656a), aVar);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.model.builder.e
    public void b(ve.b bVar) {
        bVar.u(this.f255656a);
    }
}
