package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f102352e = 64;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final f[] f102353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final d f102354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final d f102355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f102356d;

    public a(f... fVarArr) {
        this(fVarArr, d.SOLID_MATCH, d.WEAK_MATCH, 64);
    }

    private b a(c.a aVar) throws IOException {
        f fVar = null;
        d dVar = null;
        for (f fVar2 : this.f102353a) {
            aVar.reset();
            d dVarR0 = fVar2.r0(aVar);
            if (dVarR0 != null && dVarR0.ordinal() >= this.f102355c.ordinal() && (fVar == null || dVar.ordinal() < dVarR0.ordinal())) {
                if (dVarR0.ordinal() >= this.f102354b.ordinal()) {
                    fVar = fVar2;
                    dVar = dVarR0;
                    break;
                }
                fVar = fVar2;
                dVar = dVarR0;
            }
        }
        return aVar.b(fVar, dVar);
    }

    public b b(InputStream inputStream) throws IOException {
        return a(new c.a(inputStream, new byte[this.f102356d]));
    }

    public b c(byte[] bArr) throws IOException {
        return a(new c.a(bArr));
    }

    public b d(byte[] bArr, int i10, int i11) throws IOException {
        return a(new c.a(bArr, i10, i11));
    }

    public a e(int i10) {
        return i10 == this.f102356d ? this : new a(this.f102353a, this.f102354b, this.f102355c, i10);
    }

    public a f(d dVar) {
        return dVar == this.f102355c ? this : new a(this.f102353a, this.f102354b, dVar, this.f102356d);
    }

    public a g(d dVar) {
        return dVar == this.f102354b ? this : new a(this.f102353a, dVar, this.f102355c, this.f102356d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        f[] fVarArr = this.f102353a;
        int length = fVarArr.length;
        if (length > 0) {
            sb2.append(fVarArr[0].l0());
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(this.f102353a[i10].l0());
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public a(Collection<f> collection) {
        this((f[]) collection.toArray(new f[collection.size()]));
    }

    private a(f[] fVarArr, d dVar, d dVar2, int i10) {
        this.f102353a = fVarArr;
        this.f102354b = dVar;
        this.f102355c = dVar2;
        this.f102356d = i10;
    }
}
