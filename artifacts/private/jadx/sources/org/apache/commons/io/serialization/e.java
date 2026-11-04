package org.apache.commons.io.serialization;

import org.apache.commons.io.l;

/* JADX INFO: loaded from: classes14.dex */
final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f336824a;

    public e(String str) {
        this.f336824a = str;
    }

    @Override // org.apache.commons.io.serialization.a
    public boolean a(String str) {
        return l.K(str, this.f336824a);
    }
}
