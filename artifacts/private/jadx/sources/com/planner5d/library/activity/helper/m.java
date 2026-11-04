package com.planner5d.library.activity.helper;

import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.feed.FeedFragment;
import com.planner5d.library.activity.fragment.gallery.Gallery;
import com.planner5d.library.activity.fragment.profile.ProfileNavigationFragment;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.activity.fragment.spaces.SpacesNavigationFragment;
import com.planner5d.library.activity.fragment.spaces.documents.SpacesDocumentsFragment;
import com.planner5d.library.contest.view.ContestNavigationFragment;
import com.planner5d.library.model.manager.statistics.events.r3;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBottomTabsAndDestinationsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomTabsAndDestinationsMapper.kt\ncom/planner5d/library/activity/helper/BottomTabsAndDestinationsMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f137017c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final sd.e f137018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<a> f137019b;

    public m(@NotNull sd.e firebaseInAppMessageTrigger) {
        Intrinsics.checkNotNullParameter(firebaseInAppMessageTrigger, "firebaseInAppMessageTrigger");
        this.f137018a = firebaseInAppMessageTrigger;
        int i10 = 6 ^ 0;
        this.f137019b = CollectionsKt.listOf((Object[]) new a[]{new a(com.planner5d.library.f.j.M9, SpacesNavigationFragment.class, new Function0() { // from class: com.planner5d.library.activity.helper.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.i(this.f136854a);
            }
        }), new a(com.planner5d.library.f.j.Fa, SpacesDocumentsFragment.class, new Function0() { // from class: com.planner5d.library.activity.helper.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.j(this.f136869a);
            }
        }), new a(com.planner5d.library.f.j.f168426ud, FeedFragment.class, new Function0() { // from class: com.planner5d.library.activity.helper.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.k(this.f136898a);
            }
        }), new a(com.planner5d.library.f.j.no, ProjectsPagesFragment.class, new Function0() { // from class: com.planner5d.library.activity.helper.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.l(this.f136972a);
            }
        }), new a(com.planner5d.library.f.j.f167939aa, ContestNavigationFragment.class, new Function0() { // from class: com.planner5d.library.activity.helper.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.m(this.f136983a);
            }
        }), new a(com.planner5d.library.f.j.Zc, Gallery.class, null, 4, null), new a(com.planner5d.library.f.j.Zl, ProfileNavigationFragment.class, new Function0() { // from class: com.planner5d.library.activity.helper.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.n(this.f136989a);
            }
        })});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(m mVar) {
        mVar.o(sd.d.Home);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(m mVar) {
        mVar.o(sd.d.Home);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(m mVar) {
        mVar.o(sd.d.Home);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(m mVar) {
        mVar.o(sd.d.Projects);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(m mVar) {
        mVar.o(sd.d.Contests);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(m mVar) {
        com.planner5d.library.model.manager.statistics.events.j1.f216988b.P(r3.d.profile);
        mVar.o(sd.d.Profile);
        return Unit.f312394a;
    }

    private final void o(sd.d dVar) {
        this.f137018a.a(dVar);
    }

    @Nullable
    public final Class<? extends FragmentController> g(@androidx.annotation.d0 int i10) {
        Object next;
        Iterator<T> it = this.f137019b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((a) next).c() != i10);
        a aVar = (a) next;
        if (aVar == null) {
            return null;
        }
        Function0<Unit> function0B = aVar.b();
        if (function0B != null) {
            function0B.invoke();
        }
        return aVar.a();
    }

    @androidx.annotation.d0
    @Nullable
    public final Integer h(@NotNull Class<? extends FragmentController> destinationFragment) {
        Object next;
        Intrinsics.checkNotNullParameter(destinationFragment, "destinationFragment");
        Iterator<T> it = this.f137019b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((a) next).a(), destinationFragment));
        a aVar = (a) next;
        if (aVar != null) {
            return Integer.valueOf(aVar.c());
        }
        return null;
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f137020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Class<? extends FragmentController> f137021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Function0<Unit> f137022c;

        public a(@androidx.annotation.d0 int i10, @NotNull Class<? extends FragmentController> destinationFragment, @Nullable Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(destinationFragment, "destinationFragment");
            this.f137020a = i10;
            this.f137021b = destinationFragment;
            this.f137022c = function0;
        }

        @NotNull
        public final Class<? extends FragmentController> a() {
            return this.f137021b;
        }

        @Nullable
        public final Function0<Unit> b() {
            return this.f137022c;
        }

        public final int c() {
            return this.f137020a;
        }

        public /* synthetic */ a(int i10, Class cls, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, cls, (i11 & 4) != 0 ? null : function0);
        }
    }
}
