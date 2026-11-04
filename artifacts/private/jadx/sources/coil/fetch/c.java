package coil.fetch;

import coil.decode.a0;
import coil.request.n;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nByteBufferFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteBufferFetcher.kt\ncoil/fetch/ByteBufferFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ByteBuffer f87347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f87348b;

    public static final class a implements h.a<ByteBuffer> {
        @Override // coil.fetch.h.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull ByteBuffer byteBuffer, @NotNull n nVar, @NotNull coil.j jVar) {
            return new c(byteBuffer, nVar);
        }
    }

    public c(@NotNull ByteBuffer byteBuffer, @NotNull n nVar) {
        this.f87347a = byteBuffer;
        this.f87348b = nVar;
    }

    @Override // coil.fetch.h
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        try {
            okio.l lVar = new okio.l();
            lVar.write(this.f87347a);
            this.f87347a.position(0);
            return new m(a0.i(lVar, this.f87348b.g()), null, coil.decode.e.MEMORY);
        } catch (Throwable th2) {
            this.f87347a.position(0);
            throw th2;
        }
    }
}
