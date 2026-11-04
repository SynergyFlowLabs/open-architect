package com.rabbitmq.client;

/* JADX INFO: loaded from: classes13.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f265076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f265077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f265078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f265079d;

    public f0(long j10, boolean z10, String str, String str2) {
        this.f265076a = j10;
        this.f265077b = z10;
        this.f265078c = str;
        this.f265079d = str2;
    }

    public long a() {
        return this.f265076a;
    }

    public String b() {
        return this.f265078c;
    }

    public String c() {
        return this.f265079d;
    }

    public boolean d() {
        return this.f265077b;
    }

    public String toString() {
        return "Envelope(deliveryTag=" + this.f265076a + ", redeliver=" + this.f265077b + ", exchange=" + this.f265078c + ", routingKey=" + this.f265079d + ")";
    }
}
