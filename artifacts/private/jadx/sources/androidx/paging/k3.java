package androidx.paging;

import java.util.IdentityHashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class k3<Key, ValueFrom, ValueTo> extends u<Key, ValueTo> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final u<Key, ValueFrom> f72339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n.a<List<ValueFrom>, List<ValueTo>> f72340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final IdentityHashMap<ValueTo, Key> f72341h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72342a;

        static {
            int[] iArr = new int[u.e.values().length];
            try {
                iArr[u.e.ITEM_KEYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f72342a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.WrapperDataSource", f = "WrapperDataSource.jvm.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.V}, m = "load$suspendImpl", n = {"$this"}, s = {"L$0"})
    static final class b<Key, ValueFrom, ValueTo> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f72344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k3<Key, ValueFrom, ValueTo> f72345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f72346d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k3<Key, ValueFrom, ValueTo> k3Var, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f72345c = k3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f72344b = obj;
            this.f72346d |= Integer.MIN_VALUE;
            return k3.s(this.f72345c, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(@NotNull u<Key, ValueFrom> source, @NotNull n.a<List<ValueFrom>, List<ValueTo>> listFunction) {
        super(source.g());
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(listFunction, "listFunction");
        this.f72339f = source;
        this.f72340g = listFunction;
        this.f72341h = a.f72342a[source.g().ordinal()] == 1 ? new IdentityHashMap<>() : null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ <Key, ValueFrom, ValueTo> Object s(k3<Key, ValueFrom, ValueTo> k3Var, u.f<Key> fVar, kotlin.coroutines.d<? super u.a<ValueTo>> dVar) {
        b bVar;
        k3 k3Var2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f72346d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f72346d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(k3Var, dVar);
            }
        } else {
            bVar = new b(k3Var, dVar);
        }
        Object objK = bVar.f72344b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f72346d;
        if (i11 == 0) {
            ResultKt.m(objK);
            u<Key, ValueFrom> uVar = ((k3) k3Var).f72339f;
            bVar.f72343a = k3Var;
            bVar.f72346d = 1;
            objK = uVar.k(fVar, bVar);
            if (objK == objL) {
                k3Var2 = k3Var;
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z10 = (k3<Key, ValueFrom, ValueTo>) ((k3) bVar.f72343a);
            ResultKt.m(objK);
            k3Var2 = z10;
        }
        k3Var2 = k3Var;
        u.a aVar = (u.a) objK;
        u.a aVarA = u.a.f72622f.a(aVar, k3Var2.f72340g);
        k3Var2.t(aVar.f72623a, aVarA.f72623a);
        return aVarA;
    }

    @Override // androidx.paging.u
    public void c(@NotNull u.d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f72339f.c(onInvalidatedCallback);
    }

    @Override // androidx.paging.u
    @NotNull
    public Key e(@NotNull ValueTo item) {
        Key key;
        Intrinsics.checkNotNullParameter(item, "item");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.f72341h;
        if (identityHashMap == null) {
            throw new IllegalStateException("Cannot get key by item in non-item keyed DataSource");
        }
        synchronized (identityHashMap) {
            try {
                key = this.f72341h.get(item);
                Intrinsics.checkNotNull(key);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return key;
    }

    @Override // androidx.paging.u
    public void h() {
        this.f72339f.h();
    }

    @Override // androidx.paging.u
    public boolean j() {
        return this.f72339f.j();
    }

    @Override // androidx.paging.u
    @Nullable
    public Object k(@NotNull u.f<Key> fVar, @NotNull kotlin.coroutines.d<? super u.a<ValueTo>> dVar) {
        return s(this, fVar, dVar);
    }

    @Override // androidx.paging.u
    public void r(@NotNull u.d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f72339f.r(onInvalidatedCallback);
    }

    public final void t(@NotNull List<? extends ValueFrom> source, @NotNull List<? extends ValueTo> dest) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.f72341h;
        if (identityHashMap != null) {
            synchronized (identityHashMap) {
                try {
                    int size = dest.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        IdentityHashMap<ValueTo, Key> identityHashMap2 = this.f72341h;
                        ValueTo valueto = dest.get(i10);
                        u<Key, ValueFrom> uVar = this.f72339f;
                        Intrinsics.checkNotNull(uVar, "null cannot be cast to non-null type androidx.paging.ItemKeyedDataSource<Key of androidx.paging.WrapperDataSource.stashKeysIfNeeded$lambda$1, ValueFrom of androidx.paging.WrapperDataSource.stashKeysIfNeeded$lambda$1>");
                        identityHashMap2.put(valueto, (Key) ((p0) uVar).x(source.get(i10)));
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
