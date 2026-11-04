package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class e implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f96466f = "DiskLruCacheWrapper";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f96467g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f96468h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static e f96469i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f96471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f96472c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.disklrucache.a f96474e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f96473d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f96470a = new m();

    @Deprecated
    protected e(File file, long j10) {
        this.f96471b = file;
        this.f96472c = j10;
    }

    public static a d(File file, long j10) {
        return new e(file, j10);
    }

    @Deprecated
    public static synchronized a e(File file, long j10) {
        try {
            if (f96469i == null) {
                f96469i = new e(file, j10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f96469i;
    }

    private synchronized com.bumptech.glide.disklrucache.a f() throws IOException {
        try {
            if (this.f96474e == null) {
                this.f96474e = com.bumptech.glide.disklrucache.a.X(this.f96471b, 1, 1, this.f96472c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f96474e;
    }

    private synchronized void g() {
        this.f96474e = null;
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void a(com.bumptech.glide.load.g gVar, a.b bVar) {
        String strB = this.f96470a.b(gVar);
        this.f96473d.a(strB);
        try {
            if (Log.isLoggable(f96466f, 2)) {
                Objects.toString(gVar);
            }
            try {
                com.bumptech.glide.disklrucache.a aVarF = f();
                if (aVarF.H(strB) == null) {
                    com.bumptech.glide.disklrucache.a.c cVarX = aVarF.x(strB);
                    if (cVarX == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                    }
                    try {
                        if (bVar.a(cVarX.f(0))) {
                            cVarX.e();
                        }
                        cVarX.b();
                    } catch (Throwable th2) {
                        cVarX.b();
                        throw th2;
                    }
                }
            } catch (IOException unused) {
            }
            this.f96473d.b(strB);
        } catch (Throwable th3) {
            this.f96473d.b(strB);
            throw th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public File b(com.bumptech.glide.load.g gVar) {
        String strB = this.f96470a.b(gVar);
        if (Log.isLoggable(f96466f, 2)) {
            Objects.toString(gVar);
        }
        try {
            com.bumptech.glide.disklrucache.a.e eVarH = f().H(strB);
            if (eVarH != null) {
                return eVarH.b(0);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void c(com.bumptech.glide.load.g gVar) {
        try {
            f().j0(this.f96470a.b(gVar));
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public synchronized void clear() {
        try {
            try {
                f().r();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                g();
                throw th2;
            }
            g();
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
