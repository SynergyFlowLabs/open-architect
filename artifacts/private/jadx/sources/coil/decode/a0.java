package coil.decode;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.functions.Function0;
import okio.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@oj.i(name = "ImageSources")
public final class a0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final File e(Context context) {
        return coil.util.l.u(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File f(Context context) {
        return coil.util.l.u(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File g(File file) {
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File h(File file) {
        return file;
    }

    @oj.i(name = "create")
    @NotNull
    public static final v i(@NotNull okio.n nVar, @NotNull final Context context) {
        int i10 = 2 & 0;
        return new c0(nVar, new Function0() { // from class: coil.decode.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a0.e(context);
            }
        }, null);
    }

    @i4.a
    @oj.i(name = "create")
    @NotNull
    public static final v j(@NotNull okio.n nVar, @NotNull final Context context, @Nullable v.a aVar) {
        return new c0(nVar, new Function0() { // from class: coil.decode.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a0.f(context);
            }
        }, aVar);
    }

    @oj.i(name = "create")
    @NotNull
    public static final v k(@NotNull okio.n nVar, @NotNull final File file) {
        return new c0(nVar, new Function0() { // from class: coil.decode.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a0.g(file);
            }
        }, null);
    }

    @i4.a
    @oj.i(name = "create")
    @NotNull
    public static final v l(@NotNull okio.n nVar, @NotNull final File file, @Nullable v.a aVar) {
        return new c0(nVar, new Function0() { // from class: coil.decode.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a0.h(file);
            }
        }, aVar);
    }

    @oj.i(name = "create")
    @NotNull
    public static final v m(@NotNull r0 r0Var, @NotNull okio.v vVar, @Nullable String str, @Nullable Closeable closeable) {
        return new n(r0Var, vVar, str, closeable, null);
    }

    @i4.a
    @oj.i(name = "create")
    @NotNull
    public static final v n(@NotNull r0 r0Var, @NotNull okio.v vVar, @Nullable String str, @Nullable Closeable closeable, @Nullable v.a aVar) {
        return new n(r0Var, vVar, str, closeable, aVar);
    }

    public static /* synthetic */ v o(okio.n nVar, Context context, v.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return j(nVar, context, aVar);
    }

    public static /* synthetic */ v p(okio.n nVar, File file, v.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return l(nVar, file, aVar);
    }

    public static /* synthetic */ v q(r0 r0Var, okio.v vVar, String str, Closeable closeable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            vVar = okio.v.f335116b;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        return m(r0Var, vVar, str, closeable);
    }

    public static /* synthetic */ v r(r0 r0Var, okio.v vVar, String str, Closeable closeable, v.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            vVar = okio.v.f335116b;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        return n(r0Var, vVar, str, closeable, aVar);
    }
}
