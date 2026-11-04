package com.google.common.escape;

import com.google.common.base.j0;
import java.util.Map;
import kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b
public abstract class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[][] f118491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f118492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final char f118493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final char f118494f;

    protected a(Map<Character, String> replacementMap, char safeMin, char safeMax) {
        this(b.a(replacementMap), safeMin, safeMax);
    }

    @Override // com.google.common.escape.d, com.google.common.escape.h
    public final String b(String s10) {
        int i10;
        j0.E(s10);
        while (i10 < s10.length()) {
            char cCharAt = s10.charAt(i10);
            i10 = ((cCharAt >= this.f118492d || this.f118491c[cCharAt] == null) && cCharAt <= this.f118494f && cCharAt >= this.f118493e) ? i10 + 1 : 0;
            return d(s10, i10);
        }
        return s10;
    }

    @Override // com.google.common.escape.d
    @fj.a
    protected final char[] c(char c10) {
        char[] cArr;
        if (c10 < this.f118492d && (cArr = this.f118491c[c10]) != null) {
            return cArr;
        }
        if (c10 < this.f118493e || c10 > this.f118494f) {
            return f(c10);
        }
        return null;
    }

    @fj.a
    protected abstract char[] f(char c10);

    protected a(b escaperMap, char safeMin, char safeMax) {
        j0.E(escaperMap);
        char[][] cArrC = escaperMap.c();
        this.f118491c = cArrC;
        this.f118492d = cArrC.length;
        if (safeMax < safeMin) {
            safeMax = 0;
            safeMin = r.f312787c;
        }
        this.f118493e = safeMin;
        this.f118494f = safeMax;
    }
}
