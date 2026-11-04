package com.planner5d.library.activity.fragment.projects;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.services.utility.e1;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.j2;
import com.planner5d.library.widget.editor.helper.t3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public abstract class Editor3dFragment extends FragmentController {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    protected c2 f134899e;

    @ij.a
    public com.planner5d.library.widget.editor.facade.s editorFacadeFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.widget.editor.editor3d.l f134900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f134901g = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.projects.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Editor3dFragment.F(this.f134931a);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f134902h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final a f134903i = new a();

    public static final class a implements j2.a {
        a() {
        }

        @Override // com.planner5d.library.widget.editor.helper.j2.a
        public void D(g1.j listener, Bundle bundle, t3 value, com.planner5d.library.model.manager.statistics.f0 loadCounter) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(loadCounter, "loadCounter");
        }

        @Override // com.planner5d.library.widget.editor.helper.j2.a
        public void I(Throwable th2, boolean z10) {
            if (e1.f225196a.d(Editor3dFragment.this)) {
                Editor3dFragment.this.M(th2);
            }
        }
    }

    public Editor3dFragment() {
        this.f131538b.k(new ij.c() { // from class: com.planner5d.library.activity.fragment.projects.d
            @Override // ij.c
            public final Object get() {
                return Editor3dFragment.D(this.f134935a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable D(Editor3dFragment editor3dFragment) {
        return editor3dFragment.f134902h.compareAndSet(false, true) ? editor3dFragment.O() : Observable.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.widget.editor.facade.h F(Editor3dFragment editor3dFragment) {
        return editor3dFragment.E(editor3dFragment.getEditorFacadeFactory$P5D_Library_release(), editor3dFragment.f134903i);
    }

    protected static /* synthetic */ void J() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Editor3dFragment editor3dFragment) {
        editor3dFragment.f131538b.j();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(Editor3dFragment editor3dFragment) {
        editor3dFragment.H().removeAllViews();
    }

    private final void S() {
        H().addView(G().X(getActivity()).getView());
        H().getParent().requestLayout();
        I().c(G());
        I().u(new com.planner5d.library.widget.editor.facade.a(this));
        G().y0(com.planner5d.library.widget.editor.facade.h.a.a(I(), null, this.f134903i, false, null, 8, null).doOnCompleted(new Action0() { // from class: com.planner5d.library.activity.fragment.projects.b
            @Override // rx.functions.Action0
            public final void call() {
                Editor3dFragment.T(this.f134929a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(Editor3dFragment editor3dFragment) {
        if (e1.f225196a.d(editor3dFragment)) {
            editor3dFragment.L();
        }
    }

    @NotNull
    protected abstract com.planner5d.library.widget.editor.facade.h E(@NotNull com.planner5d.library.widget.editor.facade.s sVar, @NotNull j2.a aVar);

    @NotNull
    protected final com.planner5d.library.widget.editor.editor3d.l G() {
        com.planner5d.library.widget.editor.editor3d.l lVar = this.f134900f;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editor");
        return null;
    }

    @NotNull
    protected abstract ViewGroup H();

    @NotNull
    protected final com.planner5d.library.widget.editor.facade.h I() {
        return (com.planner5d.library.widget.editor.facade.h) this.f134901g.getValue();
    }

    @NotNull
    protected final c2 K() {
        c2 c2Var = this.f134899e;
        if (c2Var != null) {
            return c2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageManager");
        return null;
    }

    protected void L() {
        I().n(false);
    }

    protected void M(@Nullable Throwable th2) {
        if (th2 instanceof OutOfMemoryError) {
            I().t();
        } else {
            if (!(th2 instanceof com.planner5d.library.widget.editor.editor3d.q.a)) {
                K().e(new com.planner5d.library.model.u(com.planner5d.library.model.u.c.Error, new k3(com.planner5d.library.f.s.D9, new Object[0]), new com.planner5d.library.model.u.a(new k3(com.planner5d.library.f.s.ss, new Object[0]), (Function0<Unit>) new Function0() { // from class: com.planner5d.library.activity.fragment.projects.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Editor3dFragment.N(this.f134927a);
                    }
                })));
            }
        }
    }

    @NotNull
    protected Observable<Void> O() {
        Observable<Void> observableMergeDelayError = Observable.mergeDelayError(I().L(true), com.planner5d.library.services.rx.i.h(new Runnable() { // from class: com.planner5d.library.activity.fragment.projects.e
            @Override // java.lang.Runnable
            public final void run() {
                Editor3dFragment.P(this.f134937a);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(observableMergeDelayError, "mergeDelayError(...)");
        return observableMergeDelayError;
    }

    protected final void Q(@NotNull com.planner5d.library.widget.editor.editor3d.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f134900f = lVar;
    }

    protected final void R(@NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.f134899e = c2Var;
    }

    @NotNull
    public final com.planner5d.library.widget.editor.facade.s getEditorFacadeFactory$P5D_Library_release() {
        com.planner5d.library.widget.editor.facade.s sVar = this.editorFacadeFactory;
        if (sVar != null) {
            return sVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editorFacadeFactory");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        com.planner5d.library.application.b.f142455c.a().Y(this);
    }

    public final void setEditorFacadeFactory$P5D_Library_release(@NotNull com.planner5d.library.widget.editor.facade.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        this.editorFacadeFactory = sVar;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void w(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        S();
    }
}
