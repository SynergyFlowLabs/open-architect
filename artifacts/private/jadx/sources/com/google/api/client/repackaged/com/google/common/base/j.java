package com.google.api.client.repackaged.com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@r7.c
final class j extends e implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f115878b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f115879a;

    private static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matcher f115880a;

        a(Matcher matcher) {
            this.f115880a = (Matcher) q.E(matcher);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.d
        int a() {
            return this.f115880a.end();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.d
        boolean b() {
            return this.f115880a.find();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.d
        boolean c(int i10) {
            return this.f115880a.find(i10);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.d
        boolean d() {
            return this.f115880a.matches();
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.d
        String e(String str) {
            return this.f115880a.replaceAll(str);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.d
        int f() {
            return this.f115880a.start();
        }
    }

    j(Pattern pattern) {
        this.f115879a = (Pattern) q.E(pattern);
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.e
    int a() {
        return this.f115879a.flags();
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.e
    d b(CharSequence charSequence) {
        return new a(this.f115879a.matcher(charSequence));
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.e
    String c() {
        return this.f115879a.pattern();
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.e
    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f115879a.equals(((j) obj).f115879a);
        }
        return false;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.e
    public int hashCode() {
        return this.f115879a.hashCode();
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.e
    public String toString() {
        return this.f115879a.toString();
    }
}
