package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import androidx.annotation.NonNull;
import androidx.media3.common.j;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ProxyRequestCreator")
@g6.c
@a0
public class ProxyRequest extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f105568g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(id = 1)
    public final String f105578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    public final int f105579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    public final long f105580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(id = 4)
    public final byte[] f105581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.h(id = 1000)
    final int f105582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(id = 5)
    final Bundle f105583f;

    @NonNull
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f105569h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f105570i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f105571j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f105572k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f105573l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f105574m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f105575n = 6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f105576o = 7;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f105577s = 7;

    @g6.c
    @a0
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f105584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f105585b = ProxyRequest.f105569h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f105586c = j.f60679f2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f105587d = new byte[0];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f105588e = new Bundle();

        public a(@NonNull String str) {
            w.l(str);
            if (Patterns.WEB_URL.matcher(str).matches()) {
                this.f105584a = str;
                return;
            }
            throw new IllegalArgumentException("The supplied url [ " + str + "] is not match Patterns.WEB_URL!");
        }

        @NonNull
        public ProxyRequest a() {
            if (this.f105587d == null) {
                this.f105587d = new byte[0];
            }
            return new ProxyRequest(2, this.f105584a, this.f105585b, this.f105586c, this.f105587d, this.f105588e);
        }

        @NonNull
        public a b(@NonNull String str, @NonNull String str2) {
            w.m(str, "Header name cannot be null or empty!");
            Bundle bundle = this.f105588e;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        @NonNull
        public a c(@NonNull byte[] bArr) {
            this.f105587d = bArr;
            return this;
        }

        @NonNull
        public a d(int i10) {
            boolean z10 = false;
            if (i10 >= 0 && i10 <= ProxyRequest.f105577s) {
                z10 = true;
            }
            w.b(z10, "Unrecognized http method code.");
            this.f105585b = i10;
            return this;
        }

        @NonNull
        public a e(long j10) {
            w.b(j10 >= 0, "The specified timeout must be non-negative.");
            this.f105586c = j10;
            return this;
        }
    }

    static {
        int i10 = 0 | 2;
    }

    @SafeParcelable.b
    ProxyRequest(@SafeParcelable.e(id = 1000) int i10, @SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) long j10, @SafeParcelable.e(id = 4) byte[] bArr, @SafeParcelable.e(id = 5) Bundle bundle) {
        this.f105582e = i10;
        this.f105578a = str;
        this.f105579b = i11;
        this.f105580c = j10;
        this.f105581d = bArr;
        this.f105583f = bundle;
    }

    @NonNull
    public Map<String, String> O1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f105583f.size());
        for (String str : this.f105583f.keySet()) {
            String string = this.f105583f.getString(str);
            if (string == null) {
                string = "";
            }
            linkedHashMap.put(str, string);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    @NonNull
    public String toString() {
        return "ProxyRequest[ url: " + this.f105578a + ", method: " + this.f105579b + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 1, this.f105578a, false);
        i6.b.F(parcel, 2, this.f105579b);
        i6.b.K(parcel, 3, this.f105580c);
        i6.b.m(parcel, 4, this.f105581d, false);
        i6.b.k(parcel, 5, this.f105583f, false);
        i6.b.F(parcel, 1000, this.f105582e);
        i6.b.b(parcel, iA);
    }
}
