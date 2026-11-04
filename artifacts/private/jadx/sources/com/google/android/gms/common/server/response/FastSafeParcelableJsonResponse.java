package com.google.android.gms.common.server.response;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;

/* JADX INFO: loaded from: classes4.dex */
@a0
@g6.a
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @g6.a
    public FastSafeParcelableJsonResponse() {
    }

    @NonNull
    @g6.a
    public byte[] X() {
        Parcel parcelObtain = Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @g6.a
    public boolean equals(@p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field<?, ?> field : c().values()) {
            if (g(field)) {
                if (!fastJsonResponse.g(field) || !u.b(e(field), fastJsonResponse.e(field))) {
                    return false;
                }
            } else if (fastJsonResponse.g(field)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @p0
    public Object f(@NonNull String str) {
        return null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean h(@NonNull String str) {
        return false;
    }

    @g6.a
    public int hashCode() {
        int iHashCode = 0;
        for (FastJsonResponse.Field<?, ?> field : c().values()) {
            if (g(field)) {
                iHashCode = (iHashCode * 31) + w.r(e(field)).hashCode();
            }
        }
        return iHashCode;
    }
}
