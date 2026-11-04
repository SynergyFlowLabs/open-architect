package ih;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface e {

    public static final class a {
        public static /* synthetic */ void a(e eVar, String str, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            eVar.a(str, str2);
        }

        public static /* synthetic */ void b(e eVar, String str, String str2, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                th2 = null;
            }
            eVar.c(str, str2, th2);
        }

        public static /* synthetic */ void c(e eVar, String str, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            eVar.f(str, str2);
        }
    }

    void a(@NotNull String str, @Nullable String str2);

    @NotNull
    ih.a b();

    void c(@NotNull String str, @Nullable String str2, @Nullable Throwable th2);

    void d(@NotNull ih.a aVar);

    void e(@Nullable Function2<? super ih.a, ? super String, Unit> function2);

    void f(@NotNull String str, @Nullable String str2);
}
