package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.c;
import org.tensorflow.lite.h;

/* JADX INFO: loaded from: classes14.dex */
public class a implements c, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2446a f339827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f339828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f339829c;

    /* JADX INFO: renamed from: org.tensorflow.lite.nnapi.a$a, reason: collision with other inner class name */
    public static final class C2446a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f339830i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f339831j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f339832k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f339833l = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f339834a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f339835b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f339836c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f339837d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f339838e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f339839f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Boolean f339840g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f339841h = 0;

        public String a() {
            return this.f339835b;
        }

        public boolean b() {
            Boolean bool = this.f339840g;
            return bool != null && bool.booleanValue();
        }

        public String c() {
            return this.f339836c;
        }

        public int d() {
            return this.f339834a;
        }

        public int e() {
            Integer num = this.f339838e;
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        public String f() {
            return this.f339837d;
        }

        public long g() {
            return this.f339841h;
        }

        public Boolean h() {
            return this.f339839f;
        }

        public C2446a i(String name) {
            this.f339835b = name;
            return this;
        }

        public C2446a j(boolean enable) {
            this.f339840g = Boolean.valueOf(enable);
            return this;
        }

        public C2446a k(String cacheDir) {
            this.f339836c = cacheDir;
            return this;
        }

        public C2446a l(int preference) {
            this.f339834a = preference;
            return this;
        }

        public C2446a m(int limit) {
            this.f339838e = Integer.valueOf(limit);
            return this;
        }

        public C2446a n(String modelToken) {
            this.f339837d = modelToken;
            return this;
        }

        public C2446a o(long handle) {
            this.f339841h = handle;
            return this;
        }

        public C2446a p(boolean enable) {
            this.f339839f = Boolean.valueOf(enable);
            return this;
        }
    }

    public interface b extends c, AutoCloseable {
        @Override // org.tensorflow.lite.c, java.io.Closeable, java.lang.AutoCloseable
        void close();

        int u6();
    }

    public a(C2446a options) {
        TensorFlowLite.d();
        this.f339827a = options;
    }

    private void a() {
        if (this.f339828b == null) {
            throw new IllegalStateException(this.f339829c ? "Should not access delegate after delegate has been closed." : "Should not access delegate before interpreter has been constructed.");
        }
    }

    @Override // org.tensorflow.lite.c
    public long a6() {
        a();
        return this.f339828b.a6();
    }

    public boolean b() {
        return u6() != 0;
    }

    public void c(h interpreterFactoryApi) {
        this.f339828b = interpreterFactoryApi.c(this.f339827a);
        this.f339829c = true;
    }

    @Override // org.tensorflow.lite.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.f339828b;
        if (bVar != null) {
            bVar.close();
            int i10 = 5 >> 0;
            this.f339828b = null;
        }
    }

    public int u6() {
        if (!this.f339829c) {
            return 0;
        }
        a();
        return this.f339828b.u6();
    }

    public a() {
        this(new C2446a());
    }
}
