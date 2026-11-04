package androidx.media2.exoplayer.external.util;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.b1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f57604a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f57605b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f57606c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f57607d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f57608e = 3;

    private m0() {
    }

    private static int[] a(String uriString) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(uriString)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = uriString.length();
        int iIndexOf2 = uriString.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = uriString.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = uriString.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = uriString.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i10 = iIndexOf5 + 2;
        if (i10 < iIndexOf3 && uriString.charAt(iIndexOf5 + 1) == '/' && uriString.charAt(i10) == '/') {
            iIndexOf = uriString.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    private static String b(StringBuilder uri, int offset, int limit) {
        int i10;
        int iLastIndexOf;
        if (offset >= limit) {
            return uri.toString();
        }
        if (uri.charAt(offset) == '/') {
            offset++;
        }
        int i11 = offset;
        int i12 = i11;
        while (i11 <= limit) {
            if (i11 == limit) {
                i10 = i11;
            } else if (uri.charAt(i11) == '/') {
                i10 = i11 + 1;
            } else {
                i11++;
            }
            int i13 = i12 + 1;
            if (i11 == i13 && uri.charAt(i12) == '.') {
                uri.delete(i12, i10);
                limit -= i10 - i12;
            } else {
                if (i11 == i12 + 2 && uri.charAt(i12) == '.' && uri.charAt(i13) == '.') {
                    iLastIndexOf = uri.lastIndexOf("/", i12 - 2) + 1;
                    int i14 = iLastIndexOf > offset ? iLastIndexOf : offset;
                    uri.delete(i14, i10);
                    limit -= i10 - i14;
                } else {
                    iLastIndexOf = i11 + 1;
                }
                i12 = iLastIndexOf;
            }
            i11 = i12;
        }
        return uri.toString();
    }

    public static Uri c(Uri uri, String queryParameterName) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals(queryParameterName)) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static String d(@androidx.annotation.p0 String baseUri, @androidx.annotation.p0 String referenceUri) {
        StringBuilder sb2 = new StringBuilder();
        if (baseUri == null) {
            baseUri = "";
        }
        if (referenceUri == null) {
            referenceUri = "";
        }
        int[] iArrA = a(referenceUri);
        if (iArrA[0] != -1) {
            sb2.append(referenceUri);
            b(sb2, iArrA[1], iArrA[2]);
            return sb2.toString();
        }
        int[] iArrA2 = a(baseUri);
        if (iArrA[3] == 0) {
            sb2.append((CharSequence) baseUri, 0, iArrA2[3]);
            sb2.append(referenceUri);
            return sb2.toString();
        }
        if (iArrA[2] == 0) {
            sb2.append((CharSequence) baseUri, 0, iArrA2[2]);
            sb2.append(referenceUri);
            return sb2.toString();
        }
        int i10 = iArrA[1];
        if (i10 != 0) {
            int i11 = iArrA2[0] + 1;
            sb2.append((CharSequence) baseUri, 0, i11);
            sb2.append(referenceUri);
            return b(sb2, iArrA[1] + i11, i11 + iArrA[2]);
        }
        if (referenceUri.charAt(i10) == '/') {
            sb2.append((CharSequence) baseUri, 0, iArrA2[1]);
            sb2.append(referenceUri);
            int i12 = iArrA2[1];
            return b(sb2, i12, iArrA[2] + i12);
        }
        int i13 = iArrA2[0] + 2;
        int i14 = iArrA2[1];
        if (i13 >= i14 || i14 != iArrA2[2]) {
            int iLastIndexOf = baseUri.lastIndexOf(47, iArrA2[2] - 1);
            int i15 = iLastIndexOf == -1 ? iArrA2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) baseUri, 0, i15);
            sb2.append(referenceUri);
            return b(sb2, iArrA2[1], i15 + iArrA[2]);
        }
        sb2.append((CharSequence) baseUri, 0, i14);
        sb2.append('/');
        sb2.append(referenceUri);
        int i16 = iArrA2[1];
        return b(sb2, i16, iArrA[2] + i16 + 1);
    }

    public static Uri e(@androidx.annotation.p0 String baseUri, @androidx.annotation.p0 String referenceUri) {
        return Uri.parse(d(baseUri, referenceUri));
    }
}
