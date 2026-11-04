package com.google.accompanist.placeholder;

import androidx.compose.animation.core.f2;
import androidx.compose.animation.core.g1;
import androidx.compose.animation.core.p;
import androidx.compose.runtime.internal.w0;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import kotlin.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@l(message = "\naccompanist/placeholder is deprecated and the API is no longer maintained. \nWe recommend forking the implementation and customising it to your needs. \nFor more information please visit https://google.github.io/accompanist/placeholder\n")
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f103137a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final f0 f103138b = g0.c(a.f103141a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final f0 f103139c = g0.c(C0935b.f103142a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f103140d = 8;

    static final class a extends l0 implements Function0<g1<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f103141a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final g1<Float> invoke() {
            return p.g(p.t(600, 200, null, 4, null), f2.Reverse, 0L, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.placeholder.b$b, reason: collision with other inner class name */
    static final class C0935b extends l0 implements Function0<g1<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0935b f103142a = new C0935b();

        C0935b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final g1<Float> invoke() {
            return p.g(p.t(1700, 200, null, 4, null), f2.Restart, 0L, 4, null);
        }
    }

    private b() {
    }

    @NotNull
    public final g1<Float> a() {
        return (g1) f103138b.getValue();
    }

    @NotNull
    public final g1<Float> b() {
        return (g1) f103139c.getValue();
    }
}
