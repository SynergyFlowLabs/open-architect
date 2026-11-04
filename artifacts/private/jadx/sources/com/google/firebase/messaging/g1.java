package com.google.firebase.messaging;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
final class g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.l1
    static final String f123579d = "!";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f123580e = "/topics/";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f123581f = "[a-zA-Z0-9-_.~%]{1,900}";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f123582g = Pattern.compile(f123581f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f123583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f123584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f123585c;

    private g1(String str, String str2) {
        this.f123583a = d(str2, str);
        this.f123584b = str;
        this.f123585c = str + f123579d + str2;
    }

    @androidx.annotation.p0
    static g1 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(f123579d, -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new g1(strArrSplit[0], strArrSplit[1]);
    }

    @NonNull
    private static String d(String str, String str2) {
        if (str != null && str.startsWith(f123580e)) {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2);
            str = str.substring(8);
        }
        if (str == null || !f123582g.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, f123581f));
        }
        return str;
    }

    public static g1 f(@NonNull String str) {
        return new g1(androidx.exifinterface.media.a.S4, str);
    }

    public static g1 g(@NonNull String str) {
        return new g1("U", str);
    }

    public String b() {
        return this.f123584b;
    }

    public String c() {
        return this.f123583a;
    }

    public String e() {
        return this.f123585c;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f123583a.equals(g1Var.f123583a) && this.f123584b.equals(g1Var.f123584b);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f123584b, this.f123583a);
    }
}
