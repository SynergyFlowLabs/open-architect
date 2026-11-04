package com.rabbitmq.tools.jsonrpc;

/* JADX INFO: loaded from: classes13.dex */
public class d extends Exception {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f266093e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f266094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f266095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f266096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f266097d;

    public d() {
        this.f266094a = null;
        this.f266095b = -1;
        this.f266096c = null;
        this.f266097d = null;
    }

    public int a() {
        return this.f266095b;
    }

    public Object b() {
        return this.f266097d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f266096c;
    }

    public String getName() {
        return this.f266094a;
    }

    public d(String str, String str2, int i10, String str3, Object obj) {
        super(str);
        this.f266094a = str2;
        this.f266095b = i10;
        this.f266096c = str3;
        this.f266097d = obj;
    }
}
