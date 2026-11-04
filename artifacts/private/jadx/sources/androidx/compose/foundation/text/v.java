package androidx.compose.foundation.text;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicSecureTextField.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.android.kt\nandroidx/compose/foundation/text/BasicSecureTextField_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,107:1\n75#2:108\n1282#3,6:109\n1282#3,6:115\n1282#3,6:121\n1282#3,6:127\n85#4:133\n117#4,2:134\n66#5,5:136\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.android.kt\nandroidx/compose/foundation/text/BasicSecureTextField_androidKt\n*L\n40#1:108\n42#1:109,6\n45#1:115,6\n47#1:121,6\n54#1:127,6\n45#1:133\n45#1:134,2\n60#1:136,5\n*E\n"})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f21640a = "BasicSecureTextField";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function1<Context, b2> f21641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static Function1<? super Context, ? extends b2> f21642c;

    public static final class a implements b2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ContentResolver f21643a;

        a(ContentResolver contentResolver) {
            this.f21643a = contentResolver;
        }

        @Override // androidx.compose.foundation.text.b2
        public boolean a() {
            try {
                return Settings.System.getInt(this.f21643a, "show_password") > 0;
            } catch (Exception unused) {
                return true;
            }
        }

        @Override // androidx.compose.foundation.text.b2
        public void b(Uri uri, boolean z10, ContentObserver contentObserver) {
            this.f21643a.registerContentObserver(uri, z10, contentObserver);
        }

        @Override // androidx.compose.foundation.text.b2
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f21643a.unregisterContentObserver(contentObserver);
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BasicSecureTextField.android.kt\nandroidx/compose/foundation/text/BasicSecureTextField_androidKt\n*L\n1#1,69:1\n60#2:70\n*E\n"})
    public static final class b implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b2 f21644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f21645b;

        public b(b2 b2Var, c cVar) {
            this.f21644a = b2Var;
            this.f21645b = cVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f21644a.unregisterContentObserver(this.f21645b);
        }
    }

    public static final class c extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b2 f21646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<Boolean> f21647b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b2 b2Var, androidx.compose.runtime.n3<Boolean> n3Var, Handler handler) {
            super(handler);
            this.f21646a = b2Var;
            this.f21647b = n3Var;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            v.i(this.f21647b, this.f21646a.a());
        }
    }

    static {
        Function1<Context, b2> function1 = new Function1() { // from class: androidx.compose.foundation.text.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.c((Context) obj);
            }
        };
        f21641b = function1;
        f21642c = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a c(Context context) {
        return new a(context.getContentResolver());
    }

    @NotNull
    public static final Function1<Context, b2> e() {
        return f21642c;
    }

    @androidx.annotation.l1
    public static /* synthetic */ void f() {
    }

    @androidx.compose.runtime.o
    public static final boolean g(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1015272320, i10, -1, "androidx.compose.foundation.text.platformAllowsRevealLastTyped (BasicSecureTextField.android.kt:38)");
        }
        Object obj = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        Object obj2 = f21642c;
        boolean zD = c0Var.D(obj2) | c0Var.D(obj);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = (b2) f21642c.invoke(obj);
            c0Var.Y(objI0);
        }
        final b2 b2Var = (b2) objI0;
        boolean zD2 = c0Var.D(b2Var);
        Object objI1 = c0Var.i0();
        if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = androidx.compose.runtime.d7.g(Boolean.valueOf(b2Var.a()), null, 2, null);
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI1;
        boolean zD3 = c0Var.D(b2Var);
        Object objI2 = c0Var.i0();
        if (zD3 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
            objI2 = new c(b2Var, n3Var, androidx.core.os.k.a(Looper.getMainLooper()));
            c0Var.Y(objI2);
        }
        final c cVar = (c) objI2;
        boolean zK0 = c0Var.k0(b2Var) | c0Var.k0(cVar);
        Object objI3 = c0Var.i0();
        if (zK0 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
            objI3 = new Function1() { // from class: androidx.compose.foundation.text.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return v.j(b2Var, cVar, (androidx.compose.runtime.v1) obj3);
                }
            };
            c0Var.Y(objI3);
        }
        androidx.compose.runtime.b2.c(b2Var, cVar, (Function1) objI3, c0Var, 0);
        boolean zH = h(n3Var);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return zH;
    }

    private static final boolean h(androidx.compose.runtime.n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(androidx.compose.runtime.n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 j(b2 b2Var, c cVar, androidx.compose.runtime.v1 v1Var) {
        b2Var.b(Settings.System.getUriFor("show_password"), false, cVar);
        return new b(b2Var, cVar);
    }

    @androidx.annotation.l1
    public static final void k() {
        f21642c = f21641b;
    }

    public static final void l(@NotNull Function1<? super Context, ? extends b2> function1) {
        f21642c = function1;
    }
}
