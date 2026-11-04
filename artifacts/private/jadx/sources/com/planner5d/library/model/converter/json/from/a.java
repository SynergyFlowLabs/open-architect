package com.planner5d.library.model.converter.json.from;

import androidx.annotation.m1;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.item.model2d.Model2D;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.model.manager.builtin.i f180567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dd.a f180568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Model2D> f180569c = new HashMap();

    @ij.a
    public a(com.planner5d.library.model.manager.builtin.i iVar, dd.a aVar) {
        this.f180567a = iVar;
        this.f180568b = aVar;
    }

    @m1
    public Model2D a(String str) {
        if (!this.f180569c.containsKey(str)) {
            CatalogItem catalogItemW = this.f180567a.w(str);
            Model2D model2DZ = catalogItemW == null ? null : this.f180567a.Z(catalogItemW);
            if (model2DZ == null) {
                model2DZ = this.f180568b.a(str);
            }
            this.f180569c.put(str, model2DZ);
        }
        return this.f180569c.get(str);
    }
}
