package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.model.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f121315c = "rolloutsState";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<j> f121316a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f121317b;

    public k(int i10) {
        this.f121317b = i10;
    }

    public List<f0.f.d.e> a() {
        List<j> listB = b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listB.size(); i10++) {
            arrayList.add(listB.get(i10).h());
        }
        return arrayList;
    }

    public synchronized List<j> b() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return Collections.unmodifiableList(new ArrayList(this.f121316a));
    }

    @z7.a
    public synchronized boolean c(List<j> list) {
        try {
            this.f121316a.clear();
            if (list.size() <= this.f121317b) {
                return this.f121316a.addAll(list);
            }
            com.google.firebase.crashlytics.internal.g.f().m("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f121317b);
            return this.f121316a.addAll(list.subList(0, this.f121317b));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
