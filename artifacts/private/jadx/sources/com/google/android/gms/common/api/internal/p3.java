package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class p3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f106169d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.a f106167b = new androidx.collection.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.tasks.l f106168c = new com.google.android.gms.tasks.l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f106170e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.a f106166a = new androidx.collection.a();

    public p3(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f106166a.put(((com.google.android.gms.common.api.m) it.next()).k0(), null);
        }
        this.f106169d = this.f106166a.keySet().size();
    }

    public final Task a() {
        return this.f106168c.a();
    }

    public final Set b() {
        return this.f106166a.keySet();
    }

    public final void c(c cVar, ConnectionResult connectionResult, @androidx.annotation.p0 String str) {
        this.f106166a.put(cVar, connectionResult);
        this.f106167b.put(cVar, str);
        this.f106169d--;
        if (!connectionResult.f2()) {
            this.f106170e = true;
        }
        if (this.f106169d == 0) {
            if (!this.f106170e) {
                this.f106168c.c(this.f106167b);
            } else {
                this.f106168c.b(new com.google.android.gms.common.api.c(this.f106166a));
            }
        }
    }
}
