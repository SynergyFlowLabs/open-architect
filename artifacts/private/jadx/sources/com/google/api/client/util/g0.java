package com.google.api.client.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@f
public final class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f116077b = Pattern.compile("-----BEGIN ([A-Z ]+)-----");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f116078c = Pattern.compile("-----END ([A-Z ]+)-----");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BufferedReader f116079a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f116080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f116081b;

        a(String str, byte[] bArr) {
            this.f116080a = (String) h0.d(str);
            this.f116081b = (byte[]) h0.d(bArr);
        }

        public byte[] a() {
            return this.f116081b;
        }

        public String b() {
            return this.f116080a;
        }
    }

    public g0(Reader reader) {
        this.f116079a = new BufferedReader(reader);
    }

    public static a b(Reader reader) throws IOException {
        return c(reader, null);
    }

    public static a c(Reader reader, String str) throws IOException {
        g0 g0Var = new g0(reader);
        try {
            a aVarE = g0Var.e(str);
            g0Var.a();
            return aVarE;
        } catch (Throwable th2) {
            g0Var.a();
            throw th2;
        }
    }

    public void a() throws IOException {
        this.f116079a.close();
    }

    public a d() throws IOException {
        return e(null);
    }

    public a e(String str) throws IOException {
        StringBuilder sb2 = null;
        String str2 = null;
        while (true) {
            String line = this.f116079a.readLine();
            if (line == null) {
                h0.c(str2 == null, "missing end tag (%s)", str2);
                return null;
            }
            if (sb2 == null) {
                Matcher matcher = f116077b.matcher(line);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (str == null || strGroup.equals(str)) {
                        sb2 = new StringBuilder();
                        str2 = strGroup;
                    }
                }
            } else {
                Matcher matcher2 = f116078c.matcher(line);
                if (matcher2.matches()) {
                    String strGroup2 = matcher2.group(1);
                    h0.c(strGroup2.equals(str2), "end tag (%s) doesn't match begin tag (%s)", strGroup2, str2);
                    return new a(str2, e.a(sb2.toString()));
                }
                sb2.append(line);
            }
        }
    }
}
