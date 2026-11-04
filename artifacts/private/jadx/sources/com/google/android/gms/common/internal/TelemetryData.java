package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "TelemetryDataCreator")
@g6.a
public class TelemetryData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTelemetryConfigVersion", id = 1)
    private final int f106499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.h
    @SafeParcelable.c(getter = "getMethodInvocations", id = 2)
    private List f106500b;

    @SafeParcelable.b
    public TelemetryData(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @fj.h List list) {
        this.f106499a = i10;
        this.f106500b = list;
    }

    @androidx.annotation.p0
    public final List O1() {
        return this.f106500b;
    }

    public final void T1(@NonNull MethodInvocation methodInvocation) {
        if (this.f106500b == null) {
            this.f106500b = new ArrayList();
        }
        this.f106500b.add(methodInvocation);
    }

    public final int c() {
        return this.f106499a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f106499a);
        i6.b.d0(parcel, 2, this.f106500b, false);
        i6.b.b(parcel, iA);
    }
}
