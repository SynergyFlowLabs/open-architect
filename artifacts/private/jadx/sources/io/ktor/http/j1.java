package io.ktor.http;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class j1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f295897b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final j1 f295898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final j1 f295899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final j1 f295900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final j1 f295901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final j1 f295902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final j1 f295903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final j1 f295904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final List<j1> f295905j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f295906a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<j1> a() {
            return j1.f295905j;
        }

        @NotNull
        public final j1 b() {
            return j1.f295902g;
        }

        @NotNull
        public final j1 c() {
            return j1.f295898c;
        }

        @NotNull
        public final j1 d() {
            return j1.f295903h;
        }

        @NotNull
        public final j1 e() {
            return j1.f295904i;
        }

        @NotNull
        public final j1 f() {
            return j1.f295901f;
        }

        @NotNull
        public final j1 g() {
            return j1.f295899d;
        }

        @NotNull
        public final j1 h() {
            return j1.f295900e;
        }

        @NotNull
        public final j1 i(@NotNull String method) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (Intrinsics.areEqual(method, c().l())) {
                return c();
            }
            if (Intrinsics.areEqual(method, g().l())) {
                return g();
            }
            if (Intrinsics.areEqual(method, h().l())) {
                return h();
            }
            if (Intrinsics.areEqual(method, f().l())) {
                return f();
            }
            if (Intrinsics.areEqual(method, b().l())) {
                return b();
            }
            if (Intrinsics.areEqual(method, d().l())) {
                return d();
            }
            return Intrinsics.areEqual(method, e().l()) ? e() : new j1(method);
        }

        private a() {
        }
    }

    static {
        j1 j1Var = new j1("GET");
        f295898c = j1Var;
        j1 j1Var2 = new j1("POST");
        f295899d = j1Var2;
        j1 j1Var3 = new j1("PUT");
        f295900e = j1Var3;
        j1 j1Var4 = new j1("PATCH");
        f295901f = j1Var4;
        j1 j1Var5 = new j1("DELETE");
        f295902g = j1Var5;
        j1 j1Var6 = new j1("HEAD");
        f295903h = j1Var6;
        j1 j1Var7 = new j1("OPTIONS");
        f295904i = j1Var7;
        f295905j = CollectionsKt.listOf((Object[]) new j1[]{j1Var, j1Var2, j1Var3, j1Var4, j1Var5, j1Var6, j1Var7});
    }

    public j1(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f295906a = value;
    }

    public static /* synthetic */ j1 k(j1 j1Var, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = j1Var.f295906a;
        }
        return j1Var.j(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && Intrinsics.areEqual(this.f295906a, ((j1) obj).f295906a);
    }

    public int hashCode() {
        return this.f295906a.hashCode();
    }

    @NotNull
    public final String i() {
        return this.f295906a;
    }

    @NotNull
    public final j1 j(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new j1(value);
    }

    @NotNull
    public final String l() {
        return this.f295906a;
    }

    @NotNull
    public String toString() {
        return this.f295906a;
    }
}
