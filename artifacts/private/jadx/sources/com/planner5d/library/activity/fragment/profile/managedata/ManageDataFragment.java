package com.planner5d.library.activity.fragment.profile.managedata;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import com.planner5d.library.activity.form.e;
import com.planner5d.library.activity.fragment.settings.ViewDataRemoval;
import com.planner5d.library.activity.fragment.settings.ViewManagedFiles;
import com.planner5d.library.application.d;
import com.planner5d.library.databinding.g1;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.managedfiles.v;
import com.planner5d.library.modules.user.user.m0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.util.navigation.uiview.f;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.g0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class ManageDataFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private e f134708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g1 f134709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f134710c = f.c(this);

    @ij.a
    public d configuration;

    @ij.a
    public b2 messageManager;

    @ij.a
    public t userAuthorization;

    @ij.a
    public m0 userPrivateData;

    @ij.a
    public com.planner5d.library.activity.fragment.profile.a viewModel;

    /* synthetic */ class a extends g0 implements Function1<v, Unit> {
        a(Object obj) {
            super(1, obj, ViewManagedFiles.class, "update", "update(Lcom/planner5d/library/model/manager/managedfiles/DatafileState;)V", 0);
        }

        public final void X(v p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            ((ViewManagedFiles) this.receiver).y(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(v vVar) {
            X(vVar);
            return Unit.f312394a;
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134711a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134711a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f134711a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134711a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public ManageDataFragment() {
        com.planner5d.library.application.b.f142455c.a().E1(this);
    }

    private final com.planner5d.library.util.navigation.uiview.c v() {
        return (com.planner5d.library.util.navigation.uiview.c) this.f134710c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(ManageDataFragment manageDataFragment, View view) {
        manageDataFragment.getViewModel$P5D_Library_release().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(ManageDataFragment manageDataFragment, View view) {
        manageDataFragment.getViewModel$P5D_Library_release().f();
    }

    @NotNull
    public final d getConfiguration$P5D_Library_release() {
        d dVar = this.configuration;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ProjectEntry.configuration);
        return null;
    }

    @NotNull
    public final b2 getMessageManager$P5D_Library_release() {
        b2 b2Var = this.messageManager;
        if (b2Var != null) {
            return b2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageManager");
        return null;
    }

    @NotNull
    public final t getUserAuthorization$P5D_Library_release() {
        t tVar = this.userAuthorization;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAuthorization");
        return null;
    }

    @NotNull
    public final m0 getUserPrivateData$P5D_Library_release() {
        m0 m0Var = this.userPrivateData;
        if (m0Var != null) {
            return m0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userPrivateData");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.profile.a getViewModel$P5D_Library_release() {
        com.planner5d.library.activity.fragment.profile.a aVar = this.viewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        g1 g1VarD = g1.d(inflater, viewGroup, false);
        this.f134709b = g1VarD;
        g1VarD.f159000b.x(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.managedata.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageDataFragment.w(this.f134712a, view);
            }
        }, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.managedata.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageDataFragment.x(this.f134713a, view);
            }
        });
        com.planner5d.library.widget.preloader.t tVar = new com.planner5d.library.widget.preloader.t(g1VarD.f159002d);
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(getContext(), this).x();
        tVar.a().g(Integer.valueOf(dVarX.f137146m)).h(Integer.valueOf(dVarX.f137144k));
        s sVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        ViewDataRemoval manageDataPersonal = g1VarD.f159001c;
        Intrinsics.checkNotNullExpressionValue(manageDataPersonal, "manageDataPersonal");
        this.f134708a = new e(sVarRequireActivity, manageDataPersonal, tVar, getUserAuthorization$P5D_Library_release(), getMessageManager$P5D_Library_release(), getUserPrivateData$P5D_Library_release(), v());
        FrameLayout root = g1VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        g1 g1Var = this.f134709b;
        g1 g1Var2 = null;
        if (g1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g1Var = null;
        }
        u1.j2(g1Var.getRoot(), new ef.b());
        androidx.lifecycle.w0<v> w0VarB = getViewModel$P5D_Library_release().b();
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        g1 g1Var3 = this.f134709b;
        if (g1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g1Var2 = g1Var3;
        }
        w0VarB.k(viewLifecycleOwner, new b(new a(g1Var2.f159000b)));
    }

    public final void setConfiguration$P5D_Library_release(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.configuration = dVar;
    }

    public final void setMessageManager$P5D_Library_release(@NotNull b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "<set-?>");
        this.messageManager = b2Var;
    }

    public final void setUserAuthorization$P5D_Library_release(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.userAuthorization = tVar;
    }

    public final void setUserPrivateData$P5D_Library_release(@NotNull m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<set-?>");
        this.userPrivateData = m0Var;
    }

    public final void setViewModel$P5D_Library_release(@NotNull com.planner5d.library.activity.fragment.profile.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.viewModel = aVar;
    }
}
