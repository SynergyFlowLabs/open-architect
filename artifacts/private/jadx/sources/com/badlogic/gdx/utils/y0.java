package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes3.dex */
public class y0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringBuffer f95890a;

    public y0() {
    }

    private boolean c(Throwable th2, Class cls) {
        Throwable cause = th2.getCause();
        if (cause == null || cause == th2) {
            return false;
        }
        if (cls.isAssignableFrom(cause.getClass())) {
            return true;
        }
        return c(cause, cls);
    }

    public void a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("info cannot be null.");
        }
        if (this.f95890a == null) {
            this.f95890a = new StringBuffer(512);
        }
        this.f95890a.append('\n');
        this.f95890a.append(str);
    }

    public boolean b(Class cls) {
        return c(this, cls);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f95890a == null) {
            return super.getMessage();
        }
        StringBuffer stringBuffer = new StringBuffer(512);
        stringBuffer.append(super.getMessage());
        if (stringBuffer.length() > 0) {
            stringBuffer.append('\n');
        }
        stringBuffer.append("Serialization trace:");
        stringBuffer.append(this.f95890a);
        return stringBuffer.toString();
    }

    public y0(String str, Throwable th2) {
        super(str, th2);
    }

    public y0(String str) {
        super(str);
    }

    public y0(Throwable th2) {
        super("", th2);
    }
}
