package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.i0;
import androidx.activity.j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.t0;
import androidx.lifecycle.o0;
import androidx.navigation.y3;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAbstractListDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,239:1\n233#2,3:240\n1#3:243\n28#4,12:244\n65#5,4:256\n37#5:260\n53#5:261\n72#5:262\n*S KotlinDebug\n*F\n+ 1 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n*L\n100#1:240,3\n157#1:244,12\n164#1:256,4\n164#1:260\n164#1:261\n164#1:262\n*E\n"})
public abstract class a extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private i0 f70914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private x f70915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70916c;

    /* JADX INFO: renamed from: androidx.navigation.fragment.a$a, reason: collision with other inner class name */
    private static final class C0627a extends i0 implements SlidingPaneLayout.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final SlidingPaneLayout f70917a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0627a(@NotNull SlidingPaneLayout slidingPaneLayout) {
            super(true);
            Intrinsics.checkNotNullParameter(slidingPaneLayout, "slidingPaneLayout");
            this.f70917a = slidingPaneLayout;
            slidingPaneLayout.a(this);
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
            this.f70917a.d();
        }
    }

    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n*L\n1#1,414:1\n69#2:415\n70#2:419\n165#3,3:416\n*E\n"})
    public static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SlidingPaneLayout f70919b;

        public b(SlidingPaneLayout slidingPaneLayout) {
            this.f70919b = slidingPaneLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            i0 i0Var = a.this.f70914a;
            Intrinsics.checkNotNull(i0Var);
            i0Var.setEnabled(this.f70919b.o() && this.f70919b.isOpen());
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        x xVarW;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (bundle != null) {
            this.f70916c = bundle.getInt(x.KEY_GRAPH_ID);
        }
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(y.c.f70978c);
        View viewX = x(inflater, slidingPaneLayout, bundle);
        if (!Intrinsics.areEqual(viewX, slidingPaneLayout) && !Intrinsics.areEqual(viewX.getParent(), slidingPaneLayout)) {
            slidingPaneLayout.addView(viewX);
        }
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(y.c.f70977b);
        SlidingPaneLayout.e eVar = new SlidingPaneLayout.e(inflater.getContext().getResources().getDimensionPixelSize(y.b.f70975a), -1);
        eVar.f75294a = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, eVar);
        Fragment fragmentV0 = getChildFragmentManager().v0(y.c.f70977b);
        if (fragmentV0 != null) {
            xVarW = (x) fragmentV0;
        } else {
            xVarW = w();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            t0 t0VarW = childFragmentManager.w();
            Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction()");
            t0VarW.N(true);
            t0VarW.b(y.c.f70977b, xVarW);
            t0VarW.m();
        }
        this.f70915b = xVarW;
        this.f70914a = new C0627a(slidingPaneLayout);
        if (!slidingPaneLayout.isLaidOut() || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new b(slidingPaneLayout));
        } else {
            i0 i0Var = this.f70914a;
            Intrinsics.checkNotNull(i0Var);
            i0Var.setEnabled(slidingPaneLayout.o() && slidingPaneLayout.isOpen());
        }
        j0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        i0 i0Var2 = this.f70914a;
        Intrinsics.checkNotNull(i0Var2);
        onBackPressedDispatcher.i(viewLifecycleOwner, i0Var2);
        return slidingPaneLayout;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onInflate(@NotNull Context context, @NotNull AttributeSet attrs, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, y3.c.f71469g);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(y3.c.f71470h, 0);
        if (resourceId != 0) {
            this.f70916c = resourceId;
        }
        Unit unit = Unit.f312394a;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        int i10 = this.f70916c;
        if (i10 != 0) {
            outState.putInt(x.KEY_GRAPH_ID, i10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View childAt = v().getChildAt(0);
        Intrinsics.checkNotNull(childAt);
        y(childAt, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onViewStateRestored(@Nullable Bundle bundle) {
        super.onViewStateRestored(bundle);
        i0 i0Var = this.f70914a;
        Intrinsics.checkNotNull(i0Var);
        i0Var.setEnabled(v().o() && v().isOpen());
    }

    @NotNull
    public final x u() {
        x xVar = this.f70915b;
        if (xVar != null) {
            Intrinsics.checkNotNull(xVar, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            return xVar;
        }
        throw new IllegalStateException(("Fragment " + this + " was called before onCreateView().").toString());
    }

    @NotNull
    public final SlidingPaneLayout v() {
        View viewRequireView = requireView();
        Intrinsics.checkNotNull(viewRequireView, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout");
        return (SlidingPaneLayout) viewRequireView;
    }

    @NotNull
    public x w() {
        int i10 = this.f70916c;
        return i10 != 0 ? x.a.c(x.Companion, i10, null, 2, null) : new x();
    }

    @NotNull
    public abstract View x(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle);

    public void y(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
