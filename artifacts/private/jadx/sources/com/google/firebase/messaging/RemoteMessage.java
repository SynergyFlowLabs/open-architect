package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.a(creator = "RemoteMessageCreator")
@SafeParcelable.g({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new x0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f123360d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f123361e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f123362f = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    Bundle f123363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f123364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f123365c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f123366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, String> f123367b;

        public b(@NonNull String str) {
            Bundle bundle = new Bundle();
            this.f123366a = bundle;
            this.f123367b = new androidx.collection.a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(e.d.f123516g, str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        @NonNull
        public b a(@NonNull String str, @androidx.annotation.p0 String str2) {
            this.f123367b.put(str, str2);
            return this;
        }

        @NonNull
        public RemoteMessage b() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f123367b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.f123366a);
            this.f123366a.remove("from");
            return new RemoteMessage(bundle);
        }

        @NonNull
        public b c() {
            this.f123367b.clear();
            return this;
        }

        @androidx.annotation.p0
        public String d() {
            return this.f123366a.getString(e.d.f123514e);
        }

        @NonNull
        public Map<String, String> e() {
            return this.f123367b;
        }

        @NonNull
        public String f() {
            return this.f123366a.getString(e.d.f123517h, "");
        }

        @androidx.annotation.p0
        public String g() {
            return this.f123366a.getString(e.d.f123513d);
        }

        @androidx.annotation.g0(from = 0, to = 86400)
        public int h() {
            return Integer.parseInt(this.f123366a.getString(e.d.f123518i, com.facebook.appevents.p.f99189d0));
        }

        @NonNull
        public b i(@androidx.annotation.p0 String str) {
            this.f123366a.putString(e.d.f123514e, str);
            return this;
        }

        @NonNull
        public b j(@NonNull Map<String, String> map) {
            this.f123367b.clear();
            this.f123367b.putAll(map);
            return this;
        }

        @NonNull
        public b k(@NonNull String str) {
            this.f123366a.putString(e.d.f123517h, str);
            return this;
        }

        @NonNull
        public b l(@androidx.annotation.p0 String str) {
            this.f123366a.putString(e.d.f123513d, str);
            return this;
        }

        @NonNull
        @com.google.android.gms.common.internal.a0
        public b m(byte[] bArr) {
            this.f123366a.putByteArray(e.d.f123512c, bArr);
            return this;
        }

        @NonNull
        public b n(@androidx.annotation.g0(from = 0, to = 86400) int i10) {
            this.f123366a.putString(e.d.f123518i, String.valueOf(i10));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f123368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f123369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f123370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f123371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f123372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String[] f123373f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f123374g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f123375h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f123376i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f123377j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f123378k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f123379l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f123380m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f123381n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final String f123382o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final Integer f123383p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Integer f123384q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Integer f123385r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int[] f123386s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Long f123387t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f123388u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f123389v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final boolean f123390w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final boolean f123391x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final boolean f123392y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final long[] f123393z;

        private static String[] p(q0 q0Var, String str) {
            Object[] objArrG = q0Var.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i10 = 0; i10 < objArrG.length; i10++) {
                strArr[i10] = String.valueOf(objArrG[i10]);
            }
            return strArr;
        }

        @androidx.annotation.p0
        public Integer A() {
            return this.f123384q;
        }

        @androidx.annotation.p0
        public String a() {
            return this.f123371d;
        }

        @androidx.annotation.p0
        public String[] b() {
            return this.f123373f;
        }

        @androidx.annotation.p0
        public String c() {
            return this.f123372e;
        }

        @androidx.annotation.p0
        public String d() {
            return this.f123380m;
        }

        @androidx.annotation.p0
        public String e() {
            return this.f123379l;
        }

        @androidx.annotation.p0
        public String f() {
            return this.f123378k;
        }

        public boolean g() {
            return this.f123392y;
        }

        public boolean h() {
            return this.f123390w;
        }

        public boolean i() {
            return this.f123391x;
        }

        @androidx.annotation.p0
        public Long j() {
            return this.f123387t;
        }

        @androidx.annotation.p0
        public String k() {
            return this.f123374g;
        }

        @androidx.annotation.p0
        public Uri l() {
            String str = this.f123375h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @androidx.annotation.p0
        public int[] m() {
            return this.f123386s;
        }

        @androidx.annotation.p0
        public Uri n() {
            return this.f123381n;
        }

        public boolean o() {
            return this.f123389v;
        }

        @androidx.annotation.p0
        public Integer q() {
            return this.f123385r;
        }

        @androidx.annotation.p0
        public Integer r() {
            return this.f123383p;
        }

        @androidx.annotation.p0
        public String s() {
            return this.f123376i;
        }

        public boolean t() {
            return this.f123388u;
        }

        @androidx.annotation.p0
        public String u() {
            return this.f123377j;
        }

        @androidx.annotation.p0
        public String v() {
            return this.f123382o;
        }

        @androidx.annotation.p0
        public String w() {
            return this.f123368a;
        }

        @androidx.annotation.p0
        public String[] x() {
            return this.f123370c;
        }

        @androidx.annotation.p0
        public String y() {
            return this.f123369b;
        }

        @androidx.annotation.p0
        public long[] z() {
            return this.f123393z;
        }

        private d(q0 q0Var) {
            this.f123368a = q0Var.p(e.c.f123490g);
            this.f123369b = q0Var.h(e.c.f123490g);
            this.f123370c = p(q0Var, e.c.f123490g);
            this.f123371d = q0Var.p(e.c.f123491h);
            this.f123372e = q0Var.h(e.c.f123491h);
            this.f123373f = p(q0Var, e.c.f123491h);
            this.f123374g = q0Var.p(e.c.f123492i);
            this.f123376i = q0Var.o();
            this.f123377j = q0Var.p(e.c.f123494k);
            this.f123378k = q0Var.p(e.c.f123495l);
            this.f123379l = q0Var.p(e.c.A);
            this.f123380m = q0Var.p(e.c.D);
            this.f123381n = q0Var.f();
            this.f123375h = q0Var.p(e.c.f123493j);
            this.f123382o = q0Var.p(e.c.f123496m);
            this.f123383p = q0Var.b(e.c.f123499p);
            this.f123384q = q0Var.b(e.c.f123504u);
            this.f123385r = q0Var.b(e.c.f123503t);
            this.f123388u = q0Var.a(e.c.f123498o);
            this.f123389v = q0Var.a(e.c.f123497n);
            this.f123390w = q0Var.a(e.c.f123500q);
            this.f123391x = q0Var.a(e.c.f123501r);
            this.f123392y = q0Var.a(e.c.f123502s);
            this.f123387t = q0Var.j(e.c.f123507x);
            this.f123386s = q0Var.e();
            this.f123393z = q0Var.q();
        }
    }

    @SafeParcelable.b
    public RemoteMessage(@SafeParcelable.e(id = 2) Bundle bundle) {
        this.f123363a = bundle;
    }

    private int f2(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public long B2() {
        Object obj = this.f123363a.get(e.d.f123519j);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                Objects.toString(obj);
            }
        }
        return 0L;
    }

    @androidx.annotation.p0
    @Deprecated
    public String D2() {
        return this.f123363a.getString(e.d.f123516g);
    }

    @androidx.annotation.p0
    public String O1() {
        return this.f123363a.getString(e.d.f123514e);
    }

    @NonNull
    public Map<String, String> T1() {
        if (this.f123364b == null) {
            this.f123364b = e.d.a(this.f123363a);
        }
        return this.f123364b;
    }

    public int U2() {
        Object obj = this.f123363a.get(e.d.f123518i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Objects.toString(obj);
            return 0;
        }
    }

    void W2(Intent intent) {
        intent.putExtras(this.f123363a);
    }

    @androidx.annotation.p0
    public String b2() {
        return this.f123363a.getString("from");
    }

    @androidx.annotation.p0
    public String e2() {
        String string = this.f123363a.getString(e.d.f123517h);
        return string == null ? this.f123363a.getString(e.d.f123515f) : string;
    }

    @g6.a
    public Intent h3() {
        Intent intent = new Intent();
        intent.putExtras(this.f123363a);
        return intent;
    }

    @androidx.annotation.p0
    public String n2() {
        return this.f123363a.getString(e.d.f123513d);
    }

    @androidx.annotation.p0
    public d p2() {
        if (this.f123365c == null && q0.v(this.f123363a)) {
            this.f123365c = new d(new q0(this.f123363a));
        }
        return this.f123365c;
    }

    public int q2() {
        String string = this.f123363a.getString(e.d.f123520k);
        if (string == null) {
            string = this.f123363a.getString(e.d.f123522m);
        }
        return f2(string);
    }

    public int s2() {
        String string = this.f123363a.getString(e.d.f123521l);
        if (string == null) {
            if ("1".equals(this.f123363a.getString(e.d.f123523n))) {
                return 2;
            }
            string = this.f123363a.getString(e.d.f123522m);
        }
        return f2(string);
    }

    @androidx.annotation.p0
    @com.google.android.gms.common.internal.a0
    public byte[] u2() {
        return this.f123363a.getByteArray(e.d.f123512c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        x0.c(this, parcel, i10);
    }

    @androidx.annotation.p0
    public String z2() {
        return this.f123363a.getString(e.d.f123526q);
    }
}
