package com.planner5d.library.activity.fragment.smartwizard.roomstyle;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.projects.Project2D;
import com.planner5d.library.activity.fragment.projects.Project3D;
import com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor3DFragment;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.databinding.l0;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.payments.b0;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.g3;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.editor.facade.e0;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.preloader.t;
import com.planner5d.library.widget.textview.ButtonTextView;
import java.util.List;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
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
@SourceDebugExtension({"SMAP\nChooseRoomStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseRoomStyle.kt\ncom/planner5d/library/activity/fragment/smartwizard/roomstyle/ChooseRoomStyle\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,192:1\n12#2,6:193\n28#2:199\n257#3,2:200\n*S KotlinDebug\n*F\n+ 1 ChooseRoomStyle.kt\ncom/planner5d/library/activity/fragment/smartwizard/roomstyle/ChooseRoomStyle\n*L\n43#1:193,6\n43#1:199\n136#1:200,2\n*E\n"})
public final class ChooseRoomStyle extends SmartWizardEditor3DFragment<n> implements g1.j {
    public static final int $stable = 8;

    @ij.a
    public y0 imageManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final f0 f135649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private q f135650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l0 f135651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f135652n;

    @ij.a
    public fg.e<NetworkErrorUtility> networkErrorUtility;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f135653o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h0 f135654s;

    @ij.a
    public fg.e<b0> superwallUseCase;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f135655a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f135655a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f135655a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f135655a.invoke(obj);
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

    public ChooseRoomStyle() {
        t3 t3Var = t3.f229751a;
        this.f135649k = new i2(j1.d(n.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        com.planner5d.library.services.bitmaploader.target.h hVarA = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        Intrinsics.checkNotNullExpressionValue(hVarA, "create(...)");
        this.f135652n = hVarA;
        com.planner5d.library.application.b.f142455c.a().A(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    public static final Unit A0(ChooseRoomStyle chooseRoomStyle, Boolean bool) {
        boolean z10;
        l0 l0Var = chooseRoomStyle.f135651m;
        if (l0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l0Var = null;
        }
        ButtonTextView buttonTextView = l0Var.f159258e;
        if (bool.booleanValue()) {
            com.planner5d.library.activity.fragment.smartwizard.d dVarF = chooseRoomStyle.getViewModel().R0().f();
            z10 = (dVarF == null || !dVarF.n()) && chooseRoomStyle.I().getModel() != null;
        }
        buttonTextView.setEnabled(z10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(ChooseRoomStyle chooseRoomStyle, List list) {
        q qVar = chooseRoomStyle.f135650l;
        if (qVar != null) {
            Intrinsics.checkNotNull(list);
            qVar.i(list);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C0(ChooseRoomStyle chooseRoomStyle, Integer num) {
        l0 l0Var = chooseRoomStyle.f135651m;
        if (l0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l0Var = null;
        }
        ButtonTextView moreButton = l0Var.f159257d;
        Intrinsics.checkNotNullExpressionValue(moreButton, "moreButton");
        moreButton.setVisibility(num.intValue() > 0 ? 0 : 8);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D0(ChooseRoomStyle chooseRoomStyle, Exception exc) {
        if (!(exc instanceof ErrorMessageException)) {
            NetworkErrorUtility networkErrorUtility = chooseRoomStyle.getNetworkErrorUtility$P5D_Library_release().get();
            Context contextRequireContext = chooseRoomStyle.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Intrinsics.checkNotNull(exc);
            if (!networkErrorUtility.isNetworkError(contextRequireContext, exc)) {
                exc = new ErrorMessageException(exc, com.planner5d.library.f.s.f169250lb, new String[0]);
            }
        }
        chooseRoomStyle.K().c(exc);
        chooseRoomStyle.f131538b.j();
        return Unit.f312394a;
    }

    private final void E0(Project project) {
        com.planner5d.library.activity.fragment.x.g(this.f131538b, new com.planner5d.library.activity.helper.event.content.d(project, false, (Bundle) null, true, (com.planner5d.library.activity.helper.event.content.a) null), false, 2, null);
    }

    private final void F0(Function0<Unit> function0) {
        if (getViewModel().i0()) {
            function0.invoke();
            return;
        }
        b0 b0Var = getSuperwallUseCase$P5D_Library_release().get();
        androidx.fragment.app.s sVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        b0Var.a(sVarRequireActivity, childFragmentManager, com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_smart_wizard_b, null, function0);
    }

    private final void G0(Bundle bundle) {
        com.planner5d.library.activity.helper.event.content.c cVarD = this.f131538b.d(Project2D.class);
        if (cVarD == null) {
            cVarD = this.f131538b.d(Project3D.class);
        }
        if (cVarD != null) {
            com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i(bundle);
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.aiDesignerRoomId;
            Bundle arguments = getArguments();
            cVarD.a(iVar.j(rVar, arguments != null ? arguments.getString(rVar.f224891a, null) : null).i(com.planner5d.library.services.r.aiDesignerStatistics, getViewModel().W0()).a());
            com.planner5d.library.activity.fragment.x.g(this.f131538b, cVarD, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(ChooseRoomStyle chooseRoomStyle, com.planner5d.library.smartwizard.data.e style) {
        Intrinsics.checkNotNullParameter(style, "style");
        l0 l0Var = chooseRoomStyle.f135651m;
        if (l0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l0Var = null;
        }
        RecyclerView recyclerView = l0Var.f159260g;
        q qVar = chooseRoomStyle.f135650l;
        recyclerView.V1(qVar != null ? qVar.j(style) : 0);
        chooseRoomStyle.getViewModel().c1(style);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(final ChooseRoomStyle chooseRoomStyle, View view) {
        chooseRoomStyle.getViewModel().P0(StatisticsEventAiDesigner.a.completed);
        final Project model = chooseRoomStyle.I().getModel();
        if (model == null) {
            return;
        }
        chooseRoomStyle.F0(new Function0() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChooseRoomStyle.u0(this.f135661a, model);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(final ChooseRoomStyle chooseRoomStyle, Project project) {
        chooseRoomStyle.getViewModel().a1(project, new Function2() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.k
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ChooseRoomStyle.v0(this.f135779a, (Project) obj, (Bundle) obj2);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(ChooseRoomStyle chooseRoomStyle, Project updatedProject, Bundle projectData) {
        Intrinsics.checkNotNullParameter(updatedProject, "updatedProject");
        Intrinsics.checkNotNullParameter(projectData, "projectData");
        if (!chooseRoomStyle.getViewModel().j0()) {
            c2 c2VarK = chooseRoomStyle.K();
            ErrorMessageException errorMessageExceptionCreateNoInternetException = ErrorMessageException.createNoInternetException();
            Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateNoInternetException, "createNoInternetException(...)");
            c2VarK.c(errorMessageExceptionCreateNoInternetException);
            return Unit.f312394a;
        }
        Bundle arguments = chooseRoomStyle.getArguments();
        if (arguments == null || !arguments.getBoolean(com.planner5d.library.services.r.smartWizardForEditor.f224891a, false)) {
            chooseRoomStyle.E0(updatedProject);
        } else {
            chooseRoomStyle.G0(projectData);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(ChooseRoomStyle chooseRoomStyle, View view) {
        chooseRoomStyle.getViewModel().d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(ChooseRoomStyle chooseRoomStyle, com.planner5d.library.activity.fragment.smartwizard.d dVar) {
        l0 l0Var = null;
        if (!dVar.n() || dVar.o() == null) {
            h0 h0Var = chooseRoomStyle.f135654s;
            if (h0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preloader");
                h0Var = null;
            }
            h0Var.b();
        } else {
            h0 h0Var2 = chooseRoomStyle.f135654s;
            if (h0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preloader");
                h0Var2 = null;
            }
            h0Var2.a(dVar.o().intValue(), true);
        }
        l0 l0Var2 = chooseRoomStyle.f135651m;
        if (l0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            l0Var = l0Var2;
        }
        l0Var.f159258e.setEnabled((dVar.n() || !Intrinsics.areEqual(chooseRoomStyle.getViewModel().Z().f(), Boolean.TRUE) || chooseRoomStyle.I().getModel() == null) ? false : true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(ChooseRoomStyle chooseRoomStyle, Boolean bool) {
        l0 l0Var = chooseRoomStyle.f135651m;
        if (l0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l0Var = null;
        }
        l0Var.f159257d.setEnabled(!bool.booleanValue());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(ChooseRoomStyle chooseRoomStyle, JSONObject jSONObject) {
        chooseRoomStyle.getViewModel().Y0(jSONObject, chooseRoomStyle);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.projects.Editor3dFragment
    @NotNull
    protected ViewGroup H() {
        l0 l0Var = this.f135651m;
        if (l0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l0Var = null;
        }
        FrameLayout editor = l0Var.f159256c;
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        return editor;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor3DFragment
    protected void d0(@Nullable Project project, @Nullable ItemProject itemProject) {
        super.d0(project, itemProject);
        if (this.f135653o) {
            return;
        }
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = I().G().G1();
        if (bVarG1 != null) {
            e0 e0VarF = I().F();
            com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarA = new com.planner5d.library.widget.editor.projectresources.viewoptions.b.a(bVarG1).j(com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.Isometric).a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
            e0VarF.w(bVarA);
        }
        I().F().x();
        this.f135653o = true;
    }

    @NotNull
    public final y0 getImageManager$P5D_Library_release() {
        y0 y0Var = this.imageManager;
        if (y0Var != null) {
            return y0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageManager");
        return null;
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

    @NotNull
    public final fg.e<b0> getSuperwallUseCase$P5D_Library_release() {
        fg.e<b0> eVar = this.superwallUseCase;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("superwallUseCase");
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor3DFragment, com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        getViewModel().P0(StatisticsEventAiDesigner.a.back);
        return super.onBackPressed();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        getViewModel().f1(getArguments());
        getViewModel().s0(g3.f216952a.a(getArguments()));
        this.f135650l = new q(this.f135652n, getImageManager$P5D_Library_release(), new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseRoomStyle.s0(this.f135780a, (com.planner5d.library.smartwizard.data.e) obj);
            }
        });
        l0 l0VarD = l0.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(l0VarD, "inflate(...)");
        this.f135654s = new t(l0VarD.f159259f).a().l(Integer.valueOf(androidx.core.content.d.g(requireContext(), com.planner5d.library.f.C1549f.f166593p1)));
        l0VarD.f159260g.setAdapter(this.f135650l);
        RecyclerView stylesList = l0VarD.f159260g;
        Intrinsics.checkNotNullExpressionValue(stylesList, "stylesList");
        Context context = l0VarD.f159260g.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        com.planner5d.library.widget.x.i(stylesList, context, null, Integer.valueOf(com.planner5d.library.f.g.Hh), null);
        new androidx.recyclerview.widget.t().b(l0VarD.f159260g);
        if (getViewModel().i0()) {
            l0VarD.f159258e.setText(getString(com.planner5d.library.f.s.eC));
        }
        l0VarD.f159258e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseRoomStyle.t0(this.f135781a, view);
            }
        });
        l0VarD.f159257d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseRoomStyle.w0(this.f135660a, view);
            }
        });
        this.f135651m = l0VarD;
        ConstraintLayout root = l0VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f135652n.a();
        this.f135650l = null;
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor3DFragment
    @NotNull
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public n getViewModel() {
        return (n) this.f135649k.getValue();
    }

    public final void setImageManager$P5D_Library_release(@NotNull y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        this.imageManager = y0Var;
    }

    public final void setNetworkErrorUtility$P5D_Library_release(@NotNull fg.e<NetworkErrorUtility> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.networkErrorUtility = eVar;
    }

    public final void setSuperwallUseCase$P5D_Library_release(@NotNull fg.e<b0> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.superwallUseCase = eVar;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor3DFragment, com.planner5d.library.activity.fragment.projects.Editor3dFragment, com.planner5d.library.activity.fragment.FragmentController
    protected void w(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.w(view, bundle);
        getViewModel().X0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseRoomStyle.B0(this.f135659a, (List) obj);
            }
        }));
        getViewModel().S0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseRoomStyle.C0(this.f135663a, (Integer) obj);
            }
        }));
        getViewModel().Q0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseRoomStyle.D0(this.f135664a, (Exception) obj);
            }
        }));
        getViewModel().R0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseRoomStyle.x0(this.f135665a, (com.planner5d.library.activity.fragment.smartwizard.d) obj);
            }
        }));
        getViewModel().c0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseRoomStyle.y0(this.f135666a, (Boolean) obj);
            }
        }));
        getViewModel().U0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseRoomStyle.z0(this.f135667a, (JSONObject) obj);
            }
        }));
        getViewModel().Z().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseRoomStyle.A0(this.f135778a, (Boolean) obj);
            }
        }));
    }
}
