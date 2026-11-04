package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.e;
import com.google.common.base.a0;
import com.google.common.collect.e9;
import com.google.common.collect.n6;
import java.util.Deque;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.b
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a0 f126700a = a0.p("");

    c() {
    }

    private static int a(Deque<CharSequence> stack, CharSequence encoded, int start, n6.b<String, b> builder) {
        int length = encoded.length();
        char cCharAt = 0;
        int i10 = start;
        while (i10 < length && (cCharAt = encoded.charAt(i10)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i10++;
        }
        stack.push(d(encoded.subSequence(start, i10)));
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            String strK = f126700a.k(stack);
            if (strK.length() > 0) {
                builder.i(strK, b.l(cCharAt));
            }
        }
        int iA = i10 + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iA < length) {
                iA += a(stack, encoded, iA, builder);
                if (encoded.charAt(iA) == '?' || encoded.charAt(iA) == ',') {
                    iA++;
                    break;
                }
            }
        }
        stack.pop();
        return iA - start;
    }

    @e
    static n6<String, b> b(String encoded) {
        n6.b bVarB = n6.b();
        int length = encoded.length();
        int iA = 0;
        while (iA < length) {
            iA += a(e9.d(), encoded, iA, bVarB);
        }
        return bVarB.d();
    }

    static n6<String, b> c(CharSequence... encodedChunks) {
        return b(f126700a.n(encodedChunks));
    }

    private static CharSequence d(CharSequence s10) {
        return new StringBuilder(s10).reverse();
    }
}
