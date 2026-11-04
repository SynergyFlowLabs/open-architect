package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ChannelIdValueCreator")
@SafeParcelable.g({1})
@Deprecated
public class ChannelIdValue extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final ChannelIdValue f107355d = new ChannelIdValue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final ChannelIdValue f107356e = new ChannelIdValue("unavailable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public static final ChannelIdValue f107357f = new ChannelIdValue("unused");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTypeAsInt", id = 2, type = "int")
    private final ChannelIdValueType f107358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStringValue", id = 3)
    private final String f107359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getObjectValueAsString", id = 4)
    private final String f107360c;

    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);


        @NonNull
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f107365a;

        ChannelIdValueType(int i10) {
            this.f107365a = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeInt(this.f107365a);
        }
    }

    public static class a extends Exception {
        public a(int i10) {
            super(String.format("ChannelIdValueType %s not supported", Integer.valueOf(i10)));
        }
    }

    private ChannelIdValue() {
        this.f107358a = ChannelIdValueType.ABSENT;
        this.f107360c = null;
        this.f107359b = null;
    }

    @NonNull
    public static ChannelIdValueType n2(int i10) throws a {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i10 == channelIdValueType.f107365a) {
                return channelIdValueType;
            }
        }
        throw new a(i10);
    }

    @NonNull
    public JSONObject O1() {
        if (this.f107360c == null) {
            return null;
        }
        try {
            return new JSONObject(this.f107360c);
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public String T1() {
        return this.f107360c;
    }

    @NonNull
    public String b2() {
        return this.f107359b;
    }

    @NonNull
    public ChannelIdValueType e2() {
        return this.f107358a;
    }

    public boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        if (!this.f107358a.equals(channelIdValue.f107358a)) {
            return false;
        }
        int iOrdinal = this.f107358a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.f107359b.equals(channelIdValue.f107359b);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.f107360c.equals(channelIdValue.f107360c);
    }

    public int f2() {
        return this.f107358a.f107365a;
    }

    public int hashCode() {
        int i10;
        int iHashCode;
        int iHashCode2 = this.f107358a.hashCode() + 31;
        int iOrdinal = this.f107358a.ordinal();
        if (iOrdinal == 1) {
            i10 = iHashCode2 * 31;
            iHashCode = this.f107359b.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i10 = iHashCode2 * 31;
            iHashCode = this.f107360c.hashCode();
        }
        return i10 + iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 2, f2());
        i6.b.Y(parcel, 3, b2(), false);
        i6.b.Y(parcel, 4, T1(), false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    ChannelIdValue(@SafeParcelable.e(id = 2) int i10, @SafeParcelable.e(id = 3) String str, @SafeParcelable.e(id = 4) String str2) {
        try {
            this.f107358a = n2(i10);
            this.f107359b = str;
            this.f107360c = str2;
        } catch (a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private ChannelIdValue(String str) {
        this.f107359b = (String) w.r(str);
        this.f107358a = ChannelIdValueType.STRING;
        this.f107360c = null;
    }

    public ChannelIdValue(@NonNull JSONObject jSONObject) {
        this.f107360c = (String) w.r(jSONObject.toString());
        this.f107358a = ChannelIdValueType.OBJECT;
        this.f107359b = null;
    }
}
