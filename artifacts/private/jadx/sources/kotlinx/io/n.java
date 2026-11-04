package kotlinx.io;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nkotlinx/io/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,76:1\n1#2:77\n1#2:79\n52#3:78\n53#3:80\n*S KotlinDebug\n*F\n+ 1 PeekSource.kt\nkotlinx/io/PeekSource\n*L\n46#1:79\n46#1:78\n46#1:80\n*E\n"})
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c0 f315774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f315775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private t f315776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f315777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f315778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f315779f;

    public n(@NotNull c0 upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f315774a = upstream;
        b bVarN = upstream.n();
        this.f315775b = bVarN;
        this.f315776c = bVarN.g();
        t tVarG = bVarN.g();
        this.f315777d = tVarG != null ? tVarG.h() : -1;
    }

    private static /* synthetic */ void K1() {
    }

    @Override // kotlinx.io.p, java.lang.AutoCloseable
    public void close() {
        this.f315778e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r3 == r4.h()) goto L15;
     */
    @Override // kotlinx.io.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long hd(@org.jetbrains.annotations.NotNull kotlinx.io.b r8, long r9) {
        /*
            r7 = this;
            java.lang.String r0 = "nkis"
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r7.f315778e
            if (r0 != 0) goto Lbf
            r0 = 0
            r6 = 1
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L9b
            kotlinx.io.t r3 = r7.f315776c
            if (r3 == 0) goto L3e
            kotlinx.io.b r4 = r7.f315775b
            kotlinx.io.t r4 = r4.g()
            if (r3 != r4) goto L34
            int r3 = r7.f315777d
            r6 = 6
            kotlinx.io.b r4 = r7.f315775b
            kotlinx.io.t r4 = r4.g()
            r6 = 3
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r6 = 0
            int r4 = r4.h()
            r6 = 4
            if (r3 != r4) goto L34
            goto L3e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "sPstalv ssd aicuu pdue  eisesbeeoeca mkrnrwcsuose ui ar"
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            r7.<init>(r8)
            throw r7
        L3e:
            if (r2 != 0) goto L41
            return r0
        L41:
            r6 = 6
            kotlinx.io.c0 r0 = r7.f315774a
            r6 = 2
            long r1 = r7.f315779f
            r6 = 4
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L54
            r7 = -1
            return r7
        L54:
            kotlinx.io.t r0 = r7.f315776c
            if (r0 != 0) goto L7a
            kotlinx.io.b r0 = r7.f315775b
            r6 = 1
            kotlinx.io.t r0 = r0.g()
            r6 = 1
            if (r0 == 0) goto L7a
            kotlinx.io.b r0 = r7.f315775b
            kotlinx.io.t r0 = r0.g()
            r7.f315776c = r0
            kotlinx.io.b r0 = r7.f315775b
            r6 = 4
            kotlinx.io.t r0 = r0.g()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.h()
            r7.f315777d = r0
        L7a:
            kotlinx.io.b r0 = r7.f315775b
            r6 = 1
            long r0 = r0.j()
            r6 = 0
            long r2 = r7.f315779f
            long r0 = r0 - r2
            long r9 = java.lang.Math.min(r9, r0)
            kotlinx.io.b r0 = r7.f315775b
            long r2 = r7.f315779f
            long r4 = r2 + r9
            r1 = r8
            r1 = r8
            r6 = 6
            r0.d(r1, r2, r4)
            long r0 = r7.f315779f
            long r0 = r0 + r9
            r7.f315779f = r0
            return r9
        L9b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "byteCount ("
            r7.append(r8)
            r6 = 0
            r7.append(r9)
            java.lang.String r8 = ") < 0"
            r7.append(r8)
            r6 = 0
            java.lang.String r7 = r7.toString()
            r6 = 4
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            r6 = 4
            throw r8
        Lbf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Source is closed."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.io.n.hd(kotlinx.io.b, long):long");
    }
}
