package io.ktor.client.plugins;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@io.ktor.utils.io.r0
@SourceDebugExtension({"SMAP\nHttpPlainText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainTextConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Charset f294444c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<Charset> f294442a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<Charset, Float> f294443b = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Charset f294445d = Charsets.UTF_8;

    public static /* synthetic */ void f(b0 b0Var, Charset charset, Float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = null;
        }
        b0Var.e(charset, f10);
    }

    @NotNull
    public final Map<Charset, Float> a() {
        return this.f294443b;
    }

    @NotNull
    public final Set<Charset> b() {
        return this.f294442a;
    }

    @NotNull
    public final Charset c() {
        return this.f294445d;
    }

    @Nullable
    public final Charset d() {
        return this.f294444c;
    }

    public final void e(@NotNull Charset charset, @Nullable Float f10) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (f10 != null) {
            double dFloatValue = f10.floatValue();
            if (0.0d > dFloatValue || dFloatValue > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.f294442a.add(charset);
        if (f10 == null) {
            this.f294443b.remove(charset);
        } else {
            this.f294443b.put(charset, f10);
        }
    }

    public final void g(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<set-?>");
        this.f294445d = charset;
    }

    public final void h(@Nullable Charset charset) {
        this.f294444c = charset;
    }
}
