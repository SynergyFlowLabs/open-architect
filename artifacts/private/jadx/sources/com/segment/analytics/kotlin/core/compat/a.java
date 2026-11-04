package com.segment.analytics.kotlin.core.compat;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.o;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    @NotNull
    public static final C1862a Companion = new C1862a(null);

    /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.compat.a$a, reason: collision with other inner class name */
    public static final class C1862a {

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.compat.a$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1863a extends g0 implements Function1<b, Unit> {
            C1863a(Object obj) {
                super(1, obj, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            }

            public final void X(@NotNull b p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                ((Consumer) this.receiver).accept(p10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
                X(bVar);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.compat.a$a$b */
        /* synthetic */ class b extends g0 implements Function1<d, Unit> {
            b(Object obj) {
                super(1, obj, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            }

            public final void X(@NotNull d p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                ((Consumer) this.receiver).accept(p10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
                X(dVar);
                return Unit.f312394a;
            }
        }

        public /* synthetic */ C1862a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final JsonArray a(@NotNull Consumer<? super b> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return b(new C1863a(action));
        }

        @n
        @NotNull
        public final JsonArray b(@NotNull Function1<? super b, Unit> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            b bVar = new b();
            action.invoke(bVar);
            return bVar.m();
        }

        @n
        @NotNull
        public final JsonObject c(@NotNull Consumer<? super d> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return d(new b(action));
        }

        @n
        @NotNull
        public final JsonObject d(@NotNull Function1<? super d, Unit> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            d dVar = new d();
            action.invoke(dVar);
            return dVar.c();
        }

        private C1862a() {
        }
    }

    @c
    @SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\ncom/segment/analytics/kotlin/core/compat/Builders$JsonArrayBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<JsonElement> f266794a = new ArrayList();

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @NotNull
        public final b c(@Nullable Boolean bool) {
            f(JsonElementKt.JsonPrimitive(bool));
            return this;
        }

        @NotNull
        public final b d(@Nullable Number number) {
            f(JsonElementKt.JsonPrimitive(number));
            return this;
        }

        @NotNull
        public final b e(@Nullable String str) {
            f(JsonElementKt.JsonPrimitive(str));
            return this;
        }

        @NotNull
        public final b f(@NotNull JsonElement element) {
            Intrinsics.checkNotNullParameter(element, "element");
            this.f266794a.add(element);
            return this;
        }

        @NotNull
        public final b g(@NotNull Consumer<? super b> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            f(a.Companion.a(action));
            return this;
        }

        @NotNull
        public final b h(@NotNull final Function1<? super b, Unit> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            f(a.Companion.a(new Consumer() { // from class: com.segment.analytics.kotlin.core.compat.b
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    a.b.i(action, obj);
                }
            }));
            return this;
        }

        @NotNull
        public final b j(@NotNull Consumer<? super d> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            f(a.Companion.c(action));
            return this;
        }

        @NotNull
        public final b k(@NotNull final Function1<? super d, Unit> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            f(a.Companion.c(new Consumer() { // from class: com.segment.analytics.kotlin.core.compat.c
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    a.b.l(action, obj);
                }
            }));
            return this;
        }

        @NotNull
        public final JsonArray m() {
            return new JsonArray(this.f266794a);
        }
    }

    @o
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
    }

    @c
    @SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\ncom/segment/analytics/kotlin/core/compat/Builders$JsonObjectBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, JsonElement> f266795a = new LinkedHashMap();

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @NotNull
        public final JsonObject c() {
            return new JsonObject(this.f266795a);
        }

        @NotNull
        public final d d(@NotNull String key, @Nullable Boolean bool) {
            Intrinsics.checkNotNullParameter(key, "key");
            g(key, JsonElementKt.JsonPrimitive(bool));
            return this;
        }

        @NotNull
        public final d e(@NotNull String key, @Nullable Number number) {
            Intrinsics.checkNotNullParameter(key, "key");
            g(key, JsonElementKt.JsonPrimitive(number));
            return this;
        }

        @NotNull
        public final d f(@NotNull String key, @Nullable String str) {
            Intrinsics.checkNotNullParameter(key, "key");
            g(key, JsonElementKt.JsonPrimitive(str));
            return this;
        }

        @NotNull
        public final d g(@NotNull String key, @NotNull JsonElement element) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(element, "element");
            this.f266795a.put(key, element);
            return this;
        }

        @NotNull
        public final d h(@NotNull String key, @NotNull Consumer<? super b> action) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(action, "action");
            g(key, a.Companion.a(action));
            return this;
        }

        @NotNull
        public final d i(@NotNull String key, @NotNull final Function1<? super b, Unit> action) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(action, "action");
            g(key, a.Companion.a(new Consumer() { // from class: com.segment.analytics.kotlin.core.compat.e
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    a.d.j(action, obj);
                }
            }));
            return this;
        }

        @NotNull
        public final d k(@NotNull String key, @NotNull Consumer<? super d> action) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(action, "action");
            g(key, a.Companion.c(action));
            return this;
        }

        @NotNull
        public final d l(@NotNull String key, @NotNull final Function1<? super d, Unit> action) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(action, "action");
            g(key, a.Companion.c(new Consumer() { // from class: com.segment.analytics.kotlin.core.compat.d
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    a.d.m(action, obj);
                }
            }));
            return this;
        }
    }

    static {
        int i10 = 2 ^ 0;
    }

    @n
    @NotNull
    public static final JsonArray a(@NotNull Consumer<? super b> consumer) {
        return Companion.a(consumer);
    }

    @n
    @NotNull
    public static final JsonArray b(@NotNull Function1<? super b, Unit> function1) {
        return Companion.b(function1);
    }

    @n
    @NotNull
    public static final JsonObject c(@NotNull Consumer<? super d> consumer) {
        return Companion.c(consumer);
    }

    @n
    @NotNull
    public static final JsonObject d(@NotNull Function1<? super d, Unit> function1) {
        return Companion.d(function1);
    }
}
