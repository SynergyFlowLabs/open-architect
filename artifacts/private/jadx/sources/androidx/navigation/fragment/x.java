package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.b1;
import androidx.annotation.n0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.l2;
import androidx.navigation.n3;
import androidx.navigation.q2;
import androidx.navigation.q3;
import androidx.navigation.r2;
import androidx.navigation.r3;
import androidx.navigation.w0;
import androidx.navigation.y3;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProviderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,395:1\n114#2,2:396\n1#3:398\n233#4,3:399\n233#4,3:402\n*S KotlinDebug\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n*L\n205#1:396,2\n275#1:399,3\n282#1:402,3\n*E\n"})
public class x extends Fragment implements q2 {

    @NotNull
    public static final a Companion = new a(null);

    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";

    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f70968e = "android-support-nav:fragment:navControllerState";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f70969f = "android-support-nav:fragment:defaultHost";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f70970a = g0.c(new Function0() { // from class: androidx.navigation.fragment.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return x.y(this.f70965a);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private View f70971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f70973d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ x c(a aVar, int i10, Bundle bundle, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bundle = null;
            }
            return aVar.b(i10, bundle);
        }

        @oj.j
        @oj.n
        @NotNull
        public final x a(@n0 int i10) {
            return c(this, i10, null, 2, null);
        }

        @oj.j
        @oj.n
        @NotNull
        public final x b(@n0 int i10, @Nullable Bundle bundle) {
            Bundle bundle2;
            if (i10 != 0) {
                bundle2 = new Bundle();
                bundle2.putInt(x.KEY_GRAPH_ID, i10);
            } else {
                bundle2 = null;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putBundle(x.KEY_START_DESTINATION_ARGS, bundle);
            }
            x xVar = new x();
            if (bundle2 != null) {
                xVar.setArguments(bundle2);
            }
            return xVar;
        }

        @oj.n
        @NotNull
        public final w0 d(@NotNull Fragment fragment) {
            Dialog dialog;
            Window window;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof x) {
                    return ((x) parentFragment).getNavHostController$navigation_fragment_release();
                }
                Fragment fragmentS0 = parentFragment.getParentFragmentManager().S0();
                if (fragmentS0 instanceof x) {
                    return ((x) fragmentS0).getNavHostController$navigation_fragment_release();
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return n3.l(view);
            }
            View decorView = null;
            androidx.fragment.app.m mVar = fragment instanceof androidx.fragment.app.m ? (androidx.fragment.app.m) fragment : null;
            if (mVar != null && (dialog = mVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return n3.l(decorView);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle A(x xVar) {
        int i10 = xVar.f70972c;
        if (i10 != 0) {
            return androidx.core.os.e.b(TuplesKt.to(KEY_GRAPH_ID, Integer.valueOf(i10)));
        }
        Bundle bundle = Bundle.EMPTY;
        Intrinsics.checkNotNull(bundle);
        return bundle;
    }

    @oj.j
    @oj.n
    @NotNull
    public static final x create(@n0 int i10) {
        return Companion.a(i10);
    }

    @oj.n
    @NotNull
    public static final w0 findNavController(@NotNull Fragment fragment) {
        return Companion.d(fragment);
    }

    private final int x() {
        int id2 = getId();
        return (id2 == 0 || id2 == -1) ? y.c.f70976a : id2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r2 y(final x xVar) {
        Context context = xVar.getContext();
        if (context == null) {
            throw new IllegalStateException("NavController cannot be created before the fragment is attached");
        }
        final r2 r2Var = new r2(context);
        r2Var.Z0(xVar);
        l2 viewModelStore = xVar.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "<get-viewModelStore>(...)");
        r2Var.c1(viewModelStore);
        xVar.C(r2Var);
        Bundle bundleA = xVar.getSavedStateRegistry().a(f70968e);
        if (bundleA != null) {
            r2Var.S0(bundleA);
        }
        xVar.getSavedStateRegistry().d(f70968e, new androidx.savedstate.j.b() { // from class: androidx.navigation.fragment.v
            @Override // androidx.savedstate.j.b
            public final Bundle a() {
                return x.z(r2Var);
            }
        });
        Bundle bundleA2 = xVar.getSavedStateRegistry().a(KEY_GRAPH_ID);
        if (bundleA2 != null) {
            xVar.f70972c = bundleA2.getInt(KEY_GRAPH_ID);
        }
        xVar.getSavedStateRegistry().d(KEY_GRAPH_ID, new androidx.savedstate.j.b() { // from class: androidx.navigation.fragment.w
            @Override // androidx.savedstate.j.b
            public final Bundle a() {
                return x.A(this.f70967a);
            }
        });
        int i10 = xVar.f70972c;
        if (i10 != 0) {
            r2Var.V0(i10);
            return r2Var;
        }
        Bundle arguments = xVar.getArguments();
        int i11 = arguments != null ? arguments.getInt(KEY_GRAPH_ID) : 0;
        Bundle bundle = arguments != null ? arguments.getBundle(KEY_START_DESTINATION_ARGS) : null;
        if (i11 != 0) {
            r2Var.W0(i11, bundle);
        }
        return r2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle z(r2 r2Var) {
        Bundle bundleT0 = r2Var.T0();
        if (bundleT0 != null) {
            return bundleT0;
        }
        Bundle EMPTY = Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return EMPTY;
    }

    @androidx.annotation.i
    @kotlin.l(message = "Override {@link #onCreateNavHostController(NavHostController)} to gain\n      access to the full {@link NavHostController} that is created by this NavHostFragment.")
    protected void B(@NotNull w0 navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        r3 r3VarP = navController.P();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        r3VarP.b(new c(contextRequireContext, childFragmentManager));
        navController.P().b(w());
    }

    @androidx.annotation.i
    protected void C(@NotNull r2 navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        B(navHostController);
    }

    @Override // androidx.navigation.q2
    @NotNull
    public final w0 getNavController() {
        return getNavHostController$navigation_fragment_release();
    }

    @NotNull
    public final r2 getNavHostController$navigation_fragment_release() {
        return (r2) this.f70970a.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.f70973d) {
            getParentFragmentManager().w().M(this).m();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onCreate(@Nullable Bundle bundle) {
        getNavHostController$navigation_fragment_release();
        if (bundle != null && bundle.getBoolean(f70969f, false)) {
            this.f70973d = true;
            getParentFragmentManager().w().M(this).m();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(x());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f70971b;
        if (view != null && n3.l(view) == getNavHostController$navigation_fragment_release()) {
            n3.q(view, null);
        }
        this.f70971b = null;
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
            this.f70972c = resourceId;
        }
        Unit unit = Unit.f312394a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, y.d.f70983e);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes2.getBoolean(y.d.f70984f, false)) {
            this.f70973d = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f70973d) {
            outState.putBoolean(f70969f, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        n3.q(view, getNavHostController$navigation_fragment_release());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f70971b = view2;
            Intrinsics.checkNotNull(view2);
            if (view2.getId() == getId()) {
                View view3 = this.f70971b;
                Intrinsics.checkNotNull(view3);
                n3.q(view3, getNavHostController$navigation_fragment_release());
            }
        }
    }

    @kotlin.l(message = "Use {@link #onCreateNavController(NavController)}")
    @NotNull
    protected q3<? extends q.c> w() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        return new q(contextRequireContext, childFragmentManager, x());
    }

    @oj.j
    @oj.n
    @NotNull
    public static final x create(@n0 int i10, @Nullable Bundle bundle) {
        return Companion.b(i10, bundle);
    }
}
