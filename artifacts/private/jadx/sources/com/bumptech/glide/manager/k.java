package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class k extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f97204g = "RMFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.manager.a f97205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f97206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<k> f97207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private com.bumptech.glide.l f97208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private k f97209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private Fragment f97210f;

    private class a implements m {
        a() {
        }

        @Override // com.bumptech.glide.manager.m
        @NonNull
        public Set<com.bumptech.glide.l> a() {
            Set<k> setB = k.this.b();
            HashSet hashSet = new HashSet(setB.size());
            for (k kVar : setB) {
                if (kVar.e() != null) {
                    hashSet.add(kVar.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        this(new com.bumptech.glide.manager.a());
    }

    private void a(k kVar) {
        this.f97207c.add(kVar);
    }

    @e.b(17)
    @p0
    private Fragment d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f97210f;
    }

    @e.b(17)
    private boolean g(@NonNull Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(@NonNull Activity activity) {
        l();
        k kVarP = com.bumptech.glide.b.d(activity).n().p(activity);
        this.f97209e = kVarP;
        if (equals(kVarP)) {
            return;
        }
        this.f97209e.a(this);
    }

    private void i(k kVar) {
        this.f97207c.remove(kVar);
    }

    private void l() {
        k kVar = this.f97209e;
        if (kVar != null) {
            kVar.i(this);
            this.f97209e = null;
        }
    }

    @NonNull
    @e.b(17)
    Set<k> b() {
        if (equals(this.f97209e)) {
            return Collections.unmodifiableSet(this.f97207c);
        }
        if (this.f97209e == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        for (k kVar : this.f97209e.b()) {
            if (g(kVar.getParentFragment())) {
                hashSet.add(kVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    com.bumptech.glide.manager.a c() {
        return this.f97205a;
    }

    @p0
    public com.bumptech.glide.l e() {
        return this.f97208d;
    }

    @NonNull
    public m f() {
        return this.f97206b;
    }

    void j(@p0 Fragment fragment) {
        this.f97210f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            h(fragment.getActivity());
        }
    }

    public void k(@p0 com.bumptech.glide.l lVar) {
        this.f97208d = lVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f97205a.c();
        l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f97205a.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f97205a.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }

    @e.a({"ValidFragment"})
    @l1
    k(@NonNull com.bumptech.glide.manager.a aVar) {
        this.f97206b = new a();
        this.f97207c = new HashSet();
        this.f97205a = aVar;
    }
}
