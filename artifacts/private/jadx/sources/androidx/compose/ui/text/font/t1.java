package androidx.compose.ui.text.font;

import androidx.compose.runtime.n7;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,259:1\n27#2,2:260\n35#2:262\n35#2:263\n35#2:264\n35#2:265\n35#2:266\n35#2:267\n35#2:268\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n168#1:260,2\n176#1:262\n216#1:263\n233#1:264\n247#1:265\n253#1:266\n257#1:267\n205#1:268\n*E\n"})
public final class t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41717c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.platform.c0 f41718a = new androidx.compose.ui.text.platform.c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.d1<r1, u1> f41719b = new androidx.collection.d1<>(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(t1 t1Var, r1 r1Var, u1 u1Var) {
        Unit unit;
        synchronized (t1Var.f41718a) {
            try {
                if (u1Var.i()) {
                    t1Var.f41719b.j(r1Var, u1Var);
                } else {
                    t1Var.f41719b.l(r1Var);
                }
                unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unit;
    }

    @Nullable
    public final u1 b(@NotNull r1 r1Var) {
        u1 u1VarF;
        synchronized (this.f41718a) {
            try {
                u1VarF = this.f41719b.f(r1Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u1VarF;
    }

    @NotNull
    public final androidx.compose.ui.text.platform.c0 c() {
        return this.f41718a;
    }

    public final int d() {
        int iO;
        synchronized (this.f41718a) {
            try {
                iO = this.f41719b.o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iO;
    }

    public final void e(@NotNull List<r1> list, @NotNull Function1<? super r1, ? extends u1> function1) {
        u1 u1VarF;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r1 r1Var = list.get(i10);
            synchronized (this.f41718a) {
                try {
                    u1VarF = this.f41719b.f(r1Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (u1VarF == null) {
                try {
                    u1 u1VarInvoke = function1.invoke(r1Var);
                    if (u1VarInvoke instanceof u1.a) {
                        continue;
                    } else {
                        synchronized (this.f41718a) {
                            try {
                                this.f41719b.j(r1Var, u1VarInvoke);
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Exception e10) {
                    throw new IllegalStateException("Could not load font", e10);
                }
            }
        }
    }

    @NotNull
    public final n7<Object> f(@NotNull final r1 r1Var, @NotNull Function1<? super Function1<? super u1, Unit>, ? extends u1> function1) {
        synchronized (this.f41718a) {
            u1 u1VarF = this.f41719b.f(r1Var);
            if (u1VarF != null) {
                if (u1VarF.i()) {
                    return u1VarF;
                }
                this.f41719b.l(r1Var);
            }
            try {
                u1 u1VarInvoke = function1.invoke(new Function1() { // from class: androidx.compose.ui.text.font.s1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t1.g(this.f41714a, r1Var, (u1) obj);
                    }
                });
                synchronized (this.f41718a) {
                    try {
                        if (this.f41719b.f(r1Var) == null && u1VarInvoke.i()) {
                            this.f41719b.j(r1Var, u1VarInvoke);
                        }
                        Unit unit = Unit.f312394a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return u1VarInvoke;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
