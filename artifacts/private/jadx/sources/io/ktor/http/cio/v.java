package io.ktor.http.cio;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.ktor.http.j1;
import io.ktor.utils.io.t0;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpParser.kt\nio/ktor/http/cio/HttpParserKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,322:1\n1088#2,2:323\n1#3:325\n*S KotlinDebug\n*F\n+ 1 HttpParser.kt\nio/ktor/http/cio/HttpParserKt\n*L\n162#1:323,2\n*E\n"})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f295619a = 8192;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f295620b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f295621c = 999;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Set<Character> f295622d = SetsKt.setOf((Object[]) new Character[]{'/', '?', '#', '@'});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f295623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final io.ktor.http.cio.internals.c<String> f295624f;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160742x1}, m = "parseHeaders", n = {"builder"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f295627c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295626b = obj;
            this.f295627c |= Integer.MIN_VALUE;
            return v.l(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0, 0, 0, 0}, l = {122}, m = "parseHeaders", n = {MetricTracker.Object.INPUT, "builder", "range", "headers"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f295631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f295632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f295633f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295632e = obj;
            this.f295633f |= Integer.MIN_VALUE;
            return v.k(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {45, 60}, m = "parseRequest", n = {MetricTracker.Object.INPUT, "builder", "range", "builder", "method", "uri", "version"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f295637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f295638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f295639f;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295638e = obj;
            this.f295639f |= Integer.MIN_VALUE;
            return v.q(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {com.planner5d.library.engine.input.f.b.f160732u0, 90}, m = "parseResponse", n = {MetricTracker.Object.INPUT, "builder", "range", "builder", "version", "statusText", "statusCode"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f295644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f295645f;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295644e = obj;
            this.f295645f |= Integer.MIN_VALUE;
            return v.r(null, this);
        }
    }

    static {
        t0.a aVar = t0.f297157b;
        f295623e = t0.k(aVar.c(), aVar.d());
        f295624f = io.ktor.http.cio.internals.c.f295545b.c(CollectionsKt.listOf((Object[]) new String[]{"HTTP/1.0", "HTTP/1.1"}));
    }

    private static final Void c(CharSequence charSequence, char c10) {
        throw new a0("Character with code " + (c10 & 255) + " is not allowed in header names, \n" + ((Object) charSequence));
    }

    public static final int d() {
        return f295623e;
    }

    public static /* synthetic */ void e() {
    }

    private static final boolean f(char c10) {
        return Intrinsics.compare((int) c10, 32) <= 0 || StringsKt.U2("\"(),/:;<=>?@[\\]{}", c10, false, 2, null);
    }

    private static final Void g(CharSequence charSequence, io.ktor.http.cio.internals.j jVar) {
        throw new a0("No colon in HTTP header in " + charSequence.subSequence(jVar.b(), jVar.a()).toString() + " in builder: \n" + ((Object) charSequence));
    }

    public static final int h(@NotNull io.ktor.http.cio.internals.d text, @NotNull io.ktor.http.cio.internals.j range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int iA = range.a();
        for (int iB = range.b(); iB < iA; iB++) {
            char cCharAt = text.charAt(iB);
            if (cCharAt == ':' && iB != range.b()) {
                range.d(iB + 1);
                return iB;
            }
            if (f(cCharAt)) {
                i(text, iB, range.b(), cCharAt);
                throw new kotlin.a0();
            }
        }
        g(text, range);
        throw new kotlin.a0();
    }

    private static final Void i(io.ktor.http.cio.internals.d dVar, int i10, int i11, char c10) {
        if (c10 == ':') {
            throw new a0("Empty header names are not allowed as per RFC7230.");
        }
        if (i10 == i11) {
            throw new a0("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
        }
        c(dVar, c10);
        throw new kotlin.a0();
    }

    public static final void j(@NotNull io.ktor.http.cio.internals.d text, @NotNull io.ktor.http.cio.internals.j range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int iB = range.b();
        int iA = range.a();
        int iD = io.ktor.http.cio.internals.k.d(text, iB, iA);
        if (iD >= iA) {
            range.d(iA);
            return;
        }
        int i10 = iD;
        int i11 = i10;
        while (i10 < iA) {
            char cCharAt = text.charAt(i10);
            if (cCharAt != '\t') {
                if (cCharAt == '\n' || cCharAt == '\r') {
                    c(text, cCharAt);
                    throw new kotlin.a0();
                }
                if (cCharAt != ' ') {
                    i11 = i10;
                }
            }
            i10++;
        }
        range.d(iD);
        range.c(i11 + 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086 A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:23:0x007d, B:25:0x0086, B:29:0x0090, B:32:0x00a8, B:33:0x00ca, B:34:0x00d2, B:35:0x00d3, B:37:0x00e2), top: B:45:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0090 A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:23:0x007d, B:25:0x0086, B:29:0x0090, B:32:0x00a8, B:33:0x00ca, B:34:0x00d2, B:35:0x00d3, B:37:0x00e2), top: B:45:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8 A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:23:0x007d, B:25:0x0086, B:29:0x0090, B:32:0x00a8, B:33:0x00ca, B:34:0x00d2, B:35:0x00d3, B:37:0x00e2), top: B:45:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0079 -> B:45:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object k(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r11, @org.jetbrains.annotations.NotNull io.ktor.http.cio.internals.d r12, @org.jetbrains.annotations.NotNull io.ktor.http.cio.internals.j r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super io.ktor.http.cio.q> r14) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.v.k(io.ktor.utils.io.h, io.ktor.http.cio.internals.d, io.ktor.http.cio.internals.j, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public static final Object l(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<? super q> dVar) {
        a aVar;
        io.ktor.http.cio.internals.d dVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f295627c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f295627c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object objM = aVar2.f295626b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f295627c;
        if (i11 == 0) {
            ResultKt.m(objM);
            io.ktor.http.cio.internals.d dVar3 = new io.ktor.http.cio.internals.d(null, 1, null);
            aVar2.f295625a = dVar3;
            aVar2.f295627c = 1;
            objM = m(hVar, dVar3, null, aVar2, 4, null);
            if (objM == objL) {
                return objL;
            }
            dVar2 = dVar3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar2 = (io.ktor.http.cio.internals.d) aVar2.f295625a;
            ResultKt.m(objM);
        }
        q qVar = (q) objM;
        return qVar == null ? new q(dVar2) : qVar;
    }

    public static /* synthetic */ Object m(io.ktor.utils.io.h hVar, io.ktor.http.cio.internals.d dVar, io.ktor.http.cio.internals.j jVar, kotlin.coroutines.d dVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            jVar = new io.ktor.http.cio.internals.j(0, 0);
        }
        return k(hVar, dVar, jVar, dVar2);
    }

    private static final j1 n(CharSequence charSequence, io.ktor.http.cio.internals.j jVar) {
        io.ktor.http.cio.internals.k.c(charSequence, jVar);
        int i10 = 7 | 0;
        j1 j1Var = (j1) CollectionsKt.singleOrNull(io.ktor.http.cio.internals.c.c(io.ktor.http.cio.internals.i.g(), charSequence, jVar.b(), jVar.a(), false, new Function2() { // from class: io.ktor.http.cio.t
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(v.o(((Character) obj).charValue(), ((Integer) obj2).intValue()));
            }
        }, 8, null));
        if (j1Var == null) {
            return p(charSequence, jVar);
        }
        jVar.d(jVar.b() + j1Var.l().length());
        return j1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(char c10, int i10) {
        return c10 == ' ';
    }

    private static final j1 p(CharSequence charSequence, io.ktor.http.cio.internals.j jVar) {
        return new j1(io.ktor.http.cio.internals.k.b(charSequence, jVar).toString());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x0039, B:30:0x0091, B:33:0x009a, B:35:0x00ab, B:37:0x00c4, B:39:0x00ca, B:41:0x00d0, B:52:0x00f7, B:53:0x00fe, B:54:0x00ff, B:55:0x0106, B:56:0x0107, B:57:0x012d, B:26:0x007b), top: B:61:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x0039, B:30:0x0091, B:33:0x009a, B:35:0x00ab, B:37:0x00c4, B:39:0x00ca, B:41:0x00d0, B:52:0x00f7, B:53:0x00fe, B:54:0x00ff, B:55:0x0106, B:56:0x0107, B:57:0x012d, B:26:0x007b), top: B:61:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x0039, B:30:0x0091, B:33:0x009a, B:35:0x00ab, B:37:0x00c4, B:39:0x00ca, B:41:0x00d0, B:52:0x00f7, B:53:0x00fe, B:54:0x00ff, B:55:0x0106, B:56:0x0107, B:57:0x012d, B:26:0x007b), top: B:61:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x0039, B:30:0x0091, B:33:0x009a, B:35:0x00ab, B:37:0x00c4, B:39:0x00ca, B:41:0x00d0, B:52:0x00f7, B:53:0x00fe, B:54:0x00ff, B:55:0x0106, B:56:0x0107, B:57:0x012d, B:26:0x007b), top: B:61:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x0039, B:30:0x0091, B:33:0x009a, B:35:0x00ab, B:37:0x00c4, B:39:0x00ca, B:41:0x00d0, B:52:0x00f7, B:53:0x00fe, B:54:0x00ff, B:55:0x0106, B:56:0x0107, B:57:0x012d, B:26:0x007b), top: B:61:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #2 {all -> 0x00f4, blocks: (B:45:0x00e8, B:48:0x00ee), top: B:64:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x0039, B:30:0x0091, B:33:0x009a, B:35:0x00ab, B:37:0x00c4, B:39:0x00ca, B:41:0x00d0, B:52:0x00f7, B:53:0x00fe, B:54:0x00ff, B:55:0x0106, B:56:0x0107, B:57:0x012d, B:26:0x007b), top: B:61:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x0039, B:30:0x0091, B:33:0x009a, B:35:0x00ab, B:37:0x00c4, B:39:0x00ca, B:41:0x00d0, B:52:0x00f7, B:53:0x00fe, B:54:0x00ff, B:55:0x0106, B:56:0x0107, B:57:0x012d, B:26:0x007b), top: B:61:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0107 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x0039, B:30:0x0091, B:33:0x009a, B:35:0x00ab, B:37:0x00c4, B:39:0x00ca, B:41:0x00d0, B:52:0x00f7, B:53:0x00fe, B:54:0x00ff, B:55:0x0106, B:56:0x0107, B:57:0x012d, B:26:0x007b), top: B:61:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.http.cio.v$c] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008e -> B:30:0x0091). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object q(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super io.ktor.http.cio.b0> r15) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.v.q(io.ktor.utils.io.h, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:20:0x005d, B:29:0x008e, B:32:0x0097), top: B:48:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7 A[Catch: all -> 0x00de, TryCatch #3 {all -> 0x00de, blocks: (B:36:0x00d3, B:38:0x00d7, B:42:0x00e3), top: B:54:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public static final Object r(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<? super e0> dVar) throws Throwable {
        d dVar2;
        Throwable th2;
        io.ktor.http.cio.internals.d dVar3;
        io.ktor.utils.io.h hVar2;
        io.ktor.http.cio.internals.j jVar;
        io.ktor.http.cio.internals.d dVar4;
        CharSequence charSequenceU;
        int iS;
        CharSequence charSequenceSubSequence;
        Object objK;
        CharSequence charSequence;
        io.ktor.http.cio.internals.d dVar5;
        int i10;
        CharSequence charSequence2;
        q qVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.f295645f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.f295645f = i11 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f295644e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = dVar2.f295645f;
        if (i12 == 0) {
            ResultKt.m(obj);
            io.ktor.http.cio.internals.d dVar6 = new io.ktor.http.cio.internals.d(null, 1, null);
            io.ktor.http.cio.internals.j jVar2 = new io.ktor.http.cio.internals.j(0, 0);
            try {
                int i13 = f295623e;
                dVar2.f295640a = hVar;
                dVar2.f295641b = dVar6;
                dVar2.f295642c = jVar2;
                dVar2.f295645f = 1;
                Object objO = io.ktor.utils.io.k.O(hVar, dVar6, 8192, i13, dVar2);
                if (objO != objL) {
                    hVar2 = hVar;
                    jVar = jVar2;
                    dVar4 = dVar6;
                    obj = objO;
                    if (!((Boolean) obj).booleanValue()) {
                        return null;
                    }
                    jVar.c(dVar4.length());
                    charSequenceU = u(dVar4, jVar);
                    iS = s(dVar4, jVar);
                    io.ktor.http.cio.internals.k.c(dVar4, jVar);
                    charSequenceSubSequence = dVar4.subSequence(jVar.b(), jVar.a());
                    jVar.d(jVar.a());
                    dVar2.f295640a = dVar4;
                    dVar2.f295641b = charSequenceU;
                    dVar2.f295642c = charSequenceSubSequence;
                    dVar2.f295643d = iS;
                    dVar2.f295645f = 2;
                    objK = k(hVar2, dVar4, jVar, dVar2);
                    if (objK != objL) {
                        charSequence = charSequenceU;
                        dVar5 = dVar4;
                        i10 = iS;
                        charSequence2 = charSequenceSubSequence;
                        obj = objK;
                        qVar = (q) obj;
                        if (qVar == null) {
                            qVar = new q(dVar5);
                        }
                        return new e0(charSequence, i10, charSequence2, qVar, dVar5);
                    }
                }
                return objL;
            } catch (Throwable th3) {
                th2 = th3;
                dVar3 = dVar6;
            }
        } else if (i12 == 1) {
            jVar = (io.ktor.http.cio.internals.j) dVar2.f295642c;
            dVar4 = (io.ktor.http.cio.internals.d) dVar2.f295641b;
            hVar2 = (io.ktor.utils.io.h) dVar2.f295640a;
            try {
                ResultKt.m(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                jVar.c(dVar4.length());
                charSequenceU = u(dVar4, jVar);
                iS = s(dVar4, jVar);
                io.ktor.http.cio.internals.k.c(dVar4, jVar);
                charSequenceSubSequence = dVar4.subSequence(jVar.b(), jVar.a());
                jVar.d(jVar.a());
                dVar2.f295640a = dVar4;
                dVar2.f295641b = charSequenceU;
                dVar2.f295642c = charSequenceSubSequence;
                dVar2.f295643d = iS;
                dVar2.f295645f = 2;
                objK = k(hVar2, dVar4, jVar, dVar2);
                if (objK != objL) {
                    charSequence = charSequenceU;
                    dVar5 = dVar4;
                    i10 = iS;
                    charSequence2 = charSequenceSubSequence;
                    obj = objK;
                    qVar = (q) obj;
                    if (qVar == null) {
                        qVar = new q(dVar5);
                    }
                    return new e0(charSequence, i10, charSequence2, qVar, dVar5);
                }
                return objL;
            } catch (Throwable th4) {
                th2 = th4;
                dVar3 = dVar4;
            }
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = dVar2.f295643d;
            CharSequence charSequence3 = (CharSequence) dVar2.f295642c;
            CharSequence charSequence4 = (CharSequence) dVar2.f295641b;
            dVar3 = (io.ktor.http.cio.internals.d) dVar2.f295640a;
            try {
                ResultKt.m(obj);
                i10 = i14;
                charSequence2 = charSequence3;
                charSequence = charSequence4;
                dVar5 = dVar3;
                try {
                    qVar = (q) obj;
                    if (qVar == null) {
                        qVar = new q(dVar5);
                    }
                    return new e0(charSequence, i10, charSequence2, qVar, dVar5);
                } catch (Throwable th5) {
                    th2 = th5;
                    dVar3 = dVar5;
                }
            } catch (Throwable th6) {
                th2 = th6;
            }
        }
        dVar3.p();
        throw th2;
    }

    private static final int s(CharSequence charSequence, io.ktor.http.cio.internals.j jVar) {
        io.ktor.http.cio.internals.k.c(charSequence, jVar);
        int iA = jVar.a();
        int iA2 = jVar.a();
        int i10 = 0;
        for (int iB = jVar.b(); iB < iA2; iB++) {
            char cCharAt = charSequence.charAt(iB);
            if (cCharAt == ' ') {
                if (!w(i10)) {
                    iA = iB;
                    break;
                }
                throw new a0("Status-code must be 3-digit. Status received: " + i10 + '.');
            }
            if ('0' > cCharAt || cCharAt >= ':') {
                throw new NumberFormatException("Illegal digit " + cCharAt + " in status code " + charSequence.subSequence(jVar.b(), io.ktor.http.cio.internals.k.a(charSequence, jVar)).toString());
            }
            i10 = (i10 * 10) + (cCharAt - '0');
        }
        jVar.d(iA);
        return i10;
    }

    private static final CharSequence t(CharSequence charSequence, io.ktor.http.cio.internals.j jVar) {
        io.ktor.http.cio.internals.k.c(charSequence, jVar);
        int iB = jVar.b();
        int iA = io.ktor.http.cio.internals.k.a(charSequence, jVar);
        int i10 = iA - iB;
        if (i10 <= 0) {
            return "";
        }
        if (i10 == 1 && charSequence.charAt(iB) == '/') {
            jVar.d(iA);
            return "/";
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(iB, iA);
        jVar.d(iA);
        return charSequenceSubSequence;
    }

    private static final CharSequence u(CharSequence charSequence, io.ktor.http.cio.internals.j jVar) {
        io.ktor.http.cio.internals.k.c(charSequence, jVar);
        if (jVar.b() >= jVar.a()) {
            throw new IllegalStateException(("Failed to parse version: " + ((Object) charSequence)).toString());
        }
        String str = (String) CollectionsKt.singleOrNull(io.ktor.http.cio.internals.c.c(f295624f, charSequence, jVar.b(), jVar.a(), false, new Function2() { // from class: io.ktor.http.cio.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(v.v(((Character) obj).charValue(), ((Integer) obj2).intValue()));
            }
        }, 8, null));
        if (str != null) {
            jVar.d(jVar.b() + str.length());
            return str;
        }
        x(io.ktor.http.cio.internals.k.b(charSequence, jVar));
        throw new kotlin.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(char c10, int i10) {
        return c10 == ' ';
    }

    private static final boolean w(int i10) {
        return i10 < 100 || i10 > 999;
    }

    private static final Void x(CharSequence charSequence) {
        throw new a0("Unsupported HTTP version: " + ((Object) charSequence));
    }

    private static final void y(CharSequence charSequence) {
        if (StringsKt.b3(charSequence, ":", false, 2, null)) {
            throw new a0("Host header with ':' should contains port: " + ((Object) charSequence));
        }
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            Set<Character> set = f295622d;
            if (set.contains(Character.valueOf(cCharAt))) {
                throw new a0("Host cannot contain any of the following symbols: " + set);
            }
        }
    }
}
