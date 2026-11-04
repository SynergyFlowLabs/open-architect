package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.m2;
import androidx.lifecycle.o1;
import androidx.lifecycle.t1;

/* JADX INFO: loaded from: classes2.dex */
class y0 implements androidx.lifecycle.z, androidx.savedstate.m, m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fragment f52048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l2 f52049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f52050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j2.c f52051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.q0 f52052e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.savedstate.l f52053f = null;

    y0(@NonNull Fragment fragment, @NonNull l2 l2Var, @NonNull Runnable runnable) {
        this.f52048a = fragment;
        this.f52049b = l2Var;
        this.f52050c = runnable;
    }

    void a(@NonNull androidx.lifecycle.c0.a aVar) {
        this.f52052e.o(aVar);
    }

    void b() {
        if (this.f52052e == null) {
            this.f52052e = new androidx.lifecycle.q0(this);
            androidx.savedstate.l lVarA = androidx.savedstate.l.a(this);
            this.f52053f = lVarA;
            lVarA.c();
            this.f52050c.run();
        }
    }

    boolean c() {
        return this.f52052e != null;
    }

    void d(@androidx.annotation.p0 Bundle bundle) {
        this.f52053f.d(bundle);
    }

    void e(@NonNull Bundle bundle) {
        this.f52053f.e(bundle);
    }

    void f(@NonNull androidx.lifecycle.c0.b bVar) {
        this.f52052e.v(bVar);
    }

    @Override // androidx.lifecycle.z
    @NonNull
    @androidx.annotation.i
    public v2.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f52048a.requireContext().getApplicationContext();
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
        v2.f fVar = new v2.f();
        if (application != null) {
            fVar.c(j2.a.f52406h, application);
        }
        fVar.c(o1.f52458c, this.f52048a);
        fVar.c(o1.f52459d, this);
        if (this.f52048a.getArguments() != null) {
            fVar.c(o1.f52460e, this.f52048a.getArguments());
        }
        return fVar;
    }

    @Override // androidx.lifecycle.z
    @NonNull
    public j2.c getDefaultViewModelProviderFactory() {
        Application application;
        j2.c defaultViewModelProviderFactory = this.f52048a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f52048a.mDefaultFactory)) {
            this.f52051d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f52051d == null) {
            Context applicationContext = this.f52048a.requireContext().getApplicationContext();
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
            Fragment fragment = this.f52048a;
            this.f52051d = new t1(application, fragment, fragment.getArguments());
        }
        return this.f52051d;
    }

    @Override // androidx.lifecycle.o0
    @NonNull
    public androidx.lifecycle.c0 getLifecycle() {
        b();
        return this.f52052e;
    }

    @Override // androidx.savedstate.m
    @NonNull
    public androidx.savedstate.j getSavedStateRegistry() {
        b();
        return this.f52053f.b();
    }

    @Override // androidx.lifecycle.m2
    @NonNull
    public l2 getViewModelStore() {
        b();
        return this.f52049b;
    }
}
