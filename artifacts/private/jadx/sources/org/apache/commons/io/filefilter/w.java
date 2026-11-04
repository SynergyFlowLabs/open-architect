package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class w implements n, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f336539a = 8782512160909720199L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f336540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f336541c;

    static {
        w wVar = new w();
        f336540b = wVar;
        f336541c = wVar;
    }

    protected w() {
    }

    @Override // org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return true;
    }

    @Override // org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return true;
    }
}
