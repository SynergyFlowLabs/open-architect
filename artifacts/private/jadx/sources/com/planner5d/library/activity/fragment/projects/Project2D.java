package com.planner5d.library.activity.fragment.projects;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.databinding.q1;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.b5;
import com.planner5d.library.widget.editor.helper.a2;
import com.planner5d.library.widget.editor.helper.g1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class Project2D extends FragmentController implements g1.j, com.planner5d.library.activity.helper.ui.a, com.planner5d.library.widget.c0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.editor2d.o f134905e = new com.planner5d.library.widget.editor.editor2d.o();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f134906f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q1 f134907g;

    @ij.a
    public g1 helper;

    @ij.a
    public a2 helperEditorDragItem;

    @ij.a
    public b5 surveyManager;

    @SourceDebugExtension({"SMAP\nProject2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Project2D.kt\ncom/planner5d/library/activity/fragment/projects/Project2D$loadedProject$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
    public static final class a extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f134908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Subscriber<? super Void> f134909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Project2D f134910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Bundle f134911g;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.projects.Project2D$a$a, reason: collision with other inner class name */
        public static final class C1482a extends com.planner5d.library.services.rx.e<Void> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Project2D f134912d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ View f134913e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Subscriber<? super Void> f134914f;

            C1482a(Project2D project2D, View view, Subscriber<? super Void> subscriber) {
                this.f134912d = project2D;
                this.f134913e = view;
                this.f134914f = subscriber;
            }

            @Override // com.planner5d.library.services.rx.e
            public void c(Throwable th2) {
                this.f134914f.onNext(null);
                this.f134914f.onCompleted();
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            public void onCompleted() {
                this.f134912d.D();
                this.f134913e.setOnDragListener(this.f134912d.getHelperEditorDragItem$P5D_Library_release().c(this.f134912d.getHelper$P5D_Library_release()));
                onError(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Subscriber<? super Void> subscriber, Project2D project2D, Bundle bundle) {
            super(subscriber);
            this.f134909e = subscriber;
            this.f134910f = project2D;
            this.f134911g = bundle;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r10) {
            View view = this.f134910f.getView();
            if (view != null) {
                Bundle bundle = this.f134911g;
                Project2D project2D = this.f134910f;
                Subscriber<? super Void> subscriber = this.f134909e;
                if (bundle != null) {
                    project2D.getHelper$P5D_Library_release().C2(bundle);
                }
                this.f134908d = true;
                q1 q1Var = project2D.f134907g;
                if (q1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    q1Var = null;
                }
                q1Var.f159538b.V().subscribe((Subscriber<? super Void>) new C1482a(project2D, view, subscriber));
            }
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            if (!this.f134908d) {
                this.f134909e.onCompleted();
            }
            if (this.f134910f.getHelper$P5D_Library_release().i1() == null) {
                this.f134910f.getSurveyManager$P5D_Library_release().a(this.f134910f.getActivity());
            }
        }
    }

    public static final class b extends com.planner5d.library.services.rx.e<com.planner5d.library.widget.editor.a.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber<com.planner5d.library.widget.editor.a.b> f134915d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Subscriber<com.planner5d.library.widget.editor.a.b> subscriber) {
            super(subscriber);
            this.f134915d = subscriber;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            com.planner5d.library.services.l.f224379e.o(null);
            this.f134915d.onCompleted();
        }
    }

    public Project2D() {
        com.planner5d.library.application.b.f142455c.a().h0(this);
        this.f131538b.k(new ij.c() { // from class: com.planner5d.library.activity.fragment.projects.n
            @Override // ij.c
            public final Object get() {
                return Project2D.A(this.f135040a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable A(Project2D project2D) {
        return project2D.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(Project2D project2D, ItemProject itemProject, Bundle bundle, Subscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        project2D.f134905e.v(itemProject, project2D.getHelper$P5D_Library_release().j(), project2D.getHelper$P5D_Library_release().z1(), true).subscribe((Subscriber<? super Void>) new a(subscriber, project2D, bundle));
    }

    private final void C(View.OnGenericMotionListener onGenericMotionListener) {
        View viewFindViewById;
        androidx.fragment.app.s activity = getActivity();
        if (activity == null || (viewFindViewById = activity.findViewById(com.planner5d.library.f.j.Ig)) == null) {
            return;
        }
        if (this.f134906f.get()) {
            onGenericMotionListener = null;
        }
        viewFindViewById.setOnGenericMotionListener(onGenericMotionListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        Subscriber<com.planner5d.library.widget.editor.a.b> subscriberH3 = getHelper$P5D_Library_release().h3();
        q1 q1Var = this.f134907g;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q1Var = null;
        }
        q1Var.f159538b.T(this.f134905e).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber<? super com.planner5d.library.widget.editor.a.b>) new b(subscriberH3));
    }

    private final Observable<Void> E() {
        q1 q1Var = null;
        if (!this.f134906f.compareAndSet(false, true)) {
            Observable<Void> observableJust = Observable.just(null);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        C(null);
        Observable<Void> observableJ3 = getHelper$P5D_Library_release().j3();
        q1 q1Var2 = this.f134907g;
        if (q1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q1Var = q1Var2;
        }
        q1Var.f159538b.setVisibility(8);
        Intrinsics.checkNotNull(observableJ3);
        return observableJ3;
    }

    @NotNull
    public final g1 getHelper$P5D_Library_release() {
        g1 g1Var = this.helper;
        if (g1Var != null) {
            return g1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helper");
        return null;
    }

    @NotNull
    public final a2 getHelperEditorDragItem$P5D_Library_release() {
        a2 a2Var = this.helperEditorDragItem;
        if (a2Var != null) {
            return a2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperEditorDragItem");
        return null;
    }

    @NotNull
    public final b5 getSurveyManager$P5D_Library_release() {
        b5 b5Var = this.surveyManager;
        if (b5Var != null) {
            return b5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("surveyManager");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.activity.helper.ui.d.b bVar = new com.planner5d.library.activity.helper.ui.d.b(context, this);
        bVar.J(2).N(false).H(true).F(false).A(R.color.transparent);
        com.planner5d.library.activity.helper.ui.d dVarX = bVar.x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.widget.editor.helper.g1.j
    @NotNull
    public Observable<Void> loadedProject(@NotNull Project project, @NotNull final ItemProject item, @Nullable final Bundle bundle) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(item, "item");
        Observable<Void> observableSubscribeOn = Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.activity.fragment.projects.m
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                Project2D.B(this.f135036a, item, bundle, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    public void onActivityCreatedExtended(@Nullable Bundle bundle) {
        getHelper$P5D_Library_release().U2(this, bundle, getArguments(), this).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
        C(getHelper$P5D_Library_release());
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        return getHelper$P5D_Library_release().y2();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        getHelper$P5D_Library_release().z2(newConfig);
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    public View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        setHasOptionsMenu(true);
        this.f134907g = q1.d(inflater, viewGroup, false);
        g1 helper$P5D_Library_release = getHelper$P5D_Library_release();
        q1 q1Var = this.f134907g;
        q1 q1Var2 = null;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q1Var = null;
        }
        helper$P5D_Library_release.Q2(q1Var.f159538b, getArguments());
        g1 helper$P5D_Library_release2 = getHelper$P5D_Library_release();
        q1 q1Var3 = this.f134907g;
        if (q1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q1Var3 = null;
        }
        helper$P5D_Library_release2.b3(q1Var3.getRoot(), false);
        q1 q1Var4 = this.f134907g;
        if (q1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q1Var2 = q1Var4;
        }
        ConstraintLayout root = q1Var2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        E().subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getHelper$P5D_Library_release().H2();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getHelper$P5D_Library_release().O2();
        q1 q1Var = this.f134907g;
        if (q1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q1Var = null;
        }
        q1Var.f159538b.R();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        getHelper$P5D_Library_release().D2(outState);
    }

    public final void setHelper$P5D_Library_release(@NotNull g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<set-?>");
        this.helper = g1Var;
    }

    public final void setHelperEditorDragItem$P5D_Library_release(@NotNull a2 a2Var) {
        Intrinsics.checkNotNullParameter(a2Var, "<set-?>");
        this.helperEditorDragItem = a2Var;
    }

    public final void setSurveyManager$P5D_Library_release(@NotNull b5 b5Var) {
        Intrinsics.checkNotNullParameter(b5Var, "<set-?>");
        this.surveyManager = b5Var;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @Nullable
    protected com.planner5d.library.widget.menu.l t(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (getHelper$P5D_Library_release().S1()) {
            return null;
        }
        return getHelper$P5D_Library_release().k1(menu, inflater);
    }
}
