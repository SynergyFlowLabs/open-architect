package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class e4 extends Fragment implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f106017b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g4 f106018a = new g4();

    public static e4 c(Activity activity) {
        e4 e4Var;
        WeakHashMap weakHashMap = f106017b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (e4Var = (e4) weakReference.get()) != null) {
            return e4Var;
        }
        try {
            e4 e4Var2 = (e4) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (e4Var2 == null || e4Var2.isRemoving()) {
                e4Var2 = new e4();
                activity.getFragmentManager().beginTransaction().add(e4Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(e4Var2));
            return e4Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final boolean a() {
        return this.f106018a.n();
    }

    @Override // com.google.android.gms.common.api.internal.n
    @androidx.annotation.p0
    public final <T extends m> T b(String str, Class<T> cls) {
        return (T) this.f106018a.c(str, cls);
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final boolean d() {
        return this.f106018a.m();
    }

    @Override // android.app.Fragment
    public final void dump(String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f106018a.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.n
    @androidx.annotation.p0
    public final Activity f() {
        return getActivity();
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void j(String str, @NonNull m mVar) {
        this.f106018a.d(str, mVar);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f106018a.f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(@androidx.annotation.p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f106018a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f106018a.h();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f106018a.i();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f106018a.j(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f106018a.k();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f106018a.l();
    }
}
