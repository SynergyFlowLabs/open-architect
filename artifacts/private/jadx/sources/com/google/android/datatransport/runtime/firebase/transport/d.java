package com.google.android.datatransport.runtime.firebase.transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f103566c = new a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f103568b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f103569a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<c> f103570b = new ArrayList();

        a() {
        }

        public a a(c cVar) {
            this.f103570b.add(cVar);
            return this;
        }

        public d b() {
            return new d(this.f103569a, Collections.unmodifiableList(this.f103570b));
        }

        public a c(List<c> list) {
            this.f103570b = list;
            return this;
        }

        public a d(String str) {
            this.f103569a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f103567a = str;
        this.f103568b = list;
    }

    public static d a() {
        return f103566c;
    }

    public static a d() {
        return new a();
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    @k8.a.InterfaceC2244a(name = "logEventDropped")
    public List<c> b() {
        return this.f103568b;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public String c() {
        return this.f103567a;
    }
}
