package com.rabbitmq.client.impl.recovery;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class t extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f265783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f265784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.rabbitmq.client.t f265785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f265786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f265787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f265788g;

    public t(c cVar, String str) {
        super(cVar);
        this.f265783b = str;
    }

    public t c(Map<String, Object> map) {
        this.f265788g = map;
        return this;
    }

    public t d(boolean z10) {
        this.f265787f = z10;
        return this;
    }

    public t e(com.rabbitmq.client.t tVar) {
        this.f265785d = tVar;
        return this;
    }

    public t f(String str) {
        this.f265784c = str;
        return this;
    }

    public t g(boolean z10) {
        this.f265786e = z10;
        return this;
    }

    public String h() {
        return this.f265784c;
    }

    public String i() {
        return this.f265783b;
    }

    public String j() throws IOException {
        String strP3 = this.f265789a.E().p3(this.f265783b, this.f265787f, this.f265784c, false, this.f265786e, this.f265788g, this.f265785d);
        this.f265784c = strP3;
        return strP3;
    }

    public void k(String str) {
        this.f265783b = str;
    }

    public String toString() {
        return "RecordedConsumer[tag=" + this.f265784c + ", queue=" + this.f265783b + ", autoAck=" + this.f265787f + ", exclusive=" + this.f265786e + ", arguments=" + this.f265788g + ", consumer=" + this.f265785d + ", channel=" + this.f265789a + "]";
    }
}
