package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public class t extends a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336531b = 4269646126155225062L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f336532a;

    public t(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.f336532a = Pattern.compile(str);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f336532a.matcher(str).matches();
    }

    public t(String str, org.apache.commons.io.n nVar) {
        if (str == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.f336532a = Pattern.compile(str, (nVar == null || nVar.n()) ? 0 : 2);
    }

    public t(String str, int i10) {
        if (str != null) {
            this.f336532a = Pattern.compile(str, i10);
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }

    public t(Pattern pattern) {
        if (pattern != null) {
            this.f336532a = pattern;
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }
}
