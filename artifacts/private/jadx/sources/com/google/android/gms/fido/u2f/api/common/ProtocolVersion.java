package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public enum ProtocolVersion implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");


    @NonNull
    public static final Parcelable.Creator<ProtocolVersion> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.u2f.api.common.h
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return ProtocolVersion.c(parcel.readString());
            } catch (ProtocolVersion.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new ProtocolVersion[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f107387a;

    public static class a extends Exception {
        public a(@NonNull String str) {
            super(String.format("Protocol version %s not supported", str));
        }
    }

    ProtocolVersion(String str) {
        this.f107387a = str;
    }

    @NonNull
    public static ProtocolVersion b(@NonNull byte[] bArr) throws a {
        try {
            return c(new String(bArr, "UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public static ProtocolVersion c(@NonNull String str) throws a {
        if (str == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.f107387a)) {
                return protocolVersion;
            }
        }
        throw new a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e(@NonNull ProtocolVersion protocolVersion) {
        ProtocolVersion protocolVersion2 = UNKNOWN;
        if (equals(protocolVersion2) || protocolVersion.equals(protocolVersion2)) {
            return true;
        }
        return equals(protocolVersion);
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f107387a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f107387a);
    }
}
