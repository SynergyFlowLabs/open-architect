package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class g extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336499c = -8723373124984771318L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FilenameFilter f336500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileFilter f336501b;

    public g(FilenameFilter filenameFilter) {
        if (filenameFilter == null) {
            throw new IllegalArgumentException("The FilenameFilter must not be null");
        }
        this.f336500a = filenameFilter;
        this.f336501b = null;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        FileFilter fileFilter = this.f336501b;
        return fileFilter != null ? fileFilter.accept(file) : super.accept(file);
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        Object obj = this.f336501b;
        if (obj == null) {
            obj = this.f336500a;
        }
        return super.toString() + "(" + obj.toString() + ")";
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        FilenameFilter filenameFilter = this.f336500a;
        if (filenameFilter != null) {
            return filenameFilter.accept(file, str);
        }
        return super.accept(file, str);
    }

    public g(FileFilter fileFilter) {
        if (fileFilter != null) {
            this.f336501b = fileFilter;
            this.f336500a = null;
            return;
        }
        throw new IllegalArgumentException("The FileFilter must not be null");
    }
}
