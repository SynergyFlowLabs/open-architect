package com.planner5d.library.spaces.view.survey.spacetype;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.navigation.c2;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.util.navigation.k;
import ee.j;
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
@SourceDebugExtension({"SMAP\nSurveyStepSpaceTypeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyStepSpaceTypeFragment.kt\ncom/planner5d/library/spaces/view/survey/spacetype/SurveyStepSpaceTypeFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n*L\n1#1,45:1\n16#2:46\n*S KotlinDebug\n*F\n+ 1 SurveyStepSpaceTypeFragment.kt\ncom/planner5d/library/spaces/view/survey/spacetype/SurveyStepSpaceTypeFragment\n*L\n18#1:46\n*E\n"})
public final class SurveyStepSpaceTypeFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f230588a = new i2(j1.d(g.class), new b(), new c(com.planner5d.library.spaces.application.e.f229982b.a()), null, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f230589b;

    public static final class a extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f230590a;

        a(int i10) {
            this.f230590a = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.c0 state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int i10 = this.f230590a;
            outRect.top = i10;
            outRect.bottom = i10;
            outRect.left = i10;
            outRect.right = i10;
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 SurveyStepSpaceTypeFragment.kt\ncom/planner5d/library/spaces/view/survey/spacetype/SurveyStepSpaceTypeFragment\n*L\n1#1,16:1\n18#2:17\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return SurveyStepSpaceTypeFragment.this.getViewModelStore();
        }
    }

    public static final class c implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230592a;

        public c(com.planner5d.library.view.b bVar) {
            this.f230592a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230592a;
        }
    }

    private final g w() {
        return (g) this.f230588a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(SurveyStepSpaceTypeFragment surveyStepSpaceTypeFragment, com.planner5d.library.spaces.data.h answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        surveyStepSpaceTypeFragment.w().U(answer.g());
        k kVar = k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(surveyStepSpaceTypeFragment);
        c2 c2VarA = f.a();
        Intrinsics.checkNotNullExpressionValue(c2VarA, "toGoals(...)");
        kVar.d(w0VarA, c2VarA, new Function2() { // from class: com.planner5d.library.spaces.view.survey.spacetype.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SurveyStepSpaceTypeFragment.y((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(SurveyStepSpaceTypeFragment surveyStepSpaceTypeFragment, View view) {
        androidx.navigation.fragment.f.a(surveyStepSpaceTypeFragment).z0();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        j jVarC = j.c(inflater);
        Intrinsics.checkNotNullExpressionValue(jVarC, "inflate(...)");
        jVarC.f274826b.setAdapter(new com.planner5d.library.spaces.view.survey.spacetype.b(new Function1() { // from class: com.planner5d.library.spaces.view.survey.spacetype.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyStepSpaceTypeFragment.x(this.f230600a, (com.planner5d.library.spaces.data.h) obj);
            }
        }));
        jVarC.f274826b.n(new a(getResources().getDimensionPixelSize(de.b.f.f271281cg)));
        jVarC.f274827c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.survey.spacetype.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SurveyStepSpaceTypeFragment.z(this.f230601a, view);
            }
        });
        this.f230589b = jVarC;
        ConstraintLayout root = jVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
