package androidx.media3.extractor.mp4;

import androidx.media3.common.r0;
import androidx.media3.common.v0;
import androidx.media3.extractor.n0;
import com.google.common.base.o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f68073d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f68074e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f68075f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f68076g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f68077h = 2192;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f68078i = 2816;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f68079j = 2817;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f68080k = 2819;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f68081l = 2820;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f68082m = "SefReader";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f68083n = 1397048916;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f68084o = 12;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f68085p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f68086q = 12;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final o0 f68087r = o0.h(AbstractJsonLexerKt.COLON);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final o0 f68088s = o0.h('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f68089a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f68090b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f68091c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f68093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f68094c;

        public a(int i10, long j10, int i11) {
            this.f68092a = i10;
            this.f68093b = j10;
            this.f68094c = i11;
        }
    }

    private void a(androidx.media3.extractor.s sVar, n0 n0Var) throws IOException {
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(8);
        sVar.readFully(o0Var.e(), 0, 8);
        this.f68091c = o0Var.w() + 8;
        if (o0Var.s() != f68083n) {
            n0Var.f68159a = 0L;
        } else {
            n0Var.f68159a = sVar.getPosition() - ((long) (this.f68091c - 12));
            this.f68090b = 2;
        }
    }

    private static int b(String str) throws v0 {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return f68077h;
            case "Super_SlowMotion_Edit_Data":
                return f68080k;
            case "Super_SlowMotion_Data":
                return f68078i;
            case "Super_SlowMotion_Deflickering_On":
                return f68081l;
            case "Super_SlowMotion_BGM":
                return f68079j;
            default:
                throw v0.a("Invalid SEF name", null);
        }
    }

    private void d(androidx.media3.extractor.s sVar, n0 n0Var) throws IOException {
        long length = sVar.getLength();
        int i10 = this.f68091c - 20;
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(i10);
        sVar.readFully(o0Var.e(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            o0Var.b0(2);
            short sZ = o0Var.z();
            if (sZ == f68077h || sZ == f68078i || sZ == f68079j || sZ == f68080k || sZ == f68081l) {
                this.f68089a.add(new a(sZ, (length - ((long) this.f68091c)) - ((long) o0Var.w()), o0Var.w()));
            } else {
                o0Var.b0(8);
            }
        }
        if (this.f68089a.isEmpty()) {
            n0Var.f68159a = 0L;
        } else {
            this.f68090b = 3;
            n0Var.f68159a = this.f68089a.get(0).f68093b;
        }
    }

    private void e(androidx.media3.extractor.s sVar, List<r0.a> list) throws IOException {
        long position = sVar.getPosition();
        int length = (int) ((sVar.getLength() - sVar.getPosition()) - ((long) this.f68091c));
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(length);
        sVar.readFully(o0Var.e(), 0, length);
        for (int i10 = 0; i10 < this.f68089a.size(); i10++) {
            a aVar = this.f68089a.get(i10);
            o0Var.a0((int) (aVar.f68093b - position));
            o0Var.b0(4);
            int iW = o0Var.w();
            int iB = b(o0Var.I(iW));
            int i11 = aVar.f68094c - (iW + 8);
            if (iB == f68077h) {
                list.add(f(o0Var, i11));
            } else if (iB != f68078i && iB != f68079j && iB != f68080k && iB != f68081l) {
                throw new IllegalStateException();
            }
        }
    }

    private static androidx.media3.extractor.metadata.mp4.c f(androidx.media3.common.util.o0 o0Var, int i10) throws v0 {
        ArrayList arrayList = new ArrayList();
        List<String> listO = f68088s.o(o0Var.I(i10));
        for (int i11 = 0; i11 < listO.size(); i11++) {
            List<String> listO2 = f68087r.o(listO.get(i11));
            if (listO2.size() != 3) {
                throw v0.a(null, null);
            }
            try {
                arrayList.add(new androidx.media3.extractor.metadata.mp4.c.a(Long.parseLong(listO2.get(0)), Long.parseLong(listO2.get(1)), 1 << (Integer.parseInt(listO2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw v0.a(null, e10);
            }
        }
        return new androidx.media3.extractor.metadata.mp4.c(arrayList);
    }

    public int c(androidx.media3.extractor.s sVar, n0 n0Var, List<r0.a> list) throws IOException {
        int i10 = this.f68090b;
        long j10 = 0;
        if (i10 == 0) {
            long length = sVar.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            n0Var.f68159a = j10;
            this.f68090b = 1;
        } else if (i10 == 1) {
            a(sVar, n0Var);
        } else if (i10 == 2) {
            d(sVar, n0Var);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            e(sVar, list);
            n0Var.f68159a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f68089a.clear();
        this.f68090b = 0;
    }
}
