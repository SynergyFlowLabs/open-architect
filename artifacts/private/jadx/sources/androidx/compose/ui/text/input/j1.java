package androidx.compose.ui.text.input;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@o2
public interface j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f41895a = a.f41896a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f41896a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final j1 f41897b = new j1() { // from class: androidx.compose.ui.text.input.i1
            @Override // androidx.compose.ui.text.input.j1
            public final h1 a(androidx.compose.ui.text.f fVar) {
                return j1.a.b(fVar);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h1 b(androidx.compose.ui.text.f fVar) {
            return new h1(fVar, m0.f41903a.a());
        }

        @k7
        public static /* synthetic */ void d() {
        }

        @NotNull
        public final j1 c() {
            return f41897b;
        }
    }

    @NotNull
    h1 a(@NotNull androidx.compose.ui.text.f fVar);
}
