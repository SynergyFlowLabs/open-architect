package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f109069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f109070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a0 f109071c;

    /* synthetic */ c0(String str, d0 d0Var) {
        a0 a0Var = new a0();
        this.f109070b = a0Var;
        this.f109071c = a0Var;
        str.getClass();
        this.f109069a = str;
    }

    public final c0 a(@fj.a Object obj) {
        a0 a0Var = new a0();
        this.f109071c.f109039b = a0Var;
        this.f109071c = a0Var;
        a0Var.f109038a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f109069a);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        a0 a0Var = this.f109070b.f109039b;
        String str = "";
        while (a0Var != null) {
            Object obj = a0Var.f109038a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            a0Var = a0Var.f109039b;
            str = ", ";
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
