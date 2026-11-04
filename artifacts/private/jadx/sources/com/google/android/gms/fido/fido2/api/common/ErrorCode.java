package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);


    @NonNull
    public static final Parcelable.Creator<ErrorCode> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.u0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return ErrorCode.l(parcel.readInt());
            } catch (ErrorCode.a e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new ErrorCode[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f107160a;

    public static class a extends Exception {
        public a(int i10) {
            super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i10)));
        }
    }

    ErrorCode(int i10) {
        this.f107160a = i10;
    }

    @NonNull
    public static ErrorCode l(int i10) throws a {
        for (ErrorCode errorCode : values()) {
            if (i10 == errorCode.f107160a) {
                return errorCode;
            }
        }
        throw new a(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int k() {
        return this.f107160a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f107160a);
    }
}
