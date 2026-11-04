package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class d extends a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f336492a = 3179904805251622989L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f336493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f336494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f336495d;

    static {
        d dVar = new d();
        f336493b = dVar;
        f336494c = new q(dVar);
        f336495d = new c(dVar, e.f336498c);
    }

    protected d() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.canRead();
    }
}
