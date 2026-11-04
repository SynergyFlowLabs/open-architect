package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public enum ErrorCode implements Parcelable {
    OK(0),
    OTHER_ERROR(1),
    BAD_REQUEST(2),
    CONFIGURATION_UNSUPPORTED(3),
    DEVICE_INELIGIBLE(4),
    TIMEOUT(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f107374a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f107372h = ErrorCode.class.getSimpleName();

    @NonNull
    public static final Parcelable.Creator<ErrorCode> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.u2f.api.common.e
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return ErrorCode.l(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new ErrorCode[i10];
        }
    };

    static {
        int i10 = 0 & 4;
    }

    ErrorCode(int i10) {
        this.f107374a = i10;
    }

    @NonNull
    public static ErrorCode l(int i10) {
        for (ErrorCode errorCode : values()) {
            if (i10 == errorCode.f107374a) {
                return errorCode;
            }
        }
        return OTHER_ERROR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int k() {
        return this.f107374a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f107374a);
    }
}
