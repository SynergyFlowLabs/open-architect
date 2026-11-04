package okio;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class s0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f335073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f335074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private w0 f335075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f335076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f335077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f335078f;

    public s0(@NotNull n upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f335073a = upstream;
        l lVarN = upstream.n();
        this.f335074b = lVarN;
        w0 w0Var = lVarN.f335034a;
        this.f335075c = w0Var;
        this.f335076d = w0Var != null ? w0Var.f335129b : -1;
    }

    @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f335077e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r3 == r4.f335129b) goto L15;
     */
    @Override // okio.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(@org.jetbrains.annotations.NotNull okio.l r10, long r11) {
        /*
            r9 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 < 0) goto L83
            boolean r3 = r9.f335077e
            if (r3 != 0) goto L7b
            okio.w0 r3 = r9.f335075c
            if (r3 == 0) goto L2e
            okio.l r4 = r9.f335074b
            r8 = 5
            okio.w0 r4 = r4.f335034a
            r8 = 2
            if (r3 != r4) goto L26
            int r3 = r9.f335076d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r8 = 3
            int r4 = r4.f335129b
            if (r3 != r4) goto L26
            goto L2e
        L26:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2e:
            r8 = 1
            if (r2 != 0) goto L32
            return r0
        L32:
            r8 = 3
            okio.n r0 = r9.f335073a
            long r1 = r9.f335078f
            r8 = 6
            r3 = 1
            long r1 = r1 + r3
            r8 = 0
            boolean r0 = r0.request(r1)
            r8 = 2
            if (r0 != 0) goto L47
            r9 = -1
            r8 = 5
            return r9
        L47:
            okio.w0 r0 = r9.f335075c
            if (r0 != 0) goto L5b
            okio.l r0 = r9.f335074b
            okio.w0 r0 = r0.f335034a
            r8 = 6
            if (r0 == 0) goto L5b
            r9.f335075c = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.f335129b
            r9.f335076d = r0
        L5b:
            okio.l r0 = r9.f335074b
            r8 = 0
            long r0 = r0.size()
            long r2 = r9.f335078f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r11, r0)
            okio.l r2 = r9.f335074b
            r8 = 3
            long r4 = r9.f335078f
            r3 = r10
            r3 = r10
            r8 = 6
            r2.o(r3, r4, r6)
            long r10 = r9.f335078f
            r8 = 0
            long r10 = r10 + r6
            r9.f335078f = r10
            return r6
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L83:
            r8 = 4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r8 = 7
            r9.<init>()
            r8 = 0
            java.lang.String r10 = "C s<0onttb:uy e"
            java.lang.String r10 = "byteCount < 0: "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r8 = 7
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.s0.read(okio.l, long):long");
    }

    @Override // okio.b1
    @NotNull
    public e1 timeout() {
        return this.f335073a.timeout();
    }
}
