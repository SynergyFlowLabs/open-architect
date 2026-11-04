package androidx.media3.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f61464c = "AtomicFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f61465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f61466b;

    private static final class a extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileOutputStream f61467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f61468b = false;

        public a(File file) throws FileNotFoundException {
            this.f61467a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f61468b) {
                return;
            }
            this.f61468b = true;
            flush();
            try {
                this.f61467a.getFD().sync();
            } catch (IOException e10) {
                z.o(b.f61464c, "Failed to sync file descriptor:", e10);
            }
            this.f61467a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f61467a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f61467a.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f61467a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f61467a.write(bArr, i10, i11);
        }
    }

    public b(File file) {
        this.f61465a = file;
        this.f61466b = new File(file.getPath() + ".bak");
    }

    private void e() {
        if (this.f61466b.exists()) {
            this.f61465a.delete();
            this.f61466b.renameTo(this.f61465a);
        }
    }

    public void a() {
        this.f61465a.delete();
        this.f61466b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f61466b.delete();
    }

    public boolean c() {
        return this.f61465a.exists() || this.f61466b.exists();
    }

    public InputStream d() throws FileNotFoundException {
        e();
        return new FileInputStream(this.f61465a);
    }

    public OutputStream f() throws IOException {
        if (this.f61465a.exists()) {
            if (this.f61466b.exists()) {
                this.f61465a.delete();
            } else if (!this.f61465a.renameTo(this.f61466b)) {
                z.n(f61464c, "Couldn't rename file " + this.f61465a + " to backup file " + this.f61466b);
            }
        }
        try {
            return new a(this.f61465a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f61465a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f61465a, e10);
            }
            try {
                return new a(this.f61465a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f61465a, e11);
            }
        }
    }
}
