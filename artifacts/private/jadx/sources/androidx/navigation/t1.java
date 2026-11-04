package androidx.navigation;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@s1
@SourceDebugExtension({"SMAP\nNavDeepLinkDslBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkDslBuilder.kt\nandroidx/navigation/NavDeepLinkDslBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o1.a f71306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private kotlin.reflect.d<?> f71307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Map<kotlin.reflect.s, ? extends d3<?>> f71308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f71309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f71310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f71311f;

    public t1() {
        this.f71306a = new o1.a();
        this.f71308c = MapsKt.emptyMap();
    }

    @NotNull
    public final o1 a() {
        o1.a aVar = this.f71306a;
        String str = this.f71309d;
        if (str == null && this.f71310e == null && this.f71311f == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.");
        }
        if (str != null) {
            aVar.g(str);
        }
        String str2 = this.f71310e;
        if (str2 != null) {
            aVar.e(str2);
        }
        String str3 = this.f71311f;
        if (str3 != null) {
            aVar.f(str3);
        }
        return aVar.a();
    }

    @Nullable
    public final String b() {
        return this.f71310e;
    }

    @Nullable
    public final String c() {
        return this.f71311f;
    }

    @Nullable
    public final String d() {
        return this.f71309d;
    }

    public final void e(@Nullable String str) {
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.f71310e = str;
    }

    public final void f(@Nullable String str) {
        this.f71311f = str;
    }

    public final void g(@Nullable String str) {
        this.f71309d = str;
    }

    public t1(@NotNull String basePath, @NotNull kotlin.reflect.d<?> route, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap) {
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.f71306a = new o1.a();
        this.f71308c = MapsKt.emptyMap();
        if (basePath.length() > 0) {
            this.f71309d = androidx.navigation.serialization.p.p(kotlinx.serialization.m0.i(route), typeMap, basePath);
            this.f71307b = route;
            this.f71308c = typeMap;
            return;
        }
        throw new IllegalArgumentException("The basePath for NavDeepLink from KClass cannot be empty");
    }
}
