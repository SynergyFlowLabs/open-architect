package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class m extends a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f336515a = 8930842316112759062L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f336516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f336517c;

    static {
        m mVar = new m();
        f336516b = mVar;
        f336517c = new q(mVar);
    }

    protected m() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.isHidden();
    }
}
