package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@y
final class a4 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h3 f125750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f125751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f125752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a1[] f125753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n2 f125754e;

    a4(h3 syntax, boolean messageSetWireFormat, int[] checkInitialized, a1[] fields, Object defaultInstance) {
        this.f125750a = syntax;
        this.f125751b = messageSetWireFormat;
        this.f125752c = checkInitialized;
        this.f125753d = fields;
        this.f125754e = (n2) s1.e(defaultInstance, "defaultInstance");
    }

    public static a e() {
        return new a();
    }

    public static a f(int numFields) {
        return new a(numFields);
    }

    @Override // com.google.protobuf.l2
    public boolean a() {
        return this.f125751b;
    }

    @Override // com.google.protobuf.l2
    public n2 b() {
        return this.f125754e;
    }

    public int[] c() {
        return this.f125752c;
    }

    public a1[] d() {
        return this.f125753d;
    }

    @Override // com.google.protobuf.l2
    public h3 p() {
        return this.f125750a;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<a1> f125755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h3 f125756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f125757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f125758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f125759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f125760f;

        public a() {
            this.f125759e = null;
            this.f125755a = new ArrayList();
        }

        public a4 a() {
            if (this.f125757c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f125756b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f125757c = true;
            Collections.sort(this.f125755a);
            return new a4(this.f125756b, this.f125758d, this.f125759e, (a1[]) this.f125755a.toArray(new a1[0]), this.f125760f);
        }

        public void b(int[] checkInitialized) {
            this.f125759e = checkInitialized;
        }

        public void c(Object defaultInstance) {
            this.f125760f = defaultInstance;
        }

        public void d(a1 field) {
            if (this.f125757c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f125755a.add(field);
        }

        public void e(boolean messageSetWireFormat) {
            this.f125758d = messageSetWireFormat;
        }

        public void f(h3 syntax) {
            this.f125756b = (h3) s1.e(syntax, "syntax");
        }

        public a(int numFields) {
            this.f125759e = null;
            this.f125755a = new ArrayList(numFields);
        }
    }
}
