package com.google.common.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public final class g0 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f118997a;

    public g0(String patternStr) {
        this(Pattern.compile(patternStr));
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File dir, String fileName) {
        return this.f118997a.matcher(fileName).matches();
    }

    public g0(Pattern pattern) {
        this.f118997a = (Pattern) com.google.common.base.j0.E(pattern);
    }
}
