package com.planner5d.library.spaces.view.survey.usage;

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
import com.planner5d.library.model.manager.statistics.events.c4;
import com.planner5d.library.util.navigation.k;
import com.planner5d.library.widget.g0;
import ee.n;
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
@SourceDebugExtension({"SMAP\nSurveyStepUsageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyStepUsageFragment.kt\ncom/planner5d/library/spaces/view/survey/usage/SurveyStepUsageFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n*L\n1#1,36:1\n16#2:37\n*S KotlinDebug\n*F\n+ 1 SurveyStepUsageFragment.kt\ncom/planner5d/library/spaces/view/survey/usage/SurveyStepUsageFragment\n*L\n17#1:37\n*E\n"})
public final class SurveyStepUsageFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f230627a = new i2(j1.d(g.class), new a(), new b(com.planner5d.library.spaces.application.e.f229982b.a()), null, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f230628b;

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 SurveyStepUsageFragment.kt\ncom/planner5d/library/spaces/view/survey/usage/SurveyStepUsageFragment\n*L\n1#1,16:1\n17#2:17\n*E\n"})
    public static final class a implements Function0<l2> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return SurveyStepUsageFragment.this.getViewModelStore();
        }
    }

    public static final class b implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230630a;

        public b(com.planner5d.library.view.b bVar) {
            this.f230630a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230630a;
        }
    }

    private final g w() {
        return (g) this.f230627a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(SurveyStepUsageFragment surveyStepUsageFragment, c4.h answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        surveyStepUsageFragment.w().U(answer);
        k kVar = k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(surveyStepUsageFragment);
        c2 c2VarA = f.a();
        Intrinsics.checkNotNullExpressionValue(c2VarA, "toPersonality(...)");
        kVar.d(w0VarA, c2VarA, new Function2() { // from class: com.planner5d.library.spaces.view.survey.usage.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SurveyStepUsageFragment.y((androidx.navigation.w0) obj, (c2) obj2);
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
    public static final void z(SurveyStepUsageFragment surveyStepUsageFragment, View view) {
        androidx.navigation.fragment.f.a(surveyStepUsageFragment).z0();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        n nVarC = n.c(inflater);
        Intrinsics.checkNotNullExpressionValue(nVarC, "inflate(...)");
        nVarC.f274848b.setAdapter(new com.planner5d.library.spaces.view.survey.usage.b(new Function1() { // from class: com.planner5d.library.spaces.view.survey.usage.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyStepUsageFragment.x(this.f230638a, (c4.h) obj);
            }
        }));
        nVarC.f274848b.n(new g0(de.b.f.Kd));
        nVarC.f274849c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.survey.usage.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SurveyStepUsageFragment.z(this.f230639a, view);
            }
        });
        this.f230628b = nVarC;
        ConstraintLayout root = nVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
