package com.planner5d.library.activity.fragment.dialog.iteminfo;

import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.model.manager.k1;
import com.planner5d.library.model.manager.y0;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class f implements g<ItemInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y0> f132104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<k1> f132105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<m2> f132106c;

    public f(ij.c<y0> cVar, ij.c<k1> cVar2, ij.c<m2> cVar3) {
        this.f132104a = cVar;
        this.f132105b = cVar2;
        this.f132106c = cVar3;
    }

    public static g<ItemInfo> a(ij.c<y0> cVar, ij.c<k1> cVar2, ij.c<m2> cVar3) {
        return new f(cVar, cVar2, cVar3);
    }

    @j("com.planner5d.library.activity.fragment.dialog.iteminfo.ItemInfo.imageManager")
    public static void b(ItemInfo itemInfo, y0 y0Var) {
        itemInfo.f132080p3 = y0Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.iteminfo.ItemInfo.itemManager")
    public static void c(ItemInfo itemInfo, k1 k1Var) {
        itemInfo.f132081q3 = k1Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.iteminfo.ItemInfo.uriViewer")
    public static void e(ItemInfo itemInfo, m2 m2Var) {
        itemInfo.f132082r3 = m2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ItemInfo itemInfo) {
        b(itemInfo, this.f132104a.get());
        c(itemInfo, this.f132105b.get());
        e(itemInfo, this.f132106c.get());
    }
}
