package com.planner5d.library.model.manager;

import com.planner5d.library.model.ManagedFile;
import com.planner5d.library.model.item.catalog.CatalogItem;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class k1 implements x1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f191800e = 256;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y0 f191801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.modules.user.user.t f191802d;

    @ij.a
    public k1(y0 y0Var) {
        this.f191801c = y0Var;
    }

    public void a(CatalogItem catalogItem, com.planner5d.library.services.bitmaploader.target.a aVar) {
        b(catalogItem.f180761id, aVar);
    }

    public void b(String str, com.planner5d.library.services.bitmaploader.target.a aVar) {
        c(str, aVar, 256);
    }

    public void c(String str, com.planner5d.library.services.bitmaploader.target.a aVar, int i10) {
        this.f191801c.f(ManagedFile.f180552o + str + ".webp", i10, i10, aVar, 1L);
    }
}
