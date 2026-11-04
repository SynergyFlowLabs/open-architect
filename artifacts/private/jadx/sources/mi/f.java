package mi;

import java.util.List;
import kotlin.a1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements mi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<?> f332669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Function1<List<String>, Object> f332670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function1<Object, List<String>> f332671c;

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlin.reflect.d<T> f332672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private Function1<? super List<String>, ? extends T> f332673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Function1<? super T, ? extends List<String>> f332674c;

        @a1
        public a(@NotNull kotlin.reflect.d<T> klass) {
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.f332672a = klass;
        }

        public final void a(@NotNull Function1<? super List<String>, ? extends T> converter) {
            Intrinsics.checkNotNullParameter(converter, "converter");
            if (this.f332673b == null) {
                this.f332673b = converter;
                return;
            }
            throw new IllegalStateException("Decoder has already been set for type '" + this.f332672a + '\'');
        }

        public final void b(@NotNull Function1<? super T, ? extends List<String>> converter) {
            Intrinsics.checkNotNullParameter(converter, "converter");
            if (this.f332674c == null) {
                this.f332674c = converter;
                return;
            }
            throw new IllegalStateException("Encoder has already been set for type '" + this.f332672a + '\'');
        }

        @Nullable
        public final Function1<List<String>, T> c() {
            return this.f332673b;
        }

        @Nullable
        public final Function1<T, List<String>> d() {
            return this.f332674c;
        }

        @NotNull
        public final kotlin.reflect.d<T> e() {
            return this.f332672a;
        }

        public final void f(@Nullable Function1<? super List<String>, ? extends T> function1) {
            this.f332673b = function1;
        }

        public final void g(@Nullable Function1<? super T, ? extends List<String>> function1) {
            this.f332674c = function1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull kotlin.reflect.d<?> klass, @Nullable Function1<? super List<String>, ? extends Object> function1, @Nullable Function1<Object, ? extends List<String>> function2) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f332669a = klass;
        this.f332670b = function1;
        this.f332671c = function2;
    }

    @Override // mi.a
    @NotNull
    public List<String> a(@Nullable Object obj) {
        Function1<Object, List<String>> function1 = this.f332671c;
        if (function1 != null) {
            return function1.invoke(obj);
        }
        throw new IllegalStateException("Encoder was not specified for type '" + this.f332669a + '\'');
    }

    @Override // mi.a
    @Nullable
    public Object b(@NotNull List<String> values, @NotNull ri.b type) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(type, "type");
        Function1<List<String>, Object> function1 = this.f332670b;
        if (function1 != null) {
            return function1.invoke(values);
        }
        throw new IllegalStateException("Decoder was not specified for type '" + this.f332669a + '\'');
    }
}
