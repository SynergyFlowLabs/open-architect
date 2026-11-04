package com.google.zxing;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f131003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f131004b;

    public t(float f10, float f11) {
        this.f131003a = f10;
        this.f131004b = f11;
    }

    private static float a(t tVar, t tVar2, t tVar3) {
        float f10 = tVar2.f131003a;
        float f11 = tVar2.f131004b;
        return ((tVar3.f131003a - f10) * (tVar.f131004b - f11)) - ((tVar3.f131004b - f11) * (tVar.f131003a - f10));
    }

    public static float b(t tVar, t tVar2) {
        return w9.a.a(tVar.f131003a, tVar.f131004b, tVar2.f131003a, tVar2.f131004b);
    }

    public static void e(t[] tVarArr) {
        t tVar;
        t tVar2;
        t tVar3;
        float fB = b(tVarArr[0], tVarArr[1]);
        float fB2 = b(tVarArr[1], tVarArr[2]);
        float fB3 = b(tVarArr[0], tVarArr[2]);
        if (fB2 >= fB && fB2 >= fB3) {
            tVar = tVarArr[0];
            tVar2 = tVarArr[1];
            tVar3 = tVarArr[2];
        } else if (fB3 < fB2 || fB3 < fB) {
            tVar = tVarArr[2];
            tVar2 = tVarArr[0];
            tVar3 = tVarArr[1];
        } else {
            tVar = tVarArr[1];
            tVar2 = tVarArr[0];
            tVar3 = tVarArr[2];
        }
        if (a(tVar2, tVar, tVar3) < 0.0f) {
            t tVar4 = tVar3;
            tVar3 = tVar2;
            tVar2 = tVar4;
        }
        tVarArr[0] = tVar2;
        tVarArr[1] = tVar;
        tVarArr[2] = tVar3;
    }

    public final float c() {
        return this.f131003a;
    }

    public final float d() {
        return this.f131004b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f131003a == tVar.f131003a && this.f131004b == tVar.f131004b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f131003a) * 31) + Float.floatToIntBits(this.f131004b);
    }

    public final String toString() {
        return "(" + this.f131003a + AbstractJsonLexerKt.COMMA + this.f131004b + ')';
    }
}
