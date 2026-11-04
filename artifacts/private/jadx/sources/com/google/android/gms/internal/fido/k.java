package com.google.android.gms.internal.fido;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f108023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f108024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f108025c;

    /* synthetic */ k(String str, j jVar) {
        i iVar = new i(null);
        this.f108024b = iVar;
        this.f108025c = iVar;
        str.getClass();
        this.f108023a = str;
    }

    public final k a(String str, int i10) {
        String strValueOf = String.valueOf(i10);
        g gVar = new g(null);
        this.f108025c.f108021c = gVar;
        this.f108025c = gVar;
        gVar.f108020b = strValueOf;
        gVar.f108019a = "errorCode";
        return this;
    }

    public final k b(String str, @fj.a Object obj) {
        i iVar = new i(null);
        this.f108025c.f108021c = iVar;
        this.f108025c = iVar;
        iVar.f108020b = obj;
        iVar.f108019a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f108023a);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        i iVar = this.f108024b.f108021c;
        String str = "";
        while (iVar != null) {
            Object obj = iVar.f108020b;
            sb2.append(str);
            String str2 = iVar.f108019a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            iVar = iVar.f108021c;
            str = ", ";
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
