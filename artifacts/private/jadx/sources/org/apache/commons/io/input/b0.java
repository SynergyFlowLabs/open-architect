package org.apache.commons.io.input;

import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public class b0 extends IOException {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f336587f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f336588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f336589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f336590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f336591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f336592e;

    public b0(String str, String str2, String str3, String str4) {
        this(str, null, null, str2, str3, str4);
    }

    public String a() {
        return this.f336588a;
    }

    public String b() {
        return this.f336592e;
    }

    public String c() {
        return this.f336591d;
    }

    public String d() {
        return this.f336590c;
    }

    public String e() {
        return this.f336589b;
    }

    public b0(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str);
        this.f336591d = str2;
        this.f336592e = str3;
        this.f336588a = str4;
        this.f336589b = str5;
        this.f336590c = str6;
    }
}
