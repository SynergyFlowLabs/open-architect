package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ModuleAvailabilityResponseCreator")
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "areModulesAvailable", id = 1)
    private final boolean f106724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAvailabilityStatus", id = 2)
    private final int f106725b;

    @Retention(RetentionPolicy.CLASS)
    public @interface a {

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public static final int f106726d1 = 0;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public static final int f106727e1 = 1;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public static final int f106728f1 = 2;
    }

    @SafeParcelable.b
    @g6.a
    public ModuleAvailabilityResponse(@SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) int i10) {
        this.f106724a = z10;
        this.f106725b = i10;
    }

    public boolean O1() {
        return this.f106724a;
    }

    @a
    public int T1() {
        return this.f106725b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.g(parcel, 1, O1());
        i6.b.F(parcel, 2, T1());
        i6.b.b(parcel, iA);
    }
}
