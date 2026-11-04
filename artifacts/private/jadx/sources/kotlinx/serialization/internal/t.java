package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n84#2,3:220\n89#2:224\n1#3:223\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n52#1:220,3\n52#1:224\n52#1:223\n*E\n"})
final class t<T> implements w2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.reflect.d<?>, KSerializer<T>> f316010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v<m<T>> f316011b;

    @SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n1#1,89:1\n52#2:90\n*E\n"})
    public static final class a implements Function0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.d f316013b;

        public a(kotlin.reflect.d dVar) {
            this.f316013b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new m(t.this.d().invoke(this.f316013b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@NotNull Function1<? super kotlin.reflect.d<?>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f316010a = compute;
        this.f316011b = new v<>();
    }

    @Override // kotlinx.serialization.internal.w2
    @Nullable
    public KSerializer<T> a(@NotNull kotlin.reflect.d<Object> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f316011b.get(oj.b.e(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        p1 p1Var = (p1) obj;
        T t10 = p1Var.f315993a.get();
        if (t10 == null) {
            t10 = (T) p1Var.a(new a(key));
        }
        return t10.f315968a;
    }

    @Override // kotlinx.serialization.internal.w2
    public boolean b(@NotNull kotlin.reflect.d<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f316011b.c(oj.b.e(key));
    }

    @NotNull
    public final Function1<kotlin.reflect.d<?>, KSerializer<T>> d() {
        return this.f316010a;
    }
}
