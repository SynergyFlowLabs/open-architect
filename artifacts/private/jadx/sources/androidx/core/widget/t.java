package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.core.view.c1;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public final class t implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f49163a = "ReceiveContent";

    private static CharSequence b(@NonNull Context context, @NonNull ClipData.Item item, int i10) {
        if ((i10 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        if (charSequenceCoerceToText instanceof Spanned) {
            charSequenceCoerceToText = charSequenceCoerceToText.toString();
        }
        return charSequenceCoerceToText;
    }

    private static void c(@NonNull Editable editable, @NonNull CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // androidx.core.view.c1
    @p0
    public androidx.core.view.e a(@NonNull View view, @NonNull androidx.core.view.e eVar) {
        if (Log.isLoggable(f49163a, 3)) {
            Objects.toString(eVar);
        }
        if (eVar.g() == 2) {
            return eVar;
        }
        ClipData clipDataC = eVar.c();
        int iE = eVar.e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z10 = false;
        for (int i10 = 0; i10 < clipDataC.getItemCount(); i10++) {
            CharSequence charSequenceB = b(context, clipDataC.getItemAt(i10), iE);
            if (charSequenceB != null) {
                if (z10) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceB);
                } else {
                    c(editable, charSequenceB);
                    z10 = true;
                }
            }
        }
        return null;
    }
}
