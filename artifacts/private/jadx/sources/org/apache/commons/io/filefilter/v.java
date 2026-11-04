package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class v extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336536c = -3389157631240246157L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f336537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.io.n f336538b;

    public v(String str) {
        this(str, org.apache.commons.io.n.SENSITIVE);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.f336537a) {
            if (this.f336538b.c(name, str)) {
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
        if (this.f336537a != null) {
            int i10 = 7 << 0;
            for (int i11 = 0; i11 < this.f336537a.length; i11++) {
                if (i11 > 0) {
                    sb2.append(",");
                }
                sb2.append(this.f336537a[i11]);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public v(String str, org.apache.commons.io.n nVar) {
        if (str == null) {
            throw new IllegalArgumentException("The suffix must not be null");
        }
        this.f336537a = new String[]{str};
        this.f336538b = nVar == null ? org.apache.commons.io.n.SENSITIVE : nVar;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.f336537a) {
            if (this.f336538b.c(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public v(String[] strArr) {
        this(strArr, org.apache.commons.io.n.SENSITIVE);
    }

    public v(String[] strArr, org.apache.commons.io.n nVar) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.f336537a = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.f336538b = nVar == null ? org.apache.commons.io.n.SENSITIVE : nVar;
            return;
        }
        throw new IllegalArgumentException("The array of suffixes must not be null");
    }

    public v(List<String> list) {
        this(list, org.apache.commons.io.n.SENSITIVE);
    }

    public v(List<String> list, org.apache.commons.io.n nVar) {
        if (list == null) {
            throw new IllegalArgumentException("The list of suffixes must not be null");
        }
        this.f336537a = (String[]) list.toArray(new String[list.size()]);
        this.f336538b = nVar == null ? org.apache.commons.io.n.SENSITIVE : nVar;
    }
}
