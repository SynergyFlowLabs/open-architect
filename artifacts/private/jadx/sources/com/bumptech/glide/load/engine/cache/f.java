package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class f extends d {

    class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f96475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f96476b;

        a(Context context, String str) {
            this.f96475a = context;
            this.f96476b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File externalCacheDir = this.f96475a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.f96476b != null ? new File(externalCacheDir, this.f96476b) : externalCacheDir;
        }
    }

    public f(Context context) {
        this(context, com.bumptech.glide.load.engine.cache.a.InterfaceC0855a.f96454b, com.bumptech.glide.load.engine.cache.a.InterfaceC0855a.f96453a);
    }

    public f(Context context, int i10) {
        this(context, com.bumptech.glide.load.engine.cache.a.InterfaceC0855a.f96454b, i10);
    }

    public f(Context context, String str, int i10) {
        super(new a(context, str), i10);
    }
}
