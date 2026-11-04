package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f57503c = "AtomicFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f57504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f57505b;

    private static final class a extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileOutputStream f57506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f57507b = false;

        public a(File file) throws FileNotFoundException {
            this.f57506a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f57507b) {
                return;
            }
            this.f57507b = true;
            flush();
            try {
                this.f57506a.getFD().sync();
            } catch (IOException e10) {
                p.m(b.f57503c, "Failed to sync file descriptor:", e10);
            }
            this.f57506a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f57506a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int b10) throws IOException {
            this.f57506a.write(b10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b10) throws IOException {
            this.f57506a.write(b10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b10, int off, int len) throws IOException {
            this.f57506a.write(b10, off, len);
        }
    }

    public b(File baseName) {
        this.f57504a = baseName;
        this.f57505b = new File(String.valueOf(baseName.getPath()).concat(".bak"));
    }

    private void e() {
        if (this.f57505b.exists()) {
            this.f57504a.delete();
            this.f57505b.renameTo(this.f57504a);
        }
    }

    public void a() {
        this.f57504a.delete();
        this.f57505b.delete();
    }

    public void b(OutputStream str) throws IOException {
        str.close();
        this.f57505b.delete();
    }

    public boolean c() {
        return this.f57504a.exists() || this.f57505b.exists();
    }

    public InputStream d() throws FileNotFoundException {
        e();
        return new FileInputStream(this.f57504a);
    }

    public OutputStream f() throws IOException {
        if (this.f57504a.exists()) {
            if (this.f57505b.exists()) {
                this.f57504a.delete();
            } else if (!this.f57504a.renameTo(this.f57505b)) {
                String strValueOf = String.valueOf(this.f57504a);
                String strValueOf2 = String.valueOf(this.f57505b);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 37 + strValueOf2.length());
                sb2.append("Couldn't rename file ");
                sb2.append(strValueOf);
                sb2.append(" to backup file ");
                sb2.append(strValueOf2);
                p.l(f57503c, sb2.toString());
            }
        }
        try {
            return new a(this.f57504a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f57504a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                String strValueOf3 = String.valueOf(this.f57504a);
                StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 16);
                sb3.append("Couldn't create ");
                sb3.append(strValueOf3);
                throw new IOException(sb3.toString(), e10);
            }
            try {
                return new a(this.f57504a);
            } catch (FileNotFoundException e11) {
                String strValueOf4 = String.valueOf(this.f57504a);
                StringBuilder sb4 = new StringBuilder(strValueOf4.length() + 16);
                sb4.append("Couldn't create ");
                sb4.append(strValueOf4);
                throw new IOException(sb4.toString(), e11);
            }
        }
    }
}
