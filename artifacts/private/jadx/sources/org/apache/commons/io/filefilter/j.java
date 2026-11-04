package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class j implements n, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f336508a = 6210271677940926200L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f336509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f336510c;

    static {
        j jVar = new j();
        f336509b = jVar;
        f336510c = jVar;
    }

    protected j() {
    }

    @Override // org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }

    @Override // org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return false;
    }
}
