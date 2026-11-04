package com.planner5d.library.spaces.view.start;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.navigation.c2;
import androidx.navigation.fragment.t;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.util.navigation.k;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSpacesStartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesStartFragment.kt\ncom/planner5d/library/spaces/view/start/SpacesStartFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ViewUtils.kt\ncom/planner5d/library/services/utility/ViewUtils\n*L\n1#1,60:1\n16#2:61\n278#3,2:62\n190#4,12:64\n*S KotlinDebug\n*F\n+ 1 SpacesStartFragment.kt\ncom/planner5d/library/spaces/view/start/SpacesStartFragment\n*L\n22#1:61\n30#1:62,2\n38#1:64,12\n*E\n"})
public final class SpacesStartFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f230522a = new i2(j1.d(f.class), new a(), new b(com.planner5d.library.spaces.application.e.f229982b.a()), null, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ee.f f230523b;

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 SpacesStartFragment.kt\ncom/planner5d/library/spaces/view/start/SpacesStartFragment\n*L\n1#1,16:1\n22#2:17\n*E\n"})
    public static final class a implements Function0<l2> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return SpacesStartFragment.this.getViewModelStore();
        }
    }

    public static final class b implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230525a;

        public b(com.planner5d.library.view.b bVar) {
            this.f230525a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230525a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(SpacesStartFragment spacesStartFragment, ee.f fVar, View view) {
        spacesStartFragment.x().b0();
        if (spacesStartFragment.x().Z()) {
            k kVar = k.f240224a;
            androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(spacesStartFragment);
            c2 c2VarB = e.b();
            Intrinsics.checkNotNullExpressionValue(c2VarB, "toSurvey(...)");
            kVar.d(w0VarA, c2VarB, new Function2() { // from class: com.planner5d.library.spaces.view.start.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SpacesStartFragment.B((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
            return;
        }
        y3 y3Var = y3.f229862a;
        ViewParent root = fVar.getRoot();
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
    public static final void C(SpacesStartFragment spacesStartFragment, View view) {
        spacesStartFragment.y();
    }

    private final f x() {
        return (f) this.f230522a.getValue();
    }

    private final void y() {
        k kVar = k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(this);
        c2 c2VarA = e.a();
        Intrinsics.checkNotNullExpressionValue(c2VarA, "toSearchAddress(...)");
        kVar.d(w0VarA, c2VarA, new Function2() { // from class: com.planner5d.library.spaces.view.start.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SpacesStartFragment.z(this.f230529a, (androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(SpacesStartFragment spacesStartFragment, androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        ee.f fVar = spacesStartFragment.f230523b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fVar = null;
        }
        runIfDirectionsAvailable.o0(it, t.a(TuplesKt.to(fVar.f274801b, "secondTransitionName")));
        return Unit.f312394a;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final ee.f fVarD = ee.f.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(fVarD, "inflate(...)");
        u1.j2(fVarD.f274804e, new ef.g(getResources().getDimensionPixelSize(de.b.f.Pd)));
        TextView skip = fVarD.f274804e;
        Intrinsics.checkNotNullExpressionValue(skip, "skip");
        skip.setVisibility(x().Y() ? 4 : 0);
        fVarD.f274804e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.start.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpacesStartFragment.A(this.f230526a, fVarD, view);
            }
        });
        fVarD.f274803d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.start.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpacesStartFragment.C(this.f230528a, view);
            }
        });
        this.f230523b = fVarD;
        ConstraintLayout root = fVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        x().a0();
    }
}
