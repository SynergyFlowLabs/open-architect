package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.unit.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f38204a = a.f38205a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f38205a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final f f38206b = C0290a.f38207c;

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.shadow.f$a$a, reason: collision with other inner class name */
        static final class C0290a implements f {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0290a f38207c = new C0290a();

            C0290a() {
            }

            @Override // androidx.compose.ui.graphics.shadow.f
            public final e d(q3 q3Var, long j10, w wVar, androidx.compose.ui.unit.d dVar, j jVar) {
                return new e(jVar, q3Var.mo0createOutlinePq9zytI(j10, wVar, dVar));
            }
        }

        private a() {
        }

        @NotNull
        public final f a() {
            return f38206b;
        }
    }

    @NotNull
    e d(@NotNull q3 q3Var, long j10, @NotNull w wVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull j jVar);
}
