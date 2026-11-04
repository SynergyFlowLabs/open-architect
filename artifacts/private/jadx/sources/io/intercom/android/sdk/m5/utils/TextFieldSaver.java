package io.intercom.android.sdk.m5.utils;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.saveable.c0;
import androidx.compose.runtime.saveable.g0;
import androidx.compose.ui.text.input.y0;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class TextFieldSaver {

    @NotNull
    public static final TextFieldSaver INSTANCE = new TextFieldSaver();

    @NotNull
    private static final c0<y0, ?> textFieldValueSaver = androidx.compose.runtime.saveable.b.b(new Function2() { // from class: io.intercom.android.sdk.m5.utils.a
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return TextFieldSaver.textFieldValueSaver$lambda$0((g0) obj, (y0) obj2);
        }
    }, new Function1() { // from class: io.intercom.android.sdk.m5.utils.b
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return TextFieldSaver.textFieldValueSaver$lambda$1((List) obj);
        }
    });
    public static final int $stable = 8;

    private TextFieldSaver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List textFieldValueSaver$lambda$0(g0 listSaver, y0 it) {
        Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
        Intrinsics.checkNotNullParameter(it, "it");
        String strM = it.m();
        Integer numValueOf = Integer.valueOf(w3.n(it.l()));
        Integer numValueOf2 = Integer.valueOf(w3.i(it.l()));
        w3 w3VarK = it.k();
        Integer numValueOf3 = Integer.valueOf(w3VarK != null ? w3.n(w3VarK.r()) : -1);
        w3 w3VarK2 = it.k();
        return CollectionsKt.listOf(strM, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(w3VarK2 != null ? w3.i(w3VarK2.r()) : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 textFieldValueSaver$lambda$1(List it) {
        w3 w3VarB;
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = it.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = it.get(2);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
        long jB = x3.b(iIntValue, ((Integer) obj3).intValue());
        Object obj4 = it.get(3);
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) obj4).intValue() >= 0) {
            Object obj5 = it.get(3);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj5).intValue();
            Object obj6 = it.get(4);
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
            w3VarB = w3.b(x3.b(iIntValue2, ((Integer) obj6).intValue()));
        } else {
            w3VarB = null;
        }
        return new y0(str, jB, w3VarB, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final c0<y0, ?> getTextFieldValueSaver() {
        return textFieldValueSaver;
    }
}
