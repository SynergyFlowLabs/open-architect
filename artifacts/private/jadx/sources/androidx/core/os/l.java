package androidx.core.os;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f48046a;

        public a(Function0<Unit> function0) {
            this.f48046a = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f48046a.invoke();
        }
    }

    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f48047a;

        public b(Function0<Unit> function0) {
            this.f48047a = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f48047a.invoke();
        }
    }

    @NotNull
    public static final Runnable a(@NotNull Handler handler, long j10, @Nullable Object obj, @NotNull Function0<Unit> function0) {
        a aVar = new a(function0);
        handler.postAtTime(aVar, obj, j10);
        return aVar;
    }

    public static /* synthetic */ Runnable b(Handler handler, long j10, Object obj, Function0 function0, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
            int i11 = 6 | 0;
        }
        a aVar = new a(function0);
        handler.postAtTime(aVar, obj, j10);
        return aVar;
    }

    @NotNull
    public static final Runnable c(@NotNull Handler handler, long j10, @Nullable Object obj, @NotNull Function0<Unit> function0) {
        b bVar = new b(function0);
        if (obj == null) {
            handler.postDelayed(bVar, j10);
            return bVar;
        }
        k.d(handler, bVar, obj, j10);
        return bVar;
    }

    public static /* synthetic */ Runnable d(Handler handler, long j10, Object obj, Function0 function0, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        b bVar = new b(function0);
        if (obj == null) {
            handler.postDelayed(bVar, j10);
            return bVar;
        }
        k.d(handler, bVar, obj, j10);
        return bVar;
    }
}
