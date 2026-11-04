package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final /* synthetic */ class o {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {22}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    static final class a<T, C extends Collection<? super T>> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314728c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314727b = obj;
            this.f314728c |= Integer.MIN_VALUE;
            int i10 = 3 & 0;
            return k.Z1(null, null, this);
        }
    }

    static final class b<T> implements j {

        /* JADX INFO: Incorrect field signature: TC; */
        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f314729a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        b(Collection collection) {
            this.f314729a = collection;
        }

        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            this.f314729a.add(t10);
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public static final <T, C extends Collection<? super T>> Object a(@NotNull i<? extends T> iVar, @NotNull C c10, @NotNull kotlin.coroutines.d<? super C> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f314728c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f314728c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f314727b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f314728c;
        int i12 = 5 << 1;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection = (Collection) aVar.f314726a;
            ResultKt.m(obj);
            return collection;
        }
        ResultKt.m(obj);
        j<? super Object> bVar = new b<>(c10);
        aVar.f314726a = c10;
        aVar.f314728c = 1;
        return iVar.collect(bVar, aVar) == objL ? objL : c10;
    }

    @Nullable
    public static final <T> Object b(@NotNull i<? extends T> iVar, @NotNull List<T> list, @NotNull kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return k.Z1(iVar, list, dVar);
    }

    public static /* synthetic */ Object c(i iVar, List list, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return k.a2(iVar, list, dVar);
    }

    @Nullable
    public static final <T> Object d(@NotNull i<? extends T> iVar, @NotNull Set<T> set, @NotNull kotlin.coroutines.d<? super Set<? extends T>> dVar) {
        return k.Z1(iVar, set, dVar);
    }

    public static /* synthetic */ Object e(i iVar, Set set, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return k.c2(iVar, set, dVar);
    }
}
