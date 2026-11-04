package com.planner5d.library.uploadplan.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.project.fragment.navigation.RoomTypeNavigationFragment;
import com.planner5d.library.services.utility.k3;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nUploadPlanCreateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadPlanCreateFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanCreateFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n16#2:88\n1#3:89\n*S KotlinDebug\n*F\n+ 1 UploadPlanCreateFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanCreateFragment\n*L\n27#1:88\n*E\n"})
public final class UploadPlanCreateFragment extends UploadPlanBaseFragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f230837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f230838f;

    @ij.a
    public com.planner5d.library.model.manager.payments.b0 superwallUseCase;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f230839a;

        static {
            int[] iArr = new int[l.b.values().length];
            try {
                iArr[l.b.Create.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.b.Upload.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.b.Back.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.b.SmartWizard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f230839a = iArr;
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f230840a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f230840a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f230840a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f230840a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 UploadPlanCreateFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanCreateFragment\n*L\n1#1,16:1\n27#2:17\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return UploadPlanCreateFragment.this.getViewModelStore();
        }
    }

    public static final class d implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230842a;

        public d(com.planner5d.library.view.b bVar) {
            this.f230842a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230842a;
        }
    }

    public UploadPlanCreateFragment() {
        Function0 function0 = null;
        this.f230837e = new i2(j1.d(l.class), new c(), new d(com.planner5d.library.uploadplan.application.g.f230718b.a()), function0, 8, null);
    }

    private final l E() {
        return (l) this.f230837e.getValue();
    }

    private final void F(l.b bVar, long j10) {
        int i10 = bVar == null ? -1 : a.f230839a[bVar.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                E().K0(true);
                com.planner5d.library.activity.fragment.projects.e0.g0(E(), E().E0(), j10, new Bundle(), null, 8, null);
                return;
            }
            if (i10 == 2) {
                l.M0(E(), false, 1, null);
                y(new Pair<>(UploadPlanUploadFragment.class, getArguments()));
                return;
            }
            if (i10 == 3) {
                this.f131538b.j();
                return;
            }
            if (i10 != 4) {
                throw new kotlin.k0();
            }
            com.planner5d.library.model.manager.payments.b0 superwallUseCase$P5D_Library_UploadPlan_release = getSuperwallUseCase$P5D_Library_UploadPlan_release();
            androidx.fragment.app.s sVarRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            com.planner5d.library.model.manager.payments.b0.a.a(superwallUseCase$P5D_Library_UploadPlan_release, sVarRequireActivity, childFragmentManager, com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_smart_wizard_a, null, new Function0() { // from class: com.planner5d.library.uploadplan.view.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UploadPlanCreateFragment.G(this.f230908a);
                }
            }, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(UploadPlanCreateFragment uploadPlanCreateFragment) {
        uploadPlanCreateFragment.E().L0(false);
        com.planner5d.library.activity.fragment.x xVar = uploadPlanCreateFragment.f131538b;
        Bundle arguments = uploadPlanCreateFragment.getArguments();
        if (arguments != null) {
            arguments.putBoolean(com.planner5d.library.services.r.smartWizardPipeline.f224891a, true);
            Unit unit = Unit.f312394a;
        } else {
            arguments = null;
        }
        xVar.f(new oe.a((Class<? extends FragmentController>) RoomTypeNavigationFragment.class, arguments), true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(UploadPlanCreateFragment uploadPlanCreateFragment, l.c cVar) {
        boolean zF = cVar.f();
        String string = uploadPlanCreateFragment.getString(he.b.s.gF);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        com.planner5d.library.activity.helper.ui.d.f(uploadPlanCreateFragment, new com.planner5d.library.activity.helper.ui.b(zF, new k3(string), cVar.f()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(UploadPlanCreateFragment uploadPlanCreateFragment, long j10, l.b bVar) {
        uploadPlanCreateFragment.F(bVar, j10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(ie.j jVar, final UploadPlanCreateFragment uploadPlanCreateFragment, List list) {
        RecyclerView recyclerView = jVar.f287162b;
        Intrinsics.checkNotNull(list);
        recyclerView.setAdapter(new com.planner5d.library.uploadplan.view.b(list, new Function1() { // from class: com.planner5d.library.uploadplan.view.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadPlanCreateFragment.K(this.f231030a, (c.a) obj);
            }
        }));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(UploadPlanCreateFragment uploadPlanCreateFragment, com.planner5d.library.uploadplan.view.c.a tile) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        uploadPlanCreateFragment.E().J0(tile);
        return Unit.f312394a;
    }

    @NotNull
    public final com.planner5d.library.model.manager.payments.b0 getSuperwallUseCase$P5D_Library_UploadPlan_release() {
        com.planner5d.library.model.manager.payments.b0 b0Var = this.superwallUseCase;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("superwallUseCase");
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final ie.j jVarC = ie.j.c(inflater);
        com.planner5d.library.uploadplan.application.g.f230718b.a().k(this);
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        this.f230838f = jVar.t(com.planner5d.library.services.r.source, "my_projects");
        final long jD = jVar.d(com.planner5d.library.services.r.folder, 0L);
        com.planner5d.library.activity.helper.ui.d.h(this, new k3(he.b.s.f284383u0, new Object[0]));
        E().I0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.uploadplan.view.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadPlanCreateFragment.H(this.f231021a, (l.c) obj);
            }
        }));
        E().H0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.uploadplan.view.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadPlanCreateFragment.I(this.f231023a, jD, (l.b) obj);
            }
        }));
        E().G0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.uploadplan.view.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadPlanCreateFragment.J(jVarC, this, (List) obj);
            }
        }));
        ConstraintLayout constraintLayoutB = jVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    public final void setSuperwallUseCase$P5D_Library_UploadPlan_release(@NotNull com.planner5d.library.model.manager.payments.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.superwallUseCase = b0Var;
    }
}
