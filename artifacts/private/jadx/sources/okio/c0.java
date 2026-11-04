package okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nHashingSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,149:1\n86#2:150\n*S KotlinDebug\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n*L\n76#1:150\n*E\n"})
public final class c0 extends x implements z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f334865d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final MessageDigest f334866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Mac f334867c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final c0 a(@NotNull z0 sink, @NotNull o key) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(key, "key");
            return new c0(sink, key, "HmacSHA1");
        }

        @oj.n
        @NotNull
        public final c0 b(@NotNull z0 sink, @NotNull o key) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(key, "key");
            return new c0(sink, key, "HmacSHA256");
        }

        @oj.n
        @NotNull
        public final c0 c(@NotNull z0 sink, @NotNull o key) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(key, "key");
            return new c0(sink, key, "HmacSHA512");
        }

        @oj.n
        @NotNull
        public final c0 d(@NotNull z0 sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return new c0(sink, "MD5");
        }

        @oj.n
        @NotNull
        public final c0 e(@NotNull z0 sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return new c0(sink, org.apache.commons.codec.digest.g.f335249c);
        }

        @oj.n
        @NotNull
        public final c0 f(@NotNull z0 sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return new c0(sink, org.apache.commons.codec.digest.g.f335251e);
        }

        @oj.n
        @NotNull
        public final c0 g(@NotNull z0 sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return new c0(sink, org.apache.commons.codec.digest.g.f335253g);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@NotNull z0 sink, @NotNull MessageDigest digest) {
        super(sink);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(digest, "digest");
        this.f334866b = digest;
        this.f334867c = null;
    }

    @oj.n
    @NotNull
    public static final c0 e(@NotNull z0 z0Var, @NotNull o oVar) {
        return f334865d.a(z0Var, oVar);
    }

    @oj.n
    @NotNull
    public static final c0 f(@NotNull z0 z0Var, @NotNull o oVar) {
        return f334865d.b(z0Var, oVar);
    }

    @oj.n
    @NotNull
    public static final c0 g(@NotNull z0 z0Var, @NotNull o oVar) {
        return f334865d.c(z0Var, oVar);
    }

    @oj.n
    @NotNull
    public static final c0 h(@NotNull z0 z0Var) {
        return f334865d.d(z0Var);
    }

    @oj.n
    @NotNull
    public static final c0 j(@NotNull z0 z0Var) {
        return f334865d.e(z0Var);
    }

    @oj.n
    @NotNull
    public static final c0 l(@NotNull z0 z0Var) {
        return f334865d.f(z0Var);
    }

    @oj.n
    @NotNull
    public static final c0 m(@NotNull z0 z0Var) {
        return f334865d.g(z0Var);
    }

    @Override // okio.x, okio.z0
    public void Ga(@NotNull l source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        i.e(source.size(), 0L, j10);
        w0 w0Var = source.f335034a;
        Intrinsics.checkNotNull(w0Var);
        long j11 = 0;
        while (j11 < j10) {
            int iMin = (int) Math.min(j10 - j11, w0Var.f335130c - w0Var.f335129b);
            MessageDigest messageDigest = this.f334866b;
            if (messageDigest != null) {
                messageDigest.update(w0Var.f335128a, w0Var.f335129b, iMin);
            } else {
                Mac mac = this.f334867c;
                Intrinsics.checkNotNull(mac);
                mac.update(w0Var.f335128a, w0Var.f335129b, iMin);
            }
            j11 += (long) iMin;
            w0Var = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var);
        }
        super.Ga(source, j10);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "hash", imports = {}))
    @oj.i(name = "-deprecated_hash")
    @NotNull
    public final o c() {
        return d();
    }

    @oj.i(name = "hash")
    @NotNull
    public final o d() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.f334866b;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.f334867c;
            Intrinsics.checkNotNull(mac);
            bArrDoFinal = mac.doFinal();
        }
        Intrinsics.checkNotNull(bArrDoFinal);
        return new o(bArrDoFinal);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(@NotNull z0 sink, @NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        this(sink, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@NotNull z0 sink, @NotNull Mac mac) {
        super(sink);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.f334867c = mac;
        this.f334866b = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(@NotNull z0 sink, @NotNull o key, @NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.F0(), algorithm));
            Unit unit = Unit.f312394a;
            Intrinsics.checkNotNull(mac);
            this(sink, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
