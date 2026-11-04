package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final AssetManager f73716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Executor f73717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final i.d f73718c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final File f73720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final String f73721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final String f73722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final String f73723h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private d[] f73725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private byte[] f73726k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f73724i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final byte[] f73719d = d();

    @b1({b1.a.LIBRARY})
    public c(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull i.d dVar, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.f73716a = assetManager;
        this.f73717b = executor;
        this.f73718c = dVar;
        this.f73721f = str;
        this.f73722g = str2;
        this.f73723h = str3;
        this.f73720e = file;
    }

    @p0
    private c b(d[] dVarArr, byte[] bArr) {
        try {
            InputStream inputStreamG = g(this.f73716a, this.f73723h);
            if (inputStreamG == null) {
                if (inputStreamG != null) {
                    inputStreamG.close();
                }
                return null;
            }
            try {
                this.f73725j = m.r(inputStreamG, m.p(inputStreamG, m.f73792i), bArr, dVarArr);
                inputStreamG.close();
                return this;
            } catch (Throwable th2) {
                try {
                    inputStreamG.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            this.f73718c.a(9, e10);
        } catch (IOException e11) {
            this.f73718c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f73725j = null;
            this.f73718c.a(8, e12);
        }
    }

    private void c() {
        if (!this.f73724i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @p0
    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return o.f73821a;
        }
        if (i10 == 29 || i10 == 30) {
            return o.f73822b;
        }
        return null;
    }

    @p0
    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f73722g);
        } catch (FileNotFoundException e10) {
            this.f73718c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f73718c.a(7, e11);
            return null;
        }
    }

    @p0
    private InputStream g(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f73718c.b(5, null);
            }
            return null;
        }
    }

    @p0
    private d[] i(InputStream inputStream) {
        try {
            try {
                d[] dVarArrX = m.x(inputStream, m.p(inputStream, m.f73791h), this.f73721f);
                try {
                    inputStream.close();
                    return dVarArrX;
                } catch (IOException e10) {
                    this.f73718c.a(7, e10);
                    return dVarArrX;
                }
            } catch (IOException e11) {
                this.f73718c.a(7, e11);
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    this.f73718c.a(7, e12);
                }
                return null;
            } catch (IllegalStateException e13) {
                this.f73718c.a(8, e13);
                inputStream.close();
                return null;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f73718c.a(7, e14);
            }
            throw th2;
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private void k(final int i10, @p0 final Object obj) {
        this.f73717b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f73713a.f73718c.a(i10, obj);
            }
        });
    }

    @b1({b1.a.LIBRARY})
    public boolean e() {
        if (this.f73719d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f73720e.exists()) {
            try {
                if (!this.f73720e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f73720e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f73724i = true;
        return true;
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    public c h() {
        c cVarB;
        c();
        if (this.f73719d != null) {
            InputStream inputStreamF = f(this.f73716a);
            if (inputStreamF != null) {
                this.f73725j = i(inputStreamF);
            }
            d[] dVarArr = this.f73725j;
            if (dVarArr != null && j() && (cVarB = b(dVarArr, this.f73719d)) != null) {
                return cVarB;
            }
        }
        return this;
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    public c l() {
        d[] dVarArr = this.f73725j;
        byte[] bArr = this.f73719d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    m.F(byteArrayOutputStream, bArr);
                    if (!m.C(byteArrayOutputStream, bArr, dVarArr)) {
                        this.f73718c.a(5, null);
                        this.f73725j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f73726k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f73725j = null;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                this.f73718c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f73718c.a(8, e11);
            }
        }
        return this;
    }

    @b1({b1.a.LIBRARY})
    public boolean m() {
        byte[] bArr = this.f73726k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.f73720e);
                        try {
                            FileChannel channel = fileOutputStream.getChannel();
                            try {
                                FileLock fileLockTryLock = channel.tryLock();
                                try {
                                    e.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                    k(1, null);
                                    if (fileLockTryLock != null) {
                                        fileLockTryLock.close();
                                    }
                                    channel.close();
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    this.f73726k = null;
                                    this.f73725j = null;
                                    return true;
                                } catch (Throwable th2) {
                                    if (fileLockTryLock != null) {
                                        try {
                                            fileLockTryLock.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                    }
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                if (channel != null) {
                                    try {
                                        channel.close();
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                }
                                throw th4;
                            }
                        } catch (Throwable th6) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                            throw th6;
                        }
                    } catch (Throwable th8) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th9) {
                            th8.addSuppressed(th9);
                        }
                        throw th8;
                    }
                } catch (IOException e10) {
                    k(7, e10);
                    this.f73726k = null;
                    this.f73725j = null;
                    return false;
                }
            } catch (FileNotFoundException e11) {
                k(6, e11);
                this.f73726k = null;
                this.f73725j = null;
                return false;
            }
        } catch (Throwable th10) {
            this.f73726k = null;
            this.f73725j = null;
            throw th10;
        }
    }
}
