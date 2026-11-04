package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@y
final class d4 implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j3 f50054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f50055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f50056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a1[] f50057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q2 f50058e;

    d4(j3 syntax, boolean messageSetWireFormat, int[] checkInitialized, a1[] fields, Object defaultInstance) {
        this.f50054a = syntax;
        this.f50055b = messageSetWireFormat;
        this.f50056c = checkInitialized;
        this.f50057d = fields;
        this.f50058e = (q2) s1.e(defaultInstance, "defaultInstance");
    }

    public static a e() {
        return new a();
    }

    public static a f(int numFields) {
        return new a(numFields);
    }

    @Override // androidx.datastore.preferences.protobuf.o2
    public boolean a() {
        return this.f50055b;
    }

    @Override // androidx.datastore.preferences.protobuf.o2
    public q2 b() {
        return this.f50058e;
    }

    public int[] c() {
        return this.f50056c;
    }

    public a1[] d() {
        return this.f50057d;
    }

    @Override // androidx.datastore.preferences.protobuf.o2
    public j3 p() {
        return this.f50054a;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<a1> f50059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private j3 f50060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f50061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f50062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f50063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f50064f;

        public a() {
            this.f50063e = null;
            this.f50059a = new ArrayList();
        }

        public d4 a() {
            if (this.f50061c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f50060b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f50061c = true;
            Collections.sort(this.f50059a);
            return new d4(this.f50060b, this.f50062d, this.f50063e, (a1[]) this.f50059a.toArray(new a1[0]), this.f50064f);
        }

        public void b(int[] checkInitialized) {
            this.f50063e = checkInitialized;
        }

        public void c(Object defaultInstance) {
            this.f50064f = defaultInstance;
        }

        public void d(a1 field) {
            if (this.f50061c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f50059a.add(field);
        }

        public void e(boolean messageSetWireFormat) {
            this.f50062d = messageSetWireFormat;
        }

        public void f(j3 syntax) {
            this.f50060b = (j3) s1.e(syntax, "syntax");
        }

        public a(int numFields) {
            this.f50063e = null;
            this.f50059a = new ArrayList(numFields);
        }
    }
}
