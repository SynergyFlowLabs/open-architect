package kotlinx.coroutines.channels;

import io.ktor.http.t1;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface r<E> {

    public static final class a {

        /* JADX INFO: renamed from: kotlinx.coroutines.channels.r$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {1092}, m = t1.b.f296120h, n = {"$this"}, s = {"L$0"})
        static final class C2271a<E> extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f313889a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f313890b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f313891c;

            C2271a(kotlin.coroutines.d<? super C2271a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f313890b = obj;
                this.f313891c |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @oj.i(name = t1.b.f296120h)
        public static /* synthetic */ Object a(r rVar, kotlin.coroutines.d dVar) {
            C2271a c2271a;
            if (dVar instanceof C2271a) {
                c2271a = (C2271a) dVar;
                int i10 = c2271a.f313891c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c2271a.f313891c = i10 - Integer.MIN_VALUE;
                } else {
                    c2271a = new C2271a(dVar);
                }
            } else {
                c2271a = new C2271a(dVar);
            }
            Object objC = c2271a.f313890b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c2271a.f313891c;
            if (i11 == 0) {
                ResultKt.m(objC);
                c2271a.f313889a = rVar;
                c2271a.f313891c = 1;
                objC = rVar.c(c2271a);
                if (objC == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (r) c2271a.f313889a;
                ResultKt.m(objC);
            }
            if (((Boolean) objC).booleanValue()) {
                return rVar.next();
            }
            throw new c0(v.f313899a);
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    @oj.i(name = t1.b.f296120h)
    /* synthetic */ Object a(kotlin.coroutines.d dVar);

    @Nullable
    Object c(@NotNull kotlin.coroutines.d<? super Boolean> dVar);

    E next();
}
