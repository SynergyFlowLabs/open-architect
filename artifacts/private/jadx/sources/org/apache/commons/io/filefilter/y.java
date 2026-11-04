package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class y extends a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336545b = -5037645902506953517L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f336546a;

    public y(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.f336546a = new String[]{str};
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (file != null && new File(file, str).isDirectory()) {
            return false;
        }
        for (String str2 : this.f336546a) {
            if (org.apache.commons.io.l.K(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public y(String[] strArr) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.f336546a = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            return;
        }
        throw new IllegalArgumentException("The wildcard array must not be null");
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return false;
        }
        for (String str : this.f336546a) {
            if (org.apache.commons.io.l.K(file.getName(), str)) {
                return true;
            }
        }
        return false;
    }

    public y(List<String> list) {
        if (list != null) {
            this.f336546a = (String[]) list.toArray(new String[list.size()]);
            return;
        }
        throw new IllegalArgumentException("The wildcard list must not be null");
    }
}
