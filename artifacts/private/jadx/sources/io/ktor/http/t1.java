package io.ktor.http;

import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class t1 extends t0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f296105a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f296106b = "rel";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f296107c = "anchor";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f296108d = "Rev";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f296109e = "hreflang";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f296110f = "media";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f296111g = "title";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f296112h = "type";

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f296113a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f296114b = "stylesheet";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f296115c = "prefetch";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f296116d = "dns-prefetch";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f296117e = "preconnect";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f296118f = "preload";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f296119g = "prerender";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f296120h = "next";

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(@NotNull String uri, @NotNull List<s0> params) {
        super(kotlin.text.b0.f313280e + uri + kotlin.text.b0.f313281f, params);
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    @NotNull
    public final String d() {
        return StringsKt.j4(StringsKt.d4(a(), "<"), ">");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(@NotNull String uri, @NotNull String rel) {
        this(uri, (List<s0>) CollectionsKt.listOf(new s0(a.f296106b, rel)));
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(rel, "rel");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(@NotNull String uri, @NotNull String... rel) {
        this(uri, (List<s0>) CollectionsKt.listOf(new s0(a.f296106b, ArraysKt.joinToString$default(rel, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null))));
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(rel, "rel");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(@NotNull String uri, @NotNull List<String> rel, @NotNull m type) {
        this(uri, (List<s0>) CollectionsKt.listOf((Object[]) new s0[]{new s0(a.f296106b, CollectionsKt.joinToString$default(rel, " ", null, null, 0, null, null, 62, null)), new s0("type", type.toString())}));
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(rel, "rel");
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
