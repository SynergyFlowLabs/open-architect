package okhttp3.internal.ws;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.l;
import okio.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nWebSocketProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketProtocol.kt\nokhttp3/internal/ws/WebSocketProtocol\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f334634a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f334635b = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f334636c = 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f334637d = 64;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f334638e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f334639f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f334640g = 15;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f334641h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f334642i = 128;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f334643j = 127;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f334644k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f334645l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f334646m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f334647n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f334648o = 9;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f334649p = 10;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f334650q = 125;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f334651r = 123;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f334652s = 126;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f334653t = 65535;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f334654u = 127;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f334655v = 1001;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f334656w = 1005;

    private g() {
    }

    @NotNull
    public final String a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return o.f335046d.l(key + f334635b).s0().n();
    }

    @Nullable
    public final String b(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return "Code must be in range [1000,5000): " + i10;
        }
        if ((1004 > i10 || i10 >= 1007) && (1015 > i10 || i10 >= 3000)) {
            return null;
        }
        return "Code " + i10 + " is reserved and may not be used.";
    }

    public final void c(@NotNull l.a cursor, @NotNull byte[] key) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i10 = 0;
        do {
            byte[] bArr = cursor.f335040e;
            int i11 = cursor.f335041f;
            int i12 = cursor.f335042g;
            if (bArr != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr[i11] = (byte) (bArr[i11] ^ key[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
        } while (cursor.c() != -1);
    }

    public final void d(int i10) {
        String strB = b(i10);
        if (strB == null) {
            return;
        }
        Intrinsics.checkNotNull(strB);
        throw new IllegalArgumentException(strB.toString());
    }
}
