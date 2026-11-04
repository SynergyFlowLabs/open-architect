package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.u1;
import androidx.lifecycle.m2;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f51939f = "FragmentManager";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f51940g = "state";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f51941h = "savedInstanceState";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f51942i = "registryState";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f51943j = "childFragmentManager";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f51944k = "viewState";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f51945l = "viewRegistryState";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f51946m = "arguments";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f51947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s0 f51948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Fragment f51949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51950d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51951e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f51952a;

        a(View view) {
            this.f51952a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f51952a.removeOnAttachStateChangeListener(this);
            u1.A1(this.f51952a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51954a;

        static {
            int[] iArr = new int[androidx.lifecycle.c0.b.values().length];
            f51954a = iArr;
            try {
                iArr[androidx.lifecycle.c0.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51954a[androidx.lifecycle.c0.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51954a[androidx.lifecycle.c0.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51954a[androidx.lifecycle.c0.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    q0(@NonNull b0 b0Var, @NonNull s0 s0Var, @NonNull Fragment fragment) {
        this.f51947a = b0Var;
        this.f51948b = s0Var;
        this.f51949c = fragment;
    }

    private boolean l(@NonNull View view) {
        if (view == this.f51949c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f51949c.mView) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (FragmentManager.b1(3)) {
            Objects.toString(this.f51949c);
        }
        Bundle bundle = this.f51949c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(f51941h) : null;
        this.f51949c.performActivityCreated(bundle2);
        this.f51947a.a(this.f51949c, bundle2, false);
    }

    void b() {
        Fragment fragmentZ0 = FragmentManager.z0(this.f51949c.mContainer);
        Fragment parentFragment = this.f51949c.getParentFragment();
        if (fragmentZ0 != null && !fragmentZ0.equals(parentFragment)) {
            Fragment fragment = this.f51949c;
            d2.d.s(fragment, fragmentZ0, fragment.mContainerId);
        }
        int iJ = this.f51948b.j(this.f51949c);
        Fragment fragment2 = this.f51949c;
        fragment2.mContainer.addView(fragment2.mView, iJ);
    }

    void c() {
        if (FragmentManager.b1(3)) {
            Objects.toString(this.f51949c);
        }
        Fragment fragment = this.f51949c;
        Fragment fragment2 = fragment.mTarget;
        q0 q0VarO = null;
        if (fragment2 != null) {
            q0 q0VarO2 = this.f51948b.o(fragment2.mWho);
            if (q0VarO2 == null) {
                throw new IllegalStateException("Fragment " + this.f51949c + " declared target fragment " + this.f51949c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f51949c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            q0VarO = q0VarO2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (q0VarO = this.f51948b.o(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f51949c + " declared target fragment " + this.f51949c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (q0VarO != null) {
            q0VarO.m();
        }
        Fragment fragment4 = this.f51949c;
        fragment4.mHost = fragment4.mFragmentManager.O0();
        Fragment fragment5 = this.f51949c;
        fragment5.mParentFragment = fragment5.mFragmentManager.R0();
        this.f51947a.g(this.f51949c, false);
        this.f51949c.performAttach();
        this.f51947a.b(this.f51949c, false);
    }

    int d() {
        Fragment fragment = this.f51949c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f51951e;
        int i10 = b.f51954a[fragment.mMaxState.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i10 != 3) {
                iMin = i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment2 = this.f51949c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f51951e, 2);
                View view = this.f51949c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f51951e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.f51949c;
        if (fragment3.mInDynamicContainer && fragment3.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f51949c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment4 = this.f51949c;
        ViewGroup viewGroup = fragment4.mContainer;
        f1.d.a aVarS = viewGroup != null ? f1.u(viewGroup, fragment4.getParentFragmentManager()).s(this) : null;
        if (aVarS == f1.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == f1.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment5 = this.f51949c;
            if (fragment5.mRemoving) {
                iMin = fragment5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment6 = this.f51949c;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f51949c.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.b1(2)) {
            Objects.toString(this.f51949c);
        }
        return iMin;
    }

    void e() {
        if (FragmentManager.b1(3)) {
            Objects.toString(this.f51949c);
        }
        Bundle bundle = this.f51949c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(f51941h) : null;
        Fragment fragment = this.f51949c;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.f51947a.h(fragment, bundle2, false);
            this.f51949c.performCreate(bundle2);
            this.f51947a.c(this.f51949c, bundle2, false);
        }
    }

    void f() {
        String resourceName;
        if (this.f51949c.mFromLayout) {
            return;
        }
        if (FragmentManager.b1(3)) {
            Objects.toString(this.f51949c);
        }
        Bundle bundle = this.f51949c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle(f51941h) : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f51949c.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f51949c;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f51949c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.I0().c(this.f51949c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f51949c;
                    if (!fragment2.mRestored && !fragment2.mInDynamicContainer) {
                        try {
                            resourceName = fragment2.getResources().getResourceName(this.f51949c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f51949c.mContainerId) + " (" + resourceName + ") for fragment " + this.f51949c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    d2.d.r(this.f51949c, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f51949c;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f51949c.mView != null) {
            if (FragmentManager.b1(3)) {
                Objects.toString(this.f51949c);
            }
            this.f51949c.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f51949c;
            fragment4.mView.setTag(c2.a.c.f82385a, fragment4);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment5 = this.f51949c;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (this.f51949c.mView.isAttachedToWindow()) {
                u1.A1(this.f51949c.mView);
            } else {
                View view = this.f51949c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f51949c.performViewCreated();
            b0 b0Var = this.f51947a;
            Fragment fragment6 = this.f51949c;
            b0Var.m(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f51949c.mView.getVisibility();
            this.f51949c.setPostOnViewCreatedAlpha(this.f51949c.mView.getAlpha());
            Fragment fragment7 = this.f51949c;
            if (fragment7.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f51949c.setFocusedView(viewFindFocus);
                    if (FragmentManager.b1(2)) {
                        viewFindFocus.toString();
                        Objects.toString(this.f51949c);
                    }
                }
                this.f51949c.mView.setAlpha(0.0f);
            }
        }
        this.f51949c.mState = 2;
    }

    void g() {
        Fragment fragmentF;
        if (FragmentManager.b1(3)) {
            Objects.toString(this.f51949c);
        }
        Fragment fragment = this.f51949c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = true & false;
        boolean z11 = fragment.mRemoving && !fragment.isInBackStack();
        if (z11) {
            Fragment fragment2 = this.f51949c;
            if (!fragment2.mBeingSaved) {
                this.f51948b.C(fragment2.mWho, null);
            }
        }
        if (!z11 && !this.f51948b.q().j0(this.f51949c)) {
            String str = this.f51949c.mTargetWho;
            if (str != null && (fragmentF = this.f51948b.f(str)) != null && fragmentF.mRetainInstance) {
                this.f51949c.mTarget = fragmentF;
            }
            this.f51949c.mState = 0;
            return;
        }
        x<?> xVar = this.f51949c.mHost;
        if (xVar instanceof m2) {
            zIsChangingConfigurations = this.f51948b.q().f0();
        } else if (xVar.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) xVar.f()).isChangingConfigurations();
        }
        if ((z11 && !this.f51949c.mBeingSaved) || zIsChangingConfigurations) {
            this.f51948b.q().V(this.f51949c, false);
        }
        this.f51949c.performDestroy();
        this.f51947a.d(this.f51949c, false);
        for (q0 q0Var : this.f51948b.l()) {
            if (q0Var != null) {
                Fragment fragmentK = q0Var.k();
                if (this.f51949c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.f51949c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f51949c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f51948b.f(str2);
        }
        this.f51948b.t(this);
    }

    void h() {
        View view;
        if (FragmentManager.b1(3)) {
            Objects.toString(this.f51949c);
        }
        Fragment fragment = this.f51949c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f51949c.performDestroyView();
        this.f51947a.n(this.f51949c, false);
        Fragment fragment2 = this.f51949c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.r(null);
        this.f51949c.mInLayout = false;
    }

    void i() {
        if (FragmentManager.b1(3)) {
            Objects.toString(this.f51949c);
        }
        this.f51949c.performDetach();
        this.f51947a.e(this.f51949c, false);
        Fragment fragment = this.f51949c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f51948b.q().j0(this.f51949c)) {
            return;
        }
        if (FragmentManager.b1(3)) {
            Objects.toString(this.f51949c);
        }
        this.f51949c.initState();
    }

    void j() {
        Fragment fragment = this.f51949c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.b1(3)) {
                Objects.toString(this.f51949c);
            }
            Bundle bundle = this.f51949c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle(f51941h) : null;
            Fragment fragment2 = this.f51949c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f51949c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f51949c;
                fragment3.mView.setTag(c2.a.c.f82385a, fragment3);
                Fragment fragment4 = this.f51949c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f51949c.performViewCreated();
                b0 b0Var = this.f51947a;
                Fragment fragment5 = this.f51949c;
                b0Var.m(fragment5, fragment5.mView, bundle2, false);
                this.f51949c.mState = 2;
            }
        }
    }

    @NonNull
    Fragment k() {
        return this.f51949c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f51950d) {
            if (FragmentManager.b1(2)) {
                Objects.toString(k());
                return;
            }
            return;
        }
        try {
            this.f51950d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.f51949c;
                int i10 = fragment.mState;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f51949c.mBeingSaved) {
                        if (FragmentManager.b1(3)) {
                            Objects.toString(this.f51949c);
                        }
                        this.f51948b.q().V(this.f51949c, true);
                        this.f51948b.t(this);
                        if (FragmentManager.b1(3)) {
                            Objects.toString(this.f51949c);
                        }
                        this.f51949c.initState();
                    }
                    Fragment fragment2 = this.f51949c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            f1 f1VarU = f1.u(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f51949c.mHidden) {
                                f1VarU.k(this);
                            } else {
                                f1VarU.m(this);
                            }
                        }
                        Fragment fragment3 = this.f51949c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.Z0(fragment3);
                        }
                        Fragment fragment4 = this.f51949c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f51949c.mChildFragmentManager.T();
                    }
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f51948b.r(fragment.mWho) == null) {
                                this.f51948b.C(this.f51949c.mWho, r());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f51949c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.b1(3)) {
                                Objects.toString(this.f51949c);
                            }
                            Fragment fragment5 = this.f51949c;
                            if (fragment5.mBeingSaved) {
                                this.f51948b.C(fragment5.mWho, r());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment6 = this.f51949c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                f1.u(viewGroup2, fragment6.getParentFragmentManager()).l(this);
                            }
                            this.f51949c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                f1.u(viewGroup3, fragment.getParentFragmentManager()).j(f1.d.b.n(this.f51949c.mView.getVisibility()), this);
                            }
                            this.f51949c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } finally {
            this.f51950d = false;
        }
    }

    void n() {
        if (FragmentManager.b1(3)) {
            Objects.toString(this.f51949c);
        }
        this.f51949c.performPause();
        this.f51947a.f(this.f51949c, false);
    }

    void o(@NonNull ClassLoader classLoader) {
        Bundle bundle = this.f51949c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f51949c.mSavedFragmentState.getBundle(f51941h) == null) {
            this.f51949c.mSavedFragmentState.putBundle(f51941h, new Bundle());
        }
        try {
            Fragment fragment = this.f51949c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(f51944k);
            Fragment fragment2 = this.f51949c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(f51945l);
            FragmentState fragmentState = (FragmentState) this.f51949c.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                Fragment fragment3 = this.f51949c;
                fragment3.mTargetWho = fragmentState.f51741m;
                fragment3.mTargetRequestCode = fragmentState.f51742n;
                Boolean bool = fragment3.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment3.mUserVisibleHint = bool.booleanValue();
                    this.f51949c.mSavedUserVisibleHint = null;
                } else {
                    fragment3.mUserVisibleHint = fragmentState.f51743o;
                }
            }
            Fragment fragment4 = this.f51949c;
            if (fragment4.mUserVisibleHint) {
                return;
            }
            fragment4.mDeferStart = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
        }
    }

    void p() {
        if (FragmentManager.b1(3)) {
            Objects.toString(this.f51949c);
        }
        View focusedView = this.f51949c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            focusedView.requestFocus();
            if (FragmentManager.b1(2)) {
                focusedView.toString();
                Objects.toString(this.f51949c);
                Objects.toString(this.f51949c.mView.findFocus());
            }
        }
        this.f51949c.setFocusedView(null);
        this.f51949c.performResume();
        this.f51947a.i(this.f51949c, false);
        this.f51948b.C(this.f51949c.mWho, null);
        Fragment fragment = this.f51949c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    @androidx.annotation.p0
    Fragment.SavedState q() {
        if (this.f51949c.mState > -1) {
            return new Fragment.SavedState(r());
        }
        return null;
    }

    @NonNull
    Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f51949c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f51949c));
        if (this.f51949c.mState > 0) {
            Bundle bundle3 = new Bundle();
            this.f51949c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle(f51941h, bundle3);
            }
            this.f51947a.j(this.f51949c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f51949c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle(f51942i, bundle4);
            }
            Bundle bundleS1 = this.f51949c.mChildFragmentManager.S1();
            if (!bundleS1.isEmpty()) {
                bundle2.putBundle(f51943j, bundleS1);
            }
            if (this.f51949c.mView != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.f51949c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray(f51944k, sparseArray);
            }
            Bundle bundle5 = this.f51949c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle(f51945l, bundle5);
            }
        }
        Bundle bundle6 = this.f51949c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle(f51946m, bundle6);
        }
        return bundle2;
    }

    void s() {
        if (this.f51949c.mView == null) {
            return;
        }
        if (FragmentManager.b1(2)) {
            Objects.toString(this.f51949c);
            Objects.toString(this.f51949c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f51949c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f51949c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f51949c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f51949c.mSavedViewRegistryState = bundle;
    }

    void t(int i10) {
        this.f51951e = i10;
    }

    void u() {
        if (FragmentManager.b1(3)) {
            Objects.toString(this.f51949c);
        }
        this.f51949c.performStart();
        this.f51947a.k(this.f51949c, false);
    }

    void v() {
        if (FragmentManager.b1(3)) {
            Objects.toString(this.f51949c);
        }
        this.f51949c.performStop();
        this.f51947a.l(this.f51949c, false);
    }

    q0(@NonNull b0 b0Var, @NonNull s0 s0Var, @NonNull ClassLoader classLoader, @NonNull w wVar, @NonNull Bundle bundle) {
        this.f51947a = b0Var;
        this.f51948b = s0Var;
        Fragment fragmentA = ((FragmentState) bundle.getParcelable("state")).a(wVar, classLoader);
        this.f51949c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle(f51946m);
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (FragmentManager.b1(2)) {
            Objects.toString(fragmentA);
        }
    }

    q0(@NonNull b0 b0Var, @NonNull s0 s0Var, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        this.f51947a = b0Var;
        this.f51948b = s0Var;
        this.f51949c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle(f51946m);
    }
}
