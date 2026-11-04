package io.ktor.http;

import com.superwall.sdk.network.Api;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nURLProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLProtocol.kt\nio/ktor/http/URLProtocol\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1069#2,2:93\n1#3:95\n1208#4,2:96\n1236#4,4:98\n*S KotlinDebug\n*F\n+ 1 URLProtocol.kt\nio/ktor/http/URLProtocol\n*L\n21#1:93,2\n66#1:96,2\n66#1:98,4\n*E\n"})
public final class s2 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f296093c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final s2 f296094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final s2 f296095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final s2 f296096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final s2 f296097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final s2 f296098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Map<String, s2> f296099i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f296100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f296101b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final s2 a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            String strE = io.ktor.util.y1.e(name);
            s2 s2Var = s2.f296093c.b().get(strE);
            if (s2Var != null) {
                return s2Var;
            }
            int i10 = 2 << 0;
            return new s2(strE, 0);
        }

        @NotNull
        public final Map<String, s2> b() {
            return s2.f296099i;
        }

        @NotNull
        public final s2 c() {
            return s2.f296094d;
        }

        @NotNull
        public final s2 d() {
            return s2.f296095e;
        }

        @NotNull
        public final s2 e() {
            return s2.f296098h;
        }

        @NotNull
        public final s2 f() {
            return s2.f296096f;
        }

        @NotNull
        public final s2 g() {
            return s2.f296097g;
        }

        private a() {
        }
    }

    static {
        s2 s2Var = new s2("http", 80);
        f296094d = s2Var;
        s2 s2Var2 = new s2(Api.scheme, 443);
        f296095e = s2Var2;
        s2 s2Var3 = new s2("ws", 80);
        f296096f = s2Var3;
        s2 s2Var4 = new s2("wss", 443);
        f296097g = s2Var4;
        s2 s2Var5 = new s2("socks", 1080);
        f296098h = s2Var5;
        List listListOf = CollectionsKt.listOf((Object[]) new s2[]{s2Var, s2Var2, s2Var3, s2Var4, s2Var5});
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listListOf, 10)), 16));
        for (Object obj : listListOf) {
            linkedHashMap.put(((s2) obj).f296100a, obj);
        }
        f296099i = linkedHashMap;
    }

    public s2(@NotNull String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f296100a = name;
        this.f296101b = i10;
        for (int i11 = 0; i11 < name.length(); i11++) {
            if (!io.ktor.util.v.a(name.charAt(i11))) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public static /* synthetic */ s2 j(s2 s2Var, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = s2Var.f296100a;
        }
        if ((i11 & 2) != 0) {
            i10 = s2Var.f296101b;
        }
        return s2Var.i(str, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return Intrinsics.areEqual(this.f296100a, s2Var.f296100a) && this.f296101b == s2Var.f296101b;
    }

    @NotNull
    public final String g() {
        return this.f296100a;
    }

    @NotNull
    public final String getName() {
        return this.f296100a;
    }

    public final int h() {
        return this.f296101b;
    }

    public int hashCode() {
        return (this.f296100a.hashCode() * 31) + Integer.hashCode(this.f296101b);
    }

    @NotNull
    public final s2 i(@NotNull String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new s2(name, i10);
    }

    public final int k() {
        return this.f296101b;
    }

    @NotNull
    public String toString() {
        return "URLProtocol(name=" + this.f296100a + ", defaultPort=" + this.f296101b + ')';
    }
}
