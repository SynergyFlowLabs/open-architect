package com.planner5d.library.activity.fragment.smartwizard;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.d1;
import com.planner5d.library.activity.fragment.projects.Editor3dFragment;
import com.planner5d.library.activity.fragment.smartwizard.s;
import com.planner5d.library.activity.helper.m1;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.widget.c0;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.j2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public abstract class SmartWizardEditor3DFragment<T extends s> extends Editor3dFragment implements c0, g1.j {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f135375j = true;

    static final class a implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f135376a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f135376a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f135376a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f135376a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable Z(final SmartWizardEditor3DFragment smartWizardEditor3DFragment, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar) {
        if (smartWizardEditor3DFragment.getView() == null) {
            return Observable.error(new com.planner5d.library.widget.editor.editor3d.q.a());
        }
        smartWizardEditor3DFragment.getViewModel().Z().o(Boolean.FALSE);
        if (smartWizardEditor3DFragment.f135375j) {
            smartWizardEditor3DFragment.f135375j = false;
            smartWizardEditor3DFragment.G().x0(smartWizardEditor3DFragment.I().G().E1());
        }
        Observable<com.planner5d.library.widget.editor.a.b> observableLast = smartWizardEditor3DFragment.I().F().m().last();
        final Function1 function1 = new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SmartWizardEditor3DFragment.a0((com.planner5d.library.widget.editor.a.b) obj);
            }
        };
        return observableLast.map(new Func1() { // from class: com.planner5d.library.activity.fragment.smartwizard.o
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return SmartWizardEditor3DFragment.b0(function1, obj);
            }
        }).doOnCompleted(new Action0() { // from class: com.planner5d.library.activity.fragment.smartwizard.p
            @Override // rx.functions.Action0
            public final void call() {
                SmartWizardEditor3DFragment.c0(this.f135603a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void a0(com.planner5d.library.widget.editor.a.b bVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void b0(Function1 function1, Object obj) {
        return (Void) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(SmartWizardEditor3DFragment smartWizardEditor3DFragment) {
        com.planner5d.library.services.l.f224379e.o(null);
        smartWizardEditor3DFragment.getViewModel().Z().o(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(SmartWizardEditor3DFragment smartWizardEditor3DFragment, Boolean bool) {
        com.planner5d.library.widget.editor.facade.h hVarI = smartWizardEditor3DFragment.I();
        Intrinsics.checkNotNull(bool);
        hVarI.n(bool.booleanValue());
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.projects.Editor3dFragment
    @NotNull
    protected com.planner5d.library.widget.editor.facade.h E(@NotNull com.planner5d.library.widget.editor.facade.s factory, @NotNull j2.a listener) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return factory.d(listener);
    }

    @Override // com.planner5d.library.activity.fragment.projects.Editor3dFragment
    protected void L() {
        super.L();
        s.o0(getViewModel(), this, null, 2, null);
    }

    @Override // com.planner5d.library.activity.fragment.projects.Editor3dFragment
    protected void M(@Nullable Throwable th2) {
        super.M(th2);
        getViewModel().l0(th2, true);
    }

    protected void d0(@Nullable Project project, @Nullable ItemProject itemProject) {
        I().h(project, itemProject);
    }

    @NotNull
    protected abstract T getViewModel();

    @Override // com.planner5d.library.widget.editor.helper.g1.j
    @NotNull
    public Observable<Void> loadedProject(@Nullable Project project, @Nullable ItemProject itemProject, @Nullable Bundle bundle) {
        d0(project, itemProject);
        Observable observableFlatMap = G().B0().flatMap(new Func1() { // from class: com.planner5d.library.activity.fragment.smartwizard.l
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return SmartWizardEditor3DFragment.Z(this.f135600a, (com.planner5d.library.widget.editor.editor3d.scene3d.j) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        if (!Intrinsics.areEqual(getViewModel().c0().f(), Boolean.TRUE)) {
            return false;
        }
        getViewModel().W();
        getViewModel().k0();
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.projects.Editor3dFragment, com.planner5d.library.activity.fragment.FragmentController
    protected void w(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.w(view, bundle);
        getViewModel().t0(getArguments());
        if (!getViewModel().i0()) {
            getViewModel().r0();
        }
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            m1.t(activity.getWindow(), 48);
        }
        getViewModel().c0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SmartWizardEditor3DFragment.e0(this.f135601a, (Boolean) obj);
            }
        }));
    }
}
