package qk;

import org.apache.commons.collections4.trie.c;

/* JADX INFO: loaded from: classes14.dex */
public class a extends c<String> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f359013e = -7032449491269434877L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f359014f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f359015g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f359016h = 32768;

    private static int n(int i10) {
        return 32768 >>> i10;
    }

    @Override // org.apache.commons.collections4.trie.c
    public int b() {
        return 16;
    }

    @Override // org.apache.commons.collections4.trie.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int a(String str, int i10, int i11, String str2, int i12, int i13) {
        if (i10 % 16 != 0 || i12 % 16 != 0 || i11 % 16 != 0 || i13 % 16 != 0) {
            throw new IllegalArgumentException("The offsets and lengths must be at Character boundaries");
        }
        int i14 = i10 / 16;
        int i15 = i12 / 16;
        int i16 = (i11 / 16) + i14;
        int i17 = (i13 / 16) + i15;
        int iMax = Math.max(i16, i17);
        boolean z10 = true;
        for (int i18 = 0; i18 < iMax; i18++) {
            int i19 = i14 + i18;
            int i20 = i15 + i18;
            char cCharAt = i19 >= i16 ? (char) 0 : str.charAt(i19);
            char cCharAt2 = (str2 == null || i20 >= i17) ? (char) 0 : str2.charAt(i20);
            if (cCharAt != cCharAt2) {
                return ((i18 * 16) + Integer.numberOfLeadingZeros(cCharAt ^ cCharAt2)) - 16;
            }
            if (cCharAt != 0) {
                z10 = false;
            }
        }
        return z10 ? -1 : -2;
    }

    @Override // org.apache.commons.collections4.trie.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean c(String str, int i10, int i11) {
        if (str == null || i10 >= i11) {
            return false;
        }
        return (str.charAt(i10 / 16) & n(i10 % 16)) != 0;
    }

    @Override // org.apache.commons.collections4.trie.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean g(String str, int i10, int i11, String str2) {
        if (i10 % 16 == 0 && i11 % 16 == 0) {
            return str2.startsWith(str.substring(i10 / 16, i11 / 16));
        }
        throw new IllegalArgumentException("Cannot determine prefix outside of Character boundaries");
    }

    @Override // org.apache.commons.collections4.trie.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int i(String str) {
        if (str != null) {
            return str.length() * 16;
        }
        return 0;
    }
}
