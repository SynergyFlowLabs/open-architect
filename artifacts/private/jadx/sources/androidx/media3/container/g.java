package androidx.media3.container;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f62210a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f62211b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f62212c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f62213d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f62214e = 15;

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f62215b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f62216c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f62217d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f62218e = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f62219a;

        private b(e eVar, d dVar) throws c {
            int i10 = dVar.f62220a;
            androidx.media3.common.util.a.a(i10 == 6 || i10 == 3);
            byte[] bArr = new byte[Math.min(4, dVar.f62221b.remaining())];
            dVar.f62221b.asReadOnlyBuffer().get(bArr);
            n0 n0Var = new n0(bArr);
            g.f(eVar.f62222a);
            if (n0Var.g()) {
                this.f62219a = false;
                return;
            }
            int iH = n0Var.h(2);
            boolean zG = n0Var.g();
            g.f(eVar.f62223b);
            if (!zG) {
                this.f62219a = true;
                return;
            }
            boolean zG2 = (iH == 3 || iH == 0) ? true : n0Var.g();
            n0Var.r();
            g.f(!eVar.f62225d);
            if (n0Var.g()) {
                g.f(!eVar.f62226e);
                n0Var.r();
            }
            g.f(eVar.f62224c);
            if (iH != 3) {
                n0Var.r();
            }
            n0Var.s(eVar.f62227f);
            if (iH != 2 && iH != 0 && !zG2) {
                n0Var.s(3);
            }
            this.f62219a = ((iH == 3 || iH == 0) ? 255 : n0Var.h(8)) != 0;
        }

        @p0
        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.f62219a;
        }
    }

    private static class c extends Exception {
        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f62221b;

        private d(int i10, ByteBuffer byteBuffer) {
            this.f62220a = i10;
            this.f62221b = byteBuffer;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f62222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f62223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f62224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f62225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f62226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f62227f;

        private e(d dVar) throws c {
            androidx.media3.common.util.a.a(dVar.f62220a == 1);
            byte[] bArr = new byte[dVar.f62221b.remaining()];
            dVar.f62221b.asReadOnlyBuffer().get(bArr);
            n0 n0Var = new n0(bArr);
            int i10 = 3 & 4;
            n0Var.s(4);
            boolean zG = n0Var.g();
            this.f62222a = zG;
            g.f(zG);
            if (n0Var.g()) {
                b(n0Var);
                boolean zG2 = n0Var.g();
                this.f62223b = zG2;
                if (zG2) {
                    n0Var.s(47);
                }
            } else {
                this.f62223b = false;
            }
            boolean zG3 = n0Var.g();
            int iH = n0Var.h(5);
            for (int i11 = 0; i11 <= iH; i11++) {
                n0Var.s(12);
                if (n0Var.h(5) > 7) {
                    n0Var.r();
                }
                g.f(this.f62223b);
                if (zG3 && n0Var.g()) {
                    n0Var.s(4);
                }
            }
            int iH2 = n0Var.h(4);
            int iH3 = n0Var.h(4);
            n0Var.s(iH2 + 1);
            n0Var.s(iH3 + 1);
            boolean zG4 = n0Var.g();
            this.f62224c = zG4;
            g.f(zG4);
            n0Var.s(3);
            n0Var.s(4);
            boolean zG5 = n0Var.g();
            if (zG5) {
                n0Var.s(2);
            }
            if (n0Var.g()) {
                this.f62225d = true;
            } else {
                this.f62225d = n0Var.g();
            }
            if (!this.f62225d || n0Var.g()) {
                this.f62226e = true;
            } else {
                this.f62226e = n0Var.g();
            }
            if (zG5) {
                this.f62227f = n0Var.h(3) + 1;
            } else {
                this.f62227f = 0;
            }
        }

        @p0
        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        private static void b(n0 n0Var) {
            n0Var.s(64);
            if (n0Var.g()) {
                g.d(n0Var);
            }
        }
    }

    private g() {
    }

    private static int c(ByteBuffer byteBuffer) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            byte b10 = byteBuffer.get();
            i10 |= (b10 & 127) << (i11 * 7);
            if ((b10 & 128) == 0) {
                return i10;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(n0 n0Var) {
        int i10 = 0;
        while (!n0Var.g()) {
            i10++;
        }
        if (i10 < 32) {
            n0Var.s(i10);
        }
    }

    public static List<d> e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b10 = byteBufferAsReadOnlyBuffer.get();
            int i10 = (b10 >> 3) & 15;
            if (((b10 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            int iC = ((b10 >> 1) & 1) != 0 ? c(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iC);
            arrayList.add(new d(i10, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iC);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(boolean z10) throws c {
        if (z10) {
            throw new c();
        }
    }
}
