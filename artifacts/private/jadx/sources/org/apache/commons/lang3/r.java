package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes14.dex */
public class r extends UnsupportedOperationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f337251b = 20131021;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f337252a;

    public r(String str) {
        this(str, (String) null);
    }

    public String a() {
        return this.f337252a;
    }

    public r(Throwable th2) {
        this(th2, (String) null);
    }

    public r(String str, Throwable th2) {
        this(str, th2, null);
    }

    public r(String str, String str2) {
        super(str);
        this.f337252a = str2;
    }

    public r(Throwable th2, String str) {
        super(th2);
        this.f337252a = str;
    }

    public r(String str, Throwable th2, String str2) {
        super(str, th2);
        this.f337252a = str2;
    }
}
