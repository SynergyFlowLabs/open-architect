package com.planner5d.library.activity.fragment.smartwizard.decorator;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.planner5d.library.activity.fragment.projects.Project2D;
import com.planner5d.library.activity.fragment.projects.Project3D;
import com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor3DFragment;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.databinding.n0;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.g3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.editor.facade.e0;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.preloader.t;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@e.a({"ClickableViewAccessibility"})
@SourceDebugExtension({"SMAP\nDecoratorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecoratorFragment.kt\ncom/planner5d/library/activity/fragment/smartwizard/decorator/DecoratorFragment\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,173:1\n12#2,6:174\n28#2:180\n257#3,2:181\n257#3,2:183\n257#3,2:185\n1863#4,2:187\n*S KotlinDebug\n*F\n+ 1 DecoratorFragment.kt\ncom/planner5d/library/activity/fragment/smartwizard/decorator/DecoratorFragment\n*L\n40#1:174,6\n40#1:180\n164#1:181,2\n166#1:183,2\n167#1:185,2\n80#1:187,2\n*E\n"})
public final class DecoratorFragment extends SmartWizardEditor3DFragment<l> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final f0 f135398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private n0 f135399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private h0 f135400m;

    @ij.a
    public fg.e<NetworkErrorUtility> networkErrorUtility;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f135401a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f135401a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f135401a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f135401a.invoke(obj);
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

    public DecoratorFragment() {
        t3 t3Var = t3.f229751a;
        int i10 = 7 >> 0;
        this.f135398k = new i2(j1.d(l.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        com.planner5d.library.application.b.f142455c.a().x2(this);
    }

    private final void A0() {
        n0 n0Var = this.f135399l;
        if (n0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n0Var = null;
        }
        MaterialButton materialButton = n0Var.f159372c;
        materialButton.setEnabled((q0() || I().getModel() == null || getViewModel().X0() <= 0) ? false : true);
        Intrinsics.checkNotNull(materialButton);
        materialButton.setVisibility(!getViewModel().S0() ? 0 : 8);
        MaterialButton buttonSave = n0Var.f159374e;
        Intrinsics.checkNotNullExpressionValue(buttonSave, "buttonSave");
        buttonSave.setVisibility(getViewModel().S0() ? 0 : 8);
        MaterialButton buttonRefresh = n0Var.f159373d;
        Intrinsics.checkNotNullExpressionValue(buttonRefresh, "buttonRefresh");
        buttonRefresh.setVisibility(getViewModel().S0() ? 0 : 8);
    }

    private final Unit B0(Bundle bundle) {
        com.planner5d.library.activity.helper.event.content.c cVarD = this.f131538b.d(Project2D.class);
        if (cVarD == null) {
            cVarD = this.f131538b.d(Project3D.class);
        }
        if (cVarD == null) {
            return null;
        }
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i(bundle);
        r rVar = r.aiDesignerRoomId;
        Bundle arguments = getArguments();
        cVarD.a(iVar.j(rVar, arguments != null ? arguments.getString(rVar.f224891a, null) : null).i(r.aiDesignerStatistics, getViewModel().Y0()).a());
        com.planner5d.library.activity.fragment.x.g(this.f131538b, cVarD, false, 2, null);
        return Unit.f312394a;
    }

    private final String o0(com.planner5d.library.smartwizard.data.a aVar) {
        int iZ = h3.z(getContext(), aVar.b(), v.b.f43988e);
        if (iZ <= 0) {
            return aVar.c();
        }
        String string = getString(iZ);
        Intrinsics.checkNotNull(string);
        return string;
    }

    private final boolean q0() {
        com.planner5d.library.activity.fragment.smartwizard.d dVarF = getViewModel().V0().f();
        if (dVarF != null) {
            return dVarF.n();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(DecoratorFragment decoratorFragment, View view) {
        decoratorFragment.getViewModel().Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(final DecoratorFragment decoratorFragment, View view) {
        Project model = decoratorFragment.I().getModel();
        if (model == null) {
            return;
        }
        decoratorFragment.getViewModel().b1(model, new Function2() { // from class: com.planner5d.library.activity.fragment.smartwizard.decorator.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DecoratorFragment.t0(this.f135402a, (Project) obj, (Bundle) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(DecoratorFragment decoratorFragment, Project project, Bundle projectData) {
        Intrinsics.checkNotNullParameter(project, "<unused var>");
        Intrinsics.checkNotNullParameter(projectData, "projectData");
        if (decoratorFragment.getViewModel().j0()) {
            decoratorFragment.B0(projectData);
            return Unit.f312394a;
        }
        c2 c2VarK = decoratorFragment.K();
        ErrorMessageException errorMessageExceptionCreateNoInternetException = ErrorMessageException.createNoInternetException();
        Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateNoInternetException, "createNoInternetException(...)");
        c2VarK.c(errorMessageExceptionCreateNoInternetException);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(DecoratorFragment decoratorFragment, View view) {
        decoratorFragment.getViewModel().a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(DecoratorFragment decoratorFragment, com.planner5d.library.activity.fragment.smartwizard.d dVar) {
        h0 h0Var = null;
        if (!dVar.n() || dVar.o() == null) {
            h0 h0Var2 = decoratorFragment.f135400m;
            if (h0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preloader");
            } else {
                h0Var = h0Var2;
            }
            h0Var.b();
        } else {
            h0 h0Var3 = decoratorFragment.f135400m;
            if (h0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preloader");
            } else {
                h0Var = h0Var3;
            }
            h0Var.a(dVar.o().intValue(), true);
        }
        decoratorFragment.A0();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(DecoratorFragment decoratorFragment, JSONObject jSONObject) {
        decoratorFragment.getViewModel().Z0(jSONObject, decoratorFragment);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(final DecoratorFragment decoratorFragment, List list) {
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.planner5d.library.smartwizard.data.a aVar = (com.planner5d.library.smartwizard.data.a) it.next();
            Chip chip = new Chip(decoratorFragment.getContext());
            chip.setId(View.generateViewId());
            chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.decorator.i
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    DecoratorFragment.y0(this.f135410a, aVar, compoundButton, z10);
                }
            });
            chip.setText(decoratorFragment.o0(aVar));
            chip.setCheckable(true);
            chip.setCheckedIconVisible(false);
            chip.setChipBackgroundColor(androidx.core.content.d.h(chip.getContext(), com.planner5d.library.f.C1549f.f166474k2));
            chip.setChipStrokeColor(androidx.core.content.d.h(chip.getContext(), com.planner5d.library.f.C1549f.f166498l2));
            chip.setChipStrokeWidth(chip.getContext().getResources().getDimension(com.planner5d.library.f.g.Mg));
            chip.setTextColor(androidx.core.content.d.h(chip.getContext(), com.planner5d.library.f.C1549f.f166522m2));
            chip.setEnsureMinTouchTargetSize(false);
            chip.setLayoutParams(new ConstraintLayout.b(-2, -2));
            n0 n0Var = decoratorFragment.f135399l;
            n0 n0Var2 = null;
            if (n0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                n0Var = null;
            }
            n0Var.f159371b.addView(chip);
            n0 n0Var3 = decoratorFragment.f135399l;
            if (n0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                n0Var2 = n0Var3;
            }
            n0Var2.f159376g.o(chip);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(DecoratorFragment decoratorFragment, com.planner5d.library.smartwizard.data.a aVar, CompoundButton compoundButton, boolean z10) {
        decoratorFragment.getViewModel().c1(aVar.a(), z10);
        decoratorFragment.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(DecoratorFragment decoratorFragment, Exception exc) throws Exception {
        if (!(exc instanceof ErrorMessageException)) {
            NetworkErrorUtility networkErrorUtility = decoratorFragment.getNetworkErrorUtility$P5D_Library_release().get();
            Context contextRequireContext = decoratorFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Intrinsics.checkNotNull(exc);
            if (!networkErrorUtility.isNetworkError(contextRequireContext, exc)) {
                throw exc;
            }
        }
        decoratorFragment.K().c(exc);
        decoratorFragment.f131538b.j();
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.projects.Editor3dFragment
    @NotNull
    protected ViewGroup H() {
        n0 n0Var = this.f135399l;
        if (n0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n0Var = null;
        }
        FrameLayout editor = n0Var.f159375f;
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        return editor;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor3DFragment
    protected void d0(@Nullable Project project, @Nullable ItemProject itemProject) {
        super.d0(project, itemProject);
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = I().G().G1();
        if (bVarG1 != null) {
            e0 e0VarF = I().F();
            com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarA = new com.planner5d.library.widget.editor.projectresources.viewoptions.b.a(bVarG1).j(com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Isometric).a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
            e0VarF.w(bVarA);
        }
        I().F().x();
    }

    @NotNull
    public final fg.e<NetworkErrorUtility> getNetworkErrorUtility$P5D_Library_release() {
        fg.e<NetworkErrorUtility> eVar = this.networkErrorUtility;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("networkErrorUtility");
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor3DFragment, com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        getViewModel().O0(StatisticsEventAiDesigner.a.back);
        return super.onBackPressed();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        getViewModel().f1(getArguments(), this);
        getViewModel().s0(g3.f216952a.a(getArguments()));
        int i10 = 6 >> 0;
        n0 n0VarD = n0.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(n0VarD, "inflate(...)");
        this.f135400m = new t(n0VarD.f159378i).a().l(Integer.valueOf(androidx.core.content.d.g(requireContext(), com.planner5d.library.f.C1549f.f166593p1)));
        n0VarD.f159372c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.decorator.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DecoratorFragment.r0(this.f135403a, view);
            }
        });
        n0VarD.f159374e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.decorator.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DecoratorFragment.s0(this.f135404a, view);
            }
        });
        n0VarD.f159373d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.decorator.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DecoratorFragment.u0(this.f135405a, view);
            }
        });
        this.f135399l = n0VarD;
        ConstraintLayout root = n0VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor3DFragment
    @NotNull
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public l getViewModel() {
        return (l) this.f135398k.getValue();
    }

    public final void setNetworkErrorUtility$P5D_Library_release(@NotNull fg.e<NetworkErrorUtility> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.networkErrorUtility = eVar;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor3DFragment, com.planner5d.library.activity.fragment.projects.Editor3dFragment, com.planner5d.library.activity.fragment.FragmentController
    protected void w(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.w(view, bundle);
        getViewModel().R0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.decorator.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DecoratorFragment.x0(this.f135406a, (List) obj);
            }
        }));
        getViewModel().U0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.decorator.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DecoratorFragment.z0(this.f135407a, (Exception) obj);
            }
        }));
        getViewModel().V0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.decorator.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DecoratorFragment.v0(this.f135408a, (com.planner5d.library.activity.fragment.smartwizard.d) obj);
            }
        }));
        getViewModel().W0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.decorator.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DecoratorFragment.w0(this.f135409a, (JSONObject) obj);
            }
        }));
    }
}
