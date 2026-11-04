package com.planner5d.library.activity.tutorial;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import com.planner5d.library.application.f6;
import com.planner5d.library.application.s5;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.widget.a1;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import kotlin.l0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class TutorialFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ra.b f137274b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a1 f137276d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f137273a = g0.c(new Function0() { // from class: com.planner5d.library.activity.tutorial.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TutorialFragment.T(this.f141851a);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f137275c = g0.c(new Function0() { // from class: com.planner5d.library.activity.tutorial.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TutorialFragment.V(this.f141854a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f137277e = g0.c(new Function0() { // from class: com.planner5d.library.activity.tutorial.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TutorialFragment.U(this.f141855a);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f137278f = g0.c(new Function0() { // from class: com.planner5d.library.activity.tutorial.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TutorialFragment.S(this.f141856a);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f0 f137279g = g0.c(new Function0() { // from class: com.planner5d.library.activity.tutorial.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TutorialFragment.E(this.f141857a);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final f0 f137280h = g0.c(new Function0() { // from class: com.planner5d.library.activity.tutorial.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TutorialFragment.F(this.f141858a);
        }
    });

    public interface a {
        @NotNull
        f6 g();
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f137281a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f137281a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f137281a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f137281a.invoke(obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.widget.j E(TutorialFragment tutorialFragment) {
        return tutorialFragment.K().b(false, tutorialFragment.requireContext().getResources().getDimensionPixelSize(c.f.f139028xd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.widget.drawable.d F(TutorialFragment tutorialFragment) {
        return tutorialFragment.J().a();
    }

    private final com.planner5d.library.widget.j G() {
        return (com.planner5d.library.widget.j) this.f137279g.getValue();
    }

    private final com.planner5d.library.widget.drawable.d H() {
        return (com.planner5d.library.widget.drawable.d) this.f137280h.getValue();
    }

    private final View I() {
        return (View) this.f137278f.getValue();
    }

    private final f6 J() {
        return (f6) this.f137273a.getValue();
    }

    private final s5 K() {
        return (s5) this.f137277e.getValue();
    }

    private final u L() {
        return (u) this.f137275c.getValue();
    }

    private final void M(s[] sVarArr) {
        a1 a1Var = null;
        if (sVarArr == null) {
            a1 a1Var2 = this.f137276d;
            if (a1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preloader");
            } else {
                a1Var = a1Var2;
            }
            a1Var.a(c.q.f140583zd, true);
            return;
        }
        a1 a1Var3 = this.f137276d;
        if (a1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preloader");
        } else {
            a1Var = a1Var3;
        }
        a1Var.b();
        com.planner5d.library.widget.j jVarG = G();
        onPause();
        jVarG.setAdapter(new t(sVarArr, H()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(TutorialFragment tutorialFragment, s[] sVarArr) {
        tutorialFragment.M(sVarArr);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(androidx.fragment.app.s sVar, Boolean bool) {
        if (bool.booleanValue()) {
            sVar.finish();
            String strU = h3.u(sVar, com.planner5d.library.services.r.tutorialNextActivity);
            if (strU != null) {
                h3.k0(sVar, strU, null);
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(ra.b bVar, TutorialFragment tutorialFragment, int i10) {
        bVar.f362235c.setVisibility(tutorialFragment.G().hasNext() ? 0 : 8);
        bVar.f362234b.setText(tutorialFragment.G().hasNext() ? c.q.Hh : c.q.f140504w6);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(TutorialFragment tutorialFragment, View view) {
        tutorialFragment.L().W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(TutorialFragment tutorialFragment, View view) {
        if (tutorialFragment.G().hasNext()) {
            tutorialFragment.G().next();
        } else {
            tutorialFragment.L().W();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View S(TutorialFragment tutorialFragment) {
        return tutorialFragment.K().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f6 T(TutorialFragment tutorialFragment) {
        Context context = tutorialFragment.getContext();
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof a) {
            return ((a) applicationContext).g();
        }
        throw new l0(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s5 U(TutorialFragment tutorialFragment) {
        return tutorialFragment.J().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u V(TutorialFragment tutorialFragment) {
        return new u(tutorialFragment.J().b());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = requireActivity().getWindow();
        window.getDecorView().setSystemUiVisibility(1280);
        window.setFlags(67108864, 67108864);
    }

    public final void onBackPressed() {
        L().W();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final ra.b bVarC = ra.b.c(inflater);
        this.f137274b = bVarC;
        bVarC.f362237e.addView(I());
        this.f137276d = K().a(I());
        bVarC.f362235c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.tutorial.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialFragment.Q(this.f141859a, view);
            }
        });
        bVarC.f362234b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.tutorial.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialFragment.R(this.f141860a, view);
            }
        });
        FrameLayout frameLayout = bVarC.f362236d;
        Object objG = G();
        Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type android.view.View");
        frameLayout.addView((View) objG);
        final androidx.fragment.app.s sVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        L().Y().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.tutorial.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TutorialFragment.N(this.f141861a, (s[]) obj);
            }
        }));
        L().X().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.tutorial.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TutorialFragment.O(sVarRequireActivity, (Boolean) obj);
            }
        }));
        L().Z(h3.u(sVarRequireActivity, com.planner5d.library.services.r.tutorialName));
        G().setOnSlideChange(new Function1() { // from class: com.planner5d.library.activity.tutorial.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TutorialFragment.P(bVarC, this, ((Integer) obj).intValue());
            }
        });
        FrameLayout root = bVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
