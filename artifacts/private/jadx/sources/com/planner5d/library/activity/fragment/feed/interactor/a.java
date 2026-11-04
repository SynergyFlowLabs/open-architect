package com.planner5d.library.activity.fragment.feed.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.statistics.events.e3;
import com.planner5d.library.model.manager.statistics.events.e4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
@ij.f
@SourceDebugExtension({"SMAP\nCheckIsRatedInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckIsRatedInteractor.kt\ncom/planner5d/library/activity/fragment/feed/interactor/CheckIsRatedInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n774#2:38\n865#2,2:39\n1557#2:41\n1628#2,3:42\n1863#2:45\n1864#2:47\n1#3:46\n*S KotlinDebug\n*F\n+ 1 CheckIsRatedInteractor.kt\ncom/planner5d/library/activity/fragment/feed/interactor/CheckIsRatedInteractor\n*L\n16#1:38\n16#1:39,2\n17#1:41\n17#1:42,3\n19#1:45\n19#1:47\n*E\n"})
public final class a implements ka.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f133448b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.uploadplan.a f133449a;

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.feed.interactor.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.interactor.CheckIsRatedInteractor", f = "CheckIsRatedInteractor.kt", i = {0, 0}, l = {17, 28}, m = "sendEvents", n = {"this", "filtered"}, s = {"L$0", "L$1"})
    static final class C1467a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f133451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f133452c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133454e;

        C1467a(kotlin.coroutines.d<? super C1467a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f133452c = obj;
            this.f133454e |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    @ij.a
    public a(@NotNull com.planner5d.library.model.manager.uploadplan.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f133449a = repository;
    }

    private final void b(com.planner5d.library.activity.fragment.projects.g.a aVar) {
        e3.f216873b.E0(e4.c.photo_gallery, e4.f.recognition, aVar.c(), aVar.b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011c, code lost:
    
        if (r0.h(r7, r2) == r3) goto L51;
     */
    @Override // ka.d
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull java.util.List<? extends com.planner5d.library.activity.fragment.projects.g.a> r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.feed.interactor.a.a(java.util.List, kotlin.coroutines.d):java.lang.Object");
    }
}
