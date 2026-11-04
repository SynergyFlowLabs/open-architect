package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103420a;

    private e(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f103420a = str;
    }

    public static e b(@NonNull String str) {
        return new e(str);
    }

    public String a() {
        return this.f103420a;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f103420a.equals(((e) obj).f103420a);
        }
        return false;
    }

    public int hashCode() {
        return this.f103420a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f103420a + "\"}";
    }
}
