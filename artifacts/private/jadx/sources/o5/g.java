package o5;

import androidx.annotation.b1;
import com.facebook.g0;
import com.facebook.internal.t;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f333570a = new g();

    private g() {
    }

    @n
    public static final void d() {
        g0 g0Var = g0.f99617a;
        if (g0.s()) {
            t tVar = t.f100072a;
            t.a(t.b.CrashReport, new t.a() { // from class: o5.d
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    g.e(z10);
                }
            });
            t.a(t.b.ErrorReport, new t.a() { // from class: o5.e
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    g.f(z10);
                }
            });
            t.a(t.b.AnrReport, new t.a() { // from class: o5.f
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    g.g(z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z10) {
        if (z10) {
            q5.c.f350253b.c();
            t tVar = t.f100072a;
            if (t.g(t.b.CrashShield)) {
                b bVar = b.f333541a;
                b.b();
                com.facebook.internal.instrument.crashshield.b bVar2 = com.facebook.internal.instrument.crashshield.b.f99890a;
                com.facebook.internal.instrument.crashshield.b.b();
            }
            if (t.g(t.b.ThreadCheck)) {
                s5.a aVar = s5.a.f366973a;
                s5.a.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(boolean z10) {
        if (z10) {
            r5.e eVar = r5.e.f359063a;
            r5.e.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z10) {
        if (z10) {
            p5.e eVar = p5.e.f340777a;
            p5.e.c();
        }
    }
}
