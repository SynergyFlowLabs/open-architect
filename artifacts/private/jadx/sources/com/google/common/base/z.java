package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@k
final class z extends h implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f116717b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f116718a;

    private static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matcher f116719a;

        a(Matcher matcher) {
            this.f116719a = (Matcher) j0.E(matcher);
        }

        @Override // com.google.common.base.g
        public int a() {
            return this.f116719a.end();
        }

        @Override // com.google.common.base.g
        public boolean b() {
            return this.f116719a.find();
        }

        @Override // com.google.common.base.g
        public boolean c(int index) {
            return this.f116719a.find(index);
        }

        @Override // com.google.common.base.g
        public boolean d() {
            return this.f116719a.matches();
        }

        @Override // com.google.common.base.g
        public String e(String replacement) {
            return this.f116719a.replaceAll(replacement);
        }

        @Override // com.google.common.base.g
        public int f() {
            return this.f116719a.start();
        }
    }

    z(Pattern pattern) {
        this.f116718a = (Pattern) j0.E(pattern);
    }

    @Override // com.google.common.base.h
    public int b() {
        return this.f116718a.flags();
    }

    @Override // com.google.common.base.h
    public g d(CharSequence t10) {
        return new a(this.f116718a.matcher(t10));
    }

    @Override // com.google.common.base.h
    public String e() {
        return this.f116718a.pattern();
    }

    @Override // com.google.common.base.h
    public String toString() {
        return this.f116718a.toString();
    }
}
