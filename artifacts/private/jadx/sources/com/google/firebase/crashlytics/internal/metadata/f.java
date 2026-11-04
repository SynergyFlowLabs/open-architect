package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.p0;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f121276c = "userlog";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f121277d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f121278e = 65536;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f121279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f121280b;

    private static final class b implements d {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.d
        public byte[] a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.d
        public void b() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.d
        public void c(long j10, String str) {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.d
        public void d() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.d
        public String e() {
            return null;
        }
    }

    public f(com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f121279a = gVar;
        this.f121280b = f121277d;
    }

    private File d(String str) {
        return this.f121279a.r(str, f121276c);
    }

    public void a() {
        this.f121280b.b();
    }

    public byte[] b() {
        return this.f121280b.a();
    }

    @p0
    public String c() {
        return this.f121280b.e();
    }

    public final void e(String str) {
        this.f121280b.d();
        this.f121280b = f121277d;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i10) {
        this.f121280b = new i(file, i10);
    }

    public void g(long j10, String str) {
        this.f121280b.c(j10, str);
    }

    public f(com.google.firebase.crashlytics.internal.persistence.g gVar, String str) {
        this(gVar);
        e(str);
    }
}
