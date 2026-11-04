package io.ktor.util.cio;

import io.ktor.utils.io.d1;
import io.ktor.utils.io.e1;
import io.ktor.utils.io.m;
import io.ktor.utils.io.p;
import io.ktor.utils.io.t;
import io.ktor.utils.io.z0;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nFileChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt\n+ 2 WriteSuspendSession.kt\nio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt\n+ 3 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,110:1\n51#2,4:111\n55#2,3:121\n59#2,3:144\n51#2,4:147\n55#2,3:157\n59#2,3:180\n195#3,6:115\n203#3,20:124\n195#3,6:151\n203#3,20:160\n*S KotlinDebug\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt\n*L\n64#1:111,4\n64#1:121,3\n64#1:144,3\n73#1:147,4\n73#1:157,3\n73#1:180,3\n64#1:115,6\n64#1:124,20\n73#1:151,6\n73#1:160,20\n*E\n"})
public final class h {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.cio.FileChannelsKt$readChannel$writer$1", f = "FileChannels.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFileChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt$readChannel$writer$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    static final class a extends o implements Function2<e1, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f296531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f296532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f296533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f296534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0<RandomAccessFile> f296535f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(long j10, long j11, long j12, f0<? extends RandomAccessFile> f0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f296532c = j10;
            this.f296533d = j11;
            this.f296534e = j12;
            this.f296535f = f0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f296532c, this.f296533d, this.f296534e, this.f296535f, dVar);
            aVar.f296531b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            Throwable th2;
            Closeable closeable;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296530a;
            if (i10 == 0) {
                ResultKt.m(obj);
                e1 e1Var = (e1) this.f296531b;
                long j10 = this.f296532c;
                if (!(j10 >= 0)) {
                    throw new IllegalArgumentException(("start position shouldn't be negative but it is " + j10).toString());
                }
                long j11 = this.f296533d;
                long j12 = this.f296534e;
                if (!(j11 <= j12 - 1)) {
                    throw new IllegalArgumentException(("endInclusive points to the position out of the file: file size = " + j12 + ", endInclusive = " + j11).toString());
                }
                RandomAccessFile randomAccessFileG = h.g(this.f296535f);
                long j13 = this.f296532c;
                long j14 = this.f296533d;
                try {
                    FileChannel channel = randomAccessFileG.getChannel();
                    Intrinsics.checkNotNullExpressionValue(channel, "getChannel(...)");
                    this.f296531b = randomAccessFileG;
                    this.f296530a = 1;
                    if (h.k(channel, e1Var, j13, j14, this) == objL) {
                        return objL;
                    }
                    closeable = randomAccessFileG;
                } catch (Throwable th3) {
                    th2 = th3;
                    closeable = randomAccessFileG;
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.f296531b;
                try {
                    ResultKt.m(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        throw th2;
                    } catch (Throwable th5) {
                        kotlin.io.c.a(closeable, th2);
                        throw th5;
                    }
                }
            }
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(closeable, null);
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e1 e1Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.cio.FileChannelsKt$writeChannel$1", f = "FileChannels.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160742x1}, m = "invokeSuspend", n = {com.facebook.share.internal.k.f101891c}, s = {"L$1"})
    static final class b extends o implements Function2<z0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f296537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f296538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ File f296539d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f296539d = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f296539d, dVar);
            bVar.f296538c = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            Throwable th2;
            Closeable closeable;
            RandomAccessFile randomAccessFile;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296537b;
            int i11 = 0 << 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                z0 z0Var = (z0) this.f296538c;
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f296539d, "rw");
                try {
                    io.ktor.utils.io.h hVarC = z0Var.c();
                    FileChannel channel = randomAccessFile2.getChannel();
                    Intrinsics.checkNotNullExpressionValue(channel, "getChannel(...)");
                    this.f296538c = randomAccessFile2;
                    this.f296536a = randomAccessFile2;
                    this.f296537b = 1;
                    obj = m.e(hVarC, channel, 0L, this, 2, null);
                    if (obj == objL) {
                        return objL;
                    }
                    closeable = randomAccessFile2;
                    randomAccessFile = closeable;
                } catch (Throwable th3) {
                    th2 = th3;
                    closeable = randomAccessFile2;
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RandomAccessFile randomAccessFile3 = (RandomAccessFile) this.f296536a;
                closeable = (Closeable) this.f296538c;
                try {
                    ResultKt.m(obj);
                    randomAccessFile = randomAccessFile3;
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        throw th2;
                    } catch (Throwable th5) {
                        kotlin.io.c.a(closeable, th2);
                        throw th5;
                    }
                }
            }
            randomAccessFile.setLength(((Number) obj).longValue());
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(closeable, null);
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z0 z0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(z0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.cio.FileChannelsKt", f = "FileChannels.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {144, 180}, m = "writeToScope", n = {"$this$writeToScope", "$this$writeWhile$iv", "done$iv", "$this$writeToScope", "position", "$this$writeWhile$iv", "done$iv", "endInclusive"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "J$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f296543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f296544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f296545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f296546g;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296545f = obj;
            this.f296546g |= Integer.MIN_VALUE;
            return h.k(null, null, 0L, 0L, this);
        }
    }

    @NotNull
    public static final io.ktor.utils.io.h d(@NotNull final File file, long j10, long j11, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        long length = file.length();
        final f0 f0VarC = g0.c(new Function0() { // from class: io.ktor.util.cio.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.f(file);
            }
        });
        d1 d1VarE = t.E(t0.a(coroutineContext), new r0("file-reader").plus(coroutineContext), false, new a(j10, j11, length, f0VarC, null));
        t.h(d1VarE, new Function0() { // from class: io.ktor.util.cio.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.h(f0VarC);
            }
        });
        return d1VarE.b();
    }

    public static /* synthetic */ io.ktor.utils.io.h e(File file, long j10, long j11, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = -1;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            coroutineContext = l1.c();
        }
        return d(file, j12, j13, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RandomAccessFile f(File file) {
        return new RandomAccessFile(file, "r");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RandomAccessFile g(f0<? extends RandomAccessFile> f0Var) {
        return f0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(f0 f0Var) throws IOException {
        g(f0Var).close();
        return Unit.f312394a;
    }

    @NotNull
    public static final p i(@NotNull File file, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return io.ktor.utils.io.k.W(f2.f314023a, new r0("file-writer").plus(coroutineContext), true, new b(file, null)).b();
    }

    public static /* synthetic */ p j(File file, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.c();
        }
        return i(file, coroutineContext);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0155  */
    /* JADX WARN: Code duplicated, block: B:52:0x0195  */
    /* JADX WARN: Code duplicated, block: B:53:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x025c  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0228, code lost:
    
        if (r12.d(r3) == r4) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0228 -> B:77:0x022b). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(@org.jetbrains.annotations.NotNull java.nio.channels.SeekableByteChannel r20, @org.jetbrains.annotations.NotNull io.ktor.utils.io.e1 r21, long r22, long r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r26) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.h.k(java.nio.channels.SeekableByteChannel, io.ktor.utils.io.e1, long, long, kotlin.coroutines.d):java.lang.Object");
    }
}
