package com.planner5d.library.dgenerator.application;

import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.dgenerator.fragment.DesignGeneratorNavigationFragment;
import com.planner5d.library.interactor.j0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@fg.h
public final class d {

    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.activity.fragment.n f160075a;

        a(com.planner5d.library.activity.fragment.n nVar) {
            this.f160075a = nVar;
        }

        @Override // com.planner5d.library.dgenerator.application.p
        public Class<? extends FragmentController> a() {
            return this.f160075a.a();
        }

        @Override // com.planner5d.library.dgenerator.application.p
        public Class<? extends FragmentController> b() {
            return DesignGeneratorNavigationFragment.class;
        }
    }

    @fg.i
    @NotNull
    public final nb.a a(@NotNull com.planner5d.library.dgenerator.interactor.a interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final nb.b b(@NotNull com.planner5d.library.dgenerator.interactor.c interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final nb.c c(@NotNull com.planner5d.library.dgenerator.interactor.e interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final nb.d d(@NotNull com.planner5d.library.dgenerator.interactor.g interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final nb.e e(@NotNull com.planner5d.library.dgenerator.interactor.i interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final nb.f f(@NotNull com.planner5d.library.dgenerator.interactor.k interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @ij.f
    @NotNull
    public final p g(@NotNull com.planner5d.library.activity.fragment.n defaultFragmentProvider) {
        Intrinsics.checkNotNullParameter(defaultFragmentProvider, "defaultFragmentProvider");
        return new a(defaultFragmentProvider);
    }

    @fg.i
    @NotNull
    public final nb.h h(@NotNull com.planner5d.library.dgenerator.interactor.p interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final le.m i(@NotNull j0 interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final nb.g j(@NotNull com.planner5d.library.dgenerator.interactor.m interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final ce.c k(@NotNull com.planner5d.library.smartwizard.interactor.g interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }
}
