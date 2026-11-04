package z;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.s1;
import androidx.compose.ui.text.w3;
import b0.g;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nProcessText.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessText.android.kt\nandroidx/compose/foundation/text/contextmenu/ProcessText_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,128:1\n71#2,5:129\n*S KotlinDebug\n*F\n+ 1 ProcessText.android.kt\nandroidx/compose/foundation/text/contextmenu/ProcessText_androidKt\n*L\n58#1:129,5\n*E\n"})
public final class e {
    public static final void b(@NotNull a0.a aVar, @NotNull Context context, final boolean z10, @NotNull final CharSequence charSequence, final long j10) {
        if (!s1.f18600e || w3.h(j10) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List<ResolveInfo> listM = c.f399837a.m(context2);
        if (listM.isEmpty()) {
            return;
        }
        aVar.d();
        int size = listM.size();
        int i10 = 0;
        while (i10 < size) {
            final ResolveInfo resolveInfo = listM.get(i10);
            a0.c.b(aVar, new b0.a(i10), resolveInfo.loadLabel(packageManager).toString(), 0, new Function1() { // from class: z.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e.c(context2, resolveInfo, z10, charSequence, j10, (g) obj);
                }
            }, 4, null);
            i10++;
            context2 = context;
        }
        aVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Context context, ResolveInfo resolveInfo, boolean z10, CharSequence charSequence, long j10, g gVar) {
        c.f399837a.e().invoke(context, resolveInfo, Boolean.valueOf(z10), charSequence, w3.b(j10));
        gVar.close();
        return Unit.f312394a;
    }
}
