package androidx.compose.foundation.content.internal;

import androidx.compose.runtime.internal.w0;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class b extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14005e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w.f f14006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final w.d f14007d = new a();

    public static final class a implements w.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14008a;

        a() {
        }

        @Override // w.d
        public w.g a(w.g gVar) {
            w.g gVarA = b.this.e().I9().a(gVar);
            if (gVarA == null) {
                return null;
            }
            w.d dVarD = b.this.d();
            return dVarD == null ? gVarA : dVarD.a(gVarA);
        }

        @Override // w.d
        public void b() {
            int i10 = this.f14008a + 1;
            this.f14008a = i10;
            if (i10 == 1) {
                b.this.e().I9().b();
            }
            w.d dVarD = b.this.d();
            if (dVarD != null) {
                dVarD.b();
            }
        }

        @Override // w.d
        public void c() {
            this.f14008a = 0;
            b.this.e().I9().c();
        }

        @Override // w.d
        public void d() {
            b.this.e().I9().d();
            this.f14008a = 0;
        }

        @Override // w.d
        public void e() {
            int i10 = this.f14008a;
            int iU = r.u(i10 - 1, 0);
            this.f14008a = iU;
            if (iU == 0 && i10 > 0) {
                b.this.e().I9().e();
            }
            w.d dVarD = b.this.d();
            if (dVarD != null) {
                dVarD.e();
            }
        }
    }

    public b(@NotNull w.f fVar) {
        this.f14006c = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w.d d() {
        c cVarD = f.d(this.f14006c);
        if (cVarD != null) {
            return cVarD.a();
        }
        return null;
    }

    @Override // androidx.compose.foundation.content.internal.c
    @NotNull
    public w.d a() {
        return this.f14007d;
    }

    @NotNull
    public final w.f e() {
        return this.f14006c;
    }
}
