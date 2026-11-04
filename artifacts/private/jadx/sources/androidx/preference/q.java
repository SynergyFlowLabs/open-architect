package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.i0;
import androidx.activity.j0;
import androidx.activity.m0;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.t0;
import androidx.fragment.app.w;
import androidx.lifecycle.o0;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q extends Fragment implements m.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private i0 f73126a;

    private static final class a extends i0 implements SlidingPaneLayout.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final q f73127a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull q caller) {
            super(true);
            Intrinsics.checkNotNullParameter(caller, "caller");
            this.f73127a = caller;
            caller.w().a(this);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
        public void a(@NotNull View panel) {
            Intrinsics.checkNotNullParameter(panel, "panel");
            setEnabled(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
        public void b(@NotNull View panel) {
            Intrinsics.checkNotNullParameter(panel, "panel");
            setEnabled(false);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
        public void c(@NotNull View panel, float f10) {
            Intrinsics.checkNotNullParameter(panel, "panel");
        }

        @Override // androidx.activity.i0
        public void handleOnBackPressed() {
            this.f73127a.w().d();
        }
    }

    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            view.removeOnLayoutChangeListener(this);
            i0 i0Var = q.this.f73126a;
            Intrinsics.checkNotNull(i0Var);
            i0Var.setEnabled(q.this.w().o() && q.this.w().isOpen());
        }
    }

    private final void A(Intent intent) {
        if (intent == null) {
            return;
        }
        startActivity(intent);
    }

    private final void B(Preference preference) {
        if (preference.w() == null) {
            A(preference.D());
            return;
        }
        String strW = preference.w();
        Fragment fragmentA = strW == null ? null : getChildFragmentManager().L0().a(requireContext().getClassLoader(), strW);
        if (fragmentA != null) {
            fragmentA.setArguments(preference.t());
        }
        if (getChildFragmentManager().G0() > 0) {
            FragmentManager.k kVarF0 = getChildFragmentManager().F0(0);
            Intrinsics.checkNotNullExpressionValue(kVarF0, "childFragmentManager.getBackStackEntryAt(0)");
            getChildFragmentManager().s1(kVarF0.getId(), 1);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        t0 t0VarW = childFragmentManager.w();
        Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction()");
        t0VarW.N(true);
        int i10 = v.f.f73211b;
        Intrinsics.checkNotNull(fragmentA);
        t0VarW.y(i10, fragmentA);
        if (w().isOpen()) {
            t0VarW.O(t0.K);
        }
        w().r();
        t0VarW.m();
    }

    private final SlidingPaneLayout v(LayoutInflater layoutInflater) {
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(layoutInflater.getContext());
        slidingPaneLayout.setId(v.f.f73213d);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(v.f.f73212c);
        SlidingPaneLayout.e eVar = new SlidingPaneLayout.e(getResources().getDimensionPixelSize(v.d.f73207g), -1);
        eVar.f75294a = getResources().getInteger(v.g.f73220b);
        slidingPaneLayout.addView(fragmentContainerView, eVar);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView2.setId(v.f.f73211b);
        SlidingPaneLayout.e eVar2 = new SlidingPaneLayout.e(getResources().getDimensionPixelSize(v.d.f73206f), -1);
        eVar2.f75294a = getResources().getInteger(v.g.f73219a);
        slidingPaneLayout.addView(fragmentContainerView2, eVar2);
        return slidingPaneLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(q this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        i0 i0Var = this$0.f73126a;
        Intrinsics.checkNotNull(i0Var);
        i0Var.setEnabled(this$0.getChildFragmentManager().G0() == 0);
    }

    @Override // androidx.preference.m.f
    @androidx.annotation.i
    public boolean g(@NotNull m caller, @NotNull Preference pref) {
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intrinsics.checkNotNullParameter(pref, "pref");
        boolean z10 = false & true;
        if (caller.getId() == v.f.f73212c) {
            B(pref);
            return true;
        }
        if (caller.getId() != v.f.f73211b) {
            return false;
        }
        w wVarL0 = getChildFragmentManager().L0();
        ClassLoader classLoader = requireContext().getClassLoader();
        String strW = pref.w();
        Intrinsics.checkNotNull(strW);
        Fragment fragmentA = wVarL0.a(classLoader, strW);
        Intrinsics.checkNotNullExpressionValue(fragmentA, "childFragmentManager.fra….fragment!!\n            )");
        fragmentA.setArguments(pref.t());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        t0 t0VarW = childFragmentManager.w();
        Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction()");
        t0VarW.N(true);
        t0VarW.y(v.f.f73211b, fragmentA);
        t0VarW.O(t0.K);
        int i10 = 2 ^ 0;
        t0VarW.k(null);
        t0VarW.m();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parentFragmentManager");
        t0 t0VarW = parentFragmentManager.w();
        Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction()");
        t0VarW.M(this);
        t0VarW.m();
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        SlidingPaneLayout slidingPaneLayoutV = v(inflater);
        if (getChildFragmentManager().v0(v.f.f73212c) == null) {
            m mVarY = y();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            t0 t0VarW = childFragmentManager.w();
            Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction()");
            t0VarW.N(true);
            t0VarW.b(v.f.f73212c, mVarY);
            t0VarW.m();
        }
        slidingPaneLayoutV.setLockMode(3);
        return slidingPaneLayoutV;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        j0 onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f73126a = new a(this);
        SlidingPaneLayout slidingPaneLayoutW = w();
        if (!u1.Y0(slidingPaneLayoutW) || slidingPaneLayoutW.isLayoutRequested()) {
            slidingPaneLayoutW.addOnLayoutChangeListener(new b());
        } else {
            i0 i0Var = this.f73126a;
            Intrinsics.checkNotNull(i0Var);
            i0Var.setEnabled(w().o() && w().isOpen());
        }
        getChildFragmentManager().r(new FragmentManager.p() { // from class: androidx.preference.p
            @Override // androidx.fragment.app.FragmentManager.p
            public final void onBackStackChanged() {
                q.z(this.f73125a);
            }
        });
        m0 m0VarA = androidx.activity.t0.a(view);
        if (m0VarA == null || (onBackPressedDispatcher = m0VarA.getOnBackPressedDispatcher()) == null) {
            return;
        }
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        i0 i0Var2 = this.f73126a;
        Intrinsics.checkNotNull(i0Var2);
        onBackPressedDispatcher.i(viewLifecycleOwner, i0Var2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle == null) {
            Fragment fragmentX = x();
            if (fragmentX == null) {
                return;
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            t0 t0VarW = childFragmentManager.w();
            Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction()");
            t0VarW.N(true);
            t0VarW.y(v.f.f73211b, fragmentX);
            t0VarW.m();
        }
    }

    @NotNull
    public final SlidingPaneLayout w() {
        return (SlidingPaneLayout) requireView();
    }

    @Nullable
    public Fragment x() {
        Fragment fragmentV0 = getChildFragmentManager().v0(v.f.f73212c);
        if (fragmentV0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
        }
        m mVar = (m) fragmentV0;
        Fragment fragmentA = null;
        if (mVar.y().J1() <= 0) {
            return null;
        }
        int iJ1 = mVar.y().J1();
        int i10 = 0;
        while (i10 < iJ1) {
            int i11 = i10 + 1;
            Preference preferenceI1 = mVar.y().I1(i10);
            Intrinsics.checkNotNullExpressionValue(preferenceI1, "headerFragment.preferenc…reen.getPreference(index)");
            if (preferenceI1.w() != null) {
                String strW = preferenceI1.w();
                fragmentA = strW != null ? getChildFragmentManager().L0().a(requireContext().getClassLoader(), strW) : null;
                if (fragmentA != null) {
                    fragmentA.setArguments(preferenceI1.t());
                    break;
                }
                return fragmentA;
            }
            i10 = i11;
        }
        return fragmentA;
    }

    @NotNull
    public abstract m y();
}
