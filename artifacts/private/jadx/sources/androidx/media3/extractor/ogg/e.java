package androidx.media3.extractor.ogg;

import androidx.media3.common.util.o0;
import androidx.media3.extractor.s;
import androidx.media3.extractor.u;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f68226a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f68227b = new o0(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f68228c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f68229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f68230e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f68229d = 0;
        do {
            int i13 = this.f68229d;
            int i14 = i10 + i13;
            f fVar = this.f68226a;
            if (i14 >= fVar.f68243g) {
                break;
            }
            int[] iArr = fVar.f68246j;
            this.f68229d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f68226a;
    }

    public o0 c() {
        return this.f68227b;
    }

    public boolean d(s sVar) throws IOException {
        int i10;
        androidx.media3.common.util.a.i(sVar != null);
        if (this.f68230e) {
            this.f68230e = false;
            this.f68227b.W(0);
        }
        while (!this.f68230e) {
            if (this.f68228c < 0) {
                if (!this.f68226a.c(sVar) || !this.f68226a.a(sVar, true)) {
                    return false;
                }
                f fVar = this.f68226a;
                int iA = fVar.f68244h;
                if ((fVar.f68238b & 1) == 1 && this.f68227b.g() == 0) {
                    iA += a(0);
                    i10 = this.f68229d;
                } else {
                    i10 = 0;
                }
                if (!u.e(sVar, iA)) {
                    return false;
                }
                this.f68228c = i10;
            }
            int iA2 = a(this.f68228c);
            int i11 = this.f68228c + this.f68229d;
            if (iA2 > 0) {
                o0 o0Var = this.f68227b;
                o0Var.c(o0Var.g() + iA2);
                if (!u.d(sVar, this.f68227b.e(), this.f68227b.g(), iA2)) {
                    return false;
                }
                o0 o0Var2 = this.f68227b;
                o0Var2.Z(o0Var2.g() + iA2);
                this.f68230e = this.f68226a.f68246j[i11 + (-1)] != 255;
            }
            if (i11 == this.f68226a.f68243g) {
                i11 = -1;
            }
            this.f68228c = i11;
        }
        return true;
    }

    public void e() {
        this.f68226a.b();
        this.f68227b.W(0);
        this.f68228c = -1;
        this.f68230e = false;
    }

    public void f() {
        if (this.f68227b.e().length == 65025) {
            return;
        }
        o0 o0Var = this.f68227b;
        o0Var.Y(Arrays.copyOf(o0Var.e(), Math.max(65025, this.f68227b.g())), this.f68227b.g());
    }
}
