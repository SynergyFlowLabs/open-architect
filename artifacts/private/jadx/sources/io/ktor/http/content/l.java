package io.ktor.http.content;

import io.ktor.http.d1;
import io.ktor.http.l1;
import io.ktor.http.v0;
import io.ktor.http.w0;
import io.ktor.util.w1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCompressedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressedContent.kt\nio/ktor/http/content/CompressedReadChannelResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,89:1\n1#2:90\n30#3:91\n*S KotlinDebug\n*F\n+ 1 CompressedContent.kt\nio/ktor/http/content/CompressedReadChannelResponse\n*L\n46#1:91\n*E\n"})
final class l extends w.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w f295732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<io.ktor.utils.io.h> f295733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.z f295734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f295735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f295736f;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull w original, @NotNull Function0<? extends io.ktor.utils.io.h> delegateChannel, @NotNull io.ktor.util.z encoder, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(delegateChannel, "delegateChannel");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f295732b = original;
        this.f295733c = delegateChannel;
        this.f295734d = encoder;
        this.f295735e = coroutineContext;
        this.f295736f = kotlin.g0.b(kotlin.j0.NONE, new Function0() { // from class: io.ktor.http.content.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.p(this.f295722a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v0 p(l lVar) {
        v0.a aVar = v0.f296123a;
        w0 w0Var = new w0(0, 1, null);
        int i10 = 4 ^ 0;
        w1.g(w0Var, lVar.f295732b.c(), false, new Function2() { // from class: io.ktor.http.content.k
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(l.q((String) obj, (String) obj2));
            }
        }, 2, null);
        w0Var.l(d1.f295782a.x(), lVar.f295734d.getName());
        return w0Var.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return !StringsKt.N1(name, d1.f295782a.z(), true);
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public Long a() {
        Long lA = this.f295732b.a();
        if (lA != null) {
            Long lD = this.f295734d.d(lA.longValue());
            if (lD != null && lD.longValue() >= 0) {
                return lD;
            }
        }
        return null;
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public io.ktor.http.m b() {
        return this.f295732b.b();
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public v0 c() {
        return (v0) this.f295736f.getValue();
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public <T> T d(@NotNull io.ktor.util.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.f295732b.d(key);
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public l1 e() {
        return this.f295732b.e();
    }

    @Override // io.ktor.http.content.w
    public <T> void f(@NotNull io.ktor.util.a<T> key, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f295732b.f(key, t10);
    }

    @Override // io.ktor.http.content.w.e
    @NotNull
    public io.ktor.utils.io.h h() {
        return this.f295734d.b(this.f295733c.invoke(), this.f295735e);
    }

    @NotNull
    public final CoroutineContext l() {
        return this.f295735e;
    }

    @NotNull
    public final Function0<io.ktor.utils.io.h> m() {
        return this.f295733c;
    }

    @NotNull
    public final io.ktor.util.z n() {
        return this.f295734d;
    }

    @NotNull
    public final w o() {
        return this.f295732b;
    }
}
