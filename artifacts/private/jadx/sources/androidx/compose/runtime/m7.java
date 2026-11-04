package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class m7<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<T> f36258a;

    private /* synthetic */ m7(ArrayList arrayList) {
        this.f36258a = arrayList;
    }

    public static final /* synthetic */ m7 a(ArrayList arrayList) {
        return new m7(arrayList);
    }

    public static final void b(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    @NotNull
    public static <T> ArrayList<T> c(@NotNull ArrayList<T> arrayList) {
        return arrayList;
    }

    public static /* synthetic */ ArrayList d(ArrayList arrayList, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return c(arrayList);
    }

    public static boolean e(ArrayList<T> arrayList, Object obj) {
        return (obj instanceof m7) && Intrinsics.areEqual(arrayList, ((m7) obj).q());
    }

    public static final boolean f(ArrayList<T> arrayList, ArrayList<T> arrayList2) {
        return Intrinsics.areEqual(arrayList, arrayList2);
    }

    public static final int g(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    public static int h(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    public static final boolean i(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    public static final boolean j(ArrayList<T> arrayList) {
        return !i(arrayList);
    }

    public static final T k(ArrayList<T> arrayList) {
        return arrayList.get(g(arrayList) - 1);
    }

    public static final T l(ArrayList<T> arrayList, int i10) {
        return arrayList.get(i10);
    }

    public static final T m(ArrayList<T> arrayList) {
        return arrayList.remove(g(arrayList) - 1);
    }

    public static final boolean n(ArrayList<T> arrayList, T t10) {
        return arrayList.add(t10);
    }

    @NotNull
    public static final T[] o(ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = arrayList.get(i10);
        }
        return tArr;
    }

    public static String p(ArrayList<T> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f36258a, obj);
    }

    public int hashCode() {
        return h(this.f36258a);
    }

    public final /* synthetic */ ArrayList q() {
        return this.f36258a;
    }

    public String toString() {
        return p(this.f36258a);
    }
}
