package io.ktor.util.cio;

import io.ktor.utils.io.e1;
import io.ktor.utils.io.t;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1", f = "FileChannelsAtNioPath.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFileChannelsAtNioPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChannelsAtNioPath.kt\nio/ktor/util/cio/FileChannelsAtNioPathKt$readChannel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
    static final class a extends o implements Function2<e1, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f296523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f296524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f296525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f296526e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Path f296527f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, long j11, long j12, Path path, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f296524c = j10;
            this.f296525d = j11;
            this.f296526e = j12;
            this.f296527f = path;
            int i10 = 7 >> 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f296524c, this.f296525d, this.f296526e, this.f296527f, dVar);
            aVar.f296523b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            Throwable th2;
            Closeable closeable;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296522a;
            if (i10 == 0) {
                ResultKt.m(obj);
                e1 e1Var = (e1) this.f296523b;
                long j10 = this.f296524c;
                if (!(j10 >= 0)) {
                    throw new IllegalArgumentException(("start position shouldn't be negative but it is " + j10).toString());
                }
                long j11 = this.f296525d;
                long j12 = this.f296526e;
                if (!(j11 <= j12 - 1)) {
                    throw new IllegalArgumentException(("endInclusive points to the position out of the file: file size = " + j12 + ", endInclusive = " + j11).toString());
                }
                SeekableByteChannel seekableByteChannelNewByteChannel = Files.newByteChannel(this.f296527f, new OpenOption[0]);
                long j13 = this.f296524c;
                long j14 = this.f296525d;
                try {
                    Intrinsics.checkNotNull(seekableByteChannelNewByteChannel);
                    this.f296523b = seekableByteChannelNewByteChannel;
                    this.f296522a = 1;
                    if (h.k(seekableByteChannelNewByteChannel, e1Var, j13, j14, this) == objL) {
                        return objL;
                    }
                    closeable = seekableByteChannelNewByteChannel;
                } catch (Throwable th3) {
                    th2 = th3;
                    closeable = seekableByteChannelNewByteChannel;
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.f296523b;
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

    @NotNull
    public static final io.ktor.utils.io.h a(@NotNull Path path, long j10, long j11, @NotNull CoroutineContext coroutineContext) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return t.E(t0.a(coroutineContext), new r0("file-reader").plus(coroutineContext), false, new a(j10, j11, Files.size(path), path, null)).b();
    }

    public static /* synthetic */ io.ktor.utils.io.h b(Path path, long j10, long j11, CoroutineContext coroutineContext, int i10, Object obj) {
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
        return a(path, j12, j13, coroutineContext);
    }
}
