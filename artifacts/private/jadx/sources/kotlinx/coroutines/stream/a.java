package kotlinx.coroutines.stream;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
final class a<T> implements i<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315574b = AtomicIntegerFieldUpdater.newUpdater(a.class, "consumed$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Stream<T> f315575a;
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.stream.a$a, reason: collision with other inner class name */
    @f(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {22}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
    static final class C2317a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f315577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f315578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f315579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a<T> f315580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f315581f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2317a(a<T> aVar, kotlin.coroutines.d<? super C2317a> dVar) {
            super(dVar);
            this.f315580e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315579d = obj;
            this.f315581f |= Integer.MIN_VALUE;
            return this.f315580e.collect(null, this);
        }
    }

    public a(@NotNull Stream<T> stream) {
        this.f315575a = stream;
    }

    private final /* synthetic */ int c() {
        return this.consumed$volatile;
    }

    private final /* synthetic */ void g(int i10) {
        this.consumed$volatile = i10;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #1 {all -> 0x0083, blocks: (B:22:0x0067, B:24:0x006e), top: B:40:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:40:0x0067->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // kotlinx.coroutines.flow.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        C2317a c2317a;
        a<T> aVar;
        Throwable th2;
        Iterator<T> it;
        j jVar2;
        T next;
        if (dVar instanceof C2317a) {
            c2317a = (C2317a) dVar;
            int i10 = c2317a.f315581f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2317a.f315581f = i10 - Integer.MIN_VALUE;
            } else {
                c2317a = new C2317a(this, dVar);
            }
        } else {
            c2317a = new C2317a(this, dVar);
        }
        Object obj = c2317a.f315579d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c2317a.f315581f;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!f315574b.compareAndSet(this, 0, 1)) {
                throw new IllegalStateException("Stream.consumeAsFlow can be collected only once");
            }
            try {
                aVar = this;
                it = this.f315575a.iterator();
                jVar2 = jVar;
                while (it.hasNext()) {
                    next = it.next();
                    c2317a.f315576a = aVar;
                    c2317a.f315577b = jVar2;
                    c2317a.f315578c = it;
                    c2317a.f315581f = 1;
                    if (jVar2.emit(next, c2317a) == objL) {
                        return objL;
                    }
                }
                aVar.f315575a.close();
                return Unit.f312394a;
            } catch (Throwable th3) {
                aVar = this;
                th2 = th3;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c2317a.f315578c;
            j jVar3 = (j) c2317a.f315577b;
            a<T> aVar2 = (a) c2317a.f315576a;
            try {
                ResultKt.m(obj);
                jVar2 = jVar3;
                aVar = aVar2;
                while (it.hasNext()) {
                    try {
                        next = it.next();
                        c2317a.f315576a = aVar;
                        c2317a.f315577b = jVar2;
                        c2317a.f315578c = it;
                        c2317a.f315581f = 1;
                        if (jVar2.emit(next, c2317a) == objL) {
                            return objL;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                aVar.f315575a.close();
                return Unit.f312394a;
            } catch (Throwable th5) {
                th2 = th5;
                aVar = aVar2;
            }
        }
        aVar.f315575a.close();
        throw th2;
    }
}
