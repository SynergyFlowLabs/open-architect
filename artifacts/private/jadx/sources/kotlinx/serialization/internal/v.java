package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
@c3
final class v<T> extends ClassValue<p1<T>> {

    public static final class a implements Function0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<T> f316031a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends T> function0) {
            this.f316031a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return this.f316031a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ClassValue
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p1<T> computeValue(@NotNull Class<?> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new p1<>();
    }

    public final T b(@NotNull Class<?> key, @NotNull Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object obj = get(key);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        p1 p1Var = (p1) obj;
        T t10 = p1Var.f315993a.get();
        return t10 != null ? t10 : (T) p1Var.a(new a(factory));
    }

    public final boolean c(@NotNull Class<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((p1) get(key)).f315993a.get() != null;
    }
}
