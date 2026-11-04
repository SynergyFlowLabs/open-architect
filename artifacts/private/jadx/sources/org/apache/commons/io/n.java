package org.apache.commons.io;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public enum n implements Serializable {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", !l.A());


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f336740f = -6343169151696340687L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f336742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient boolean f336743b;

    n(String str, boolean z10) {
        this.f336742a = str;
        this.f336743b = z10;
    }

    public static n l(String str) {
        for (n nVar : values()) {
            if (nVar.getName().equals(str)) {
                return nVar;
            }
        }
        throw new IllegalArgumentException("Invalid IOCase name: " + str);
    }

    private Object readResolve() {
        return l(this.f336742a);
    }

    public int b(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f336743b ? str.compareTo(str2) : str.compareToIgnoreCase(str2);
    }

    public boolean c(String str, String str2) {
        int length = str2.length();
        return str.regionMatches(!this.f336743b, str.length() - length, str2, 0, length);
    }

    public boolean d(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f336743b ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public int e(String str, int i10, String str2) {
        int length = str.length() - str2.length();
        if (length >= i10) {
            while (i10 <= length) {
                if (f(str, i10, str2)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public boolean f(String str, int i10, String str2) {
        return str.regionMatches(!this.f336743b, i10, str2, 0, str2.length());
    }

    public String getName() {
        return this.f336742a;
    }

    public boolean k(String str, String str2) {
        return str.regionMatches(!this.f336743b, 0, str2, 0, str2.length());
    }

    public boolean n() {
        return this.f336743b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f336742a;
    }
}
