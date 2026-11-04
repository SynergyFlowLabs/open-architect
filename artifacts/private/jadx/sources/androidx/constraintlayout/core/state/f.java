package androidx.constraintlayout.core.state;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class f extends a implements androidx.constraintlayout.core.state.helpers.e {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected final k f44278m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    final k.d f44279n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    protected ArrayList<Object> f44280o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.j f44281p0;

    public f(k kVar, k.d dVar) {
        super(kVar);
        this.f44280o0 = new ArrayList<>();
        this.f44278m0 = kVar;
        this.f44279n0 = dVar;
    }

    public f P0(Object... objArr) {
        Collections.addAll(this.f44280o0, objArr);
        return this;
    }

    public void Q0() {
        super.apply();
    }

    public androidx.constraintlayout.core.widgets.j R0() {
        return this.f44281p0;
    }

    public k.d S0() {
        return this.f44279n0;
    }

    public void T0(androidx.constraintlayout.core.widgets.j jVar) {
        this.f44281p0 = jVar;
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.h
    public androidx.constraintlayout.core.widgets.e a() {
        return R0();
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.h
    public void apply() {
    }
}
