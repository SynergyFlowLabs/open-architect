package com.rabbitmq.client.impl.recovery;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class y extends x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f265795h = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f265796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f265797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f265798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f265799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f265800g;

    public y(c cVar, String str) {
        super(cVar, str);
    }

    public y d(Map<String, Object> map) {
        this.f265798e = map;
        return this;
    }

    public y e(boolean z10) {
        this.f265797d = z10;
        return this;
    }

    public y f(boolean z10) {
        this.f265796c = z10;
        return this;
    }

    public y g(boolean z10) {
        this.f265799f = z10;
        return this;
    }

    public String h() {
        return j() ? "" : this.f265794b;
    }

    public boolean i() {
        return this.f265797d;
    }

    public boolean j() {
        return this.f265800g;
    }

    public void k() throws IOException {
        this.f265794b = this.f265789a.E().L7(h(), this.f265796c, this.f265799f, this.f265797d, this.f265798e).e();
    }

    public y l(boolean z10) {
        this.f265800g = z10;
        return this;
    }

    public String toString() {
        return "RecordedQueue[name=" + this.f265794b + ", durable=" + this.f265796c + ", autoDelete=" + this.f265797d + ", exclusive=" + this.f265799f + ", arguments=" + this.f265798e + "serverNamed=" + this.f265800g + ", channel=" + this.f265789a + "]";
    }
}
