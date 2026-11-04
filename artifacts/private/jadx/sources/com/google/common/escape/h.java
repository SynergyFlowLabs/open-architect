package com.google.common.escape;

import com.google.common.base.t;

/* JADX INFO: loaded from: classes5.dex */
@f
@z7.f("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@com.google.common.annotations.b
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t<String, String> f118509a = new t() { // from class: com.google.common.escape.g
        @Override // com.google.common.base.t
        public final Object apply(Object obj) {
            return this.f118508a.b((String) obj);
        }
    };

    protected h() {
    }

    public final t<String, String> a() {
        return this.f118509a;
    }

    public abstract String b(String string);
}
