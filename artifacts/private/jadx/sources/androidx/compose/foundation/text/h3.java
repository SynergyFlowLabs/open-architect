package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class h3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f19328b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Integer f19329a;

    @Nullable
    public final Integer a(@NotNull KeyEvent keyEvent) {
        int iC = androidx.compose.ui.input.key.e.c(keyEvent);
        if ((Integer.MIN_VALUE & iC) != 0) {
            this.f19329a = Integer.valueOf(iC & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.f19329a;
        if (num == null) {
            return Integer.valueOf(iC);
        }
        this.f19329a = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iC));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        if (num2 != null) {
            iC = num2.intValue();
        }
        return Integer.valueOf(iC);
    }
}
