package org.apache.commons.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;
import org.apache.commons.io.filefilter.w;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileFilter f336481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f336482b;

    public static class a extends IOException {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f336483c = 1347339620135041008L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f336484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f336485b;

        public a(File file, int i10) {
            this("Operation Cancelled", file, i10);
        }

        public int a() {
            return this.f336485b;
        }

        public File b() {
            return this.f336484a;
        }

        public a(String str, File file, int i10) {
            super(str);
            this.f336484a = file;
            this.f336485b = i10;
        }
    }

    protected d() {
        this(null, -1);
    }

    private void l(File file, int i10, Collection<T> collection) throws IOException {
        a(file, i10, collection);
        if (d(file, i10, collection)) {
            f(file, i10, collection);
            int i11 = i10 + 1;
            int i12 = this.f336482b;
            if (i12 < 0 || i11 <= i12) {
                a(file, i10, collection);
                FileFilter fileFilter = this.f336481a;
                File[] fileArrB = b(file, i10, fileFilter == null ? file.listFiles() : file.listFiles(fileFilter));
                if (fileArrB == null) {
                    j(file, i11, collection);
                } else {
                    for (File file2 : fileArrB) {
                        if (file2.isDirectory()) {
                            l(file2, i11, collection);
                        } else {
                            a(file2, i11, collection);
                            h(file2, i11, collection);
                            a(file2, i11, collection);
                        }
                    }
                }
            }
            e(file, i10, collection);
        }
        a(file, i10, collection);
    }

    protected final void a(File file, int i10, Collection<T> collection) throws IOException {
        if (i(file, i10, collection)) {
            throw new a(file, i10);
        }
    }

    protected File[] b(File file, int i10, File[] fileArr) throws IOException {
        return fileArr;
    }

    protected void c(File file, Collection<T> collection, a aVar) throws IOException {
        throw aVar;
    }

    protected boolean d(File file, int i10, Collection<T> collection) throws IOException {
        return true;
    }

    protected void e(File file, int i10, Collection<T> collection) throws IOException {
    }

    protected void f(File file, int i10, Collection<T> collection) throws IOException {
    }

    protected void g(Collection<T> collection) throws IOException {
    }

    protected void h(File file, int i10, Collection<T> collection) throws IOException {
    }

    protected boolean i(File file, int i10, Collection<T> collection) throws IOException {
        return false;
    }

    protected void j(File file, int i10, Collection<T> collection) throws IOException {
    }

    protected void k(File file, Collection<T> collection) throws IOException {
    }

    protected final void m(File file, Collection<T> collection) throws IOException {
        if (file == null) {
            throw new NullPointerException("Start Directory is null");
        }
        try {
            k(file, collection);
            l(file, 0, collection);
            g(collection);
        } catch (a e10) {
            c(file, collection, e10);
        }
    }

    protected d(FileFilter fileFilter, int i10) {
        this.f336481a = fileFilter;
        this.f336482b = i10;
    }

    protected d(org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2, int i10) {
        if (nVar == null && nVar2 == null) {
            this.f336481a = null;
        } else {
            this.f336481a = org.apache.commons.io.filefilter.l.F(org.apache.commons.io.filefilter.l.z(nVar == null ? w.f336540b : nVar), org.apache.commons.io.filefilter.l.A(nVar2 == null ? w.f336540b : nVar2));
        }
        this.f336482b = i10;
    }
}
