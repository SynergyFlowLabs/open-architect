package androidx.core.content;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {
    @e.a({"ApplySharedPref"})
    public static final void a(@NotNull SharedPreferences sharedPreferences, boolean z10, @NotNull Function1<? super SharedPreferences.Editor, Unit> function1) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        function1.invoke(editorEdit);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void b(SharedPreferences sharedPreferences, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        function1.invoke(editorEdit);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
