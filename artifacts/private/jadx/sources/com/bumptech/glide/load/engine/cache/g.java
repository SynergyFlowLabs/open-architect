package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import androidx.annotation.p0;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends d {

    class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f96477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f96478b;

        a(Context context, String str) {
            this.f96477a = context;
            this.f96478b = str;
        }

        @p0
        private File b() {
            File cacheDir = this.f96477a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f96478b != null ? new File(cacheDir, this.f96478b) : cacheDir;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File externalCacheDir;
            File fileB = b();
            if ((fileB == null || !fileB.exists()) && (externalCacheDir = this.f96477a.getExternalCacheDir()) != null && externalCacheDir.canWrite()) {
                return this.f96478b != null ? new File(externalCacheDir, this.f96478b) : externalCacheDir;
            }
            return fileB;
        }
    }

    public g(Context context) {
        this(context, com.bumptech.glide.load.engine.cache.a.InterfaceC0855a.f96454b, 262144000L);
    }

    public g(Context context, long j10) {
        this(context, com.bumptech.glide.load.engine.cache.a.InterfaceC0855a.f96454b, j10);
    }

    public g(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
