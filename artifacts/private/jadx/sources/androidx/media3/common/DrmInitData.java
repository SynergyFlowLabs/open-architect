package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SchemeData[] f60265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f60267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f60268d;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f60269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f60270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f60271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f60272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        public final byte[] f60273e;

        class a implements Parcelable.Creator<SchemeData> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        public SchemeData(UUID uuid, String str, @androidx.annotation.p0 byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(SchemeData schemeData) {
            return c() && !schemeData.c() && e(schemeData.f60270b);
        }

        @androidx.annotation.j
        public SchemeData b(@androidx.annotation.p0 byte[] bArr) {
            return new SchemeData(this.f60270b, this.f60271c, this.f60272d, bArr);
        }

        public boolean c() {
            return this.f60273e != null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean e(UUID uuid) {
            return j.f60704k2.equals(this.f60270b) || uuid.equals(this.f60270b);
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return Objects.equals(this.f60271c, schemeData.f60271c) && Objects.equals(this.f60272d, schemeData.f60272d) && Objects.equals(this.f60270b, schemeData.f60270b) && Arrays.equals(this.f60273e, schemeData.f60273e);
        }

        public int hashCode() {
            if (this.f60269a == 0) {
                int iHashCode = this.f60270b.hashCode() * 31;
                String str = this.f60271c;
                this.f60269a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f60272d.hashCode()) * 31) + Arrays.hashCode(this.f60273e);
            }
            return this.f60269a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f60270b.getMostSignificantBits());
            parcel.writeLong(this.f60270b.getLeastSignificantBits());
            parcel.writeString(this.f60271c);
            parcel.writeString(this.f60272d);
            parcel.writeByteArray(this.f60273e);
        }

        public SchemeData(UUID uuid, @androidx.annotation.p0 String str, String str2, @androidx.annotation.p0 byte[] bArr) {
            this.f60270b = (UUID) androidx.media3.common.util.a.g(uuid);
            this.f60271c = str;
            this.f60272d = s0.w((String) androidx.media3.common.util.a.g(str2));
            this.f60273e = bArr;
        }

        SchemeData(Parcel parcel) {
            this.f60270b = new UUID(parcel.readLong(), parcel.readLong());
            this.f60271c = parcel.readString();
            this.f60272d = (String) androidx.media3.common.util.k1.o(parcel.readString());
            this.f60273e = parcel.createByteArray();
        }
    }

    class a implements Parcelable.Creator<DrmInitData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    private static boolean b(ArrayList<SchemeData> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f60270b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.p0
    public static DrmInitData e(@androidx.annotation.p0 DrmInitData drmInitData, @androidx.annotation.p0 DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        int i10 = 4 & 0;
        if (drmInitData != null) {
            str = drmInitData.f60267c;
            for (SchemeData schemeData : drmInitData.f60265a) {
                if (schemeData.c()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f60267c;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f60265a) {
                if (schemeData2.c() && !b(arrayList, size, schemeData2.f60270b)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = j.f60704k2;
        if (uuid.equals(schemeData.f60270b)) {
            return uuid.equals(schemeData2.f60270b) ? 0 : 1;
        }
        return schemeData.f60270b.compareTo(schemeData2.f60270b);
    }

    @androidx.annotation.j
    public DrmInitData c(@androidx.annotation.p0 String str) {
        return Objects.equals(this.f60267c, str) ? this : new DrmInitData(str, false, this.f60265a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (Objects.equals(this.f60267c, drmInitData.f60267c) && Arrays.equals(this.f60265a, drmInitData.f60265a)) {
                return true;
            }
        }
        return false;
    }

    public SchemeData f(int i10) {
        return this.f60265a[i10];
    }

    public DrmInitData g(DrmInitData drmInitData) {
        String str;
        String str2 = this.f60267c;
        androidx.media3.common.util.a.i(str2 == null || (str = drmInitData.f60267c) == null || TextUtils.equals(str2, str));
        String str3 = this.f60267c;
        if (str3 == null) {
            str3 = drmInitData.f60267c;
        }
        return new DrmInitData(str3, (SchemeData[]) androidx.media3.common.util.k1.I1(this.f60265a, drmInitData.f60265a));
    }

    public int hashCode() {
        if (this.f60266b == 0) {
            String str = this.f60267c;
            this.f60266b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f60265a);
        }
        return this.f60266b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f60267c);
        parcel.writeTypedArray(this.f60265a, 0);
    }

    public DrmInitData(@androidx.annotation.p0 String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(@androidx.annotation.p0 String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(@androidx.annotation.p0 String str, boolean z10, SchemeData... schemeDataArr) {
        this.f60267c = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f60265a = schemeDataArr;
        this.f60268d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    DrmInitData(Parcel parcel) {
        this.f60267c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) androidx.media3.common.util.k1.o((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f60265a = schemeDataArr;
        this.f60268d = schemeDataArr.length;
    }
}
