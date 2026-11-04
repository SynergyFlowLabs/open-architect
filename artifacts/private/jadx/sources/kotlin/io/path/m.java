package kotlin.io.path;

import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@e
public final class m implements Sequence<Path> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Path f312637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final o[] f312638b;

    @kotlin.coroutines.jvm.internal.f(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {192, 198}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,181:1\n45#2,19:182\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n102#1:182,19\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super Path>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f312639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f312640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f312641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f312642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f312643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f312644f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f312645g;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = m.this.new a(dVar);
            aVar.f312645g = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0091  */
        /* JADX WARN: Code duplicated, block: B:16:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:21:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:23:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:30:0x011a  */
        /* JADX WARN: Code duplicated, block: B:31:0x0128  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c4 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0118 -> B:12:0x008b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x011a -> B:12:0x008b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super Path> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {192, 198, 211, 217}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,181:1\n45#2,19:182\n45#2,19:201\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n71#1:182,19\n82#1:201,19\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super Path>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f312647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f312648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f312649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f312650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f312651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f312652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f312653g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = m.this.new b(dVar);
            bVar.f312653g = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x017d  */
        /* JADX WARN: Code duplicated, block: B:46:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:51:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:53:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:55:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:56:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:58:0x0200 A[PHI: r1 r4 r7 r8 r9 r15
          0x0200: PHI (r1v10 kotlin.io.path.c) = (r1v7 kotlin.io.path.c), (r1v12 kotlin.io.path.c) binds: [B:52:0x01cf, B:57:0x01f5] A[DONT_GENERATE, DONT_INLINE]
          0x0200: PHI (r4v20 kotlin.collections.ArrayDeque) = (r4v18 kotlin.collections.ArrayDeque), (r4v23 kotlin.collections.ArrayDeque) binds: [B:52:0x01cf, B:57:0x01f5] A[DONT_GENERATE, DONT_INLINE]
          0x0200: PHI (r7v11 kotlin.sequences.n) = (r7v8 kotlin.sequences.n), (r7v14 kotlin.sequences.n) binds: [B:52:0x01cf, B:57:0x01f5] A[DONT_GENERATE, DONT_INLINE]
          0x0200: PHI (r8v15 kotlin.io.path.m) = (r8v13 kotlin.io.path.m), (r8v25 kotlin.io.path.m) binds: [B:52:0x01cf, B:57:0x01f5] A[DONT_GENERATE, DONT_INLINE]
          0x0200: PHI (r9v12 java.nio.file.Path) = (r9v10 java.nio.file.Path), (r9v15 java.nio.file.Path) binds: [B:52:0x01cf, B:57:0x01f5] A[DONT_GENERATE, DONT_INLINE]
          0x0200: PHI (r15v21 kotlin.io.path.k) = (r15v13 kotlin.io.path.k), (r15v24 kotlin.io.path.k) binds: [B:52:0x01cf, B:57:0x01f5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:60:0x021c  */
        /* JADX WARN: Code duplicated, block: B:61:0x022e  */
        /* JADX WARN: Code duplicated, block: B:73:0x01c4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x0191 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x021a -> B:40:0x0176). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x021c -> B:40:0x0176). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 622
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super Path> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public m(@NotNull Path start, @NotNull o[] options) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f312637a = start;
        this.f312638b = options;
    }

    private final Iterator<Path> g() {
        return kotlin.sequences.o.a(new a(null));
    }

    private final Iterator<Path> h() {
        return kotlin.sequences.o.a(new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i() {
        return ArraysKt.contains(this.f312638b, o.FOLLOW_LINKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        return ArraysKt.contains(this.f312638b, o.INCLUDE_DIRECTORIES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkOption[] k() {
        return i.f312621a.a(i());
    }

    private final boolean l() {
        return ArraysKt.contains(this.f312638b, o.BREADTH_FIRST);
    }

    private final Object m(kotlin.sequences.n<? super Path> nVar, k kVar, c cVar, Function1<? super List<k>, Unit> function1, kotlin.coroutines.d<? super Unit> dVar) throws FileSystemLoopException {
        Path pathD = kVar.d();
        if (kVar.c() != null) {
            r.J(pathD);
        }
        LinkOption[] linkOptionArrK = k();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrK, linkOptionArrK.length);
        if (Files.isDirectory(pathD, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            if (n.c(kVar)) {
                throw new FileSystemLoopException(pathD.toString());
            }
            if (j()) {
                h0.e(0);
                nVar.b(pathD, dVar);
                h0.e(1);
            }
            LinkOption[] linkOptionArrK2 = k();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArrK2, linkOptionArrK2.length);
            if (Files.isDirectory(pathD, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                function1.invoke(cVar.c(kVar));
            }
        } else if (Files.exists(pathD, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            h0.e(0);
            nVar.b(pathD, dVar);
            h0.e(1);
            return Unit.f312394a;
        }
        return Unit.f312394a;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<Path> iterator() {
        return l() ? g() : h();
    }
}
