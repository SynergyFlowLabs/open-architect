package com.google.common.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
@com.google.common.annotations.a
public final class s extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f119047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f119048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f119049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.a("this")
    private OutputStream f119050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a8.a("this")
    @fj.a
    private c f119051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a8.a("this")
    @fj.a
    private File f119052f;

    class a extends g {
        a() {
        }

        protected void finalize() {
            try {
                s.this.reset();
            } catch (Throwable th2) {
                th2.printStackTrace(System.err);
            }
        }

        @Override // com.google.common.io.g
        public InputStream m() throws IOException {
            return s.this.d();
        }
    }

    class b extends g {
        b() {
        }

        @Override // com.google.common.io.g
        public InputStream m() throws IOException {
            return s.this.d();
        }
    }

    private static class c extends ByteArrayOutputStream {
        private c() {
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    public s(int fileThreshold) {
        this(fileThreshold, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized InputStream d() throws IOException {
        try {
            if (this.f119052f != null) {
                return new FileInputStream(this.f119052f);
            }
            Objects.requireNonNull(this.f119051e);
            return new ByteArrayInputStream(this.f119051e.a(), 0, this.f119051e.getCount());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @a8.a("this")
    private void e(int len) throws IOException {
        c cVar = this.f119051e;
        if (cVar == null || cVar.getCount() + len <= this.f119047a) {
            return;
        }
        File fileB = j0.f119021a.b("FileBackedOutputStream");
        if (this.f119048b) {
            fileB.deleteOnExit();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileB);
            fileOutputStream.write(this.f119051e.a(), 0, this.f119051e.getCount());
            fileOutputStream.flush();
            this.f119050d = fileOutputStream;
            this.f119052f = fileB;
            this.f119051e = null;
        } catch (IOException e10) {
            fileB.delete();
            throw e10;
        }
    }

    public g b() {
        return this.f119049c;
    }

    @com.google.common.annotations.e
    @fj.a
    synchronized File c() {
        return this.f119052f;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            this.f119050d.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        try {
            this.f119050d.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void reset() throws IOException {
        a aVar = null;
        try {
            try {
                close();
                c cVar = this.f119051e;
                if (cVar == null) {
                    this.f119051e = new c(aVar);
                } else {
                    cVar.reset();
                }
                this.f119050d = this.f119051e;
                File file = this.f119052f;
                if (file != null) {
                    this.f119052f = null;
                    if (!file.delete()) {
                        throw new IOException("Could not delete: " + file);
                    }
                }
            } catch (Throwable th2) {
                if (this.f119051e == null) {
                    this.f119051e = new c(aVar);
                } else {
                    this.f119051e.reset();
                }
                this.f119050d = this.f119051e;
                File file2 = this.f119052f;
                if (file2 != null) {
                    this.f119052f = null;
                    if (!file2.delete()) {
                        throw new IOException("Could not delete: " + file2);
                    }
                }
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int b10) throws IOException {
        try {
            e(1);
            this.f119050d.write(b10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public s(int fileThreshold, boolean resetOnFinalize) {
        com.google.common.base.j0.k(fileThreshold >= 0, "fileThreshold must be non-negative, but was %s", fileThreshold);
        this.f119047a = fileThreshold;
        this.f119048b = resetOnFinalize;
        c cVar = new c(null);
        this.f119051e = cVar;
        this.f119050d = cVar;
        if (resetOnFinalize) {
            this.f119049c = new a();
        } else {
            this.f119049c = new b();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] b10) throws IOException {
        try {
            write(b10, 0, b10.length);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] b10, int off, int len) throws IOException {
        e(len);
        this.f119050d.write(b10, off, len);
    }
}
