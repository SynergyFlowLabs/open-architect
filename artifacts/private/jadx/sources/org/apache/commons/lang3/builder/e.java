package org.apache.commons.lang3.builder;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public class e implements Iterable<c<?>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f336966e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f336967f = "differs from";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c<?>> f336968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f336969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f336970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s f336971d;

    e(Object obj, Object obj2, List<c<?>> list, s sVar) {
        c0.v(obj != null, "Left hand object cannot be null", new Object[0]);
        c0.v(obj2 != null, "Right hand object cannot be null", new Object[0]);
        c0.v(list != null, "List of differences cannot be null", new Object[0]);
        this.f336968a = list;
        this.f336969b = obj;
        this.f336970c = obj2;
        if (sVar == null) {
            this.f336971d = s.Z;
        } else {
            this.f336971d = sVar;
        }
    }

    public List<c<?>> c() {
        return Collections.unmodifiableList(this.f336968a);
    }

    public int i() {
        return this.f336968a.size();
    }

    @Override // java.lang.Iterable
    public Iterator<c<?>> iterator() {
        return this.f336968a.iterator();
    }

    public s k() {
        return this.f336971d;
    }

    public String l(s sVar) {
        if (this.f336968a.size() == 0) {
            return "";
        }
        q qVar = new q(this.f336969b, sVar);
        q qVar2 = new q(this.f336970c, sVar);
        for (c<?> cVar : this.f336968a) {
            qVar.n(cVar.p(), cVar.k());
            qVar2.n(cVar.p(), cVar.l());
        }
        return String.format("%s %s %s", qVar.build(), f336967f, qVar2.build());
    }

    public String toString() {
        return l(this.f336971d);
    }
}
