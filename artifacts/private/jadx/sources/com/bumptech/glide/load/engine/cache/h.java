package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends d {

    class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f96479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f96480b;

        a(Context context, String str) {
            this.f96479a = context;
            this.f96480b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File cacheDir = this.f96479a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f96480b != null ? new File(cacheDir, this.f96480b) : cacheDir;
        }
    }

    public h(Context context) {
        this(context, com.bumptech.glide.load.engine.cache.a.InterfaceC0855a.f96454b, 262144000L);
    }

    public h(Context context, long j10) {
        this(context, com.bumptech.glide.load.engine.cache.a.InterfaceC0855a.f96454b, j10);
    }

    public h(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
