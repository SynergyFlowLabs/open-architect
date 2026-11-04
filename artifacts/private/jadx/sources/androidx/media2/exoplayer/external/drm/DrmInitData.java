package androidx.media2.exoplayer.external.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SchemeData[] f53811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f53813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53814d;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f53815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final UUID f53816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public final String f53817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f53818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public final byte[] f53819e;

        class a implements Parcelable.Creator<SchemeData> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel in) {
                return new SchemeData(in);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int size) {
                return new SchemeData[size];
            }
        }

        public SchemeData(UUID uuid, String mimeType, @p0 byte[] data) {
            this(uuid, null, mimeType, data);
        }

        public boolean b(SchemeData other) {
            return e() && !other.e() && f(other.f53816b);
        }

        public SchemeData c(@p0 byte[] data) {
            return new SchemeData(this.f53816b, this.f53817c, this.f53818d, data);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean e() {
            return this.f53819e != null;
        }

        public boolean equals(@p0 Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return q0.b(this.f53817c, schemeData.f53817c) && q0.b(this.f53818d, schemeData.f53818d) && q0.b(this.f53816b, schemeData.f53816b) && Arrays.equals(this.f53819e, schemeData.f53819e);
        }

        public boolean f(UUID schemeUuid) {
            return androidx.media2.exoplayer.external.c.f53739w1.equals(this.f53816b) || schemeUuid.equals(this.f53816b);
        }

        public int hashCode() {
            if (this.f53815a == 0) {
                int iHashCode = this.f53816b.hashCode() * 31;
                String str = this.f53817c;
                this.f53815a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f53818d.hashCode()) * 31) + Arrays.hashCode(this.f53819e);
            }
            return this.f53815a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeLong(this.f53816b.getMostSignificantBits());
            dest.writeLong(this.f53816b.getLeastSignificantBits());
            dest.writeString(this.f53817c);
            dest.writeString(this.f53818d);
            dest.writeByteArray(this.f53819e);
        }

        public SchemeData(UUID uuid, @p0 String licenseServerUrl, String mimeType, @p0 byte[] data) {
            this.f53816b = (UUID) androidx.media2.exoplayer.external.util.a.g(uuid);
            this.f53817c = licenseServerUrl;
            this.f53818d = (String) androidx.media2.exoplayer.external.util.a.g(mimeType);
            this.f53819e = data;
        }

        SchemeData(Parcel in) {
            this.f53816b = new UUID(in.readLong(), in.readLong());
            this.f53817c = in.readString();
            this.f53818d = (String) q0.i(in.readString());
            this.f53819e = in.createByteArray();
        }
    }

    class a implements Parcelable.Creator<DrmInitData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel in) {
            return new DrmInitData(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int size) {
            return new DrmInitData[size];
        }
    }

    public DrmInitData(List<SchemeData> schemeDatas) {
        this(null, false, (SchemeData[]) schemeDatas.toArray(new SchemeData[0]));
    }

    private static boolean b(ArrayList<SchemeData> datas, int limit, UUID uuid) {
        for (int i10 = 0; i10 < limit; i10++) {
            if (datas.get(i10).f53816b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @p0
    public static DrmInitData e(@p0 DrmInitData manifestData, @p0 DrmInitData mediaData) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (manifestData != null) {
            str = manifestData.f53813c;
            for (SchemeData schemeData : manifestData.f53811a) {
                if (schemeData.e()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (mediaData != null) {
            if (str == null) {
                str = mediaData.f53813c;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : mediaData.f53811a) {
                if (schemeData2.e() && !b(arrayList, size, schemeData2.f53816b)) {
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
    public int compare(SchemeData first, SchemeData second) {
        UUID uuid = androidx.media2.exoplayer.external.c.f53739w1;
        if (!uuid.equals(first.f53816b)) {
            return first.f53816b.compareTo(second.f53816b);
        }
        if (!uuid.equals(second.f53816b)) {
            return 1;
        }
        int i10 = 4 ^ 0;
        return 0;
    }

    public DrmInitData c(@p0 String schemeType) {
        return q0.b(this.f53813c, schemeType) ? this : new DrmInitData(schemeType, false, this.f53811a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (q0.b(this.f53813c, drmInitData.f53813c) && Arrays.equals(this.f53811a, drmInitData.f53811a)) {
                return true;
            }
        }
        return false;
    }

    public SchemeData f(int index) {
        return this.f53811a[index];
    }

    @p0
    @Deprecated
    public SchemeData g(UUID uuid) {
        for (SchemeData schemeData : this.f53811a) {
            if (schemeData.f(uuid)) {
                return schemeData;
            }
        }
        return null;
    }

    public DrmInitData h(DrmInitData drmInitData) {
        String str;
        String str2 = this.f53813c;
        androidx.media2.exoplayer.external.util.a.i(str2 == null || (str = drmInitData.f53813c) == null || TextUtils.equals(str2, str));
        String str3 = this.f53813c;
        if (str3 == null) {
            str3 = drmInitData.f53813c;
        }
        return new DrmInitData(str3, (SchemeData[]) q0.z0(this.f53811a, drmInitData.f53811a));
    }

    public int hashCode() {
        if (this.f53812b == 0) {
            String str = this.f53813c;
            this.f53812b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f53811a);
        }
        return this.f53812b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f53813c);
        dest.writeTypedArray(this.f53811a, 0);
    }

    public DrmInitData(@p0 String schemeType, List<SchemeData> schemeDatas) {
        this(schemeType, false, (SchemeData[]) schemeDatas.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDatas) {
        this((String) null, schemeDatas);
    }

    public DrmInitData(@p0 String schemeType, SchemeData... schemeDatas) {
        this(schemeType, true, schemeDatas);
    }

    private DrmInitData(@p0 String schemeType, boolean cloneSchemeDatas, SchemeData... schemeDatas) {
        this.f53813c = schemeType;
        schemeDatas = cloneSchemeDatas ? (SchemeData[]) schemeDatas.clone() : schemeDatas;
        this.f53811a = schemeDatas;
        this.f53814d = schemeDatas.length;
        Arrays.sort(schemeDatas, this);
    }

    DrmInitData(Parcel in) {
        this.f53813c = in.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) q0.i((SchemeData[]) in.createTypedArray(SchemeData.CREATOR));
        this.f53811a = schemeDataArr;
        this.f53814d = schemeDataArr.length;
    }
}
