package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ClientIdentityCreator")
@SafeParcelable.g({1000})
@g6.a
public class ClientIdentity extends AbstractSafeParcelable {

    @NonNull
    @g6.a
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = com.facebook.appevents.p.f99189d0, id = 1)
    @g6.a
    public final int f106459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, id = 2)
    @androidx.annotation.p0
    @g6.a
    public final String f106460b;

    @SafeParcelable.b
    public ClientIdentity(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @androidx.annotation.p0 String str) {
        this.f106459a = i10;
        this.f106460b = str;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f106459a == this.f106459a && u.b(clientIdentity.f106460b, this.f106460b);
    }

    public final int hashCode() {
        return this.f106459a;
    }

    @NonNull
    public final String toString() {
        return this.f106459a + ":" + this.f106460b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f106459a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.Y(parcel, 2, this.f106460b, false);
        i6.b.b(parcel, iA);
    }
}
