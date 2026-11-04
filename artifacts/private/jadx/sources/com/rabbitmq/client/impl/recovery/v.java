package com.rabbitmq.client.impl.recovery;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class v extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f265790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f265791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f265792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f265793f;

    public v(c cVar, String str) {
        super(cVar, str);
    }

    public v d(Map<String, Object> map) {
        this.f265792e = map;
        return this;
    }

    public v e(boolean z10) {
        this.f265791d = z10;
        return this;
    }

    public v f(boolean z10) {
        this.f265790c = z10;
        return this;
    }

    public boolean g() {
        return this.f265791d;
    }

    public void h() throws IOException {
        this.f265789a.E().g9(this.f265794b, this.f265793f, this.f265790c, this.f265791d, this.f265792e);
    }

    public v i(String str) {
        this.f265793f = str;
        return this;
    }

    public String toString() {
        return "RecordedExchange[name=" + this.f265794b + ", type=" + this.f265793f + ", durable=" + this.f265790c + ", autoDelete=" + this.f265791d + ", arguments=" + this.f265792e + ", channel=" + this.f265789a + "]";
    }
}
