package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GeofencingRequestCreator")
@SafeParcelable.g({3, 1000})
public class GeofencingRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new c1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f109534d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f109535e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f109536f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getParcelableGeofences", id = 1)
    private final List f109537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b
    @SafeParcelable.c(getter = "getInitialTrigger", id = 2)
    private final int f109538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAttributionTag", id = 4)
    @androidx.annotation.p0
    private final String f109539c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f109540a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @b
        private int f109541b = 5;

        @NonNull
        public a a(@NonNull h hVar) {
            com.google.android.gms.common.internal.w.b(hVar instanceof zzek, "Geofence must be created using Geofence.Builder.");
            this.f109540a.add((zzek) hVar);
            return this;
        }

        @NonNull
        public a b(@NonNull List<? extends h> list) {
            Iterator<? extends h> it = list.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        @NonNull
        public GeofencingRequest c() {
            com.google.android.gms.common.internal.w.b(!this.f109540a.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(new ArrayList(this.f109540a), this.f109541b, null);
        }

        @NonNull
        public a d(@b int i10) {
            this.f109541b = i10 & 7;
            return this;
        }
    }

    public @interface b {
    }

    @SafeParcelable.b
    GeofencingRequest(@SafeParcelable.e(id = 1) List list, @SafeParcelable.e(id = 2) @b int i10, @SafeParcelable.e(id = 4) @androidx.annotation.p0 String str) {
        this.f109537a = list;
        this.f109538b = i10;
        this.f109539c = str;
    }

    @NonNull
    public List<h> O1() {
        return new ArrayList(this.f109537a);
    }

    @b
    public int T1() {
        return this.f109538b;
    }

    @NonNull
    public String toString() {
        String strValueOf = String.valueOf(this.f109537a);
        int length = strValueOf.length();
        int i10 = this.f109538b;
        StringBuilder sb2 = new StringBuilder(length + 45 + String.valueOf(i10).length() + 1);
        sb2.append("GeofencingRequest[geofences=");
        sb2.append(strValueOf);
        sb2.append(", initialTrigger=");
        sb2.append(i10);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        List list = this.f109537a;
        int iA = i6.b.a(parcel);
        i6.b.d0(parcel, 1, list, false);
        i6.b.F(parcel, 2, T1());
        i6.b.Y(parcel, 4, this.f109539c, false);
        i6.b.b(parcel, iA);
    }
}
