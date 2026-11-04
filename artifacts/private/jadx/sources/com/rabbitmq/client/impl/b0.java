package com.rabbitmq.client.impl;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2 f265128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f265129b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f265130c = 15;

    public b0(DataInputStream dataInputStream) throws IOException {
        this.f265128a = new j2(dataInputStream);
    }

    private boolean b() {
        return (this.f265129b & 1) != 0;
    }

    public void a() throws IOException {
        if (b()) {
            throw new IOException("Unexpected continuation flag word");
        }
    }

    public void c() throws IOException {
        if (!b()) {
            throw new IOException("Attempted to read flag word when none advertised");
        }
        this.f265129b = this.f265128a.i();
        this.f265130c = 0;
    }

    public Integer d() throws IOException {
        return Integer.valueOf(this.f265128a.d());
    }

    public Long e() throws IOException {
        return Long.valueOf(this.f265128a.e());
    }

    public com.rabbitmq.client.k0 f() throws IOException {
        return this.f265128a.f();
    }

    public int g() throws IOException {
        return this.f265128a.h();
    }

    public boolean h() throws IOException {
        if (this.f265130c == 15) {
            c();
        }
        int i10 = this.f265130c;
        int i11 = 15 - i10;
        this.f265130c = i10 + 1;
        return (this.f265129b & (1 << i11)) != 0;
    }

    public Integer i() throws IOException {
        return Integer.valueOf(this.f265128a.i());
    }

    public String j() throws IOException {
        return this.f265128a.j();
    }

    public Map<String, Object> k() throws IOException {
        return this.f265128a.l();
    }

    public Date l() throws IOException {
        return this.f265128a.n();
    }
}
