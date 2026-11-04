package io.ktor.websocket;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.a1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface b extends o0 {

    public static final class a {
        @Nullable
        public static Object a(@NotNull b bVar, @NotNull e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objA = o0.a.a(bVar, eVar, dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(b bVar, List list, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i10 & 1) != 0) {
                list = CollectionsKt.emptyList();
            }
            bVar.h1(list);
        }
    }

    long M0();

    long N();

    void d0(long j10);

    void e1(long j10);

    @NotNull
    a1<io.ktor.websocket.a> g();

    @io.ktor.utils.io.o0
    void h1(@NotNull List<? extends e0<?>> list);
}
