package com.google.api.client.auth.oauth2;

import com.google.api.client.http.i0;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f115196a = "access_token";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Pattern f115197b = Pattern.compile("\\s*error\\s*=\\s*\"?invalid_token\"?");

    static final class a implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final String f115198a = "Bearer ";

        a() {
        }

        @Override // com.google.api.client.auth.oauth2.j.a
        public void a(com.google.api.client.http.u uVar, String str) throws IOException {
            uVar.j().h0(f115198a + str);
        }

        @Override // com.google.api.client.auth.oauth2.j.a
        public String b(com.google.api.client.http.u uVar) {
            List<String> listT = uVar.j().t();
            if (listT == null) {
                return null;
            }
            for (String str : listT) {
                if (str.startsWith(f115198a)) {
                    return str.substring(7);
                }
            }
            return null;
        }
    }

    static final class b implements j.a {
        b() {
        }

        private static Map<String, Object> c(com.google.api.client.http.u uVar) {
            return com.google.api.client.util.n.f(i0.i(uVar).j());
        }

        @Override // com.google.api.client.auth.oauth2.j.a
        public void a(com.google.api.client.http.u uVar, String str) throws IOException {
            h0.b(!"GET".equals(uVar.p()), "HTTP GET method is not supported");
            c(uVar).put("access_token", str);
        }

        @Override // com.google.api.client.auth.oauth2.j.a
        public String b(com.google.api.client.http.u uVar) {
            Object obj = c(uVar).get("access_token");
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }
    }

    static final class c implements j.a {
        c() {
        }

        @Override // com.google.api.client.auth.oauth2.j.a
        public void a(com.google.api.client.http.u uVar, String str) throws IOException {
            uVar.y().j0("access_token", str);
        }

        @Override // com.google.api.client.auth.oauth2.j.a
        public String b(com.google.api.client.http.u uVar) {
            Object obj = uVar.y().get("access_token");
            if (obj != null) {
                return obj.toString();
            }
            int i10 = 6 ^ 0;
            return null;
        }
    }

    public static j.a a() {
        return new a();
    }

    public static j.a b() {
        return new b();
    }

    public static j.a c() {
        return new c();
    }
}
