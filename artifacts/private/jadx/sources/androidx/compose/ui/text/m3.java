package androidx.compose.ui.text;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f41991a = a.f41992a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f41992a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final m3 f41993b = new m3() { // from class: androidx.compose.ui.text.j3
            @Override // androidx.compose.ui.text.m3
            public final boolean a(n0.j jVar, n0.j jVar2) {
                return m3.a.d(jVar, jVar2);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final m3 f41994c = new m3() { // from class: androidx.compose.ui.text.k3
            @Override // androidx.compose.ui.text.m3
            public final boolean a(n0.j jVar, n0.j jVar2) {
                return m3.a.e(jVar, jVar2);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final m3 f41995d = new m3() { // from class: androidx.compose.ui.text.l3
            @Override // androidx.compose.ui.text.m3
            public final boolean a(n0.j jVar, n0.j jVar2) {
                return m3.a.f(jVar, jVar2);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(n0.j jVar, n0.j jVar2) {
            return jVar.R(jVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(n0.j jVar, n0.j jVar2) {
            return !jVar2.L() && jVar.t() >= jVar2.t() && jVar.x() <= jVar2.x() && jVar.B() >= jVar2.B() && jVar.j() <= jVar2.j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(n0.j jVar, n0.j jVar2) {
            return jVar2.f(jVar.o());
        }

        @NotNull
        public final m3 g() {
            return f41993b;
        }

        @NotNull
        public final m3 h() {
            return f41994c;
        }

        @NotNull
        public final m3 i() {
            return f41995d;
        }
    }

    boolean a(@NotNull n0.j jVar, @NotNull n0.j jVar2);
}
