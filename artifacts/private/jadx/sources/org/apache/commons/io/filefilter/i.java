package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class i extends a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f336505a = 3631422087512832211L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f336506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f336507c;

    static {
        i iVar = new i();
        f336506b = iVar;
        f336507c = new q(iVar);
    }

    protected i() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        if (!file.isDirectory()) {
            return file.length() == 0;
        }
        File[] fileArrListFiles = file.listFiles();
        return fileArrListFiles == null || fileArrListFiles.length == 0;
    }
}
