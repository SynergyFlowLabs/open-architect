package com.google.common.escape;

import com.google.common.base.j0;
import java.util.Map;
import kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b
public abstract class c extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[][] f118497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f118498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f118499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f118500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final char f118501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final char f118502h;

    protected c(Map<Character, String> replacementMap, int safeMin, int safeMax, String unsafeReplacement) {
        this(b.a(replacementMap), safeMin, safeMax, unsafeReplacement);
    }

    @Override // com.google.common.escape.l, com.google.common.escape.h
    public final String b(String s10) {
        int i10;
        j0.E(s10);
        while (i10 < s10.length()) {
            char cCharAt = s10.charAt(i10);
            i10 = ((cCharAt >= this.f118498d || this.f118497c[cCharAt] == null) && cCharAt <= this.f118502h && cCharAt >= this.f118501g) ? i10 + 1 : 0;
            return e(s10, i10);
        }
        return s10;
    }

    @Override // com.google.common.escape.l
    @fj.a
    protected final char[] d(int cp) {
        char[] cArr;
        if (cp < this.f118498d && (cArr = this.f118497c[cp]) != null) {
            return cArr;
        }
        if (cp < this.f118499e || cp > this.f118500f) {
            return h(cp);
        }
        return null;
    }

    @Override // com.google.common.escape.l
    protected final int g(CharSequence csq, int index, int end) {
        while (index < end) {
            char cCharAt = csq.charAt(index);
            if ((cCharAt < this.f118498d && this.f118497c[cCharAt] != null) || cCharAt > this.f118502h || cCharAt < this.f118501g) {
                break;
            }
            index++;
        }
        return index;
    }

    @fj.a
    protected abstract char[] h(int cp);

    protected c(b escaperMap, int safeMin, int safeMax, String unsafeReplacement) {
        j0.E(escaperMap);
        char[][] cArrC = escaperMap.c();
        this.f118497c = cArrC;
        this.f118498d = cArrC.length;
        if (safeMax < safeMin) {
            safeMax = -1;
            safeMin = Integer.MAX_VALUE;
        }
        this.f118499e = safeMin;
        this.f118500f = safeMax;
        if (safeMin >= 55296) {
            this.f118501g = r.f312787c;
            this.f118502h = (char) 0;
        } else {
            this.f118501g = (char) safeMin;
            this.f118502h = (char) Math.min(safeMax, 55295);
        }
    }
}
