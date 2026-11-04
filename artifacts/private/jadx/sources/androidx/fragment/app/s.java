package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.lifecycle.l2;
import androidx.lifecycle.m2;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class s extends androidx.activity.l implements androidx.core.app.b.i, androidx.core.app.b.k {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.q0 mFragmentLifecycleRegistry;
    final v mFragments;
    boolean mResumed;
    boolean mStopped;

    class a extends x<s> implements androidx.core.content.e0, androidx.core.content.f0, androidx.core.app.d0, androidx.core.app.f0, m2, androidx.activity.m0, androidx.activity.result.l, androidx.savedstate.m, m0, androidx.core.view.l0 {
        public a() {
            super(s.this);
        }

        @Override // androidx.fragment.app.m0
        public void a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            s.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.l0
        public void addMenuProvider(@NonNull androidx.core.view.r0 r0Var) {
            s.this.addMenuProvider(r0Var);
        }

        @Override // androidx.core.content.e0
        public void addOnConfigurationChangedListener(@NonNull androidx.core.util.e<Configuration> eVar) {
            s.this.addOnConfigurationChangedListener(eVar);
        }

        @Override // androidx.core.app.d0
        public void addOnMultiWindowModeChangedListener(@NonNull androidx.core.util.e<androidx.core.app.r> eVar) {
            s.this.addOnMultiWindowModeChangedListener(eVar);
        }

        @Override // androidx.core.app.f0
        public void addOnPictureInPictureModeChangedListener(@NonNull androidx.core.util.e<androidx.core.app.k0> eVar) {
            s.this.addOnPictureInPictureModeChangedListener(eVar);
        }

        @Override // androidx.core.content.f0
        public void addOnTrimMemoryListener(@NonNull androidx.core.util.e<Integer> eVar) {
            s.this.addOnTrimMemoryListener(eVar);
        }

        @Override // androidx.fragment.app.x, androidx.fragment.app.u
        @androidx.annotation.p0
        public View c(int i10) {
            return s.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.x, androidx.fragment.app.u
        public boolean d() {
            Window window = s.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.l
        @NonNull
        public androidx.activity.result.k getActivityResultRegistry() {
            return s.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.o0
        @NonNull
        public androidx.lifecycle.c0 getLifecycle() {
            return s.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.m0
        @NonNull
        public androidx.activity.j0 getOnBackPressedDispatcher() {
            return s.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.savedstate.m
        @NonNull
        public androidx.savedstate.j getSavedStateRegistry() {
            return s.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.m2
        @NonNull
        public l2 getViewModelStore() {
            return s.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.x
        public void i(@NonNull String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
            s.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.core.view.l0
        public void invalidateMenu() {
            s.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.x
        @NonNull
        public LayoutInflater k() {
            return s.this.getLayoutInflater().cloneInContext(s.this);
        }

        @Override // androidx.fragment.app.x
        public int l() {
            Window window = s.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.x
        public boolean m() {
            return s.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.x
        public boolean o(@NonNull Fragment fragment) {
            return !s.this.isFinishing();
        }

        @Override // androidx.fragment.app.x
        public boolean p(@NonNull String str) {
            return androidx.core.app.b.S(s.this, str);
        }

        @Override // androidx.core.view.l0
        public void removeMenuProvider(@NonNull androidx.core.view.r0 r0Var) {
            s.this.removeMenuProvider(r0Var);
        }

        @Override // androidx.core.content.e0
        public void removeOnConfigurationChangedListener(@NonNull androidx.core.util.e<Configuration> eVar) {
            s.this.removeOnConfigurationChangedListener(eVar);
        }

        @Override // androidx.core.app.d0
        public void removeOnMultiWindowModeChangedListener(@NonNull androidx.core.util.e<androidx.core.app.r> eVar) {
            s.this.removeOnMultiWindowModeChangedListener(eVar);
        }

        @Override // androidx.core.app.f0
        public void removeOnPictureInPictureModeChangedListener(@NonNull androidx.core.util.e<androidx.core.app.k0> eVar) {
            s.this.removeOnPictureInPictureModeChangedListener(eVar);
        }

        @Override // androidx.core.content.f0
        public void removeOnTrimMemoryListener(@NonNull androidx.core.util.e<Integer> eVar) {
            s.this.removeOnTrimMemoryListener(eVar);
        }

        @Override // androidx.fragment.app.x
        public void t() {
            invalidateMenu();
        }

        @Override // androidx.fragment.app.x
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public s j() {
            return s.this;
        }

        @Override // androidx.core.view.l0
        public void addMenuProvider(@NonNull androidx.core.view.r0 r0Var, @NonNull androidx.lifecycle.o0 o0Var) {
            s.this.addMenuProvider(r0Var, o0Var);
        }

        @Override // androidx.core.view.l0
        public void addMenuProvider(@NonNull androidx.core.view.r0 r0Var, @NonNull androidx.lifecycle.o0 o0Var, @NonNull androidx.lifecycle.c0.b bVar) {
            s.this.addMenuProvider(r0Var, o0Var, bVar);
        }
    }

    public s() {
        this.mFragments = v.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.q0(this);
        this.mStopped = true;
        A();
    }

    private void A() {
        getSavedStateRegistry().d(LIFECYCLE_TAG, new androidx.savedstate.j.b() { // from class: androidx.fragment.app.o
            @Override // androidx.savedstate.j.b
            public final Bundle a() {
                return s.y(this.f51936a);
            }
        });
        addOnConfigurationChangedListener(new androidx.core.util.e() { // from class: androidx.fragment.app.p
            @Override // androidx.core.util.e
            public final void accept(Object obj) {
                this.f51937a.mFragments.F();
            }
        });
        addOnNewIntentListener(new androidx.core.util.e() { // from class: androidx.fragment.app.q
            @Override // androidx.core.util.e
            public final void accept(Object obj) {
                this.f51938a.mFragments.F();
            }
        });
        addOnContextAvailableListener(new androidx.activity.contextaware.d() { // from class: androidx.fragment.app.r
            @Override // androidx.activity.contextaware.d
            public final void a(Context context) {
                this.f51955a.mFragments.a(null);
            }
        });
    }

    private static boolean B(FragmentManager fragmentManager, androidx.lifecycle.c0.b bVar) {
        boolean zB = false;
        for (Fragment fragment : fragmentManager.N0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zB |= B(fragment.getChildFragmentManager(), bVar);
                }
                y0 y0Var = fragment.mViewLifecycleOwner;
                if (y0Var != null && y0Var.getLifecycle().d().n(androidx.lifecycle.c0.b.STARTED)) {
                    fragment.mViewLifecycleOwner.f(bVar);
                    zB = true;
                }
                if (fragment.mLifecycleRegistry.d().n(androidx.lifecycle.c0.b.STARTED)) {
                    fragment.mLifecycleRegistry.v(bVar);
                    zB = true;
                }
            }
        }
        return zB;
    }

    public static /* synthetic */ Bundle y(s sVar) {
        sVar.markFragmentsCreated();
        sVar.mFragmentLifecycleRegistry.o(androidx.lifecycle.c0.a.ON_STOP);
        return new Bundle();
    }

    @androidx.annotation.p0
    final View dispatchFragmentsOnCreateView(@androidx.annotation.p0 View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.G(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.d(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.D().h0(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.D();
    }

    @NonNull
    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.d(this);
    }

    void markFragmentsCreated() {
        while (B(getSupportFragmentManager(), androidx.lifecycle.c0.b.CREATED)) {
        }
    }

    @Override // androidx.activity.l, android.app.Activity
    @androidx.annotation.i
    protected void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        this.mFragments.F();
        super.onActivityResult(i10, i11, intent);
    }

    @androidx.annotation.l0
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@androidx.annotation.p0 Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.o(androidx.lifecycle.c0.a.ON_CREATE);
        this.mFragments.f();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @androidx.annotation.p0
    public View onCreateView(@androidx.annotation.p0 View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.o(androidx.lifecycle.c0.a.ON_DESTROY);
    }

    @Override // androidx.activity.l, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.e(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.n();
        this.mFragmentLifecycleRegistry.o(androidx.lifecycle.c0.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.l, android.app.Activity
    @androidx.annotation.i
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.F();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.F();
        super.onResume();
        this.mResumed = true;
        this.mFragments.z();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.o(androidx.lifecycle.c0.a.ON_RESUME);
        this.mFragments.r();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.F();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.z();
        this.mFragmentLifecycleRegistry.o(androidx.lifecycle.c0.a.ON_START);
        this.mFragments.s();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.F();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.t();
        this.mFragmentLifecycleRegistry.o(androidx.lifecycle.c0.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(@androidx.annotation.p0 androidx.core.app.o0 o0Var) {
        androidx.core.app.b.O(this, o0Var);
    }

    public void setExitSharedElementCallback(@androidx.annotation.p0 androidx.core.app.o0 o0Var) {
        androidx.core.app.b.P(this, o0Var);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i10, @androidx.annotation.p0 Intent intent, int i11, int i12, int i13, @androidx.annotation.p0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            androidx.core.app.b.U(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.E(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.J(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.V(this);
    }

    @Override // androidx.core.app.b.k
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i10, @androidx.annotation.p0 Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.b.T(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @androidx.annotation.p0
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @androidx.annotation.o
    public s(@androidx.annotation.j0 int i10) {
        super(i10);
        this.mFragments = v.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.q0(this);
        this.mStopped = true;
        A();
    }
}
