package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class s extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336528c = 8533897440809599867L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f336529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.io.n f336530b;

    public s(String str) {
        this(str, org.apache.commons.io.n.SENSITIVE);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        int i10 = 6 & 0;
        for (String str : this.f336529a) {
            if (this.f336530b.k(name, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("(");
        if (this.f336529a != null) {
            for (int i10 = 0; i10 < this.f336529a.length; i10++) {
                if (i10 > 0) {
                    sb2.append(",");
                }
                sb2.append(this.f336529a[i10]);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public s(String str, org.apache.commons.io.n nVar) {
        if (str == null) {
            throw new IllegalArgumentException("The prefix must not be null");
        }
        this.f336529a = new String[]{str};
        this.f336530b = nVar == null ? org.apache.commons.io.n.SENSITIVE : nVar;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.f336529a) {
            if (this.f336530b.k(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public s(String[] strArr) {
        this(strArr, org.apache.commons.io.n.SENSITIVE);
    }

    public s(String[] strArr, org.apache.commons.io.n nVar) {
        if (strArr == null) {
            throw new IllegalArgumentException("The array of prefixes must not be null");
        }
        String[] strArr2 = new String[strArr.length];
        this.f336529a = strArr2;
        int i10 = 6 >> 0;
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        this.f336530b = nVar == null ? org.apache.commons.io.n.SENSITIVE : nVar;
    }

    public s(List<String> list) {
        this(list, org.apache.commons.io.n.SENSITIVE);
    }

    public s(List<String> list, org.apache.commons.io.n nVar) {
        if (list != null) {
            this.f336529a = (String[]) list.toArray(new String[list.size()]);
            this.f336530b = nVar == null ? org.apache.commons.io.n.SENSITIVE : nVar;
            return;
        }
        throw new IllegalArgumentException("The list of prefixes must not be null");
    }
}
