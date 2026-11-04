package org.apache.commons.collections4.sequence;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class g<T> implements a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<T> f336271a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<T> f336272b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f336273c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h<T> f336274d;

    public g(h<T> hVar) {
        this.f336274d = hVar;
    }

    @Override // org.apache.commons.collections4.sequence.a
    public void a(T t10) {
        this.f336272b.add(t10);
    }

    @Override // org.apache.commons.collections4.sequence.a
    public void b(T t10) {
        this.f336271a.add(t10);
    }

    @Override // org.apache.commons.collections4.sequence.a
    public void c(T t10) {
        if (this.f336272b.isEmpty() && this.f336271a.isEmpty()) {
            this.f336273c++;
            return;
        }
        this.f336274d.a(this.f336273c, this.f336272b, this.f336271a);
        this.f336272b.clear();
        this.f336271a.clear();
        this.f336273c = 1;
    }
}
