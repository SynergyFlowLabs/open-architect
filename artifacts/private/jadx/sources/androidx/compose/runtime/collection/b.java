package androidx.compose.runtime.collection;

import androidx.collection.g2;
import androidx.collection.s2;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n36#1:80\n37#1:87\n287#2,4:73\n292#2:79\n287#2,6:81\n287#2,4:88\n292#2:94\n287#2,6:95\n287#2,4:101\n292#2:107\n919#3,2:77\n919#3,2:92\n919#3,2:105\n1#4:108\n1010#5,2:109\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n*L\n29#1:80\n29#1:87\n24#1:73,4\n24#1:79\n29#1:81,6\n31#1:88,4\n31#1:94\n36#1:95,6\n42#1:101,4\n42#1:107\n24#1:77,2\n31#1:92,2\n42#1:105,2\n64#1:109,2\n*E\n"})
public final class b {

    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f35549a;

        public a(Function1 function1) {
            this.f35549a = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Function1 function1 = this.f35549a;
            return kotlin.comparisons.a.l((Comparable) function1.invoke(t10), (Comparable) function1.invoke(t11));
        }
    }

    public static final <T> boolean a(@NotNull s2<T> s2Var, @NotNull Function1<? super T, Boolean> function1) {
        Object[] objArr = s2Var.f12449a;
        int i10 = s2Var.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!function1.invoke(objArr[i11]).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <T> s2<T> b(@NotNull s2<T> s2Var, @NotNull Function1<? super T, Boolean> function1) {
        Object[] objArr = s2Var.f12449a;
        int i10 = s2Var.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!function1.invoke(objArr[i11]).booleanValue()) {
                g2 g2Var = new g2(0, 1, null);
                Object[] objArr2 = s2Var.f12449a;
                int i12 = s2Var.f12450b;
                for (int i13 = 0; i13 < i12; i13++) {
                    Object obj = objArr2[i13];
                    if (function1.invoke(obj).booleanValue()) {
                        g2Var.a0(obj);
                    }
                }
                return g2Var;
            }
        }
        return s2Var;
    }

    @NotNull
    public static final <T, R> s2<R> c(@NotNull s2<T> s2Var, @NotNull Function1<? super T, ? extends R> function1) {
        g2 g2Var = new g2(s2Var.C());
        Object[] objArr = s2Var.f12449a;
        int i10 = s2Var.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            g2Var.a0(function1.invoke(objArr[i11]));
        }
        return g2Var;
    }

    public static final <T, K extends Comparable<? super K>> boolean d(@NotNull s2<T> s2Var, @NotNull Function1<? super T, ? extends K> function1) {
        if (s2Var.C() <= 1) {
            return true;
        }
        K kInvoke = function1.invoke(s2Var.y(0));
        if (kInvoke == null) {
            return false;
        }
        int iC = s2Var.C();
        int i10 = 1;
        while (i10 < iC) {
            K kInvoke2 = function1.invoke(s2Var.y(i10));
            if (kInvoke2 == null || kInvoke.compareTo(kInvoke2) > 0) {
                return false;
            }
            i10++;
            kInvoke = kInvoke2;
        }
        return true;
    }

    public static final <T> T e(@NotNull g2<T> g2Var) {
        if (g2Var.H()) {
            throw new NoSuchElementException("List is empty.");
        }
        int iC = g2Var.C() - 1;
        T tY = g2Var.y(iC);
        g2Var.J0(iC);
        return tY;
    }

    public static final <T, K extends Comparable<? super K>> void f(@NotNull g2<T> g2Var, @NotNull Function1<? super T, ? extends K> function1) {
        List<T> listK0 = g2Var.k0();
        if (listK0.size() > 1) {
            CollectionsKt.sortWith(listK0, new a(function1));
        }
    }

    @NotNull
    public static final <T, K extends Comparable<? super K>> s2<T> g(@NotNull s2<T> s2Var, @NotNull Function1<? super T, ? extends K> function1) {
        if (d(s2Var, function1)) {
            return s2Var;
        }
        g2 g2VarH = h(s2Var);
        f(g2VarH, function1);
        return g2VarH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> g2<T> h(@NotNull s2<T> s2Var) {
        g2<T> g2Var = (g2<T>) new g2(s2Var.C());
        Object[] objArr = s2Var.f12449a;
        int i10 = s2Var.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            g2Var.a0(objArr[i11]);
        }
        return g2Var;
    }
}
