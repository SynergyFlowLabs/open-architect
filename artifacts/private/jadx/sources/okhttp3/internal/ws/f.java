package okhttp3.internal.ws;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f334626g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f334627h = "Sec-WebSocket-Extensions";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public final boolean f334628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @Nullable
    public final Integer f334629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public final boolean f334630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @Nullable
    public final Integer f334631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public final boolean f334632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    public final boolean f334633f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f a(@NotNull u responseHeaders) throws IOException {
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z10 = false;
            Integer intOrNull = null;
            boolean z11 = false;
            Integer intOrNull2 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (StringsKt.N1(responseHeaders.n(i10), "Sec-WebSocket-Extensions", true)) {
                    String strW = responseHeaders.w(i10);
                    int i11 = 0;
                    while (i11 < strW.length()) {
                        int i12 = i11;
                        int iU = jk.f.u(strW, AbstractJsonLexerKt.COMMA, i12, 0, 4, null);
                        int iS = jk.f.s(strW, ';', i12, iU);
                        String strL0 = jk.f.l0(strW, i12, iS);
                        int i13 = iS + 1;
                        if (!StringsKt.N1(strL0, "permessage-deflate", true)) {
                            i11 = i13;
                            z13 = true;
                        } else if (z10) {
                            z13 = true;
                        } else {
                            z13 = true;
                            while (i13 < iU) {
                                int iS2 = jk.f.s(strW, ';', i13, iU);
                                int iS3 = jk.f.s(strW, '=', i13, iS2);
                                String strL1 = jk.f.l0(strW, i13, iS3);
                                String strM4 = iS3 < iS2 ? StringsKt.m4(jk.f.l0(strW, iS3 + 1, iS2), "\"") : null;
                                i13 = iS2 + 1;
                                if (StringsKt.N1(strL1, "client_max_window_bits", true)) {
                                    if (intOrNull != null) {
                                        z13 = true;
                                    }
                                    intOrNull = strM4 != null ? StringsKt.toIntOrNull(strM4) : null;
                                    if (intOrNull == null) {
                                        z13 = true;
                                    }
                                } else if (StringsKt.N1(strL1, "client_no_context_takeover", true)) {
                                    if (z11) {
                                        z13 = true;
                                    }
                                    if (strM4 != null) {
                                        z13 = true;
                                    }
                                    z11 = true;
                                } else {
                                    if (StringsKt.N1(strL1, "server_max_window_bits", true)) {
                                        if (intOrNull2 != null) {
                                            z13 = true;
                                        }
                                        intOrNull2 = strM4 != null ? StringsKt.toIntOrNull(strM4) : null;
                                        if (intOrNull2 == null) {
                                        }
                                    } else if (StringsKt.N1(strL1, "server_no_context_takeover", true)) {
                                        if (z12) {
                                            z13 = true;
                                        }
                                        if (strM4 != null) {
                                            z13 = true;
                                        }
                                        z12 = true;
                                    }
                                    z13 = true;
                                }
                            }
                            i11 = i13;
                            z10 = true;
                        }
                    }
                }
            }
            return new f(z10, intOrNull, z11, intOrNull2, z12, z13);
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f() {
        this(false, null, false, null, false, false, 63, null);
        boolean z10 = false | false;
    }

    public static /* synthetic */ f h(f fVar, boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = fVar.f334628a;
        }
        if ((i10 & 2) != 0) {
            num = fVar.f334629b;
        }
        if ((i10 & 4) != 0) {
            z11 = fVar.f334630c;
        }
        if ((i10 & 8) != 0) {
            num2 = fVar.f334631d;
        }
        if ((i10 & 16) != 0) {
            z12 = fVar.f334632e;
        }
        if ((i10 & 32) != 0) {
            z13 = fVar.f334633f;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        return fVar.g(z10, num, z11, num2, z14, z15);
    }

    public final boolean a() {
        return this.f334628a;
    }

    @Nullable
    public final Integer b() {
        return this.f334629b;
    }

    public final boolean c() {
        return this.f334630c;
    }

    @Nullable
    public final Integer d() {
        return this.f334631d;
    }

    public final boolean e() {
        return this.f334632e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f334628a == fVar.f334628a && Intrinsics.areEqual(this.f334629b, fVar.f334629b) && this.f334630c == fVar.f334630c && Intrinsics.areEqual(this.f334631d, fVar.f334631d) && this.f334632e == fVar.f334632e && this.f334633f == fVar.f334633f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f334633f;
    }

    @NotNull
    public final f g(boolean z10, @Nullable Integer num, boolean z11, @Nullable Integer num2, boolean z12, boolean z13) {
        return new f(z10, num, z11, num2, z12, z13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z10 = this.f334628a;
        ?? r10 = 1;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = r11 * 31;
        Integer num = this.f334629b;
        int iHashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z11 = this.f334630c;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i11 = (iHashCode + r12) * 31;
        Integer num2 = this.f334631d;
        int iHashCode2 = (i11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z12 = this.f334632e;
        ?? r13 = z12;
        if (z12) {
            r13 = 1;
        }
        int i12 = (iHashCode2 + r13) * 31;
        boolean z13 = this.f334633f;
        if (!z13) {
            r10 = z13;
        }
        return i12 + r10;
    }

    public final boolean i(boolean z10) {
        return z10 ? this.f334630c : this.f334632e;
    }

    @NotNull
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f334628a + ", clientMaxWindowBits=" + this.f334629b + ", clientNoContextTakeover=" + this.f334630c + ", serverMaxWindowBits=" + this.f334631d + ", serverNoContextTakeover=" + this.f334632e + ", unknownValues=" + this.f334633f + ')';
    }

    public f(boolean z10, @Nullable Integer num, boolean z11, @Nullable Integer num2, boolean z12, boolean z13) {
        this.f334628a = z10;
        this.f334629b = num;
        this.f334630c = z11;
        this.f334631d = num2;
        this.f334632e = z12;
        this.f334633f = z13;
    }

    public /* synthetic */ f(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13);
    }
}
