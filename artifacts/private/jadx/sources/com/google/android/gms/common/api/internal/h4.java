package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class h4 extends Fragment implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f106045b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g4 f106046a = new g4();

    public static h4 t(androidx.fragment.app.s sVar) {
        h4 h4Var;
        WeakHashMap weakHashMap = f106045b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(sVar);
        if (weakReference != null && (h4Var = (h4) weakReference.get()) != null) {
            return h4Var;
        }
        try {
            h4 h4Var2 = (h4) sVar.getSupportFragmentManager().w0("SLifecycleFragmentImpl");
            if (h4Var2 == null || h4Var2.isRemoving()) {
                h4Var2 = new h4();
                sVar.getSupportFragmentManager().w().g(h4Var2, "SLifecycleFragmentImpl").n();
            }
            weakHashMap.put(sVar, new WeakReference(h4Var2));
            return h4Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final boolean a() {
        return this.f106046a.n();
    }

    @Override // com.google.android.gms.common.api.internal.n
    @androidx.annotation.p0
    public final <T extends m> T b(String str, Class<T> cls) {
        return (T) this.f106046a.c(str, cls);
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final boolean d() {
        return this.f106046a.m();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f106046a.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.n
    @androidx.annotation.p0
    public final Activity f() {
        return getActivity();
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void j(String str, @NonNull m mVar) {
        this.f106046a.d(str, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f106046a.f(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@androidx.annotation.p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f106046a.g(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f106046a.h();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f106046a.i();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f106046a.j(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f106046a.k();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f106046a.l();
    }
}
