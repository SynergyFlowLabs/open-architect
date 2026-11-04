package io.ktor.http;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class k1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f295916d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final k1 f295917e = new k1("HTTP", 2, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final k1 f295918f = new k1("HTTP", 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final k1 f295919g = new k1("HTTP", 1, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final k1 f295920h = new k1("SPDY", 3, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final k1 f295921i = new k1("QUIC", 1, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f295922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f295923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f295924c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final k1 a(@NotNull String name, int i10, int i11) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (Intrinsics.areEqual(name, "HTTP") && i10 == 1 && i11 == 0) {
                return b();
            }
            if (Intrinsics.areEqual(name, "HTTP") && i10 == 1 && i11 == 1) {
                return c();
            }
            return (Intrinsics.areEqual(name, "HTTP") && i10 == 2 && i11 == 0) ? d() : new k1(name, i10, i11);
        }

        @NotNull
        public final k1 b() {
            return k1.f295919g;
        }

        @NotNull
        public final k1 c() {
            return k1.f295918f;
        }

        @NotNull
        public final k1 d() {
            return k1.f295917e;
        }

        @NotNull
        public final k1 e() {
            return k1.f295921i;
        }

        @NotNull
        public final k1 f() {
            return k1.f295920h;
        }

        @NotNull
        public final k1 g(@NotNull CharSequence value) {
            Intrinsics.checkNotNullParameter(value, "value");
            List listSplit$default = StringsKt.split$default(value, new String[]{"/", "."}, false, 0, 6, null);
            if (listSplit$default.size() == 3) {
                return a((String) listSplit$default.get(0), Integer.parseInt((String) listSplit$default.get(1)), Integer.parseInt((String) listSplit$default.get(2)));
            }
            throw new IllegalStateException(("Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: " + ((Object) value)).toString());
        }

        private a() {
        }
    }

    static {
        int i10 = 7 ^ 1;
    }

    public k1(@NotNull String name, int i10, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f295922a = name;
        this.f295923b = i10;
        this.f295924c = i11;
    }

    public static /* synthetic */ k1 j(k1 k1Var, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = k1Var.f295922a;
        }
        if ((i12 & 2) != 0) {
            i10 = k1Var.f295923b;
        }
        if ((i12 & 4) != 0) {
            i11 = k1Var.f295924c;
        }
        return k1Var.i(str, i10, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (Intrinsics.areEqual(this.f295922a, k1Var.f295922a) && this.f295923b == k1Var.f295923b && this.f295924c == k1Var.f295924c) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String f() {
        return this.f295922a;
    }

    public final int g() {
        return this.f295923b;
    }

    public final int h() {
        return this.f295924c;
    }

    public int hashCode() {
        return (((this.f295922a.hashCode() * 31) + Integer.hashCode(this.f295923b)) * 31) + Integer.hashCode(this.f295924c);
    }

    @NotNull
    public final k1 i(@NotNull String name, int i10, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new k1(name, i10, i11);
    }

    public final int k() {
        return this.f295923b;
    }

    public final int l() {
        return this.f295924c;
    }

    @NotNull
    public final String m() {
        return this.f295922a;
    }

    @NotNull
    public String toString() {
        return this.f295922a + '/' + this.f295923b + '.' + this.f295924c;
    }
}
