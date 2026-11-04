package androidx.compose.ui.text.font;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f41594a = a.f41595a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f41595a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final g1 f41596b = new C0335a();

        /* JADX INFO: renamed from: androidx.compose.ui.text.font.g1$a$a, reason: collision with other inner class name */
        public static final class C0335a implements g1 {
            C0335a() {
            }
        }

        private a() {
        }

        @NotNull
        public final g1 a() {
            return f41596b;
        }
    }

    @Nullable
    default y a(@Nullable y yVar) {
        return yVar;
    }

    @NotNull
    default v0 b(@NotNull v0 v0Var) {
        return v0Var;
    }

    default int c(int i10) {
        return i10;
    }

    default int d(int i10) {
        return i10;
    }
}
