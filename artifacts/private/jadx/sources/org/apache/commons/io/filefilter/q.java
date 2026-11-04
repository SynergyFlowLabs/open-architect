package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class q extends a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336524b = 6131563330944994230L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f336525a;

    public q(n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("The filter must not be null");
        }
        this.f336525a = nVar;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return !this.f336525a.accept(file);
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        return super.toString() + "(" + this.f336525a.toString() + ")";
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !this.f336525a.accept(file, str);
    }
}
