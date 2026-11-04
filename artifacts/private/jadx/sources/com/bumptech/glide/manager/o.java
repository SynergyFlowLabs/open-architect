package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class o extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f97230g = "SupportRMFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.manager.a f97231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f97232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<o> f97233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private o f97234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private com.bumptech.glide.l f97235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private Fragment f97236f;

    private class a implements m {
        a() {
        }

        @Override // com.bumptech.glide.manager.m
        @NonNull
        public Set<com.bumptech.glide.l> a() {
            Set<o> setU = o.this.u();
            HashSet hashSet = new HashSet(setU.size());
            for (o oVar : setU) {
                if (oVar.x() != null) {
                    hashSet.add(oVar.x());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        this(new com.bumptech.glide.manager.a());
    }

    private boolean A(@NonNull Fragment fragment) {
        Fragment fragmentW = w();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(fragmentW)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void B(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        F();
        o oVarR = com.bumptech.glide.b.d(context).n().r(context, fragmentManager);
        this.f97234d = oVarR;
        if (!equals(oVarR)) {
            this.f97234d.t(this);
        }
    }

    private void C(o oVar) {
        this.f97233c.remove(oVar);
    }

    private void F() {
        o oVar = this.f97234d;
        if (oVar != null) {
            oVar.C(this);
            this.f97234d = null;
        }
    }

    private void t(o oVar) {
        this.f97233c.add(oVar);
    }

    @p0
    private Fragment w() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f97236f;
    }

    @p0
    private static FragmentManager z(@NonNull Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    void D(@p0 Fragment fragment) {
        FragmentManager fragmentManagerZ;
        this.f97236f = fragment;
        if (fragment != null && fragment.getContext() != null && (fragmentManagerZ = z(fragment)) != null) {
            B(fragment.getContext(), fragmentManagerZ);
        }
    }

    public void E(@p0 com.bumptech.glide.l lVar) {
        this.f97235e = lVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager fragmentManagerZ = z(this);
        if (fragmentManagerZ == null) {
            return;
        }
        try {
            B(getContext(), fragmentManagerZ);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f97231a.c();
        F();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f97236f = null;
        F();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f97231a.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f97231a.e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + w() + "}";
    }

    @NonNull
    Set<o> u() {
        o oVar = this.f97234d;
        if (oVar == null) {
            return Collections.EMPTY_SET;
        }
        if (equals(oVar)) {
            return Collections.unmodifiableSet(this.f97233c);
        }
        HashSet hashSet = new HashSet();
        for (o oVar2 : this.f97234d.u()) {
            if (A(oVar2.w())) {
                hashSet.add(oVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    com.bumptech.glide.manager.a v() {
        return this.f97231a;
    }

    @p0
    public com.bumptech.glide.l x() {
        return this.f97235e;
    }

    @NonNull
    public m y() {
        return this.f97232b;
    }

    @e.a({"ValidFragment"})
    @l1
    public o(@NonNull com.bumptech.glide.manager.a aVar) {
        this.f97232b = new a();
        this.f97233c = new HashSet();
        this.f97231a = aVar;
    }
}
