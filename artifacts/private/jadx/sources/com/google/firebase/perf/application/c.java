package com.google.firebase.perf.application;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.metrics.g;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.f;
import com.google.firebase.perf.util.i;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class c extends FragmentManager.n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f123855f = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Fragment, Trace> f123856a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.perf.util.a f123857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f123858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f123859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f123860e;

    public c(com.google.firebase.perf.util.a aVar, k kVar, a aVar2, d dVar) {
        this.f123857b = aVar;
        this.f123858c = kVar;
        this.f123859d = aVar2;
        this.f123860e = dVar;
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public void f(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        super.f(fragmentManager, fragment);
        com.google.firebase.perf.logging.a aVar = f123855f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f123856a.containsKey(fragment)) {
            aVar.m("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f123856a.get(fragment);
        this.f123856a.remove(fragment);
        f<g.a> fVarF = this.f123860e.f(fragment);
        if (!fVarF.d()) {
            aVar.m("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            i.a(trace, fVarF.c());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public void i(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        super.i(fragmentManager, fragment);
        f123855f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(o(fragment), this.f123858c, this.f123857b, this.f123859d);
        trace.start();
        trace.putAttribute(com.google.firebase.perf.util.b.f124204q, fragment.getParentFragment() == null ? com.google.firebase.perf.util.b.f124206s : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute(com.google.firebase.perf.util.b.f124205r, fragment.getActivity().getClass().getSimpleName());
        }
        this.f123856a.put(fragment, trace);
        this.f123860e.d(fragment);
    }

    public String o(Fragment fragment) {
        return com.google.firebase.perf.util.b.f124203p + fragment.getClass().getSimpleName();
    }

    @l1
    WeakHashMap<Fragment, Trace> p() {
        return this.f123856a;
    }
}
