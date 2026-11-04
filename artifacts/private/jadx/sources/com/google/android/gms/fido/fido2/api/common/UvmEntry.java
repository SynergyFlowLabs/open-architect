package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "UvmEntryCreator")
public class UvmEntry extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntry> CREATOR = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getUserVerificationMethod", id = 1)
    private final int f107254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getKeyProtectionType", id = 2)
    private final short f107255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMatcherProtectionType", id = 3)
    private final short f107256c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private short f107258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private short f107259c;

        @NonNull
        public UvmEntry a() {
            return new UvmEntry(this.f107257a, this.f107258b, this.f107259c);
        }

        @NonNull
        public a b(short s10) {
            this.f107258b = s10;
            return this;
        }

        @NonNull
        public a c(short s10) {
            this.f107259c = s10;
            return this;
        }

        @NonNull
        public a d(int i10) {
            this.f107257a = i10;
            return this;
        }
    }

    @SafeParcelable.b
    UvmEntry(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) short s10, @SafeParcelable.e(id = 3) short s11) {
        this.f107254a = i10;
        this.f107255b = s10;
        this.f107256c = s11;
    }

    public short O1() {
        return this.f107255b;
    }

    public short T1() {
        return this.f107256c;
    }

    public int b2() {
        return this.f107254a;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f107254a == uvmEntry.f107254a && this.f107255b == uvmEntry.f107255b && this.f107256c == uvmEntry.f107256c;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f107254a), Short.valueOf(this.f107255b), Short.valueOf(this.f107256c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, b2());
        i6.b.U(parcel, 2, O1());
        i6.b.U(parcel, 3, T1());
        i6.b.b(parcel, iA);
    }
}
