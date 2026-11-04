package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes5.dex */
public class y implements com.google.firebase.remoteconfig.y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f124695c = "[Value: %s] cannot be converted to a %s.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f124696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f124697b;

    y(String str, int i10) {
        this.f124696a = str;
        this.f124697b = i10;
    }

    private String a() {
        return u().trim();
    }

    private void b() {
        if (this.f124696a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // com.google.firebase.remoteconfig.y
    public int P() {
        return this.f124697b;
    }

    @Override // com.google.firebase.remoteconfig.y
    public byte[] k() {
        return this.f124697b == 0 ? com.google.firebase.remoteconfig.r.f124765r : this.f124696a.getBytes(p.f124589e);
    }

    @Override // com.google.firebase.remoteconfig.y
    public long m() {
        if (this.f124697b == 0) {
            return 0L;
        }
        String strA = a();
        try {
            return Long.valueOf(strA).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format(f124695c, strA, "long"), e10);
        }
    }

    @Override // com.google.firebase.remoteconfig.y
    public String u() {
        if (this.f124697b == 0) {
            return "";
        }
        b();
        return this.f124696a;
    }

    @Override // com.google.firebase.remoteconfig.y
    public double v() {
        if (this.f124697b == 0) {
            return 0.0d;
        }
        String strA = a();
        try {
            return Double.valueOf(strA).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format(f124695c, strA, "double"), e10);
        }
    }

    @Override // com.google.firebase.remoteconfig.y
    public boolean w() throws IllegalArgumentException {
        if (this.f124697b == 0) {
            return false;
        }
        String strA = a();
        if (p.f124590f.matcher(strA).matches()) {
            return true;
        }
        if (p.f124591g.matcher(strA).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format(f124695c, strA, "boolean"));
    }
}
