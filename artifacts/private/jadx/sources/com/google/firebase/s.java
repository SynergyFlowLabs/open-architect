package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.w;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f124801h = "google_api_key";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f124802i = "google_app_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f124803j = "firebase_database_url";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f124804k = "ga_trackingId";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f124805l = "gcm_defaultSenderId";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f124806m = "google_storage_bucket";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f124807n = "project_id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f124808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f124809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f124810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f124811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f124812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f124813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f124814g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f124815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f124816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f124817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f124818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f124819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f124820f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f124821g;

        public b() {
        }

        @NonNull
        public s a() {
            return new s(this.f124816b, this.f124815a, this.f124817c, this.f124818d, this.f124819e, this.f124820f, this.f124821g);
        }

        @NonNull
        public b b(@NonNull String str) {
            this.f124815a = w.m(str, "ApiKey must be set.");
            return this;
        }

        @NonNull
        public b c(@NonNull String str) {
            this.f124816b = w.m(str, "ApplicationId must be set.");
            return this;
        }

        @NonNull
        public b d(@p0 String str) {
            this.f124817c = str;
            return this;
        }

        @NonNull
        @g6.a
        public b e(@p0 String str) {
            this.f124818d = str;
            return this;
        }

        @NonNull
        public b f(@p0 String str) {
            this.f124819e = str;
            return this;
        }

        @NonNull
        public b g(@p0 String str) {
            this.f124821g = str;
            return this;
        }

        @NonNull
        public b h(@p0 String str) {
            this.f124820f = str;
            return this;
        }

        public b(@NonNull s sVar) {
            this.f124816b = sVar.f124809b;
            this.f124815a = sVar.f124808a;
            this.f124817c = sVar.f124810c;
            this.f124818d = sVar.f124811d;
            this.f124819e = sVar.f124812e;
            this.f124820f = sVar.f124813f;
            this.f124821g = sVar.f124814g;
        }
    }

    @p0
    public static s h(@NonNull Context context) {
        b0 b0Var = new b0(context);
        String strA = b0Var.a(f124802i);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new s(strA, b0Var.a(f124801h), b0Var.a(f124803j), b0Var.a(f124804k), b0Var.a(f124805l), b0Var.a(f124806m), b0Var.a(f124807n));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return com.google.android.gms.common.internal.u.b(this.f124809b, sVar.f124809b) && com.google.android.gms.common.internal.u.b(this.f124808a, sVar.f124808a) && com.google.android.gms.common.internal.u.b(this.f124810c, sVar.f124810c) && com.google.android.gms.common.internal.u.b(this.f124811d, sVar.f124811d) && com.google.android.gms.common.internal.u.b(this.f124812e, sVar.f124812e) && com.google.android.gms.common.internal.u.b(this.f124813f, sVar.f124813f) && com.google.android.gms.common.internal.u.b(this.f124814g, sVar.f124814g);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f124809b, this.f124808a, this.f124810c, this.f124811d, this.f124812e, this.f124813f, this.f124814g);
    }

    @NonNull
    public String i() {
        return this.f124808a;
    }

    @NonNull
    public String j() {
        return this.f124809b;
    }

    @p0
    public String k() {
        return this.f124810c;
    }

    @p0
    @g6.a
    public String l() {
        return this.f124811d;
    }

    @p0
    public String m() {
        return this.f124812e;
    }

    @p0
    public String n() {
        return this.f124814g;
    }

    @p0
    public String o() {
        return this.f124813f;
    }

    public String toString() {
        return com.google.android.gms.common.internal.u.d(this).a("applicationId", this.f124809b).a("apiKey", this.f124808a).a("databaseUrl", this.f124810c).a("gcmSenderId", this.f124812e).a("storageBucket", this.f124813f).a("projectId", this.f124814g).toString();
    }

    private s(@NonNull String str, @NonNull String str2, @p0 String str3, @p0 String str4, @p0 String str5, @p0 String str6, @p0 String str7) {
        w.y(!com.google.android.gms.common.util.b0.b(str), "ApplicationId must be set.");
        this.f124809b = str;
        this.f124808a = str2;
        this.f124810c = str3;
        this.f124811d = str4;
        this.f124812e = str5;
        this.f124813f = str6;
        this.f124814g = str7;
    }
}
