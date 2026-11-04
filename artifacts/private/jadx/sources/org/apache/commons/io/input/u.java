package org.apache.commons.io.input;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
public class u implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f336657i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f336658j = "r";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f336659k = 4096;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Charset f336660l = Charset.defaultCharset();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f336661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f336662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Charset f336663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f336664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f336665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v f336666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f336667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f336668h;

    public u(File file, v vVar) {
        this(file, vVar, 1000L);
    }

    public static u a(File file, Charset charset, v vVar, long j10, boolean z10, boolean z11, int i10) {
        u uVar = new u(file, charset, vVar, j10, z10, z11, i10);
        Thread thread = new Thread(uVar);
        thread.setDaemon(true);
        thread.start();
        return uVar;
    }

    public static u b(File file, v vVar) {
        return d(file, vVar, 1000L, false);
    }

    public static u c(File file, v vVar, long j10) {
        return d(file, vVar, j10, false);
    }

    public static u d(File file, v vVar, long j10, boolean z10) {
        return e(file, vVar, j10, z10, 4096);
    }

    public static u e(File file, v vVar, long j10, boolean z10, int i10) {
        return g(file, vVar, j10, z10, false, i10);
    }

    public static u f(File file, v vVar, long j10, boolean z10, boolean z11) {
        return g(file, vVar, j10, z10, z11, 4096);
    }

    public static u g(File file, v vVar, long j10, boolean z10, boolean z11, int i10) {
        return a(file, f336660l, vVar, j10, z10, z11, i10);
    }

    private long k(RandomAccessFile randomAccessFile) throws IOException {
        int i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        long filePointer = randomAccessFile.getFilePointer();
        long filePointer2 = filePointer;
        boolean z10 = false;
        while (j() && (i10 = randomAccessFile.read(this.f336661a)) != -1) {
            for (int i11 = 0; i11 < i10; i11++) {
                byte b10 = this.f336661a[i11];
                if (b10 == 10) {
                    this.f336666f.a(new String(byteArrayOutputStream.toByteArray(), this.f336663c));
                    byteArrayOutputStream.reset();
                    filePointer = ((long) i11) + filePointer2 + 1;
                    z10 = false;
                } else if (b10 != 13) {
                    if (z10) {
                        this.f336666f.a(new String(byteArrayOutputStream.toByteArray(), this.f336663c));
                        byteArrayOutputStream.reset();
                        filePointer = ((long) i11) + filePointer2 + 1;
                        z10 = false;
                    }
                    byteArrayOutputStream.write(b10);
                } else {
                    if (z10) {
                        byteArrayOutputStream.write(13);
                    }
                    z10 = true;
                }
            }
            filePointer2 = randomAccessFile.getFilePointer();
        }
        org.apache.commons.io.p.l(byteArrayOutputStream);
        randomAccessFile.seek(filePointer);
        v vVar = this.f336666f;
        if (vVar instanceof w) {
            ((w) vVar).f();
        }
        return filePointer;
    }

    private void m(Exception exc) {
        this.f336666f.b(exc);
        l();
    }

    public long h() {
        return this.f336664d;
    }

    public File i() {
        return this.f336662b;
    }

    protected boolean j() {
        return this.f336668h;
    }

    public void l() {
        this.f336668h = false;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d3 A[Catch: all -> 0x0020, Exception -> 0x0023, InterruptedException -> 0x0026, TryCatch #2 {all -> 0x0020, blocks: (B:3:0x0008, B:7:0x0015, B:18:0x0032, B:19:0x003a, B:21:0x003e, B:23:0x0048, B:15:0x002a, B:24:0x0056, B:26:0x005d, B:28:0x0070, B:29:0x0076, B:63:0x00f9, B:64:0x00fe, B:45:0x00a2, B:47:0x00ab, B:52:0x00cf, B:54:0x00d3, B:55:0x00d6, B:57:0x00e2, B:59:0x00e6, B:51:0x00bf), top: B:73:0x0008 }] */
    @Override // java.lang.Runnable
    public void run() throws Throwable {
        RandomAccessFile randomAccessFile;
        long jK;
        long jLastModified;
        RandomAccessFile randomAccessFile2 = null;
        long jLastModified2 = 0;
        long length = 0;
        while (j() && randomAccessFile2 == null) {
            try {
                try {
                    try {
                        randomAccessFile2 = new RandomAccessFile(this.f336662b, f336658j);
                    } catch (FileNotFoundException unused) {
                        this.f336666f.c();
                    }
                    if (randomAccessFile2 == null) {
                        Thread.sleep(this.f336664d);
                    } else {
                        length = this.f336665e ? this.f336662b.length() : 0L;
                        jLastModified2 = this.f336662b.lastModified();
                        randomAccessFile2.seek(length);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (InterruptedException e10) {
                e = e10;
            } catch (Exception e11) {
                e = e11;
            }
        }
        while (j()) {
            boolean zS = org.apache.commons.io.k.S(this.f336662b, jLastModified2);
            long length2 = this.f336662b.length();
            if (length2 < length) {
                this.f336666f.d();
                try {
                    randomAccessFile = new RandomAccessFile(this.f336662b, f336658j);
                    try {
                        try {
                            k(randomAccessFile2);
                        } catch (IOException e12) {
                            try {
                                this.f336666f.b(e12);
                            } catch (FileNotFoundException unused2) {
                                randomAccessFile2 = randomAccessFile;
                                this.f336666f.c();
                            }
                        }
                        try {
                            org.apache.commons.io.p.j(randomAccessFile2);
                            length = 0;
                            randomAccessFile2 = randomAccessFile;
                        } catch (FileNotFoundException unused3) {
                            length = 0;
                            randomAccessFile2 = randomAccessFile;
                            this.f336666f.c();
                        }
                    } catch (InterruptedException e13) {
                        e = e13;
                        randomAccessFile2 = randomAccessFile;
                        Thread.currentThread().interrupt();
                        m(e);
                        org.apache.commons.io.p.j(randomAccessFile2);
                    } catch (Exception e14) {
                        e = e14;
                        randomAccessFile2 = randomAccessFile;
                        m(e);
                        org.apache.commons.io.p.j(randomAccessFile2);
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile2 = randomAccessFile;
                        org.apache.commons.io.p.j(randomAccessFile2);
                        throw th;
                    }
                } catch (FileNotFoundException unused4) {
                }
            } else {
                if (length2 > length) {
                    jK = k(randomAccessFile2);
                    jLastModified = this.f336662b.lastModified();
                } else if (zS) {
                    randomAccessFile2.seek(0L);
                    jK = k(randomAccessFile2);
                    jLastModified = this.f336662b.lastModified();
                } else {
                    if (this.f336667g) {
                        org.apache.commons.io.p.j(randomAccessFile2);
                    }
                    Thread.sleep(this.f336664d);
                    if (!j() && this.f336667g) {
                        randomAccessFile = new RandomAccessFile(this.f336662b, f336658j);
                        randomAccessFile.seek(length);
                        randomAccessFile2 = randomAccessFile;
                    }
                }
                long j10 = jLastModified;
                length = jK;
                jLastModified2 = j10;
                if (this.f336667g) {
                    org.apache.commons.io.p.j(randomAccessFile2);
                }
                Thread.sleep(this.f336664d);
                if (!j()) {
                }
            }
        }
        org.apache.commons.io.p.j(randomAccessFile2);
    }

    public u(File file, v vVar, long j10) {
        this(file, vVar, j10, false);
    }

    public u(File file, v vVar, long j10, boolean z10) {
        this(file, vVar, j10, z10, 4096);
    }

    public u(File file, v vVar, long j10, boolean z10, boolean z11) {
        this(file, vVar, j10, z10, z11, 4096);
    }

    public u(File file, v vVar, long j10, boolean z10, int i10) {
        this(file, vVar, j10, z10, false, i10);
    }

    public u(File file, v vVar, long j10, boolean z10, boolean z11, int i10) {
        this(file, f336660l, vVar, j10, z10, z11, i10);
    }

    public u(File file, Charset charset, v vVar, long j10, boolean z10, boolean z11, int i10) {
        this.f336668h = true;
        this.f336662b = file;
        this.f336664d = j10;
        this.f336665e = z10;
        this.f336661a = new byte[i10];
        this.f336666f = vVar;
        vVar.e(this);
        this.f336667g = z11;
        this.f336663c = charset;
    }
}
