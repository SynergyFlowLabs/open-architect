package com.google.vr.vrcore.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.base.api.ParcelableProto;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class HeadTrackingState extends ParcelableProto<Object> {
    public static final Parcelable.Creator<HeadTrackingState> CREATOR = new a();

    class a implements Parcelable.Creator<HeadTrackingState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HeadTrackingState createFromParcel(Parcel parcel) {
            return new HeadTrackingState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HeadTrackingState[] newArray(int i10) {
            return new HeadTrackingState[i10];
        }
    }

    public HeadTrackingState() {
    }

    @Override // com.google.vr.vrcore.base.api.ParcelableProto
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeadTrackingState) {
            return Arrays.equals(((HeadTrackingState) obj).b(), b());
        }
        return false;
    }

    @Override // com.google.vr.vrcore.base.api.ParcelableProto
    protected final boolean i() {
        return true;
    }

    @Override // com.google.vr.vrcore.base.api.ParcelableProto
    protected boolean j() {
        return true;
    }

    @Override // com.google.vr.vrcore.base.api.ParcelableProto
    public String toString() {
        int iC = c();
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("HeadTrackingState[");
        sb2.append(iC);
        sb2.append(" bytes]");
        return sb2.toString();
    }

    public HeadTrackingState(byte[] bArr) {
        super(bArr);
    }

    private HeadTrackingState(Parcel parcel) {
        super(parcel);
    }

    /* synthetic */ HeadTrackingState(Parcel parcel, a aVar) {
        this(parcel);
    }
}
