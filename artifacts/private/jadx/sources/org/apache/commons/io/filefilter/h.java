package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class h extends a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f336502a = -5148237843784525732L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f336503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f336504c;

    static {
        h hVar = new h();
        f336503b = hVar;
        f336504c = hVar;
    }

    protected h() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.isDirectory();
    }
}
