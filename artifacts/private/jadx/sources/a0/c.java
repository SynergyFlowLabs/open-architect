package a0;

import android.view.textclassifier.TextClassification;
import androidx.annotation.v;
import b0.d;
import b0.g;
import b0.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final void a(@NotNull a aVar, @NotNull Object obj, @NotNull String str, @v int i10, @NotNull Function1<? super g, Unit> function1) {
        aVar.a(new d(obj, str, i10, function1));
    }

    public static /* synthetic */ void b(a aVar, Object obj, String str, int i10, Function1 function1, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        a(aVar, obj, str, i10, function1);
    }

    public static final void c(@NotNull a aVar, @NotNull Object obj, @NotNull TextClassification textClassification, int i10) {
        aVar.a(new h(obj, textClassification, i10));
    }
}
