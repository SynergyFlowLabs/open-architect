package com.planner5d.library.project.fragment.roomtype;

import com.planner5d.library.model.manager.y0;
import dagger.internal.r;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
public final class f implements fg.g<RoomTypeFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y0> f223825a;

    public f(ij.c<y0> cVar) {
        this.f223825a = cVar;
    }

    public static fg.g<RoomTypeFragment> a(ij.c<y0> cVar) {
        return new f(cVar);
    }

    @dagger.internal.j("com.planner5d.library.project.fragment.roomtype.RoomTypeFragment.imageManager")
    public static void b(RoomTypeFragment roomTypeFragment, y0 y0Var) {
        roomTypeFragment.imageManager = y0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(RoomTypeFragment roomTypeFragment) {
        b(roomTypeFragment, this.f223825a.get());
    }
}
