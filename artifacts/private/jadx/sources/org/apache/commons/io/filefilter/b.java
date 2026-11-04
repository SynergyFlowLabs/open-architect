package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
public class b extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336487c = -2132740084016138541L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f336488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f336489b;

    public b(long j10) {
        this(j10, true);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        boolean zS = org.apache.commons.io.k.S(file, this.f336488a);
        if (this.f336489b) {
            return !zS;
        }
        return zS;
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        return super.toString() + "(" + (this.f336489b ? "<=" : ">") + this.f336488a + ")";
    }

    public b(long j10, boolean z10) {
        this.f336489b = z10;
        this.f336488a = j10;
    }

    public b(Date date) {
        this(date, true);
    }

    public b(Date date, boolean z10) {
        this(date.getTime(), z10);
    }

    public b(File file) {
        this(file, true);
    }

    public b(File file, boolean z10) {
        this(file.lastModified(), z10);
    }
}
