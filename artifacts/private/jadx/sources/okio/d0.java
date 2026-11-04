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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends y implements b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f334870c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final MessageDigest f334871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Mac f334872b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final d0 a(@NotNull b1 source, @NotNull o key) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            return new d0(source, key, "HmacSHA1");
        }

        @oj.n
        @NotNull
        public final d0 b(@NotNull b1 source, @NotNull o key) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            return new d0(source, key, "HmacSHA256");
        }

        @oj.n
        @NotNull
        public final d0 c(@NotNull b1 source, @NotNull o key) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            return new d0(source, key, "HmacSHA512");
        }

        @oj.n
        @NotNull
        public final d0 d(@NotNull b1 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new d0(source, "MD5");
        }

        @oj.n
        @NotNull
        public final d0 e(@NotNull b1 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new d0(source, org.apache.commons.codec.digest.g.f335249c);
        }

        @oj.n
        @NotNull
        public final d0 f(@NotNull b1 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new d0(source, org.apache.commons.codec.digest.g.f335251e);
        }

        @oj.n
        @NotNull
        public final d0 g(@NotNull b1 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new d0(source, org.apache.commons.codec.digest.g.f335253g);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@NotNull b1 source, @NotNull MessageDigest digest) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(digest, "digest");
        this.f334871a = digest;
        this.f334872b = null;
    }

    @oj.n
    @NotNull
    public static final d0 c(@NotNull b1 b1Var, @NotNull o oVar) {
        return f334870c.a(b1Var, oVar);
    }

    @oj.n
    @NotNull
    public static final d0 d(@NotNull b1 b1Var, @NotNull o oVar) {
        return f334870c.b(b1Var, oVar);
    }

    @oj.n
    @NotNull
    public static final d0 e(@NotNull b1 b1Var, @NotNull o oVar) {
        return f334870c.c(b1Var, oVar);
    }

    @oj.n
    @NotNull
    public static final d0 f(@NotNull b1 b1Var) {
        return f334870c.d(b1Var);
    }

    @oj.n
    @NotNull
    public static final d0 g(@NotNull b1 b1Var) {
        return f334870c.e(b1Var);
    }

    @oj.n
    @NotNull
    public static final d0 h(@NotNull b1 b1Var) {
        return f334870c.f(b1Var);
    }

    @oj.n
    @NotNull
    public static final d0 j(@NotNull b1 b1Var) {
        return f334870c.g(b1Var);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "hash", imports = {}))
    @oj.i(name = "-deprecated_hash")
    @NotNull
    public final o a() {
        return b();
    }

    @oj.i(name = "hash")
    @NotNull
    public final o b() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.f334871a;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.f334872b;
            Intrinsics.checkNotNull(mac);
            bArrDoFinal = mac.doFinal();
        }
        Intrinsics.checkNotNull(bArrDoFinal);
        return new o(bArrDoFinal);
    }

    @Override // okio.y, okio.b1
    public long read(@NotNull l sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j11 = super.read(sink, j10);
        if (j11 != -1) {
            long size = sink.size() - j11;
            long size2 = sink.size();
            w0 w0Var = sink.f335034a;
            Intrinsics.checkNotNull(w0Var);
            while (size2 > size) {
                w0Var = w0Var.f335134g;
                Intrinsics.checkNotNull(w0Var);
                size2 -= (long) (w0Var.f335130c - w0Var.f335129b);
            }
            while (size2 < sink.size()) {
                int i10 = (int) ((((long) w0Var.f335129b) + size) - size2);
                MessageDigest messageDigest = this.f334871a;
                if (messageDigest != null) {
                    messageDigest.update(w0Var.f335128a, i10, w0Var.f335130c - i10);
                } else {
                    Mac mac = this.f334872b;
                    Intrinsics.checkNotNull(mac);
                    mac.update(w0Var.f335128a, i10, w0Var.f335130c - i10);
                }
                size2 += (long) (w0Var.f335130c - w0Var.f335129b);
                w0Var = w0Var.f335133f;
                Intrinsics.checkNotNull(w0Var);
                size = size2;
            }
        }
        return j11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(@NotNull b1 source, @NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        this(source, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@NotNull b1 source, @NotNull Mac mac) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.f334872b = mac;
        this.f334871a = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(@NotNull b1 source, @NotNull o key, @NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.F0(), algorithm));
            Unit unit = Unit.f312394a;
            Intrinsics.checkNotNull(mac);
            this(source, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
