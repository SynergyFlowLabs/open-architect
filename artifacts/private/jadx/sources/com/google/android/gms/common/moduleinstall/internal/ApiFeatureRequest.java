package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ApiFeatureRequestCreator")
@g6.a
public class ApiFeatureRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator f106759e = new Comparator() { // from class: com.google.android.gms.common.moduleinstall.internal.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Feature feature = (Feature) obj;
            Feature feature2 = (Feature) obj2;
            Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
            return !feature.O1().equals(feature2.O1()) ? feature.O1().compareTo(feature2.O1()) : Long.compare(feature.T1(), feature2.T1());
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getApiFeatures", id = 1)
    private final List f106760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getIsUrgent", id = 2)
    private final boolean f106761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getFeatureRequestSessionId", id = 3)
    @p0
    private final String f106762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCallingPackage", id = 4)
    @p0
    private final String f106763d;

    @SafeParcelable.b
    public ApiFeatureRequest(@NonNull @SafeParcelable.e(id = 1) List list, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) @p0 String str, @SafeParcelable.e(id = 4) @p0 String str2) {
        com.google.android.gms.common.internal.w.r(list);
        this.f106760a = list;
        this.f106761b = z10;
        this.f106762c = str;
        this.f106763d = str2;
    }

    @NonNull
    @g6.a
    public static ApiFeatureRequest O1(@NonNull com.google.android.gms.common.moduleinstall.d dVar) {
        return b2(dVar.a(), true);
    }

    static ApiFeatureRequest b2(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f106759e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((com.google.android.gms.common.api.n) it.next()).a());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z10, null, null);
    }

    @NonNull
    @g6.a
    public List<Feature> T1() {
        return this.f106760a;
    }

    public final boolean equals(@p0 Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f106761b == apiFeatureRequest.f106761b && com.google.android.gms.common.internal.u.b(this.f106760a, apiFeatureRequest.f106760a) && com.google.android.gms.common.internal.u.b(this.f106762c, apiFeatureRequest.f106762c) && com.google.android.gms.common.internal.u.b(this.f106763d, apiFeatureRequest.f106763d);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Boolean.valueOf(this.f106761b), this.f106760a, this.f106762c, this.f106763d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.d0(parcel, 1, T1(), false);
        i6.b.g(parcel, 2, this.f106761b);
        i6.b.Y(parcel, 3, this.f106762c, false);
        i6.b.Y(parcel, 4, this.f106763d, false);
        i6.b.b(parcel, iA);
    }
}
