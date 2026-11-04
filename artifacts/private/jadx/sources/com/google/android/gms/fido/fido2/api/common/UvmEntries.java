package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "UvmEntriesCreator")
public class UvmEntries extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntries> CREATOR = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getUvmEntryList", id = 1)
    @androidx.annotation.p0
    private final List f107252a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f107253a = new ArrayList();

        @NonNull
        public a a(@NonNull List<UvmEntry> list) {
            com.google.android.gms.internal.fido.n.c(this.f107253a.size() + list.size() <= 3);
            this.f107253a.addAll(list);
            return this;
        }

        @NonNull
        public a b(@androidx.annotation.p0 UvmEntry uvmEntry) {
            if (this.f107253a.size() >= 3) {
                throw new IllegalStateException();
            }
            this.f107253a.add(uvmEntry);
            return this;
        }

        @NonNull
        public UvmEntries c() {
            return new UvmEntries(this.f107253a);
        }
    }

    @SafeParcelable.b
    UvmEntries(@SafeParcelable.e(id = 1) @androidx.annotation.p0 List list) {
        this.f107252a = list;
    }

    @androidx.annotation.p0
    public List<UvmEntry> O1() {
        return this.f107252a;
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.f107252a;
        if (list2 == null && uvmEntries.f107252a == null) {
            return true;
        }
        return list2 != null && (list = uvmEntries.f107252a) != null && list2.containsAll(list) && uvmEntries.f107252a.containsAll(this.f107252a);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(new HashSet(this.f107252a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        int i11 = 4 << 0;
        i6.b.d0(parcel, 1, O1(), false);
        i6.b.b(parcel, iA);
    }
}
