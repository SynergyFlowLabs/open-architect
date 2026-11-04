package org.threeten.bp.format;

/* JADX INFO: loaded from: classes14.dex */
public class f extends org.threeten.bp.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f340148d = 4304633501674722597L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f340149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f340150c;

    public f(String str, CharSequence charSequence, int i10) {
        super(str);
        this.f340149b = charSequence.toString();
        this.f340150c = i10;
    }

    public int a() {
        return this.f340150c;
    }

    public String b() {
        return this.f340149b;
    }

    public f(String str, CharSequence charSequence, int i10, Throwable th2) {
        super(str, th2);
        this.f340149b = charSequence.toString();
        this.f340150c = i10;
    }
}
