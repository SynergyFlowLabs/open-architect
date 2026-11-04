package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface m extends e3 {

    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function1<Throwable, Unit> f315171a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super Throwable, Unit> function1) {
            this.f315171a = function1;
        }

        @Override // kotlinx.coroutines.m
        public void e(@Nullable Throwable th2) {
            this.f315171a.invoke(th2);
        }

        @NotNull
        public String toString() {
            return "CancelHandler.UserSupplied[" + x0.a(this.f315171a) + '@' + x0.b(this) + AbstractJsonLexerKt.END_LIST;
        }
    }

    void e(@Nullable Throwable th2);
}
