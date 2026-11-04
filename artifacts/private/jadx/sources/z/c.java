package z;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.w3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import pj.p;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@androidx.annotation.w0(23)
@SourceDebugExtension({"SMAP\nProcessText.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessText.android.kt\nandroidx/compose/foundation/text/contextmenu/ProcessTextApi23Impl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,128:1\n231#2,2:129\n35#2,5:131\n233#2:136\n*S KotlinDebug\n*F\n+ 1 ProcessText.android.kt\nandroidx/compose/foundation/text/contextmenu/ProcessTextApi23Impl\n*L\n81#1:129,2\n81#1:131,5\n81#1:136\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f399837a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static Function1<? super Context, ? extends List<? extends ResolveInfo>> f399838b = new Function1() { // from class: z.a
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return c.l((Context) obj);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static p<? super Context, ? super ResolveInfo, ? super Boolean, ? super CharSequence, ? super w3, Unit> f399839c = new p() { // from class: z.b
        @Override // pj.p
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return c.k((Context) obj, (ResolveInfo) obj2, ((Boolean) obj3).booleanValue(), (CharSequence) obj4, (w3) obj5);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f399840d = 8;

    private c() {
    }

    private final Intent c() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    @l1
    public static /* synthetic */ void f() {
    }

    @l1
    public static /* synthetic */ void h() {
    }

    private final boolean i(ActivityInfo activityInfo, Context context) {
        if (!activityInfo.exported) {
            return false;
        }
        String str = activityInfo.permission;
        return str == null || context.checkSelfPermission(str) == 0;
    }

    private final boolean j(ResolveInfo resolveInfo, Context context) {
        return context.getPackageName().equals(resolveInfo.activityInfo.packageName) || i(resolveInfo.activityInfo, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Context context, ResolveInfo resolveInfo, boolean z10, CharSequence charSequence, w3 w3Var) {
        String string = charSequence.subSequence(w3.l(w3Var.r()), w3.k(w3Var.r())).toString();
        Intent intentD = f399837a.d(resolveInfo, z10);
        intentD.putExtra("android.intent.extra.PROCESS_TEXT", string);
        context.startActivity(intentD);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List l(Context context) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(f399837a.c(), 0);
        ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
        int size = listQueryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i10);
            if (f399837a.j(resolveInfo, context)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    @NotNull
    public final Intent d(@NotNull ResolveInfo resolveInfo, boolean z10) {
        Intent intentPutExtra = c().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z10);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
    }

    @NotNull
    public final p<Context, ResolveInfo, Boolean, CharSequence, w3, Unit> e() {
        return f399839c;
    }

    @NotNull
    public final Function1<Context, List<ResolveInfo>> g() {
        return f399838b;
    }

    @NotNull
    public final List<ResolveInfo> m(@NotNull Context context) {
        return (List) f399838b.invoke(context);
    }

    public final void n(@NotNull p<? super Context, ? super ResolveInfo, ? super Boolean, ? super CharSequence, ? super w3, Unit> pVar) {
        f399839c = pVar;
    }

    public final void o(@NotNull Function1<? super Context, ? extends List<? extends ResolveInfo>> function1) {
        f399838b = function1;
    }
}
