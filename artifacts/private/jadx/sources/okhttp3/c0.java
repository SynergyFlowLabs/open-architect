package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public enum c0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f333760b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f333768a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final c0 a(@NotNull String protocol) throws IOException {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            c0 c0Var = c0.HTTP_1_0;
            if (Intrinsics.areEqual(protocol, c0Var.f333768a)) {
                return c0Var;
            }
            c0 c0Var2 = c0.HTTP_1_1;
            if (Intrinsics.areEqual(protocol, c0Var2.f333768a)) {
                return c0Var2;
            }
            c0 c0Var3 = c0.H2_PRIOR_KNOWLEDGE;
            if (Intrinsics.areEqual(protocol, c0Var3.f333768a)) {
                return c0Var3;
            }
            c0 c0Var4 = c0.HTTP_2;
            if (Intrinsics.areEqual(protocol, c0Var4.f333768a)) {
                return c0Var4;
            }
            c0 c0Var5 = c0.SPDY_3;
            if (Intrinsics.areEqual(protocol, c0Var5.f333768a)) {
                return c0Var5;
            }
            c0 c0Var6 = c0.QUIC;
            if (Intrinsics.areEqual(protocol, c0Var6.f333768a)) {
                return c0Var6;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        private a() {
        }
    }

    c0(String str) {
        this.f333768a = str;
    }

    @oj.n
    @NotNull
    public static final c0 n(@NotNull String str) throws IOException {
        return f333760b.a(str);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f333768a;
    }
}
