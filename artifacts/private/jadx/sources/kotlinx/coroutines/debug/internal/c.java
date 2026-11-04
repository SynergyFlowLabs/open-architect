package kotlinx.coroutines.debug.internal;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.misc.Signal;
import sun.misc.SignalHandler;

/* JADX INFO: loaded from: classes11.dex */
@e.a({"all"})
@zl.a
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f313927a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f313928b;

    public static final class a implements ClassFileTransformer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f313929a = new a();

        private a() {
        }

        @Nullable
        public byte[] a(@Nullable ClassLoader classLoader, @NotNull String str, @Nullable Class<?> cls, @NotNull ProtectionDomain protectionDomain, @Nullable byte[] bArr) {
            if (classLoader == null || !Intrinsics.areEqual(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            kotlinx.coroutines.debug.internal.a.f313925a.b(true);
            return kotlin.io.b.p(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object objM785constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            objM785constructorimpl = Result.m785constructorimpl(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        Boolean bool = (Boolean) (Result.m786isFailureimpl(objM785constructorimpl) ? null : objM785constructorimpl);
        f313928b = bool != null ? bool.booleanValue() : m.f313979a.w();
    }

    private c() {
    }

    private final void b() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: kotlinx.coroutines.debug.internal.b
                public final void a(Signal signal) {
                    c.c(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Signal signal) {
        m mVar = m.f313979a;
        if (mVar.E()) {
            mVar.g(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @oj.n
    public static final void d(@Nullable String str, @NotNull Instrumentation instrumentation) {
        kotlinx.coroutines.debug.internal.a.f313925a.b(true);
        instrumentation.addTransformer(a.f313929a);
        m mVar = m.f313979a;
        mVar.P(f313928b);
        mVar.C();
        f313927a.b();
    }
}
