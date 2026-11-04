package com.google.android.gms.common.images;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f106442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f106443b;

    public e(int i10, int i11) {
        this.f106442a = i10;
        this.f106443b = i11;
    }

    @NonNull
    public static e c(@NonNull String str) throws NumberFormatException {
        if (str == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(120);
        }
        if (iIndexOf < 0) {
            throw d(str);
        }
        try {
            return new e(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (NumberFormatException unused) {
            throw d(str);
        }
    }

    private static NumberFormatException d(String str) {
        throw new NumberFormatException("Invalid Size: \"" + str + "\"");
    }

    public int a() {
        return this.f106443b;
    }

    public int b() {
        return this.f106442a;
    }

    public boolean equals(@p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f106442a == eVar.f106442a && this.f106443b == eVar.f106443b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f106442a;
        return this.f106443b ^ ((i10 >>> 16) | (i10 << 16));
    }

    @NonNull
    public String toString() {
        return this.f106442a + "x" + this.f106443b;
    }
}
