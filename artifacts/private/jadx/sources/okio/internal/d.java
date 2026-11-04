package okio.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p;
import kotlin.sequences.Sequence;
import okio.b1;
import okio.l0;
import okio.r0;
import okio.u;
import okio.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,4:156\n52#2,22:160\n60#2,10:182\n56#2,3:192\n71#2,3:195\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,4\n66#1:160,22\n65#1:182,10\n65#1:192,3\n65#1:195,3\n*E\n"})
@oj.i(name = "-FileSystem")
public final class d {

    @kotlin.coroutines.jvm.internal.f(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {androidx.media3.extractor.metadata.dvbsi.b.f67479d, 135, 145}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f334928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f334929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f334930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f334931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f334932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f334933f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f334934g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f334935h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f334936i;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f334935h = obj;
            this.f334936i |= Integer.MIN_VALUE;
            return d.a(null, null, null, null, false, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super r0>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f334937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f334938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v f334939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r0 f334940d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v vVar, r0 r0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f334939c = vVar;
            this.f334940d = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f334939c, this.f334940d, dVar);
            bVar.f334938b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f334937a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlin.sequences.n nVar = (kotlin.sequences.n) this.f334938b;
                v vVar = this.f334939c;
                ArrayDeque arrayDeque = new ArrayDeque();
                r0 r0Var = this.f334940d;
                this.f334937a = 1;
                int i11 = 0 << 0;
                if (d.a(nVar, vVar, arrayDeque, r0Var, false, true, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlin.sequences.n<? super r0> nVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super r0>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f334941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f334942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f334943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f334944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ r0 f334945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ v f334946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f334947g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r0 r0Var, v vVar, boolean z10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f334945e = r0Var;
            this.f334946f = vVar;
            this.f334947g = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f334945e, this.f334946f, this.f334947g, dVar);
            cVar.f334944d = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x005b  */
        /* JADX WARN: Code duplicated, block: B:14:0x0079 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0077 -> B:15:0x007a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r11 = 7
                int r1 = r12.f334943c
                r11 = 5
                r2 = 1
                r11 = 1
                if (r1 == 0) goto L2e
                r11 = 2
                if (r1 != r2) goto L23
                r11 = 5
                java.lang.Object r1 = r12.f334942b
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r12.f334941a
                kotlin.collections.ArrayDeque r3 = (kotlin.collections.ArrayDeque) r3
                java.lang.Object r4 = r12.f334944d
                kotlin.sequences.n r4 = (kotlin.sequences.n) r4
                kotlin.ResultKt.m(r13)
                r10 = r12
                r6 = r3
                r11 = 5
                goto L7a
            L23:
                r11 = 4
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                r11 = 6
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                r11 = 2
                throw r12
            L2e:
                kotlin.ResultKt.m(r13)
                r11 = 5
                java.lang.Object r13 = r12.f334944d
                kotlin.sequences.n r13 = (kotlin.sequences.n) r13
                r11 = 0
                kotlin.collections.ArrayDeque r1 = new kotlin.collections.ArrayDeque
                r1.<init>()
                r11 = 0
                okio.r0 r3 = r12.f334945e
                r11 = 7
                r1.addLast(r3)
                okio.v r3 = r12.f334946f
                r11 = 0
                okio.r0 r4 = r12.f334945e
                java.util.List r3 = r3.y(r4)
                r11 = 5
                java.util.Iterator r3 = r3.iterator()
                r4 = r13
                r6 = r1
                r1 = r3
            L54:
                boolean r13 = r1.hasNext()
                r11 = 0
                if (r13 == 0) goto L7d
                java.lang.Object r13 = r1.next()
                r7 = r13
                r11 = 1
                okio.r0 r7 = (okio.r0) r7
                okio.v r5 = r12.f334946f
                boolean r8 = r12.f334947g
                r12.f334944d = r4
                r12.f334941a = r6
                r12.f334942b = r1
                r12.f334943c = r2
                r9 = 4
                r9 = 0
                r10 = r12
                java.lang.Object r12 = okio.internal.d.a(r4, r5, r6, r7, r8, r9, r10)
                r11 = 4
                if (r12 != r0) goto L7a
                return r0
            L7a:
                r12 = r10
                r12 = r10
                goto L54
            L7d:
                kotlin.Unit r12 = kotlin.Unit.f312394a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.internal.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlin.sequences.n<? super r0> nVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0105 A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #2 {all -> 0x0147, blocks: (B:48:0x00ff, B:50:0x0105, B:47:0x00f4), top: B:77:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x013d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlin.sequences.n] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.sequences.n, kotlin.sequences.n<? super okio.r0>] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [kotlin.sequences.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x013d -> B:19:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.sequences.n<? super okio.r0> r15, @org.jetbrains.annotations.NotNull okio.v r16, @org.jetbrains.annotations.NotNull kotlin.collections.ArrayDeque<okio.r0> r17, @org.jetbrains.annotations.NotNull okio.r0 r18, boolean r19, boolean r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.d.a(kotlin.sequences.n, okio.v, kotlin.collections.ArrayDeque, okio.r0, boolean, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    public static final void b(@NotNull v vVar, @NotNull r0 source, @NotNull r0 target) throws IOException {
        Throwable th2;
        Throwable th3;
        Long lValueOf;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        b1 b1VarM = vVar.M(source);
        try {
            okio.m mVarD = l0.d(vVar.J(target));
            th2 = null;
            try {
                lValueOf = Long.valueOf(mVarD.Ma(b1VarM));
                if (mVarD != null) {
                    try {
                        mVarD.close();
                    } catch (Throwable th4) {
                        th3 = th4;
                    }
                }
                th3 = null;
            } catch (Throwable th5) {
                if (mVarD != null) {
                    try {
                        mVarD.close();
                    } catch (Throwable th6) {
                        p.a(th5, th6);
                    }
                }
                th3 = th5;
                lValueOf = null;
            }
            if (th3 != null) {
                throw th3;
            }
            lValueOf.longValue();
            if (b1VarM != null) {
                try {
                    b1VarM.close();
                } catch (Throwable th7) {
                    th2 = th7;
                }
            }
            if (th2 != null) {
                throw th2;
            }
        } catch (Throwable th8) {
            if (b1VarM != null) {
                try {
                    b1VarM.close();
                } catch (Throwable th9) {
                    p.a(th8, th9);
                }
            }
            th2 = th8;
        }
    }

    public static final void c(@NotNull v vVar, @NotNull r0 dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayDeque arrayDeque = new ArrayDeque();
        for (r0 r0VarX = dir; r0VarX != null && !vVar.w(r0VarX); r0VarX = r0VarX.x()) {
            arrayDeque.addFirst(r0VarX);
        }
        if (z10 && arrayDeque.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            vVar.m((r0) it.next());
        }
    }

    public static final void d(@NotNull v vVar, @NotNull r0 fileOrDirectory, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        Iterator it = kotlin.sequences.o.b(new b(vVar, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            vVar.r((r0) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean e(@NotNull v vVar, @NotNull r0 path) throws IOException {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return vVar.E(path) != null;
    }

    @NotNull
    public static final Sequence<r0> f(@NotNull v vVar, @NotNull r0 dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        return kotlin.sequences.o.b(new c(dir, vVar, z10, null));
    }

    @NotNull
    public static final u g(@NotNull v vVar, @NotNull r0 path) throws IOException {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        u uVarE = vVar.E(path);
        if (uVarE != null) {
            return uVarE;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @Nullable
    public static final r0 h(@NotNull v vVar, @NotNull r0 path) throws IOException {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        r0 r0VarI = vVar.D(path).i();
        if (r0VarI == null) {
            return null;
        }
        r0 r0VarX = path.x();
        Intrinsics.checkNotNull(r0VarX);
        return r0VarX.L(r0VarI);
    }
}
