package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.m4;
import androidx.compose.runtime.n4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,157:1\n77#2:158\n23#3,8:159\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n*L\n49#1:158\n49#1:159,8\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f9818a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final m4<androidx.activity.result.l> f9819b = a1.k(null, a.f9821a, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9820c = 0;

    static final class a extends l0 implements Function0<androidx.activity.result.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9821a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.activity.result.l invoke() {
            return null;
        }
    }

    private h() {
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getCurrent")
    @Nullable
    public final androidx.activity.result.l a(@Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(1418020823, i10, -1, "androidx.activity.compose.LocalActivityResultRegistryOwner.<get-current> (ActivityResultRegistry.kt:48)");
        }
        androidx.activity.result.l lVar = (androidx.activity.result.l) c0Var.W(f9819b);
        if (lVar == null) {
            c0Var.E(1006590171);
            Object baseContext = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof androidx.activity.result.l) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            lVar = (androidx.activity.result.l) baseContext;
        } else {
            c0Var.E(1006589303);
        }
        c0Var.A();
        if (m0.l0()) {
            m0.z0();
        }
        return lVar;
    }

    @NotNull
    public final n4<androidx.activity.result.l> b(@NotNull androidx.activity.result.l lVar) {
        return f9819b.f(lVar);
    }
}
