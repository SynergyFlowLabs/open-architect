package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class p extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336521c = 176844364689077340L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f336522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.io.n f336523b;

    public p(String str) {
        this(str, (org.apache.commons.io.n) null);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.f336522a) {
            if (this.f336523b.d(name, str)) {
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
        if (this.f336522a != null) {
            for (int i10 = 0; i10 < this.f336522a.length; i10++) {
                if (i10 > 0) {
                    sb2.append(",");
                }
                sb2.append(this.f336522a[i10]);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public p(String str, org.apache.commons.io.n nVar) {
        if (str == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.f336522a = new String[]{str};
        this.f336523b = nVar == null ? org.apache.commons.io.n.SENSITIVE : nVar;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.f336522a) {
            if (this.f336523b.d(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public p(String[] strArr) {
        this(strArr, (org.apache.commons.io.n) null);
    }

    public p(String[] strArr, org.apache.commons.io.n nVar) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.f336522a = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.f336523b = nVar == null ? org.apache.commons.io.n.SENSITIVE : nVar;
            return;
        }
        throw new IllegalArgumentException("The array of names must not be null");
    }

    public p(List<String> list) {
        this(list, (org.apache.commons.io.n) null);
    }

    public p(List<String> list, org.apache.commons.io.n nVar) {
        if (list == null) {
            throw new IllegalArgumentException("The list of names must not be null");
        }
        this.f336522a = (String[]) list.toArray(new String[list.size()]);
        this.f336523b = nVar == null ? org.apache.commons.io.n.SENSITIVE : nVar;
    }
}
