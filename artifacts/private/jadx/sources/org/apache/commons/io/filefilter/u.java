package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class u extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336533c = 7388077430788600069L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f336534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f336535b;

    public u(long j10) {
        this(j10, true);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        boolean z10 = file.length() < this.f336534a;
        if (this.f336535b) {
            return !z10;
        }
        return z10;
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        return super.toString() + "(" + (this.f336535b ? ">=" : "<") + this.f336534a + ")";
    }

    public u(long j10, boolean z10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("The size must be non-negative");
        }
        this.f336534a = j10;
        this.f336535b = z10;
    }
}
