package com.bumptech.glide.load.engine.cache;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class d implements com.bumptech.glide.load.engine.cache.a.InterfaceC0855a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f96461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f96462d;

    class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f96463a;

        a(String str) {
            this.f96463a = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            return new File(this.f96463a);
        }
    }

    class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f96464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f96465b;

        b(String str, String str2) {
            this.f96464a = str;
            this.f96465b = str2;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            return new File(this.f96464a, this.f96465b);
        }
    }

    public interface c {
        File a();
    }

    public d(String str, long j10) {
        this(new a(str), j10);
    }

    @Override // com.bumptech.glide.load.engine.cache.a.InterfaceC0855a
    public com.bumptech.glide.load.engine.cache.a build() {
        File fileA = this.f96462d.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.mkdirs() || (fileA.exists() && fileA.isDirectory())) {
            return e.d(fileA, this.f96461c);
        }
        return null;
    }

    public d(String str, String str2, long j10) {
        this(new b(str, str2), j10);
    }

    public d(c cVar, long j10) {
        this.f96461c = j10;
        this.f96462d = cVar;
    }
}
