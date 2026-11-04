package com.planner5d.library.activity.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import rx.Observable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class FragmentController extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.widget.menu.q f131537a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f131539c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f131540d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final x f131538b = com.planner5d.library.view.application.c.f244831c.j().k(new ij.c() { // from class: com.planner5d.library.activity.fragment.p
        @Override // ij.c
        public final Object get() {
            return Observable.empty();
        }
    });

    protected FragmentController() {
    }

    public static FragmentController factory(Class<? extends FragmentController> cls, Bundle bundle, Bundle bundle2) {
        try {
            FragmentController fragmentControllerNewInstance = cls.newInstance();
            fragmentControllerNewInstance.setArguments(bundle);
            fragmentControllerNewInstance.f131539c = bundle2;
            return fragmentControllerNewInstance;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @kotlin.l(message = "This is a temp method to be used until we don't stop using savedInstanceStateDefault")
    private Bundle u(@p0 Bundle bundle) {
        if (bundle != null) {
            this.f131540d = bundle;
        }
        return bundle == null ? this.f131539c : bundle;
    }

    private void x() {
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
            activity.findViewById(com.planner5d.library.view.application.c.f244831c.f()).setVisibility(0);
        }
    }

    public Bundle getSavedInstanceState() {
        return this.f131540d;
    }

    @Override // androidx.fragment.app.Fragment
    @kotlin.l(message = "Prefer the extended version of this method instead")
    public void onActivityCreated(@p0 Bundle bundle) {
        super.onActivityCreated(bundle);
        x();
        onActivityCreatedExtended(u(bundle));
    }

    @kotlin.l(message = "This is a temp method to be used until we don't stop using savedInstanceStateDefault")
    protected void onActivityCreatedExtended(@p0 Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer the extended version of this method instead")
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        v(u(bundle));
    }

    @Override // androidx.fragment.app.Fragment
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer creation of a menu builder instead")
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        com.planner5d.library.widget.menu.l lVarT = t(menu, menuInflater);
        this.f131537a = lVarT == null ? null : lVarT.a();
    }

    @Override // androidx.fragment.app.Fragment
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer the extended version of this method instead")
    @p0
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        return onCreateViewExtended(layoutInflater, viewGroup, u(bundle));
    }

    @kotlin.l(message = "This is a temp method to be used until we don't stop using savedInstanceStateDefault")
    @p0
    protected View onCreateViewExtended(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        com.planner5d.library.widget.menu.q qVar = this.f131537a;
        return qVar != null && qVar.a(getActivity(), menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer the extended version of this method instead")
    public void onViewCreated(@NonNull View view, @p0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        w(view, u(bundle));
    }

    @p0
    protected com.planner5d.library.widget.menu.l t(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        return null;
    }

    @kotlin.l(message = "This is a temp method to be used until we don't stop using savedInstanceStateDefault")
    protected void v(@p0 Bundle bundle) {
    }

    @kotlin.l(message = "This is a temp method to be used until we don't stop using savedInstanceStateDefault")
    protected void w(@NonNull View view, @p0 Bundle bundle) {
    }
}
