package com.google.api.client.testing.http;

import com.google.api.client.http.f0;
import com.google.api.client.util.h0;
import com.google.api.client.util.n0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class g extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f115993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f115994b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f115996d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f115999g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f116001i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f115995c = 200;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<String> f115997e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f115998f = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f116000h = -1;

    @Override // com.google.api.client.http.f0
    public void a() throws IOException {
        this.f116001i = true;
        super.a();
    }

    @Override // com.google.api.client.http.f0
    public InputStream b() throws IOException {
        return this.f115993a;
    }

    @Override // com.google.api.client.http.f0
    public String c() {
        return this.f115999g;
    }

    @Override // com.google.api.client.http.f0
    public long d() {
        return this.f116000h;
    }

    @Override // com.google.api.client.http.f0
    public final String e() {
        return this.f115994b;
    }

    @Override // com.google.api.client.http.f0
    public int f() {
        return this.f115997e.size();
    }

    @Override // com.google.api.client.http.f0
    public String g(int i10) {
        return this.f115997e.get(i10);
    }

    @Override // com.google.api.client.http.f0
    public String h(int i10) {
        return this.f115998f.get(i10);
    }

    @Override // com.google.api.client.http.f0
    public String i() {
        return this.f115996d;
    }

    @Override // com.google.api.client.http.f0
    public int j() {
        return this.f115995c;
    }

    @Override // com.google.api.client.http.f0
    public String k() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f115995c);
        String str = this.f115996d;
        if (str != null) {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public g l(String str, String str2) {
        this.f115997e.add((String) h0.d(str));
        this.f115998f.add((String) h0.d(str2));
        return this;
    }

    public final List<String> m() {
        return this.f115997e;
    }

    public final List<String> n() {
        return this.f115998f;
    }

    public boolean o() {
        return this.f116001i;
    }

    public g p(InputStream inputStream) {
        this.f115993a = inputStream;
        return this;
    }

    public g q(String str) {
        return str == null ? z() : r(n0.a(str));
    }

    public g r(byte[] bArr) {
        if (bArr == null) {
            return z();
        }
        this.f115993a = new com.google.api.client.testing.util.e(bArr);
        t(bArr.length);
        return this;
    }

    public g s(String str) {
        this.f115999g = str;
        return this;
    }

    public g t(long j10) {
        this.f116000h = j10;
        h0.a(j10 >= -1);
        return this;
    }

    public g u(String str) {
        this.f115994b = str;
        return this;
    }

    public g v(List<String> list) {
        this.f115997e = (List) h0.d(list);
        return this;
    }

    public g w(List<String> list) {
        this.f115998f = (List) h0.d(list);
        return this;
    }

    public g x(String str) {
        this.f115996d = str;
        return this;
    }

    public g y(int i10) {
        this.f115995c = i10;
        return this;
    }

    public g z() {
        this.f115993a = null;
        t(0L);
        return this;
    }
}
