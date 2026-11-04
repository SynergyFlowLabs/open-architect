package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.unit.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38213b = a.f38214a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f38214a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final h f38215b = C0291a.f38216c;

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.shadow.h$a$a, reason: collision with other inner class name */
        static final class C0291a implements h {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0291a f38216c = new C0291a();

            C0291a() {
            }

            @Override // androidx.compose.ui.graphics.shadow.h
            public final g b(q3 q3Var, long j10, w wVar, androidx.compose.ui.unit.d dVar, j jVar) {
                return new g(jVar, q3Var.mo0createOutlinePq9zytI(j10, wVar, dVar));
            }
        }

        private a() {
        }

        @NotNull
        public final h a() {
            return f38215b;
        }
    }

    @NotNull
    g b(@NotNull q3 q3Var, long j10, @NotNull w wVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull j jVar);
}
