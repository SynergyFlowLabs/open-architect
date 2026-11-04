package com.planner5d.library.model.manager;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class d implements x1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f191240g = 48;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.model.manager.builtin.i f191241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.model.manager.contest.b f191242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y0 f191243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f191244f = null;

    public enum a {
        Categories,
        CategoriesAndSubcategories,
        CategoriesAndItems,
        Items;

        static {
            boolean z10 = false | true;
        }
    }

    @ij.a
    public d(com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.model.manager.contest.b bVar, y0 y0Var) {
        this.f191241c = iVar;
        this.f191242d = bVar;
        this.f191243e = y0Var;
    }

    private List<CatalogCategory> j(CatalogCategory catalogCategory) {
        LinkedList linkedList = new LinkedList();
        while (catalogCategory != null) {
            linkedList.add(catalogCategory);
            catalogCategory = f(catalogCategory);
        }
        Collections.reverse(linkedList);
        return linkedList;
    }

    private boolean k(CatalogCategory catalogCategory) {
        List<CatalogCategory> listB = b(catalogCategory);
        Iterator<CatalogCategory> it = listB.iterator();
        while (it.hasNext()) {
            if (m(it.next())) {
                return false;
            }
        }
        return !listB.isEmpty();
    }

    private boolean l(CatalogCategory catalogCategory) {
        List<CatalogCategory> listB = b(catalogCategory);
        Iterator<CatalogCategory> it = listB.iterator();
        while (it.hasNext()) {
            if (n(it.next())) {
                return false;
            }
        }
        return !listB.isEmpty();
    }

    private boolean m(CatalogCategory catalogCategory) {
        return !n(catalogCategory);
    }

    private boolean n(CatalogCategory catalogCategory) {
        return b(catalogCategory).isEmpty();
    }

    @androidx.annotation.m1
    public CatalogCategory a(long j10) {
        Long l10 = this.f191244f;
        return l10 == null ? this.f191241c.G(j10) : this.f191242d.i(l10.longValue(), j10);
    }

    @androidx.annotation.m1
    public List<CatalogCategory> b(CatalogCategory catalogCategory) {
        Long l10 = this.f191244f;
        return l10 == null ? this.f191241c.H(catalogCategory) : this.f191242d.j(l10.longValue(), catalogCategory);
    }

    public void c(int i10, com.planner5d.library.services.bitmaploader.target.a aVar) {
        this.f191243e.f("icons/categories/48/" + i10 + ".webp", 48, 48, aVar, 1L);
    }

    @androidx.annotation.m1
    public a d(@NonNull CatalogCategory catalogCategory) {
        if (n(catalogCategory)) {
            return a.Items;
        }
        if (k(catalogCategory)) {
            return catalogCategory.getParentId() == 0 ? a.CategoriesAndItems : a.Categories;
        }
        return l(catalogCategory) ? a.CategoriesAndSubcategories : a.Categories;
    }

    @androidx.annotation.m1
    public CatalogCategory f(CatalogCategory catalogCategory) {
        if (catalogCategory == null || catalogCategory.getParentId() == 0) {
            return null;
        }
        return a(catalogCategory.getParentId());
    }

    @androidx.annotation.m1
    public CatalogCategory h(CatalogCategory catalogCategory, int i10) {
        List<CatalogCategory> listJ = j(catalogCategory);
        if (i10 < listJ.size()) {
            return listJ.get(i10);
        }
        return null;
    }

    @androidx.annotation.m1
    public CatalogCategory i(CatalogCategory catalogCategory) {
        CatalogCategory catalogCategoryF;
        CatalogCategory catalogCategoryF2 = f(catalogCategory);
        return (catalogCategory == null || catalogCategory.getParentId() == 0 || (catalogCategoryF = f(catalogCategoryF2)) == null || d(catalogCategoryF) != a.CategoriesAndSubcategories) ? catalogCategoryF2 : catalogCategoryF;
    }

    @androidx.annotation.m1
    public boolean o(CatalogCategory catalogCategory) {
        CatalogCategory catalogCategoryF = f(catalogCategory);
        return catalogCategoryF != null && catalogCategoryF.getParentId() == 0 && (k(catalogCategoryF) || l(catalogCategoryF));
    }

    public void p(Long l10) {
        this.f191244f = l10;
    }
}
