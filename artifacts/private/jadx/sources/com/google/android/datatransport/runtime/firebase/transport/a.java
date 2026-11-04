package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.n;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f103540e = new C0942a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f103541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f103542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f103543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f103544d;

    /* JADX INFO: renamed from: com.google.android.datatransport.runtime.firebase.transport.a$a, reason: collision with other inner class name */
    public static final class C0942a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f103545a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<d> f103546b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f103547c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f103548d = "";

        C0942a() {
        }

        public C0942a a(d dVar) {
            this.f103546b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f103545a, Collections.unmodifiableList(this.f103546b), this.f103547c, this.f103548d);
        }

        public C0942a c(String str) {
            this.f103548d = str;
            return this;
        }

        public C0942a d(b bVar) {
            this.f103547c = bVar;
            return this;
        }

        public C0942a e(List<d> list) {
            this.f103546b = list;
            return this;
        }

        public C0942a f(f fVar) {
            this.f103545a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f103541a = fVar;
        this.f103542b = list;
        this.f103543c = bVar;
        this.f103544d = str;
    }

    public static a b() {
        return f103540e;
    }

    public static C0942a h() {
        return new C0942a();
    }

    @com.google.firebase.encoders.proto.d(tag = 4)
    public String a() {
        return this.f103544d;
    }

    @k8.a.b
    public b c() {
        b bVarA = this.f103543c;
        if (bVarA == null) {
            bVarA = b.a();
        }
        return bVarA;
    }

    @com.google.firebase.encoders.proto.d(tag = 3)
    @k8.a.InterfaceC2244a(name = "globalMetrics")
    public b d() {
        return this.f103543c;
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    @k8.a.InterfaceC2244a(name = "logSourceMetrics")
    public List<d> e() {
        return this.f103542b;
    }

    @k8.a.b
    public f f() {
        f fVar = this.f103541a;
        return fVar == null ? f.a() : fVar;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    @k8.a.InterfaceC2244a(name = "window")
    public f g() {
        return this.f103541a;
    }

    public byte[] i() {
        return n.b(this);
    }

    public void j(OutputStream outputStream) throws IOException {
        n.a(this, outputStream);
    }
}
