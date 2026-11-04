package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@zl.a
final class c extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f315039a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f315040b = new a();

    public static final class a extends ClassValue<Function1<? super Throwable, ? extends Throwable>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ClassValue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Function1<Throwable, Throwable> computeValue(Class<?> cls) {
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            return u.g(cls);
        }
    }

    private c() {
    }

    @Override // kotlinx.coroutines.internal.k
    @NotNull
    public Function1<Throwable, Throwable> a(@NotNull Class<? extends Throwable> cls) {
        return (Function1) f315040b.get(cls);
    }
}
