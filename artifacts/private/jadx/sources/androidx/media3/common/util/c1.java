package androidx.media3.common.util;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f61480a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f61481b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f61482c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f61483d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f61484e = 3;

    private c1() {
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:1: B:25:0x0075->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6 A[SYNTHETIC] */
    @b1
    public static String a(Uri uri, Uri uri2) {
        List<String> pathSegments;
        List<String> pathSegments2;
        int iMin;
        int i10;
        int i11;
        StringBuilder sb2;
        int i12;
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if (scheme == null) {
            if (scheme2 == null) {
                if (Objects.equals(uri.getAuthority(), uri2.getAuthority())) {
                    pathSegments = uri.getPathSegments();
                    pathSegments2 = uri2.getPathSegments();
                    iMin = Math.min(pathSegments.size(), pathSegments2.size());
                    i11 = 0;
                    for (i10 = 0; i10 < iMin && pathSegments.get(i10).equals(pathSegments2.get(i10)); i10++) {
                        i11++;
                    }
                    sb2 = new StringBuilder();
                    for (i12 = i11; i12 < pathSegments.size(); i12++) {
                        sb2.append("../");
                    }
                    while (i11 < pathSegments2.size()) {
                        sb2.append(pathSegments2.get(i11));
                        if (i11 < pathSegments2.size() - 1) {
                            sb2.append("/");
                        }
                        i11++;
                    }
                    return sb2.toString();
                }
            }
        } else if (scheme2 != null && com.google.common.base.c.a(scheme, scheme2)) {
            if (Objects.equals(uri.getAuthority(), uri2.getAuthority())) {
                pathSegments = uri.getPathSegments();
                pathSegments2 = uri2.getPathSegments();
                iMin = Math.min(pathSegments.size(), pathSegments2.size());
                i11 = 0;
                while (i10 < iMin) {
                    i11++;
                }
                sb2 = new StringBuilder();
                while (i12 < pathSegments.size()) {
                    sb2.append("../");
                }
                while (i11 < pathSegments2.size()) {
                    sb2.append(pathSegments2.get(i11));
                    if (i11 < pathSegments2.size() - 1) {
                        sb2.append("/");
                    }
                    i11++;
                }
                return sb2.toString();
            }
        }
        return uri2.toString();
    }

    private static int[] b(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i10 = iIndexOf5 + 2;
        if (i10 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i10) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
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

    public static boolean c(@androidx.annotation.p0 String str) {
        return (str == null || b(str)[0] == -1) ? false : true;
    }

    private static String d(StringBuilder sb2, int i10, int i11) {
        int i12;
        int iLastIndexOf;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i13 = i10;
        int i14 = i13;
        while (i13 <= i11) {
            if (i13 == i11) {
                i12 = i13;
            } else if (sb2.charAt(i13) == '/') {
                i12 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb2.charAt(i14) == '.') {
                sb2.delete(i14, i12);
                i11 -= i12 - i14;
            } else {
                if (i13 == i14 + 2 && sb2.charAt(i14) == '.' && sb2.charAt(i15) == '.') {
                    iLastIndexOf = sb2.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = iLastIndexOf > i10 ? iLastIndexOf : i10;
                    sb2.delete(i16, i12);
                    i11 -= i12 - i16;
                } else {
                    iLastIndexOf = i13 + 1;
                }
                i14 = iLastIndexOf;
            }
            i13 = i14;
        }
        return sb2.toString();
    }

    public static Uri e(Uri uri, String str) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static String f(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrB = b(str2);
        if (iArrB[0] != -1) {
            sb2.append(str2);
            d(sb2, iArrB[1], iArrB[2]);
            return sb2.toString();
        }
        int[] iArrB2 = b(str);
        if (iArrB[3] == 0) {
            sb2.append((CharSequence) str, 0, iArrB2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (iArrB[2] == 0) {
            sb2.append((CharSequence) str, 0, iArrB2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i10 = iArrB[1];
        if (i10 != 0) {
            int i11 = iArrB2[0] + 1;
            sb2.append((CharSequence) str, 0, i11);
            sb2.append(str2);
            return d(sb2, iArrB[1] + i11, i11 + iArrB[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb2.append((CharSequence) str, 0, iArrB2[1]);
            sb2.append(str2);
            int i12 = iArrB2[1];
            return d(sb2, i12, iArrB[2] + i12);
        }
        int i13 = iArrB2[0] + 2;
        int i14 = iArrB2[1];
        if (i13 >= i14 || i14 != iArrB2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrB2[2] - 1);
            int i15 = iLastIndexOf == -1 ? iArrB2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i15);
            sb2.append(str2);
            return d(sb2, iArrB2[1], i15 + iArrB[2]);
        }
        sb2.append((CharSequence) str, 0, i14);
        sb2.append('/');
        sb2.append(str2);
        int i16 = iArrB2[1];
        return d(sb2, i16, iArrB[2] + i16 + 1);
    }

    public static Uri g(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        return Uri.parse(f(str, str2));
    }
}
