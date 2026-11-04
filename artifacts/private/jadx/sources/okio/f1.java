package okio;

import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f1<T> extends AbstractList<T> implements RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f334894c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f334895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<T> f334896b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final <T> f1<T> a(@NotNull Iterable<? extends T> values, @NotNull Function1<? super T, ? extends o> encode) {
            Intrinsics.checkNotNullParameter(values, "values");
            Intrinsics.checkNotNullParameter(encode, "encode");
            List list = CollectionsKt.toList(values);
            p0.a aVar = p0.f335056c;
            int size = list.size();
            o[] oVarArr = new o[size];
            for (int i10 = 0; i10 < size; i10++) {
                oVarArr[i10] = encode.invoke((Object) list.get(i10));
            }
            return new f1<>(list, aVar.d(oVarArr));
        }

        private a() {
        }
    }

    public f1(@NotNull List<? extends T> list, @NotNull p0 options) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f334895a = options;
        List<T> list2 = CollectionsKt.toList(list);
        this.f334896b = list2;
        if (list2.size() != options.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @oj.n
    @NotNull
    public static final <T> f1<T> k(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends o> function1) {
        return f334894c.a(iterable, function1);
    }

    @NotNull
    public final List<T> c() {
        return this.f334896b;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public T get(int i10) {
        return this.f334896b.get(i10);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f334896b.size();
    }

    @NotNull
    public final p0 i() {
        return this.f334895a;
    }
}
