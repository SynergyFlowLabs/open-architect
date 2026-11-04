package com.fasterxml.jackson.core;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class l extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f102642b = 123;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected i f102643a;

    protected l(String str, i iVar, Throwable th2) {
        super(str);
        if (th2 != null) {
            initCause(th2);
        }
        this.f102643a = iVar;
    }

    public void a() {
        this.f102643a = null;
    }

    public i b() {
        return this.f102643a;
    }

    protected String c() {
        return null;
    }

    public String d() {
        return super.getMessage();
    }

    public Object e() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        i iVarB = b();
        String strC = c();
        if (iVarB == null && strC == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(message);
        if (strC != null) {
            sb2.append(strC);
        }
        if (iVarB != null) {
            sb2.append('\n');
            sb2.append(" at ");
            sb2.append(iVarB.toString());
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    protected l(String str) {
        super(str);
    }

    protected l(String str, i iVar) {
        this(str, iVar, null);
    }

    protected l(String str, Throwable th2) {
        this(str, null, th2);
    }

    protected l(Throwable th2) {
        this(null, null, th2);
    }
}
