package com.badlogic.gdx.utils;

import java.text.MessageFormat;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MessageFormat f95530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f1 f95531b = new f1();

    public g1(Locale locale, boolean z10) {
        if (z10) {
            this.f95530a = new MessageFormat("", locale);
        }
    }

    private String b(String str) {
        int i10 = 0;
        this.f95531b.o0(0);
        int length = str.length();
        boolean z10 = false;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\'') {
                this.f95531b.o("''");
                z10 = true;
            } else if (cCharAt == '{') {
                int i11 = i10 + 1;
                while (i11 < length && str.charAt(i11) == '{') {
                    i11++;
                }
                int i12 = i11 - i10;
                int i13 = i12 / 2;
                if (i13 > 0) {
                    this.f95531b.append('\'');
                    do {
                        this.f95531b.append(AbstractJsonLexerKt.BEGIN_OBJ);
                        i13--;
                    } while (i13 > 0);
                    this.f95531b.append('\'');
                    z10 = true;
                }
                if (i12 % 2 != 0) {
                    this.f95531b.append(AbstractJsonLexerKt.BEGIN_OBJ);
                }
                i10 = i11 - 1;
            } else {
                this.f95531b.append(cCharAt);
            }
            i10++;
        }
        return z10 ? this.f95531b.toString() : str;
    }

    private String c(String str, Object... objArr) {
        this.f95531b.o0(0);
        int length = str.length();
        int i10 = 0;
        boolean z10 = false;
        int i11 = -1;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (i11 < 0) {
                if (cCharAt == '{') {
                    int i12 = i10 + 1;
                    if (i12 >= length || str.charAt(i12) != '{') {
                        i11 = 0;
                    } else {
                        this.f95531b.append(cCharAt);
                        i10 = i12;
                    }
                    z10 = true;
                } else {
                    this.f95531b.append(cCharAt);
                }
            } else if (cCharAt == '}') {
                if (i11 >= objArr.length) {
                    throw new IllegalArgumentException("Argument index out of bounds: " + i11);
                }
                if (str.charAt(i10 - 1) == '{') {
                    throw new IllegalArgumentException("Missing argument index after a left curly brace");
                }
                Object obj = objArr[i11];
                if (obj == null) {
                    this.f95531b.o(AbstractJsonLexerKt.NULL);
                } else {
                    this.f95531b.o(obj.toString());
                }
                i11 = -1;
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    throw new IllegalArgumentException("Unexpected '" + cCharAt + "' while parsing argument index");
                }
                i11 = (i11 * 10) + (cCharAt - '0');
            }
            i10++;
        }
        if (i11 < 0) {
            return z10 ? this.f95531b.toString() : str;
        }
        throw new IllegalArgumentException("Unmatched braces in the pattern.");
    }

    public String a(String str, Object... objArr) {
        MessageFormat messageFormat = this.f95530a;
        if (messageFormat == null) {
            return c(str, objArr);
        }
        messageFormat.applyPattern(b(str));
        return this.f95530a.format(objArr);
    }
}
