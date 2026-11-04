package com.google.common.escape;

import com.google.common.base.j0;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[][] f118495b = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[][] f118496a;

    private b(char[][] replacementArray) {
        this.f118496a = replacementArray;
    }

    public static b a(Map<Character, String> replacements) {
        return new b(b(replacements));
    }

    @com.google.common.annotations.e
    static char[][] b(Map<Character, String> map) {
        j0.E(map);
        if (map.isEmpty()) {
            return f118495b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        for (Character ch2 : map.keySet()) {
            cArr[ch2.charValue()] = map.get(ch2).toCharArray();
        }
        return cArr;
    }

    char[][] c() {
        return this.f118496a;
    }
}
