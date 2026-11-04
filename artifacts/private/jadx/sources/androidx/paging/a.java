package androidx.paging;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRemoteMediatorAccessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteMediatorAccessor.kt\nandroidx/paging/AccessorState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,460:1\n1747#2,3:461\n288#2,2:464\n288#2,2:466\n288#2,2:468\n*S KotlinDebug\n*F\n+ 1 RemoteMediatorAccessor.kt\nandroidx/paging/AccessorState\n*L\n133#1:461,3\n173#1:464,2\n220#1:466,2\n224#1:468,2\n*E\n"})
final class a<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC0634a[] f71473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0.a[] f71474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<b<Key, Value>> f71475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f71476d;

    /* JADX INFO: renamed from: androidx.paging.a$a, reason: collision with other inner class name */
    public enum EnumC0634a {
        UNBLOCKED,
        COMPLETED,
        REQUIRES_REFRESH
    }

    public static final class b<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a1 f71481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private j2<Key, Value> f71482b;

        public b(@NotNull a1 loadType, @NotNull j2<Key, Value> pagingState) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            Intrinsics.checkNotNullParameter(pagingState, "pagingState");
            this.f71481a = loadType;
            this.f71482b = pagingState;
        }

        @NotNull
        public final a1 a() {
            return this.f71481a;
        }

        @NotNull
        public final j2<Key, Value> b() {
            return this.f71482b;
        }

        public final void c(@NotNull j2<Key, Value> j2Var) {
            Intrinsics.checkNotNullParameter(j2Var, "<set-?>");
            this.f71482b = j2Var;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f71484b;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71483a = iArr;
            int[] iArr2 = new int[EnumC0634a.values().length];
            try {
                iArr2[EnumC0634a.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[EnumC0634a.REQUIRES_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC0634a.UNBLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f71484b = iArr2;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<b<Key, Value>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a1 f71485a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a1 a1Var) {
            super(1);
            this.f71485a = a1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull b<Key, Value> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.a() == this.f71485a);
        }
    }

    public a() {
        int length = a1.values().length;
        EnumC0634a[] enumC0634aArr = new EnumC0634a[length];
        for (int i10 = 0; i10 < length; i10++) {
            enumC0634aArr[i10] = EnumC0634a.UNBLOCKED;
        }
        this.f71473a = enumC0634aArr;
        int length2 = a1.values().length;
        x0.a[] aVarArr = new x0.a[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            aVarArr[i11] = null;
        }
        this.f71474b = aVarArr;
        this.f71475c = new ArrayDeque<>();
    }

    private final x0 f(a1 a1Var) {
        EnumC0634a enumC0634a = this.f71473a[a1Var.ordinal()];
        ArrayDeque<b<Key, Value>> arrayDeque = this.f71475c;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<b<Key, Value>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (it.next().a() == a1Var) {
                    if (enumC0634a == EnumC0634a.REQUIRES_REFRESH) {
                        break;
                    }
                    return x0.b.f72692b;
                }
            }
        }
        x0.a aVar = this.f71474b[a1Var.ordinal()];
        if (aVar != null) {
            return aVar;
        }
        int i10 = c.f71484b[enumC0634a.ordinal()];
        if (i10 == 1) {
            return c.f71483a[a1Var.ordinal()] == 1 ? x0.c.f72693b.b() : x0.c.f72693b.a();
        }
        if (i10 != 2 && i10 != 3) {
            throw new kotlin.k0();
        }
        return x0.c.f72693b.b();
    }

    public final boolean a(@NotNull a1 loadType, @NotNull j2<Key, Value> pagingState) {
        b<Key, Value> next;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        Iterator<b<Key, Value>> it = this.f71475c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.a() != loadType);
        b<Key, Value> bVar = next;
        if (bVar != null) {
            bVar.c(pagingState);
            return false;
        }
        EnumC0634a enumC0634a = this.f71473a[loadType.ordinal()];
        if (enumC0634a == EnumC0634a.REQUIRES_REFRESH && loadType != a1.REFRESH) {
            this.f71475c.add(new b<>(loadType, pagingState));
            return false;
        }
        if (enumC0634a != EnumC0634a.UNBLOCKED && loadType != a1.REFRESH) {
            return false;
        }
        a1 a1Var = a1.REFRESH;
        if (loadType == a1Var) {
            k(a1Var, null);
        }
        if (this.f71474b[loadType.ordinal()] == null) {
            return this.f71475c.add(new b<>(loadType, pagingState));
        }
        return false;
    }

    public final void b() {
        int length = this.f71474b.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f71474b[i10] = null;
        }
    }

    public final void c(@NotNull a1 loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        CollectionsKt.removeAll((List) this.f71475c, (Function1) new d(loadType));
    }

    public final void d() {
        this.f71475c.clear();
    }

    @NotNull
    public final z0 e() {
        return new z0(f(a1.REFRESH), f(a1.PREPEND), f(a1.APPEND));
    }

    @Nullable
    public final Pair<a1, j2<Key, Value>> g() {
        b<Key, Value> next;
        Iterator<b<Key, Value>> it = this.f71475c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            b<Key, Value> bVar = next;
            if (bVar.a() != a1.REFRESH && this.f71473a[bVar.a().ordinal()] == EnumC0634a.UNBLOCKED) {
                break;
            }
        }
        b<Key, Value> bVar2 = next;
        if (bVar2 != null) {
            return TuplesKt.to(bVar2.a(), bVar2.b());
        }
        return null;
    }

    @Nullable
    public final j2<Key, Value> h() {
        b<Key, Value> next;
        Iterator<b<Key, Value>> it = this.f71475c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.a() != a1.REFRESH);
        b<Key, Value> bVar = next;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    public final boolean i() {
        return this.f71476d;
    }

    public final void j(@NotNull a1 loadType, @NotNull EnumC0634a state) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f71473a[loadType.ordinal()] = state;
    }

    public final void k(@NotNull a1 loadType, @Nullable x0.a aVar) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        this.f71474b[loadType.ordinal()] = aVar;
    }

    public final void l(boolean z10) {
        this.f71476d = z10;
    }
}
