package io.ably.lib.util;

/* JADX INFO: loaded from: classes13.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static p.b<String> f288260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static io.ably.lib.http.i.e<String> f288261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static io.ably.lib.http.i.b<String> f288262c;

    class a implements p.b<String> {
        a() {
        }

        @Override // io.ably.lib.util.p.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(com.google.gson.l lVar) {
            return lVar.w().D();
        }
    }

    static {
        a aVar = new a();
        f288260a = aVar;
        f288261b = new p.d(String.class, aVar);
        f288262c = new p.c(String[].class, f288260a);
    }

    public static boolean a(String str) {
        return str == null || str.isEmpty();
    }
}
