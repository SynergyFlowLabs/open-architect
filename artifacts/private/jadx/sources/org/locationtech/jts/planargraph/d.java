package org.locationtech.jts.planargraph;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f338955a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f338956b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f338957c;

    public static d b(Iterator it, boolean z10) {
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.p() == z10) {
                return dVar;
            }
        }
        return null;
    }

    public static void s(Iterator it, boolean z10) {
        while (it.hasNext()) {
            ((d) it.next()).t(z10);
        }
    }

    public static void v(Iterator it, boolean z10) {
        while (it.hasNext()) {
            ((d) it.next()).w(z10);
        }
    }

    public Object k() {
        return this.f338957c;
    }

    public Object l() {
        return this.f338957c;
    }

    public boolean n() {
        return this.f338955a;
    }

    public abstract boolean o();

    public boolean p() {
        return this.f338956b;
    }

    public void q(Object obj) {
        this.f338957c = obj;
    }

    public void r(Object obj) {
        this.f338957c = obj;
    }

    public void t(boolean z10) {
        this.f338955a = z10;
    }

    public void w(boolean z10) {
        this.f338956b = z10;
    }
}
