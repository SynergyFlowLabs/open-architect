package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.base.api.ParcelableProto;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ControllerRequest extends ParcelableProto<com.google.vr.vrcore.controller.api.nano.a.C1417a> {
    public static final Parcelable.Creator<ControllerRequest> CREATOR = new a();

    class a implements Parcelable.Creator<ControllerRequest> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControllerRequest createFromParcel(Parcel parcel) {
            return new ControllerRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControllerRequest[] newArray(int i10) {
            return new ControllerRequest[i10];
        }
    }

    public ControllerRequest() {
    }

    @Override // com.google.vr.vrcore.base.api.ParcelableProto
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ControllerRequest) {
            return Arrays.equals(((ControllerRequest) obj).b(), b());
        }
        return false;
    }

    public ControllerRequest(Parcel parcel) {
        super(parcel);
    }
}
