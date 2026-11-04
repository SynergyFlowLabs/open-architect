package com.fasterxml.jackson.core;

import com.facebook.internal.z0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public enum n {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE(z0.P, 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL(AbstractJsonLexerKt.NULL, 11);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f102660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final char[] f102661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f102662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f102663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f102664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f102665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f102666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f102667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f102668i;

    n(String str, int i10) {
        boolean z10 = false;
        if (str == null) {
            this.f102660a = null;
            this.f102661b = null;
            this.f102662c = null;
        } else {
            this.f102660a = str;
            char[] charArray = str.toCharArray();
            this.f102661b = charArray;
            int length = charArray.length;
            this.f102662c = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.f102662c[i11] = (byte) this.f102661b[i11];
            }
        }
        this.f102663d = i10;
        this.f102667h = i10 == 10 || i10 == 9;
        this.f102666g = i10 == 7 || i10 == 8;
        boolean z11 = i10 == 1 || i10 == 3;
        this.f102664e = z11;
        boolean z12 = i10 == 2 || i10 == 4;
        this.f102665f = z12;
        if (!z11 && !z12 && i10 != 5 && i10 != -1) {
            z10 = true;
        }
        this.f102668i = z10;
    }

    public final byte[] k() {
        return this.f102662c;
    }

    public final char[] l() {
        return this.f102661b;
    }

    public final String n() {
        return this.f102660a;
    }

    public final int o() {
        return this.f102663d;
    }

    public final boolean p() {
        return this.f102667h;
    }

    public final boolean q() {
        return this.f102666g;
    }

    public final boolean r() {
        return this.f102668i;
    }

    public final boolean s() {
        return this.f102665f;
    }

    public final boolean t() {
        return this.f102664e;
    }
}
