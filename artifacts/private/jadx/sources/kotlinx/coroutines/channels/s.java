package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class s {
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ p a(int i10) {
        return d(i10, null, null, 6, null);
    }

    @NotNull
    public static final <E> p<E> b(int i10, @NotNull j jVar, @Nullable Function1<? super E, Unit> function1) {
        if (i10 == -2) {
            return jVar == j.SUSPEND ? new n(p.N2.a(), function1) : new f0(1, jVar, function1);
        }
        if (i10 == -1) {
            if (jVar == j.SUSPEND) {
                return new f0(1, j.DROP_OLDEST, function1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == 0) {
            return jVar == j.SUSPEND ? new n(0, function1) : new f0(1, jVar, function1);
        }
        if (i10 != Integer.MAX_VALUE) {
            return jVar == j.SUSPEND ? new n(i10, function1) : new f0(i10, jVar, function1);
        }
        return new n(Integer.MAX_VALUE, function1);
    }

    public static /* synthetic */ p c(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return a(i10);
    }

    public static /* synthetic */ p d(int i10, j jVar, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            jVar = j.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return b(i10, jVar, function1);
    }

    public static final <T> T e(@NotNull Object obj, @NotNull Function1<? super Throwable, ? extends T> function1) {
        if (obj instanceof t.c) {
            obj = function1.invoke(t.f(obj));
        }
        return (T) obj;
    }

    @NotNull
    public static final <T> Object f(@NotNull Object obj, @NotNull Function1<? super Throwable, Unit> function1) {
        if (obj instanceof t.a) {
            function1.invoke(t.f(obj));
        }
        return obj;
    }

    @NotNull
    public static final <T> Object g(@NotNull Object obj, @NotNull Function1<? super Throwable, Unit> function1) {
        if (obj instanceof t.c) {
            function1.invoke(t.f(obj));
        }
        return obj;
    }

    @NotNull
    public static final <T> Object h(@NotNull Object obj, @NotNull Function1<? super T, Unit> function1) {
        if (!(obj instanceof t.c)) {
            function1.invoke(obj);
        }
        return obj;
    }
}
