package org.slf4j.helpers;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f339628d = new f(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f339629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f339630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f339631c;

    public f(String str) {
        this(str, null, null);
    }

    public Object[] a() {
        return this.f339631c;
    }

    public String b() {
        return this.f339629a;
    }

    public Throwable c() {
        return this.f339630b;
    }

    public f(String str, Object[] objArr, Throwable th2) {
        this.f339629a = str;
        this.f339630b = th2;
        this.f339631c = objArr;
    }
}
