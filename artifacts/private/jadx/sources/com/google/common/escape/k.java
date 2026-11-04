package com.google.common.escape;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b(emulated = true)
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<char[]> f118517a = new a();

    class a extends ThreadLocal<char[]> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    private k() {
    }

    static char[] a() {
        char[] cArr = f118517a.get();
        Objects.requireNonNull(cArr);
        return cArr;
    }
}
