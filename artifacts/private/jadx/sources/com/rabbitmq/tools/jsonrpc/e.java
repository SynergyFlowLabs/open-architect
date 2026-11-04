package com.rabbitmq.tools.jsonrpc;

/* JADX INFO: loaded from: classes13.dex */
public interface e {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f266098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f266099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f266100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object[] f266101d;

        public a(Object obj, String str, String str2, Object[] objArr) {
            this.f266098a = obj;
            this.f266099b = str;
            this.f266100c = str2;
            this.f266101d = objArr;
        }

        public Object a() {
            return this.f266098a;
        }

        public String b() {
            return this.f266100c;
        }

        public Object[] c() {
            return this.f266101d;
        }

        public String d() {
            return this.f266099b;
        }

        public boolean e() {
            return this.f266100c.startsWith("system.");
        }

        public boolean f() {
            return "system.describe".equals(this.f266100c);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f266102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f266103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f266104c;

        public b(Object obj, Object obj2, d dVar) {
            this.f266102a = obj;
            this.f266103b = obj2;
            this.f266104c = dVar;
        }

        public Object a() {
            return this.f266103b;
        }

        public d b() {
            return this.f266104c;
        }

        public Object c() {
            return this.f266102a;
        }
    }

    a a(String str, j jVar);

    b b(String str, Class<?> cls);

    String c(Object obj);
}
