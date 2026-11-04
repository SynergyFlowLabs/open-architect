package androidx.activity.compose;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.m4;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m4<Activity> f9816a = a1.l(a.f9817a);

    @SourceDebugExtension({"SMAP\nLocalActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalActivity.kt\nandroidx/activity/compose/LocalActivityKt$LocalActivity$1\n+ 2 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,35:1\n23#2,8:36\n*S KotlinDebug\n*F\n+ 1 LocalActivity.kt\nandroidx/activity/compose/LocalActivityKt$LocalActivity$1\n*L\n34#1:36,8\n*E\n"})
    static final class a extends l0 implements Function1<v0, Activity> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9817a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Activity invoke(v0 v0Var) {
            Context baseContext = (Context) v0Var.H0(AndroidCompositionLocals_androidKt.g());
            while (baseContext instanceof ContextWrapper) {
                if (baseContext instanceof Activity) {
                    return (Activity) baseContext;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            baseContext = null;
            return (Activity) baseContext;
        }
    }

    @NotNull
    public static final m4<Activity> a() {
        return f9816a;
    }
}
