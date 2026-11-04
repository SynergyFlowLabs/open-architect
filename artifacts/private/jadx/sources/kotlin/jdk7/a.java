package kotlin.jdk7;

import androidx.documentfile.provider.b;
import kotlin.Unit;
import kotlin.a1;
import kotlin.e1;
import kotlin.internal.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.p;
import oj.i;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@i(name = "AutoCloseableKt")
public final class a {

    /* JADX INFO: renamed from: kotlin.jdk7.a$a, reason: collision with other inner class name */
    public static final class C2258a implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f312718a;

        public C2258a(Function0<Unit> function0) {
            this.f312718a = function0;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.f312718a.invoke();
        }
    }

    @e1(version = "2.0")
    @f
    private static final AutoCloseable a(Function0<Unit> closeAction) {
        Intrinsics.checkNotNullParameter(closeAction, "closeAction");
        return new C2258a(closeAction);
    }

    @e1(version = "2.0")
    public static /* synthetic */ void b() {
    }

    @a1
    @e1(version = "1.2")
    public static final void c(@Nullable AutoCloseable autoCloseable, @Nullable Throwable th2) throws Exception {
        if (autoCloseable != null) {
            if (th2 == null) {
                b.a(autoCloseable);
                return;
            }
            try {
                b.a(autoCloseable);
            } catch (Throwable th3) {
                p.a(th2, th3);
            }
        }
    }

    @e1(version = "1.2")
    @f
    private static final <T extends AutoCloseable, R> R d(T t10, Function1<? super T, ? extends R> block) throws Exception {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R rInvoke = block.invoke(t10);
            h0.d(1);
            c(t10, null);
            h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                c(t10, th2);
                h0.c(1);
                throw th3;
            }
        }
    }
}
