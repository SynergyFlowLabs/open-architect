package net.openid.appauth.browser;

import androidx.annotation.NonNull;
import com.facebook.appevents.p;

/* JADX INFO: loaded from: classes4.dex */
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f332860b = 92821;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f332861c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f332862a;

    public i(long[] jArr) {
        this.f332862a = jArr;
    }

    private int b(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    public static i d(String str) {
        if (str == null) {
            return new i(new long[0]);
        }
        String[] strArrSplit = str.split("[^0-9]+");
        long[] jArr = new long[strArrSplit.length];
        int i10 = 0;
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                jArr[i10] = Long.parseLong(str2);
                i10++;
            }
        }
        do {
            i10--;
            if (i10 < 0) {
                break;
            }
        } while (jArr[i10] <= 0);
        int i11 = i10 + 1;
        long[] jArr2 = new long[i11];
        System.arraycopy(jArr, 0, jArr2, 0, i11);
        return new i(jArr2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull i iVar) {
        long[] jArr;
        int i10 = 0;
        while (true) {
            jArr = this.f332862a;
            if (i10 >= jArr.length) {
                break;
            }
            long[] jArr2 = iVar.f332862a;
            if (i10 >= jArr2.length) {
                break;
            }
            int iB = b(jArr[i10], jArr2[i10]);
            if (iB != 0) {
                return iB;
            }
            i10++;
        }
        return b(jArr.length, iVar.f332862a.length);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof i) && compareTo((i) obj) == 0;
    }

    public int hashCode() {
        int i10 = 0;
        for (long j10 : this.f332862a) {
            i10 = (i10 * f332860b) + ((int) j10);
        }
        return i10;
    }

    public String toString() {
        if (this.f332862a.length == 0) {
            return p.f99189d0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f332862a[0]);
        for (int i10 = 1; i10 < this.f332862a.length; i10++) {
            sb2.append('.');
            sb2.append(this.f332862a[i10]);
        }
        return sb2.toString();
    }
}
