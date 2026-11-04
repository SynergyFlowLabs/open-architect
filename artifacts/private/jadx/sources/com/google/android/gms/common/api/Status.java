package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements v, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStatusCode", id = 1)
    private final int f105893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStatusMessage", id = 2)
    @p0
    private final String f105894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPendingIntent", id = 3)
    @p0
    private final PendingIntent f105895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getConnectionResult", id = 4)
    @p0
    private final ConnectionResult f105896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    @com.google.android.gms.common.internal.a0
    @g6.a
    public static final Status f105885e = new Status(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    @com.google.android.gms.common.internal.a0
    @g6.a
    public static final Status f105886f = new Status(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    @com.google.android.gms.common.internal.a0
    @g6.a
    public static final Status f105887g = new Status(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    @com.google.android.gms.common.internal.a0
    @g6.a
    public static final Status f105888h = new Status(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    @com.google.android.gms.common.internal.a0
    @g6.a
    public static final Status f105889i = new Status(15);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    @com.google.android.gms.common.internal.a0
    @g6.a
    public static final Status f105890j = new Status(16);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    @com.google.android.gms.common.internal.a0
    @g6.a
    public static final Status f105891k = new Status(17);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final Status f105892l = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new n0();

    @SafeParcelable.b
    Status(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @p0 String str, @SafeParcelable.e(id = 3) @p0 PendingIntent pendingIntent, @SafeParcelable.e(id = 4) @p0 ConnectionResult connectionResult) {
        this.f105893a = i10;
        this.f105894b = str;
        this.f105895c = pendingIntent;
        this.f105896d = connectionResult;
    }

    @p0
    public ConnectionResult O1() {
        return this.f105896d;
    }

    @p0
    public PendingIntent T1() {
        return this.f105895c;
    }

    public int b2() {
        return this.f105893a;
    }

    @p0
    public String e2() {
        return this.f105894b;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f105893a == status.f105893a && com.google.android.gms.common.internal.u.b(this.f105894b, status.f105894b) && com.google.android.gms.common.internal.u.b(this.f105895c, status.f105895c) && com.google.android.gms.common.internal.u.b(this.f105896d, status.f105896d);
    }

    public boolean f2() {
        if (this.f105895c == null) {
            return false;
        }
        int i10 = 3 << 1;
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f105893a), this.f105894b, this.f105895c, this.f105896d);
    }

    public boolean n2() {
        return this.f105893a == 16;
    }

    public boolean p2() {
        return this.f105893a == 14;
    }

    public boolean q2() {
        return this.f105893a <= 0;
    }

    public void s2(@NonNull Activity activity, int i10) throws IntentSender.SendIntentException {
        if (f2()) {
            Bundle bundle = com.google.android.gms.common.util.v.u() ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            PendingIntent pendingIntent = this.f105895c;
            com.google.android.gms.common.internal.w.r(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0, bundle);
        }
    }

    @Override // com.google.android.gms.common.api.v
    @NonNull
    public Status t() {
        return this;
    }

    @NonNull
    public String toString() {
        com.google.android.gms.common.internal.u.a aVarD = com.google.android.gms.common.internal.u.d(this);
        aVarD.a("statusCode", z2());
        aVarD.a("resolution", this.f105895c);
        return aVarD.toString();
    }

    public void u2(@NonNull androidx.activity.result.h<IntentSenderRequest> hVar) {
        if (f2()) {
            PendingIntent pendingIntent = this.f105895c;
            com.google.android.gms.common.internal.w.r(pendingIntent);
            hVar.b(new IntentSenderRequest.a(pendingIntent.getIntentSender()).a());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, b2());
        i6.b.Y(parcel, 2, e2(), false);
        i6.b.S(parcel, 3, this.f105895c, i10, false);
        i6.b.S(parcel, 4, O1(), i10, false);
        i6.b.b(parcel, iA);
    }

    @NonNull
    public final String z2() {
        String str = this.f105894b;
        return str != null ? str : h.a(this.f105893a);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i10, @p0 String str) {
        this(i10, str, (PendingIntent) null);
    }

    @g6.a
    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str, int i10) {
        this(i10, str, connectionResult.b2(), connectionResult);
    }

    public Status(int i10, @p0 String str, @p0 PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
