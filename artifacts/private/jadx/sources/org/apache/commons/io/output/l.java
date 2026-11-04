package org.apache.commons.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
public class l extends Writer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f336769c = ".lck";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f336770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f336771b;

    public l(String str) throws IOException {
        this(str, false, (String) null);
    }

    private void a() throws IOException {
        synchronized (l.class) {
            try {
                if (!this.f336771b.createNewFile()) {
                    throw new IOException("Can't write file, lock " + this.f336771b.getAbsolutePath() + " exists");
                }
                this.f336771b.deleteOnExit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Writer b(File file, Charset charset, boolean z10) throws IOException {
        FileOutputStream fileOutputStream;
        boolean zExists = file.exists();
        try {
            fileOutputStream = new FileOutputStream(file.getAbsolutePath(), z10);
            try {
                return new OutputStreamWriter(fileOutputStream, org.apache.commons.io.b.c(charset));
            } catch (IOException e10) {
                e = e10;
                org.apache.commons.io.p.n(null);
                org.apache.commons.io.p.l(fileOutputStream);
                org.apache.commons.io.k.C(this.f336771b);
                if (!zExists) {
                    org.apache.commons.io.k.C(file);
                }
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                org.apache.commons.io.p.n(null);
                org.apache.commons.io.p.l(fileOutputStream);
                org.apache.commons.io.k.C(this.f336771b);
                if (!zExists) {
                    org.apache.commons.io.k.C(file);
                }
                throw e;
            }
        } catch (IOException e12) {
            e = e12;
            fileOutputStream = null;
        } catch (RuntimeException e13) {
            e = e13;
            fileOutputStream = null;
        }
    }

    private void c(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException("Could not find lockDir: " + file.getAbsolutePath());
        }
        if (file.canWrite()) {
            return;
        }
        throw new IOException("Could not write to lockDir: " + file.getAbsolutePath());
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f336770a.close();
            this.f336771b.delete();
        } catch (Throwable th2) {
            this.f336771b.delete();
            throw th2;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f336770a.flush();
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        this.f336770a.write(i10);
    }

    public l(String str, boolean z10) throws IOException {
        this(str, z10, (String) null);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.f336770a.write(cArr);
    }

    public l(String str, boolean z10, String str2) throws IOException {
        this(new File(str), z10, str2);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        this.f336770a.write(cArr, i10, i11);
    }

    public l(File file) throws IOException {
        this(file, false, (String) null);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.f336770a.write(str);
    }

    public l(File file, boolean z10) throws IOException {
        this(file, z10, (String) null);
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        this.f336770a.write(str, i10, i11);
    }

    @Deprecated
    public l(File file, boolean z10, String str) throws IOException {
        this(file, Charset.defaultCharset(), z10, str);
    }

    public l(File file, Charset charset) throws IOException {
        this(file, charset, false, (String) null);
    }

    public l(File file, String str) throws IOException {
        this(file, str, false, (String) null);
    }

    public l(File file, Charset charset, boolean z10, String str) throws IOException {
        File absoluteFile = file.getAbsoluteFile();
        if (absoluteFile.getParentFile() != null) {
            org.apache.commons.io.k.I(absoluteFile.getParentFile());
        }
        if (!absoluteFile.isDirectory()) {
            File file2 = new File(str == null ? System.getProperty("java.io.tmpdir") : str);
            org.apache.commons.io.k.I(file2);
            c(file2);
            this.f336771b = new File(file2, absoluteFile.getName() + f336769c);
            a();
            this.f336770a = b(absoluteFile, charset, z10);
            return;
        }
        throw new IOException("File specified is a directory");
    }

    public l(File file, String str, boolean z10, String str2) throws IOException {
        this(file, org.apache.commons.io.b.b(str), z10, str2);
    }
}
