package org.msgpack.value;

/* JADX INFO: loaded from: classes14.dex */
public enum z {
    NIL(false, false),
    BOOLEAN(false, false),
    INTEGER(true, false),
    FLOAT(true, false),
    STRING(false, true),
    BINARY(false, true),
    ARRAY(false, false),
    MAP(false, false),
    EXTENSION(false, false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f339429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f339430b;

    z(boolean z10, boolean z11) {
        this.f339429a = z10;
        this.f339430b = z11;
    }

    public boolean k() {
        return this == ARRAY;
    }

    public boolean l() {
        return this == BINARY;
    }

    public boolean n() {
        return this == BOOLEAN;
    }

    public boolean o() {
        return this == EXTENSION;
    }

    public boolean p() {
        return this == FLOAT;
    }

    public boolean q() {
        return this == INTEGER;
    }

    public boolean r() {
        return this == MAP;
    }

    public boolean s() {
        return this == NIL;
    }

    public boolean t() {
        return this.f339429a;
    }

    public boolean v() {
        return this.f339430b;
    }

    public boolean w() {
        return this == STRING;
    }
}
