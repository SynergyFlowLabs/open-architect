package org.apache.commons.io.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class i extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f336760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OutputStream f336761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f336762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f336763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f336764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final File f336765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f336766j;

    public i(int i10, File file) {
        this(i10, file, null, null, null);
    }

    @Override // org.apache.commons.io.output.t
    protected OutputStream c() throws IOException {
        return this.f336761e;
    }

    @Override // org.apache.commons.io.output.t, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f336766j = true;
    }

    @Override // org.apache.commons.io.output.t
    protected void h() throws IOException {
        String str = this.f336763g;
        if (str != null) {
            this.f336762f = File.createTempFile(str, this.f336764h, this.f336765i);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(this.f336762f);
        try {
            this.f336760d.l(fileOutputStream);
            this.f336761e = fileOutputStream;
            this.f336760d = null;
        } catch (IOException e10) {
            fileOutputStream.close();
            throw e10;
        }
    }

    public byte[] j() {
        c cVar = this.f336760d;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public File l() {
        return this.f336762f;
    }

    public boolean m() {
        return !e();
    }

    public void o(OutputStream outputStream) throws IOException {
        if (!this.f336766j) {
            throw new IOException("Stream not closed");
        }
        if (m()) {
            this.f336760d.l(outputStream);
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(this.f336762f);
        try {
            org.apache.commons.io.p.v(fileInputStream, outputStream);
        } finally {
            org.apache.commons.io.p.k(fileInputStream);
        }
    }

    public i(int i10, String str, String str2, File file) {
        this(i10, null, str, str2, file);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
    }

    private i(int i10, File file, String str, String str2, File file2) {
        super(i10);
        this.f336766j = false;
        this.f336762f = file;
        c cVar = new c();
        this.f336760d = cVar;
        this.f336761e = cVar;
        this.f336763g = str;
        this.f336764h = str2;
        this.f336765i = file2;
    }
}
