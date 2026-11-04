package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class e extends a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f336496a = 5132005214688990379L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f336497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f336498c;

    static {
        e eVar = new e();
        f336497b = eVar;
        f336498c = new q(eVar);
    }

    protected e() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.canWrite();
    }
}
