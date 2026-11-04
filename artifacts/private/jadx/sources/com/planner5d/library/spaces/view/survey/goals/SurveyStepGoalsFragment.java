package com.planner5d.library.spaces.view.survey.goals;

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
import com.planner5d.library.util.navigation.k;
import com.planner5d.library.widget.g0;
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
@SourceDebugExtension({"SMAP\nSurveyStepGoalsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyStepGoalsFragment.kt\ncom/planner5d/library/spaces/view/survey/goals/SurveyStepGoalsFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n*L\n1#1,42:1\n16#2:43\n*S KotlinDebug\n*F\n+ 1 SurveyStepGoalsFragment.kt\ncom/planner5d/library/spaces/view/survey/goals/SurveyStepGoalsFragment\n*L\n17#1:43\n*E\n"})
public final class SurveyStepGoalsFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f230544a = new i2(j1.d(i.class), new a(), new b(com.planner5d.library.spaces.application.e.f229982b.a()), null, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ee.g f230545b;

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 SurveyStepGoalsFragment.kt\ncom/planner5d/library/spaces/view/survey/goals/SurveyStepGoalsFragment\n*L\n1#1,16:1\n17#2:17\n*E\n"})
    public static final class a implements Function0<l2> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return SurveyStepGoalsFragment.this.getViewModelStore();
        }
    }

    public static final class b implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230547a;

        public b(com.planner5d.library.view.b bVar) {
            this.f230547a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230547a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(SurveyStepGoalsFragment surveyStepGoalsFragment, View view) {
        androidx.navigation.fragment.f.a(surveyStepGoalsFragment).z0();
    }

    private final i x() {
        return (i) this.f230544a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(ee.g gVar, boolean z10) {
        gVar.f274808b.setEnabled(z10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(c cVar, SurveyStepGoalsFragment surveyStepGoalsFragment, View view) {
        com.planner5d.library.spaces.data.f fVarI = cVar.i();
        if (fVarI != null) {
            surveyStepGoalsFragment.x().U(fVarI.f());
            k kVar = k.f240224a;
            androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(surveyStepGoalsFragment);
            c2 c2VarA = h.a();
            Intrinsics.checkNotNullExpressionValue(c2VarA, "toStyle(...)");
            kVar.d(w0VarA, c2VarA, new Function2() { // from class: com.planner5d.library.spaces.view.survey.goals.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyStepGoalsFragment.A((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final ee.g gVarC = ee.g.c(inflater);
        Intrinsics.checkNotNullExpressionValue(gVarC, "inflate(...)");
        final c cVar = new c(new Function1() { // from class: com.planner5d.library.spaces.view.survey.goals.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyStepGoalsFragment.y(gVarC, ((Boolean) obj).booleanValue());
            }
        });
        gVarC.f274809c.setAdapter(cVar);
        gVarC.f274809c.n(new g0(de.b.f.Pd));
        gVarC.f274808b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.survey.goals.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SurveyStepGoalsFragment.z(cVar, this, view);
            }
        });
        gVarC.f274810d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.survey.goals.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SurveyStepGoalsFragment.B(this.f230562a, view);
            }
        });
        this.f230545b = gVarC;
        ConstraintLayout root = gVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
