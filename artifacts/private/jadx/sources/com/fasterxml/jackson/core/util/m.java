package com.fasterxml.jackson.core.util;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class m implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f102834d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f102835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f102836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f102837c;

    public m() {
        this(AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.COMMA, AbstractJsonLexerKt.COMMA);
    }

    public static m a() {
        return new m();
    }

    public char b() {
        return this.f102837c;
    }

    public char c() {
        return this.f102836b;
    }

    public char d() {
        return this.f102835a;
    }

    public m e(char c10) {
        return this.f102837c == c10 ? this : new m(this.f102835a, this.f102836b, c10);
    }

    public m f(char c10) {
        return this.f102836b == c10 ? this : new m(this.f102835a, c10, this.f102837c);
    }

    public m g(char c10) {
        return this.f102835a == c10 ? this : new m(c10, this.f102836b, this.f102837c);
    }

    public m(char c10, char c11, char c12) {
        this.f102835a = c10;
        this.f102836b = c11;
        this.f102837c = c12;
    }
}
