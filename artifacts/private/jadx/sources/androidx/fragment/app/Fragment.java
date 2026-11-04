package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.k1;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.m2;
import androidx.lifecycle.n2;
import androidx.lifecycle.o1;
import androidx.lifecycle.p2;
import androidx.lifecycle.t1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.o0, m2, androidx.lifecycle.z, androidx.savedstate.m, androidx.activity.result.b {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;

    @androidx.annotation.j0
    private int mContentLayoutId;
    j2.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    x<?> mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.q0 mLifecycleRegistry;
    androidx.lifecycle.c0.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<m> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.p0
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final m mSavedStateAttachListener;
    androidx.savedstate.l mSavedStateRegistryController;

    @androidx.annotation.p0
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;

    @androidx.annotation.p0
    y0 mViewLifecycleOwner;
    androidx.lifecycle.c1<androidx.lifecycle.o0> mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    /* JADX INFO: Add missing generic type declarations: [I] */
    class a<I> extends androidx.activity.result.h<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f51617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.a f51618b;

        a(AtomicReference atomicReference, g.a aVar) {
            this.f51617a = atomicReference;
            this.f51618b = aVar;
        }

        @Override // androidx.activity.result.h
        @NonNull
        public g.a<I, ?> a() {
            return this.f51618b;
        }

        @Override // androidx.activity.result.h
        public void c(I i10, @androidx.annotation.p0 androidx.core.app.e eVar) {
            androidx.activity.result.h hVar = (androidx.activity.result.h) this.f51617a.get();
            if (hVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            hVar.c(i10, eVar);
        }

        @Override // androidx.activity.result.h
        public void d() {
            androidx.activity.result.h hVar = (androidx.activity.result.h) this.f51617a.getAndSet(null);
            if (hVar != null) {
                hVar.d();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    class c extends m {
        c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.m
        void a() {
            Fragment.this.mSavedStateRegistryController.c();
            o1.c(Fragment.this);
            Bundle bundle = Fragment.this.mSavedFragmentState;
            Fragment.this.mSavedStateRegistryController.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1 f51623a;

        e(f1 f1Var) {
            this.f51623a = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f51623a.y()) {
                this.f51623a.n();
            }
        }
    }

    class f extends u {
        f() {
        }

        @Override // androidx.fragment.app.u
        @androidx.annotation.p0
        public View c(int i10) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.u
        public boolean d() {
            return Fragment.this.mView != null;
        }
    }

    class g implements androidx.lifecycle.j0 {
        g() {
        }

        @Override // androidx.lifecycle.j0
        public void e(@NonNull androidx.lifecycle.o0 o0Var, @NonNull androidx.lifecycle.c0.a aVar) {
            View view;
            if (aVar != androidx.lifecycle.c0.a.ON_STOP || (view = Fragment.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    class h implements n.a<Void, androidx.activity.result.k> {
        h() {
        }

        @Override // n.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.k apply(Void r10) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof androidx.activity.result.l ? ((androidx.activity.result.l) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    class i implements n.a<Void, androidx.activity.result.k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.activity.result.k f51628a;

        i(androidx.activity.result.k kVar) {
            this.f51628a = kVar;
        }

        @Override // n.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.k apply(Void r10) {
            return this.f51628a;
        }
    }

    class j extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f51630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f51631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g.a f51632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.activity.result.a f51633d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(n.a aVar, AtomicReference atomicReference, g.a aVar2, androidx.activity.result.a aVar3) {
            super(null);
            this.f51630a = aVar;
            this.f51631b = atomicReference;
            this.f51632c = aVar2;
            this.f51633d = aVar3;
        }

        @Override // androidx.fragment.app.Fragment.m
        void a() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f51631b.set(((androidx.activity.result.k) this.f51630a.apply(null)).l(strGenerateActivityResultKey, Fragment.this, this.f51632c, this.f51633d));
        }
    }

    static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f51635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f51636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.a
        int f51637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.a
        int f51638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.a
        int f51639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.a
        int f51640f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f51641g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ArrayList<String> f51642h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ArrayList<String> f51643i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f51644j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f51645k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f51646l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f51647m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51648n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f51649o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f51650p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f51651q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        androidx.core.app.o0 f51652r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        androidx.core.app.o0 f51653s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float f51654t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        View f51655u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f51656v;

        k() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f51645k = obj;
            this.f51646l = null;
            this.f51647m = obj;
            this.f51648n = null;
            this.f51649o = obj;
            this.f51652r = null;
            this.f51653s = null;
            this.f51654t = 1.0f;
            this.f51655u = null;
        }
    }

    public static class l extends RuntimeException {
        public l(@NonNull String str, @androidx.annotation.p0 Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class m {
        private m() {
        }

        abstract void a();

        /* synthetic */ m(b bVar) {
            this();
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new i0();
        int i10 = 7 ^ 1;
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = androidx.lifecycle.c0.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.c1<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        p();
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    public static /* synthetic */ void l(Fragment fragment) {
        fragment.mViewLifecycleOwner.d(fragment.mSavedViewRegistryState);
        fragment.mSavedViewRegistryState = null;
    }

    private k m() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new k();
        }
        return this.mAnimationInfo;
    }

    private int n() {
        androidx.lifecycle.c0.b bVar = this.mMaxState;
        return (bVar == androidx.lifecycle.c0.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.n());
    }

    @androidx.annotation.p0
    private Fragment o(boolean z10) {
        String str;
        if (z10) {
            d2.d.m(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.s0(str);
    }

    private void p() {
        this.mLifecycleRegistry = new androidx.lifecycle.q0(this);
        this.mSavedStateRegistryController = androidx.savedstate.l.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        r(this.mSavedStateAttachListener);
    }

    @NonNull
    private <I, O> androidx.activity.result.h<I> q(@NonNull g.a<I, O> aVar, @NonNull n.a<Void, androidx.activity.result.k> aVar2, @NonNull androidx.activity.result.a<O> aVar3) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            r(new j(aVar2, atomicReference, aVar, aVar3));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void r(@NonNull m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    private void s() {
        if (FragmentManager.b1(3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f51656v = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        f1 f1VarU = f1.u(viewGroup, fragmentManager);
        f1VarU.z();
        if (z10) {
            this.mHost.h().post(new e(f1VarU));
        } else {
            f1VarU.n();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    u createFragmentContainer() {
        return new f();
    }

    public void dump(@NonNull String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment fragmentO = o(false);
        if (fragmentO != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentO);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.d(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.h0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        return super.equals(obj);
    }

    @androidx.annotation.p0
    Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.x0(str);
    }

    @NonNull
    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @androidx.annotation.p0
    public final s getActivity() {
        x<?> xVar = this.mHost;
        if (xVar == null) {
            return null;
        }
        return (s) xVar.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f51651q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f51650p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f51635a;
    }

    @androidx.annotation.p0
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @androidx.annotation.p0
    public Context getContext() {
        x<?> xVar = this.mHost;
        if (xVar == null) {
            return null;
        }
        return xVar.f();
    }

    @Override // androidx.lifecycle.z
    @NonNull
    @androidx.annotation.i
    public v2.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.b1(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        v2.f fVar = new v2.f();
        if (application != null) {
            fVar.c(j2.a.f52406h, application);
        }
        fVar.c(o1.f52458c, this);
        fVar.c(o1.f52459d, this);
        if (getArguments() != null) {
            fVar.c(o1.f52460e, getArguments());
        }
        return fVar;
    }

    @Override // androidx.lifecycle.z
    @NonNull
    public j2.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.b1(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new t1(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @androidx.annotation.a
    int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f51637c;
    }

    @androidx.annotation.p0
    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f51644j;
    }

    androidx.core.app.o0 getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f51652r;
    }

    @androidx.annotation.a
    int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f51638d;
    }

    @androidx.annotation.p0
    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f51646l;
    }

    androidx.core.app.o0 getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f51653s;
    }

    View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f51655u;
    }

    @androidx.annotation.p0
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @androidx.annotation.p0
    public final Object getHost() {
        x<?> xVar = this.mHost;
        if (xVar == null) {
            return null;
        }
        return xVar.j();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        boolean z10 = false | false;
        return performGetLayoutInflater(null);
    }

    @Override // androidx.lifecycle.o0
    @NonNull
    public androidx.lifecycle.c0 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.d(this);
    }

    int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f51641g;
    }

    @androidx.annotation.p0
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f51636b;
    }

    @androidx.annotation.a
    int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f51639e;
    }

    @androidx.annotation.a
    int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f51640f;
    }

    float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f51654t;
    }

    @androidx.annotation.p0
    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f51647m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        d2.d.k(this);
        return this.mRetainInstance;
    }

    @androidx.annotation.p0
    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f51645k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.savedstate.m
    @NonNull
    public final androidx.savedstate.j getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @androidx.annotation.p0
    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f51648n;
    }

    @androidx.annotation.p0
    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f51649o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f51642h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f51643i) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(@androidx.annotation.f1 int i10) {
        return getResources().getString(i10);
    }

    @androidx.annotation.p0
    public final String getTag() {
        return this.mTag;
    }

    @androidx.annotation.p0
    @Deprecated
    public final Fragment getTargetFragment() {
        return o(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        d2.d.l(this);
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(@androidx.annotation.f1 int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @androidx.annotation.p0
    public View getView() {
        return this.mView;
    }

    @NonNull
    @androidx.annotation.l0
    public androidx.lifecycle.o0 getViewLifecycleOwner() {
        y0 y0Var = this.mViewLifecycleOwner;
        if (y0Var != null) {
            return y0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @NonNull
    public androidx.lifecycle.w0<androidx.lifecycle.o0> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.m2
    @NonNull
    public l2 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (n() != androidx.lifecycle.c0.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.W0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @e.a({"KotlinPropertyAccess"})
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        p();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new i0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        return this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.e1(this.mParentFragment));
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        return fragmentManager == null || fragmentManager.f1(this.mParentFragment);
    }

    boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f51656v;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.i1();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.n1();
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    @Deprecated
    public void onActivityCreated(@androidx.annotation.p0 Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        if (FragmentManager.b1(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        x<?> xVar = this.mHost;
        Activity activityE = xVar == null ? null : xVar.e();
        if (activityE != null) {
            this.mCalled = false;
            onAttach(activityE);
        }
    }

    @androidx.annotation.l0
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @androidx.annotation.i
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    @androidx.annotation.l0
    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onCreate(@androidx.annotation.p0 Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.h1(1)) {
            return;
        }
        this.mChildFragmentManager.M();
    }

    @androidx.annotation.l0
    @androidx.annotation.p0
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    @androidx.annotation.l0
    @androidx.annotation.p0
    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @androidx.annotation.l0
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, @androidx.annotation.p0 ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @androidx.annotation.l0
    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @androidx.annotation.l0
    @androidx.annotation.p0
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, @androidx.annotation.p0 Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onDestroy() {
        this.mCalled = true;
    }

    @androidx.annotation.l0
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onDestroyView() {
        this.mCalled = true;
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@androidx.annotation.p0 Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @androidx.annotation.l0
    public void onHiddenChanged(boolean z10) {
    }

    @androidx.annotation.i
    @k1
    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, @androidx.annotation.p0 Bundle bundle) {
        this.mCalled = true;
        x<?> xVar = this.mHost;
        Activity activityE = xVar == null ? null : xVar.e();
        if (activityE != null) {
            this.mCalled = false;
            onInflate(activityE, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @androidx.annotation.i
    @androidx.annotation.l0
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @androidx.annotation.l0
    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @androidx.annotation.l0
    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @androidx.annotation.l0
    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    @androidx.annotation.l0
    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onResume() {
        this.mCalled = true;
    }

    @androidx.annotation.l0
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onStart() {
        this.mCalled = true;
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onStop() {
        this.mCalled = true;
    }

    @androidx.annotation.l0
    public void onViewCreated(@NonNull View view, @androidx.annotation.p0 Bundle bundle) {
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void onViewStateRestored(@androidx.annotation.p0 Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.n1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            s();
            this.mChildFragmentManager.I();
        } else {
            throw new h1("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        Iterator<m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.u(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.S(this);
            this.mChildFragmentManager.J();
        } else {
            throw new h1("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.L(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.n1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.c(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.o(androidx.lifecycle.c0.a.ON_CREATE);
            return;
        }
        throw new h1("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return this.mChildFragmentManager.N(menu, menuInflater) | z10;
    }

    void performCreateView(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, @androidx.annotation.p0 Bundle bundle) {
        this.mChildFragmentManager.n1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new y0(this, getViewModelStore(), new Runnable() { // from class: androidx.fragment.app.n
            @Override // java.lang.Runnable
            public final void run() {
                Fragment.l(this.f51935a);
            }
        });
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (FragmentManager.b1(3)) {
            Objects.toString(this.mView);
            toString();
        }
        n2.b(this.mView, this.mViewLifecycleOwner);
        p2.b(this.mView, this.mViewLifecycleOwner);
        androidx.savedstate.r.b(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.r(this.mViewLifecycleOwner);
    }

    void performDestroy() {
        this.mChildFragmentManager.O();
        this.mLifecycleRegistry.o(androidx.lifecycle.c0.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new h1("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.P();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().d().n(androidx.lifecycle.c0.b.CREATED)) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.c0.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.d(this).h();
            this.mPerformedCreateView = false;
        } else {
            throw new h1("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        int i10 = 5 ^ 0;
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.a1()) {
                return;
            }
            this.mChildFragmentManager.O();
            this.mChildFragmentManager = new i0();
            return;
        }
        throw new h1("Fragment " + this + " did not call through to super.onDetach()");
    }

    @NonNull
    LayoutInflater performGetLayoutInflater(@androidx.annotation.p0 Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.U(menuItem);
    }

    void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.V(menu);
    }

    void performPause() {
        this.mChildFragmentManager.X();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.c0.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.o(androidx.lifecycle.c0.a.ON_PAUSE);
        this.mState = 6;
        int i10 = 7 >> 0;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new h1("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return this.mChildFragmentManager.Z(menu) | z10;
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zG1 = this.mFragmentManager.g1(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool != null && bool.booleanValue() == zG1) {
            return;
        }
        this.mIsPrimaryNavigationFragment = Boolean.valueOf(zG1);
        onPrimaryNavigationFragmentChanged(zG1);
        this.mChildFragmentManager.a0();
    }

    void performResume() {
        this.mChildFragmentManager.n1();
        this.mChildFragmentManager.n0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new h1("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.q0 q0Var = this.mLifecycleRegistry;
        androidx.lifecycle.c0.a aVar = androidx.lifecycle.c0.a.ON_RESUME;
        q0Var.o(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.b0();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    void performStart() {
        this.mChildFragmentManager.n1();
        this.mChildFragmentManager.n0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new h1("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.q0 q0Var = this.mLifecycleRegistry;
        androidx.lifecycle.c0.a aVar = androidx.lifecycle.c0.a.ON_START;
        q0Var.o(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.c0();
    }

    void performStop() {
        this.mChildFragmentManager.e0();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.c0.a.ON_STOP);
        }
        this.mLifecycleRegistry.o(androidx.lifecycle.c0.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new h1("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.f0();
    }

    public void postponeEnterTransition() {
        m().f51656v = true;
    }

    @Override // androidx.activity.result.b
    @NonNull
    @androidx.annotation.l0
    public final <I, O> androidx.activity.result.h<I> registerForActivityResult(@NonNull g.a<I, O> aVar, @NonNull androidx.activity.result.a<O> aVar2) {
        return q(aVar, new h(), aVar2);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i10) {
        if (this.mHost != null) {
            getParentFragmentManager().j1(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @NonNull
    public final s requireActivity() {
        s activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @NonNull
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.mChildFragmentManager.O1(bundle);
            this.mChildFragmentManager.M();
        }
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.c0.a.ON_CREATE);
            }
        } else {
            throw new h1("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        m().f51651q = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        m().f51650p = Boolean.valueOf(z10);
    }

    void setAnimations(@androidx.annotation.a int i10, @androidx.annotation.a int i11, @androidx.annotation.a int i12, @androidx.annotation.a int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        m().f51637c = i10;
        m().f51638d = i11;
        m().f51639e = i12;
        m().f51640f = i13;
    }

    public void setArguments(@androidx.annotation.p0 Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@androidx.annotation.p0 androidx.core.app.o0 o0Var) {
        m().f51652r = o0Var;
    }

    public void setEnterTransition(@androidx.annotation.p0 Object obj) {
        m().f51644j = obj;
    }

    public void setExitSharedElementCallback(@androidx.annotation.p0 androidx.core.app.o0 o0Var) {
        m().f51653s = o0Var;
    }

    public void setExitTransition(@androidx.annotation.p0 Object obj) {
        m().f51646l = obj;
    }

    void setFocusedView(View view) {
        m().f51655u = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.t();
        }
    }

    public void setInitialSavedState(@androidx.annotation.p0 SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f51616a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.t();
            }
        }
    }

    void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        m();
        this.mAnimationInfo.f51641g = i10;
    }

    void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m().f51636b = z10;
    }

    void setPostOnViewCreatedAlpha(float f10) {
        m().f51654t = f10;
    }

    public void setReenterTransition(@androidx.annotation.p0 Object obj) {
        m().f51647m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        d2.d.o(this);
        this.mRetainInstance = z10;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            fragmentManager.s(this);
        } else {
            fragmentManager.I1(this);
        }
    }

    public void setReturnTransition(@androidx.annotation.p0 Object obj) {
        m().f51645k = obj;
    }

    public void setSharedElementEnterTransition(@androidx.annotation.p0 Object obj) {
        m().f51648n = obj;
    }

    void setSharedElementNames(@androidx.annotation.p0 ArrayList<String> arrayList, @androidx.annotation.p0 ArrayList<String> arrayList2) {
        m();
        k kVar = this.mAnimationInfo;
        kVar.f51642h = arrayList;
        kVar.f51643i = arrayList2;
    }

    public void setSharedElementReturnTransition(@androidx.annotation.p0 Object obj) {
        m().f51649o = obj;
    }

    @Deprecated
    public void setTargetFragment(@androidx.annotation.p0 Fragment fragment, int i10) {
        if (fragment != null) {
            d2.d.p(this, fragment, i10);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragmentO = fragment; fragmentO != null; fragmentO = fragmentO.o(false)) {
            if (fragmentO.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        d2.d.q(this, z10);
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.q1(fragmentManager.G(this));
        }
        this.mUserVisibleHint = z10;
        this.mDeferStart = this.mState < 5 && !z10;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        x<?> xVar = this.mHost;
        if (xVar != null) {
            return xVar.p(str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, @androidx.annotation.p0 Intent intent, int i11, int i12, int i13, @androidx.annotation.p0 Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.b1(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        getParentFragmentManager().l1(this, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && m().f51656v) {
            if (this.mHost == null) {
                m().f51656v = false;
            } else {
                if (Looper.myLooper() != this.mHost.h().getLooper()) {
                    this.mHost.h().postAtFrontOfQueue(new d());
                    return;
                }
                callStartTransitionListener(true);
            }
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @e.a({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f51616a;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Bundle bundle) {
            this.f51616a = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeBundle(this.f51616a);
        }

        SavedState(@NonNull Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f51616a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @androidx.annotation.p0 Bundle bundle) {
        try {
            Fragment fragmentNewInstance = w.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragmentNewInstance;
            }
            bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
            fragmentNewInstance.setArguments(bundle);
            return fragmentNewInstance;
        } catch (IllegalAccessException e10) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    @NonNull
    public final String getString(@androidx.annotation.f1 int i10, @androidx.annotation.p0 Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j10, @NonNull TimeUnit timeUnit) {
        m().f51656v = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.O0().h();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    @Override // androidx.activity.result.b
    @NonNull
    @androidx.annotation.l0
    public final <I, O> androidx.activity.result.h<I> registerForActivityResult(@NonNull g.a<I, O> aVar, @NonNull androidx.activity.result.k kVar, @NonNull androidx.activity.result.a<O> aVar2) {
        return q(aVar, new i(kVar), aVar2);
    }

    public void startActivity(@NonNull Intent intent, @androidx.annotation.p0 Bundle bundle) {
        x<?> xVar = this.mHost;
        if (xVar != null) {
            xVar.r(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10, @androidx.annotation.p0 Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().k1(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater getLayoutInflater(@androidx.annotation.p0 Bundle bundle) {
        x<?> xVar = this.mHost;
        if (xVar != null) {
            LayoutInflater layoutInflaterK = xVar.k();
            androidx.core.view.h0.d(layoutInflaterK, this.mChildFragmentManager.P0());
            return layoutInflaterK;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @androidx.annotation.i
    @k1
    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, @androidx.annotation.p0 Bundle bundle) {
        this.mCalled = true;
    }

    @androidx.annotation.o
    public Fragment(@androidx.annotation.j0 int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
