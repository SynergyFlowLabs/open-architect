package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o;
import androidx.media3.common.util.o0;
import androidx.media3.extractor.text.r;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f68856b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f68857c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f68858d = 1885436268;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f68859e = 1937011815;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f68860f = 1987343459;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f68861a = new o0();

    private static androidx.media3.common.text.a e(o0 o0Var, int i10) {
        CharSequence charSequenceR = null;
        androidx.media3.common.text.a.c cVarP = null;
        while (i10 > 0) {
            androidx.media3.common.util.a.b(i10 >= 8, "Incomplete vtt cue box header found.");
            int iS = o0Var.s();
            int iS2 = o0Var.s();
            int i11 = iS - 8;
            String strU = k1.U(o0Var.e(), o0Var.f(), i11);
            o0Var.b0(i11);
            i10 = (i10 - 8) - i11;
            if (iS2 == f68859e) {
                cVarP = e.p(strU);
            } else if (iS2 == f68858d) {
                charSequenceR = e.r(null, strU.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceR == null) {
            charSequenceR = "";
        }
        return cVarP != null ? cVarP.A(charSequenceR).a() : e.m(charSequenceR);
    }

    @Override // androidx.media3.extractor.text.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, o<androidx.media3.extractor.text.d> oVar) {
        this.f68861a.Y(bArr, i11 + i10);
        this.f68861a.a0(i10);
        ArrayList arrayList = new ArrayList();
        while (this.f68861a.a() > 0) {
            androidx.media3.common.util.a.b(this.f68861a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iS = this.f68861a.s();
            if (this.f68861a.s() == f68860f) {
                arrayList.add(e(this.f68861a, iS - 8));
            } else {
                this.f68861a.b0(iS - 8);
            }
        }
        oVar.accept(new androidx.media3.extractor.text.d(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // androidx.media3.extractor.text.r
    public int b() {
        return 2;
    }
}
