package com.google.common.net;

import com.google.common.base.j0;
import java.net.InetAddress;
import java.text.ParseException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@a
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f119470a;

    private c(String canonicalForm) {
        this.f119470a = canonicalForm;
    }

    @z7.a
    public static c a(String specifier) throws ParseException {
        try {
            return b(specifier);
        } catch (IllegalArgumentException e10) {
            ParseException parseException = new ParseException("Invalid host specifier: " + specifier, 0);
            parseException.initCause(e10);
            throw parseException;
        }
    }

    public static c b(String specifier) {
        InetAddress inetAddressG;
        b bVarC = b.c(specifier);
        j0.d(!bVarC.h());
        String strD = bVarC.d();
        try {
            inetAddressG = e.g(strD);
        } catch (IllegalArgumentException unused) {
            inetAddressG = null;
        }
        if (inetAddressG != null) {
            return new c(e.P(inetAddressG));
        }
        f fVarD = f.d(strD);
        if (fVarD.f()) {
            return new c(fVarD.toString());
        }
        throw new IllegalArgumentException("Domain name does not have a recognized public suffix: " + strD);
    }

    public static boolean c(String specifier) {
        try {
            b(specifier);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(@fj.a Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof c) {
            return this.f119470a.equals(((c) other).f119470a);
        }
        return false;
    }

    public int hashCode() {
        return this.f119470a.hashCode();
    }

    public String toString() {
        return this.f119470a;
    }
}
