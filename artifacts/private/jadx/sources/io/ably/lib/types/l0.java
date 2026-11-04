package io.ably.lib.types;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes13.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static io.ably.lib.http.i.b<k0> f288110a = new a();

    class a implements io.ably.lib.http.i.b<k0> {
        a() {
        }

        @Override // io.ably.lib.http.i.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k0[] a(String str, byte[] bArr) throws io.ably.lib.types.a {
            if ("application/json".equals(str)) {
                return l0.b(bArr);
            }
            return null;
        }
    }

    public static k0[] a(String str) throws io.ably.lib.types.a {
        return (k0[]) io.ably.lib.util.p.f288250c.r(str, k0[].class);
    }

    public static k0[] b(byte[] bArr) throws io.ably.lib.types.a {
        try {
            return a(new String(bArr, "UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw io.ably.lib.types.a.c(e10);
        }
    }
}
