package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class x extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336542c = -7426486598995782105L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f336543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.io.n f336544b;

    public x(String str) {
        this(str, org.apache.commons.io.n.SENSITIVE);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.f336543a) {
            if (org.apache.commons.io.l.L(str, str2, this.f336544b)) {
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
        if (this.f336543a != null) {
            for (int i10 = 0; i10 < this.f336543a.length; i10++) {
                if (i10 > 0) {
                    sb2.append(",");
                }
                sb2.append(this.f336543a[i10]);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public x(String str, org.apache.commons.io.n nVar) {
        if (str == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.f336543a = new String[]{str};
        this.f336544b = nVar == null ? org.apache.commons.io.n.SENSITIVE : nVar;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.f336543a) {
            if (org.apache.commons.io.l.L(name, str, this.f336544b)) {
                return true;
            }
        }
        return false;
    }

    public x(String[] strArr) {
        this(strArr, org.apache.commons.io.n.SENSITIVE);
    }

    public x(String[] strArr, org.apache.commons.io.n nVar) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.f336543a = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.f336544b = nVar == null ? org.apache.commons.io.n.SENSITIVE : nVar;
            return;
        }
        throw new IllegalArgumentException("The wildcard array must not be null");
    }

    public x(List<String> list) {
        this(list, org.apache.commons.io.n.SENSITIVE);
    }

    public x(List<String> list, org.apache.commons.io.n nVar) {
        if (list != null) {
            this.f336543a = (String[]) list.toArray(new String[list.size()]);
            this.f336544b = nVar == null ? org.apache.commons.io.n.SENSITIVE : nVar;
            return;
        }
        throw new IllegalArgumentException("The wildcard list must not be null");
    }
}
