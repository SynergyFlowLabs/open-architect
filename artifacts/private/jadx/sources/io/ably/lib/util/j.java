package io.ably.lib.util;

/* JADX INFO: loaded from: classes13.dex */
public class j {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.gson.o f288235a = new com.google.gson.o();

        a() {
        }

        public a a(String str, Object obj) {
            if (obj == null) {
                this.f288235a.L(str, null);
                return this;
            }
            if (obj instanceof com.google.gson.l) {
                this.f288235a.L(str, (com.google.gson.l) obj);
                return this;
            }
            if (obj instanceof String) {
                this.f288235a.P(str, (String) obj);
                return this;
            }
            if (obj instanceof Boolean) {
                this.f288235a.M(str, (Boolean) obj);
                return this;
            }
            if (obj instanceof Character) {
                this.f288235a.N(str, (Character) obj);
                return this;
            }
            if (obj instanceof Number) {
                this.f288235a.O(str, (Number) obj);
                return this;
            }
            if (obj instanceof a) {
                this.f288235a.L(str, ((a) obj).b());
            }
            return this;
        }

        public com.google.gson.o b() {
            return this.f288235a;
        }
    }

    public static a a() {
        return new a();
    }
}
