package org.apache.commons.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: classes14.dex */
public class k extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f336768a;

    public k(String str, String str2) throws IOException {
        this(new File(str), str2, false);
    }

    private static Writer a(File file, Object obj, boolean z10) throws IOException {
        FileOutputStream fileOutputStream;
        if (file == null) {
            throw new NullPointerException("File is missing");
        }
        if (obj == null) {
            throw new NullPointerException("Encoding is missing");
        }
        boolean zExists = file.exists();
        try {
            fileOutputStream = new FileOutputStream(file, z10);
            try {
                if (obj instanceof Charset) {
                    return new OutputStreamWriter(fileOutputStream, (Charset) obj);
                }
                return obj instanceof CharsetEncoder ? new OutputStreamWriter(fileOutputStream, (CharsetEncoder) obj) : new OutputStreamWriter(fileOutputStream, (String) obj);
            } catch (IOException e10) {
                e = e10;
                org.apache.commons.io.p.n(null);
                org.apache.commons.io.p.l(fileOutputStream);
                if (!zExists) {
                    org.apache.commons.io.k.C(file);
                }
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                org.apache.commons.io.p.n(null);
                org.apache.commons.io.p.l(fileOutputStream);
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

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f336768a.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f336768a.flush();
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        this.f336768a.write(i10);
    }

    public k(String str, String str2, boolean z10) throws IOException {
        this(new File(str), str2, z10);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.f336768a.write(cArr);
    }

    public k(String str, Charset charset) throws IOException {
        this(new File(str), charset, false);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        this.f336768a.write(cArr, i10, i11);
    }

    public k(String str, Charset charset, boolean z10) throws IOException {
        this(new File(str), charset, z10);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.f336768a.write(str);
    }

    public k(String str, CharsetEncoder charsetEncoder) throws IOException {
        this(new File(str), charsetEncoder, false);
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        this.f336768a.write(str, i10, i11);
    }

    public k(String str, CharsetEncoder charsetEncoder, boolean z10) throws IOException {
        this(new File(str), charsetEncoder, z10);
    }

    public k(File file, String str) throws IOException {
        this(file, str, false);
    }

    public k(File file, String str, boolean z10) throws IOException {
        this.f336768a = a(file, str, z10);
    }

    public k(File file, Charset charset) throws IOException {
        this(file, charset, false);
    }

    public k(File file, Charset charset, boolean z10) throws IOException {
        this.f336768a = a(file, charset, z10);
    }

    public k(File file, CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);
    }

    public k(File file, CharsetEncoder charsetEncoder, boolean z10) throws IOException {
        this.f336768a = a(file, charsetEncoder, z10);
    }
}
