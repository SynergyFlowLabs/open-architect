package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavigatorState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n+ 2 SynchronizedObject.kt\nandroidx/navigation/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvmCommon.kt\nandroidx/navigation/internal/SynchronizedObject_jvmCommonKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n38#2:220\n38#2:228\n38#2:249\n24#3:221\n24#3:229\n24#3:250\n1755#4,3:222\n1755#4,3:225\n967#4,7:230\n1755#4,3:237\n2632#4,3:240\n543#4,6:243\n388#4,7:251\n461#4,6:259\n1#5:258\n*S KotlinDebug\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n*L\n59#1:220\n102#1:228\n157#1:249\n59#1:221\n102#1:229\n157#1:250\n76#1:222,3\n77#1:225,3\n103#1:230,7\n125#1:237,3\n126#1:240,3\n132#1:243,6\n160#1:251,7\n183#1:259,6\n*E\n"})
public abstract class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.navigation.internal.g0 f71379a = new androidx.navigation.internal.g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.k0<List<n0>> f71380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.k0<Set<n0>> f71381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f71382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.z0<List<n0>> f71383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.z0<Set<n0>> f71384f;

    public v3() {
        kotlinx.coroutines.flow.k0<List<n0>> k0VarA = kotlinx.coroutines.flow.b1.a(CollectionsKt.emptyList());
        this.f71380b = k0VarA;
        kotlinx.coroutines.flow.k0<Set<n0>> k0VarA2 = kotlinx.coroutines.flow.b1.a(SetsKt.emptySet());
        this.f71381c = k0VarA2;
        this.f71383e = kotlinx.coroutines.flow.k.n(k0VarA);
        this.f71384f = kotlinx.coroutines.flow.k.n(k0VarA2);
    }

    @NotNull
    public abstract n0 b(@NotNull y1 y1Var, @Nullable Bundle bundle);

    @NotNull
    public final kotlinx.coroutines.flow.z0<List<n0>> c() {
        return this.f71383e;
    }

    @NotNull
    public final kotlinx.coroutines.flow.z0<Set<n0>> d() {
        return this.f71384f;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final boolean e() {
        return this.f71382d;
    }

    public void f(@NotNull n0 entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        kotlinx.coroutines.flow.k0<Set<n0>> k0Var = this.f71381c;
        k0Var.setValue(SetsKt.minus(k0Var.getValue(), entry));
    }

    @androidx.annotation.i
    public void g(@NotNull n0 backStackEntry) {
        int iNextIndex;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        synchronized (this.f71379a) {
            try {
                List mutableList = CollectionsKt.toMutableList((Collection) c().getValue());
                ListIterator listIterator = mutableList.listIterator(mutableList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (Intrinsics.areEqual(((n0) listIterator.previous()).h(), backStackEntry.h())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                mutableList.set(iNextIndex, backStackEntry);
                this.f71380b.setValue(mutableList);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.i
    public void h(@NotNull n0 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        List<n0> value = this.f71383e.getValue();
        ListIterator<n0> listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            n0 n0VarPrevious = listIterator.previous();
            if (Intrinsics.areEqual(n0VarPrevious.h(), backStackEntry.h())) {
                kotlinx.coroutines.flow.k0<Set<n0>> k0Var = this.f71381c;
                k0Var.setValue(SetsKt.plus((Set<? extends n0>) SetsKt.plus(k0Var.getValue(), n0VarPrevious), backStackEntry));
                g(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void i(@NotNull n0 popUpTo, boolean z10) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        synchronized (this.f71379a) {
            try {
                kotlinx.coroutines.flow.k0 k0Var = this.f71380b;
                Iterable iterable = (Iterable) this.f71380b.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (Intrinsics.areEqual((n0) obj, popUpTo)) {
                        break;
                    } else {
                        arrayList.add(obj);
                    }
                }
                k0Var.setValue(arrayList);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(@NotNull n0 popUpTo, boolean z10) {
        n0 n0VarPrevious;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Set<n0> value = this.f71381c.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((n0) it.next()) == popUpTo) {
                    List<n0> value2 = this.f71383e.getValue();
                    if ((value2 instanceof Collection) && value2.isEmpty()) {
                        return;
                    }
                    Iterator<T> it2 = value2.iterator();
                    while (it2.hasNext()) {
                        if (((n0) it2.next()) == popUpTo) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        kotlinx.coroutines.flow.k0<Set<n0>> k0Var = this.f71381c;
        k0Var.setValue(SetsKt.plus(k0Var.getValue(), popUpTo));
        List<n0> value3 = this.f71383e.getValue();
        ListIterator<n0> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                n0VarPrevious = null;
                break;
            }
            n0VarPrevious = listIterator.previous();
            n0 n0Var = n0VarPrevious;
            if (!Intrinsics.areEqual(n0Var, popUpTo) && this.f71383e.getValue().lastIndexOf(n0Var) < this.f71383e.getValue().lastIndexOf(popUpTo)) {
                break;
            }
        }
        n0 n0Var2 = n0VarPrevious;
        if (n0Var2 != null) {
            kotlinx.coroutines.flow.k0<Set<n0>> k0Var2 = this.f71381c;
            k0Var2.setValue(SetsKt.plus(k0Var2.getValue(), n0Var2));
        }
        i(popUpTo, z10);
    }

    @androidx.annotation.i
    public void k(@NotNull n0 entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        kotlinx.coroutines.flow.k0<Set<n0>> k0Var = this.f71381c;
        k0Var.setValue(SetsKt.plus(k0Var.getValue(), entry));
    }

    public void l(@NotNull n0 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        synchronized (this.f71379a) {
            try {
                this.f71380b.setValue(CollectionsKt.plus((Collection<? extends n0>) this.f71380b.getValue(), backStackEntry));
                Unit unit = Unit.f312394a;
            } finally {
            }
        }
    }

    public void m(@NotNull n0 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Set<n0> value = this.f71381c.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((n0) it.next()) == backStackEntry) {
                    List<n0> value2 = this.f71383e.getValue();
                    if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                        Iterator<T> it2 = value2.iterator();
                        while (it2.hasNext()) {
                            if (((n0) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        n0 n0Var = (n0) CollectionsKt.lastOrNull((List) this.f71383e.getValue());
        if (n0Var != null) {
            kotlinx.coroutines.flow.k0<Set<n0>> k0Var = this.f71381c;
            k0Var.setValue(SetsKt.plus(k0Var.getValue(), n0Var));
        }
        kotlinx.coroutines.flow.k0<Set<n0>> k0Var2 = this.f71381c;
        k0Var2.setValue(SetsKt.plus(k0Var2.getValue(), backStackEntry));
        l(backStackEntry);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void n(boolean z10) {
        this.f71382d = z10;
    }
}
