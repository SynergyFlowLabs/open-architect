package com.planner5d.library.spaces.view.survey.style;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.navigation.c2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.spaces.entity.SpacesProjectData;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSurveyStepStyleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyStepStyleFragment.kt\ncom/planner5d/library/spaces/view/survey/style/SurveyStepStyleFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 ViewUtils.kt\ncom/planner5d/library/services/utility/ViewUtils\n*L\n1#1,64:1\n16#2:65\n190#3,12:66\n*S KotlinDebug\n*F\n+ 1 SurveyStepStyleFragment.kt\ncom/planner5d/library/spaces/view/survey/style/SurveyStepStyleFragment\n*L\n21#1:65\n50#1:66,12\n*E\n"})
public final class SurveyStepStyleFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f230605a = new i2(j1.d(l.class), new b(), new c(com.planner5d.library.spaces.application.e.f229982b.a()), null, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ee.l f230606b;

    public static final class a extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f230607a;

        a(int i10) {
            this.f230607a = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.c0 state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int i10 = this.f230607a;
            outRect.top = i10;
            outRect.bottom = i10;
            outRect.left = i10;
            outRect.right = i10;
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 SurveyStepStyleFragment.kt\ncom/planner5d/library/spaces/view/survey/style/SurveyStepStyleFragment\n*L\n1#1,16:1\n21#2:17\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return SurveyStepStyleFragment.this.getViewModelStore();
        }
    }

    public static final class c implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230609a;

        public c(com.planner5d.library.view.b bVar) {
            this.f230609a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230609a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(SurveyStepStyleFragment surveyStepStyleFragment, ee.l lVar, View view) {
        if (surveyStepStyleFragment.y().V()) {
            com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
            androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(surveyStepStyleFragment);
            j.a aVarA = j.a(surveyStepStyleFragment.y().W());
            Intrinsics.checkNotNullExpressionValue(aVarA, "toInfo(...)");
            kVar.d(w0VarA, aVarA, new Function2() { // from class: com.planner5d.library.spaces.view.survey.style.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyStepStyleFragment.B((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
            return;
        }
        SpacesProjectData spacesProjectDataU = surveyStepStyleFragment.y().U();
        if (!(spacesProjectDataU != null ? spacesProjectDataU.r() : false)) {
            com.planner5d.library.util.navigation.k kVar2 = com.planner5d.library.util.navigation.k.f240224a;
            androidx.navigation.w0 w0VarA2 = androidx.navigation.fragment.f.a(surveyStepStyleFragment);
            c2 c2VarB = j.b();
            Intrinsics.checkNotNullExpressionValue(c2VarB, "toMoreLoading(...)");
            kVar2.d(w0VarA2, c2VarB, new Function2() { // from class: com.planner5d.library.spaces.view.survey.style.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyStepStyleFragment.C((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
            return;
        }
        y3 y3Var = y3.f229862a;
        ViewParent root = lVar.getRoot();
        while (!(root instanceof ff.a)) {
            root = root != null ? root.getParent() : null;
            if (root == null) {
                timber.log.b.f381052a.e(new RuntimeException("Expected parent not found"));
                root = null;
                break;
            }
        }
        ff.a aVar = (ff.a) root;
        if (aVar != null) {
            aVar.onOnboardingStepComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(SurveyStepStyleFragment surveyStepStyleFragment, View view) {
        androidx.navigation.fragment.f.a(surveyStepStyleFragment).z0();
    }

    private final l y() {
        return (l) this.f230605a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(ee.l lVar, boolean z10) {
        lVar.f274836b.setEnabled(z10);
        return Unit.f312394a;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final ee.l lVarC = ee.l.c(inflater);
        Intrinsics.checkNotNullExpressionValue(lVarC, "inflate(...)");
        lVarC.f274837c.setAdapter(new d(new Function1() { // from class: com.planner5d.library.spaces.view.survey.style.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyStepStyleFragment.z(lVarC, ((Boolean) obj).booleanValue());
            }
        }));
        lVarC.f274837c.n(new a(getResources().getDimensionPixelSize(de.b.f.Gd)));
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        staggeredGridLayoutManager.r3(0);
        lVarC.f274837c.setLayoutManager(staggeredGridLayoutManager);
        lVarC.f274836b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.survey.style.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SurveyStepStyleFragment.A(this.f230620a, lVarC, view);
            }
        });
        lVarC.f274838d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.survey.style.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SurveyStepStyleFragment.D(this.f230622a, view);
            }
        });
        this.f230606b = lVarC;
        ConstraintLayout root = lVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
