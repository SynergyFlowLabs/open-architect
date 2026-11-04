package io.ktor.client.request.forms;

import io.ktor.http.v0;
import io.ktor.utils.io.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.io.c0;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nformDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n1869#2,2:282\n*S KotlinDebug\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormBuilder\n*L\n180#1:282,2\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<q<?>> f295278a = new ArrayList();

    public static /* synthetic */ void l(b bVar, String str, a aVar, v0 v0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            v0Var = v0.f296123a.b();
        }
        bVar.b(str, aVar, v0Var);
    }

    public static /* synthetic */ void m(b bVar, String str, r rVar, v0 v0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            v0Var = v0.f296123a.b();
        }
        bVar.c(str, rVar, v0Var);
    }

    public static /* synthetic */ void n(b bVar, String str, Iterable iterable, v0 v0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            v0Var = v0.f296123a.b();
        }
        bVar.d(str, iterable, v0Var);
    }

    public static /* synthetic */ void o(b bVar, String str, Number number, v0 v0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            v0Var = v0.f296123a.b();
        }
        bVar.e(str, number, v0Var);
    }

    public static /* synthetic */ void p(b bVar, String str, Object obj, v0 v0Var, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            v0Var = v0.f296123a.b();
        }
        bVar.f(str, obj, v0Var);
    }

    public static /* synthetic */ void q(b bVar, String str, String str2, v0 v0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            v0Var = v0.f296123a.b();
        }
        bVar.g(str, str2, v0Var);
    }

    public static /* synthetic */ void r(b bVar, String str, c0 c0Var, v0 v0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            v0Var = v0.f296123a.b();
        }
        bVar.h(str, c0Var, v0Var);
    }

    public static /* synthetic */ void s(b bVar, String str, boolean z10, v0 v0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            v0Var = v0.f296123a.b();
        }
        bVar.i(str, z10, v0Var);
    }

    public static /* synthetic */ void t(b bVar, String str, byte[] bArr, v0 v0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            v0Var = v0.f296123a.b();
        }
        bVar.j(str, bArr, v0Var);
    }

    public static /* synthetic */ void u(b bVar, String str, String[] strArr, v0 v0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            v0Var = v0.f296123a.b();
        }
        bVar.k(str, strArr, v0Var);
    }

    public static /* synthetic */ void w(b bVar, String str, v0 v0Var, Long l10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            v0Var = v0.f296123a.b();
        }
        if ((i10 & 4) != 0) {
            l10 = null;
        }
        bVar.v(str, v0Var, l10, function0);
    }

    public final <T> void a(@NotNull q<T> part) {
        Intrinsics.checkNotNullParameter(part, "part");
        this.f295278a.add(part);
    }

    public final void b(@NotNull String key, @NotNull a value, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f295278a.add(new q<>(key, value, headers));
    }

    public final void c(@NotNull String key, @NotNull r value, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f295278a.add(new q<>(key, value, headers));
    }

    public final void d(@NotNull String key, @NotNull Iterable<String> values, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (StringsKt.M1(key, v.f334777p, false, 2, null)) {
            Iterator<String> it = values.iterator();
            while (it.hasNext()) {
                this.f295278a.add(new q<>(key, it.next(), headers));
            }
            return;
        }
        throw new IllegalArgumentException(("Array parameter must be suffixed with square brackets ie `" + key + "[]`").toString());
    }

    public final void e(@NotNull String key, @NotNull Number value, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f295278a.add(new q<>(key, value, headers));
    }

    @o0
    public final <T> void f(@NotNull String key, @NotNull T value, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f295278a.add(new q<>(key, value, headers));
    }

    public final void g(@NotNull String key, @NotNull String value, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f295278a.add(new q<>(key, value, headers));
    }

    public final void h(@NotNull String key, @NotNull c0 value, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f295278a.add(new q<>(key, value, headers));
    }

    public final void i(@NotNull String key, boolean z10, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f295278a.add(new q<>(key, Boolean.valueOf(z10), headers));
    }

    public final void j(@NotNull String key, @NotNull byte[] value, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f295278a.add(new q<>(key, value, headers));
    }

    public final void k(@NotNull String key, @NotNull String[] values, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(headers, "headers");
        d(key, ArraysKt.asIterable(values), headers);
    }

    public final void v(@NotNull String key, @NotNull v0 headers, @Nullable Long l10, @NotNull Function0<? extends c0> block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f295278a.add(new q<>(key, new r(l10, block), headers));
    }

    @NotNull
    public final List<q<?>> x() {
        return this.f295278a;
    }
}
