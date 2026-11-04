package com.google.vr.ndk.base;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f127193d = "Version";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o0 f127194e = b("1.190.0");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o0 f127195f = b(g.f127078b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f127197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f127198c;

    public o0(int i10, int i11, int i12) {
        this.f127196a = i10;
        this.f127197b = i11;
        this.f127198c = i12;
    }

    public static o0 b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)").matcher(str);
        if (matcher.matches()) {
            return new o0(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
        }
        if (str.length() != 0) {
            "Failed to parse version from: ".concat(str);
        }
        return null;
    }

    public final boolean a(o0 o0Var) {
        int i10 = this.f127196a;
        int i11 = o0Var.f127196a;
        if (i10 > i11) {
            return true;
        }
        if (i10 < i11) {
            return false;
        }
        int i12 = this.f127197b;
        int i13 = o0Var.f127197b;
        if (i12 > i13) {
            return true;
        }
        if (i12 < i13) {
            return false;
        }
        int i14 = this.f127198c;
        int i15 = o0Var.f127198c;
        return i14 > i15 || i14 >= i15;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f127196a == o0Var.f127196a && this.f127197b == o0Var.f127197b && this.f127198c == o0Var.f127198c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f127196a), Integer.valueOf(this.f127197b), Integer.valueOf(this.f127198c));
    }

    public final String toString() {
        return String.format("%d.%d.%d", Integer.valueOf(this.f127196a), Integer.valueOf(this.f127197b), Integer.valueOf(this.f127198c));
    }
}
