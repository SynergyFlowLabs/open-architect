package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class a4 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w4 f107555a;

    public a4(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f107555a = null;
    }

    static a4 a() {
        return new a4("Protocol message contained an invalid tag (zero).");
    }

    static a4 b() {
        return new a4("Protocol message had invalid UTF-8.");
    }

    static a4 c() {
        return new a4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static a4 d() {
        return new a4("Failed to parse the message.");
    }

    static a4 f() {
        return new a4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final a4 e(w4 w4Var) {
        this.f107555a = w4Var;
        return this;
    }

    public a4(String str) {
        super(str);
        this.f107555a = null;
    }
}
