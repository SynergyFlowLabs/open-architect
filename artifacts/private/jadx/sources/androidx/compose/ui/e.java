package androidx.compose.ui;

import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f37317a = a.f37318a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f37318a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final e f37319b = new h(-1.0f, -1.0f);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final e f37320c = new h(0.0f, -1.0f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final e f37321d = new h(1.0f, -1.0f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final e f37322e = new h(-1.0f, 0.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final e f37323f = new h(0.0f, 0.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final e f37324g = new h(1.0f, 0.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final e f37325h = new h(-1.0f, 1.0f);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private static final e f37326i = new h(0.0f, 1.0f);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private static final e f37327j = new h(1.0f, 1.0f);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private static final c f37328k = new h.b(-1.0f);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private static final c f37329l = new h.b(0.0f);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        private static final c f37330m = new h.b(1.0f);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        private static final b f37331n = new h.a(-1.0f);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        private static final b f37332o = new h.a(0.0f);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        private static final b f37333p = new h.a(1.0f);

        private a() {
        }

        @k7
        public static /* synthetic */ void B() {
        }

        @k7
        public static /* synthetic */ void D() {
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @k7
        public static /* synthetic */ void d() {
        }

        @k7
        public static /* synthetic */ void f() {
        }

        @k7
        public static /* synthetic */ void h() {
        }

        @k7
        public static /* synthetic */ void j() {
        }

        @k7
        public static /* synthetic */ void l() {
        }

        @k7
        public static /* synthetic */ void n() {
        }

        @k7
        public static /* synthetic */ void p() {
        }

        @k7
        public static /* synthetic */ void r() {
        }

        @k7
        public static /* synthetic */ void t() {
        }

        @k7
        public static /* synthetic */ void v() {
        }

        @k7
        public static /* synthetic */ void x() {
        }

        @k7
        public static /* synthetic */ void z() {
        }

        @NotNull
        public final e A() {
            return f37321d;
        }

        @NotNull
        public final e C() {
            return f37319b;
        }

        @NotNull
        public final c a() {
            return f37330m;
        }

        @NotNull
        public final e c() {
            return f37326i;
        }

        @NotNull
        public final e e() {
            return f37327j;
        }

        @NotNull
        public final e g() {
            return f37325h;
        }

        @NotNull
        public final e i() {
            return f37323f;
        }

        @NotNull
        public final e k() {
            return f37324g;
        }

        @NotNull
        public final b m() {
            return f37332o;
        }

        @NotNull
        public final e o() {
            return f37322e;
        }

        @NotNull
        public final c q() {
            return f37329l;
        }

        @NotNull
        public final b s() {
            return f37333p;
        }

        @NotNull
        public final b u() {
            return f37331n;
        }

        @NotNull
        public final c w() {
            return f37328k;
        }

        @NotNull
        public final e y() {
            return f37320c;
        }
    }

    @k7
    public interface b {
        int a(int i10, int i11, @NotNull androidx.compose.ui.unit.w wVar);

        @NotNull
        default e b(@NotNull c cVar) {
            return new i(this, cVar);
        }
    }

    @k7
    public interface c {
        int a(int i10, int i11);

        @NotNull
        default e b(@NotNull b bVar) {
            return new i(bVar, this);
        }
    }

    long a(long j10, long j11, @NotNull androidx.compose.ui.unit.w wVar);
}
