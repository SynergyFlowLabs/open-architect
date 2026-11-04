package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes4.dex */
public class g extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f102374d = 123;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected transient h f102375c;

    @Deprecated
    public g(Throwable th2) {
        super(th2);
    }

    @Override // com.fasterxml.jackson.core.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public h e() {
        return this.f102375c;
    }

    public g g(h hVar) {
        this.f102375c = hVar;
        return this;
    }

    @Deprecated
    public g(String str) {
        super(str, (i) null);
    }

    @Deprecated
    public g(String str, Throwable th2) {
        super(str, null, th2);
    }

    public g(Throwable th2, h hVar) {
        super(th2);
        this.f102375c = hVar;
    }

    public g(String str, h hVar) {
        super(str, (i) null);
        this.f102375c = hVar;
    }

    public g(String str, Throwable th2, h hVar) {
        super(str, null, th2);
        this.f102375c = hVar;
    }
}
