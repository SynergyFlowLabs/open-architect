package kotlinx.atomicfu;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    @NotNull
    public static final <T> a<T> a(int i10) {
        return new a<>(i10);
    }

    public static final int b(@NotNull f fVar, @NotNull Function1<? super Integer, Integer> function) {
        int i10;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            i10 = fVar.i();
        } while (!fVar.b(i10, function.invoke(Integer.valueOf(i10)).intValue()));
        return i10;
    }

    public static final long c(@NotNull h hVar, @NotNull Function1<? super Long, Long> function) {
        long jI;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            jI = hVar.i();
        } while (!hVar.b(jI, function.invoke(Long.valueOf(jI)).longValue()));
        return jI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T d(@NotNull j<T> jVar, @NotNull Function1<? super T, ? extends T> function) {
        ?? r10;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            r10 = (Object) jVar.d();
        } while (!jVar.a(r10, function.invoke(r10)));
        return r10;
    }

    public static final boolean e(@NotNull b bVar, @NotNull Function1<? super Boolean, Boolean> function) {
        boolean zD;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            zD = bVar.d();
        } while (!bVar.a(zD, function.invoke(Boolean.valueOf(zD)).booleanValue()));
        return zD;
    }

    @NotNull
    public static final Void f(@NotNull b bVar, @NotNull Function1<? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        while (true) {
            action.invoke(Boolean.valueOf(bVar.d()));
        }
    }

    @NotNull
    public static final Void g(@NotNull f fVar, @NotNull Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        while (true) {
            action.invoke(Integer.valueOf(fVar.i()));
        }
    }

    @NotNull
    public static final Void h(@NotNull h hVar, @NotNull Function1<? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        while (true) {
            action.invoke(Long.valueOf(hVar.i()));
        }
    }

    @NotNull
    public static final <T> Void i(@NotNull j<T> jVar, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        while (true) {
            action.invoke(jVar.d());
        }
    }

    public static final void j(@NotNull b bVar, @NotNull Function1<? super Boolean, Boolean> function) {
        boolean zD;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            zD = bVar.d();
        } while (!bVar.a(zD, function.invoke(Boolean.valueOf(zD)).booleanValue()));
    }

    public static final void k(@NotNull f fVar, @NotNull Function1<? super Integer, Integer> function) {
        int i10;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            i10 = fVar.i();
        } while (!fVar.b(i10, function.invoke(Integer.valueOf(i10)).intValue()));
    }

    public static final void l(@NotNull h hVar, @NotNull Function1<? super Long, Long> function) {
        long jI;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            jI = hVar.i();
        } while (!hVar.b(jI, function.invoke(Long.valueOf(jI)).longValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void m(@NotNull j<T> jVar, @NotNull Function1<? super T, ? extends T> function) {
        a0.c cVar;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            cVar = (Object) jVar.d();
        } while (!jVar.a(cVar, function.invoke(cVar)));
    }

    public static final int n(@NotNull f fVar, @NotNull Function1<? super Integer, Integer> function) {
        int i10;
        int iIntValue;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            i10 = fVar.i();
            iIntValue = function.invoke(Integer.valueOf(i10)).intValue();
        } while (!fVar.b(i10, iIntValue));
        return iIntValue;
    }

    public static final long o(@NotNull h hVar, @NotNull Function1<? super Long, Long> function) {
        long jI;
        long jLongValue;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            jI = hVar.i();
            jLongValue = function.invoke(Long.valueOf(jI)).longValue();
        } while (!hVar.b(jI, jLongValue));
        return jLongValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T p(@NotNull j<T> jVar, @NotNull Function1<? super T, ? extends T> function) {
        a0.c cVar;
        T tInvoke;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            cVar = (Object) jVar.d();
            tInvoke = function.invoke(cVar);
        } while (!jVar.a(cVar, tInvoke));
        return tInvoke;
    }

    public static final boolean q(@NotNull b bVar, @NotNull Function1<? super Boolean, Boolean> function) {
        boolean zD;
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            zD = bVar.d();
            zBooleanValue = function.invoke(Boolean.valueOf(zD)).booleanValue();
        } while (!bVar.a(zD, zBooleanValue));
        return zBooleanValue;
    }
}
