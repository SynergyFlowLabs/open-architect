package com.google.gson;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f125260d = new e("", "", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f125261e = new e("\n", "  ", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f125262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f125263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f125264c;

    private e(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f125262a = str;
        this.f125263b = str2;
        this.f125264c = z10;
    }

    public String a() {
        return this.f125263b;
    }

    public String b() {
        return this.f125262a;
    }

    public boolean c() {
        return this.f125264c;
    }

    public e d(String str) {
        return new e(this.f125262a, str, this.f125264c);
    }

    public e e(String str) {
        return new e(str, this.f125263b, this.f125264c);
    }

    public e f(boolean z10) {
        return new e(this.f125262a, this.f125263b, z10);
    }
}
