package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ActivityTransitionRequestCreator")
@SafeParcelable.g({1000})
public class ActivityTransitionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new u0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final Comparator<ActivityTransition> f109479e = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getActivityTransitions", id = 1)
    private final List f109480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTag", id = 2)
    @androidx.annotation.p0
    private final String f109481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getClients", id = 3)
    private final List f109482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, getter = "getContextAttributionTag", id = 4)
    @androidx.annotation.p0
    private String f109483d;

    public ActivityTransitionRequest(@NonNull List<ActivityTransition> list) {
        this(list, null, null, null);
    }

    public void O1(@NonNull Intent intent) {
        com.google.android.gms.common.internal.w.r(intent);
        i6.c.o(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    @NonNull
    public final ActivityTransitionRequest T1(@androidx.annotation.p0 String str) {
        this.f109483d = str;
        return this;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (com.google.android.gms.common.internal.u.b(this.f109480a, activityTransitionRequest.f109480a) && com.google.android.gms.common.internal.u.b(this.f109481b, activityTransitionRequest.f109481b) && com.google.android.gms.common.internal.u.b(this.f109483d, activityTransitionRequest.f109483d) && com.google.android.gms.common.internal.u.b(this.f109482c, activityTransitionRequest.f109482c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f109480a.hashCode() * 31;
        String str = this.f109481b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f109482c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f109483d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        List list = this.f109482c;
        String strValueOf = String.valueOf(this.f109480a);
        String strValueOf2 = String.valueOf(list);
        String str = this.f109483d;
        int length = strValueOf.length();
        String str2 = this.f109481b;
        int length2 = String.valueOf(str2).length();
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + strValueOf2.length() + 18 + String.valueOf(str).length() + 1);
        sb2.append("ActivityTransitionRequest [mTransitions=");
        sb2.append(strValueOf);
        sb2.append(", mTag='");
        sb2.append(str2);
        sb2.append("', mClients=");
        sb2.append(strValueOf2);
        sb2.append(", mAttributionTag=");
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        com.google.android.gms.common.internal.w.r(parcel);
        List list = this.f109480a;
        int iA = i6.b.a(parcel);
        i6.b.d0(parcel, 1, list, false);
        i6.b.Y(parcel, 2, this.f109481b, false);
        i6.b.d0(parcel, 3, this.f109482c, false);
        i6.b.Y(parcel, 4, this.f109483d, false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    public ActivityTransitionRequest(@NonNull @SafeParcelable.e(id = 1) List list, @SafeParcelable.e(id = 2) @androidx.annotation.p0 String str, @SafeParcelable.e(id = 3) @androidx.annotation.p0 List list2, @SafeParcelable.e(id = 4) @androidx.annotation.p0 String str2) {
        com.google.android.gms.common.internal.w.s(list, "transitions can't be null");
        com.google.android.gms.common.internal.w.b(!list.isEmpty(), "transitions can't be empty.");
        com.google.android.gms.common.internal.w.r(list);
        TreeSet treeSet = new TreeSet(f109479e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            com.google.android.gms.common.internal.w.b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.f109480a = Collections.unmodifiableList(list);
        this.f109481b = str;
        this.f109482c = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f109483d = str2;
    }
}
