package io.ktor.http.cio;

import androidx.compose.runtime.m0;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.ktor.utils.io.e1;
import io.ktor.utils.io.g0;
import java.io.EOFException;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i1;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final kotlinx.io.bytestring.c f295653a = new kotlinx.io.bytestring.c(ui.u.m("\r\n", null, 1, null), 0, 0, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte f295654b = 45;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final kotlinx.io.bytestring.c f295655c = kotlinx.io.bytestring.g.b(f295654b, f295654b);

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1", f = "Multipart.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 11}, l = {209, 212, 215, 216, 221, 225, 232, 244, com.planner5d.library.engine.input.f.b.O1, com.planner5d.library.engine.input.f.b.V1, com.planner5d.library.engine.input.f.b.V1, 255, 257}, m = "invokeSuspend", n = {"$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "body", "headers", "readBeforeParse", "$this$produce", "countedInput", "body", "headers", "readBeforeParse", "$this$produce", "countedInput", "body", "headers", "headersMap", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super w>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f295659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f295660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f295661f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f295662g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f295663h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlinx.io.bytestring.c f295664i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f295665j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Long f295666k;

        /* JADX INFO: renamed from: io.ktor.http.cio.z$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1", f = "Multipart.kt", i = {0}, l = {m0.f36245r, 208}, m = "invokeSuspend", n = {"$this$writer"}, s = {"L$0"})
        static final class C2077a extends kotlin.coroutines.jvm.internal.o implements Function2<e1, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f295667a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f295668b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.io.bytestring.c f295669c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ g0 f295670d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2077a(kotlinx.io.bytestring.c cVar, g0 g0Var, kotlin.coroutines.d<? super C2077a> dVar) {
                super(2, dVar);
                this.f295669c = cVar;
                this.f295670d = g0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C2077a c2077a = new C2077a(this.f295669c, this.f295670d, dVar);
                c2077a.f295668b = obj;
                return c2077a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
            
                if (r11.g(r9) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r11.f295667a
                    r2 = 2
                    r10 = r2
                    r3 = 1
                    if (r1 == 0) goto L29
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L13
                    kotlin.ResultKt.m(r12)
                    goto L63
                L13:
                    r10 = 3
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    r10 = 2
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r10 = 3
                    r11.<init>(r12)
                    r10 = 2
                    throw r11
                L1f:
                    java.lang.Object r1 = r11.f295668b
                    io.ktor.utils.io.e1 r1 = (io.ktor.utils.io.e1) r1
                    r10 = 7
                    kotlin.ResultKt.m(r12)
                    r9 = r11
                    goto L50
                L29:
                    kotlin.ResultKt.m(r12)
                    r10 = 1
                    java.lang.Object r12 = r11.f295668b
                    r1 = r12
                    r10 = 1
                    io.ktor.utils.io.e1 r1 = (io.ktor.utils.io.e1) r1
                    r10 = 1
                    kotlinx.io.bytestring.c r4 = r11.f295669c
                    io.ktor.utils.io.g0 r5 = r11.f295670d
                    io.ktor.utils.io.p r6 = r1.c()
                    r10 = 3
                    r11.f295668b = r1
                    r11.f295667a = r3
                    r10 = 4
                    r7 = 8193(0x2001, double:4.048E-320)
                    r7 = 8193(0x2001, double:4.048E-320)
                    r9 = r11
                    r10 = 6
                    java.lang.Object r11 = io.ktor.http.cio.z.e(r4, r5, r6, r7, r9)
                    r10 = 7
                    if (r11 != r0) goto L50
                    goto L62
                L50:
                    io.ktor.utils.io.p r11 = r1.c()
                    r10 = 2
                    r12 = 0
                    r9.f295668b = r12
                    r10 = 1
                    r9.f295667a = r2
                    java.lang.Object r11 = r11.g(r9)
                    r10 = 2
                    if (r11 != r0) goto L63
                L62:
                    return r0
                L63:
                    kotlin.Unit r11 = kotlin.Unit.f312394a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.z.a.C2077a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(e1 e1Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2077a) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.ktor.utils.io.h hVar, kotlinx.io.bytestring.c cVar, long j10, Long l10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f295663h = hVar;
            this.f295664i = cVar;
            this.f295665j = j10;
            this.f295666k = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f295663h, this.f295664i, this.f295665j, this.f295666k, dVar);
            aVar.f295662g = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00a3 A[PHI: r0 r2 r3 r4 r5 r8 r13
          0x00a3: PHI (r0v23 long) = (r0v17 long), (r0v33 long) binds: [B:18:0x00a1, B:53:0x0204] A[DONT_GENERATE, DONT_INLINE]
          0x00a3: PHI (r2v22 io.ktor.utils.io.g0) = (r2v19 io.ktor.utils.io.g0), (r2v34 io.ktor.utils.io.g0) binds: [B:18:0x00a1, B:53:0x0204] A[DONT_GENERATE, DONT_INLINE]
          0x00a3: PHI (r3v17 kotlinx.coroutines.x) = (r3v12 kotlinx.coroutines.x), (r3v20 kotlinx.coroutines.x) binds: [B:18:0x00a1, B:53:0x0204] A[DONT_GENERATE, DONT_INLINE]
          0x00a3: PHI (r4v20 io.ktor.utils.io.b) = (r4v15 io.ktor.utils.io.b), (r4v25 io.ktor.utils.io.b) binds: [B:18:0x00a1, B:53:0x0204] A[DONT_GENERATE, DONT_INLINE]
          0x00a3: PHI (r5v10 kotlinx.coroutines.channels.l0) = (r5v9 kotlinx.coroutines.channels.l0), (r5v13 kotlinx.coroutines.channels.l0) binds: [B:18:0x00a1, B:53:0x0204] A[DONT_GENERATE, DONT_INLINE]
          0x00a3: PHI (r8v3 long) = (r8v0 long), (r8v11 long) binds: [B:18:0x00a1, B:53:0x0204] A[DONT_GENERATE, DONT_INLINE]
          0x00a3: PHI (r13v9 java.lang.Object) = (r13v7 java.lang.Object), (r13v14 java.lang.Object) binds: [B:18:0x00a1, B:53:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x018c  */
        /* JADX WARN: Code duplicated, block: B:42:0x01a7 A[PHI: r0 r1 r2 r8 r13
          0x01a7: PHI (r0v35 io.ktor.utils.io.g0) = (r0v14 io.ktor.utils.io.g0), (r0v37 io.ktor.utils.io.g0) binds: [B:24:0x00dc, B:40:0x01a3] A[DONT_GENERATE, DONT_INLINE]
          0x01a7: PHI (r1v9 java.lang.Object) = (r1v2 java.lang.Object), (r1v16 java.lang.Object) binds: [B:24:0x00dc, B:40:0x01a3] A[DONT_GENERATE, DONT_INLINE]
          0x01a7: PHI (r2v36 long) = (r2v10 long), (r2v39 long) binds: [B:24:0x00dc, B:40:0x01a3] A[DONT_GENERATE, DONT_INLINE]
          0x01a7: PHI (r8v13 long) = (r8v0 long), (r8v14 long) binds: [B:24:0x00dc, B:40:0x01a3] A[DONT_GENERATE, DONT_INLINE]
          0x01a7: PHI (r13v17 kotlinx.coroutines.channels.l0) = (r13v6 kotlinx.coroutines.channels.l0), (r13v18 kotlinx.coroutines.channels.l0) binds: [B:24:0x00dc, B:40:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x01af  */
        /* JADX WARN: Code duplicated, block: B:47:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:51:0x01ee  */
        /* JADX WARN: Code duplicated, block: B:58:0x0211 A[Catch: all -> 0x024b, TRY_LEAVE, TryCatch #4 {all -> 0x024b, blocks: (B:56:0x020b, B:58:0x0211), top: B:125:0x020b }] */
        /* JADX WARN: Code duplicated, block: B:63:0x0236  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0236 -> B:117:0x023c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 842
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super w> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0, 1, 1, 1, 2, 3}, l = {133, 134, 134, androidx.media2.widget.f.i.f59767c0}, m = "parsePartBodyImpl", n = {"output", "boundaryPrefixed", MetricTracker.Object.INPUT, "output", "output", "byteCount"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "J$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f295674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f295675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f295676f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295675e = obj;
            this.f295676f |= Integer.MIN_VALUE;
            int i10 = 6 | 0;
            return z.o(null, null, null, null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0}, l = {114}, m = "parsePartHeadersImpl", n = {"builder"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f295679c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295678b = obj;
            this.f295679c |= Integer.MIN_VALUE;
            return z.p(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0}, l = {144}, m = "skipIfFoundReadCount", n = {"prefix"}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f295682c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295681b = obj;
            this.f295682c |= Integer.MIN_VALUE;
            return z.s(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:28:0x0043  */
    private static final int g(CharSequence charSequence) {
        int length = charSequence.length();
        char c10 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = charSequence.charAt(i11);
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 == 4) {
                                c10 = 3;
                            }
                        } else if (cCharAt == '\"') {
                            i10 = 0;
                            c10 = 1;
                        } else if (cCharAt == '\\') {
                            c10 = 4;
                        }
                    } else if (cCharAt == '\"') {
                        c10 = 3;
                    } else if (cCharAt == ',') {
                        c10 = 0;
                    } else if (cCharAt == ';') {
                        i10 = 0;
                        c10 = 1;
                    }
                } else if (cCharAt == '=') {
                    c10 = 2;
                } else if (cCharAt == ';') {
                    i10 = 0;
                } else if (cCharAt == ',') {
                    c10 = 0;
                } else if (cCharAt == ' ') {
                    continue;
                } else {
                    if (i10 == 0 && StringsKt.b5(charSequence, "boundary=", i11, true)) {
                        return i11;
                    }
                    i10++;
                }
            } else if (cCharAt == ';') {
                i10 = 0;
                c10 = 1;
            }
        }
        return -1;
    }

    @NotNull
    public static final byte[] h(@NotNull CharSequence contentType) throws IOException {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        int iG = g(contentType);
        if (iG == -1) {
            throw new IOException("Failed to parse multipart: Content-Type's boundary parameter is missing");
        }
        byte[] bArr = new byte[74];
        i1.f fVar = new i1.f();
        i(fVar, bArr, com.google.common.base.c.f116462o);
        i(fVar, bArr, (byte) 10);
        i(fVar, bArr, f295654b);
        i(fVar, bArr, f295654b);
        int length = contentType.length();
        char c10 = 0;
        for (int i10 = iG + 9; i10 < length; i10++) {
            char cCharAt = contentType.charAt(i10);
            int i11 = cCharAt & kotlin.jvm.internal.r.f312787c;
            if ((65535 & cCharAt) > 127) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to parse multipart: wrong boundary byte 0x");
                String string = Integer.toString(i11, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                sb2.append(" - should be 7bit character");
                throw new IOException(sb2.toString());
            }
            if (c10 != 0) {
                if (c10 == 1) {
                    if (cCharAt == ' ' || cCharAt == ',' || cCharAt == ';') {
                        break;
                    }
                    i(fVar, bArr, (byte) i11);
                } else if (c10 == 2) {
                    if (cCharAt == '\"') {
                        break;
                    }
                    if (cCharAt != '\\') {
                        i(fVar, bArr, (byte) i11);
                    } else {
                        c10 = 3;
                    }
                } else if (c10 == 3) {
                    i(fVar, bArr, (byte) i11);
                    c10 = 2;
                }
            } else if (cCharAt == ' ') {
                continue;
            } else if (cCharAt == '\"') {
                c10 = 2;
            } else {
                if (cCharAt == ',' || cCharAt == ';') {
                    break;
                }
                i(fVar, bArr, (byte) i11);
                c10 = 1;
            }
        }
        int i12 = fVar.f312749a;
        if (i12 != 4) {
            return ArraysKt.copyOfRange(bArr, 0, i12);
        }
        throw new IOException("Empty multipart boundary is not allowed");
    }

    private static final void i(i1.f fVar, byte[] bArr, byte b10) throws IOException {
        int i10 = fVar.f312749a;
        if (i10 >= bArr.length) {
            throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        }
        fVar.f312749a = i10 + 1;
        bArr[i10] = b10;
    }

    @NotNull
    public static final n0<w> j(@NotNull s0 s0Var, @NotNull io.ktor.utils.io.h input, @NotNull q headers, long j10) throws io.ktor.http.cio.internals.l {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(headers, "headers");
        CharSequence charSequenceF = headers.f("Content-Type");
        if (charSequenceF == null) {
            throw new io.ktor.http.cio.internals.l("Failed to parse multipart: no Content-Type header");
        }
        CharSequence charSequenceF2 = headers.f("Content-Length");
        return k(s0Var, input, charSequenceF, charSequenceF2 != null ? Long.valueOf(io.ktor.http.cio.internals.i.n(charSequenceF2)) : null, j10);
    }

    @NotNull
    public static final n0<w> k(@NotNull s0 s0Var, @NotNull io.ktor.utils.io.h input, @NotNull CharSequence contentType, @Nullable Long l10, long j10) throws io.ktor.http.cio.internals.l {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        if (io.ktor.http.m.g.f296037a.b(contentType)) {
            int i10 = 2 | 0;
            return l(s0Var, new kotlinx.io.bytestring.c(h(contentType), 0, 0, 6, null), input, l10, j10);
        }
        throw new io.ktor.http.cio.internals.l("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) contentType));
    }

    private static final n0<w> l(s0 s0Var, kotlinx.io.bytestring.c cVar, io.ktor.utils.io.h hVar, Long l10, long j10) {
        return j0.h(s0Var, null, 0, new a(hVar, cVar, j10, l10, null), 3, null);
    }

    public static /* synthetic */ n0 m(s0 s0Var, io.ktor.utils.io.h hVar, q qVar, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return j(s0Var, hVar, qVar, j10);
    }

    public static /* synthetic */ n0 n(s0 s0Var, io.ktor.utils.io.h hVar, CharSequence charSequence, Long l10, long j10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return k(s0Var, hVar, charSequence, l10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
    
        if (r3.d(r6) == r7) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(kotlinx.io.bytestring.c r16, io.ktor.utils.io.h r17, io.ktor.utils.io.p r18, io.ktor.http.cio.q r19, long r20, kotlin.coroutines.d<? super java.lang.Long> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.z.o(kotlinx.io.bytestring.c, io.ktor.utils.io.h, io.ktor.utils.io.p, io.ktor.http.cio.q, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object p(io.ktor.utils.io.h hVar, kotlin.coroutines.d<? super q> dVar) throws Throwable {
        c cVar;
        Throwable th2;
        io.ktor.http.cio.internals.d dVar2;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f295679c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f295679c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar2 = cVar;
        Object objM = cVar2.f295678b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar2.f295679c;
        if (i11 == 0) {
            ResultKt.m(objM);
            io.ktor.http.cio.internals.d dVar3 = new io.ktor.http.cio.internals.d(null, 1, null);
            try {
                cVar2.f295677a = dVar3;
                cVar2.f295679c = 1;
                objM = v.m(hVar, dVar3, null, cVar2, 4, null);
                if (objM == objL) {
                    return objL;
                }
                dVar2 = dVar3;
            } catch (Throwable th3) {
                th2 = th3;
                dVar2 = dVar3;
                dVar2.p();
                throw th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar2 = (io.ktor.http.cio.internals.d) cVar2.f295677a;
            try {
                ResultKt.m(objM);
            } catch (Throwable th4) {
                th2 = th4;
                dVar2.p();
                throw th2;
            }
        }
        q qVar = (q) objM;
        if (qVar != null) {
            return qVar;
        }
        throw new EOFException("Failed to parse multipart headers: unexpected end of stream");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(kotlinx.io.bytestring.c cVar, io.ktor.utils.io.h hVar, io.ktor.utils.io.p pVar, long j10, kotlin.coroutines.d<? super Long> dVar) {
        return io.ktor.utils.io.k.R(hVar, cVar, pVar, j10, true, dVar);
    }

    static /* synthetic */ Object r(kotlinx.io.bytestring.c cVar, io.ktor.utils.io.h hVar, io.ktor.utils.io.p pVar, long j10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return q(cVar, hVar, pVar, j10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object s(io.ktor.utils.io.h hVar, kotlinx.io.bytestring.c cVar, kotlin.coroutines.d<? super Long> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f295682c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f295682c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objC0 = dVar2.f295681b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f295682c;
        if (i11 == 0) {
            ResultKt.m(objC0);
            dVar2.f295680a = cVar;
            dVar2.f295682c = 1;
            objC0 = io.ktor.utils.io.k.c0(hVar, cVar, dVar2);
            if (objC0 == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (kotlinx.io.bytestring.c) dVar2.f295680a;
            ResultKt.m(objC0);
        }
        return kotlin.coroutines.jvm.internal.b.g(((Boolean) objC0).booleanValue() ? cVar.r() : 0L);
    }

    private static final Void t(long j10, long j11) throws IOException {
        throw new IOException("Multipart content length exceeds limit " + j10 + " > " + j11 + "; limit is defined using 'formFieldLimit' argument");
    }
}
