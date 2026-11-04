package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
abstract class s<S> extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final LinkedHashSet<r<S>> f112508a = new LinkedHashSet<>();

    s() {
    }

    boolean t(r<S> rVar) {
        return this.f112508a.add(rVar);
    }

    void u() {
        this.f112508a.clear();
    }

    abstract DateSelector<S> v();

    boolean w(r<S> rVar) {
        return this.f112508a.remove(rVar);
    }
}
