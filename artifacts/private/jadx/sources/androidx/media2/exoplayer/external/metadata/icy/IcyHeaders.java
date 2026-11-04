package androidx.media2.exoplayer.external.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f55459g = "Icy-MetaData";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f55460h = "1";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f55461i = "IcyHeaders";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f55462j = "icy-br";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f55463k = "icy-genre";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f55464l = "icy-name";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f55465m = "icy-url";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f55466n = "icy-pub";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f55467o = "icy-metaint";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f55469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f55470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f55471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f55472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55473f;

    class a implements Parcelable.Creator<IcyHeaders> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyHeaders createFromParcel(Parcel in) {
            return new IcyHeaders(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyHeaders[] newArray(int size) {
            return new IcyHeaders[size];
        }
    }

    public IcyHeaders(int bitrate, @p0 String genre, @p0 String name, @p0 String url, boolean isPublic, int metadataInterval) {
        androidx.media2.exoplayer.external.util.a.a(metadataInterval == -1 || metadataInterval > 0);
        this.f55468a = bitrate;
        this.f55469b = genre;
        this.f55470c = name;
        this.f55471d = url;
        this.f55472e = isPublic;
        this.f55473f = metadataInterval;
    }

    @p0
    public static IcyHeaders a(Map<String, List<String>> map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        boolean zEquals;
        int i11;
        List<String> list = map.get(f55462j);
        boolean z11 = true;
        int i12 = -1;
        if (list != null) {
            String str3 = list.get(0);
            try {
                i11 = Integer.parseInt(str3) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        String strValueOf = String.valueOf(str3);
                        p.l(f55461i, strValueOf.length() != 0 ? "Invalid bitrate: ".concat(strValueOf) : new String("Invalid bitrate: "));
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        String strValueOf2 = String.valueOf(str3);
                        p.l(f55461i, strValueOf2.length() != 0 ? "Invalid bitrate header: ".concat(strValueOf2) : new String("Invalid bitrate header: "));
                        z10 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        List<String> list2 = map.get(f55463k);
        String str4 = null;
        if (list2 != null) {
            str4 = list2.get(0);
            z10 = true;
        }
        List<String> list3 = map.get(f55464l);
        if (list3 != null) {
            str = list3.get(0);
            z10 = true;
        } else {
            str = str4;
        }
        List<String> list4 = map.get(f55465m);
        if (list4 != null) {
            str2 = list4.get(0);
            z10 = true;
        } else {
            str2 = str4;
        }
        List<String> list5 = map.get(f55466n);
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get(f55467o);
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        String strValueOf3 = String.valueOf(str5);
                        p.l(f55461i, strValueOf3.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf3) : new String("Invalid metadata interval: "));
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        String strValueOf4 = String.valueOf(str5);
                        p.l(f55461i, strValueOf4.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf4) : new String("Invalid metadata interval: "));
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        return z10 ? new IcyHeaders(i10, str4, str, str2, zEquals, i12) : null;
    }

    @Override // androidx.media2.exoplayer.external.metadata.Metadata.Entry
    public Format O0() {
        return androidx.media2.exoplayer.external.metadata.a.b(this);
    }

    @Override // androidx.media2.exoplayer.external.metadata.Metadata.Entry
    public byte[] Y() {
        return androidx.media2.exoplayer.external.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyHeaders.class == obj.getClass()) {
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.f55468a == icyHeaders.f55468a && q0.b(this.f55469b, icyHeaders.f55469b) && q0.b(this.f55470c, icyHeaders.f55470c) && q0.b(this.f55471d, icyHeaders.f55471d) && this.f55472e == icyHeaders.f55472e && this.f55473f == icyHeaders.f55473f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f55468a) * 31;
        String str = this.f55469b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55470c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55471d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f55472e ? 1 : 0)) * 31) + this.f55473f;
    }

    public String toString() {
        String str = this.f55470c;
        String str2 = this.f55469b;
        int i10 = this.f55468a;
        int i11 = this.f55473f;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb2.append("IcyHeaders: name=\"");
        sb2.append(str);
        sb2.append("\", genre=\"");
        sb2.append(str2);
        sb2.append("\", bitrate=");
        sb2.append(i10);
        sb2.append(", metadataInterval=");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f55468a);
        dest.writeString(this.f55469b);
        dest.writeString(this.f55470c);
        dest.writeString(this.f55471d);
        q0.Y0(dest, this.f55472e);
        dest.writeInt(this.f55473f);
    }

    IcyHeaders(Parcel in) {
        this.f55468a = in.readInt();
        this.f55469b = in.readString();
        this.f55470c = in.readString();
        this.f55471d = in.readString();
        this.f55472e = q0.E0(in);
        this.f55473f = in.readInt();
    }
}
