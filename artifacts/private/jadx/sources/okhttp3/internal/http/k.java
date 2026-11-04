package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.c0;
import okhttp3.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f334202d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f334203e = 307;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f334204f = 308;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f334205g = 421;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f334206h = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final c0 f334207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public final int f334208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f334209c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final k a(@NotNull f0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new k(response.r0(), response.E(), response.f0());
        }

        @NotNull
        public final k b(@NotNull String statusLine) throws IOException {
            c0 c0Var;
            int i10;
            String strSubstring;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (StringsKt.u2(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    c0Var = c0.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    c0Var = c0.HTTP_1_1;
                }
            } else {
                if (!StringsKt.u2(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                c0Var = c0.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i10, i11);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i10 + 4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new k(c0Var, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }

        private a() {
        }
    }

    public k(@NotNull c0 protocol, int i10, @NotNull String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f334207a = protocol;
        this.f334208b = i10;
        this.f334209c = message;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f334207a == c0.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f334208b);
        sb2.append(' ');
        sb2.append(this.f334209c);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
