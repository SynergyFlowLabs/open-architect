package com.planner5d.library.project.fragment.roomstyle;

import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import dagger.internal.r;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
public final class f implements fg.g<RoomStyleFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.feed.b> f223739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<NetworkErrorUtility> f223740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f223741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<y0> f223742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<x> f223743e;

    public f(ij.c<com.planner5d.library.activity.fragment.feed.b> cVar, ij.c<NetworkErrorUtility> cVar2, ij.c<b2> cVar3, ij.c<y0> cVar4, ij.c<x> cVar5) {
        this.f223739a = cVar;
        this.f223740b = cVar2;
        this.f223741c = cVar3;
        this.f223742d = cVar4;
        this.f223743e = cVar5;
    }

    public static fg.g<RoomStyleFragment> a(ij.c<com.planner5d.library.activity.fragment.feed.b> cVar, ij.c<NetworkErrorUtility> cVar2, ij.c<b2> cVar3, ij.c<y0> cVar4, ij.c<x> cVar5) {
        return new f(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    @dagger.internal.j("com.planner5d.library.project.fragment.roomstyle.RoomStyleFragment.autoStyleListProvider")
    public static void b(RoomStyleFragment roomStyleFragment, com.planner5d.library.activity.fragment.feed.b bVar) {
        roomStyleFragment.autoStyleListProvider = bVar;
    }

    @dagger.internal.j("com.planner5d.library.project.fragment.roomstyle.RoomStyleFragment.imageManager")
    public static void c(RoomStyleFragment roomStyleFragment, y0 y0Var) {
        roomStyleFragment.imageManager = y0Var;
    }

    @dagger.internal.j("com.planner5d.library.project.fragment.roomstyle.RoomStyleFragment.messageManager")
    public static void e(RoomStyleFragment roomStyleFragment, fg.e<b2> eVar) {
        roomStyleFragment.messageManager = eVar;
    }

    @dagger.internal.j("com.planner5d.library.project.fragment.roomstyle.RoomStyleFragment.navigator")
    public static void f(RoomStyleFragment roomStyleFragment, x xVar) {
        roomStyleFragment.navigator = xVar;
    }

    @dagger.internal.j("com.planner5d.library.project.fragment.roomstyle.RoomStyleFragment.networkErrorUtility")
    public static void g(RoomStyleFragment roomStyleFragment, fg.e<NetworkErrorUtility> eVar) {
        roomStyleFragment.networkErrorUtility = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(RoomStyleFragment roomStyleFragment) {
        b(roomStyleFragment, this.f223739a.get());
        g(roomStyleFragment, dagger.internal.g.a(this.f223740b));
        e(roomStyleFragment, dagger.internal.g.a(this.f223741c));
        c(roomStyleFragment, this.f223742d.get());
        f(roomStyleFragment, this.f223743e.get());
    }
}
