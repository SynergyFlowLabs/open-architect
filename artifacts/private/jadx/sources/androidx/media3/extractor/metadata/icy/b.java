package androidx.media3.extractor.metadata.icy;

import androidx.annotation.p0;
import androidx.media3.common.q0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.z;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b implements r0.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f67508g = "Icy-MetaData";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f67509h = "1";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f67510i = "IcyHeaders";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f67511j = "icy-br";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f67512k = "icy-genre";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f67513l = "icy-name";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f67514m = "icy-url";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f67515n = "icy-pub";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f67516o = "icy-metaint";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f67518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f67519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f67520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f67521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f67522f;

    public b(int i10, @p0 String str, @p0 String str2, @p0 String str3, boolean z10, int i11) {
        androidx.media3.common.util.a.a(i11 == -1 || i11 > 0);
        this.f67517a = i10;
        this.f67518b = str;
        this.f67519c = str2;
        this.f67520d = str3;
        this.f67521e = z10;
        this.f67522f = i11;
    }

    @p0
    public static b b(Map<String, List<String>> map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        boolean zEquals;
        int i11;
        List<String> list = map.get(f67511j);
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
                        z.n(f67510i, "Invalid bitrate: " + str3);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        z.n(f67510i, "Invalid bitrate header: " + str3);
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
        List<String> list2 = map.get(f67512k);
        String str4 = null;
        if (list2 != null) {
            str4 = list2.get(0);
            z10 = true;
        }
        List<String> list3 = map.get(f67513l);
        if (list3 != null) {
            str = list3.get(0);
            z10 = true;
        } else {
            str = str4;
        }
        List<String> list4 = map.get(f67514m);
        if (list4 != null) {
            str2 = list4.get(0);
            z10 = true;
        } else {
            str2 = str4;
        }
        List<String> list5 = map.get(f67515n);
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get(f67516o);
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        z.n(f67510i, "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        z.n(f67510i, "Invalid metadata interval: " + str5);
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        return z10 ? new b(i10, str4, str, str2, zEquals, i12) : null;
    }

    @Override // androidx.media3.common.r0.a
    public void a(q0.b bVar) {
        String str = this.f67519c;
        if (str != null) {
            bVar.o0(str);
        }
        String str2 = this.f67518b;
        if (str2 != null) {
            bVar.d0(str2);
        }
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f67517a == bVar.f67517a && Objects.equals(this.f67518b, bVar.f67518b) && Objects.equals(this.f67519c, bVar.f67519c) && Objects.equals(this.f67520d, bVar.f67520d) && this.f67521e == bVar.f67521e && this.f67522f == bVar.f67522f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f67517a) * 31;
        String str = this.f67518b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f67519c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67520d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f67521e ? 1 : 0)) * 31) + this.f67522f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f67519c + "\", genre=\"" + this.f67518b + "\", bitrate=" + this.f67517a + ", metadataInterval=" + this.f67522f;
    }
}
