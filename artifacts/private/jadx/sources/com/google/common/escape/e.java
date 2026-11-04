package com.google.common.escape;

import com.google.common.base.j0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f118505b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Character, String> f118504a = new HashMap();

    private static class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char[][] f118506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f118507d;

        a(char[][] replacements) {
            this.f118506c = replacements;
            this.f118507d = replacements.length;
        }

        @Override // com.google.common.escape.d, com.google.common.escape.h
        public String b(String s10) {
            int length = s10.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = s10.charAt(i10);
                char[][] cArr = this.f118506c;
                if (cCharAt < cArr.length && cArr[cCharAt] != null) {
                    return d(s10, i10);
                }
            }
            return s10;
        }

        @Override // com.google.common.escape.d
        @fj.a
        protected char[] c(char c10) {
            if (c10 < this.f118507d) {
                return this.f118506c[c10];
            }
            return null;
        }
    }

    @z7.a
    public e a(char c10, String r10) {
        this.f118504a.put(Character.valueOf(c10), (String) j0.E(r10));
        if (c10 > this.f118505b) {
            this.f118505b = c10;
        }
        return this;
    }

    @z7.a
    public e b(char[] cs, String r10) {
        j0.E(r10);
        for (char c10 : cs) {
            a(c10, r10);
        }
        return this;
    }

    public char[][] c() {
        char[][] cArr = new char[this.f118505b + 1][];
        for (Map.Entry<Character, String> entry : this.f118504a.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }

    public h d() {
        return new a(c());
    }
}
