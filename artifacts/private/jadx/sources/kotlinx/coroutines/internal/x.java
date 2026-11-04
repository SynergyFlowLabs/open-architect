package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@oj.g
@SourceDebugExtension({"SMAP\nInlineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class x<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f315134a;

    private /* synthetic */ x(Object obj) {
        this.f315134a = obj;
    }

    public static final /* synthetic */ x a(Object obj) {
        return new x(obj);
    }

    @NotNull
    public static <E> Object b(@Nullable Object obj) {
        return obj;
    }

    public static /* synthetic */ Object c(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return b(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof x) && Intrinsics.areEqual(obj, ((x) obj2).j());
    }

    public static final boolean e(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static final void f(Object obj, @NotNull Function1<? super E, Unit> function1) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                function1.invoke(obj);
                return;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    break;
                } else {
                    function1.invoke((Object) arrayList.get(size));
                }
            }
        }
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public static final Object h(Object obj, E e10) {
        if (obj == null) {
            return b(e10);
        }
        if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(e10);
            return b(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e10);
        return b(arrayList);
    }

    public static String i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f315134a, obj);
    }

    public int hashCode() {
        return g(this.f315134a);
    }

    public final /* synthetic */ Object j() {
        return this.f315134a;
    }

    public String toString() {
        return i(this.f315134a);
    }
}
