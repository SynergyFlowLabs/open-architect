package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ConnectionResultCreator")
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int H1 = 22;
    public static final int SUCCESS = 0;
    public static final int X = 16;
    public static final int Y = 17;
    public static final int Z = 18;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @g6.a
    public static final int f105817e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f105818f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f105819g = 2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f105820g3 = 24;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f105821h = 3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Deprecated
    public static final int f105822h3 = 1500;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f105823i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f105825j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f105826k = 6;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f105827l = 7;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f105828m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f105829n = 9;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f105830o = 10;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f105831p0 = 19;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f105832p1 = 20;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f105833p2 = 23;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f105834s = 11;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f105835t = 13;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f105836v = 14;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f105837w = 15;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getErrorCode", id = 2)
    private final int f105839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getResolution", id = 3)
    @androidx.annotation.p0
    private final PendingIntent f105840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getErrorMessage", id = 4)
    @androidx.annotation.p0
    private final String f105841d;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NonNull
    @com.google.android.gms.common.internal.a0
    @g6.a
    public static final ConnectionResult f105824i3 = new ConnectionResult(0);

    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new n0();

    @SafeParcelable.b
    ConnectionResult(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) @androidx.annotation.p0 PendingIntent pendingIntent, @SafeParcelable.e(id = 4) @androidx.annotation.p0 String str) {
        this.f105838a = i10;
        this.f105839b = i11;
        this.f105840c = pendingIntent;
        this.f105841d = str;
    }

    @NonNull
    static String p2(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public int O1() {
        return this.f105839b;
    }

    @androidx.annotation.p0
    public String T1() {
        return this.f105841d;
    }

    @androidx.annotation.p0
    public PendingIntent b2() {
        return this.f105840c;
    }

    public boolean e2() {
        return (this.f105839b == 0 || this.f105840c == null) ? false : true;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f105839b == connectionResult.f105839b && com.google.android.gms.common.internal.u.b(this.f105840c, connectionResult.f105840c) && com.google.android.gms.common.internal.u.b(this.f105841d, connectionResult.f105841d);
    }

    public boolean f2() {
        return this.f105839b == 0;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f105839b), this.f105840c, this.f105841d);
    }

    public void n2(@NonNull Activity activity, int i10) throws IntentSender.SendIntentException {
        if (e2()) {
            PendingIntent pendingIntent = this.f105840c;
            com.google.android.gms.common.internal.w.r(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }

    @NonNull
    public String toString() {
        com.google.android.gms.common.internal.u.a aVarD = com.google.android.gms.common.internal.u.d(this);
        aVarD.a("statusCode", p2(this.f105839b));
        aVarD.a("resolution", this.f105840c);
        aVarD.a("message", this.f105841d);
        return aVarD.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f105838a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.F(parcel, 2, O1());
        i6.b.S(parcel, 3, b2(), i10, false);
        i6.b.Y(parcel, 4, T1(), false);
        i6.b.b(parcel, iA);
    }

    public ConnectionResult(int i10) {
        this(i10, null, null);
    }

    public ConnectionResult(int i10, @androidx.annotation.p0 PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public ConnectionResult(int i10, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 String str) {
        this(1, i10, pendingIntent, str);
    }
}
