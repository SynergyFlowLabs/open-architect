package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "LocationSettingsRequestCreator")
@SafeParcelable.g({4, 5, 1000})
public final class LocationSettingsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getLocationRequests", id = 1)
    private final List f109593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "alwaysShow", id = 2)
    private final boolean f109594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "needBle", id = 3)
    private final boolean f109595c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList f109596a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f109597b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f109598c = false;

        @NonNull
        public a a(@NonNull Collection<LocationRequest> collection) {
            for (LocationRequest locationRequest : collection) {
                if (locationRequest != null) {
                    this.f109596a.add(locationRequest);
                }
            }
            return this;
        }

        @NonNull
        public a b(@NonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f109596a.add(locationRequest);
            }
            return this;
        }

        @NonNull
        public LocationSettingsRequest c() {
            return new LocationSettingsRequest(this.f109596a, this.f109597b, this.f109598c);
        }

        @NonNull
        public a d(boolean z10) {
            this.f109597b = z10;
            return this;
        }

        @NonNull
        public a e(boolean z10) {
            this.f109598c = z10;
            return this;
        }
    }

    @SafeParcelable.b
    LocationSettingsRequest(@SafeParcelable.e(id = 1) List list, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) boolean z11) {
        this.f109593a = list;
        this.f109594b = z10;
        this.f109595c = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        List list = this.f109593a;
        int iA = i6.b.a(parcel);
        i6.b.d0(parcel, 1, Collections.unmodifiableList(list), false);
        i6.b.g(parcel, 2, this.f109594b);
        int i11 = 0 >> 3;
        i6.b.g(parcel, 3, this.f109595c);
        i6.b.b(parcel, iA);
    }
}
