package org.locationtech.jts.geom;

/* JADX INFO: loaded from: classes14.dex */
public class i0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f338126a;

    public i0(String str) {
        super(str);
        this.f338126a = null;
    }

    private static String b(String str, a aVar) {
        if (aVar != null) {
            str = str + " [ " + aVar + " ]";
        }
        return str;
    }

    public a a() {
        return this.f338126a;
    }

    public i0(String str, a aVar) {
        super(b(str, aVar));
        this.f338126a = null;
        this.f338126a = new a(aVar);
    }
}
