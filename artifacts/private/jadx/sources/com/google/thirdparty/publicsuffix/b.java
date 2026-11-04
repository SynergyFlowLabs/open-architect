package com.google.thirdparty.publicsuffix;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@com.google.common.annotations.b
public enum b {
    PRIVATE(AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.COMMA),
    REGISTRY('!', '?');


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f126698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f126699b;

    b(char innerNodeCode, char leafNodeCode) {
        this.f126698a = innerNodeCode;
        this.f126699b = leafNodeCode;
    }

    static b l(char code) {
        int i10;
        b[] bVarArrValues = values();
        int length = bVarArrValues.length;
        while (i10 < length) {
            b bVar = bVarArrValues[i10];
            i10 = (bVar.n() == code || bVar.o() == code) ? 0 : i10 + 1;
            return bVar;
        }
        throw new IllegalArgumentException("No enum corresponding to given code: " + code);
    }

    char n() {
        return this.f126698a;
    }

    char o() {
        return this.f126699b;
    }
}
