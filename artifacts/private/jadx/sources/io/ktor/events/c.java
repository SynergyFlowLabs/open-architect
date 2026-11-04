package io.ktor.events;

import io.ktor.util.collections.g;
import io.ktor.util.internal.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import kotlin.p;
import kotlinx.coroutines.o1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nEvents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Events.kt\nio/ktor/events/Events\n+ 2 LockFreeLinkedList.kt\nio/ktor/util/internal/LockFreeLinkedListHead\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n832#2,6:103\n832#2,3:109\n835#2,3:113\n1#3:112\n*S KotlinDebug\n*F\n+ 1 Events.kt\nio/ktor/events/Events\n*L\n34#1:103,6\n49#1:109,3\n49#1:113,3\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g<io.ktor.events.a<?>, io.ktor.util.internal.d> f295420a = new g<>();

    private static final class a extends f implements o1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final Function1<?, Unit> f295421d;

        public a(@NotNull Function1<?, Unit> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.f295421d = handler;
        }

        @NotNull
        public final Function1<?, Unit> J() {
            return this.f295421d;
        }

        @Override // kotlinx.coroutines.o1
        public void dispose() {
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.util.internal.d d(io.ktor.events.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new io.ktor.util.internal.d();
    }

    public final <T> void b(@NotNull io.ktor.events.a<T> definition, T t10) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        io.ktor.util.internal.d dVarB = this.f295420a.b(definition);
        Throwable th2 = null;
        if (dVarB != null) {
            Object objT = dVarB.t();
            Intrinsics.checkNotNull(objT, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            for (f fVarU = (f) objT; !Intrinsics.areEqual(fVarU, dVarB); fVarU = fVarU.u()) {
                if (fVarU instanceof a) {
                    try {
                        Function1<?, Unit> function1J = ((a) fVarU).J();
                        Intrinsics.checkNotNull(function1J, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise, kotlin.Unit>");
                        ((Function1) r1.q(function1J, 1)).invoke(t10);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            p.a(th2, th3);
                        } else {
                            th2 = th3;
                        }
                    }
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }

    @NotNull
    public final <T> o1 c(@NotNull io.ktor.events.a<T> definition, @NotNull Function1<? super T, Unit> handler) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(handler, "handler");
        a aVar = new a(handler);
        this.f295420a.a(definition, new Function1() { // from class: io.ktor.events.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.d((a) obj);
            }
        }).f(aVar);
        return aVar;
    }

    public final <T> void e(@NotNull io.ktor.events.a<T> definition, @NotNull Function1<? super T, Unit> handler) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(handler, "handler");
        io.ktor.util.internal.d dVarB = this.f295420a.b(definition);
        if (dVarB != null) {
            Object objT = dVarB.t();
            Intrinsics.checkNotNull(objT, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            for (f fVarU = (f) objT; !Intrinsics.areEqual(fVarU, dVarB); fVarU = fVarU.u()) {
                if (fVarU instanceof a) {
                    a aVar = (a) fVarU;
                    if (Intrinsics.areEqual(aVar.J(), handler)) {
                        aVar.C();
                    }
                }
            }
        }
    }
}
