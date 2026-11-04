package androidx.media3.exoplayer;

import android.content.Context;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class o implements b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z4[] f64335a;

    @Override // androidx.media3.exoplayer.b5
    public a5[] a() {
        a5[] a5VarArr = new a5[this.f64335a.length];
        int i10 = 0;
        while (true) {
            z4[] z4VarArr = this.f64335a;
            if (i10 >= z4VarArr.length) {
                return a5VarArr;
            }
            a5VarArr[i10] = z4VarArr[i10].p();
            i10++;
        }
    }

    @Override // androidx.media3.exoplayer.b5
    public void release() {
        for (z4 z4Var : this.f64335a) {
            z4Var.release();
        }
    }

    @Override // androidx.media3.exoplayer.b5
    public int size() {
        return this.f64335a.length;
    }

    public static final class b implements b5.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e5 f64336a;

        class a implements androidx.media3.exoplayer.video.l0 {
            a() {
            }
        }

        /* JADX INFO: renamed from: androidx.media3.exoplayer.o$b$b, reason: collision with other inner class name */
        class C0584b implements androidx.media3.exoplayer.audio.w {
            C0584b() {
            }
        }

        public b(Context context) {
            this.f64336a = new r(context);
        }

        public static /* synthetic */ void b(androidx.media3.common.r0 r0Var) {
        }

        public static /* synthetic */ void c(androidx.media3.common.text.d dVar) {
        }

        @Override // androidx.media3.exoplayer.b5.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public o a() {
            return new o(this.f64336a.b(androidx.media3.common.util.k1.J(), new a(), new C0584b(), new androidx.media3.exoplayer.text.h() { // from class: androidx.media3.exoplayer.p
                @Override // androidx.media3.exoplayer.text.h
                public final void E(androidx.media3.common.text.d dVar) {
                    o.b.c(dVar);
                }
            }, new androidx.media3.exoplayer.metadata.b() { // from class: androidx.media3.exoplayer.q
                @Override // androidx.media3.exoplayer.metadata.b
                public final void F(androidx.media3.common.r0 r0Var) {
                    o.b.b(r0Var);
                }
            }));
        }

        public b(e5 e5Var) {
            this.f64336a = e5Var;
        }
    }

    private o(z4[] z4VarArr) {
        this.f64335a = (z4[]) Arrays.copyOf(z4VarArr, z4VarArr.length);
        for (int i10 = 0; i10 < z4VarArr.length; i10++) {
            this.f64335a[i10].J(i10, androidx.media3.exoplayer.analytics.j4.f63008d, androidx.media3.common.util.j.f61520a);
        }
    }
}
